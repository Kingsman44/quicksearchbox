package com.google.p3723ar.core.viewer.jniprotolite;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.viewer.jniprotolite.Types */
/* compiled from: PG */
public final class Types {

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$AutoEnvironmentSettings */
    /* compiled from: PG */
    public final class AutoEnvironmentSettings extends C62942bv implements AutoEnvironmentSettingsOrBuilder {
        public static final int BACKGROUND_URI_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final AutoEnvironmentSettings DEFAULT_INSTANCE;
        public static final int IBL_URI_FIELD_NUMBER = 2;
        private static volatile C63010eb PARSER;
        private String backgroundUri_ = BuildConfig.FLAVOR;
        private String iblUri_ = BuildConfig.FLAVOR;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$AutoEnvironmentSettings$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements AutoEnvironmentSettingsOrBuilder {
            private Builder() {
                super(AutoEnvironmentSettings.DEFAULT_INSTANCE);
            }

            public Builder clearBackgroundUri() {
                copyOnWrite();
                ((AutoEnvironmentSettings) this.instance).clearBackgroundUri();
                return this;
            }

            public Builder clearIblUri() {
                copyOnWrite();
                ((AutoEnvironmentSettings) this.instance).clearIblUri();
                return this;
            }

            public String getBackgroundUri() {
                return ((AutoEnvironmentSettings) this.instance).getBackgroundUri();
            }

            public C63088z getBackgroundUriBytes() {
                return ((AutoEnvironmentSettings) this.instance).getBackgroundUriBytes();
            }

            public String getIblUri() {
                return ((AutoEnvironmentSettings) this.instance).getIblUri();
            }

            public C63088z getIblUriBytes() {
                return ((AutoEnvironmentSettings) this.instance).getIblUriBytes();
            }

            public Builder setBackgroundUri(String str) {
                copyOnWrite();
                ((AutoEnvironmentSettings) this.instance).setBackgroundUri(str);
                return this;
            }

            public Builder setBackgroundUriBytes(C63088z zVar) {
                copyOnWrite();
                ((AutoEnvironmentSettings) this.instance).setBackgroundUriBytes(zVar);
                return this;
            }

            public Builder setIblUri(String str) {
                copyOnWrite();
                ((AutoEnvironmentSettings) this.instance).setIblUri(str);
                return this;
            }

            public Builder setIblUriBytes(C63088z zVar) {
                copyOnWrite();
                ((AutoEnvironmentSettings) this.instance).setIblUriBytes(zVar);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        static {
            AutoEnvironmentSettings autoEnvironmentSettings = new AutoEnvironmentSettings();
            DEFAULT_INSTANCE = autoEnvironmentSettings;
            C62942bv.registerDefaultInstance(AutoEnvironmentSettings.class, autoEnvironmentSettings);
        }

        private AutoEnvironmentSettings() {
        }

        /* access modifiers changed from: private */
        public void clearBackgroundUri() {
            this.backgroundUri_ = getDefaultInstance().getBackgroundUri();
        }

        /* access modifiers changed from: private */
        public void clearIblUri() {
            this.iblUri_ = getDefaultInstance().getIblUri();
        }

        public static AutoEnvironmentSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AutoEnvironmentSettings parseDelimitedFrom(InputStream inputStream) {
            return (AutoEnvironmentSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AutoEnvironmentSettings parseFrom(C63088z zVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBackgroundUri(String str) {
            str.getClass();
            this.backgroundUri_ = str;
        }

        /* access modifiers changed from: private */
        public void setBackgroundUriBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.backgroundUri_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setIblUri(String str) {
            str.getClass();
            this.iblUri_ = str;
        }

        /* access modifiers changed from: private */
        public void setIblUriBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.iblUri_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"backgroundUri_", "iblUri_"});
                case 3:
                    return new AutoEnvironmentSettings();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (AutoEnvironmentSettings.class) {
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

        public String getBackgroundUri() {
            return this.backgroundUri_;
        }

        public C63088z getBackgroundUriBytes() {
            return C63088z.m96143E(this.backgroundUri_);
        }

        public String getIblUri() {
            return this.iblUri_;
        }

        public C63088z getIblUriBytes() {
            return C63088z.m96143E(this.iblUri_);
        }

        public static Builder newBuilder(AutoEnvironmentSettings autoEnvironmentSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(autoEnvironmentSettings);
        }

        public static AutoEnvironmentSettings parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (AutoEnvironmentSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static AutoEnvironmentSettings parseFrom(C63088z zVar, C62921ba baVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static AutoEnvironmentSettings parseFrom(C62897ae aeVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static AutoEnvironmentSettings parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static AutoEnvironmentSettings parseFrom(InputStream inputStream) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static AutoEnvironmentSettings parseFrom(InputStream inputStream, C62921ba baVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static AutoEnvironmentSettings parseFrom(ByteBuffer byteBuffer) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static AutoEnvironmentSettings parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static AutoEnvironmentSettings parseFrom(byte[] bArr) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static AutoEnvironmentSettings parseFrom(byte[] bArr, C62921ba baVar) {
            return (AutoEnvironmentSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$AutoEnvironmentSettingsOrBuilder */
    /* compiled from: PG */
    public interface AutoEnvironmentSettingsOrBuilder extends C63001dt {
        String getBackgroundUri();

        C63088z getBackgroundUriBytes();

        String getIblUri();

        C63088z getIblUriBytes();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$BottomCardVisibilityEvent */
    /* compiled from: PG */
    public final class BottomCardVisibilityEvent extends C62942bv implements BottomCardVisibilityEventOrBuilder {
        /* access modifiers changed from: private */
        public static final BottomCardVisibilityEvent DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER = null;
        public static final int VISIBILITY_FIELD_NUMBER = 1;
        private int visibility_;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$BottomCardVisibilityEvent$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements BottomCardVisibilityEventOrBuilder {
            private Builder() {
                super(BottomCardVisibilityEvent.DEFAULT_INSTANCE);
            }

            public Builder clearVisibility() {
                copyOnWrite();
                ((BottomCardVisibilityEvent) this.instance).clearVisibility();
                return this;
            }

            public Visibility getVisibility() {
                return ((BottomCardVisibilityEvent) this.instance).getVisibility();
            }

            public int getVisibilityValue() {
                return ((BottomCardVisibilityEvent) this.instance).getVisibilityValue();
            }

            public Builder setVisibility(Visibility visibility) {
                copyOnWrite();
                ((BottomCardVisibilityEvent) this.instance).setVisibility(visibility);
                return this;
            }

            public Builder setVisibilityValue(int i) {
                copyOnWrite();
                ((BottomCardVisibilityEvent) this.instance).setVisibilityValue(i);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        static {
            BottomCardVisibilityEvent bottomCardVisibilityEvent = new BottomCardVisibilityEvent();
            DEFAULT_INSTANCE = bottomCardVisibilityEvent;
            C62942bv.registerDefaultInstance(BottomCardVisibilityEvent.class, bottomCardVisibilityEvent);
        }

        private BottomCardVisibilityEvent() {
        }

        /* access modifiers changed from: private */
        public void clearVisibility() {
            this.visibility_ = 0;
        }

        public static BottomCardVisibilityEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BottomCardVisibilityEvent parseDelimitedFrom(InputStream inputStream) {
            return (BottomCardVisibilityEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BottomCardVisibilityEvent parseFrom(C63088z zVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setVisibility(Visibility visibility) {
            this.visibility_ = visibility.getNumber();
        }

        /* access modifiers changed from: private */
        public void setVisibilityValue(int i) {
            this.visibility_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"visibility_"});
                case 3:
                    return new BottomCardVisibilityEvent();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (BottomCardVisibilityEvent.class) {
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

        public Visibility getVisibility() {
            Visibility forNumber = Visibility.forNumber(this.visibility_);
            return forNumber == null ? Visibility.UNRECOGNIZED : forNumber;
        }

        public int getVisibilityValue() {
            return this.visibility_;
        }

        public static Builder newBuilder(BottomCardVisibilityEvent bottomCardVisibilityEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bottomCardVisibilityEvent);
        }

        public static BottomCardVisibilityEvent parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (BottomCardVisibilityEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static BottomCardVisibilityEvent parseFrom(C63088z zVar, C62921ba baVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static BottomCardVisibilityEvent parseFrom(C62897ae aeVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static BottomCardVisibilityEvent parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static BottomCardVisibilityEvent parseFrom(InputStream inputStream) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static BottomCardVisibilityEvent parseFrom(InputStream inputStream, C62921ba baVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static BottomCardVisibilityEvent parseFrom(ByteBuffer byteBuffer) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static BottomCardVisibilityEvent parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static BottomCardVisibilityEvent parseFrom(byte[] bArr) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static BottomCardVisibilityEvent parseFrom(byte[] bArr, C62921ba baVar) {
            return (BottomCardVisibilityEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$BottomCardVisibilityEventOrBuilder */
    /* compiled from: PG */
    public interface BottomCardVisibilityEventOrBuilder extends C63001dt {
        Visibility getVisibility();

        int getVisibilityValue();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$ButtonType */
    /* compiled from: PG */
    public enum ButtonType implements C62957cd {
        NONE(0),
        LEFT(1),
        RIGHT(2),
        GET_HELP(3),
        UNRECOGNIZED(-1);
        
        public static final int GET_HELP_VALUE = 3;
        public static final int LEFT_VALUE = 1;
        public static final int NONE_VALUE = 0;
        public static final int RIGHT_VALUE = 2;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47941b();
        }

        private ButtonType(int i) {
            this.value = i;
        }

        public static ButtonType forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return LEFT;
            }
            if (i == 2) {
                return RIGHT;
            }
            if (i != 3) {
                return null;
            }
            return GET_HELP;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47942c.f124124a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$ChipNotificationContent */
    /* compiled from: PG */
    public enum ChipNotificationContent implements C62957cd {
        NO_NETWORK_CONNECTION(0),
        SLOW_NETWORK_CONNECTION(1),
        UNRECOGNIZED(-1);
        
        public static final int NO_NETWORK_CONNECTION_VALUE = 0;
        public static final int SLOW_NETWORK_CONNECTION_VALUE = 1;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47943d();
        }

        private ChipNotificationContent(int i) {
            this.value = i;
        }

        public static ChipNotificationContent forNumber(int i) {
            if (i == 0) {
                return NO_NETWORK_CONNECTION;
            }
            if (i != 1) {
                return null;
            }
            return SLOW_NETWORK_CONNECTION;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47944e.f124125a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$DynamicResolutionSettings */
    /* compiled from: PG */
    public final class DynamicResolutionSettings extends C62942bv implements DynamicResolutionSettingsOrBuilder {
        /* access modifiers changed from: private */
        public static final DynamicResolutionSettings DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 9;
        public static final int MAX_SCALE_FIELD_NUMBER = 12;
        public static final int MIN_SCALE_FIELD_NUMBER = 11;
        private static volatile C63010eb PARSER = null;
        public static final int SCALE_RATE_FIELD_NUMBER = 10;
        private boolean enabled_;
        private float maxScale_;
        private float minScale_;
        private float scaleRate_;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$DynamicResolutionSettings$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements DynamicResolutionSettingsOrBuilder {
            private Builder() {
                super(DynamicResolutionSettings.DEFAULT_INSTANCE);
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).clearEnabled();
                return this;
            }

            public Builder clearMaxScale() {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).clearMaxScale();
                return this;
            }

            public Builder clearMinScale() {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).clearMinScale();
                return this;
            }

            public Builder clearScaleRate() {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).clearScaleRate();
                return this;
            }

            public boolean getEnabled() {
                return ((DynamicResolutionSettings) this.instance).getEnabled();
            }

            public float getMaxScale() {
                return ((DynamicResolutionSettings) this.instance).getMaxScale();
            }

            public float getMinScale() {
                return ((DynamicResolutionSettings) this.instance).getMinScale();
            }

            public float getScaleRate() {
                return ((DynamicResolutionSettings) this.instance).getScaleRate();
            }

            public Builder setEnabled(boolean z) {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).setEnabled(z);
                return this;
            }

            public Builder setMaxScale(float f) {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).setMaxScale(f);
                return this;
            }

            public Builder setMinScale(float f) {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).setMinScale(f);
                return this;
            }

            public Builder setScaleRate(float f) {
                copyOnWrite();
                ((DynamicResolutionSettings) this.instance).setScaleRate(f);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        static {
            DynamicResolutionSettings dynamicResolutionSettings = new DynamicResolutionSettings();
            DEFAULT_INSTANCE = dynamicResolutionSettings;
            C62942bv.registerDefaultInstance(DynamicResolutionSettings.class, dynamicResolutionSettings);
        }

        private DynamicResolutionSettings() {
        }

        /* access modifiers changed from: private */
        public void clearEnabled() {
            this.enabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearMaxScale() {
            this.maxScale_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearMinScale() {
            this.minScale_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearScaleRate() {
            this.scaleRate_ = 0.0f;
        }

        public static DynamicResolutionSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DynamicResolutionSettings parseDelimitedFrom(InputStream inputStream) {
            return (DynamicResolutionSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicResolutionSettings parseFrom(C63088z zVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEnabled(boolean z) {
            this.enabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setMaxScale(float f) {
            this.maxScale_ = f;
        }

        /* access modifiers changed from: private */
        public void setMinScale(float f) {
            this.minScale_ = f;
        }

        /* access modifiers changed from: private */
        public void setScaleRate(float f) {
            this.scaleRate_ = f;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\t\f\u0004\u0000\u0000\u0000\t\u0007\n\u0001\u000b\u0001\f\u0001", new Object[]{"enabled_", "scaleRate_", "minScale_", "maxScale_"});
                case 3:
                    return new DynamicResolutionSettings();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (DynamicResolutionSettings.class) {
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

        public boolean getEnabled() {
            return this.enabled_;
        }

        public float getMaxScale() {
            return this.maxScale_;
        }

        public float getMinScale() {
            return this.minScale_;
        }

        public float getScaleRate() {
            return this.scaleRate_;
        }

        public static Builder newBuilder(DynamicResolutionSettings dynamicResolutionSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dynamicResolutionSettings);
        }

        public static DynamicResolutionSettings parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (DynamicResolutionSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static DynamicResolutionSettings parseFrom(C63088z zVar, C62921ba baVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static DynamicResolutionSettings parseFrom(C62897ae aeVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static DynamicResolutionSettings parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static DynamicResolutionSettings parseFrom(InputStream inputStream) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicResolutionSettings parseFrom(InputStream inputStream, C62921ba baVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static DynamicResolutionSettings parseFrom(ByteBuffer byteBuffer) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static DynamicResolutionSettings parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static DynamicResolutionSettings parseFrom(byte[] bArr) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static DynamicResolutionSettings parseFrom(byte[] bArr, C62921ba baVar) {
            return (DynamicResolutionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$DynamicResolutionSettingsOrBuilder */
    /* compiled from: PG */
    public interface DynamicResolutionSettingsOrBuilder extends C63001dt {
        boolean getEnabled();

        float getMaxScale();

        float getMinScale();

        float getScaleRate();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$ImageBasedLighting */
    /* compiled from: PG */
    public enum ImageBasedLighting implements C62957cd {
        DEFAULT_LIGHTING(0),
        AUTO_STUDIO(1),
        AUTO_OUTDOOR(2),
        UNRECOGNIZED(-1);
        
        public static final int AUTO_OUTDOOR_VALUE = 2;
        public static final int AUTO_STUDIO_VALUE = 1;
        public static final int DEFAULT_LIGHTING_VALUE = 0;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47945f();
        }

        private ImageBasedLighting(int i) {
            this.value = i;
        }

        public static ImageBasedLighting forNumber(int i) {
            if (i == 0) {
                return DEFAULT_LIGHTING;
            }
            if (i == 1) {
                return AUTO_STUDIO;
            }
            if (i != 2) {
                return null;
            }
            return AUTO_OUTDOOR;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47946g.f124126a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$InitialScale */
    /* compiled from: PG */
    public final class InitialScale extends C62942bv implements InitialScaleOrBuilder {
        /* access modifiers changed from: private */
        public static final InitialScale DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER = null;
        public static final int SCALE_FIELD_NUMBER = 2;
        public static final int SCALING_FIELD_NUMBER = 1;
        private float scale_;
        private int scaling_;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$InitialScale$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements InitialScaleOrBuilder {
            private Builder() {
                super(InitialScale.DEFAULT_INSTANCE);
            }

            public Builder clearScale() {
                copyOnWrite();
                ((InitialScale) this.instance).clearScale();
                return this;
            }

            public Builder clearScaling() {
                copyOnWrite();
                ((InitialScale) this.instance).clearScaling();
                return this;
            }

            public float getScale() {
                return ((InitialScale) this.instance).getScale();
            }

            public Scaling getScaling() {
                return ((InitialScale) this.instance).getScaling();
            }

            public int getScalingValue() {
                return ((InitialScale) this.instance).getScalingValue();
            }

            public Builder setScale(float f) {
                copyOnWrite();
                ((InitialScale) this.instance).setScale(f);
                return this;
            }

            public Builder setScaling(Scaling scaling) {
                copyOnWrite();
                ((InitialScale) this.instance).setScaling(scaling);
                return this;
            }

            public Builder setScalingValue(int i) {
                copyOnWrite();
                ((InitialScale) this.instance).setScalingValue(i);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        static {
            InitialScale initialScale = new InitialScale();
            DEFAULT_INSTANCE = initialScale;
            C62942bv.registerDefaultInstance(InitialScale.class, initialScale);
        }

        private InitialScale() {
        }

        /* access modifiers changed from: private */
        public void clearScale() {
            this.scale_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearScaling() {
            this.scaling_ = 0;
        }

        public static InitialScale getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitialScale parseDelimitedFrom(InputStream inputStream) {
            return (InitialScale) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitialScale parseFrom(C63088z zVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setScale(float f) {
            this.scale_ = f;
        }

        /* access modifiers changed from: private */
        public void setScaling(Scaling scaling) {
            this.scaling_ = scaling.getNumber();
        }

        /* access modifiers changed from: private */
        public void setScalingValue(int i) {
            this.scaling_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0001", new Object[]{"scaling_", "scale_"});
                case 3:
                    return new InitialScale();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (InitialScale.class) {
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

        public float getScale() {
            return this.scale_;
        }

        public Scaling getScaling() {
            Scaling forNumber = Scaling.forNumber(this.scaling_);
            return forNumber == null ? Scaling.UNRECOGNIZED : forNumber;
        }

        public int getScalingValue() {
            return this.scaling_;
        }

        public static Builder newBuilder(InitialScale initialScale) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initialScale);
        }

        public static InitialScale parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (InitialScale) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static InitialScale parseFrom(C63088z zVar, C62921ba baVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static InitialScale parseFrom(C62897ae aeVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static InitialScale parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static InitialScale parseFrom(InputStream inputStream) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static InitialScale parseFrom(InputStream inputStream, C62921ba baVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static InitialScale parseFrom(ByteBuffer byteBuffer) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static InitialScale parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static InitialScale parseFrom(byte[] bArr) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static InitialScale parseFrom(byte[] bArr, C62921ba baVar) {
            return (InitialScale) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$InitialScaleOrBuilder */
    /* compiled from: PG */
    public interface InitialScaleOrBuilder extends C63001dt {
        float getScale();

        Scaling getScaling();

        int getScalingValue();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$InitialSettings */
    /* compiled from: PG */
    public final class InitialSettings extends C62942bv implements InitialSettingsOrBuilder {
        public static final int AR_CORE_APK_VERSION_CODE_FIELD_NUMBER = 10;
        public static final int AUTO_COLOR_HEX_FIELD_NUMBER = 6;
        public static final int AUTO_ENVIRONMENT_FIELD_NUMBER = 8;
        public static final int BUILD_TYPE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final InitialSettings DEFAULT_INSTANCE;
        public static final int DYNAMIC_RESOLUTION_OPTIONS_FIELD_NUMBER = 9;
        public static final int ENABLE_DIMENSION_VISUALIZATION_FIELD_NUMBER = 13;
        public static final int ENABLE_FEATURE_POINTS_FIELD_NUMBER = 12;
        public static final int ENABLE_ONBOARDING_GUIDANCE_FIELD_NUMBER = 11;
        public static final int LIGHTING_FIELD_NUMBER = 3;
        public static final int OCCLUSION_FIELD_NUMBER = 4;
        private static volatile C63010eb PARSER = null;
        public static final int STREAMING_FIELD_NUMBER = 5;
        public static final int USE_DARK_THEME_FIELD_NUMBER = 7;
        public static final int VIEWER_SESSION_UUID_FIELD_NUMBER = 2;
        private int arCoreApkVersionCode_;
        private String autoColorHex_ = BuildConfig.FLAVOR;
        private AutoEnvironmentSettings autoEnvironment_;
        private int bitField0_;
        private int buildType_;
        private DynamicResolutionSettings dynamicResolutionOptions_;
        private boolean enableDimensionVisualization_;
        private boolean enableFeaturePoints_;
        private boolean enableOnboardingGuidance_;
        private LightingSettings lighting_;
        private OcclusionSettings occlusion_;
        private StreamingSettings streaming_;
        private boolean useDarkTheme_;
        private String viewerSessionUuid_ = BuildConfig.FLAVOR;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$InitialSettings$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements InitialSettingsOrBuilder {
            private Builder() {
                super(InitialSettings.DEFAULT_INSTANCE);
            }

            public Builder clearArCoreApkVersionCode() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearArCoreApkVersionCode();
                return this;
            }

            public Builder clearAutoColorHex() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearAutoColorHex();
                return this;
            }

            public Builder clearAutoEnvironment() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearAutoEnvironment();
                return this;
            }

            public Builder clearBuildType() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearBuildType();
                return this;
            }

            public Builder clearDynamicResolutionOptions() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearDynamicResolutionOptions();
                return this;
            }

            public Builder clearEnableDimensionVisualization() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearEnableDimensionVisualization();
                return this;
            }

            public Builder clearEnableFeaturePoints() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearEnableFeaturePoints();
                return this;
            }

            public Builder clearEnableOnboardingGuidance() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearEnableOnboardingGuidance();
                return this;
            }

            public Builder clearLighting() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearLighting();
                return this;
            }

            public Builder clearOcclusion() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearOcclusion();
                return this;
            }

            public Builder clearStreaming() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearStreaming();
                return this;
            }

            public Builder clearUseDarkTheme() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearUseDarkTheme();
                return this;
            }

            public Builder clearViewerSessionUuid() {
                copyOnWrite();
                ((InitialSettings) this.instance).clearViewerSessionUuid();
                return this;
            }

            public int getArCoreApkVersionCode() {
                return ((InitialSettings) this.instance).getArCoreApkVersionCode();
            }

            public String getAutoColorHex() {
                return ((InitialSettings) this.instance).getAutoColorHex();
            }

            public C63088z getAutoColorHexBytes() {
                return ((InitialSettings) this.instance).getAutoColorHexBytes();
            }

            public AutoEnvironmentSettings getAutoEnvironment() {
                return ((InitialSettings) this.instance).getAutoEnvironment();
            }

            public int getBuildType() {
                return ((InitialSettings) this.instance).getBuildType();
            }

            public DynamicResolutionSettings getDynamicResolutionOptions() {
                return ((InitialSettings) this.instance).getDynamicResolutionOptions();
            }

            public boolean getEnableDimensionVisualization() {
                return ((InitialSettings) this.instance).getEnableDimensionVisualization();
            }

            public boolean getEnableFeaturePoints() {
                return ((InitialSettings) this.instance).getEnableFeaturePoints();
            }

            public boolean getEnableOnboardingGuidance() {
                return ((InitialSettings) this.instance).getEnableOnboardingGuidance();
            }

            public LightingSettings getLighting() {
                return ((InitialSettings) this.instance).getLighting();
            }

            public OcclusionSettings getOcclusion() {
                return ((InitialSettings) this.instance).getOcclusion();
            }

            public StreamingSettings getStreaming() {
                return ((InitialSettings) this.instance).getStreaming();
            }

            public boolean getUseDarkTheme() {
                return ((InitialSettings) this.instance).getUseDarkTheme();
            }

            public String getViewerSessionUuid() {
                return ((InitialSettings) this.instance).getViewerSessionUuid();
            }

            public C63088z getViewerSessionUuidBytes() {
                return ((InitialSettings) this.instance).getViewerSessionUuidBytes();
            }

            public boolean hasAutoColorHex() {
                return ((InitialSettings) this.instance).hasAutoColorHex();
            }

            public boolean hasAutoEnvironment() {
                return ((InitialSettings) this.instance).hasAutoEnvironment();
            }

            public boolean hasDynamicResolutionOptions() {
                return ((InitialSettings) this.instance).hasDynamicResolutionOptions();
            }

            public boolean hasLighting() {
                return ((InitialSettings) this.instance).hasLighting();
            }

            public boolean hasOcclusion() {
                return ((InitialSettings) this.instance).hasOcclusion();
            }

            public boolean hasStreaming() {
                return ((InitialSettings) this.instance).hasStreaming();
            }

            public Builder mergeAutoEnvironment(AutoEnvironmentSettings autoEnvironmentSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).mergeAutoEnvironment(autoEnvironmentSettings);
                return this;
            }

            public Builder mergeDynamicResolutionOptions(DynamicResolutionSettings dynamicResolutionSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).mergeDynamicResolutionOptions(dynamicResolutionSettings);
                return this;
            }

            public Builder mergeLighting(LightingSettings lightingSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).mergeLighting(lightingSettings);
                return this;
            }

            public Builder mergeOcclusion(OcclusionSettings occlusionSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).mergeOcclusion(occlusionSettings);
                return this;
            }

            public Builder mergeStreaming(StreamingSettings streamingSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).mergeStreaming(streamingSettings);
                return this;
            }

            public Builder setArCoreApkVersionCode(int i) {
                copyOnWrite();
                ((InitialSettings) this.instance).setArCoreApkVersionCode(i);
                return this;
            }

            public Builder setAutoColorHex(String str) {
                copyOnWrite();
                ((InitialSettings) this.instance).setAutoColorHex(str);
                return this;
            }

            public Builder setAutoColorHexBytes(C63088z zVar) {
                copyOnWrite();
                ((InitialSettings) this.instance).setAutoColorHexBytes(zVar);
                return this;
            }

            public Builder setAutoEnvironment(AutoEnvironmentSettings.Builder builder) {
                copyOnWrite();
                ((InitialSettings) this.instance).setAutoEnvironment((AutoEnvironmentSettings) builder.build());
                return this;
            }

            public Builder setBuildType(int i) {
                copyOnWrite();
                ((InitialSettings) this.instance).setBuildType(i);
                return this;
            }

            public Builder setDynamicResolutionOptions(DynamicResolutionSettings.Builder builder) {
                copyOnWrite();
                ((InitialSettings) this.instance).setDynamicResolutionOptions((DynamicResolutionSettings) builder.build());
                return this;
            }

            public Builder setEnableDimensionVisualization(boolean z) {
                copyOnWrite();
                ((InitialSettings) this.instance).setEnableDimensionVisualization(z);
                return this;
            }

            public Builder setEnableFeaturePoints(boolean z) {
                copyOnWrite();
                ((InitialSettings) this.instance).setEnableFeaturePoints(z);
                return this;
            }

            public Builder setEnableOnboardingGuidance(boolean z) {
                copyOnWrite();
                ((InitialSettings) this.instance).setEnableOnboardingGuidance(z);
                return this;
            }

            public Builder setLighting(LightingSettings.Builder builder) {
                copyOnWrite();
                ((InitialSettings) this.instance).setLighting((LightingSettings) builder.build());
                return this;
            }

            public Builder setOcclusion(OcclusionSettings.Builder builder) {
                copyOnWrite();
                ((InitialSettings) this.instance).setOcclusion((OcclusionSettings) builder.build());
                return this;
            }

            public Builder setStreaming(StreamingSettings.Builder builder) {
                copyOnWrite();
                ((InitialSettings) this.instance).setStreaming((StreamingSettings) builder.build());
                return this;
            }

            public Builder setUseDarkTheme(boolean z) {
                copyOnWrite();
                ((InitialSettings) this.instance).setUseDarkTheme(z);
                return this;
            }

            public Builder setViewerSessionUuid(String str) {
                copyOnWrite();
                ((InitialSettings) this.instance).setViewerSessionUuid(str);
                return this;
            }

            public Builder setViewerSessionUuidBytes(C63088z zVar) {
                copyOnWrite();
                ((InitialSettings) this.instance).setViewerSessionUuidBytes(zVar);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }

            public Builder setAutoEnvironment(AutoEnvironmentSettings autoEnvironmentSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).setAutoEnvironment(autoEnvironmentSettings);
                return this;
            }

            public Builder setDynamicResolutionOptions(DynamicResolutionSettings dynamicResolutionSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).setDynamicResolutionOptions(dynamicResolutionSettings);
                return this;
            }

            public Builder setLighting(LightingSettings lightingSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).setLighting(lightingSettings);
                return this;
            }

            public Builder setOcclusion(OcclusionSettings occlusionSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).setOcclusion(occlusionSettings);
                return this;
            }

            public Builder setStreaming(StreamingSettings streamingSettings) {
                copyOnWrite();
                ((InitialSettings) this.instance).setStreaming(streamingSettings);
                return this;
            }
        }

        static {
            InitialSettings initialSettings = new InitialSettings();
            DEFAULT_INSTANCE = initialSettings;
            C62942bv.registerDefaultInstance(InitialSettings.class, initialSettings);
        }

        private InitialSettings() {
        }

        /* access modifiers changed from: private */
        public void clearArCoreApkVersionCode() {
            this.arCoreApkVersionCode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAutoColorHex() {
            this.bitField0_ &= -3;
            this.autoColorHex_ = getDefaultInstance().getAutoColorHex();
        }

        /* access modifiers changed from: private */
        public void clearAutoEnvironment() {
            this.autoEnvironment_ = null;
        }

        /* access modifiers changed from: private */
        public void clearBuildType() {
            this.buildType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDynamicResolutionOptions() {
            this.dynamicResolutionOptions_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearEnableDimensionVisualization() {
            this.enableDimensionVisualization_ = false;
        }

        /* access modifiers changed from: private */
        public void clearEnableFeaturePoints() {
            this.enableFeaturePoints_ = false;
        }

        /* access modifiers changed from: private */
        public void clearEnableOnboardingGuidance() {
            this.enableOnboardingGuidance_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLighting() {
            this.lighting_ = null;
        }

        /* access modifiers changed from: private */
        public void clearOcclusion() {
            this.occlusion_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearStreaming() {
            this.streaming_ = null;
        }

        /* access modifiers changed from: private */
        public void clearUseDarkTheme() {
            this.useDarkTheme_ = false;
        }

        /* access modifiers changed from: private */
        public void clearViewerSessionUuid() {
            this.viewerSessionUuid_ = getDefaultInstance().getViewerSessionUuid();
        }

        public static InitialSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAutoEnvironment(AutoEnvironmentSettings autoEnvironmentSettings) {
            autoEnvironmentSettings.getClass();
            AutoEnvironmentSettings autoEnvironmentSettings2 = this.autoEnvironment_;
            if (autoEnvironmentSettings2 == null || autoEnvironmentSettings2 == AutoEnvironmentSettings.getDefaultInstance()) {
                this.autoEnvironment_ = autoEnvironmentSettings;
                return;
            }
            AutoEnvironmentSettings.Builder newBuilder = AutoEnvironmentSettings.newBuilder(autoEnvironmentSettings2);
            newBuilder.mergeFrom(autoEnvironmentSettings);
            this.autoEnvironment_ = (AutoEnvironmentSettings) newBuilder.buildPartial();
        }

        /* access modifiers changed from: private */
        public void mergeDynamicResolutionOptions(DynamicResolutionSettings dynamicResolutionSettings) {
            dynamicResolutionSettings.getClass();
            DynamicResolutionSettings dynamicResolutionSettings2 = this.dynamicResolutionOptions_;
            if (!(dynamicResolutionSettings2 == null || dynamicResolutionSettings2 == DynamicResolutionSettings.getDefaultInstance())) {
                DynamicResolutionSettings.Builder newBuilder = DynamicResolutionSettings.newBuilder(dynamicResolutionSettings2);
                newBuilder.mergeFrom(dynamicResolutionSettings);
                dynamicResolutionSettings = (DynamicResolutionSettings) newBuilder.buildPartial();
            }
            this.dynamicResolutionOptions_ = dynamicResolutionSettings;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeLighting(LightingSettings lightingSettings) {
            lightingSettings.getClass();
            LightingSettings lightingSettings2 = this.lighting_;
            if (lightingSettings2 == null || lightingSettings2 == LightingSettings.getDefaultInstance()) {
                this.lighting_ = lightingSettings;
                return;
            }
            LightingSettings.Builder newBuilder = LightingSettings.newBuilder(lightingSettings2);
            newBuilder.mergeFrom(lightingSettings);
            this.lighting_ = (LightingSettings) newBuilder.buildPartial();
        }

        /* access modifiers changed from: private */
        public void mergeOcclusion(OcclusionSettings occlusionSettings) {
            occlusionSettings.getClass();
            OcclusionSettings occlusionSettings2 = this.occlusion_;
            if (!(occlusionSettings2 == null || occlusionSettings2 == OcclusionSettings.getDefaultInstance())) {
                OcclusionSettings.Builder newBuilder = OcclusionSettings.newBuilder(occlusionSettings2);
                newBuilder.mergeFrom(occlusionSettings);
                occlusionSettings = (OcclusionSettings) newBuilder.buildPartial();
            }
            this.occlusion_ = occlusionSettings;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeStreaming(StreamingSettings streamingSettings) {
            streamingSettings.getClass();
            StreamingSettings streamingSettings2 = this.streaming_;
            if (streamingSettings2 == null || streamingSettings2 == StreamingSettings.getDefaultInstance()) {
                this.streaming_ = streamingSettings;
                return;
            }
            StreamingSettings.Builder newBuilder = StreamingSettings.newBuilder(streamingSettings2);
            newBuilder.mergeFrom(streamingSettings);
            this.streaming_ = (StreamingSettings) newBuilder.buildPartial();
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InitialSettings parseDelimitedFrom(InputStream inputStream) {
            return (InitialSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InitialSettings parseFrom(C63088z zVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setArCoreApkVersionCode(int i) {
            this.arCoreApkVersionCode_ = i;
        }

        /* access modifiers changed from: private */
        public void setAutoColorHex(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.autoColorHex_ = str;
        }

        /* access modifiers changed from: private */
        public void setAutoColorHexBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.autoColorHex_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setAutoEnvironment(AutoEnvironmentSettings autoEnvironmentSettings) {
            autoEnvironmentSettings.getClass();
            this.autoEnvironment_ = autoEnvironmentSettings;
        }

        /* access modifiers changed from: private */
        public void setBuildType(int i) {
            this.buildType_ = i;
        }

        /* access modifiers changed from: private */
        public void setDynamicResolutionOptions(DynamicResolutionSettings dynamicResolutionSettings) {
            dynamicResolutionSettings.getClass();
            this.dynamicResolutionOptions_ = dynamicResolutionSettings;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setEnableDimensionVisualization(boolean z) {
            this.enableDimensionVisualization_ = z;
        }

        /* access modifiers changed from: private */
        public void setEnableFeaturePoints(boolean z) {
            this.enableFeaturePoints_ = z;
        }

        /* access modifiers changed from: private */
        public void setEnableOnboardingGuidance(boolean z) {
            this.enableOnboardingGuidance_ = z;
        }

        /* access modifiers changed from: private */
        public void setLighting(LightingSettings lightingSettings) {
            lightingSettings.getClass();
            this.lighting_ = lightingSettings;
        }

        /* access modifiers changed from: private */
        public void setOcclusion(OcclusionSettings occlusionSettings) {
            occlusionSettings.getClass();
            this.occlusion_ = occlusionSettings;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setStreaming(StreamingSettings streamingSettings) {
            streamingSettings.getClass();
            this.streaming_ = streamingSettings;
        }

        /* access modifiers changed from: private */
        public void setUseDarkTheme(boolean z) {
            this.useDarkTheme_ = z;
        }

        /* access modifiers changed from: private */
        public void setViewerSessionUuid(String str) {
            str.getClass();
            this.viewerSessionUuid_ = str;
        }

        /* access modifiers changed from: private */
        public void setViewerSessionUuidBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.viewerSessionUuid_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\t\u0004ဉ\u0000\u0005\t\u0006ለ\u0001\u0007\u0007\b\t\tဉ\u0002\n\u0004\u000b\u0007\f\u0007\r\u0007", new Object[]{"bitField0_", "buildType_", "viewerSessionUuid_", "lighting_", "occlusion_", "streaming_", "autoColorHex_", "useDarkTheme_", "autoEnvironment_", "dynamicResolutionOptions_", "arCoreApkVersionCode_", "enableOnboardingGuidance_", "enableFeaturePoints_", "enableDimensionVisualization_"});
                case 3:
                    return new InitialSettings();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (InitialSettings.class) {
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

        public int getArCoreApkVersionCode() {
            return this.arCoreApkVersionCode_;
        }

        public String getAutoColorHex() {
            return this.autoColorHex_;
        }

        public C63088z getAutoColorHexBytes() {
            return C63088z.m96143E(this.autoColorHex_);
        }

        public AutoEnvironmentSettings getAutoEnvironment() {
            AutoEnvironmentSettings autoEnvironmentSettings = this.autoEnvironment_;
            return autoEnvironmentSettings == null ? AutoEnvironmentSettings.getDefaultInstance() : autoEnvironmentSettings;
        }

        public int getBuildType() {
            return this.buildType_;
        }

        public DynamicResolutionSettings getDynamicResolutionOptions() {
            DynamicResolutionSettings dynamicResolutionSettings = this.dynamicResolutionOptions_;
            return dynamicResolutionSettings == null ? DynamicResolutionSettings.getDefaultInstance() : dynamicResolutionSettings;
        }

        public boolean getEnableDimensionVisualization() {
            return this.enableDimensionVisualization_;
        }

        public boolean getEnableFeaturePoints() {
            return this.enableFeaturePoints_;
        }

        public boolean getEnableOnboardingGuidance() {
            return this.enableOnboardingGuidance_;
        }

        public LightingSettings getLighting() {
            LightingSettings lightingSettings = this.lighting_;
            return lightingSettings == null ? LightingSettings.getDefaultInstance() : lightingSettings;
        }

        public OcclusionSettings getOcclusion() {
            OcclusionSettings occlusionSettings = this.occlusion_;
            return occlusionSettings == null ? OcclusionSettings.getDefaultInstance() : occlusionSettings;
        }

        public StreamingSettings getStreaming() {
            StreamingSettings streamingSettings = this.streaming_;
            return streamingSettings == null ? StreamingSettings.getDefaultInstance() : streamingSettings;
        }

        public boolean getUseDarkTheme() {
            return this.useDarkTheme_;
        }

        public String getViewerSessionUuid() {
            return this.viewerSessionUuid_;
        }

        public C63088z getViewerSessionUuidBytes() {
            return C63088z.m96143E(this.viewerSessionUuid_);
        }

        public boolean hasAutoColorHex() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasAutoEnvironment() {
            return this.autoEnvironment_ != null;
        }

        public boolean hasDynamicResolutionOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLighting() {
            return this.lighting_ != null;
        }

        public boolean hasOcclusion() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStreaming() {
            return this.streaming_ != null;
        }

        public static Builder newBuilder(InitialSettings initialSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(initialSettings);
        }

        public static InitialSettings parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (InitialSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static InitialSettings parseFrom(C63088z zVar, C62921ba baVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static InitialSettings parseFrom(C62897ae aeVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static InitialSettings parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static InitialSettings parseFrom(InputStream inputStream) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static InitialSettings parseFrom(InputStream inputStream, C62921ba baVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static InitialSettings parseFrom(ByteBuffer byteBuffer) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static InitialSettings parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static InitialSettings parseFrom(byte[] bArr) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static InitialSettings parseFrom(byte[] bArr, C62921ba baVar) {
            return (InitialSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$InitialSettingsOrBuilder */
    /* compiled from: PG */
    public interface InitialSettingsOrBuilder extends C63001dt {
        int getArCoreApkVersionCode();

        String getAutoColorHex();

        C63088z getAutoColorHexBytes();

        AutoEnvironmentSettings getAutoEnvironment();

        int getBuildType();

        DynamicResolutionSettings getDynamicResolutionOptions();

        boolean getEnableDimensionVisualization();

        boolean getEnableFeaturePoints();

        boolean getEnableOnboardingGuidance();

        LightingSettings getLighting();

        OcclusionSettings getOcclusion();

        StreamingSettings getStreaming();

        boolean getUseDarkTheme();

        String getViewerSessionUuid();

        C63088z getViewerSessionUuidBytes();

        boolean hasAutoColorHex();

        boolean hasAutoEnvironment();

        boolean hasDynamicResolutionOptions();

        boolean hasLighting();

        boolean hasOcclusion();

        boolean hasStreaming();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$LightingSettings */
    /* compiled from: PG */
    public final class LightingSettings extends C62942bv implements LightingSettingsOrBuilder {
        /* access modifiers changed from: private */
        public static final LightingSettings DEFAULT_INSTANCE;
        public static final int IBL_FIELD_NUMBER = 2;
        public static final int MODE_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER;
        private int ibl_;
        private int mode_;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$LightingSettings$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements LightingSettingsOrBuilder {
            private Builder() {
                super(LightingSettings.DEFAULT_INSTANCE);
            }

            public Builder clearIbl() {
                copyOnWrite();
                ((LightingSettings) this.instance).clearIbl();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((LightingSettings) this.instance).clearMode();
                return this;
            }

            public ImageBasedLighting getIbl() {
                return ((LightingSettings) this.instance).getIbl();
            }

            public int getIblValue() {
                return ((LightingSettings) this.instance).getIblValue();
            }

            public Mode getMode() {
                return ((LightingSettings) this.instance).getMode();
            }

            public int getModeValue() {
                return ((LightingSettings) this.instance).getModeValue();
            }

            public Builder setIbl(ImageBasedLighting imageBasedLighting) {
                copyOnWrite();
                ((LightingSettings) this.instance).setIbl(imageBasedLighting);
                return this;
            }

            public Builder setIblValue(int i) {
                copyOnWrite();
                ((LightingSettings) this.instance).setIblValue(i);
                return this;
            }

            public Builder setMode(Mode mode) {
                copyOnWrite();
                ((LightingSettings) this.instance).setMode(mode);
                return this;
            }

            public Builder setModeValue(int i) {
                copyOnWrite();
                ((LightingSettings) this.instance).setModeValue(i);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$LightingSettings$Mode */
        /* compiled from: PG */
        public enum Mode implements C62957cd {
            UNSPECIFIED(0),
            DISABLED(1),
            ENABLED(2),
            UNRECOGNIZED(-1);
            
            public static final int DISABLED_VALUE = 1;
            public static final int ENABLED_VALUE = 2;
            public static final int UNSPECIFIED_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47947h();
            }

            private Mode(int i) {
                this.value = i;
            }

            public static Mode forNumber(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return DISABLED;
                }
                if (i != 2) {
                    return null;
                }
                return ENABLED;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47948i.f124127a;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        static {
            LightingSettings lightingSettings = new LightingSettings();
            DEFAULT_INSTANCE = lightingSettings;
            C62942bv.registerDefaultInstance(LightingSettings.class, lightingSettings);
        }

        private LightingSettings() {
        }

        /* access modifiers changed from: private */
        public void clearIbl() {
            this.ibl_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMode() {
            this.mode_ = 0;
        }

        public static LightingSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LightingSettings parseDelimitedFrom(InputStream inputStream) {
            return (LightingSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LightingSettings parseFrom(C63088z zVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIbl(ImageBasedLighting imageBasedLighting) {
            this.ibl_ = imageBasedLighting.getNumber();
        }

        /* access modifiers changed from: private */
        public void setIblValue(int i) {
            this.ibl_ = i;
        }

        /* access modifiers changed from: private */
        public void setMode(Mode mode) {
            this.mode_ = mode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setModeValue(int i) {
            this.mode_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"mode_", "ibl_"});
                case 3:
                    return new LightingSettings();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (LightingSettings.class) {
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

        public ImageBasedLighting getIbl() {
            ImageBasedLighting forNumber = ImageBasedLighting.forNumber(this.ibl_);
            return forNumber == null ? ImageBasedLighting.UNRECOGNIZED : forNumber;
        }

        public int getIblValue() {
            return this.ibl_;
        }

        public Mode getMode() {
            Mode forNumber = Mode.forNumber(this.mode_);
            return forNumber == null ? Mode.UNRECOGNIZED : forNumber;
        }

        public int getModeValue() {
            return this.mode_;
        }

        public static Builder newBuilder(LightingSettings lightingSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(lightingSettings);
        }

        public static LightingSettings parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (LightingSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LightingSettings parseFrom(C63088z zVar, C62921ba baVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static LightingSettings parseFrom(C62897ae aeVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static LightingSettings parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static LightingSettings parseFrom(InputStream inputStream) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static LightingSettings parseFrom(InputStream inputStream, C62921ba baVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LightingSettings parseFrom(ByteBuffer byteBuffer) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static LightingSettings parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static LightingSettings parseFrom(byte[] bArr) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static LightingSettings parseFrom(byte[] bArr, C62921ba baVar) {
            return (LightingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$LightingSettingsOrBuilder */
    /* compiled from: PG */
    public interface LightingSettingsOrBuilder extends C63001dt {
        ImageBasedLighting getIbl();

        int getIblValue();

        LightingSettings.Mode getMode();

        int getModeValue();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$Notification */
    /* compiled from: PG */
    public enum Notification implements C62957cd {
        NO_NOTIFICATION(0),
        MOVE_CLOSER(1),
        OCCLUSION_OFF(2),
        OCCLUSION_ON(3),
        EXPERIMENTAL_MODE_RESOURCE_EXHAUSTED(4),
        EXPERIMENTAL_MODE_UNEXPECTEDLY_DISCONNECTED(5),
        EXPERIMENTAL_MODE_CLIENT_FAILED_TO_START(6),
        EXPERIMENTAL_MODE_TEST_IN_PROGRESS(7),
        VERTICAL_PLACEMENT_PEDESTAL_GUIDANCE(8),
        VERTICAL_PLACEMENT_ROTATION_GUIDANCE(9),
        VERTICAL_PLACEMENT_UP_ARROW_GUIDANCE(10),
        SIX_DOF_GUIDANCE(11),
        SCALING_DISABLED(12),
        LOW_LIGHT(13),
        INSUFFICIENT_FEATURES(14),
        EXCESSIVE_MOTION(15),
        DRAG_GUIDANCE(16),
        TWIST_GUIDANCE(17),
        PINCH_GUIDANCE(18),
        UNRECOGNIZED(-1);
        
        public static final int DRAG_GUIDANCE_VALUE = 16;
        public static final int EXCESSIVE_MOTION_VALUE = 15;
        public static final int EXPERIMENTAL_MODE_CLIENT_FAILED_TO_START_VALUE = 6;
        public static final int EXPERIMENTAL_MODE_RESOURCE_EXHAUSTED_VALUE = 4;
        public static final int EXPERIMENTAL_MODE_TEST_IN_PROGRESS_VALUE = 7;
        public static final int EXPERIMENTAL_MODE_UNEXPECTEDLY_DISCONNECTED_VALUE = 5;
        public static final int INSUFFICIENT_FEATURES_VALUE = 14;
        public static final int LOW_LIGHT_VALUE = 13;
        public static final int MOVE_CLOSER_VALUE = 1;
        public static final int NO_NOTIFICATION_VALUE = 0;
        public static final int OCCLUSION_OFF_VALUE = 2;
        public static final int OCCLUSION_ON_VALUE = 3;
        public static final int PINCH_GUIDANCE_VALUE = 18;
        public static final int SCALING_DISABLED_VALUE = 12;
        public static final int SIX_DOF_GUIDANCE_VALUE = 11;
        public static final int TWIST_GUIDANCE_VALUE = 17;
        public static final int VERTICAL_PLACEMENT_PEDESTAL_GUIDANCE_VALUE = 8;
        public static final int VERTICAL_PLACEMENT_ROTATION_GUIDANCE_VALUE = 9;
        public static final int VERTICAL_PLACEMENT_UP_ARROW_GUIDANCE_VALUE = 10;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47949j();
        }

        private Notification(int i) {
            this.value = i;
        }

        public static Notification forNumber(int i) {
            switch (i) {
                case 0:
                    return NO_NOTIFICATION;
                case 1:
                    return MOVE_CLOSER;
                case 2:
                    return OCCLUSION_OFF;
                case 3:
                    return OCCLUSION_ON;
                case 4:
                    return EXPERIMENTAL_MODE_RESOURCE_EXHAUSTED;
                case 5:
                    return EXPERIMENTAL_MODE_UNEXPECTEDLY_DISCONNECTED;
                case 6:
                    return EXPERIMENTAL_MODE_CLIENT_FAILED_TO_START;
                case 7:
                    return EXPERIMENTAL_MODE_TEST_IN_PROGRESS;
                case 8:
                    return VERTICAL_PLACEMENT_PEDESTAL_GUIDANCE;
                case 9:
                    return VERTICAL_PLACEMENT_ROTATION_GUIDANCE;
                case 10:
                    return VERTICAL_PLACEMENT_UP_ARROW_GUIDANCE;
                case 11:
                    return SIX_DOF_GUIDANCE;
                case 12:
                    return SCALING_DISABLED;
                case 13:
                    return LOW_LIGHT;
                case 14:
                    return INSUFFICIENT_FEATURES;
                case 15:
                    return EXCESSIVE_MOTION;
                case 16:
                    return DRAG_GUIDANCE;
                case 17:
                    return TWIST_GUIDANCE;
                case 18:
                    return PINCH_GUIDANCE;
                default:
                    return null;
            }
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47950k.f124128a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$OcclusionSettings */
    /* compiled from: PG */
    public final class OcclusionSettings extends C62942bv implements OcclusionSettingsOrBuilder {
        /* access modifiers changed from: private */
        public static final OcclusionSettings DEFAULT_INSTANCE;
        public static final int LONGEST_EXTENT_MAX_FIELD_NUMBER = 2;
        public static final int LONGEST_EXTENT_MIN_FIELD_NUMBER = 3;
        public static final int MODE_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER;
        private float longestExtentMax_;
        private float longestExtentMin_;
        private int mode_;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$OcclusionSettings$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements OcclusionSettingsOrBuilder {
            private Builder() {
                super(OcclusionSettings.DEFAULT_INSTANCE);
            }

            public Builder clearLongestExtentMax() {
                copyOnWrite();
                ((OcclusionSettings) this.instance).clearLongestExtentMax();
                return this;
            }

            public Builder clearLongestExtentMin() {
                copyOnWrite();
                ((OcclusionSettings) this.instance).clearLongestExtentMin();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((OcclusionSettings) this.instance).clearMode();
                return this;
            }

            public float getLongestExtentMax() {
                return ((OcclusionSettings) this.instance).getLongestExtentMax();
            }

            public float getLongestExtentMin() {
                return ((OcclusionSettings) this.instance).getLongestExtentMin();
            }

            public Mode getMode() {
                return ((OcclusionSettings) this.instance).getMode();
            }

            public int getModeValue() {
                return ((OcclusionSettings) this.instance).getModeValue();
            }

            public Builder setLongestExtentMax(float f) {
                copyOnWrite();
                ((OcclusionSettings) this.instance).setLongestExtentMax(f);
                return this;
            }

            public Builder setLongestExtentMin(float f) {
                copyOnWrite();
                ((OcclusionSettings) this.instance).setLongestExtentMin(f);
                return this;
            }

            public Builder setMode(Mode mode) {
                copyOnWrite();
                ((OcclusionSettings) this.instance).setMode(mode);
                return this;
            }

            public Builder setModeValue(int i) {
                copyOnWrite();
                ((OcclusionSettings) this.instance).setModeValue(i);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$OcclusionSettings$Mode */
        /* compiled from: PG */
        public enum Mode implements C62957cd {
            UNSPECIFIED(0),
            DISABLED(1),
            ENABLED(2),
            UNRECOGNIZED(-1);
            
            public static final int DISABLED_VALUE = 1;
            public static final int ENABLED_VALUE = 2;
            public static final int UNSPECIFIED_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47951l();
            }

            private Mode(int i) {
                this.value = i;
            }

            public static Mode forNumber(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return DISABLED;
                }
                if (i != 2) {
                    return null;
                }
                return ENABLED;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47952m.f124129a;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        static {
            OcclusionSettings occlusionSettings = new OcclusionSettings();
            DEFAULT_INSTANCE = occlusionSettings;
            C62942bv.registerDefaultInstance(OcclusionSettings.class, occlusionSettings);
        }

        private OcclusionSettings() {
        }

        /* access modifiers changed from: private */
        public void clearLongestExtentMax() {
            this.longestExtentMax_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearLongestExtentMin() {
            this.longestExtentMin_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearMode() {
            this.mode_ = 0;
        }

        public static OcclusionSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static OcclusionSettings parseDelimitedFrom(InputStream inputStream) {
            return (OcclusionSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OcclusionSettings parseFrom(C63088z zVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLongestExtentMax(float f) {
            this.longestExtentMax_ = f;
        }

        /* access modifiers changed from: private */
        public void setLongestExtentMin(float f) {
            this.longestExtentMin_ = f;
        }

        /* access modifiers changed from: private */
        public void setMode(Mode mode) {
            this.mode_ = mode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setModeValue(int i) {
            this.mode_ = i;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0001\u0003\u0001", new Object[]{"mode_", "longestExtentMax_", "longestExtentMin_"});
                case 3:
                    return new OcclusionSettings();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (OcclusionSettings.class) {
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

        public float getLongestExtentMax() {
            return this.longestExtentMax_;
        }

        public float getLongestExtentMin() {
            return this.longestExtentMin_;
        }

        public Mode getMode() {
            Mode forNumber = Mode.forNumber(this.mode_);
            return forNumber == null ? Mode.UNRECOGNIZED : forNumber;
        }

        public int getModeValue() {
            return this.mode_;
        }

        public static Builder newBuilder(OcclusionSettings occlusionSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(occlusionSettings);
        }

        public static OcclusionSettings parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (OcclusionSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static OcclusionSettings parseFrom(C63088z zVar, C62921ba baVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static OcclusionSettings parseFrom(C62897ae aeVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static OcclusionSettings parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static OcclusionSettings parseFrom(InputStream inputStream) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static OcclusionSettings parseFrom(InputStream inputStream, C62921ba baVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static OcclusionSettings parseFrom(ByteBuffer byteBuffer) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static OcclusionSettings parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static OcclusionSettings parseFrom(byte[] bArr) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static OcclusionSettings parseFrom(byte[] bArr, C62921ba baVar) {
            return (OcclusionSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$OcclusionSettingsOrBuilder */
    /* compiled from: PG */
    public interface OcclusionSettingsOrBuilder extends C63001dt {
        float getLongestExtentMax();

        float getLongestExtentMin();

        OcclusionSettings.Mode getMode();

        int getModeValue();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$Scaling */
    /* compiled from: PG */
    public enum Scaling implements C62957cd {
        AUTO(0),
        FIXED(1),
        UNRECOGNIZED(-1);
        
        public static final int AUTO_VALUE = 0;
        public static final int FIXED_VALUE = 1;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47953n();
        }

        private Scaling(int i) {
            this.value = i;
        }

        public static Scaling forNumber(int i) {
            if (i == 0) {
                return AUTO;
            }
            if (i != 1) {
                return null;
            }
            return FIXED;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47954o.f124130a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams */
    /* compiled from: PG */
    public final class SceneViewerParams extends C62942bv implements SceneViewerParamsOrBuilder {
        public static final int AUDIO_URL_FIELD_NUMBER = 3;
        public static final int AUTO_COLOR_HEX_FIELD_NUMBER = 22;
        public static final int BACKGROUND_SCENE_URI_FIELD_NUMBER = 28;
        public static final int CONTENT_URL_FIELD_NUMBER = 17;
        public static final int DATASET_PATH_FIELD_NUMBER = 19;
        /* access modifiers changed from: private */
        public static final SceneViewerParams DEFAULT_INSTANCE;
        public static final int DRACO_URL_FIELD_NUMBER = 4;
        public static final int DYNAMIC_RESOLUTION_SETTINGS_FIELD_NUMBER = 27;
        public static final int EMBEDDED_MODEL_FIELD_NUMBER = 21;
        public static final int IMAGE_BASED_LIGHTING_FIELD_NUMBER = 33;
        public static final int INITIAL_SCALE_FIELD_NUMBER = 23;
        public static final int IS_ADVANCED_RENDERING_DISABLED_FIELD_NUMBER = 10;
        public static final int IS_EASY_PLACEMENT_ENABLED_FIELD_NUMBER = 26;
        public static final int IS_OCCLUSION_ENABLED_FIELD_NUMBER = 11;
        public static final int IS_ROTATION_DISABLED_FIELD_NUMBER = 9;
        public static final int IS_SCALING_DISABLED_FIELD_NUMBER = 8;
        public static final int IS_SELF_SHADOWING_DISABLED_FIELD_NUMBER = 12;
        public static final int IS_SERVER_TOUCH_HANDLE_ENABLED_FIELD_NUMBER = 34;
        public static final int IS_VERTICAL_PLACEMENT_ENABLED_FIELD_NUMBER = 13;
        public static final int IS_VERTICAL_PLACEMENT_SNAP_BEHAVIOUR_ENABLED_FIELD_NUMBER = 24;
        public static final int LIGHTING_MODE_FIELD_NUMBER = 6;
        public static final int LINK_FIELD_NUMBER = 15;
        public static final int MODEL_URL_FIELD_NUMBER = 2;
        public static final int MODE_PREFERENCE_FIELD_NUMBER = 5;
        private static volatile C63010eb PARSER = null;
        public static final int PASSTHROUGH_FIELD_NUMBER = 36;
        public static final int REFERRER_FIELD_NUMBER = 18;
        public static final int SESSION_ID_FIELD_NUMBER = 20;
        public static final int SHARE_TEXT_FIELD_NUMBER = 16;
        public static final int STREAMING_API_KEY_FIELD_NUMBER = 29;
        public static final int STREAMING_MODE_FIELD_NUMBER = 7;
        public static final int STREAMING_SERVICE_ADDRESS_FIELD_NUMBER = 30;
        public static final int STREAMING_TEST_DRYRUN_FIELD_NUMBER = 31;
        public static final int STREAMING_TEST_MERGED_STREAM_FIELD_NUMBER = 32;
        public static final int SUBTITLE_FIELD_NUMBER = 35;
        public static final int TITLE_FIELD_NUMBER = 14;
        public static final int URL_STRING_FIELD_NUMBER = 1;
        public static final int VIDEO_URL_FIELD_NUMBER = 25;
        private String audioUrl_ = BuildConfig.FLAVOR;
        private String autoColorHex_ = BuildConfig.FLAVOR;
        private String backgroundSceneUri_ = BuildConfig.FLAVOR;
        private int bitField0_;
        private String contentUrl_ = BuildConfig.FLAVOR;
        private String datasetPath_ = BuildConfig.FLAVOR;
        private String dracoUrl_ = BuildConfig.FLAVOR;
        private DynamicResolutionSettings dynamicResolutionSettings_;
        private Embedded embeddedModel_;
        private int imageBasedLighting_;
        private InitialScale initialScale_;
        private boolean isAdvancedRenderingDisabled_;
        private boolean isEasyPlacementEnabled_;
        private boolean isOcclusionEnabled_;
        private boolean isRotationDisabled_;
        private boolean isScalingDisabled_;
        private boolean isSelfShadowingDisabled_;
        private boolean isServerTouchHandleEnabled_;
        private boolean isVerticalPlacementEnabled_;
        private boolean isVerticalPlacementSnapBehaviourEnabled_;
        private int lightingMode_;
        private String link_ = BuildConfig.FLAVOR;
        private int modePreference_;
        private String modelUrl_ = BuildConfig.FLAVOR;
        private String passthrough_ = BuildConfig.FLAVOR;
        private String referrer_ = BuildConfig.FLAVOR;
        private String sessionId_ = BuildConfig.FLAVOR;
        private String shareText_ = BuildConfig.FLAVOR;
        private String streamingApiKey_ = BuildConfig.FLAVOR;
        private int streamingMode_;
        private String streamingServiceAddress_ = BuildConfig.FLAVOR;
        private boolean streamingTestDryrun_;
        private boolean streamingTestMergedStream_;
        private String subtitle_ = BuildConfig.FLAVOR;
        private String title_ = BuildConfig.FLAVOR;
        private String urlString_ = BuildConfig.FLAVOR;
        private String videoUrl_ = BuildConfig.FLAVOR;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements SceneViewerParamsOrBuilder {
            private Builder() {
                super(SceneViewerParams.DEFAULT_INSTANCE);
            }

            public Builder clearAudioUrl() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearAudioUrl();
                return this;
            }

            public Builder clearAutoColorHex() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearAutoColorHex();
                return this;
            }

            public Builder clearBackgroundSceneUri() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearBackgroundSceneUri();
                return this;
            }

            public Builder clearContentUrl() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearContentUrl();
                return this;
            }

            public Builder clearDatasetPath() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearDatasetPath();
                return this;
            }

            public Builder clearDracoUrl() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearDracoUrl();
                return this;
            }

            public Builder clearDynamicResolutionSettings() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearDynamicResolutionSettings();
                return this;
            }

            public Builder clearEmbeddedModel() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearEmbeddedModel();
                return this;
            }

            public Builder clearImageBasedLighting() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearImageBasedLighting();
                return this;
            }

            public Builder clearInitialScale() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearInitialScale();
                return this;
            }

            public Builder clearIsAdvancedRenderingDisabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsAdvancedRenderingDisabled();
                return this;
            }

            public Builder clearIsEasyPlacementEnabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsEasyPlacementEnabled();
                return this;
            }

            public Builder clearIsOcclusionEnabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsOcclusionEnabled();
                return this;
            }

            public Builder clearIsRotationDisabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsRotationDisabled();
                return this;
            }

            public Builder clearIsScalingDisabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsScalingDisabled();
                return this;
            }

            public Builder clearIsSelfShadowingDisabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsSelfShadowingDisabled();
                return this;
            }

            public Builder clearIsServerTouchHandleEnabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsServerTouchHandleEnabled();
                return this;
            }

            public Builder clearIsVerticalPlacementEnabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsVerticalPlacementEnabled();
                return this;
            }

            public Builder clearIsVerticalPlacementSnapBehaviourEnabled() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearIsVerticalPlacementSnapBehaviourEnabled();
                return this;
            }

            public Builder clearLightingMode() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearLightingMode();
                return this;
            }

            public Builder clearLink() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearLink();
                return this;
            }

            public Builder clearModePreference() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearModePreference();
                return this;
            }

            public Builder clearModelUrl() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearModelUrl();
                return this;
            }

            public Builder clearPassthrough() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearPassthrough();
                return this;
            }

            public Builder clearReferrer() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearReferrer();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearSessionId();
                return this;
            }

            public Builder clearShareText() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearShareText();
                return this;
            }

            public Builder clearStreamingApiKey() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearStreamingApiKey();
                return this;
            }

            public Builder clearStreamingMode() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearStreamingMode();
                return this;
            }

            public Builder clearStreamingServiceAddress() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearStreamingServiceAddress();
                return this;
            }

            public Builder clearStreamingTestDryrun() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearStreamingTestDryrun();
                return this;
            }

            public Builder clearStreamingTestMergedStream() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearStreamingTestMergedStream();
                return this;
            }

            public Builder clearSubtitle() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearSubtitle();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearTitle();
                return this;
            }

            public Builder clearUrlString() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearUrlString();
                return this;
            }

            public Builder clearVideoUrl() {
                copyOnWrite();
                ((SceneViewerParams) this.instance).clearVideoUrl();
                return this;
            }

            public String getAudioUrl() {
                return ((SceneViewerParams) this.instance).getAudioUrl();
            }

            public C63088z getAudioUrlBytes() {
                return ((SceneViewerParams) this.instance).getAudioUrlBytes();
            }

            public String getAutoColorHex() {
                return ((SceneViewerParams) this.instance).getAutoColorHex();
            }

            public C63088z getAutoColorHexBytes() {
                return ((SceneViewerParams) this.instance).getAutoColorHexBytes();
            }

            public String getBackgroundSceneUri() {
                return ((SceneViewerParams) this.instance).getBackgroundSceneUri();
            }

            public C63088z getBackgroundSceneUriBytes() {
                return ((SceneViewerParams) this.instance).getBackgroundSceneUriBytes();
            }

            public String getContentUrl() {
                return ((SceneViewerParams) this.instance).getContentUrl();
            }

            public C63088z getContentUrlBytes() {
                return ((SceneViewerParams) this.instance).getContentUrlBytes();
            }

            public String getDatasetPath() {
                return ((SceneViewerParams) this.instance).getDatasetPath();
            }

            public C63088z getDatasetPathBytes() {
                return ((SceneViewerParams) this.instance).getDatasetPathBytes();
            }

            public String getDracoUrl() {
                return ((SceneViewerParams) this.instance).getDracoUrl();
            }

            public C63088z getDracoUrlBytes() {
                return ((SceneViewerParams) this.instance).getDracoUrlBytes();
            }

            public DynamicResolutionSettings getDynamicResolutionSettings() {
                return ((SceneViewerParams) this.instance).getDynamicResolutionSettings();
            }

            public Embedded getEmbeddedModel() {
                return ((SceneViewerParams) this.instance).getEmbeddedModel();
            }

            public ImageBasedLighting getImageBasedLighting() {
                return ((SceneViewerParams) this.instance).getImageBasedLighting();
            }

            public int getImageBasedLightingValue() {
                return ((SceneViewerParams) this.instance).getImageBasedLightingValue();
            }

            public InitialScale getInitialScale() {
                return ((SceneViewerParams) this.instance).getInitialScale();
            }

            public boolean getIsAdvancedRenderingDisabled() {
                return ((SceneViewerParams) this.instance).getIsAdvancedRenderingDisabled();
            }

            public boolean getIsEasyPlacementEnabled() {
                return ((SceneViewerParams) this.instance).getIsEasyPlacementEnabled();
            }

            public boolean getIsOcclusionEnabled() {
                return ((SceneViewerParams) this.instance).getIsOcclusionEnabled();
            }

            public boolean getIsRotationDisabled() {
                return ((SceneViewerParams) this.instance).getIsRotationDisabled();
            }

            public boolean getIsScalingDisabled() {
                return ((SceneViewerParams) this.instance).getIsScalingDisabled();
            }

            public boolean getIsSelfShadowingDisabled() {
                return ((SceneViewerParams) this.instance).getIsSelfShadowingDisabled();
            }

            public boolean getIsServerTouchHandleEnabled() {
                return ((SceneViewerParams) this.instance).getIsServerTouchHandleEnabled();
            }

            public boolean getIsVerticalPlacementEnabled() {
                return ((SceneViewerParams) this.instance).getIsVerticalPlacementEnabled();
            }

            public boolean getIsVerticalPlacementSnapBehaviourEnabled() {
                return ((SceneViewerParams) this.instance).getIsVerticalPlacementSnapBehaviourEnabled();
            }

            public LightingMode getLightingMode() {
                return ((SceneViewerParams) this.instance).getLightingMode();
            }

            public int getLightingModeValue() {
                return ((SceneViewerParams) this.instance).getLightingModeValue();
            }

            public String getLink() {
                return ((SceneViewerParams) this.instance).getLink();
            }

            public C63088z getLinkBytes() {
                return ((SceneViewerParams) this.instance).getLinkBytes();
            }

            public ModePreference getModePreference() {
                return ((SceneViewerParams) this.instance).getModePreference();
            }

            public int getModePreferenceValue() {
                return ((SceneViewerParams) this.instance).getModePreferenceValue();
            }

            public String getModelUrl() {
                return ((SceneViewerParams) this.instance).getModelUrl();
            }

            public C63088z getModelUrlBytes() {
                return ((SceneViewerParams) this.instance).getModelUrlBytes();
            }

            public String getPassthrough() {
                return ((SceneViewerParams) this.instance).getPassthrough();
            }

            public C63088z getPassthroughBytes() {
                return ((SceneViewerParams) this.instance).getPassthroughBytes();
            }

            public String getReferrer() {
                return ((SceneViewerParams) this.instance).getReferrer();
            }

            public C63088z getReferrerBytes() {
                return ((SceneViewerParams) this.instance).getReferrerBytes();
            }

            public String getSessionId() {
                return ((SceneViewerParams) this.instance).getSessionId();
            }

            public C63088z getSessionIdBytes() {
                return ((SceneViewerParams) this.instance).getSessionIdBytes();
            }

            public String getShareText() {
                return ((SceneViewerParams) this.instance).getShareText();
            }

            public C63088z getShareTextBytes() {
                return ((SceneViewerParams) this.instance).getShareTextBytes();
            }

            public String getStreamingApiKey() {
                return ((SceneViewerParams) this.instance).getStreamingApiKey();
            }

            public C63088z getStreamingApiKeyBytes() {
                return ((SceneViewerParams) this.instance).getStreamingApiKeyBytes();
            }

            public StreamingMode getStreamingMode() {
                return ((SceneViewerParams) this.instance).getStreamingMode();
            }

            public int getStreamingModeValue() {
                return ((SceneViewerParams) this.instance).getStreamingModeValue();
            }

            public String getStreamingServiceAddress() {
                return ((SceneViewerParams) this.instance).getStreamingServiceAddress();
            }

            public C63088z getStreamingServiceAddressBytes() {
                return ((SceneViewerParams) this.instance).getStreamingServiceAddressBytes();
            }

            public boolean getStreamingTestDryrun() {
                return ((SceneViewerParams) this.instance).getStreamingTestDryrun();
            }

            public boolean getStreamingTestMergedStream() {
                return ((SceneViewerParams) this.instance).getStreamingTestMergedStream();
            }

            public String getSubtitle() {
                return ((SceneViewerParams) this.instance).getSubtitle();
            }

            public C63088z getSubtitleBytes() {
                return ((SceneViewerParams) this.instance).getSubtitleBytes();
            }

            public String getTitle() {
                return ((SceneViewerParams) this.instance).getTitle();
            }

            public C63088z getTitleBytes() {
                return ((SceneViewerParams) this.instance).getTitleBytes();
            }

            public String getUrlString() {
                return ((SceneViewerParams) this.instance).getUrlString();
            }

            public C63088z getUrlStringBytes() {
                return ((SceneViewerParams) this.instance).getUrlStringBytes();
            }

            public String getVideoUrl() {
                return ((SceneViewerParams) this.instance).getVideoUrl();
            }

            public C63088z getVideoUrlBytes() {
                return ((SceneViewerParams) this.instance).getVideoUrlBytes();
            }

            public boolean hasAutoColorHex() {
                return ((SceneViewerParams) this.instance).hasAutoColorHex();
            }

            public boolean hasBackgroundSceneUri() {
                return ((SceneViewerParams) this.instance).hasBackgroundSceneUri();
            }

            public boolean hasDynamicResolutionSettings() {
                return ((SceneViewerParams) this.instance).hasDynamicResolutionSettings();
            }

            public boolean hasEmbeddedModel() {
                return ((SceneViewerParams) this.instance).hasEmbeddedModel();
            }

            public boolean hasInitialScale() {
                return ((SceneViewerParams) this.instance).hasInitialScale();
            }

            public boolean hasStreamingApiKey() {
                return ((SceneViewerParams) this.instance).hasStreamingApiKey();
            }

            public boolean hasStreamingServiceAddress() {
                return ((SceneViewerParams) this.instance).hasStreamingServiceAddress();
            }

            public boolean hasStreamingTestDryrun() {
                return ((SceneViewerParams) this.instance).hasStreamingTestDryrun();
            }

            public boolean hasStreamingTestMergedStream() {
                return ((SceneViewerParams) this.instance).hasStreamingTestMergedStream();
            }

            public Builder mergeDynamicResolutionSettings(DynamicResolutionSettings dynamicResolutionSettings) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).mergeDynamicResolutionSettings(dynamicResolutionSettings);
                return this;
            }

            public Builder mergeEmbeddedModel(Embedded embedded) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).mergeEmbeddedModel(embedded);
                return this;
            }

            public Builder mergeInitialScale(InitialScale initialScale) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).mergeInitialScale(initialScale);
                return this;
            }

            public Builder setAudioUrl(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setAudioUrl(str);
                return this;
            }

            public Builder setAudioUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setAudioUrlBytes(zVar);
                return this;
            }

            public Builder setAutoColorHex(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setAutoColorHex(str);
                return this;
            }

            public Builder setAutoColorHexBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setAutoColorHexBytes(zVar);
                return this;
            }

            public Builder setBackgroundSceneUri(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setBackgroundSceneUri(str);
                return this;
            }

            public Builder setBackgroundSceneUriBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setBackgroundSceneUriBytes(zVar);
                return this;
            }

            public Builder setContentUrl(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setContentUrl(str);
                return this;
            }

            public Builder setContentUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setContentUrlBytes(zVar);
                return this;
            }

            public Builder setDatasetPath(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setDatasetPath(str);
                return this;
            }

            public Builder setDatasetPathBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setDatasetPathBytes(zVar);
                return this;
            }

            public Builder setDracoUrl(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setDracoUrl(str);
                return this;
            }

            public Builder setDracoUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setDracoUrlBytes(zVar);
                return this;
            }

            public Builder setDynamicResolutionSettings(DynamicResolutionSettings.Builder builder) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setDynamicResolutionSettings((DynamicResolutionSettings) builder.build());
                return this;
            }

            public Builder setEmbeddedModel(Embedded.Builder builder) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setEmbeddedModel((Embedded) builder.build());
                return this;
            }

            public Builder setImageBasedLighting(ImageBasedLighting imageBasedLighting) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setImageBasedLighting(imageBasedLighting);
                return this;
            }

            public Builder setImageBasedLightingValue(int i) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setImageBasedLightingValue(i);
                return this;
            }

            public Builder setInitialScale(InitialScale.Builder builder) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setInitialScale((InitialScale) builder.build());
                return this;
            }

            public Builder setIsAdvancedRenderingDisabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsAdvancedRenderingDisabled(z);
                return this;
            }

            public Builder setIsEasyPlacementEnabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsEasyPlacementEnabled(z);
                return this;
            }

            public Builder setIsOcclusionEnabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsOcclusionEnabled(z);
                return this;
            }

            public Builder setIsRotationDisabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsRotationDisabled(z);
                return this;
            }

            public Builder setIsScalingDisabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsScalingDisabled(z);
                return this;
            }

            public Builder setIsSelfShadowingDisabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsSelfShadowingDisabled(z);
                return this;
            }

            public Builder setIsServerTouchHandleEnabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsServerTouchHandleEnabled(z);
                return this;
            }

            public Builder setIsVerticalPlacementEnabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsVerticalPlacementEnabled(z);
                return this;
            }

            public Builder setIsVerticalPlacementSnapBehaviourEnabled(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setIsVerticalPlacementSnapBehaviourEnabled(z);
                return this;
            }

            public Builder setLightingMode(LightingMode lightingMode) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setLightingMode(lightingMode);
                return this;
            }

            public Builder setLightingModeValue(int i) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setLightingModeValue(i);
                return this;
            }

            public Builder setLink(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setLink(str);
                return this;
            }

            public Builder setLinkBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setLinkBytes(zVar);
                return this;
            }

            public Builder setModePreference(ModePreference modePreference) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setModePreference(modePreference);
                return this;
            }

            public Builder setModePreferenceValue(int i) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setModePreferenceValue(i);
                return this;
            }

            public Builder setModelUrl(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setModelUrl(str);
                return this;
            }

            public Builder setModelUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setModelUrlBytes(zVar);
                return this;
            }

            public Builder setPassthrough(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setPassthrough(str);
                return this;
            }

            public Builder setPassthroughBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setPassthroughBytes(zVar);
                return this;
            }

            public Builder setReferrer(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setReferrer(str);
                return this;
            }

            public Builder setReferrerBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setReferrerBytes(zVar);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setSessionIdBytes(zVar);
                return this;
            }

            public Builder setShareText(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setShareText(str);
                return this;
            }

            public Builder setShareTextBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setShareTextBytes(zVar);
                return this;
            }

            public Builder setStreamingApiKey(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingApiKey(str);
                return this;
            }

            public Builder setStreamingApiKeyBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingApiKeyBytes(zVar);
                return this;
            }

            public Builder setStreamingMode(StreamingMode streamingMode) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingMode(streamingMode);
                return this;
            }

            public Builder setStreamingModeValue(int i) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingModeValue(i);
                return this;
            }

            public Builder setStreamingServiceAddress(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingServiceAddress(str);
                return this;
            }

            public Builder setStreamingServiceAddressBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingServiceAddressBytes(zVar);
                return this;
            }

            public Builder setStreamingTestDryrun(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingTestDryrun(z);
                return this;
            }

            public Builder setStreamingTestMergedStream(boolean z) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setStreamingTestMergedStream(z);
                return this;
            }

            public Builder setSubtitle(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setSubtitle(str);
                return this;
            }

            public Builder setSubtitleBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setSubtitleBytes(zVar);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setTitleBytes(zVar);
                return this;
            }

            public Builder setUrlString(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setUrlString(str);
                return this;
            }

            public Builder setUrlStringBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setUrlStringBytes(zVar);
                return this;
            }

            public Builder setVideoUrl(String str) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setVideoUrl(str);
                return this;
            }

            public Builder setVideoUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setVideoUrlBytes(zVar);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }

            public Builder setDynamicResolutionSettings(DynamicResolutionSettings dynamicResolutionSettings) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setDynamicResolutionSettings(dynamicResolutionSettings);
                return this;
            }

            public Builder setEmbeddedModel(Embedded embedded) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setEmbeddedModel(embedded);
                return this;
            }

            public Builder setInitialScale(InitialScale initialScale) {
                copyOnWrite();
                ((SceneViewerParams) this.instance).setInitialScale(initialScale);
                return this;
            }
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$Embedded */
        /* compiled from: PG */
        public final class Embedded extends C62942bv implements EmbeddedOrBuilder {
            public static final int CONJURED_ID_FIELD_NUMBER = 2;
            public static final int CONTENTS_FIELD_NUMBER = 3;
            /* access modifiers changed from: private */
            public static final Embedded DEFAULT_INSTANCE;
            public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
            private static volatile C63010eb PARSER;
            private String conjuredId_ = BuildConfig.FLAVOR;
            private C63088z contents_ = C63088z.f170246b;
            private String mediaType_ = BuildConfig.FLAVOR;

            /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$Embedded$Builder */
            /* compiled from: PG */
            public final class Builder extends C62934bn implements EmbeddedOrBuilder {
                private Builder() {
                    super(Embedded.DEFAULT_INSTANCE);
                }

                public Builder clearConjuredId() {
                    copyOnWrite();
                    ((Embedded) this.instance).clearConjuredId();
                    return this;
                }

                public Builder clearContents() {
                    copyOnWrite();
                    ((Embedded) this.instance).clearContents();
                    return this;
                }

                public Builder clearMediaType() {
                    copyOnWrite();
                    ((Embedded) this.instance).clearMediaType();
                    return this;
                }

                public String getConjuredId() {
                    return ((Embedded) this.instance).getConjuredId();
                }

                public C63088z getConjuredIdBytes() {
                    return ((Embedded) this.instance).getConjuredIdBytes();
                }

                public C63088z getContents() {
                    return ((Embedded) this.instance).getContents();
                }

                public String getMediaType() {
                    return ((Embedded) this.instance).getMediaType();
                }

                public C63088z getMediaTypeBytes() {
                    return ((Embedded) this.instance).getMediaTypeBytes();
                }

                public Builder setConjuredId(String str) {
                    copyOnWrite();
                    ((Embedded) this.instance).setConjuredId(str);
                    return this;
                }

                public Builder setConjuredIdBytes(C63088z zVar) {
                    copyOnWrite();
                    ((Embedded) this.instance).setConjuredIdBytes(zVar);
                    return this;
                }

                public Builder setContents(C63088z zVar) {
                    copyOnWrite();
                    ((Embedded) this.instance).setContents(zVar);
                    return this;
                }

                public Builder setMediaType(String str) {
                    copyOnWrite();
                    ((Embedded) this.instance).setMediaType(str);
                    return this;
                }

                public Builder setMediaTypeBytes(C63088z zVar) {
                    copyOnWrite();
                    ((Embedded) this.instance).setMediaTypeBytes(zVar);
                    return this;
                }

                public /* synthetic */ Builder(C47937a aVar) {
                    this();
                }
            }

            static {
                Embedded embedded = new Embedded();
                DEFAULT_INSTANCE = embedded;
                C62942bv.registerDefaultInstance(Embedded.class, embedded);
            }

            private Embedded() {
            }

            /* access modifiers changed from: private */
            public void clearConjuredId() {
                this.conjuredId_ = getDefaultInstance().getConjuredId();
            }

            /* access modifiers changed from: private */
            public void clearContents() {
                this.contents_ = getDefaultInstance().getContents();
            }

            /* access modifiers changed from: private */
            public void clearMediaType() {
                this.mediaType_ = getDefaultInstance().getMediaType();
            }

            public static Embedded getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Embedded parseDelimitedFrom(InputStream inputStream) {
                return (Embedded) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Embedded parseFrom(C63088z zVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
            }

            public static C63010eb parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setConjuredId(String str) {
                str.getClass();
                this.conjuredId_ = str;
            }

            /* access modifiers changed from: private */
            public void setConjuredIdBytes(C63088z zVar) {
                checkByteStringIsUtf8(zVar);
                this.conjuredId_ = zVar.mo59170I(C62972cr.f170009a);
            }

            /* access modifiers changed from: private */
            public void setContents(C63088z zVar) {
                zVar.getClass();
                this.contents_ = zVar;
            }

            /* access modifiers changed from: private */
            public void setMediaType(String str) {
                str.getClass();
                this.mediaType_ = str;
            }

            /* access modifiers changed from: private */
            public void setMediaTypeBytes(C63088z zVar) {
                checkByteStringIsUtf8(zVar);
                this.mediaType_ = zVar.mo59170I(C62972cr.f170009a);
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
                C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
                switch (buVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n", new Object[]{"mediaType_", "conjuredId_", "contents_"});
                    case 3:
                        return new Embedded();
                    case 4:
                        return new Builder((C47937a) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C63010eb ebVar = PARSER;
                        if (ebVar == null) {
                            synchronized (Embedded.class) {
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

            public String getConjuredId() {
                return this.conjuredId_;
            }

            public C63088z getConjuredIdBytes() {
                return C63088z.m96143E(this.conjuredId_);
            }

            public C63088z getContents() {
                return this.contents_;
            }

            public String getMediaType() {
                return this.mediaType_;
            }

            public C63088z getMediaTypeBytes() {
                return C63088z.m96143E(this.mediaType_);
            }

            public static Builder newBuilder(Embedded embedded) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(embedded);
            }

            public static Embedded parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
                return (Embedded) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
            }

            public static Embedded parseFrom(C63088z zVar, C62921ba baVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
            }

            public static Embedded parseFrom(C62897ae aeVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
            }

            public static Embedded parseFrom(C62897ae aeVar, C62921ba baVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
            }

            public static Embedded parseFrom(InputStream inputStream) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
            }

            public static Embedded parseFrom(InputStream inputStream, C62921ba baVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
            }

            public static Embedded parseFrom(ByteBuffer byteBuffer) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
            }

            public static Embedded parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
            }

            public static Embedded parseFrom(byte[] bArr) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
            }

            public static Embedded parseFrom(byte[] bArr, C62921ba baVar) {
                return (Embedded) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
            }
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$EmbeddedOrBuilder */
        /* compiled from: PG */
        public interface EmbeddedOrBuilder extends C63001dt {
            String getConjuredId();

            C63088z getConjuredIdBytes();

            C63088z getContents();

            String getMediaType();

            C63088z getMediaTypeBytes();
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$LightingMode */
        /* compiled from: PG */
        public enum LightingMode implements C62957cd {
            UNSPECIFIED_LIGHTING(0),
            AMBIENT_INTENSITY(1),
            ENVIRONMENTAL_HDR(2),
            UNRECOGNIZED(-1);
            
            public static final int AMBIENT_INTENSITY_VALUE = 1;
            public static final int ENVIRONMENTAL_HDR_VALUE = 2;
            public static final int UNSPECIFIED_LIGHTING_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47955p();
            }

            private LightingMode(int i) {
                this.value = i;
            }

            public static LightingMode forNumber(int i) {
                if (i == 0) {
                    return UNSPECIFIED_LIGHTING;
                }
                if (i == 1) {
                    return AMBIENT_INTENSITY;
                }
                if (i != 2) {
                    return null;
                }
                return ENVIRONMENTAL_HDR;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47956q.f124131a;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$ModePreference */
        /* compiled from: PG */
        public enum ModePreference implements C62957cd {
            UNSPECIFIED(0),
            AR_ONLY(1),
            AR_PREFERRED(2),
            THREED_ONLY(3),
            THREED_PREFERRED(4),
            SNAPSHOT(5),
            UNRECOGNIZED(-1);
            
            public static final int AR_ONLY_VALUE = 1;
            public static final int AR_PREFERRED_VALUE = 2;
            public static final int SNAPSHOT_VALUE = 5;
            public static final int THREED_ONLY_VALUE = 3;
            public static final int THREED_PREFERRED_VALUE = 4;
            public static final int UNSPECIFIED_VALUE = 0;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47957r();
            }

            private ModePreference(int i) {
                this.value = i;
            }

            public static ModePreference forNumber(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return AR_ONLY;
                }
                if (i == 2) {
                    return AR_PREFERRED;
                }
                if (i == 3) {
                    return THREED_ONLY;
                }
                if (i == 4) {
                    return THREED_PREFERRED;
                }
                if (i != 5) {
                    return null;
                }
                return SNAPSHOT;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47958s.f124132a;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParams$StreamingMode */
        /* compiled from: PG */
        public enum StreamingMode implements C62957cd {
            STREAMING_DISABLED(0),
            STREAMING_PREFERRED(1),
            UNRECOGNIZED(-1);
            
            public static final int STREAMING_DISABLED_VALUE = 0;
            public static final int STREAMING_PREFERRED_VALUE = 1;
            private static final C62958ce internalValueMap = null;
            private final int value;

            static {
                internalValueMap = new C47959t();
            }

            private StreamingMode(int i) {
                this.value = i;
            }

            public static StreamingMode forNumber(int i) {
                if (i == 0) {
                    return STREAMING_DISABLED;
                }
                if (i != 1) {
                    return null;
                }
                return STREAMING_PREFERRED;
            }

            public static C62958ce internalGetValueMap() {
                return internalValueMap;
            }

            public static C62959cf internalGetVerifier() {
                return C47960u.f124133a;
            }

            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final String toString() {
                return Integer.toString(getNumber());
            }
        }

        static {
            SceneViewerParams sceneViewerParams = new SceneViewerParams();
            DEFAULT_INSTANCE = sceneViewerParams;
            C62942bv.registerDefaultInstance(SceneViewerParams.class, sceneViewerParams);
        }

        private SceneViewerParams() {
        }

        /* access modifiers changed from: private */
        public void clearAudioUrl() {
            this.audioUrl_ = getDefaultInstance().getAudioUrl();
        }

        /* access modifiers changed from: private */
        public void clearAutoColorHex() {
            this.bitField0_ &= -3;
            this.autoColorHex_ = getDefaultInstance().getAutoColorHex();
        }

        /* access modifiers changed from: private */
        public void clearBackgroundSceneUri() {
            this.bitField0_ &= -17;
            this.backgroundSceneUri_ = getDefaultInstance().getBackgroundSceneUri();
        }

        /* access modifiers changed from: private */
        public void clearContentUrl() {
            this.contentUrl_ = getDefaultInstance().getContentUrl();
        }

        /* access modifiers changed from: private */
        public void clearDatasetPath() {
            this.datasetPath_ = getDefaultInstance().getDatasetPath();
        }

        /* access modifiers changed from: private */
        public void clearDracoUrl() {
            this.dracoUrl_ = getDefaultInstance().getDracoUrl();
        }

        /* access modifiers changed from: private */
        public void clearDynamicResolutionSettings() {
            this.dynamicResolutionSettings_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearEmbeddedModel() {
            this.embeddedModel_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearImageBasedLighting() {
            this.imageBasedLighting_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearInitialScale() {
            this.initialScale_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearIsAdvancedRenderingDisabled() {
            this.isAdvancedRenderingDisabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsEasyPlacementEnabled() {
            this.isEasyPlacementEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsOcclusionEnabled() {
            this.isOcclusionEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsRotationDisabled() {
            this.isRotationDisabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsScalingDisabled() {
            this.isScalingDisabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsSelfShadowingDisabled() {
            this.isSelfShadowingDisabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsServerTouchHandleEnabled() {
            this.isServerTouchHandleEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsVerticalPlacementEnabled() {
            this.isVerticalPlacementEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsVerticalPlacementSnapBehaviourEnabled() {
            this.isVerticalPlacementSnapBehaviourEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLightingMode() {
            this.lightingMode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLink() {
            this.link_ = getDefaultInstance().getLink();
        }

        /* access modifiers changed from: private */
        public void clearModePreference() {
            this.modePreference_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearModelUrl() {
            this.modelUrl_ = getDefaultInstance().getModelUrl();
        }

        /* access modifiers changed from: private */
        public void clearPassthrough() {
            this.passthrough_ = getDefaultInstance().getPassthrough();
        }

        /* access modifiers changed from: private */
        public void clearReferrer() {
            this.referrer_ = getDefaultInstance().getReferrer();
        }

        /* access modifiers changed from: private */
        public void clearSessionId() {
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        /* access modifiers changed from: private */
        public void clearShareText() {
            this.shareText_ = getDefaultInstance().getShareText();
        }

        /* access modifiers changed from: private */
        public void clearStreamingApiKey() {
            this.bitField0_ &= -33;
            this.streamingApiKey_ = getDefaultInstance().getStreamingApiKey();
        }

        /* access modifiers changed from: private */
        public void clearStreamingMode() {
            this.streamingMode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStreamingServiceAddress() {
            this.bitField0_ &= -65;
            this.streamingServiceAddress_ = getDefaultInstance().getStreamingServiceAddress();
        }

        /* access modifiers changed from: private */
        public void clearStreamingTestDryrun() {
            this.bitField0_ &= -129;
            this.streamingTestDryrun_ = false;
        }

        /* access modifiers changed from: private */
        public void clearStreamingTestMergedStream() {
            this.bitField0_ &= -257;
            this.streamingTestMergedStream_ = false;
        }

        /* access modifiers changed from: private */
        public void clearSubtitle() {
            this.subtitle_ = getDefaultInstance().getSubtitle();
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearUrlString() {
            this.urlString_ = getDefaultInstance().getUrlString();
        }

        /* access modifiers changed from: private */
        public void clearVideoUrl() {
            this.videoUrl_ = getDefaultInstance().getVideoUrl();
        }

        public static SceneViewerParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDynamicResolutionSettings(DynamicResolutionSettings dynamicResolutionSettings) {
            dynamicResolutionSettings.getClass();
            DynamicResolutionSettings dynamicResolutionSettings2 = this.dynamicResolutionSettings_;
            if (!(dynamicResolutionSettings2 == null || dynamicResolutionSettings2 == DynamicResolutionSettings.getDefaultInstance())) {
                DynamicResolutionSettings.Builder newBuilder = DynamicResolutionSettings.newBuilder(dynamicResolutionSettings2);
                newBuilder.mergeFrom(dynamicResolutionSettings);
                dynamicResolutionSettings = (DynamicResolutionSettings) newBuilder.buildPartial();
            }
            this.dynamicResolutionSettings_ = dynamicResolutionSettings;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeEmbeddedModel(Embedded embedded) {
            embedded.getClass();
            Embedded embedded2 = this.embeddedModel_;
            if (!(embedded2 == null || embedded2 == Embedded.getDefaultInstance())) {
                Embedded.Builder newBuilder = Embedded.newBuilder(embedded2);
                newBuilder.mergeFrom(embedded);
                embedded = (Embedded) newBuilder.buildPartial();
            }
            this.embeddedModel_ = embedded;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeInitialScale(InitialScale initialScale) {
            initialScale.getClass();
            InitialScale initialScale2 = this.initialScale_;
            if (!(initialScale2 == null || initialScale2 == InitialScale.getDefaultInstance())) {
                InitialScale.Builder newBuilder = InitialScale.newBuilder(initialScale2);
                newBuilder.mergeFrom(initialScale);
                initialScale = (InitialScale) newBuilder.buildPartial();
            }
            this.initialScale_ = initialScale;
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SceneViewerParams parseDelimitedFrom(InputStream inputStream) {
            return (SceneViewerParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SceneViewerParams parseFrom(C63088z zVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAudioUrl(String str) {
            str.getClass();
            this.audioUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setAudioUrlBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.audioUrl_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setAutoColorHex(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.autoColorHex_ = str;
        }

        /* access modifiers changed from: private */
        public void setAutoColorHexBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.autoColorHex_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setBackgroundSceneUri(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.backgroundSceneUri_ = str;
        }

        /* access modifiers changed from: private */
        public void setBackgroundSceneUriBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.backgroundSceneUri_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setContentUrl(String str) {
            str.getClass();
            this.contentUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setContentUrlBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.contentUrl_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setDatasetPath(String str) {
            str.getClass();
            this.datasetPath_ = str;
        }

        /* access modifiers changed from: private */
        public void setDatasetPathBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.datasetPath_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setDracoUrl(String str) {
            str.getClass();
            this.dracoUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setDracoUrlBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.dracoUrl_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setDynamicResolutionSettings(DynamicResolutionSettings dynamicResolutionSettings) {
            dynamicResolutionSettings.getClass();
            this.dynamicResolutionSettings_ = dynamicResolutionSettings;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setEmbeddedModel(Embedded embedded) {
            embedded.getClass();
            this.embeddedModel_ = embedded;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setImageBasedLighting(ImageBasedLighting imageBasedLighting) {
            this.imageBasedLighting_ = imageBasedLighting.getNumber();
        }

        /* access modifiers changed from: private */
        public void setImageBasedLightingValue(int i) {
            this.imageBasedLighting_ = i;
        }

        /* access modifiers changed from: private */
        public void setInitialScale(InitialScale initialScale) {
            initialScale.getClass();
            this.initialScale_ = initialScale;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setIsAdvancedRenderingDisabled(boolean z) {
            this.isAdvancedRenderingDisabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsEasyPlacementEnabled(boolean z) {
            this.isEasyPlacementEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsOcclusionEnabled(boolean z) {
            this.isOcclusionEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsRotationDisabled(boolean z) {
            this.isRotationDisabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsScalingDisabled(boolean z) {
            this.isScalingDisabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsSelfShadowingDisabled(boolean z) {
            this.isSelfShadowingDisabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsServerTouchHandleEnabled(boolean z) {
            this.isServerTouchHandleEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsVerticalPlacementEnabled(boolean z) {
            this.isVerticalPlacementEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsVerticalPlacementSnapBehaviourEnabled(boolean z) {
            this.isVerticalPlacementSnapBehaviourEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setLightingMode(LightingMode lightingMode) {
            this.lightingMode_ = lightingMode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setLightingModeValue(int i) {
            this.lightingMode_ = i;
        }

        /* access modifiers changed from: private */
        public void setLink(String str) {
            str.getClass();
            this.link_ = str;
        }

        /* access modifiers changed from: private */
        public void setLinkBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.link_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setModePreference(ModePreference modePreference) {
            this.modePreference_ = modePreference.getNumber();
        }

        /* access modifiers changed from: private */
        public void setModePreferenceValue(int i) {
            this.modePreference_ = i;
        }

        /* access modifiers changed from: private */
        public void setModelUrl(String str) {
            str.getClass();
            this.modelUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setModelUrlBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.modelUrl_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setPassthrough(String str) {
            str.getClass();
            this.passthrough_ = str;
        }

        /* access modifiers changed from: private */
        public void setPassthroughBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.passthrough_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setReferrer(String str) {
            str.getClass();
            this.referrer_ = str;
        }

        /* access modifiers changed from: private */
        public void setReferrerBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.referrer_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.sessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionIdBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.sessionId_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setShareText(String str) {
            str.getClass();
            this.shareText_ = str;
        }

        /* access modifiers changed from: private */
        public void setShareTextBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.shareText_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setStreamingApiKey(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.streamingApiKey_ = str;
        }

        /* access modifiers changed from: private */
        public void setStreamingApiKeyBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.streamingApiKey_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setStreamingMode(StreamingMode streamingMode) {
            this.streamingMode_ = streamingMode.getNumber();
        }

        /* access modifiers changed from: private */
        public void setStreamingModeValue(int i) {
            this.streamingMode_ = i;
        }

        /* access modifiers changed from: private */
        public void setStreamingServiceAddress(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.streamingServiceAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setStreamingServiceAddressBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.streamingServiceAddress_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setStreamingTestDryrun(boolean z) {
            this.bitField0_ |= 128;
            this.streamingTestDryrun_ = z;
        }

        /* access modifiers changed from: private */
        public void setStreamingTestMergedStream(boolean z) {
            this.bitField0_ |= 256;
            this.streamingTestMergedStream_ = z;
        }

        /* access modifiers changed from: private */
        public void setSubtitle(String str) {
            str.getClass();
            this.subtitle_ = str;
        }

        /* access modifiers changed from: private */
        public void setSubtitleBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.subtitle_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.title_ = str;
        }

        /* access modifiers changed from: private */
        public void setTitleBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.title_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setUrlString(String str) {
            str.getClass();
            this.urlString_ = str;
        }

        /* access modifiers changed from: private */
        public void setUrlStringBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.urlString_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setVideoUrl(String str) {
            str.getClass();
            this.videoUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setVideoUrlBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.videoUrl_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000$\u0000\u0001\u0001$$\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f\u0006\f\u0007\f\b\u0007\t\u0007\n\u0007\u000b\u0007\f\u0007\r\u0007\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015ဉ\u0000\u0016ለ\u0001\u0017ဉ\u0002\u0018\u0007\u0019Ȉ\u001a\u0007\u001bဉ\u0003\u001cለ\u0004\u001dለ\u0005\u001eለ\u0006\u001fဇ\u0007 ဇ\b!\f\"\u0007#Ȉ$Ȉ", new Object[]{"bitField0_", "urlString_", "modelUrl_", "audioUrl_", "dracoUrl_", "modePreference_", "lightingMode_", "streamingMode_", "isScalingDisabled_", "isRotationDisabled_", "isAdvancedRenderingDisabled_", "isOcclusionEnabled_", "isSelfShadowingDisabled_", "isVerticalPlacementEnabled_", "title_", "link_", "shareText_", "contentUrl_", "referrer_", "datasetPath_", "sessionId_", "embeddedModel_", "autoColorHex_", "initialScale_", "isVerticalPlacementSnapBehaviourEnabled_", "videoUrl_", "isEasyPlacementEnabled_", "dynamicResolutionSettings_", "backgroundSceneUri_", "streamingApiKey_", "streamingServiceAddress_", "streamingTestDryrun_", "streamingTestMergedStream_", "imageBasedLighting_", "isServerTouchHandleEnabled_", "subtitle_", "passthrough_"});
                case 3:
                    return new SceneViewerParams();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (SceneViewerParams.class) {
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

        public String getAudioUrl() {
            return this.audioUrl_;
        }

        public C63088z getAudioUrlBytes() {
            return C63088z.m96143E(this.audioUrl_);
        }

        public String getAutoColorHex() {
            return this.autoColorHex_;
        }

        public C63088z getAutoColorHexBytes() {
            return C63088z.m96143E(this.autoColorHex_);
        }

        public String getBackgroundSceneUri() {
            return this.backgroundSceneUri_;
        }

        public C63088z getBackgroundSceneUriBytes() {
            return C63088z.m96143E(this.backgroundSceneUri_);
        }

        public String getContentUrl() {
            return this.contentUrl_;
        }

        public C63088z getContentUrlBytes() {
            return C63088z.m96143E(this.contentUrl_);
        }

        public String getDatasetPath() {
            return this.datasetPath_;
        }

        public C63088z getDatasetPathBytes() {
            return C63088z.m96143E(this.datasetPath_);
        }

        public String getDracoUrl() {
            return this.dracoUrl_;
        }

        public C63088z getDracoUrlBytes() {
            return C63088z.m96143E(this.dracoUrl_);
        }

        public DynamicResolutionSettings getDynamicResolutionSettings() {
            DynamicResolutionSettings dynamicResolutionSettings = this.dynamicResolutionSettings_;
            return dynamicResolutionSettings == null ? DynamicResolutionSettings.getDefaultInstance() : dynamicResolutionSettings;
        }

        public Embedded getEmbeddedModel() {
            Embedded embedded = this.embeddedModel_;
            return embedded == null ? Embedded.getDefaultInstance() : embedded;
        }

        public ImageBasedLighting getImageBasedLighting() {
            ImageBasedLighting forNumber = ImageBasedLighting.forNumber(this.imageBasedLighting_);
            return forNumber == null ? ImageBasedLighting.UNRECOGNIZED : forNumber;
        }

        public int getImageBasedLightingValue() {
            return this.imageBasedLighting_;
        }

        public InitialScale getInitialScale() {
            InitialScale initialScale = this.initialScale_;
            return initialScale == null ? InitialScale.getDefaultInstance() : initialScale;
        }

        public boolean getIsAdvancedRenderingDisabled() {
            return this.isAdvancedRenderingDisabled_;
        }

        public boolean getIsEasyPlacementEnabled() {
            return this.isEasyPlacementEnabled_;
        }

        public boolean getIsOcclusionEnabled() {
            return this.isOcclusionEnabled_;
        }

        public boolean getIsRotationDisabled() {
            return this.isRotationDisabled_;
        }

        public boolean getIsScalingDisabled() {
            return this.isScalingDisabled_;
        }

        public boolean getIsSelfShadowingDisabled() {
            return this.isSelfShadowingDisabled_;
        }

        public boolean getIsServerTouchHandleEnabled() {
            return this.isServerTouchHandleEnabled_;
        }

        public boolean getIsVerticalPlacementEnabled() {
            return this.isVerticalPlacementEnabled_;
        }

        public boolean getIsVerticalPlacementSnapBehaviourEnabled() {
            return this.isVerticalPlacementSnapBehaviourEnabled_;
        }

        public LightingMode getLightingMode() {
            LightingMode forNumber = LightingMode.forNumber(this.lightingMode_);
            return forNumber == null ? LightingMode.UNRECOGNIZED : forNumber;
        }

        public int getLightingModeValue() {
            return this.lightingMode_;
        }

        public String getLink() {
            return this.link_;
        }

        public C63088z getLinkBytes() {
            return C63088z.m96143E(this.link_);
        }

        public ModePreference getModePreference() {
            ModePreference forNumber = ModePreference.forNumber(this.modePreference_);
            return forNumber == null ? ModePreference.UNRECOGNIZED : forNumber;
        }

        public int getModePreferenceValue() {
            return this.modePreference_;
        }

        public String getModelUrl() {
            return this.modelUrl_;
        }

        public C63088z getModelUrlBytes() {
            return C63088z.m96143E(this.modelUrl_);
        }

        public String getPassthrough() {
            return this.passthrough_;
        }

        public C63088z getPassthroughBytes() {
            return C63088z.m96143E(this.passthrough_);
        }

        public String getReferrer() {
            return this.referrer_;
        }

        public C63088z getReferrerBytes() {
            return C63088z.m96143E(this.referrer_);
        }

        public String getSessionId() {
            return this.sessionId_;
        }

        public C63088z getSessionIdBytes() {
            return C63088z.m96143E(this.sessionId_);
        }

        public String getShareText() {
            return this.shareText_;
        }

        public C63088z getShareTextBytes() {
            return C63088z.m96143E(this.shareText_);
        }

        public String getStreamingApiKey() {
            return this.streamingApiKey_;
        }

        public C63088z getStreamingApiKeyBytes() {
            return C63088z.m96143E(this.streamingApiKey_);
        }

        public StreamingMode getStreamingMode() {
            StreamingMode forNumber = StreamingMode.forNumber(this.streamingMode_);
            return forNumber == null ? StreamingMode.UNRECOGNIZED : forNumber;
        }

        public int getStreamingModeValue() {
            return this.streamingMode_;
        }

        public String getStreamingServiceAddress() {
            return this.streamingServiceAddress_;
        }

        public C63088z getStreamingServiceAddressBytes() {
            return C63088z.m96143E(this.streamingServiceAddress_);
        }

        public boolean getStreamingTestDryrun() {
            return this.streamingTestDryrun_;
        }

        public boolean getStreamingTestMergedStream() {
            return this.streamingTestMergedStream_;
        }

        public String getSubtitle() {
            return this.subtitle_;
        }

        public C63088z getSubtitleBytes() {
            return C63088z.m96143E(this.subtitle_);
        }

        public String getTitle() {
            return this.title_;
        }

        public C63088z getTitleBytes() {
            return C63088z.m96143E(this.title_);
        }

        public String getUrlString() {
            return this.urlString_;
        }

        public C63088z getUrlStringBytes() {
            return C63088z.m96143E(this.urlString_);
        }

        public String getVideoUrl() {
            return this.videoUrl_;
        }

        public C63088z getVideoUrlBytes() {
            return C63088z.m96143E(this.videoUrl_);
        }

        public boolean hasAutoColorHex() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasBackgroundSceneUri() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDynamicResolutionSettings() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasEmbeddedModel() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasInitialScale() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasStreamingApiKey() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasStreamingServiceAddress() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasStreamingTestDryrun() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasStreamingTestMergedStream() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(SceneViewerParams sceneViewerParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sceneViewerParams);
        }

        public static SceneViewerParams parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (SceneViewerParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SceneViewerParams parseFrom(C63088z zVar, C62921ba baVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static SceneViewerParams parseFrom(C62897ae aeVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static SceneViewerParams parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static SceneViewerParams parseFrom(InputStream inputStream) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static SceneViewerParams parseFrom(InputStream inputStream, C62921ba baVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SceneViewerParams parseFrom(ByteBuffer byteBuffer) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static SceneViewerParams parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static SceneViewerParams parseFrom(byte[] bArr) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static SceneViewerParams parseFrom(byte[] bArr, C62921ba baVar) {
            return (SceneViewerParams) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SceneViewerParamsOrBuilder */
    /* compiled from: PG */
    public interface SceneViewerParamsOrBuilder extends C63001dt {
        String getAudioUrl();

        C63088z getAudioUrlBytes();

        String getAutoColorHex();

        C63088z getAutoColorHexBytes();

        String getBackgroundSceneUri();

        C63088z getBackgroundSceneUriBytes();

        String getContentUrl();

        C63088z getContentUrlBytes();

        String getDatasetPath();

        C63088z getDatasetPathBytes();

        String getDracoUrl();

        C63088z getDracoUrlBytes();

        DynamicResolutionSettings getDynamicResolutionSettings();

        SceneViewerParams.Embedded getEmbeddedModel();

        ImageBasedLighting getImageBasedLighting();

        int getImageBasedLightingValue();

        InitialScale getInitialScale();

        boolean getIsAdvancedRenderingDisabled();

        boolean getIsEasyPlacementEnabled();

        boolean getIsOcclusionEnabled();

        boolean getIsRotationDisabled();

        boolean getIsScalingDisabled();

        boolean getIsSelfShadowingDisabled();

        boolean getIsServerTouchHandleEnabled();

        boolean getIsVerticalPlacementEnabled();

        boolean getIsVerticalPlacementSnapBehaviourEnabled();

        SceneViewerParams.LightingMode getLightingMode();

        int getLightingModeValue();

        String getLink();

        C63088z getLinkBytes();

        SceneViewerParams.ModePreference getModePreference();

        int getModePreferenceValue();

        String getModelUrl();

        C63088z getModelUrlBytes();

        String getPassthrough();

        C63088z getPassthroughBytes();

        String getReferrer();

        C63088z getReferrerBytes();

        String getSessionId();

        C63088z getSessionIdBytes();

        String getShareText();

        C63088z getShareTextBytes();

        String getStreamingApiKey();

        C63088z getStreamingApiKeyBytes();

        SceneViewerParams.StreamingMode getStreamingMode();

        int getStreamingModeValue();

        String getStreamingServiceAddress();

        C63088z getStreamingServiceAddressBytes();

        boolean getStreamingTestDryrun();

        boolean getStreamingTestMergedStream();

        String getSubtitle();

        C63088z getSubtitleBytes();

        String getTitle();

        C63088z getTitleBytes();

        String getUrlString();

        C63088z getUrlStringBytes();

        String getVideoUrl();

        C63088z getVideoUrlBytes();

        boolean hasAutoColorHex();

        boolean hasBackgroundSceneUri();

        boolean hasDynamicResolutionSettings();

        boolean hasEmbeddedModel();

        boolean hasInitialScale();

        boolean hasStreamingApiKey();

        boolean hasStreamingServiceAddress();

        boolean hasStreamingTestDryrun();

        boolean hasStreamingTestMergedStream();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SessionError */
    /* compiled from: PG */
    public enum SessionError implements C62957cd {
        ERROR_UNKNOWN(0),
        ERROR_AR_INITIALIZATION_FAILED(1),
        ERROR_ANCHOR_UNAVAILABLE(2),
        UNRECOGNIZED(-1);
        
        public static final int ERROR_ANCHOR_UNAVAILABLE_VALUE = 2;
        public static final int ERROR_AR_INITIALIZATION_FAILED_VALUE = 1;
        public static final int ERROR_UNKNOWN_VALUE = 0;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47961v();
        }

        private SessionError(int i) {
            this.value = i;
        }

        public static SessionError forNumber(int i) {
            if (i == 0) {
                return ERROR_UNKNOWN;
            }
            if (i == 1) {
                return ERROR_AR_INITIALIZATION_FAILED;
            }
            if (i != 2) {
                return null;
            }
            return ERROR_ANCHOR_UNAVAILABLE;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47962w.f124134a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$SnackbarMessage */
    /* compiled from: PG */
    public enum SnackbarMessage implements C62957cd {
        EMPTY(0),
        PLANE_FINDING(1),
        UNRECOGNIZED(-1);
        
        public static final int EMPTY_VALUE = 0;
        public static final int PLANE_FINDING_VALUE = 1;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47963x();
        }

        private SnackbarMessage(int i) {
            this.value = i;
        }

        public static SnackbarMessage forNumber(int i) {
            if (i == 0) {
                return EMPTY;
            }
            if (i != 1) {
                return null;
            }
            return PLANE_FINDING;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47964y.f124135a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$StreamingSettings */
    /* compiled from: PG */
    public final class StreamingSettings extends C62942bv implements StreamingSettingsOrBuilder {
        public static final int ACCOUNT_NAME_FIELD_NUMBER = 12;
        public static final int ACCOUNT_TOKEN_FIELD_NUMBER = 21;
        public static final int ALLOWED_API_KEYS_FIELD_NUMBER = 31;
        public static final int ALLOWED_DOMAINS_FIELD_NUMBER = 30;
        public static final int CODEC_FIELD_NUMBER = 7;
        public static final int CREATION_TIMEOUT_MS_FIELD_NUMBER = 20;
        /* access modifiers changed from: private */
        public static final StreamingSettings DEFAULT_INSTANCE;
        public static final int DISALLOWED_MODEL_TITLE_PATTERN_FIELD_NUMBER = 34;
        public static final int DISPLAY_TIMING_PARAMETERS_FIELD_NUMBER = 15;
        public static final int DYNAMIC_INFO_CARD_REFERRERS_FIELD_NUMBER = 29;
        public static final int ENABLE_LIGHTING_FIELD_NUMBER = 11;
        public static final int FALLBACK_ENABLED_FIELD_NUMBER = 13;
        public static final int HOTSPOTS_ENABLED_FIELD_NUMBER = 24;
        public static final int INFO_CARD_URI_FIELD_NUMBER = 33;
        public static final int LATEST_POSE_FIELD_NUMBER = 18;
        public static final int LOW_PERFORMANCE_MODE_FIELD_NUMBER = 10;
        public static final int MID_STREAM_DECISION_PARAMETERS_FIELD_NUMBER = 14;
        public static final int MIN_AR_CORE_VERSION_FIELD_NUMBER = 27;
        public static final int MODE_ALLOWED_FIELD_NUMBER = 1;
        public static final int MODE_FIELD_NUMBER = 32;
        private static volatile C63010eb PARSER = null;
        public static final int REFERRERS_FIELD_NUMBER = 28;
        public static final int SESSION_SERVICE_ADDRESS_FIELD_NUMBER = 3;
        public static final int SESSION_SERVICE_API_KEY_FIELD_NUMBER = 4;
        public static final int SIDE_CHANNEL_EVENT_ENABLED_FIELD_NUMBER = 37;
        public static final int STREAMING_TEST_CANCELLATION_ENABLED_FIELD_NUMBER = 16;
        public static final int TEST_DECISION_PARAMETERS_FIELD_NUMBER = 9;
        public static final int TEST_DECODING_WARMUP_FRAMES_FIELD_NUMBER = 23;
        public static final int TEST_DRYRUN_FIELD_NUMBER = 2;
        public static final int TEST_EVALUATION_DURATION_MS_FIELD_NUMBER = 22;
        public static final int TEST_MAX_DURATION_MS_FIELD_NUMBER = 8;
        public static final int TEST_RESULT_IGNORED_ON_DATA_LOSS_FIELD_NUMBER = 17;
        public static final int TEST_SESSION_SERVICE_ADDRESS_FIELD_NUMBER = 5;
        public static final int TEST_SESSION_SERVICE_API_KEY_FIELD_NUMBER = 6;
        public static final int TOUCH_EVENTS_ENABLED_FIELD_NUMBER = 26;
        public static final int USE_MERGED_API_FIELD_NUMBER = 19;
        public static final int USE_MERGED_STREAM_FIELD_NUMBER = 25;
        public static final int USE_MTLS_FIELD_NUMBER = 35;
        private String accountName_;
        private String accountToken_;
        private String allowedApiKeys_;
        private String allowedDomains_;
        private int bitField0_;
        private String codec_ = BuildConfig.FLAVOR;
        private long creationTimeoutMs_;
        private String disallowedModelTitlePattern_;
        private C63088z displayTimingParameters_;
        private String dynamicInfoCardReferrers_;
        private boolean enableLighting_;
        private boolean fallbackEnabled_;
        private boolean hotspotsEnabled_;
        private String infoCardUri_;
        private boolean latestPose_;
        private boolean lowPerformanceMode_;
        private C63088z midStreamDecisionParameters_;
        private int minArCoreVersion_;
        private boolean modeAllowed_;
        private int mode_;
        private String referrers_;
        private String sessionServiceAddress_ = BuildConfig.FLAVOR;
        private String sessionServiceApiKey_ = BuildConfig.FLAVOR;
        private boolean sideChannelEventEnabled_;
        private boolean streamingTestCancellationEnabled_;
        private C63088z testDecisionParameters_ = C63088z.f170246b;
        private long testDecodingWarmupFrames_;
        private boolean testDryrun_;
        private long testEvaluationDurationMs_;
        private long testMaxDurationMs_;
        private boolean testResultIgnoredOnDataLoss_;
        private String testSessionServiceAddress_ = BuildConfig.FLAVOR;
        private String testSessionServiceApiKey_ = BuildConfig.FLAVOR;
        private boolean touchEventsEnabled_;
        private boolean useMergedApi_;
        private boolean useMergedStream_;
        private boolean useMtls_;

        /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$StreamingSettings$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements StreamingSettingsOrBuilder {
            private Builder() {
                super(StreamingSettings.DEFAULT_INSTANCE);
            }

            public Builder clearAccountName() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearAccountName();
                return this;
            }

            public Builder clearAccountToken() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearAccountToken();
                return this;
            }

            public Builder clearAllowedApiKeys() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearAllowedApiKeys();
                return this;
            }

            public Builder clearAllowedDomains() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearAllowedDomains();
                return this;
            }

            public Builder clearCodec() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearCodec();
                return this;
            }

            public Builder clearCreationTimeoutMs() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearCreationTimeoutMs();
                return this;
            }

            public Builder clearDisallowedModelTitlePattern() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearDisallowedModelTitlePattern();
                return this;
            }

            public Builder clearDisplayTimingParameters() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearDisplayTimingParameters();
                return this;
            }

            public Builder clearDynamicInfoCardReferrers() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearDynamicInfoCardReferrers();
                return this;
            }

            public Builder clearEnableLighting() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearEnableLighting();
                return this;
            }

            public Builder clearFallbackEnabled() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearFallbackEnabled();
                return this;
            }

            public Builder clearHotspotsEnabled() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearHotspotsEnabled();
                return this;
            }

            public Builder clearInfoCardUri() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearInfoCardUri();
                return this;
            }

            public Builder clearLatestPose() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearLatestPose();
                return this;
            }

            public Builder clearLowPerformanceMode() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearLowPerformanceMode();
                return this;
            }

            public Builder clearMidStreamDecisionParameters() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearMidStreamDecisionParameters();
                return this;
            }

            public Builder clearMinArCoreVersion() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearMinArCoreVersion();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearMode();
                return this;
            }

            public Builder clearModeAllowed() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearModeAllowed();
                return this;
            }

            public Builder clearReferrers() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearReferrers();
                return this;
            }

            public Builder clearSessionServiceAddress() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearSessionServiceAddress();
                return this;
            }

            public Builder clearSessionServiceApiKey() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearSessionServiceApiKey();
                return this;
            }

            public Builder clearSideChannelEventEnabled() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearSideChannelEventEnabled();
                return this;
            }

            public Builder clearStreamingTestCancellationEnabled() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearStreamingTestCancellationEnabled();
                return this;
            }

            public Builder clearTestDecisionParameters() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestDecisionParameters();
                return this;
            }

            public Builder clearTestDecodingWarmupFrames() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestDecodingWarmupFrames();
                return this;
            }

            public Builder clearTestDryrun() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestDryrun();
                return this;
            }

            public Builder clearTestEvaluationDurationMs() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestEvaluationDurationMs();
                return this;
            }

            public Builder clearTestMaxDurationMs() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestMaxDurationMs();
                return this;
            }

            public Builder clearTestResultIgnoredOnDataLoss() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestResultIgnoredOnDataLoss();
                return this;
            }

            public Builder clearTestSessionServiceAddress() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestSessionServiceAddress();
                return this;
            }

            public Builder clearTestSessionServiceApiKey() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTestSessionServiceApiKey();
                return this;
            }

            public Builder clearTouchEventsEnabled() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearTouchEventsEnabled();
                return this;
            }

            public Builder clearUseMergedApi() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearUseMergedApi();
                return this;
            }

            public Builder clearUseMergedStream() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearUseMergedStream();
                return this;
            }

            public Builder clearUseMtls() {
                copyOnWrite();
                ((StreamingSettings) this.instance).clearUseMtls();
                return this;
            }

            public String getAccountName() {
                return ((StreamingSettings) this.instance).getAccountName();
            }

            public C63088z getAccountNameBytes() {
                return ((StreamingSettings) this.instance).getAccountNameBytes();
            }

            public String getAccountToken() {
                return ((StreamingSettings) this.instance).getAccountToken();
            }

            public C63088z getAccountTokenBytes() {
                return ((StreamingSettings) this.instance).getAccountTokenBytes();
            }

            public String getAllowedApiKeys() {
                return ((StreamingSettings) this.instance).getAllowedApiKeys();
            }

            public C63088z getAllowedApiKeysBytes() {
                return ((StreamingSettings) this.instance).getAllowedApiKeysBytes();
            }

            public String getAllowedDomains() {
                return ((StreamingSettings) this.instance).getAllowedDomains();
            }

            public C63088z getAllowedDomainsBytes() {
                return ((StreamingSettings) this.instance).getAllowedDomainsBytes();
            }

            public String getCodec() {
                return ((StreamingSettings) this.instance).getCodec();
            }

            public C63088z getCodecBytes() {
                return ((StreamingSettings) this.instance).getCodecBytes();
            }

            public long getCreationTimeoutMs() {
                return ((StreamingSettings) this.instance).getCreationTimeoutMs();
            }

            public String getDisallowedModelTitlePattern() {
                return ((StreamingSettings) this.instance).getDisallowedModelTitlePattern();
            }

            public C63088z getDisallowedModelTitlePatternBytes() {
                return ((StreamingSettings) this.instance).getDisallowedModelTitlePatternBytes();
            }

            public C63088z getDisplayTimingParameters() {
                return ((StreamingSettings) this.instance).getDisplayTimingParameters();
            }

            public String getDynamicInfoCardReferrers() {
                return ((StreamingSettings) this.instance).getDynamicInfoCardReferrers();
            }

            public C63088z getDynamicInfoCardReferrersBytes() {
                return ((StreamingSettings) this.instance).getDynamicInfoCardReferrersBytes();
            }

            public boolean getEnableLighting() {
                return ((StreamingSettings) this.instance).getEnableLighting();
            }

            public boolean getFallbackEnabled() {
                return ((StreamingSettings) this.instance).getFallbackEnabled();
            }

            public boolean getHotspotsEnabled() {
                return ((StreamingSettings) this.instance).getHotspotsEnabled();
            }

            public String getInfoCardUri() {
                return ((StreamingSettings) this.instance).getInfoCardUri();
            }

            public C63088z getInfoCardUriBytes() {
                return ((StreamingSettings) this.instance).getInfoCardUriBytes();
            }

            public boolean getLatestPose() {
                return ((StreamingSettings) this.instance).getLatestPose();
            }

            public boolean getLowPerformanceMode() {
                return ((StreamingSettings) this.instance).getLowPerformanceMode();
            }

            public C63088z getMidStreamDecisionParameters() {
                return ((StreamingSettings) this.instance).getMidStreamDecisionParameters();
            }

            public int getMinArCoreVersion() {
                return ((StreamingSettings) this.instance).getMinArCoreVersion();
            }

            public SceneViewerParams.StreamingMode getMode() {
                return ((StreamingSettings) this.instance).getMode();
            }

            public boolean getModeAllowed() {
                return ((StreamingSettings) this.instance).getModeAllowed();
            }

            public int getModeValue() {
                return ((StreamingSettings) this.instance).getModeValue();
            }

            public String getReferrers() {
                return ((StreamingSettings) this.instance).getReferrers();
            }

            public C63088z getReferrersBytes() {
                return ((StreamingSettings) this.instance).getReferrersBytes();
            }

            public String getSessionServiceAddress() {
                return ((StreamingSettings) this.instance).getSessionServiceAddress();
            }

            public C63088z getSessionServiceAddressBytes() {
                return ((StreamingSettings) this.instance).getSessionServiceAddressBytes();
            }

            public String getSessionServiceApiKey() {
                return ((StreamingSettings) this.instance).getSessionServiceApiKey();
            }

            public C63088z getSessionServiceApiKeyBytes() {
                return ((StreamingSettings) this.instance).getSessionServiceApiKeyBytes();
            }

            public boolean getSideChannelEventEnabled() {
                return ((StreamingSettings) this.instance).getSideChannelEventEnabled();
            }

            public boolean getStreamingTestCancellationEnabled() {
                return ((StreamingSettings) this.instance).getStreamingTestCancellationEnabled();
            }

            public C63088z getTestDecisionParameters() {
                return ((StreamingSettings) this.instance).getTestDecisionParameters();
            }

            public long getTestDecodingWarmupFrames() {
                return ((StreamingSettings) this.instance).getTestDecodingWarmupFrames();
            }

            public boolean getTestDryrun() {
                return ((StreamingSettings) this.instance).getTestDryrun();
            }

            public long getTestEvaluationDurationMs() {
                return ((StreamingSettings) this.instance).getTestEvaluationDurationMs();
            }

            public long getTestMaxDurationMs() {
                return ((StreamingSettings) this.instance).getTestMaxDurationMs();
            }

            public boolean getTestResultIgnoredOnDataLoss() {
                return ((StreamingSettings) this.instance).getTestResultIgnoredOnDataLoss();
            }

            public String getTestSessionServiceAddress() {
                return ((StreamingSettings) this.instance).getTestSessionServiceAddress();
            }

            public C63088z getTestSessionServiceAddressBytes() {
                return ((StreamingSettings) this.instance).getTestSessionServiceAddressBytes();
            }

            public String getTestSessionServiceApiKey() {
                return ((StreamingSettings) this.instance).getTestSessionServiceApiKey();
            }

            public C63088z getTestSessionServiceApiKeyBytes() {
                return ((StreamingSettings) this.instance).getTestSessionServiceApiKeyBytes();
            }

            public boolean getTouchEventsEnabled() {
                return ((StreamingSettings) this.instance).getTouchEventsEnabled();
            }

            public boolean getUseMergedApi() {
                return ((StreamingSettings) this.instance).getUseMergedApi();
            }

            public boolean getUseMergedStream() {
                return ((StreamingSettings) this.instance).getUseMergedStream();
            }

            public boolean getUseMtls() {
                return ((StreamingSettings) this.instance).getUseMtls();
            }

            public boolean hasDisallowedModelTitlePattern() {
                return ((StreamingSettings) this.instance).hasDisallowedModelTitlePattern();
            }

            public boolean hasDisplayTimingParameters() {
                return ((StreamingSettings) this.instance).hasDisplayTimingParameters();
            }

            public boolean hasInfoCardUri() {
                return ((StreamingSettings) this.instance).hasInfoCardUri();
            }

            public boolean hasMidStreamDecisionParameters() {
                return ((StreamingSettings) this.instance).hasMidStreamDecisionParameters();
            }

            public boolean hasMode() {
                return ((StreamingSettings) this.instance).hasMode();
            }

            public boolean hasTestDecisionParameters() {
                return ((StreamingSettings) this.instance).hasTestDecisionParameters();
            }

            public Builder setAccountName(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAccountName(str);
                return this;
            }

            public Builder setAccountNameBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAccountNameBytes(zVar);
                return this;
            }

            public Builder setAccountToken(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAccountToken(str);
                return this;
            }

            public Builder setAccountTokenBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAccountTokenBytes(zVar);
                return this;
            }

            public Builder setAllowedApiKeys(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAllowedApiKeys(str);
                return this;
            }

            public Builder setAllowedApiKeysBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAllowedApiKeysBytes(zVar);
                return this;
            }

            public Builder setAllowedDomains(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAllowedDomains(str);
                return this;
            }

            public Builder setAllowedDomainsBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setAllowedDomainsBytes(zVar);
                return this;
            }

            public Builder setCodec(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setCodec(str);
                return this;
            }

            public Builder setCodecBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setCodecBytes(zVar);
                return this;
            }

            public Builder setCreationTimeoutMs(long j) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setCreationTimeoutMs(j);
                return this;
            }

            public Builder setDisallowedModelTitlePattern(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setDisallowedModelTitlePattern(str);
                return this;
            }

            public Builder setDisallowedModelTitlePatternBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setDisallowedModelTitlePatternBytes(zVar);
                return this;
            }

            public Builder setDisplayTimingParameters(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setDisplayTimingParameters(zVar);
                return this;
            }

            public Builder setDynamicInfoCardReferrers(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setDynamicInfoCardReferrers(str);
                return this;
            }

            public Builder setDynamicInfoCardReferrersBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setDynamicInfoCardReferrersBytes(zVar);
                return this;
            }

            public Builder setEnableLighting(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setEnableLighting(z);
                return this;
            }

            public Builder setFallbackEnabled(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setFallbackEnabled(z);
                return this;
            }

            public Builder setHotspotsEnabled(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setHotspotsEnabled(z);
                return this;
            }

            public Builder setInfoCardUri(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setInfoCardUri(str);
                return this;
            }

            public Builder setInfoCardUriBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setInfoCardUriBytes(zVar);
                return this;
            }

            public Builder setLatestPose(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setLatestPose(z);
                return this;
            }

            public Builder setLowPerformanceMode(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setLowPerformanceMode(z);
                return this;
            }

            public Builder setMidStreamDecisionParameters(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setMidStreamDecisionParameters(zVar);
                return this;
            }

            public Builder setMinArCoreVersion(int i) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setMinArCoreVersion(i);
                return this;
            }

            public Builder setMode(SceneViewerParams.StreamingMode streamingMode) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setMode(streamingMode);
                return this;
            }

            public Builder setModeAllowed(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setModeAllowed(z);
                return this;
            }

            public Builder setModeValue(int i) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setModeValue(i);
                return this;
            }

            public Builder setReferrers(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setReferrers(str);
                return this;
            }

            public Builder setReferrersBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setReferrersBytes(zVar);
                return this;
            }

            public Builder setSessionServiceAddress(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setSessionServiceAddress(str);
                return this;
            }

            public Builder setSessionServiceAddressBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setSessionServiceAddressBytes(zVar);
                return this;
            }

            public Builder setSessionServiceApiKey(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setSessionServiceApiKey(str);
                return this;
            }

            public Builder setSessionServiceApiKeyBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setSessionServiceApiKeyBytes(zVar);
                return this;
            }

            public Builder setSideChannelEventEnabled(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setSideChannelEventEnabled(z);
                return this;
            }

            public Builder setStreamingTestCancellationEnabled(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setStreamingTestCancellationEnabled(z);
                return this;
            }

            public Builder setTestDecisionParameters(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestDecisionParameters(zVar);
                return this;
            }

            public Builder setTestDecodingWarmupFrames(long j) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestDecodingWarmupFrames(j);
                return this;
            }

            public Builder setTestDryrun(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestDryrun(z);
                return this;
            }

            public Builder setTestEvaluationDurationMs(long j) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestEvaluationDurationMs(j);
                return this;
            }

            public Builder setTestMaxDurationMs(long j) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestMaxDurationMs(j);
                return this;
            }

            public Builder setTestResultIgnoredOnDataLoss(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestResultIgnoredOnDataLoss(z);
                return this;
            }

            public Builder setTestSessionServiceAddress(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestSessionServiceAddress(str);
                return this;
            }

            public Builder setTestSessionServiceAddressBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestSessionServiceAddressBytes(zVar);
                return this;
            }

            public Builder setTestSessionServiceApiKey(String str) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestSessionServiceApiKey(str);
                return this;
            }

            public Builder setTestSessionServiceApiKeyBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTestSessionServiceApiKeyBytes(zVar);
                return this;
            }

            public Builder setTouchEventsEnabled(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setTouchEventsEnabled(z);
                return this;
            }

            public Builder setUseMergedApi(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setUseMergedApi(z);
                return this;
            }

            public Builder setUseMergedStream(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setUseMergedStream(z);
                return this;
            }

            public Builder setUseMtls(boolean z) {
                copyOnWrite();
                ((StreamingSettings) this.instance).setUseMtls(z);
                return this;
            }

            public /* synthetic */ Builder(C47937a aVar) {
                this();
            }
        }

        static {
            StreamingSettings streamingSettings = new StreamingSettings();
            DEFAULT_INSTANCE = streamingSettings;
            C62942bv.registerDefaultInstance(StreamingSettings.class, streamingSettings);
        }

        private StreamingSettings() {
            C63088z zVar = C63088z.f170246b;
            this.midStreamDecisionParameters_ = zVar;
            this.displayTimingParameters_ = zVar;
            this.accountName_ = BuildConfig.FLAVOR;
            this.accountToken_ = BuildConfig.FLAVOR;
            this.referrers_ = BuildConfig.FLAVOR;
            this.dynamicInfoCardReferrers_ = BuildConfig.FLAVOR;
            this.allowedDomains_ = BuildConfig.FLAVOR;
            this.allowedApiKeys_ = BuildConfig.FLAVOR;
            this.infoCardUri_ = BuildConfig.FLAVOR;
            this.disallowedModelTitlePattern_ = BuildConfig.FLAVOR;
        }

        /* access modifiers changed from: private */
        public void clearAccountName() {
            this.accountName_ = getDefaultInstance().getAccountName();
        }

        /* access modifiers changed from: private */
        public void clearAccountToken() {
            this.accountToken_ = getDefaultInstance().getAccountToken();
        }

        /* access modifiers changed from: private */
        public void clearAllowedApiKeys() {
            this.allowedApiKeys_ = getDefaultInstance().getAllowedApiKeys();
        }

        /* access modifiers changed from: private */
        public void clearAllowedDomains() {
            this.allowedDomains_ = getDefaultInstance().getAllowedDomains();
        }

        /* access modifiers changed from: private */
        public void clearCodec() {
            this.codec_ = getDefaultInstance().getCodec();
        }

        /* access modifiers changed from: private */
        public void clearCreationTimeoutMs() {
            this.creationTimeoutMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDisallowedModelTitlePattern() {
            this.bitField0_ &= -33;
            this.disallowedModelTitlePattern_ = getDefaultInstance().getDisallowedModelTitlePattern();
        }

        /* access modifiers changed from: private */
        public void clearDisplayTimingParameters() {
            this.bitField0_ &= -5;
            this.displayTimingParameters_ = getDefaultInstance().getDisplayTimingParameters();
        }

        /* access modifiers changed from: private */
        public void clearDynamicInfoCardReferrers() {
            this.dynamicInfoCardReferrers_ = getDefaultInstance().getDynamicInfoCardReferrers();
        }

        /* access modifiers changed from: private */
        public void clearEnableLighting() {
            this.enableLighting_ = false;
        }

        /* access modifiers changed from: private */
        public void clearFallbackEnabled() {
            this.fallbackEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearHotspotsEnabled() {
            this.hotspotsEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearInfoCardUri() {
            this.bitField0_ &= -17;
            this.infoCardUri_ = getDefaultInstance().getInfoCardUri();
        }

        /* access modifiers changed from: private */
        public void clearLatestPose() {
            this.latestPose_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLowPerformanceMode() {
            this.lowPerformanceMode_ = false;
        }

        /* access modifiers changed from: private */
        public void clearMidStreamDecisionParameters() {
            this.bitField0_ &= -3;
            this.midStreamDecisionParameters_ = getDefaultInstance().getMidStreamDecisionParameters();
        }

        /* access modifiers changed from: private */
        public void clearMinArCoreVersion() {
            this.minArCoreVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMode() {
            this.bitField0_ &= -9;
            this.mode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearModeAllowed() {
            this.modeAllowed_ = false;
        }

        /* access modifiers changed from: private */
        public void clearReferrers() {
            this.referrers_ = getDefaultInstance().getReferrers();
        }

        /* access modifiers changed from: private */
        public void clearSessionServiceAddress() {
            this.sessionServiceAddress_ = getDefaultInstance().getSessionServiceAddress();
        }

        /* access modifiers changed from: private */
        public void clearSessionServiceApiKey() {
            this.sessionServiceApiKey_ = getDefaultInstance().getSessionServiceApiKey();
        }

        /* access modifiers changed from: private */
        public void clearSideChannelEventEnabled() {
            this.sideChannelEventEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearStreamingTestCancellationEnabled() {
            this.streamingTestCancellationEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearTestDecisionParameters() {
            this.bitField0_ &= -2;
            this.testDecisionParameters_ = getDefaultInstance().getTestDecisionParameters();
        }

        /* access modifiers changed from: private */
        public void clearTestDecodingWarmupFrames() {
            this.testDecodingWarmupFrames_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTestDryrun() {
            this.testDryrun_ = false;
        }

        /* access modifiers changed from: private */
        public void clearTestEvaluationDurationMs() {
            this.testEvaluationDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTestMaxDurationMs() {
            this.testMaxDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTestResultIgnoredOnDataLoss() {
            this.testResultIgnoredOnDataLoss_ = false;
        }

        /* access modifiers changed from: private */
        public void clearTestSessionServiceAddress() {
            this.testSessionServiceAddress_ = getDefaultInstance().getTestSessionServiceAddress();
        }

        /* access modifiers changed from: private */
        public void clearTestSessionServiceApiKey() {
            this.testSessionServiceApiKey_ = getDefaultInstance().getTestSessionServiceApiKey();
        }

        /* access modifiers changed from: private */
        public void clearTouchEventsEnabled() {
            this.touchEventsEnabled_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUseMergedApi() {
            this.useMergedApi_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUseMergedStream() {
            this.useMergedStream_ = false;
        }

        /* access modifiers changed from: private */
        public void clearUseMtls() {
            this.useMtls_ = false;
        }

        public static StreamingSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StreamingSettings parseDelimitedFrom(InputStream inputStream) {
            return (StreamingSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StreamingSettings parseFrom(C63088z zVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAccountName(String str) {
            str.getClass();
            this.accountName_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountNameBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.accountName_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setAccountToken(String str) {
            str.getClass();
            this.accountToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setAccountTokenBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.accountToken_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setAllowedApiKeys(String str) {
            str.getClass();
            this.allowedApiKeys_ = str;
        }

        /* access modifiers changed from: private */
        public void setAllowedApiKeysBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.allowedApiKeys_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setAllowedDomains(String str) {
            str.getClass();
            this.allowedDomains_ = str;
        }

        /* access modifiers changed from: private */
        public void setAllowedDomainsBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.allowedDomains_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setCodec(String str) {
            str.getClass();
            this.codec_ = str;
        }

        /* access modifiers changed from: private */
        public void setCodecBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.codec_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setCreationTimeoutMs(long j) {
            this.creationTimeoutMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setDisallowedModelTitlePattern(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.disallowedModelTitlePattern_ = str;
        }

        /* access modifiers changed from: private */
        public void setDisallowedModelTitlePatternBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.disallowedModelTitlePattern_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setDisplayTimingParameters(C63088z zVar) {
            zVar.getClass();
            this.bitField0_ |= 4;
            this.displayTimingParameters_ = zVar;
        }

        /* access modifiers changed from: private */
        public void setDynamicInfoCardReferrers(String str) {
            str.getClass();
            this.dynamicInfoCardReferrers_ = str;
        }

        /* access modifiers changed from: private */
        public void setDynamicInfoCardReferrersBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.dynamicInfoCardReferrers_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setEnableLighting(boolean z) {
            this.enableLighting_ = z;
        }

        /* access modifiers changed from: private */
        public void setFallbackEnabled(boolean z) {
            this.fallbackEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setHotspotsEnabled(boolean z) {
            this.hotspotsEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setInfoCardUri(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.infoCardUri_ = str;
        }

        /* access modifiers changed from: private */
        public void setInfoCardUriBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.infoCardUri_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setLatestPose(boolean z) {
            this.latestPose_ = z;
        }

        /* access modifiers changed from: private */
        public void setLowPerformanceMode(boolean z) {
            this.lowPerformanceMode_ = z;
        }

        /* access modifiers changed from: private */
        public void setMidStreamDecisionParameters(C63088z zVar) {
            zVar.getClass();
            this.bitField0_ |= 2;
            this.midStreamDecisionParameters_ = zVar;
        }

        /* access modifiers changed from: private */
        public void setMinArCoreVersion(int i) {
            this.minArCoreVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setMode(SceneViewerParams.StreamingMode streamingMode) {
            this.mode_ = streamingMode.getNumber();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setModeAllowed(boolean z) {
            this.modeAllowed_ = z;
        }

        /* access modifiers changed from: private */
        public void setModeValue(int i) {
            this.bitField0_ |= 8;
            this.mode_ = i;
        }

        /* access modifiers changed from: private */
        public void setReferrers(String str) {
            str.getClass();
            this.referrers_ = str;
        }

        /* access modifiers changed from: private */
        public void setReferrersBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.referrers_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setSessionServiceAddress(String str) {
            str.getClass();
            this.sessionServiceAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionServiceAddressBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.sessionServiceAddress_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setSessionServiceApiKey(String str) {
            str.getClass();
            this.sessionServiceApiKey_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionServiceApiKeyBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.sessionServiceApiKey_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setSideChannelEventEnabled(boolean z) {
            this.sideChannelEventEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setStreamingTestCancellationEnabled(boolean z) {
            this.streamingTestCancellationEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setTestDecisionParameters(C63088z zVar) {
            zVar.getClass();
            this.bitField0_ |= 1;
            this.testDecisionParameters_ = zVar;
        }

        /* access modifiers changed from: private */
        public void setTestDecodingWarmupFrames(long j) {
            this.testDecodingWarmupFrames_ = j;
        }

        /* access modifiers changed from: private */
        public void setTestDryrun(boolean z) {
            this.testDryrun_ = z;
        }

        /* access modifiers changed from: private */
        public void setTestEvaluationDurationMs(long j) {
            this.testEvaluationDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setTestMaxDurationMs(long j) {
            this.testMaxDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setTestResultIgnoredOnDataLoss(boolean z) {
            this.testResultIgnoredOnDataLoss_ = z;
        }

        /* access modifiers changed from: private */
        public void setTestSessionServiceAddress(String str) {
            str.getClass();
            this.testSessionServiceAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setTestSessionServiceAddressBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.testSessionServiceAddress_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setTestSessionServiceApiKey(String str) {
            str.getClass();
            this.testSessionServiceApiKey_ = str;
        }

        /* access modifiers changed from: private */
        public void setTestSessionServiceApiKeyBytes(C63088z zVar) {
            checkByteStringIsUtf8(zVar);
            this.testSessionServiceApiKey_ = zVar.mo59170I(C62972cr.f170009a);
        }

        /* access modifiers changed from: private */
        public void setTouchEventsEnabled(boolean z) {
            this.touchEventsEnabled_ = z;
        }

        /* access modifiers changed from: private */
        public void setUseMergedApi(boolean z) {
            this.useMergedApi_ = z;
        }

        /* access modifiers changed from: private */
        public void setUseMergedStream(boolean z) {
            this.useMergedStream_ = z;
        }

        /* access modifiers changed from: private */
        public void setUseMtls(boolean z) {
            this.useMtls_ = z;
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
            C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
            switch (buVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000$\u0000\u0001\u0001%$\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0002\tည\u0000\n\u0007\u000b\u0007\fȈ\r\u0007\u000eည\u0001\u000fည\u0002\u0010\u0007\u0011\u0007\u0012\u0007\u0013\u0007\u0014\u0002\u0015Ȉ\u0016\u0002\u0017\u0002\u0018\u0007\u0019\u0007\u001a\u0007\u001b\u0004\u001cȈ\u001dȈ\u001eȈ\u001fȈ ဌ\u0003!ለ\u0004\"ለ\u0005#\u0007%\u0007", new Object[]{"bitField0_", "modeAllowed_", "testDryrun_", "sessionServiceAddress_", "sessionServiceApiKey_", "testSessionServiceAddress_", "testSessionServiceApiKey_", "codec_", "testMaxDurationMs_", "testDecisionParameters_", "lowPerformanceMode_", "enableLighting_", "accountName_", "fallbackEnabled_", "midStreamDecisionParameters_", "displayTimingParameters_", "streamingTestCancellationEnabled_", "testResultIgnoredOnDataLoss_", "latestPose_", "useMergedApi_", "creationTimeoutMs_", "accountToken_", "testEvaluationDurationMs_", "testDecodingWarmupFrames_", "hotspotsEnabled_", "useMergedStream_", "touchEventsEnabled_", "minArCoreVersion_", "referrers_", "dynamicInfoCardReferrers_", "allowedDomains_", "allowedApiKeys_", "mode_", "infoCardUri_", "disallowedModelTitlePattern_", "useMtls_", "sideChannelEventEnabled_"});
                case 3:
                    return new StreamingSettings();
                case 4:
                    return new Builder((C47937a) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (StreamingSettings.class) {
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

        public String getAccountName() {
            return this.accountName_;
        }

        public C63088z getAccountNameBytes() {
            return C63088z.m96143E(this.accountName_);
        }

        public String getAccountToken() {
            return this.accountToken_;
        }

        public C63088z getAccountTokenBytes() {
            return C63088z.m96143E(this.accountToken_);
        }

        public String getAllowedApiKeys() {
            return this.allowedApiKeys_;
        }

        public C63088z getAllowedApiKeysBytes() {
            return C63088z.m96143E(this.allowedApiKeys_);
        }

        public String getAllowedDomains() {
            return this.allowedDomains_;
        }

        public C63088z getAllowedDomainsBytes() {
            return C63088z.m96143E(this.allowedDomains_);
        }

        public String getCodec() {
            return this.codec_;
        }

        public C63088z getCodecBytes() {
            return C63088z.m96143E(this.codec_);
        }

        public long getCreationTimeoutMs() {
            return this.creationTimeoutMs_;
        }

        public String getDisallowedModelTitlePattern() {
            return this.disallowedModelTitlePattern_;
        }

        public C63088z getDisallowedModelTitlePatternBytes() {
            return C63088z.m96143E(this.disallowedModelTitlePattern_);
        }

        public C63088z getDisplayTimingParameters() {
            return this.displayTimingParameters_;
        }

        public String getDynamicInfoCardReferrers() {
            return this.dynamicInfoCardReferrers_;
        }

        public C63088z getDynamicInfoCardReferrersBytes() {
            return C63088z.m96143E(this.dynamicInfoCardReferrers_);
        }

        public boolean getEnableLighting() {
            return this.enableLighting_;
        }

        public boolean getFallbackEnabled() {
            return this.fallbackEnabled_;
        }

        public boolean getHotspotsEnabled() {
            return this.hotspotsEnabled_;
        }

        public String getInfoCardUri() {
            return this.infoCardUri_;
        }

        public C63088z getInfoCardUriBytes() {
            return C63088z.m96143E(this.infoCardUri_);
        }

        public boolean getLatestPose() {
            return this.latestPose_;
        }

        public boolean getLowPerformanceMode() {
            return this.lowPerformanceMode_;
        }

        public C63088z getMidStreamDecisionParameters() {
            return this.midStreamDecisionParameters_;
        }

        public int getMinArCoreVersion() {
            return this.minArCoreVersion_;
        }

        public SceneViewerParams.StreamingMode getMode() {
            SceneViewerParams.StreamingMode forNumber = SceneViewerParams.StreamingMode.forNumber(this.mode_);
            return forNumber == null ? SceneViewerParams.StreamingMode.UNRECOGNIZED : forNumber;
        }

        public boolean getModeAllowed() {
            return this.modeAllowed_;
        }

        public int getModeValue() {
            return this.mode_;
        }

        public String getReferrers() {
            return this.referrers_;
        }

        public C63088z getReferrersBytes() {
            return C63088z.m96143E(this.referrers_);
        }

        public String getSessionServiceAddress() {
            return this.sessionServiceAddress_;
        }

        public C63088z getSessionServiceAddressBytes() {
            return C63088z.m96143E(this.sessionServiceAddress_);
        }

        public String getSessionServiceApiKey() {
            return this.sessionServiceApiKey_;
        }

        public C63088z getSessionServiceApiKeyBytes() {
            return C63088z.m96143E(this.sessionServiceApiKey_);
        }

        public boolean getSideChannelEventEnabled() {
            return this.sideChannelEventEnabled_;
        }

        public boolean getStreamingTestCancellationEnabled() {
            return this.streamingTestCancellationEnabled_;
        }

        public C63088z getTestDecisionParameters() {
            return this.testDecisionParameters_;
        }

        public long getTestDecodingWarmupFrames() {
            return this.testDecodingWarmupFrames_;
        }

        public boolean getTestDryrun() {
            return this.testDryrun_;
        }

        public long getTestEvaluationDurationMs() {
            return this.testEvaluationDurationMs_;
        }

        public long getTestMaxDurationMs() {
            return this.testMaxDurationMs_;
        }

        public boolean getTestResultIgnoredOnDataLoss() {
            return this.testResultIgnoredOnDataLoss_;
        }

        public String getTestSessionServiceAddress() {
            return this.testSessionServiceAddress_;
        }

        public C63088z getTestSessionServiceAddressBytes() {
            return C63088z.m96143E(this.testSessionServiceAddress_);
        }

        public String getTestSessionServiceApiKey() {
            return this.testSessionServiceApiKey_;
        }

        public C63088z getTestSessionServiceApiKeyBytes() {
            return C63088z.m96143E(this.testSessionServiceApiKey_);
        }

        public boolean getTouchEventsEnabled() {
            return this.touchEventsEnabled_;
        }

        public boolean getUseMergedApi() {
            return this.useMergedApi_;
        }

        public boolean getUseMergedStream() {
            return this.useMergedStream_;
        }

        public boolean getUseMtls() {
            return this.useMtls_;
        }

        public boolean hasDisallowedModelTitlePattern() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDisplayTimingParameters() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasInfoCardUri() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasMidStreamDecisionParameters() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMode() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTestDecisionParameters() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(StreamingSettings streamingSettings) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(streamingSettings);
        }

        public static StreamingSettings parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (StreamingSettings) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static StreamingSettings parseFrom(C63088z zVar, C62921ba baVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static StreamingSettings parseFrom(C62897ae aeVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static StreamingSettings parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static StreamingSettings parseFrom(InputStream inputStream) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static StreamingSettings parseFrom(InputStream inputStream, C62921ba baVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static StreamingSettings parseFrom(ByteBuffer byteBuffer) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static StreamingSettings parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static StreamingSettings parseFrom(byte[] bArr) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static StreamingSettings parseFrom(byte[] bArr, C62921ba baVar) {
            return (StreamingSettings) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$StreamingSettingsOrBuilder */
    /* compiled from: PG */
    public interface StreamingSettingsOrBuilder extends C63001dt {
        String getAccountName();

        C63088z getAccountNameBytes();

        String getAccountToken();

        C63088z getAccountTokenBytes();

        String getAllowedApiKeys();

        C63088z getAllowedApiKeysBytes();

        String getAllowedDomains();

        C63088z getAllowedDomainsBytes();

        String getCodec();

        C63088z getCodecBytes();

        long getCreationTimeoutMs();

        String getDisallowedModelTitlePattern();

        C63088z getDisallowedModelTitlePatternBytes();

        C63088z getDisplayTimingParameters();

        String getDynamicInfoCardReferrers();

        C63088z getDynamicInfoCardReferrersBytes();

        boolean getEnableLighting();

        boolean getFallbackEnabled();

        boolean getHotspotsEnabled();

        String getInfoCardUri();

        C63088z getInfoCardUriBytes();

        boolean getLatestPose();

        boolean getLowPerformanceMode();

        C63088z getMidStreamDecisionParameters();

        int getMinArCoreVersion();

        SceneViewerParams.StreamingMode getMode();

        boolean getModeAllowed();

        int getModeValue();

        String getReferrers();

        C63088z getReferrersBytes();

        String getSessionServiceAddress();

        C63088z getSessionServiceAddressBytes();

        String getSessionServiceApiKey();

        C63088z getSessionServiceApiKeyBytes();

        boolean getSideChannelEventEnabled();

        boolean getStreamingTestCancellationEnabled();

        C63088z getTestDecisionParameters();

        long getTestDecodingWarmupFrames();

        boolean getTestDryrun();

        long getTestEvaluationDurationMs();

        long getTestMaxDurationMs();

        boolean getTestResultIgnoredOnDataLoss();

        String getTestSessionServiceAddress();

        C63088z getTestSessionServiceAddressBytes();

        String getTestSessionServiceApiKey();

        C63088z getTestSessionServiceApiKeyBytes();

        boolean getTouchEventsEnabled();

        boolean getUseMergedApi();

        boolean getUseMergedStream();

        boolean getUseMtls();

        boolean hasDisallowedModelTitlePattern();

        boolean hasDisplayTimingParameters();

        boolean hasInfoCardUri();

        boolean hasMidStreamDecisionParameters();

        boolean hasMode();

        boolean hasTestDecisionParameters();
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$ViewerMode */
    /* compiled from: PG */
    public enum ViewerMode implements C62957cd {
        INVALID(0),
        THREE_D(1),
        AR(2),
        SNAPSHOT(3),
        UNRECOGNIZED(-1);
        
        public static final int AR_VALUE = 2;
        public static final int INVALID_VALUE = 0;
        public static final int SNAPSHOT_VALUE = 3;
        public static final int THREE_D_VALUE = 1;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47965z();
        }

        private ViewerMode(int i) {
            this.value = i;
        }

        public static ViewerMode forNumber(int i) {
            if (i == 0) {
                return INVALID;
            }
            if (i == 1) {
                return THREE_D;
            }
            if (i == 2) {
                return AR;
            }
            if (i != 3) {
                return null;
            }
            return SNAPSHOT;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47938aa.f124122a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    /* renamed from: com.google.ar.core.viewer.jniprotolite.Types$Visibility */
    /* compiled from: PG */
    public enum Visibility implements C62957cd {
        VISIBLE(0),
        EXPANDED(1),
        PEEKING(2),
        COLLAPSED(3),
        FADED(4),
        HIDDEN(5),
        UNRECOGNIZED(-1);
        
        public static final int COLLAPSED_VALUE = 3;
        public static final int EXPANDED_VALUE = 1;
        public static final int FADED_VALUE = 4;
        public static final int HIDDEN_VALUE = 5;
        public static final int PEEKING_VALUE = 2;
        public static final int VISIBLE_VALUE = 0;
        private static final C62958ce internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new C47939ab();
        }

        private Visibility(int i) {
            this.value = i;
        }

        public static Visibility forNumber(int i) {
            if (i == 0) {
                return VISIBLE;
            }
            if (i == 1) {
                return EXPANDED;
            }
            if (i == 2) {
                return PEEKING;
            }
            if (i == 3) {
                return COLLAPSED;
            }
            if (i == 4) {
                return FADED;
            }
            if (i != 5) {
                return null;
            }
            return HIDDEN;
        }

        public static C62958ce internalGetValueMap() {
            return internalValueMap;
        }

        public static C62959cf internalGetVerifier() {
            return C47940ac.f124123a;
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    private Types() {
    }

    public static void registerAllExtensions(C62921ba baVar) {
    }
}
