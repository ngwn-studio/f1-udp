package com.ngwn.f1udp.model.session;

import com.ngwn.f1udp.utils.TypeConverter;

import java.nio.ByteBuffer;

public class MarshalZoneModel {

    private float mZoneStart;
    private int mZoneFlag;

    public MarshalZoneModel(ByteBuffer superBuffer) {
        mZoneStart = superBuffer.getFloat();
        mZoneFlag = TypeConverter.convertUint8(superBuffer.get());
    }
}
