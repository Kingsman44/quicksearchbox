package com.android.launcher3.backup;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* compiled from: PG */
public final class BackupProtos$CheckedMessage extends C62942bv implements C63001dt {
    public static final BackupProtos$CheckedMessage DEFAULT_INSTANCE;
    private static volatile C63010eb PARSER;
    public int bitField0_;
    public long checksum_;
    private byte memoizedIsInitialized = 2;
    public C63088z payload_ = C63088z.f170246b;

    /* compiled from: PG */
    public final class Builder extends C62934bn implements C63001dt {
        public Builder() {
            super(BackupProtos$CheckedMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        BackupProtos$CheckedMessage backupProtos$CheckedMessage = new BackupProtos$CheckedMessage();
        DEFAULT_INSTANCE = backupProtos$CheckedMessage;
        C62942bv.registerDefaultInstance(BackupProtos$CheckedMessage.class, backupProtos$CheckedMessage);
    }

    private BackupProtos$CheckedMessage() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.memoizedIsInitialized = b;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔊ\u0000\u0002ᔂ\u0001", new Object[]{"bitField0_", "payload_", "checksum_"});
            case 3:
                return new BackupProtos$CheckedMessage();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C63010eb ebVar = PARSER;
                if (ebVar == null) {
                    synchronized (BackupProtos$CheckedMessage.class) {
                        ebVar = PARSER;
                        if (ebVar == null) {
                            ebVar = new C62935bo(DEFAULT_INSTANCE);
                            PARSER = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
