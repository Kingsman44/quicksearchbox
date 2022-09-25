package com.android.launcher3.backup;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* compiled from: PG */
public final class BackupProtos$Key extends C62942bv implements C63001dt {
    public static final BackupProtos$Key DEFAULT_INSTANCE;
    private static volatile C63010eb PARSER;
    public int bitField0_;
    public long checksum_;
    public long id_;
    private byte memoizedIsInitialized = 2;
    public String name_ = BuildConfig.FLAVOR;
    public int type_ = 1;

    /* compiled from: PG */
    public final class Builder extends C62934bn implements C63001dt {
        public Builder() {
            super(BackupProtos$Key.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PG */
    public final class Type {

        /* compiled from: PG */
        final class TypeVerifier implements C62959cf {
            static final C62959cf INSTANCE = new TypeVerifier();

            private TypeVerifier() {
            }

            public final boolean isInRange(int i) {
                return Type.m14179a(i) != 0;
            }
        }

        /* renamed from: a */
        public static int m14179a(int i) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 4;
                        if (i != 4) {
                            return 0;
                        }
                    }
                }
            }
            return i2;
        }
    }

    static {
        BackupProtos$Key backupProtos$Key = new BackupProtos$Key();
        DEFAULT_INSTANCE = backupProtos$Key;
        C62942bv.registerDefaultInstance(BackupProtos$Key.class, backupProtos$Key);
    }

    private BackupProtos$Key() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "type_", Type.TypeVerifier.INSTANCE, "name_", "id_", "checksum_"});
            case 3:
                return new BackupProtos$Key();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C63010eb ebVar = PARSER;
                if (ebVar == null) {
                    synchronized (BackupProtos$Key.class) {
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
