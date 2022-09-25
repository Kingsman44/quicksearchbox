package com.android.launcher3.backup;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* compiled from: PG */
public final class BackupProtos$Journal extends C62942bv implements C63001dt {
    public static final BackupProtos$Journal DEFAULT_INSTANCE;
    private static volatile C63010eb PARSER;
    public int appVersion_;
    public int backupVersion_ = 1;
    public int bitField0_;
    public C62971cq key_ = emptyProtobufList();
    private byte memoizedIsInitialized = 2;
    public BackupProtos$DeviceProfieData profile_;

    /* renamed from: t_ */
    public long f16557t_;

    /* compiled from: PG */
    public final class Builder extends C62934bn implements C63001dt {
        public Builder() {
            super(BackupProtos$Journal.DEFAULT_INSTANCE);
        }
    }

    static {
        BackupProtos$Journal backupProtos$Journal = new BackupProtos$Journal();
        DEFAULT_INSTANCE = backupProtos$Journal;
        C62942bv.registerDefaultInstance(BackupProtos$Journal.class, backupProtos$Journal);
    }

    private BackupProtos$Journal() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0004\u0001ᔄ\u0000\u0002ᔂ\u0001\u0005Л\u0006င\u0004\u0007ᐉ\u0005", new Object[]{"bitField0_", "appVersion_", "t_", "key_", BackupProtos$Key.class, "backupVersion_", "profile_"});
            case 3:
                return new BackupProtos$Journal();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C63010eb ebVar = PARSER;
                if (ebVar == null) {
                    synchronized (BackupProtos$Journal.class) {
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
