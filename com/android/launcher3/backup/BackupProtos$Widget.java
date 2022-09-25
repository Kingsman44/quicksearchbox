package com.android.launcher3.backup;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* compiled from: PG */
public final class BackupProtos$Widget extends C62942bv implements C63001dt {
    public static final BackupProtos$Widget DEFAULT_INSTANCE;
    private static volatile C63010eb PARSER;
    public int bitField0_;
    public boolean configure_;
    public BackupProtos$Resource icon_;
    public String label_ = BuildConfig.FLAVOR;
    private byte memoizedIsInitialized = 2;
    public int minSpanX_ = 2;
    public int minSpanY_ = 2;
    private BackupProtos$Resource preview_;
    public String provider_ = BuildConfig.FLAVOR;

    /* compiled from: PG */
    public final class Builder extends C62934bn implements C63001dt {
        public Builder() {
            super(BackupProtos$Widget.DEFAULT_INSTANCE);
        }
    }

    static {
        BackupProtos$Widget backupProtos$Widget = new BackupProtos$Widget();
        DEFAULT_INSTANCE = backupProtos$Widget;
        C62942bv.registerDefaultInstance(BackupProtos$Widget.class, backupProtos$Widget);
    }

    private BackupProtos$Widget() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "provider_", "label_", "configure_", "icon_", "preview_", "minSpanX_", "minSpanY_"});
            case 3:
                return new BackupProtos$Widget();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C63010eb ebVar = PARSER;
                if (ebVar == null) {
                    synchronized (BackupProtos$Widget.class) {
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
