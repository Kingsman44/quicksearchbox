package com.android.launcher3.backup;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* compiled from: PG */
public final class BackupProtos$Favorite extends C62942bv implements C63001dt {
    public static final BackupProtos$Favorite DEFAULT_INSTANCE;
    private static volatile C63010eb PARSER;
    public int appWidgetId_;
    public String appWidgetProvider_ = BuildConfig.FLAVOR;
    public int bitField0_;
    public int cellX_;
    public int cellY_;
    public int container_;
    public String iconPackage_ = BuildConfig.FLAVOR;
    public String iconResource_ = BuildConfig.FLAVOR;
    public int iconType_;
    public C63088z icon_ = C63088z.f170246b;
    public long id_;
    public String intent_ = BuildConfig.FLAVOR;
    public int itemType_;
    private byte memoizedIsInitialized = 2;
    public int rank_;
    public int screen_;
    public int spanX_;
    public int spanY_;
    public int targetType_;
    public String title_ = BuildConfig.FLAVOR;

    /* compiled from: PG */
    public final class Builder extends C62934bn implements C63001dt {
        public Builder() {
            super(BackupProtos$Favorite.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PG */
    public final class TargetType {

        /* compiled from: PG */
        final class TargetTypeVerifier implements C62959cf {
            static final C62959cf INSTANCE = new TargetTypeVerifier();

            private TargetTypeVerifier() {
            }

            public final boolean isInRange(int i) {
                return TargetType.m14178a(i) != 0;
            }
        }

        /* renamed from: a */
        public static int m14178a(int i) {
            switch (i) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                default:
                    return 0;
            }
        }
    }

    static {
        BackupProtos$Favorite backupProtos$Favorite = new BackupProtos$Favorite();
        DEFAULT_INSTANCE = backupProtos$Favorite;
        C62942bv.registerDefaultInstance(BackupProtos$Favorite.class, backupProtos$Favorite);
    }

    private BackupProtos$Favorite() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0000\u0002\u0001ᔂ\u0000\u0002ᔄ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\u000bင\n\fဈ\u000b\rဈ\f\u000fင\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ည\u0011\u0013ဌ\u0012\u0014င\u0013", new Object[]{"bitField0_", "id_", "itemType_", "title_", "container_", "screen_", "cellX_", "cellY_", "spanX_", "spanY_", "appWidgetId_", "appWidgetProvider_", "intent_", "iconType_", "iconPackage_", "iconResource_", "icon_", "targetType_", TargetType.TargetTypeVerifier.INSTANCE, "rank_"});
            case 3:
                return new BackupProtos$Favorite();
            case 4:
                return new Builder();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C63010eb ebVar = PARSER;
                if (ebVar == null) {
                    synchronized (BackupProtos$Favorite.class) {
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
