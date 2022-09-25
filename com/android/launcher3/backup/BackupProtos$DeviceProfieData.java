package com.android.launcher3.backup;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* compiled from: PG */
public final class BackupProtos$DeviceProfieData extends C62942bv implements C63001dt {
    public static final BackupProtos$DeviceProfieData DEFAULT_INSTANCE;
    private static volatile C63010eb PARSER;
    public int allappsRank_;
    public int bitField0_;
    public float desktopCols_;
    public float desktopRows_;
    public float hotseatCount_;
    private byte memoizedIsInitialized = 2;

    /* compiled from: PG */
    public final class Builder extends C62934bn implements C63001dt {
        public Builder() {
            super(BackupProtos$DeviceProfieData.DEFAULT_INSTANCE);
        }
    }

    static {
        BackupProtos$DeviceProfieData backupProtos$DeviceProfieData = new BackupProtos$DeviceProfieData();
        DEFAULT_INSTANCE = backupProtos$DeviceProfieData;
        C62942bv.registerDefaultInstance(BackupProtos$DeviceProfieData.class, backupProtos$DeviceProfieData);
    }

    private BackupProtos$DeviceProfieData() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔄ\u0003", new Object[]{"bitField0_", "desktopRows_", "desktopCols_", "hotseatCount_", "allappsRank_"});
            case 3:
                return new BackupProtos$DeviceProfieData();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C63010eb ebVar = PARSER;
                if (ebVar == null) {
                    synchronized (BackupProtos$DeviceProfieData.class) {
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
