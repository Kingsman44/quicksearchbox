package com.google.p3723ar.core.viewer.analytics;

import com.evernote.android.state.BuildConfig;
import com.google.p3723ar.core.impress.analytics.ImpressLogOuterClass;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62972cr;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass */
/* compiled from: PG */
public final class ArViewerLogOuterClass {

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$Action */
    /* compiled from: PG */
    public final class Action extends C62942bv implements ActionOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final Action DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER;
        private int action_;
        private int bitField0_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$Action$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements ActionOrBuilder {
            private Builder() {
                super(Action.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((Action) this.instance).clearAction();
                return this;
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.Action getAction() {
                return ((Action) this.instance).getAction();
            }

            public boolean hasAction() {
                return ((Action) this.instance).hasAction();
            }

            public Builder setAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action) {
                copyOnWrite();
                ((Action) this.instance).setAction(action);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            Action action = new Action();
            DEFAULT_INSTANCE = action;
            C62942bv.registerDefaultInstance(Action.class, action);
        }

        private Action() {
        }

        /* access modifiers changed from: private */
        public void clearAction() {
            this.bitField0_ &= -2;
            this.action_ = 0;
        }

        public static Action getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Action parseDelimitedFrom(InputStream inputStream) {
            return (Action) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(C63088z zVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action) {
            this.action_ = action.getNumber();
            this.bitField0_ |= 1;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "action_", ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.internalGetVerifier()});
                case 3:
                    return new Action();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (Action.class) {
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

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.Action getAction() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.Action forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.forNumber(this.action_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.ACTION_UNKNOWN : forNumber;
        }

        public boolean hasAction() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Action action) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(action);
        }

        public static Action parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (Action) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Action parseFrom(C63088z zVar, C62921ba baVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static Action parseFrom(C62897ae aeVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static Action parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static Action parseFrom(InputStream inputStream) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static Action parseFrom(InputStream inputStream, C62921ba baVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Action parseFrom(ByteBuffer byteBuffer) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static Action parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static Action parseFrom(byte[] bArr) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static Action parseFrom(byte[] bArr, C62921ba baVar) {
            return (Action) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ActionOrBuilder */
    /* compiled from: PG */
    public interface ActionOrBuilder extends C63001dt {
        ArViewerLogEnumOuterClass.ArViewerLogEnum.Action getAction();

        boolean hasAction();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ArViewerLog */
    /* compiled from: PG */
    public final class ArViewerLog extends C62942bv implements ArViewerLogOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 4;
        public static final int APK_VERSION_FIELD_NUMBER = 10;
        public static final int ARCORE_SESSION_ID_FIELD_NUMBER = 3;
        public static final int BUILD_TYPE_FIELD_NUMBER = 12;
        /* access modifiers changed from: private */
        public static final ArViewerLog DEFAULT_INSTANCE;
        public static final int EXIT_VIEWER_MODE_FIELD_NUMBER = 7;
        public static final int LOADING_CANCELLED_FIELD_NUMBER = 13;
        public static final int LOADING_ERROR_FIELD_NUMBER = 9;
        public static final int LOADING_FINISHED_FIELD_NUMBER = 8;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile C63010eb PARSER = null;
        public static final int SESSION_ANALYTICS_FIELD_NUMBER = 18;
        public static final int SESSION_ENDED_FIELD_NUMBER = 6;
        public static final int SESSION_PAUSED_FIELD_NUMBER = 11;
        public static final int STREAMING_METADATA_FIELD_NUMBER = 15;
        public static final int UI_EVENT_FIELD_NUMBER = 17;
        public static final int USER_EXITED_FIELD_NUMBER = 5;
        public static final int VIDEO_CAPTURE_METADATA_FIELD_NUMBER = 14;
        public static final int VIEWER_PERFORMANCE_FIELD_NUMBER = 16;
        public static final int VIEWER_SESSION_ID_FIELD_NUMBER = 1;
        private String apkVersion_ = BuildConfig.FLAVOR;
        private String arcoreSessionId_ = BuildConfig.FLAVOR;
        private int arviewerEventCase_ = 0;
        private Object arviewerEvent_;
        private int bitField0_;
        private int buildType_;
        private Params params_;
        private StreamingMetadata streamingMetadata_;
        private String viewerSessionId_ = BuildConfig.FLAVOR;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ArViewerLog$ArviewerEventCase */
        /* compiled from: PG */
        public enum ArviewerEventCase {
            ACTION(4),
            USER_EXITED(5),
            SESSION_ENDED(6),
            EXIT_VIEWER_MODE(7),
            LOADING_FINISHED(8),
            LOADING_ERROR(9),
            LOADING_CANCELLED(13),
            SESSION_PAUSED(11),
            VIDEO_CAPTURE_METADATA(14),
            VIEWER_PERFORMANCE(16),
            UI_EVENT(17),
            SESSION_ANALYTICS(18),
            ARVIEWEREVENT_NOT_SET(0);
            
            private final int value;

            private ArviewerEventCase(int i) {
                this.value = i;
            }

            public static ArviewerEventCase forNumber(int i) {
                switch (i) {
                    case 0:
                        return ARVIEWEREVENT_NOT_SET;
                    case 4:
                        return ACTION;
                    case 5:
                        return USER_EXITED;
                    case 6:
                        return SESSION_ENDED;
                    case 7:
                        return EXIT_VIEWER_MODE;
                    case 8:
                        return LOADING_FINISHED;
                    case 9:
                        return LOADING_ERROR;
                    case 11:
                        return SESSION_PAUSED;
                    case 13:
                        return LOADING_CANCELLED;
                    case 14:
                        return VIDEO_CAPTURE_METADATA;
                    case 16:
                        return VIEWER_PERFORMANCE;
                    case 17:
                        return UI_EVENT;
                    case 18:
                        return SESSION_ANALYTICS;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ArViewerLog$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements ArViewerLogOrBuilder {
            private Builder() {
                super(ArViewerLog.DEFAULT_INSTANCE);
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearAction();
                return this;
            }

            public Builder clearApkVersion() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearApkVersion();
                return this;
            }

            public Builder clearArcoreSessionId() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearArcoreSessionId();
                return this;
            }

            public Builder clearArviewerEvent() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearArviewerEvent();
                return this;
            }

            public Builder clearBuildType() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearBuildType();
                return this;
            }

            public Builder clearExitViewerMode() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearExitViewerMode();
                return this;
            }

            public Builder clearLoadingCancelled() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearLoadingCancelled();
                return this;
            }

            public Builder clearLoadingError() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearLoadingError();
                return this;
            }

            public Builder clearLoadingFinished() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearLoadingFinished();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearParams();
                return this;
            }

            public Builder clearSessionAnalytics() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearSessionAnalytics();
                return this;
            }

            @Deprecated
            public Builder clearSessionEnded() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearSessionEnded();
                return this;
            }

            public Builder clearSessionPaused() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearSessionPaused();
                return this;
            }

            public Builder clearStreamingMetadata() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearStreamingMetadata();
                return this;
            }

            public Builder clearUiEvent() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearUiEvent();
                return this;
            }

            public Builder clearUserExited() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearUserExited();
                return this;
            }

            public Builder clearVideoCaptureMetadata() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearVideoCaptureMetadata();
                return this;
            }

            public Builder clearViewerPerformance() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearViewerPerformance();
                return this;
            }

            public Builder clearViewerSessionId() {
                copyOnWrite();
                ((ArViewerLog) this.instance).clearViewerSessionId();
                return this;
            }

            public Action getAction() {
                return ((ArViewerLog) this.instance).getAction();
            }

            public String getApkVersion() {
                return ((ArViewerLog) this.instance).getApkVersion();
            }

            public C63088z getApkVersionBytes() {
                return ((ArViewerLog) this.instance).getApkVersionBytes();
            }

            public String getArcoreSessionId() {
                return ((ArViewerLog) this.instance).getArcoreSessionId();
            }

            public C63088z getArcoreSessionIdBytes() {
                return ((ArViewerLog) this.instance).getArcoreSessionIdBytes();
            }

            public ArviewerEventCase getArviewerEventCase() {
                return ((ArViewerLog) this.instance).getArviewerEventCase();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType getBuildType() {
                return ((ArViewerLog) this.instance).getBuildType();
            }

            public ExitViewerMode getExitViewerMode() {
                return ((ArViewerLog) this.instance).getExitViewerMode();
            }

            public LoadingCancelled getLoadingCancelled() {
                return ((ArViewerLog) this.instance).getLoadingCancelled();
            }

            public LoadingError getLoadingError() {
                return ((ArViewerLog) this.instance).getLoadingError();
            }

            public LoadingFinished getLoadingFinished() {
                return ((ArViewerLog) this.instance).getLoadingFinished();
            }

            public Params getParams() {
                return ((ArViewerLog) this.instance).getParams();
            }

            public SessionAnalytics getSessionAnalytics() {
                return ((ArViewerLog) this.instance).getSessionAnalytics();
            }

            @Deprecated
            public SessionPaused getSessionEnded() {
                return ((ArViewerLog) this.instance).getSessionEnded();
            }

            public SessionPaused getSessionPaused() {
                return ((ArViewerLog) this.instance).getSessionPaused();
            }

            public StreamingMetadata getStreamingMetadata() {
                return ((ArViewerLog) this.instance).getStreamingMetadata();
            }

            public UIEvent getUiEvent() {
                return ((ArViewerLog) this.instance).getUiEvent();
            }

            public UserExited getUserExited() {
                return ((ArViewerLog) this.instance).getUserExited();
            }

            public VideoCaptureMetadata getVideoCaptureMetadata() {
                return ((ArViewerLog) this.instance).getVideoCaptureMetadata();
            }

            public ViewerPerformance getViewerPerformance() {
                return ((ArViewerLog) this.instance).getViewerPerformance();
            }

            public String getViewerSessionId() {
                return ((ArViewerLog) this.instance).getViewerSessionId();
            }

            public C63088z getViewerSessionIdBytes() {
                return ((ArViewerLog) this.instance).getViewerSessionIdBytes();
            }

            public boolean hasAction() {
                return ((ArViewerLog) this.instance).hasAction();
            }

            public boolean hasApkVersion() {
                return ((ArViewerLog) this.instance).hasApkVersion();
            }

            public boolean hasArcoreSessionId() {
                return ((ArViewerLog) this.instance).hasArcoreSessionId();
            }

            public boolean hasBuildType() {
                return ((ArViewerLog) this.instance).hasBuildType();
            }

            public boolean hasExitViewerMode() {
                return ((ArViewerLog) this.instance).hasExitViewerMode();
            }

            public boolean hasLoadingCancelled() {
                return ((ArViewerLog) this.instance).hasLoadingCancelled();
            }

            public boolean hasLoadingError() {
                return ((ArViewerLog) this.instance).hasLoadingError();
            }

            public boolean hasLoadingFinished() {
                return ((ArViewerLog) this.instance).hasLoadingFinished();
            }

            public boolean hasParams() {
                return ((ArViewerLog) this.instance).hasParams();
            }

            public boolean hasSessionAnalytics() {
                return ((ArViewerLog) this.instance).hasSessionAnalytics();
            }

            @Deprecated
            public boolean hasSessionEnded() {
                return ((ArViewerLog) this.instance).hasSessionEnded();
            }

            public boolean hasSessionPaused() {
                return ((ArViewerLog) this.instance).hasSessionPaused();
            }

            public boolean hasStreamingMetadata() {
                return ((ArViewerLog) this.instance).hasStreamingMetadata();
            }

            public boolean hasUiEvent() {
                return ((ArViewerLog) this.instance).hasUiEvent();
            }

            public boolean hasUserExited() {
                return ((ArViewerLog) this.instance).hasUserExited();
            }

            public boolean hasVideoCaptureMetadata() {
                return ((ArViewerLog) this.instance).hasVideoCaptureMetadata();
            }

            public boolean hasViewerPerformance() {
                return ((ArViewerLog) this.instance).hasViewerPerformance();
            }

            public boolean hasViewerSessionId() {
                return ((ArViewerLog) this.instance).hasViewerSessionId();
            }

            public Builder mergeAction(Action action) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeAction(action);
                return this;
            }

            public Builder mergeExitViewerMode(ExitViewerMode exitViewerMode) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeExitViewerMode(exitViewerMode);
                return this;
            }

            public Builder mergeLoadingCancelled(LoadingCancelled loadingCancelled) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeLoadingCancelled(loadingCancelled);
                return this;
            }

            public Builder mergeLoadingError(LoadingError loadingError) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeLoadingError(loadingError);
                return this;
            }

            public Builder mergeLoadingFinished(LoadingFinished loadingFinished) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeLoadingFinished(loadingFinished);
                return this;
            }

            public Builder mergeParams(Params params) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeParams(params);
                return this;
            }

            public Builder mergeSessionAnalytics(SessionAnalytics sessionAnalytics) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeSessionAnalytics(sessionAnalytics);
                return this;
            }

            @Deprecated
            public Builder mergeSessionEnded(SessionPaused sessionPaused) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeSessionEnded(sessionPaused);
                return this;
            }

            public Builder mergeSessionPaused(SessionPaused sessionPaused) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeSessionPaused(sessionPaused);
                return this;
            }

            public Builder mergeStreamingMetadata(StreamingMetadata streamingMetadata) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeStreamingMetadata(streamingMetadata);
                return this;
            }

            public Builder mergeUiEvent(UIEvent uIEvent) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeUiEvent(uIEvent);
                return this;
            }

            public Builder mergeUserExited(UserExited userExited) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeUserExited(userExited);
                return this;
            }

            public Builder mergeVideoCaptureMetadata(VideoCaptureMetadata videoCaptureMetadata) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeVideoCaptureMetadata(videoCaptureMetadata);
                return this;
            }

            public Builder mergeViewerPerformance(ViewerPerformance viewerPerformance) {
                copyOnWrite();
                ((ArViewerLog) this.instance).mergeViewerPerformance(viewerPerformance);
                return this;
            }

            public Builder setAction(Action.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setAction((Action) builder.build());
                return this;
            }

            public Builder setApkVersion(String str) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setApkVersion(str);
                return this;
            }

            public Builder setApkVersionBytes(C63088z zVar) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setApkVersionBytes(zVar);
                return this;
            }

            public Builder setArcoreSessionId(String str) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setArcoreSessionId(str);
                return this;
            }

            public Builder setArcoreSessionIdBytes(C63088z zVar) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setArcoreSessionIdBytes(zVar);
                return this;
            }

            public Builder setBuildType(ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType buildType) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setBuildType(buildType);
                return this;
            }

            public Builder setExitViewerMode(ExitViewerMode.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setExitViewerMode((ExitViewerMode) builder.build());
                return this;
            }

            public Builder setLoadingCancelled(LoadingCancelled.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setLoadingCancelled((LoadingCancelled) builder.build());
                return this;
            }

            public Builder setLoadingError(LoadingError.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setLoadingError((LoadingError) builder.build());
                return this;
            }

            public Builder setLoadingFinished(LoadingFinished.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setLoadingFinished((LoadingFinished) builder.build());
                return this;
            }

            public Builder setParams(Params.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setParams((Params) builder.build());
                return this;
            }

            public Builder setSessionAnalytics(SessionAnalytics.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setSessionAnalytics((SessionAnalytics) builder.build());
                return this;
            }

            @Deprecated
            public Builder setSessionEnded(SessionPaused.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setSessionEnded((SessionPaused) builder.build());
                return this;
            }

            public Builder setSessionPaused(SessionPaused.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setSessionPaused((SessionPaused) builder.build());
                return this;
            }

            public Builder setStreamingMetadata(StreamingMetadata.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setStreamingMetadata((StreamingMetadata) builder.build());
                return this;
            }

            public Builder setUiEvent(UIEvent.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setUiEvent((UIEvent) builder.build());
                return this;
            }

            public Builder setUserExited(UserExited.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setUserExited((UserExited) builder.build());
                return this;
            }

            public Builder setVideoCaptureMetadata(VideoCaptureMetadata.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setVideoCaptureMetadata((VideoCaptureMetadata) builder.build());
                return this;
            }

            public Builder setViewerPerformance(ViewerPerformance.Builder builder) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setViewerPerformance((ViewerPerformance) builder.build());
                return this;
            }

            public Builder setViewerSessionId(String str) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setViewerSessionId(str);
                return this;
            }

            public Builder setViewerSessionIdBytes(C63088z zVar) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setViewerSessionIdBytes(zVar);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }

            public Builder setAction(Action action) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setAction(action);
                return this;
            }

            public Builder setExitViewerMode(ExitViewerMode exitViewerMode) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setExitViewerMode(exitViewerMode);
                return this;
            }

            public Builder setLoadingCancelled(LoadingCancelled loadingCancelled) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setLoadingCancelled(loadingCancelled);
                return this;
            }

            public Builder setLoadingError(LoadingError loadingError) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setLoadingError(loadingError);
                return this;
            }

            public Builder setLoadingFinished(LoadingFinished loadingFinished) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setLoadingFinished(loadingFinished);
                return this;
            }

            public Builder setParams(Params params) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setParams(params);
                return this;
            }

            public Builder setSessionAnalytics(SessionAnalytics sessionAnalytics) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setSessionAnalytics(sessionAnalytics);
                return this;
            }

            @Deprecated
            public Builder setSessionEnded(SessionPaused sessionPaused) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setSessionEnded(sessionPaused);
                return this;
            }

            public Builder setSessionPaused(SessionPaused sessionPaused) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setSessionPaused(sessionPaused);
                return this;
            }

            public Builder setStreamingMetadata(StreamingMetadata streamingMetadata) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setStreamingMetadata(streamingMetadata);
                return this;
            }

            public Builder setUiEvent(UIEvent uIEvent) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setUiEvent(uIEvent);
                return this;
            }

            public Builder setUserExited(UserExited userExited) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setUserExited(userExited);
                return this;
            }

            public Builder setVideoCaptureMetadata(VideoCaptureMetadata videoCaptureMetadata) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setVideoCaptureMetadata(videoCaptureMetadata);
                return this;
            }

            public Builder setViewerPerformance(ViewerPerformance viewerPerformance) {
                copyOnWrite();
                ((ArViewerLog) this.instance).setViewerPerformance(viewerPerformance);
                return this;
            }
        }

        static {
            ArViewerLog arViewerLog = new ArViewerLog();
            DEFAULT_INSTANCE = arViewerLog;
            C62942bv.registerDefaultInstance(ArViewerLog.class, arViewerLog);
        }

        private ArViewerLog() {
        }

        /* access modifiers changed from: private */
        public void clearAction() {
            if (this.arviewerEventCase_ == 4) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearApkVersion() {
            this.bitField0_ &= -9;
            this.apkVersion_ = getDefaultInstance().getApkVersion();
        }

        /* access modifiers changed from: private */
        public void clearArcoreSessionId() {
            this.bitField0_ &= -5;
            this.arcoreSessionId_ = getDefaultInstance().getArcoreSessionId();
        }

        /* access modifiers changed from: private */
        public void clearArviewerEvent() {
            this.arviewerEventCase_ = 0;
            this.arviewerEvent_ = null;
        }

        /* access modifiers changed from: private */
        public void clearBuildType() {
            this.bitField0_ &= -17;
            this.buildType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExitViewerMode() {
            if (this.arviewerEventCase_ == 7) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLoadingCancelled() {
            if (this.arviewerEventCase_ == 13) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLoadingError() {
            if (this.arviewerEventCase_ == 9) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearLoadingFinished() {
            if (this.arviewerEventCase_ == 8) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearParams() {
            this.params_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearSessionAnalytics() {
            if (this.arviewerEventCase_ == 18) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSessionEnded() {
            if (this.arviewerEventCase_ == 6) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearSessionPaused() {
            if (this.arviewerEventCase_ == 11) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearStreamingMetadata() {
            this.streamingMetadata_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearUiEvent() {
            if (this.arviewerEventCase_ == 17) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearUserExited() {
            if (this.arviewerEventCase_ == 5) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearVideoCaptureMetadata() {
            if (this.arviewerEventCase_ == 14) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearViewerPerformance() {
            if (this.arviewerEventCase_ == 16) {
                this.arviewerEventCase_ = 0;
                this.arviewerEvent_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void clearViewerSessionId() {
            this.bitField0_ &= -2;
            this.viewerSessionId_ = getDefaultInstance().getViewerSessionId();
        }

        public static ArViewerLog getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAction(Action action) {
            action.getClass();
            MessageLite messageLite = action;
            if (this.arviewerEventCase_ == 4) {
                messageLite = action;
                if (this.arviewerEvent_ != Action.getDefaultInstance()) {
                    Action.Builder newBuilder = Action.newBuilder((Action) this.arviewerEvent_);
                    newBuilder.mergeFrom(action);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void mergeExitViewerMode(ExitViewerMode exitViewerMode) {
            exitViewerMode.getClass();
            MessageLite messageLite = exitViewerMode;
            if (this.arviewerEventCase_ == 7) {
                messageLite = exitViewerMode;
                if (this.arviewerEvent_ != ExitViewerMode.getDefaultInstance()) {
                    ExitViewerMode.Builder newBuilder = ExitViewerMode.newBuilder((ExitViewerMode) this.arviewerEvent_);
                    newBuilder.mergeFrom(exitViewerMode);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void mergeLoadingCancelled(LoadingCancelled loadingCancelled) {
            loadingCancelled.getClass();
            MessageLite messageLite = loadingCancelled;
            if (this.arviewerEventCase_ == 13) {
                messageLite = loadingCancelled;
                if (this.arviewerEvent_ != LoadingCancelled.getDefaultInstance()) {
                    LoadingCancelled.Builder newBuilder = LoadingCancelled.newBuilder((LoadingCancelled) this.arviewerEvent_);
                    newBuilder.mergeFrom(loadingCancelled);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void mergeLoadingError(LoadingError loadingError) {
            loadingError.getClass();
            MessageLite messageLite = loadingError;
            if (this.arviewerEventCase_ == 9) {
                messageLite = loadingError;
                if (this.arviewerEvent_ != LoadingError.getDefaultInstance()) {
                    LoadingError.Builder newBuilder = LoadingError.newBuilder((LoadingError) this.arviewerEvent_);
                    newBuilder.mergeFrom(loadingError);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void mergeLoadingFinished(LoadingFinished loadingFinished) {
            loadingFinished.getClass();
            MessageLite messageLite = loadingFinished;
            if (this.arviewerEventCase_ == 8) {
                messageLite = loadingFinished;
                if (this.arviewerEvent_ != LoadingFinished.getDefaultInstance()) {
                    LoadingFinished.Builder newBuilder = LoadingFinished.newBuilder((LoadingFinished) this.arviewerEvent_);
                    newBuilder.mergeFrom(loadingFinished);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void mergeParams(Params params) {
            params.getClass();
            Params params2 = this.params_;
            if (!(params2 == null || params2 == Params.getDefaultInstance())) {
                Params.Builder newBuilder = Params.newBuilder(params2);
                newBuilder.mergeFrom(params);
                params = (Params) newBuilder.buildPartial();
            }
            this.params_ = params;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeSessionAnalytics(SessionAnalytics sessionAnalytics) {
            sessionAnalytics.getClass();
            MessageLite messageLite = sessionAnalytics;
            if (this.arviewerEventCase_ == 18) {
                messageLite = sessionAnalytics;
                if (this.arviewerEvent_ != SessionAnalytics.getDefaultInstance()) {
                    SessionAnalytics.Builder newBuilder = SessionAnalytics.newBuilder((SessionAnalytics) this.arviewerEvent_);
                    newBuilder.mergeFrom(sessionAnalytics);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void mergeSessionEnded(SessionPaused sessionPaused) {
            sessionPaused.getClass();
            MessageLite messageLite = sessionPaused;
            if (this.arviewerEventCase_ == 6) {
                messageLite = sessionPaused;
                if (this.arviewerEvent_ != SessionPaused.getDefaultInstance()) {
                    SessionPaused.Builder newBuilder = SessionPaused.newBuilder((SessionPaused) this.arviewerEvent_);
                    newBuilder.mergeFrom(sessionPaused);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void mergeSessionPaused(SessionPaused sessionPaused) {
            sessionPaused.getClass();
            MessageLite messageLite = sessionPaused;
            if (this.arviewerEventCase_ == 11) {
                messageLite = sessionPaused;
                if (this.arviewerEvent_ != SessionPaused.getDefaultInstance()) {
                    SessionPaused.Builder newBuilder = SessionPaused.newBuilder((SessionPaused) this.arviewerEvent_);
                    newBuilder.mergeFrom(sessionPaused);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void mergeStreamingMetadata(StreamingMetadata streamingMetadata) {
            streamingMetadata.getClass();
            StreamingMetadata streamingMetadata2 = this.streamingMetadata_;
            if (!(streamingMetadata2 == null || streamingMetadata2 == StreamingMetadata.getDefaultInstance())) {
                StreamingMetadata.Builder newBuilder = StreamingMetadata.newBuilder(streamingMetadata2);
                newBuilder.mergeFrom(streamingMetadata);
                streamingMetadata = (StreamingMetadata) newBuilder.buildPartial();
            }
            this.streamingMetadata_ = streamingMetadata;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeUiEvent(UIEvent uIEvent) {
            uIEvent.getClass();
            MessageLite messageLite = uIEvent;
            if (this.arviewerEventCase_ == 17) {
                messageLite = uIEvent;
                if (this.arviewerEvent_ != UIEvent.getDefaultInstance()) {
                    UIEvent.Builder newBuilder = UIEvent.newBuilder((UIEvent) this.arviewerEvent_);
                    newBuilder.mergeFrom(uIEvent);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void mergeUserExited(UserExited userExited) {
            userExited.getClass();
            MessageLite messageLite = userExited;
            if (this.arviewerEventCase_ == 5) {
                messageLite = userExited;
                if (this.arviewerEvent_ != UserExited.getDefaultInstance()) {
                    UserExited.Builder newBuilder = UserExited.newBuilder((UserExited) this.arviewerEvent_);
                    newBuilder.mergeFrom(userExited);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void mergeVideoCaptureMetadata(VideoCaptureMetadata videoCaptureMetadata) {
            videoCaptureMetadata.getClass();
            MessageLite messageLite = videoCaptureMetadata;
            if (this.arviewerEventCase_ == 14) {
                messageLite = videoCaptureMetadata;
                if (this.arviewerEvent_ != VideoCaptureMetadata.getDefaultInstance()) {
                    VideoCaptureMetadata.Builder newBuilder = VideoCaptureMetadata.newBuilder((VideoCaptureMetadata) this.arviewerEvent_);
                    newBuilder.mergeFrom(videoCaptureMetadata);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void mergeViewerPerformance(ViewerPerformance viewerPerformance) {
            viewerPerformance.getClass();
            MessageLite messageLite = viewerPerformance;
            if (this.arviewerEventCase_ == 16) {
                messageLite = viewerPerformance;
                if (this.arviewerEvent_ != ViewerPerformance.getDefaultInstance()) {
                    ViewerPerformance.Builder newBuilder = ViewerPerformance.newBuilder((ViewerPerformance) this.arviewerEvent_);
                    newBuilder.mergeFrom(viewerPerformance);
                    messageLite = newBuilder.buildPartial();
                }
            }
            this.arviewerEvent_ = messageLite;
            this.arviewerEventCase_ = 16;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ArViewerLog parseDelimitedFrom(InputStream inputStream) {
            return (ArViewerLog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ArViewerLog parseFrom(C63088z zVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAction(Action action) {
            action.getClass();
            this.arviewerEvent_ = action;
            this.arviewerEventCase_ = 4;
        }

        /* access modifiers changed from: private */
        public void setApkVersion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.apkVersion_ = str;
        }

        /* access modifiers changed from: private */
        public void setApkVersionBytes(C63088z zVar) {
            this.apkVersion_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setArcoreSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.arcoreSessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setArcoreSessionIdBytes(C63088z zVar) {
            this.arcoreSessionId_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setBuildType(ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType buildType) {
            this.buildType_ = buildType.getNumber();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setExitViewerMode(ExitViewerMode exitViewerMode) {
            exitViewerMode.getClass();
            this.arviewerEvent_ = exitViewerMode;
            this.arviewerEventCase_ = 7;
        }

        /* access modifiers changed from: private */
        public void setLoadingCancelled(LoadingCancelled loadingCancelled) {
            loadingCancelled.getClass();
            this.arviewerEvent_ = loadingCancelled;
            this.arviewerEventCase_ = 13;
        }

        /* access modifiers changed from: private */
        public void setLoadingError(LoadingError loadingError) {
            loadingError.getClass();
            this.arviewerEvent_ = loadingError;
            this.arviewerEventCase_ = 9;
        }

        /* access modifiers changed from: private */
        public void setLoadingFinished(LoadingFinished loadingFinished) {
            loadingFinished.getClass();
            this.arviewerEvent_ = loadingFinished;
            this.arviewerEventCase_ = 8;
        }

        /* access modifiers changed from: private */
        public void setParams(Params params) {
            params.getClass();
            this.params_ = params;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setSessionAnalytics(SessionAnalytics sessionAnalytics) {
            sessionAnalytics.getClass();
            this.arviewerEvent_ = sessionAnalytics;
            this.arviewerEventCase_ = 18;
        }

        /* access modifiers changed from: private */
        public void setSessionEnded(SessionPaused sessionPaused) {
            sessionPaused.getClass();
            this.arviewerEvent_ = sessionPaused;
            this.arviewerEventCase_ = 6;
        }

        /* access modifiers changed from: private */
        public void setSessionPaused(SessionPaused sessionPaused) {
            sessionPaused.getClass();
            this.arviewerEvent_ = sessionPaused;
            this.arviewerEventCase_ = 11;
        }

        /* access modifiers changed from: private */
        public void setStreamingMetadata(StreamingMetadata streamingMetadata) {
            streamingMetadata.getClass();
            this.streamingMetadata_ = streamingMetadata;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setUiEvent(UIEvent uIEvent) {
            uIEvent.getClass();
            this.arviewerEvent_ = uIEvent;
            this.arviewerEventCase_ = 17;
        }

        /* access modifiers changed from: private */
        public void setUserExited(UserExited userExited) {
            userExited.getClass();
            this.arviewerEvent_ = userExited;
            this.arviewerEventCase_ = 5;
        }

        /* access modifiers changed from: private */
        public void setVideoCaptureMetadata(VideoCaptureMetadata videoCaptureMetadata) {
            videoCaptureMetadata.getClass();
            this.arviewerEvent_ = videoCaptureMetadata;
            this.arviewerEventCase_ = 14;
        }

        /* access modifiers changed from: private */
        public void setViewerPerformance(ViewerPerformance viewerPerformance) {
            viewerPerformance.getClass();
            this.arviewerEvent_ = viewerPerformance;
            this.arviewerEventCase_ = 16;
        }

        /* access modifiers changed from: private */
        public void setViewerSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.viewerSessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setViewerSessionIdBytes(C63088z zVar) {
            this.viewerSessionId_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 1;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nဈ\u0003\u000bြ\u0000\fဌ\u0004\rြ\u0000\u000eြ\u0000\u000fဉ\u0005\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000", new Object[]{"arviewerEvent_", "arviewerEventCase_", "bitField0_", "viewerSessionId_", "params_", "arcoreSessionId_", Action.class, UserExited.class, SessionPaused.class, ExitViewerMode.class, LoadingFinished.class, LoadingError.class, "apkVersion_", SessionPaused.class, "buildType_", ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.internalGetVerifier(), LoadingCancelled.class, VideoCaptureMetadata.class, "streamingMetadata_", ViewerPerformance.class, UIEvent.class, SessionAnalytics.class});
                case 3:
                    return new ArViewerLog();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (ArViewerLog.class) {
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

        public Action getAction() {
            if (this.arviewerEventCase_ == 4) {
                return (Action) this.arviewerEvent_;
            }
            return Action.getDefaultInstance();
        }

        public String getApkVersion() {
            return this.apkVersion_;
        }

        public C63088z getApkVersionBytes() {
            return C63088z.m96143E(this.apkVersion_);
        }

        public String getArcoreSessionId() {
            return this.arcoreSessionId_;
        }

        public C63088z getArcoreSessionIdBytes() {
            return C63088z.m96143E(this.arcoreSessionId_);
        }

        public ArviewerEventCase getArviewerEventCase() {
            return ArviewerEventCase.forNumber(this.arviewerEventCase_);
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType getBuildType() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.forNumber(this.buildType_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.BUILD_TYPE_UNKNOWN : forNumber;
        }

        public ExitViewerMode getExitViewerMode() {
            if (this.arviewerEventCase_ == 7) {
                return (ExitViewerMode) this.arviewerEvent_;
            }
            return ExitViewerMode.getDefaultInstance();
        }

        public LoadingCancelled getLoadingCancelled() {
            if (this.arviewerEventCase_ == 13) {
                return (LoadingCancelled) this.arviewerEvent_;
            }
            return LoadingCancelled.getDefaultInstance();
        }

        public LoadingError getLoadingError() {
            if (this.arviewerEventCase_ == 9) {
                return (LoadingError) this.arviewerEvent_;
            }
            return LoadingError.getDefaultInstance();
        }

        public LoadingFinished getLoadingFinished() {
            if (this.arviewerEventCase_ == 8) {
                return (LoadingFinished) this.arviewerEvent_;
            }
            return LoadingFinished.getDefaultInstance();
        }

        public Params getParams() {
            Params params = this.params_;
            return params == null ? Params.getDefaultInstance() : params;
        }

        public SessionAnalytics getSessionAnalytics() {
            if (this.arviewerEventCase_ == 18) {
                return (SessionAnalytics) this.arviewerEvent_;
            }
            return SessionAnalytics.getDefaultInstance();
        }

        @Deprecated
        public SessionPaused getSessionEnded() {
            if (this.arviewerEventCase_ == 6) {
                return (SessionPaused) this.arviewerEvent_;
            }
            return SessionPaused.getDefaultInstance();
        }

        public SessionPaused getSessionPaused() {
            if (this.arviewerEventCase_ == 11) {
                return (SessionPaused) this.arviewerEvent_;
            }
            return SessionPaused.getDefaultInstance();
        }

        public StreamingMetadata getStreamingMetadata() {
            StreamingMetadata streamingMetadata = this.streamingMetadata_;
            return streamingMetadata == null ? StreamingMetadata.getDefaultInstance() : streamingMetadata;
        }

        public UIEvent getUiEvent() {
            if (this.arviewerEventCase_ == 17) {
                return (UIEvent) this.arviewerEvent_;
            }
            return UIEvent.getDefaultInstance();
        }

        public UserExited getUserExited() {
            if (this.arviewerEventCase_ == 5) {
                return (UserExited) this.arviewerEvent_;
            }
            return UserExited.getDefaultInstance();
        }

        public VideoCaptureMetadata getVideoCaptureMetadata() {
            if (this.arviewerEventCase_ == 14) {
                return (VideoCaptureMetadata) this.arviewerEvent_;
            }
            return VideoCaptureMetadata.getDefaultInstance();
        }

        public ViewerPerformance getViewerPerformance() {
            if (this.arviewerEventCase_ == 16) {
                return (ViewerPerformance) this.arviewerEvent_;
            }
            return ViewerPerformance.getDefaultInstance();
        }

        public String getViewerSessionId() {
            return this.viewerSessionId_;
        }

        public C63088z getViewerSessionIdBytes() {
            return C63088z.m96143E(this.viewerSessionId_);
        }

        public boolean hasAction() {
            return this.arviewerEventCase_ == 4;
        }

        public boolean hasApkVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasArcoreSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasBuildType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasExitViewerMode() {
            return this.arviewerEventCase_ == 7;
        }

        public boolean hasLoadingCancelled() {
            return this.arviewerEventCase_ == 13;
        }

        public boolean hasLoadingError() {
            return this.arviewerEventCase_ == 9;
        }

        public boolean hasLoadingFinished() {
            return this.arviewerEventCase_ == 8;
        }

        public boolean hasParams() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSessionAnalytics() {
            return this.arviewerEventCase_ == 18;
        }

        @Deprecated
        public boolean hasSessionEnded() {
            return this.arviewerEventCase_ == 6;
        }

        public boolean hasSessionPaused() {
            return this.arviewerEventCase_ == 11;
        }

        public boolean hasStreamingMetadata() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasUiEvent() {
            return this.arviewerEventCase_ == 17;
        }

        public boolean hasUserExited() {
            return this.arviewerEventCase_ == 5;
        }

        public boolean hasVideoCaptureMetadata() {
            return this.arviewerEventCase_ == 14;
        }

        public boolean hasViewerPerformance() {
            return this.arviewerEventCase_ == 16;
        }

        public boolean hasViewerSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ArViewerLog arViewerLog) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(arViewerLog);
        }

        public static ArViewerLog parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (ArViewerLog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ArViewerLog parseFrom(C63088z zVar, C62921ba baVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static ArViewerLog parseFrom(C62897ae aeVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static ArViewerLog parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static ArViewerLog parseFrom(InputStream inputStream) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static ArViewerLog parseFrom(InputStream inputStream, C62921ba baVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ArViewerLog parseFrom(ByteBuffer byteBuffer) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static ArViewerLog parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static ArViewerLog parseFrom(byte[] bArr) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static ArViewerLog parseFrom(byte[] bArr, C62921ba baVar) {
            return (ArViewerLog) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ArViewerLogOrBuilder */
    /* compiled from: PG */
    public interface ArViewerLogOrBuilder extends C63001dt {
        Action getAction();

        String getApkVersion();

        C63088z getApkVersionBytes();

        String getArcoreSessionId();

        C63088z getArcoreSessionIdBytes();

        ArViewerLog.ArviewerEventCase getArviewerEventCase();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType getBuildType();

        ExitViewerMode getExitViewerMode();

        LoadingCancelled getLoadingCancelled();

        LoadingError getLoadingError();

        LoadingFinished getLoadingFinished();

        Params getParams();

        SessionAnalytics getSessionAnalytics();

        @Deprecated
        SessionPaused getSessionEnded();

        SessionPaused getSessionPaused();

        StreamingMetadata getStreamingMetadata();

        UIEvent getUiEvent();

        UserExited getUserExited();

        VideoCaptureMetadata getVideoCaptureMetadata();

        ViewerPerformance getViewerPerformance();

        String getViewerSessionId();

        C63088z getViewerSessionIdBytes();

        boolean hasAction();

        boolean hasApkVersion();

        boolean hasArcoreSessionId();

        boolean hasBuildType();

        boolean hasExitViewerMode();

        boolean hasLoadingCancelled();

        boolean hasLoadingError();

        boolean hasLoadingFinished();

        boolean hasParams();

        boolean hasSessionAnalytics();

        @Deprecated
        boolean hasSessionEnded();

        boolean hasSessionPaused();

        boolean hasStreamingMetadata();

        boolean hasUiEvent();

        boolean hasUserExited();

        boolean hasVideoCaptureMetadata();

        boolean hasViewerPerformance();

        boolean hasViewerSessionId();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ExitViewerMode */
    /* compiled from: PG */
    public final class ExitViewerMode extends C62942bv implements ExitViewerModeOrBuilder {
        /* access modifiers changed from: private */
        public static final ExitViewerMode DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 2;
        public static final int FRAME_RATE_FIELD_NUMBER = 3;
        private static volatile C63010eb PARSER = null;
        public static final int VIEWER_MODE_FIELD_NUMBER = 1;
        private int bitField0_;
        private long durationMs_;
        private float frameRate_;
        private int viewerMode_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ExitViewerMode$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements ExitViewerModeOrBuilder {
            private Builder() {
                super(ExitViewerMode.DEFAULT_INSTANCE);
            }

            public Builder clearDurationMs() {
                copyOnWrite();
                ((ExitViewerMode) this.instance).clearDurationMs();
                return this;
            }

            public Builder clearFrameRate() {
                copyOnWrite();
                ((ExitViewerMode) this.instance).clearFrameRate();
                return this;
            }

            public Builder clearViewerMode() {
                copyOnWrite();
                ((ExitViewerMode) this.instance).clearViewerMode();
                return this;
            }

            public long getDurationMs() {
                return ((ExitViewerMode) this.instance).getDurationMs();
            }

            public float getFrameRate() {
                return ((ExitViewerMode) this.instance).getFrameRate();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode getViewerMode() {
                return ((ExitViewerMode) this.instance).getViewerMode();
            }

            public boolean hasDurationMs() {
                return ((ExitViewerMode) this.instance).hasDurationMs();
            }

            public boolean hasFrameRate() {
                return ((ExitViewerMode) this.instance).hasFrameRate();
            }

            public boolean hasViewerMode() {
                return ((ExitViewerMode) this.instance).hasViewerMode();
            }

            public Builder setDurationMs(long j) {
                copyOnWrite();
                ((ExitViewerMode) this.instance).setDurationMs(j);
                return this;
            }

            public Builder setFrameRate(float f) {
                copyOnWrite();
                ((ExitViewerMode) this.instance).setFrameRate(f);
                return this;
            }

            public Builder setViewerMode(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode viewerMode) {
                copyOnWrite();
                ((ExitViewerMode) this.instance).setViewerMode(viewerMode);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            ExitViewerMode exitViewerMode = new ExitViewerMode();
            DEFAULT_INSTANCE = exitViewerMode;
            C62942bv.registerDefaultInstance(ExitViewerMode.class, exitViewerMode);
        }

        private ExitViewerMode() {
        }

        /* access modifiers changed from: private */
        public void clearDurationMs() {
            this.bitField0_ &= -3;
            this.durationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrameRate() {
            this.bitField0_ &= -5;
            this.frameRate_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearViewerMode() {
            this.bitField0_ &= -2;
            this.viewerMode_ = 0;
        }

        public static ExitViewerMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExitViewerMode parseDelimitedFrom(InputStream inputStream) {
            return (ExitViewerMode) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExitViewerMode parseFrom(C63088z zVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDurationMs(long j) {
            this.bitField0_ |= 2;
            this.durationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setFrameRate(float f) {
            this.bitField0_ |= 4;
            this.frameRate_ = f;
        }

        /* access modifiers changed from: private */
        public void setViewerMode(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode viewerMode) {
            this.viewerMode_ = viewerMode.getNumber();
            this.bitField0_ |= 1;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "viewerMode_", ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.internalGetVerifier(), "durationMs_", "frameRate_"});
                case 3:
                    return new ExitViewerMode();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (ExitViewerMode.class) {
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

        public long getDurationMs() {
            return this.durationMs_;
        }

        public float getFrameRate() {
            return this.frameRate_;
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode getViewerMode() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.forNumber(this.viewerMode_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.VIEWER_MODE_UNKNOWN : forNumber;
        }

        public boolean hasDurationMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFrameRate() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasViewerMode() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ExitViewerMode exitViewerMode) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(exitViewerMode);
        }

        public static ExitViewerMode parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (ExitViewerMode) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ExitViewerMode parseFrom(C63088z zVar, C62921ba baVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static ExitViewerMode parseFrom(C62897ae aeVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static ExitViewerMode parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static ExitViewerMode parseFrom(InputStream inputStream) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static ExitViewerMode parseFrom(InputStream inputStream, C62921ba baVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ExitViewerMode parseFrom(ByteBuffer byteBuffer) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static ExitViewerMode parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static ExitViewerMode parseFrom(byte[] bArr) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static ExitViewerMode parseFrom(byte[] bArr, C62921ba baVar) {
            return (ExitViewerMode) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ExitViewerModeOrBuilder */
    /* compiled from: PG */
    public interface ExitViewerModeOrBuilder extends C63001dt {
        long getDurationMs();

        float getFrameRate();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode getViewerMode();

        boolean hasDurationMs();

        boolean hasFrameRate();

        boolean hasViewerMode();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingCancelled */
    /* compiled from: PG */
    public final class LoadingCancelled extends C62942bv implements LoadingCancelledOrBuilder {
        public static final int CANCELLATION_TIME_MS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final LoadingCancelled DEFAULT_INSTANCE;
        public static final int DOWNLOADED_BYTES_FIELD_NUMBER = 3;
        public static final int DOWNLOAD_DURATION_MS_FIELD_NUMBER = 4;
        public static final int FETCHING_MATERIALS_FINISHED_TIME_MS_FIELD_NUMBER = 6;
        public static final int LOADING_MODEL_FINISHED_TIME_MS_FIELD_NUMBER = 7;
        public static final int LOAD_PARSE_DURATION_MS_FIELD_NUMBER = 5;
        public static final int LOAD_STAGE_FIELD_NUMBER = 2;
        private static volatile C63010eb PARSER = null;
        public static final int READING_FILES_FINISHED_TIME_MS_FIELD_NUMBER = 8;
        private int bitField0_;
        private long cancellationTimeMs_;
        private long downloadDurationMs_;
        private long downloadedBytes_;
        private long fetchingMaterialsFinishedTimeMs_;
        private long loadParseDurationMs_;
        private int loadStage_;
        private long loadingModelFinishedTimeMs_;
        private long readingFilesFinishedTimeMs_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingCancelled$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements LoadingCancelledOrBuilder {
            private Builder() {
                super(LoadingCancelled.DEFAULT_INSTANCE);
            }

            public Builder clearCancellationTimeMs() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearCancellationTimeMs();
                return this;
            }

            public Builder clearDownloadDurationMs() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearDownloadDurationMs();
                return this;
            }

            public Builder clearDownloadedBytes() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearDownloadedBytes();
                return this;
            }

            public Builder clearFetchingMaterialsFinishedTimeMs() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearFetchingMaterialsFinishedTimeMs();
                return this;
            }

            public Builder clearLoadParseDurationMs() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearLoadParseDurationMs();
                return this;
            }

            public Builder clearLoadStage() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearLoadStage();
                return this;
            }

            public Builder clearLoadingModelFinishedTimeMs() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearLoadingModelFinishedTimeMs();
                return this;
            }

            public Builder clearReadingFilesFinishedTimeMs() {
                copyOnWrite();
                ((LoadingCancelled) this.instance).clearReadingFilesFinishedTimeMs();
                return this;
            }

            public long getCancellationTimeMs() {
                return ((LoadingCancelled) this.instance).getCancellationTimeMs();
            }

            public long getDownloadDurationMs() {
                return ((LoadingCancelled) this.instance).getDownloadDurationMs();
            }

            public long getDownloadedBytes() {
                return ((LoadingCancelled) this.instance).getDownloadedBytes();
            }

            public long getFetchingMaterialsFinishedTimeMs() {
                return ((LoadingCancelled) this.instance).getFetchingMaterialsFinishedTimeMs();
            }

            public long getLoadParseDurationMs() {
                return ((LoadingCancelled) this.instance).getLoadParseDurationMs();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage getLoadStage() {
                return ((LoadingCancelled) this.instance).getLoadStage();
            }

            public long getLoadingModelFinishedTimeMs() {
                return ((LoadingCancelled) this.instance).getLoadingModelFinishedTimeMs();
            }

            public long getReadingFilesFinishedTimeMs() {
                return ((LoadingCancelled) this.instance).getReadingFilesFinishedTimeMs();
            }

            public boolean hasCancellationTimeMs() {
                return ((LoadingCancelled) this.instance).hasCancellationTimeMs();
            }

            public boolean hasDownloadDurationMs() {
                return ((LoadingCancelled) this.instance).hasDownloadDurationMs();
            }

            public boolean hasDownloadedBytes() {
                return ((LoadingCancelled) this.instance).hasDownloadedBytes();
            }

            public boolean hasFetchingMaterialsFinishedTimeMs() {
                return ((LoadingCancelled) this.instance).hasFetchingMaterialsFinishedTimeMs();
            }

            public boolean hasLoadParseDurationMs() {
                return ((LoadingCancelled) this.instance).hasLoadParseDurationMs();
            }

            public boolean hasLoadStage() {
                return ((LoadingCancelled) this.instance).hasLoadStage();
            }

            public boolean hasLoadingModelFinishedTimeMs() {
                return ((LoadingCancelled) this.instance).hasLoadingModelFinishedTimeMs();
            }

            public boolean hasReadingFilesFinishedTimeMs() {
                return ((LoadingCancelled) this.instance).hasReadingFilesFinishedTimeMs();
            }

            public Builder setCancellationTimeMs(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setCancellationTimeMs(j);
                return this;
            }

            public Builder setDownloadDurationMs(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setDownloadDurationMs(j);
                return this;
            }

            public Builder setDownloadedBytes(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setDownloadedBytes(j);
                return this;
            }

            public Builder setFetchingMaterialsFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setFetchingMaterialsFinishedTimeMs(j);
                return this;
            }

            public Builder setLoadParseDurationMs(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setLoadParseDurationMs(j);
                return this;
            }

            public Builder setLoadStage(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage loadStage) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setLoadStage(loadStage);
                return this;
            }

            public Builder setLoadingModelFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setLoadingModelFinishedTimeMs(j);
                return this;
            }

            public Builder setReadingFilesFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingCancelled) this.instance).setReadingFilesFinishedTimeMs(j);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            LoadingCancelled loadingCancelled = new LoadingCancelled();
            DEFAULT_INSTANCE = loadingCancelled;
            C62942bv.registerDefaultInstance(LoadingCancelled.class, loadingCancelled);
        }

        private LoadingCancelled() {
        }

        /* access modifiers changed from: private */
        public void clearCancellationTimeMs() {
            this.bitField0_ &= -2;
            this.cancellationTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownloadDurationMs() {
            this.bitField0_ &= -9;
            this.downloadDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownloadedBytes() {
            this.bitField0_ &= -5;
            this.downloadedBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFetchingMaterialsFinishedTimeMs() {
            this.bitField0_ &= -33;
            this.fetchingMaterialsFinishedTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadParseDurationMs() {
            this.bitField0_ &= -17;
            this.loadParseDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadStage() {
            this.bitField0_ &= -3;
            this.loadStage_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadingModelFinishedTimeMs() {
            this.bitField0_ &= -65;
            this.loadingModelFinishedTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReadingFilesFinishedTimeMs() {
            this.bitField0_ &= -129;
            this.readingFilesFinishedTimeMs_ = 0;
        }

        public static LoadingCancelled getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LoadingCancelled parseDelimitedFrom(InputStream inputStream) {
            return (LoadingCancelled) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoadingCancelled parseFrom(C63088z zVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCancellationTimeMs(long j) {
            this.bitField0_ |= 1;
            this.cancellationTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setDownloadDurationMs(long j) {
            this.bitField0_ |= 8;
            this.downloadDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setDownloadedBytes(long j) {
            this.bitField0_ |= 4;
            this.downloadedBytes_ = j;
        }

        /* access modifiers changed from: private */
        public void setFetchingMaterialsFinishedTimeMs(long j) {
            this.bitField0_ |= 32;
            this.fetchingMaterialsFinishedTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setLoadParseDurationMs(long j) {
            this.bitField0_ |= 16;
            this.loadParseDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setLoadStage(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage loadStage) {
            this.loadStage_ = loadStage.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setLoadingModelFinishedTimeMs(long j) {
            this.bitField0_ |= 64;
            this.loadingModelFinishedTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setReadingFilesFinishedTimeMs(long j) {
            this.bitField0_ |= 128;
            this.readingFilesFinishedTimeMs_ = j;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"bitField0_", "cancellationTimeMs_", "loadStage_", ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.internalGetVerifier(), "downloadedBytes_", "downloadDurationMs_", "loadParseDurationMs_", "fetchingMaterialsFinishedTimeMs_", "loadingModelFinishedTimeMs_", "readingFilesFinishedTimeMs_"});
                case 3:
                    return new LoadingCancelled();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (LoadingCancelled.class) {
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

        public long getCancellationTimeMs() {
            return this.cancellationTimeMs_;
        }

        public long getDownloadDurationMs() {
            return this.downloadDurationMs_;
        }

        public long getDownloadedBytes() {
            return this.downloadedBytes_;
        }

        public long getFetchingMaterialsFinishedTimeMs() {
            return this.fetchingMaterialsFinishedTimeMs_;
        }

        public long getLoadParseDurationMs() {
            return this.loadParseDurationMs_;
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage getLoadStage() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.forNumber(this.loadStage_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.LOAD_STAGE_NONE : forNumber;
        }

        public long getLoadingModelFinishedTimeMs() {
            return this.loadingModelFinishedTimeMs_;
        }

        public long getReadingFilesFinishedTimeMs() {
            return this.readingFilesFinishedTimeMs_;
        }

        public boolean hasCancellationTimeMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDownloadDurationMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDownloadedBytes() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFetchingMaterialsFinishedTimeMs() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasLoadParseDurationMs() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLoadStage() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLoadingModelFinishedTimeMs() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasReadingFilesFinishedTimeMs() {
            return (this.bitField0_ & 128) != 0;
        }

        public static Builder newBuilder(LoadingCancelled loadingCancelled) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(loadingCancelled);
        }

        public static LoadingCancelled parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (LoadingCancelled) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LoadingCancelled parseFrom(C63088z zVar, C62921ba baVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static LoadingCancelled parseFrom(C62897ae aeVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static LoadingCancelled parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static LoadingCancelled parseFrom(InputStream inputStream) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static LoadingCancelled parseFrom(InputStream inputStream, C62921ba baVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LoadingCancelled parseFrom(ByteBuffer byteBuffer) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static LoadingCancelled parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static LoadingCancelled parseFrom(byte[] bArr) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static LoadingCancelled parseFrom(byte[] bArr, C62921ba baVar) {
            return (LoadingCancelled) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingCancelledOrBuilder */
    /* compiled from: PG */
    public interface LoadingCancelledOrBuilder extends C63001dt {
        long getCancellationTimeMs();

        long getDownloadDurationMs();

        long getDownloadedBytes();

        long getFetchingMaterialsFinishedTimeMs();

        long getLoadParseDurationMs();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage getLoadStage();

        long getLoadingModelFinishedTimeMs();

        long getReadingFilesFinishedTimeMs();

        boolean hasCancellationTimeMs();

        boolean hasDownloadDurationMs();

        boolean hasDownloadedBytes();

        boolean hasFetchingMaterialsFinishedTimeMs();

        boolean hasLoadParseDurationMs();

        boolean hasLoadStage();

        boolean hasLoadingModelFinishedTimeMs();

        boolean hasReadingFilesFinishedTimeMs();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingError */
    /* compiled from: PG */
    public final class LoadingError extends C62942bv implements LoadingErrorOrBuilder {
        /* access modifiers changed from: private */
        public static final LoadingError DEFAULT_INSTANCE;
        public static final int DOWNLOADED_BYTES_FIELD_NUMBER = 5;
        public static final int DOWNLOAD_DURATION_MS_FIELD_NUMBER = 6;
        public static final int ERROR_REASON_FIELD_NUMBER = 1;
        public static final int ERROR_TIME_MS_FIELD_NUMBER = 3;
        public static final int EXCEPTION_FIELD_NUMBER = 2;
        public static final int FETCHING_MATERIALS_FINISHED_TIME_MS_FIELD_NUMBER = 8;
        public static final int LOADING_MODEL_FINISHED_TIME_MS_FIELD_NUMBER = 9;
        public static final int LOAD_PARSE_DURATION_MS_FIELD_NUMBER = 7;
        public static final int LOAD_STAGE_FIELD_NUMBER = 4;
        private static volatile C63010eb PARSER = null;
        public static final int READING_FILES_FINISHED_TIME_MS_FIELD_NUMBER = 10;
        private int bitField0_;
        private long downloadDurationMs_;
        private long downloadedBytes_;
        private int errorReason_;
        private long errorTimeMs_;
        private String exception_ = BuildConfig.FLAVOR;
        private long fetchingMaterialsFinishedTimeMs_;
        private long loadParseDurationMs_;
        private int loadStage_;
        private long loadingModelFinishedTimeMs_;
        private long readingFilesFinishedTimeMs_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingError$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements LoadingErrorOrBuilder {
            private Builder() {
                super(LoadingError.DEFAULT_INSTANCE);
            }

            public Builder clearDownloadDurationMs() {
                copyOnWrite();
                ((LoadingError) this.instance).clearDownloadDurationMs();
                return this;
            }

            public Builder clearDownloadedBytes() {
                copyOnWrite();
                ((LoadingError) this.instance).clearDownloadedBytes();
                return this;
            }

            public Builder clearErrorReason() {
                copyOnWrite();
                ((LoadingError) this.instance).clearErrorReason();
                return this;
            }

            public Builder clearErrorTimeMs() {
                copyOnWrite();
                ((LoadingError) this.instance).clearErrorTimeMs();
                return this;
            }

            public Builder clearException() {
                copyOnWrite();
                ((LoadingError) this.instance).clearException();
                return this;
            }

            public Builder clearFetchingMaterialsFinishedTimeMs() {
                copyOnWrite();
                ((LoadingError) this.instance).clearFetchingMaterialsFinishedTimeMs();
                return this;
            }

            public Builder clearLoadParseDurationMs() {
                copyOnWrite();
                ((LoadingError) this.instance).clearLoadParseDurationMs();
                return this;
            }

            public Builder clearLoadStage() {
                copyOnWrite();
                ((LoadingError) this.instance).clearLoadStage();
                return this;
            }

            public Builder clearLoadingModelFinishedTimeMs() {
                copyOnWrite();
                ((LoadingError) this.instance).clearLoadingModelFinishedTimeMs();
                return this;
            }

            public Builder clearReadingFilesFinishedTimeMs() {
                copyOnWrite();
                ((LoadingError) this.instance).clearReadingFilesFinishedTimeMs();
                return this;
            }

            public long getDownloadDurationMs() {
                return ((LoadingError) this.instance).getDownloadDurationMs();
            }

            public long getDownloadedBytes() {
                return ((LoadingError) this.instance).getDownloadedBytes();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason getErrorReason() {
                return ((LoadingError) this.instance).getErrorReason();
            }

            public long getErrorTimeMs() {
                return ((LoadingError) this.instance).getErrorTimeMs();
            }

            public String getException() {
                return ((LoadingError) this.instance).getException();
            }

            public C63088z getExceptionBytes() {
                return ((LoadingError) this.instance).getExceptionBytes();
            }

            public long getFetchingMaterialsFinishedTimeMs() {
                return ((LoadingError) this.instance).getFetchingMaterialsFinishedTimeMs();
            }

            public long getLoadParseDurationMs() {
                return ((LoadingError) this.instance).getLoadParseDurationMs();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage getLoadStage() {
                return ((LoadingError) this.instance).getLoadStage();
            }

            public long getLoadingModelFinishedTimeMs() {
                return ((LoadingError) this.instance).getLoadingModelFinishedTimeMs();
            }

            public long getReadingFilesFinishedTimeMs() {
                return ((LoadingError) this.instance).getReadingFilesFinishedTimeMs();
            }

            public boolean hasDownloadDurationMs() {
                return ((LoadingError) this.instance).hasDownloadDurationMs();
            }

            public boolean hasDownloadedBytes() {
                return ((LoadingError) this.instance).hasDownloadedBytes();
            }

            public boolean hasErrorReason() {
                return ((LoadingError) this.instance).hasErrorReason();
            }

            public boolean hasErrorTimeMs() {
                return ((LoadingError) this.instance).hasErrorTimeMs();
            }

            public boolean hasException() {
                return ((LoadingError) this.instance).hasException();
            }

            public boolean hasFetchingMaterialsFinishedTimeMs() {
                return ((LoadingError) this.instance).hasFetchingMaterialsFinishedTimeMs();
            }

            public boolean hasLoadParseDurationMs() {
                return ((LoadingError) this.instance).hasLoadParseDurationMs();
            }

            public boolean hasLoadStage() {
                return ((LoadingError) this.instance).hasLoadStage();
            }

            public boolean hasLoadingModelFinishedTimeMs() {
                return ((LoadingError) this.instance).hasLoadingModelFinishedTimeMs();
            }

            public boolean hasReadingFilesFinishedTimeMs() {
                return ((LoadingError) this.instance).hasReadingFilesFinishedTimeMs();
            }

            public Builder setDownloadDurationMs(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setDownloadDurationMs(j);
                return this;
            }

            public Builder setDownloadedBytes(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setDownloadedBytes(j);
                return this;
            }

            public Builder setErrorReason(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason loadErrorReason) {
                copyOnWrite();
                ((LoadingError) this.instance).setErrorReason(loadErrorReason);
                return this;
            }

            public Builder setErrorTimeMs(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setErrorTimeMs(j);
                return this;
            }

            public Builder setException(String str) {
                copyOnWrite();
                ((LoadingError) this.instance).setException(str);
                return this;
            }

            public Builder setExceptionBytes(C63088z zVar) {
                copyOnWrite();
                ((LoadingError) this.instance).setExceptionBytes(zVar);
                return this;
            }

            public Builder setFetchingMaterialsFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setFetchingMaterialsFinishedTimeMs(j);
                return this;
            }

            public Builder setLoadParseDurationMs(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setLoadParseDurationMs(j);
                return this;
            }

            public Builder setLoadStage(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage loadStage) {
                copyOnWrite();
                ((LoadingError) this.instance).setLoadStage(loadStage);
                return this;
            }

            public Builder setLoadingModelFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setLoadingModelFinishedTimeMs(j);
                return this;
            }

            public Builder setReadingFilesFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingError) this.instance).setReadingFilesFinishedTimeMs(j);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            LoadingError loadingError = new LoadingError();
            DEFAULT_INSTANCE = loadingError;
            C62942bv.registerDefaultInstance(LoadingError.class, loadingError);
        }

        private LoadingError() {
        }

        /* access modifiers changed from: private */
        public void clearDownloadDurationMs() {
            this.bitField0_ &= -33;
            this.downloadDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownloadedBytes() {
            this.bitField0_ &= -17;
            this.downloadedBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearErrorReason() {
            this.bitField0_ &= -2;
            this.errorReason_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearErrorTimeMs() {
            this.bitField0_ &= -5;
            this.errorTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearException() {
            this.bitField0_ &= -3;
            this.exception_ = getDefaultInstance().getException();
        }

        /* access modifiers changed from: private */
        public void clearFetchingMaterialsFinishedTimeMs() {
            this.bitField0_ &= -129;
            this.fetchingMaterialsFinishedTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadParseDurationMs() {
            this.bitField0_ &= -65;
            this.loadParseDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadStage() {
            this.bitField0_ &= -9;
            this.loadStage_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadingModelFinishedTimeMs() {
            this.bitField0_ &= -257;
            this.loadingModelFinishedTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReadingFilesFinishedTimeMs() {
            this.bitField0_ &= -513;
            this.readingFilesFinishedTimeMs_ = 0;
        }

        public static LoadingError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LoadingError parseDelimitedFrom(InputStream inputStream) {
            return (LoadingError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoadingError parseFrom(C63088z zVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDownloadDurationMs(long j) {
            this.bitField0_ |= 32;
            this.downloadDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setDownloadedBytes(long j) {
            this.bitField0_ |= 16;
            this.downloadedBytes_ = j;
        }

        /* access modifiers changed from: private */
        public void setErrorReason(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason loadErrorReason) {
            this.errorReason_ = loadErrorReason.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setErrorTimeMs(long j) {
            this.bitField0_ |= 4;
            this.errorTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setException(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.exception_ = str;
        }

        /* access modifiers changed from: private */
        public void setExceptionBytes(C63088z zVar) {
            this.exception_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setFetchingMaterialsFinishedTimeMs(long j) {
            this.bitField0_ |= 128;
            this.fetchingMaterialsFinishedTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setLoadParseDurationMs(long j) {
            this.bitField0_ |= 64;
            this.loadParseDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setLoadStage(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage loadStage) {
            this.loadStage_ = loadStage.getNumber();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setLoadingModelFinishedTimeMs(long j) {
            this.bitField0_ |= 256;
            this.loadingModelFinishedTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setReadingFilesFinishedTimeMs(long j) {
            this.bitField0_ |= 512;
            this.readingFilesFinishedTimeMs_ = j;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "errorReason_", ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason.internalGetVerifier(), "exception_", "errorTimeMs_", "loadStage_", ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.internalGetVerifier(), "downloadedBytes_", "downloadDurationMs_", "loadParseDurationMs_", "fetchingMaterialsFinishedTimeMs_", "loadingModelFinishedTimeMs_", "readingFilesFinishedTimeMs_"});
                case 3:
                    return new LoadingError();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (LoadingError.class) {
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

        public long getDownloadDurationMs() {
            return this.downloadDurationMs_;
        }

        public long getDownloadedBytes() {
            return this.downloadedBytes_;
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason getErrorReason() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason.forNumber(this.errorReason_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason.LOAD_ERROR_UNKNOWN : forNumber;
        }

        public long getErrorTimeMs() {
            return this.errorTimeMs_;
        }

        public String getException() {
            return this.exception_;
        }

        public C63088z getExceptionBytes() {
            return C63088z.m96143E(this.exception_);
        }

        public long getFetchingMaterialsFinishedTimeMs() {
            return this.fetchingMaterialsFinishedTimeMs_;
        }

        public long getLoadParseDurationMs() {
            return this.loadParseDurationMs_;
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage getLoadStage() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.forNumber(this.loadStage_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage.LOAD_STAGE_NONE : forNumber;
        }

        public long getLoadingModelFinishedTimeMs() {
            return this.loadingModelFinishedTimeMs_;
        }

        public long getReadingFilesFinishedTimeMs() {
            return this.readingFilesFinishedTimeMs_;
        }

        public boolean hasDownloadDurationMs() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDownloadedBytes() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasErrorReason() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasErrorTimeMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasException() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFetchingMaterialsFinishedTimeMs() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasLoadParseDurationMs() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasLoadStage() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasLoadingModelFinishedTimeMs() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasReadingFilesFinishedTimeMs() {
            return (this.bitField0_ & 512) != 0;
        }

        public static Builder newBuilder(LoadingError loadingError) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(loadingError);
        }

        public static LoadingError parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (LoadingError) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LoadingError parseFrom(C63088z zVar, C62921ba baVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static LoadingError parseFrom(C62897ae aeVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static LoadingError parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static LoadingError parseFrom(InputStream inputStream) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static LoadingError parseFrom(InputStream inputStream, C62921ba baVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LoadingError parseFrom(ByteBuffer byteBuffer) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static LoadingError parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static LoadingError parseFrom(byte[] bArr) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static LoadingError parseFrom(byte[] bArr, C62921ba baVar) {
            return (LoadingError) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingErrorOrBuilder */
    /* compiled from: PG */
    public interface LoadingErrorOrBuilder extends C63001dt {
        long getDownloadDurationMs();

        long getDownloadedBytes();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason getErrorReason();

        long getErrorTimeMs();

        String getException();

        C63088z getExceptionBytes();

        long getFetchingMaterialsFinishedTimeMs();

        long getLoadParseDurationMs();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadStage getLoadStage();

        long getLoadingModelFinishedTimeMs();

        long getReadingFilesFinishedTimeMs();

        boolean hasDownloadDurationMs();

        boolean hasDownloadedBytes();

        boolean hasErrorReason();

        boolean hasErrorTimeMs();

        boolean hasException();

        boolean hasFetchingMaterialsFinishedTimeMs();

        boolean hasLoadParseDurationMs();

        boolean hasLoadStage();

        boolean hasLoadingModelFinishedTimeMs();

        boolean hasReadingFilesFinishedTimeMs();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingFinished */
    /* compiled from: PG */
    public final class LoadingFinished extends C62942bv implements LoadingFinishedOrBuilder {
        /* access modifiers changed from: private */
        public static final LoadingFinished DEFAULT_INSTANCE;
        public static final int DOWNLOADED_BYTES_FIELD_NUMBER = 4;
        public static final int DOWNLOAD_TIME_MS_FIELD_NUMBER = 1;
        public static final int E2E_TIME_MS_FIELD_NUMBER = 3;
        public static final int FETCHING_MATERIALS_FINISHED_TIME_MS_FIELD_NUMBER = 5;
        public static final int LOADING_MODEL_FINISHED_TIME_MS_FIELD_NUMBER = 6;
        public static final int LOAD_TIME_MS_FIELD_NUMBER = 2;
        public static final int MODEL_SIZE_METERS_FIELD_NUMBER = 8;
        private static volatile C63010eb PARSER = null;
        public static final int READING_FILES_FINISHED_TIME_MS_FIELD_NUMBER = 7;
        private int bitField0_;
        private long downloadTimeMs_;
        private long downloadedBytes_;
        private long e2ETimeMs_;
        private long fetchingMaterialsFinishedTimeMs_;
        private long loadTimeMs_;
        private long loadingModelFinishedTimeMs_;
        private float modelSizeMeters_;
        private long readingFilesFinishedTimeMs_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingFinished$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements LoadingFinishedOrBuilder {
            private Builder() {
                super(LoadingFinished.DEFAULT_INSTANCE);
            }

            public Builder clearDownloadTimeMs() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearDownloadTimeMs();
                return this;
            }

            public Builder clearDownloadedBytes() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearDownloadedBytes();
                return this;
            }

            public Builder clearE2ETimeMs() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearE2ETimeMs();
                return this;
            }

            public Builder clearFetchingMaterialsFinishedTimeMs() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearFetchingMaterialsFinishedTimeMs();
                return this;
            }

            public Builder clearLoadTimeMs() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearLoadTimeMs();
                return this;
            }

            public Builder clearLoadingModelFinishedTimeMs() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearLoadingModelFinishedTimeMs();
                return this;
            }

            public Builder clearModelSizeMeters() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearModelSizeMeters();
                return this;
            }

            public Builder clearReadingFilesFinishedTimeMs() {
                copyOnWrite();
                ((LoadingFinished) this.instance).clearReadingFilesFinishedTimeMs();
                return this;
            }

            public long getDownloadTimeMs() {
                return ((LoadingFinished) this.instance).getDownloadTimeMs();
            }

            public long getDownloadedBytes() {
                return ((LoadingFinished) this.instance).getDownloadedBytes();
            }

            public long getE2ETimeMs() {
                return ((LoadingFinished) this.instance).getE2ETimeMs();
            }

            public long getFetchingMaterialsFinishedTimeMs() {
                return ((LoadingFinished) this.instance).getFetchingMaterialsFinishedTimeMs();
            }

            public long getLoadTimeMs() {
                return ((LoadingFinished) this.instance).getLoadTimeMs();
            }

            public long getLoadingModelFinishedTimeMs() {
                return ((LoadingFinished) this.instance).getLoadingModelFinishedTimeMs();
            }

            public float getModelSizeMeters() {
                return ((LoadingFinished) this.instance).getModelSizeMeters();
            }

            public long getReadingFilesFinishedTimeMs() {
                return ((LoadingFinished) this.instance).getReadingFilesFinishedTimeMs();
            }

            public boolean hasDownloadTimeMs() {
                return ((LoadingFinished) this.instance).hasDownloadTimeMs();
            }

            public boolean hasDownloadedBytes() {
                return ((LoadingFinished) this.instance).hasDownloadedBytes();
            }

            public boolean hasE2ETimeMs() {
                return ((LoadingFinished) this.instance).hasE2ETimeMs();
            }

            public boolean hasFetchingMaterialsFinishedTimeMs() {
                return ((LoadingFinished) this.instance).hasFetchingMaterialsFinishedTimeMs();
            }

            public boolean hasLoadTimeMs() {
                return ((LoadingFinished) this.instance).hasLoadTimeMs();
            }

            public boolean hasLoadingModelFinishedTimeMs() {
                return ((LoadingFinished) this.instance).hasLoadingModelFinishedTimeMs();
            }

            public boolean hasModelSizeMeters() {
                return ((LoadingFinished) this.instance).hasModelSizeMeters();
            }

            public boolean hasReadingFilesFinishedTimeMs() {
                return ((LoadingFinished) this.instance).hasReadingFilesFinishedTimeMs();
            }

            public Builder setDownloadTimeMs(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setDownloadTimeMs(j);
                return this;
            }

            public Builder setDownloadedBytes(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setDownloadedBytes(j);
                return this;
            }

            public Builder setE2ETimeMs(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setE2ETimeMs(j);
                return this;
            }

            public Builder setFetchingMaterialsFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setFetchingMaterialsFinishedTimeMs(j);
                return this;
            }

            public Builder setLoadTimeMs(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setLoadTimeMs(j);
                return this;
            }

            public Builder setLoadingModelFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setLoadingModelFinishedTimeMs(j);
                return this;
            }

            public Builder setModelSizeMeters(float f) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setModelSizeMeters(f);
                return this;
            }

            public Builder setReadingFilesFinishedTimeMs(long j) {
                copyOnWrite();
                ((LoadingFinished) this.instance).setReadingFilesFinishedTimeMs(j);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            LoadingFinished loadingFinished = new LoadingFinished();
            DEFAULT_INSTANCE = loadingFinished;
            C62942bv.registerDefaultInstance(LoadingFinished.class, loadingFinished);
        }

        private LoadingFinished() {
        }

        /* access modifiers changed from: private */
        public void clearDownloadTimeMs() {
            this.bitField0_ &= -2;
            this.downloadTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownloadedBytes() {
            this.bitField0_ &= -9;
            this.downloadedBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearE2ETimeMs() {
            this.bitField0_ &= -5;
            this.e2ETimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFetchingMaterialsFinishedTimeMs() {
            this.bitField0_ &= -17;
            this.fetchingMaterialsFinishedTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadTimeMs() {
            this.bitField0_ &= -3;
            this.loadTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadingModelFinishedTimeMs() {
            this.bitField0_ &= -33;
            this.loadingModelFinishedTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearModelSizeMeters() {
            this.bitField0_ &= -129;
            this.modelSizeMeters_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearReadingFilesFinishedTimeMs() {
            this.bitField0_ &= -65;
            this.readingFilesFinishedTimeMs_ = 0;
        }

        public static LoadingFinished getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static LoadingFinished parseDelimitedFrom(InputStream inputStream) {
            return (LoadingFinished) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static LoadingFinished parseFrom(C63088z zVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDownloadTimeMs(long j) {
            this.bitField0_ |= 1;
            this.downloadTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setDownloadedBytes(long j) {
            this.bitField0_ |= 8;
            this.downloadedBytes_ = j;
        }

        /* access modifiers changed from: private */
        public void setE2ETimeMs(long j) {
            this.bitField0_ |= 4;
            this.e2ETimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setFetchingMaterialsFinishedTimeMs(long j) {
            this.bitField0_ |= 16;
            this.fetchingMaterialsFinishedTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setLoadTimeMs(long j) {
            this.bitField0_ |= 2;
            this.loadTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setLoadingModelFinishedTimeMs(long j) {
            this.bitField0_ |= 32;
            this.loadingModelFinishedTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setModelSizeMeters(float f) {
            this.bitField0_ |= 128;
            this.modelSizeMeters_ = f;
        }

        /* access modifiers changed from: private */
        public void setReadingFilesFinishedTimeMs(long j) {
            this.bitField0_ |= 64;
            this.readingFilesFinishedTimeMs_ = j;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bခ\u0007", new Object[]{"bitField0_", "downloadTimeMs_", "loadTimeMs_", "e2ETimeMs_", "downloadedBytes_", "fetchingMaterialsFinishedTimeMs_", "loadingModelFinishedTimeMs_", "readingFilesFinishedTimeMs_", "modelSizeMeters_"});
                case 3:
                    return new LoadingFinished();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (LoadingFinished.class) {
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

        public long getDownloadTimeMs() {
            return this.downloadTimeMs_;
        }

        public long getDownloadedBytes() {
            return this.downloadedBytes_;
        }

        public long getE2ETimeMs() {
            return this.e2ETimeMs_;
        }

        public long getFetchingMaterialsFinishedTimeMs() {
            return this.fetchingMaterialsFinishedTimeMs_;
        }

        public long getLoadTimeMs() {
            return this.loadTimeMs_;
        }

        public long getLoadingModelFinishedTimeMs() {
            return this.loadingModelFinishedTimeMs_;
        }

        public float getModelSizeMeters() {
            return this.modelSizeMeters_;
        }

        public long getReadingFilesFinishedTimeMs() {
            return this.readingFilesFinishedTimeMs_;
        }

        public boolean hasDownloadTimeMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDownloadedBytes() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasE2ETimeMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFetchingMaterialsFinishedTimeMs() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLoadTimeMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLoadingModelFinishedTimeMs() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasModelSizeMeters() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasReadingFilesFinishedTimeMs() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(LoadingFinished loadingFinished) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(loadingFinished);
        }

        public static LoadingFinished parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (LoadingFinished) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LoadingFinished parseFrom(C63088z zVar, C62921ba baVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static LoadingFinished parseFrom(C62897ae aeVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static LoadingFinished parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static LoadingFinished parseFrom(InputStream inputStream) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static LoadingFinished parseFrom(InputStream inputStream, C62921ba baVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static LoadingFinished parseFrom(ByteBuffer byteBuffer) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static LoadingFinished parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static LoadingFinished parseFrom(byte[] bArr) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static LoadingFinished parseFrom(byte[] bArr, C62921ba baVar) {
            return (LoadingFinished) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$LoadingFinishedOrBuilder */
    /* compiled from: PG */
    public interface LoadingFinishedOrBuilder extends C63001dt {
        long getDownloadTimeMs();

        long getDownloadedBytes();

        long getE2ETimeMs();

        long getFetchingMaterialsFinishedTimeMs();

        long getLoadTimeMs();

        long getLoadingModelFinishedTimeMs();

        float getModelSizeMeters();

        long getReadingFilesFinishedTimeMs();

        boolean hasDownloadTimeMs();

        boolean hasDownloadedBytes();

        boolean hasE2ETimeMs();

        boolean hasFetchingMaterialsFinishedTimeMs();

        boolean hasLoadTimeMs();

        boolean hasLoadingModelFinishedTimeMs();

        boolean hasModelSizeMeters();

        boolean hasReadingFilesFinishedTimeMs();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$Params */
    /* compiled from: PG */
    public final class Params extends C62942bv implements ParamsOrBuilder {
        public static final int APP_SESSION_ID_FIELD_NUMBER = 8;
        /* access modifiers changed from: private */
        public static final Params DEFAULT_INSTANCE;
        public static final int LINK_URL_FIELD_NUMBER = 2;
        public static final int MODEL_URL_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER = null;
        public static final int REFERRER_FIELD_NUMBER = 5;
        public static final int RESIZABLE_FIELD_NUMBER = 7;
        public static final int SHARE_TEXT_FIELD_NUMBER = 9;
        public static final int SOUND_URL_FIELD_NUMBER = 4;
        public static final int TITLE_FIELD_NUMBER = 3;
        public static final int VIEWER_CLIENT_VERSION_FIELD_NUMBER = 6;
        private String appSessionId_ = BuildConfig.FLAVOR;
        private int bitField0_;
        private String linkUrl_ = BuildConfig.FLAVOR;
        private String modelUrl_ = BuildConfig.FLAVOR;
        private String referrer_ = BuildConfig.FLAVOR;
        private boolean resizable_;
        private String shareText_ = BuildConfig.FLAVOR;
        private String soundUrl_ = BuildConfig.FLAVOR;
        private String title_ = BuildConfig.FLAVOR;
        private int viewerClientVersion_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$Params$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements ParamsOrBuilder {
            private Builder() {
                super(Params.DEFAULT_INSTANCE);
            }

            public Builder clearAppSessionId() {
                copyOnWrite();
                ((Params) this.instance).clearAppSessionId();
                return this;
            }

            public Builder clearLinkUrl() {
                copyOnWrite();
                ((Params) this.instance).clearLinkUrl();
                return this;
            }

            public Builder clearModelUrl() {
                copyOnWrite();
                ((Params) this.instance).clearModelUrl();
                return this;
            }

            public Builder clearReferrer() {
                copyOnWrite();
                ((Params) this.instance).clearReferrer();
                return this;
            }

            public Builder clearResizable() {
                copyOnWrite();
                ((Params) this.instance).clearResizable();
                return this;
            }

            public Builder clearShareText() {
                copyOnWrite();
                ((Params) this.instance).clearShareText();
                return this;
            }

            public Builder clearSoundUrl() {
                copyOnWrite();
                ((Params) this.instance).clearSoundUrl();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((Params) this.instance).clearTitle();
                return this;
            }

            public Builder clearViewerClientVersion() {
                copyOnWrite();
                ((Params) this.instance).clearViewerClientVersion();
                return this;
            }

            public String getAppSessionId() {
                return ((Params) this.instance).getAppSessionId();
            }

            public C63088z getAppSessionIdBytes() {
                return ((Params) this.instance).getAppSessionIdBytes();
            }

            public String getLinkUrl() {
                return ((Params) this.instance).getLinkUrl();
            }

            public C63088z getLinkUrlBytes() {
                return ((Params) this.instance).getLinkUrlBytes();
            }

            public String getModelUrl() {
                return ((Params) this.instance).getModelUrl();
            }

            public C63088z getModelUrlBytes() {
                return ((Params) this.instance).getModelUrlBytes();
            }

            public String getReferrer() {
                return ((Params) this.instance).getReferrer();
            }

            public C63088z getReferrerBytes() {
                return ((Params) this.instance).getReferrerBytes();
            }

            public boolean getResizable() {
                return ((Params) this.instance).getResizable();
            }

            public String getShareText() {
                return ((Params) this.instance).getShareText();
            }

            public C63088z getShareTextBytes() {
                return ((Params) this.instance).getShareTextBytes();
            }

            public String getSoundUrl() {
                return ((Params) this.instance).getSoundUrl();
            }

            public C63088z getSoundUrlBytes() {
                return ((Params) this.instance).getSoundUrlBytes();
            }

            public String getTitle() {
                return ((Params) this.instance).getTitle();
            }

            public C63088z getTitleBytes() {
                return ((Params) this.instance).getTitleBytes();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion getViewerClientVersion() {
                return ((Params) this.instance).getViewerClientVersion();
            }

            public boolean hasAppSessionId() {
                return ((Params) this.instance).hasAppSessionId();
            }

            public boolean hasLinkUrl() {
                return ((Params) this.instance).hasLinkUrl();
            }

            public boolean hasModelUrl() {
                return ((Params) this.instance).hasModelUrl();
            }

            public boolean hasReferrer() {
                return ((Params) this.instance).hasReferrer();
            }

            public boolean hasResizable() {
                return ((Params) this.instance).hasResizable();
            }

            public boolean hasShareText() {
                return ((Params) this.instance).hasShareText();
            }

            public boolean hasSoundUrl() {
                return ((Params) this.instance).hasSoundUrl();
            }

            public boolean hasTitle() {
                return ((Params) this.instance).hasTitle();
            }

            public boolean hasViewerClientVersion() {
                return ((Params) this.instance).hasViewerClientVersion();
            }

            public Builder setAppSessionId(String str) {
                copyOnWrite();
                ((Params) this.instance).setAppSessionId(str);
                return this;
            }

            public Builder setAppSessionIdBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setAppSessionIdBytes(zVar);
                return this;
            }

            public Builder setLinkUrl(String str) {
                copyOnWrite();
                ((Params) this.instance).setLinkUrl(str);
                return this;
            }

            public Builder setLinkUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setLinkUrlBytes(zVar);
                return this;
            }

            public Builder setModelUrl(String str) {
                copyOnWrite();
                ((Params) this.instance).setModelUrl(str);
                return this;
            }

            public Builder setModelUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setModelUrlBytes(zVar);
                return this;
            }

            public Builder setReferrer(String str) {
                copyOnWrite();
                ((Params) this.instance).setReferrer(str);
                return this;
            }

            public Builder setReferrerBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setReferrerBytes(zVar);
                return this;
            }

            public Builder setResizable(boolean z) {
                copyOnWrite();
                ((Params) this.instance).setResizable(z);
                return this;
            }

            public Builder setShareText(String str) {
                copyOnWrite();
                ((Params) this.instance).setShareText(str);
                return this;
            }

            public Builder setShareTextBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setShareTextBytes(zVar);
                return this;
            }

            public Builder setSoundUrl(String str) {
                copyOnWrite();
                ((Params) this.instance).setSoundUrl(str);
                return this;
            }

            public Builder setSoundUrlBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setSoundUrlBytes(zVar);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((Params) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C63088z zVar) {
                copyOnWrite();
                ((Params) this.instance).setTitleBytes(zVar);
                return this;
            }

            public Builder setViewerClientVersion(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion viewerClientVersion) {
                copyOnWrite();
                ((Params) this.instance).setViewerClientVersion(viewerClientVersion);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            Params params = new Params();
            DEFAULT_INSTANCE = params;
            C62942bv.registerDefaultInstance(Params.class, params);
        }

        private Params() {
        }

        /* access modifiers changed from: private */
        public void clearAppSessionId() {
            this.bitField0_ &= -129;
            this.appSessionId_ = getDefaultInstance().getAppSessionId();
        }

        /* access modifiers changed from: private */
        public void clearLinkUrl() {
            this.bitField0_ &= -3;
            this.linkUrl_ = getDefaultInstance().getLinkUrl();
        }

        /* access modifiers changed from: private */
        public void clearModelUrl() {
            this.bitField0_ &= -2;
            this.modelUrl_ = getDefaultInstance().getModelUrl();
        }

        /* access modifiers changed from: private */
        public void clearReferrer() {
            this.bitField0_ &= -17;
            this.referrer_ = getDefaultInstance().getReferrer();
        }

        /* access modifiers changed from: private */
        public void clearResizable() {
            this.bitField0_ &= -65;
            this.resizable_ = false;
        }

        /* access modifiers changed from: private */
        public void clearShareText() {
            this.bitField0_ &= -257;
            this.shareText_ = getDefaultInstance().getShareText();
        }

        /* access modifiers changed from: private */
        public void clearSoundUrl() {
            this.bitField0_ &= -9;
            this.soundUrl_ = getDefaultInstance().getSoundUrl();
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -5;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearViewerClientVersion() {
            this.bitField0_ &= -33;
            this.viewerClientVersion_ = 0;
        }

        public static Params getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Params parseDelimitedFrom(InputStream inputStream) {
            return (Params) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Params parseFrom(C63088z zVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.appSessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppSessionIdBytes(C63088z zVar) {
            this.appSessionId_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setLinkUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.linkUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setLinkUrlBytes(C63088z zVar) {
            this.linkUrl_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setModelUrl(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.modelUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setModelUrlBytes(C63088z zVar) {
            this.modelUrl_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setReferrer(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.referrer_ = str;
        }

        /* access modifiers changed from: private */
        public void setReferrerBytes(C63088z zVar) {
            this.referrer_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setResizable(boolean z) {
            this.bitField0_ |= 64;
            this.resizable_ = z;
        }

        /* access modifiers changed from: private */
        public void setShareText(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.shareText_ = str;
        }

        /* access modifiers changed from: private */
        public void setShareTextBytes(C63088z zVar) {
            this.shareText_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setSoundUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.soundUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setSoundUrlBytes(C63088z zVar) {
            this.soundUrl_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setTitle(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.title_ = str;
        }

        /* access modifiers changed from: private */
        public void setTitleBytes(C63088z zVar) {
            this.title_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setViewerClientVersion(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion viewerClientVersion) {
            this.viewerClientVersion_ = viewerClientVersion.getNumber();
            this.bitField0_ |= 32;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဈ\u0007\tဈ\b", new Object[]{"bitField0_", "modelUrl_", "linkUrl_", "title_", "soundUrl_", "referrer_", "viewerClientVersion_", ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.internalGetVerifier(), "resizable_", "appSessionId_", "shareText_"});
                case 3:
                    return new Params();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (Params.class) {
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

        public String getAppSessionId() {
            return this.appSessionId_;
        }

        public C63088z getAppSessionIdBytes() {
            return C63088z.m96143E(this.appSessionId_);
        }

        public String getLinkUrl() {
            return this.linkUrl_;
        }

        public C63088z getLinkUrlBytes() {
            return C63088z.m96143E(this.linkUrl_);
        }

        public String getModelUrl() {
            return this.modelUrl_;
        }

        public C63088z getModelUrlBytes() {
            return C63088z.m96143E(this.modelUrl_);
        }

        public String getReferrer() {
            return this.referrer_;
        }

        public C63088z getReferrerBytes() {
            return C63088z.m96143E(this.referrer_);
        }

        public boolean getResizable() {
            return this.resizable_;
        }

        public String getShareText() {
            return this.shareText_;
        }

        public C63088z getShareTextBytes() {
            return C63088z.m96143E(this.shareText_);
        }

        public String getSoundUrl() {
            return this.soundUrl_;
        }

        public C63088z getSoundUrlBytes() {
            return C63088z.m96143E(this.soundUrl_);
        }

        public String getTitle() {
            return this.title_;
        }

        public C63088z getTitleBytes() {
            return C63088z.m96143E(this.title_);
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion getViewerClientVersion() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.forNumber(this.viewerClientVersion_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion.VIEWER_CLIENT_VERSION_UNKNOWN : forNumber;
        }

        public boolean hasAppSessionId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasLinkUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasModelUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasReferrer() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasResizable() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasShareText() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSoundUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasViewerClientVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(Params params) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(params);
        }

        public static Params parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (Params) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Params parseFrom(C63088z zVar, C62921ba baVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static Params parseFrom(C62897ae aeVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static Params parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static Params parseFrom(InputStream inputStream) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static Params parseFrom(InputStream inputStream, C62921ba baVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static Params parseFrom(ByteBuffer byteBuffer) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static Params parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static Params parseFrom(byte[] bArr) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static Params parseFrom(byte[] bArr, C62921ba baVar) {
            return (Params) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ParamsOrBuilder */
    /* compiled from: PG */
    public interface ParamsOrBuilder extends C63001dt {
        String getAppSessionId();

        C63088z getAppSessionIdBytes();

        String getLinkUrl();

        C63088z getLinkUrlBytes();

        String getModelUrl();

        C63088z getModelUrlBytes();

        String getReferrer();

        C63088z getReferrerBytes();

        boolean getResizable();

        String getShareText();

        C63088z getShareTextBytes();

        String getSoundUrl();

        C63088z getSoundUrlBytes();

        String getTitle();

        C63088z getTitleBytes();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion getViewerClientVersion();

        boolean hasAppSessionId();

        boolean hasLinkUrl();

        boolean hasModelUrl();

        boolean hasReferrer();

        boolean hasResizable();

        boolean hasShareText();

        boolean hasSoundUrl();

        boolean hasTitle();

        boolean hasViewerClientVersion();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$SessionAnalytics */
    /* compiled from: PG */
    public final class SessionAnalytics extends C62942bv implements SessionAnalyticsOrBuilder {
        /* access modifiers changed from: private */
        public static final SessionAnalytics DEFAULT_INSTANCE;
        public static final int LANDSCAPE_MODE_DURATION_MS_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER = null;
        public static final int PORTRAIT_MODE_DURATION_MS_FIELD_NUMBER = 2;
        private int bitField0_;
        private long landscapeModeDurationMs_;
        private long portraitModeDurationMs_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$SessionAnalytics$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements SessionAnalyticsOrBuilder {
            private Builder() {
                super(SessionAnalytics.DEFAULT_INSTANCE);
            }

            public Builder clearLandscapeModeDurationMs() {
                copyOnWrite();
                ((SessionAnalytics) this.instance).clearLandscapeModeDurationMs();
                return this;
            }

            public Builder clearPortraitModeDurationMs() {
                copyOnWrite();
                ((SessionAnalytics) this.instance).clearPortraitModeDurationMs();
                return this;
            }

            public long getLandscapeModeDurationMs() {
                return ((SessionAnalytics) this.instance).getLandscapeModeDurationMs();
            }

            public long getPortraitModeDurationMs() {
                return ((SessionAnalytics) this.instance).getPortraitModeDurationMs();
            }

            public boolean hasLandscapeModeDurationMs() {
                return ((SessionAnalytics) this.instance).hasLandscapeModeDurationMs();
            }

            public boolean hasPortraitModeDurationMs() {
                return ((SessionAnalytics) this.instance).hasPortraitModeDurationMs();
            }

            public Builder setLandscapeModeDurationMs(long j) {
                copyOnWrite();
                ((SessionAnalytics) this.instance).setLandscapeModeDurationMs(j);
                return this;
            }

            public Builder setPortraitModeDurationMs(long j) {
                copyOnWrite();
                ((SessionAnalytics) this.instance).setPortraitModeDurationMs(j);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            SessionAnalytics sessionAnalytics = new SessionAnalytics();
            DEFAULT_INSTANCE = sessionAnalytics;
            C62942bv.registerDefaultInstance(SessionAnalytics.class, sessionAnalytics);
        }

        private SessionAnalytics() {
        }

        /* access modifiers changed from: private */
        public void clearLandscapeModeDurationMs() {
            this.bitField0_ &= -2;
            this.landscapeModeDurationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPortraitModeDurationMs() {
            this.bitField0_ &= -3;
            this.portraitModeDurationMs_ = 0;
        }

        public static SessionAnalytics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionAnalytics parseDelimitedFrom(InputStream inputStream) {
            return (SessionAnalytics) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionAnalytics parseFrom(C63088z zVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLandscapeModeDurationMs(long j) {
            this.bitField0_ |= 1;
            this.landscapeModeDurationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setPortraitModeDurationMs(long j) {
            this.bitField0_ |= 2;
            this.portraitModeDurationMs_ = j;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "landscapeModeDurationMs_", "portraitModeDurationMs_"});
                case 3:
                    return new SessionAnalytics();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (SessionAnalytics.class) {
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

        public long getLandscapeModeDurationMs() {
            return this.landscapeModeDurationMs_;
        }

        public long getPortraitModeDurationMs() {
            return this.portraitModeDurationMs_;
        }

        public boolean hasLandscapeModeDurationMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPortraitModeDurationMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(SessionAnalytics sessionAnalytics) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sessionAnalytics);
        }

        public static SessionAnalytics parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (SessionAnalytics) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SessionAnalytics parseFrom(C63088z zVar, C62921ba baVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static SessionAnalytics parseFrom(C62897ae aeVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static SessionAnalytics parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static SessionAnalytics parseFrom(InputStream inputStream) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static SessionAnalytics parseFrom(InputStream inputStream, C62921ba baVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SessionAnalytics parseFrom(ByteBuffer byteBuffer) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static SessionAnalytics parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static SessionAnalytics parseFrom(byte[] bArr) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static SessionAnalytics parseFrom(byte[] bArr, C62921ba baVar) {
            return (SessionAnalytics) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$SessionAnalyticsOrBuilder */
    /* compiled from: PG */
    public interface SessionAnalyticsOrBuilder extends C63001dt {
        long getLandscapeModeDurationMs();

        long getPortraitModeDurationMs();

        boolean hasLandscapeModeDurationMs();

        boolean hasPortraitModeDurationMs();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$SessionPaused */
    /* compiled from: PG */
    public final class SessionPaused extends C62942bv implements SessionPausedOrBuilder {
        /* access modifiers changed from: private */
        public static final SessionPaused DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 1;
        public static final int IS_IN_PERMISSION_FLOW_FIELD_NUMBER = 2;
        private static volatile C63010eb PARSER;
        private int bitField0_;
        private long durationMs_;
        private boolean isInPermissionFlow_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$SessionPaused$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements SessionPausedOrBuilder {
            private Builder() {
                super(SessionPaused.DEFAULT_INSTANCE);
            }

            public Builder clearDurationMs() {
                copyOnWrite();
                ((SessionPaused) this.instance).clearDurationMs();
                return this;
            }

            public Builder clearIsInPermissionFlow() {
                copyOnWrite();
                ((SessionPaused) this.instance).clearIsInPermissionFlow();
                return this;
            }

            public long getDurationMs() {
                return ((SessionPaused) this.instance).getDurationMs();
            }

            public boolean getIsInPermissionFlow() {
                return ((SessionPaused) this.instance).getIsInPermissionFlow();
            }

            public boolean hasDurationMs() {
                return ((SessionPaused) this.instance).hasDurationMs();
            }

            public boolean hasIsInPermissionFlow() {
                return ((SessionPaused) this.instance).hasIsInPermissionFlow();
            }

            public Builder setDurationMs(long j) {
                copyOnWrite();
                ((SessionPaused) this.instance).setDurationMs(j);
                return this;
            }

            public Builder setIsInPermissionFlow(boolean z) {
                copyOnWrite();
                ((SessionPaused) this.instance).setIsInPermissionFlow(z);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            SessionPaused sessionPaused = new SessionPaused();
            DEFAULT_INSTANCE = sessionPaused;
            C62942bv.registerDefaultInstance(SessionPaused.class, sessionPaused);
        }

        private SessionPaused() {
        }

        /* access modifiers changed from: private */
        public void clearDurationMs() {
            this.bitField0_ &= -2;
            this.durationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIsInPermissionFlow() {
            this.bitField0_ &= -3;
            this.isInPermissionFlow_ = false;
        }

        public static SessionPaused getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionPaused parseDelimitedFrom(InputStream inputStream) {
            return (SessionPaused) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionPaused parseFrom(C63088z zVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDurationMs(long j) {
            this.bitField0_ |= 1;
            this.durationMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setIsInPermissionFlow(boolean z) {
            this.bitField0_ |= 2;
            this.isInPermissionFlow_ = z;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "durationMs_", "isInPermissionFlow_"});
                case 3:
                    return new SessionPaused();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (SessionPaused.class) {
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

        public long getDurationMs() {
            return this.durationMs_;
        }

        public boolean getIsInPermissionFlow() {
            return this.isInPermissionFlow_;
        }

        public boolean hasDurationMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIsInPermissionFlow() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(SessionPaused sessionPaused) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sessionPaused);
        }

        public static SessionPaused parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (SessionPaused) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SessionPaused parseFrom(C63088z zVar, C62921ba baVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static SessionPaused parseFrom(C62897ae aeVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static SessionPaused parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static SessionPaused parseFrom(InputStream inputStream) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static SessionPaused parseFrom(InputStream inputStream, C62921ba baVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static SessionPaused parseFrom(ByteBuffer byteBuffer) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static SessionPaused parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static SessionPaused parseFrom(byte[] bArr) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static SessionPaused parseFrom(byte[] bArr, C62921ba baVar) {
            return (SessionPaused) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$SessionPausedOrBuilder */
    /* compiled from: PG */
    public interface SessionPausedOrBuilder extends C63001dt {
        long getDurationMs();

        boolean getIsInPermissionFlow();

        boolean hasDurationMs();

        boolean hasIsInPermissionFlow();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$StreamingMetadata */
    /* compiled from: PG */
    public final class StreamingMetadata extends C62942bv implements StreamingMetadataOrBuilder {
        /* access modifiers changed from: private */
        public static final StreamingMetadata DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER = null;
        public static final int STREAMING_SESSION_SERVICE_ADDRESS_FIELD_NUMBER = 2;
        public static final int STREAM_INDEX_FIELD_NUMBER = 1;
        private int bitField0_;
        private int streamIndex_;
        private String streamingSessionServiceAddress_ = BuildConfig.FLAVOR;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$StreamingMetadata$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements StreamingMetadataOrBuilder {
            private Builder() {
                super(StreamingMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearStreamIndex() {
                copyOnWrite();
                ((StreamingMetadata) this.instance).clearStreamIndex();
                return this;
            }

            public Builder clearStreamingSessionServiceAddress() {
                copyOnWrite();
                ((StreamingMetadata) this.instance).clearStreamingSessionServiceAddress();
                return this;
            }

            public int getStreamIndex() {
                return ((StreamingMetadata) this.instance).getStreamIndex();
            }

            public String getStreamingSessionServiceAddress() {
                return ((StreamingMetadata) this.instance).getStreamingSessionServiceAddress();
            }

            public C63088z getStreamingSessionServiceAddressBytes() {
                return ((StreamingMetadata) this.instance).getStreamingSessionServiceAddressBytes();
            }

            public boolean hasStreamIndex() {
                return ((StreamingMetadata) this.instance).hasStreamIndex();
            }

            public boolean hasStreamingSessionServiceAddress() {
                return ((StreamingMetadata) this.instance).hasStreamingSessionServiceAddress();
            }

            public Builder setStreamIndex(int i) {
                copyOnWrite();
                ((StreamingMetadata) this.instance).setStreamIndex(i);
                return this;
            }

            public Builder setStreamingSessionServiceAddress(String str) {
                copyOnWrite();
                ((StreamingMetadata) this.instance).setStreamingSessionServiceAddress(str);
                return this;
            }

            public Builder setStreamingSessionServiceAddressBytes(C63088z zVar) {
                copyOnWrite();
                ((StreamingMetadata) this.instance).setStreamingSessionServiceAddressBytes(zVar);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            StreamingMetadata streamingMetadata = new StreamingMetadata();
            DEFAULT_INSTANCE = streamingMetadata;
            C62942bv.registerDefaultInstance(StreamingMetadata.class, streamingMetadata);
        }

        private StreamingMetadata() {
        }

        /* access modifiers changed from: private */
        public void clearStreamIndex() {
            this.bitField0_ &= -2;
            this.streamIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStreamingSessionServiceAddress() {
            this.bitField0_ &= -3;
            this.streamingSessionServiceAddress_ = getDefaultInstance().getStreamingSessionServiceAddress();
        }

        public static StreamingMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static StreamingMetadata parseDelimitedFrom(InputStream inputStream) {
            return (StreamingMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StreamingMetadata parseFrom(C63088z zVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setStreamIndex(int i) {
            this.bitField0_ |= 1;
            this.streamIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void setStreamingSessionServiceAddress(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.streamingSessionServiceAddress_ = str;
        }

        /* access modifiers changed from: private */
        public void setStreamingSessionServiceAddressBytes(C63088z zVar) {
            this.streamingSessionServiceAddress_ = zVar.mo59170I(C62972cr.f170009a);
            this.bitField0_ |= 2;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "streamIndex_", "streamingSessionServiceAddress_"});
                case 3:
                    return new StreamingMetadata();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (StreamingMetadata.class) {
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

        public int getStreamIndex() {
            return this.streamIndex_;
        }

        public String getStreamingSessionServiceAddress() {
            return this.streamingSessionServiceAddress_;
        }

        public C63088z getStreamingSessionServiceAddressBytes() {
            return C63088z.m96143E(this.streamingSessionServiceAddress_);
        }

        public boolean hasStreamIndex() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStreamingSessionServiceAddress() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(StreamingMetadata streamingMetadata) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(streamingMetadata);
        }

        public static StreamingMetadata parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (StreamingMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static StreamingMetadata parseFrom(C63088z zVar, C62921ba baVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static StreamingMetadata parseFrom(C62897ae aeVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static StreamingMetadata parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static StreamingMetadata parseFrom(InputStream inputStream) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static StreamingMetadata parseFrom(InputStream inputStream, C62921ba baVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static StreamingMetadata parseFrom(ByteBuffer byteBuffer) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static StreamingMetadata parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static StreamingMetadata parseFrom(byte[] bArr) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static StreamingMetadata parseFrom(byte[] bArr, C62921ba baVar) {
            return (StreamingMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$StreamingMetadataOrBuilder */
    /* compiled from: PG */
    public interface StreamingMetadataOrBuilder extends C63001dt {
        int getStreamIndex();

        String getStreamingSessionServiceAddress();

        C63088z getStreamingSessionServiceAddressBytes();

        boolean hasStreamIndex();

        boolean hasStreamingSessionServiceAddress();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$UIEvent */
    /* compiled from: PG */
    public final class UIEvent extends C62942bv implements UIEventOrBuilder {
        /* access modifiers changed from: private */
        public static final UIEvent DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER = null;
        public static final int UI_EVENT_FIELD_NUMBER = 1;
        private int bitField0_;
        private int uiEvent_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$UIEvent$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements UIEventOrBuilder {
            private Builder() {
                super(UIEvent.DEFAULT_INSTANCE);
            }

            public Builder clearUiEvent() {
                copyOnWrite();
                ((UIEvent) this.instance).clearUiEvent();
                return this;
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent getUiEvent() {
                return ((UIEvent) this.instance).getUiEvent();
            }

            public boolean hasUiEvent() {
                return ((UIEvent) this.instance).hasUiEvent();
            }

            public Builder setUiEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent) {
                copyOnWrite();
                ((UIEvent) this.instance).setUiEvent(uIEvent);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            UIEvent uIEvent = new UIEvent();
            DEFAULT_INSTANCE = uIEvent;
            C62942bv.registerDefaultInstance(UIEvent.class, uIEvent);
        }

        private UIEvent() {
        }

        /* access modifiers changed from: private */
        public void clearUiEvent() {
            this.bitField0_ &= -2;
            this.uiEvent_ = 0;
        }

        public static UIEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UIEvent parseDelimitedFrom(InputStream inputStream) {
            return (UIEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UIEvent parseFrom(C63088z zVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUiEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent) {
            this.uiEvent_ = uIEvent.getNumber();
            this.bitField0_ |= 1;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "uiEvent_", ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.internalGetVerifier()});
                case 3:
                    return new UIEvent();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (UIEvent.class) {
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

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent getUiEvent() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.forNumber(this.uiEvent_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent.UIEVENT_NONE : forNumber;
        }

        public boolean hasUiEvent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UIEvent uIEvent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(uIEvent);
        }

        public static UIEvent parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (UIEvent) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static UIEvent parseFrom(C63088z zVar, C62921ba baVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static UIEvent parseFrom(C62897ae aeVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static UIEvent parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static UIEvent parseFrom(InputStream inputStream) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static UIEvent parseFrom(InputStream inputStream, C62921ba baVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static UIEvent parseFrom(ByteBuffer byteBuffer) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static UIEvent parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static UIEvent parseFrom(byte[] bArr) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static UIEvent parseFrom(byte[] bArr, C62921ba baVar) {
            return (UIEvent) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$UIEventOrBuilder */
    /* compiled from: PG */
    public interface UIEventOrBuilder extends C63001dt {
        ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent getUiEvent();

        boolean hasUiEvent();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$UserExited */
    /* compiled from: PG */
    public final class UserExited extends C62942bv implements UserExitedOrBuilder {
        /* access modifiers changed from: private */
        public static final UserExited DEFAULT_INSTANCE;
        public static final int EXIT_REASON_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER;
        private int bitField0_;
        private int exitReason_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$UserExited$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements UserExitedOrBuilder {
            private Builder() {
                super(UserExited.DEFAULT_INSTANCE);
            }

            public Builder clearExitReason() {
                copyOnWrite();
                ((UserExited) this.instance).clearExitReason();
                return this;
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason getExitReason() {
                return ((UserExited) this.instance).getExitReason();
            }

            public boolean hasExitReason() {
                return ((UserExited) this.instance).hasExitReason();
            }

            public Builder setExitReason(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason exitReason) {
                copyOnWrite();
                ((UserExited) this.instance).setExitReason(exitReason);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            UserExited userExited = new UserExited();
            DEFAULT_INSTANCE = userExited;
            C62942bv.registerDefaultInstance(UserExited.class, userExited);
        }

        private UserExited() {
        }

        /* access modifiers changed from: private */
        public void clearExitReason() {
            this.bitField0_ &= -2;
            this.exitReason_ = 0;
        }

        public static UserExited getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static UserExited parseDelimitedFrom(InputStream inputStream) {
            return (UserExited) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static UserExited parseFrom(C63088z zVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExitReason(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason exitReason) {
            this.exitReason_ = exitReason.getNumber();
            this.bitField0_ |= 1;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "exitReason_", ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.internalGetVerifier()});
                case 3:
                    return new UserExited();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (UserExited.class) {
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

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason getExitReason() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.forNumber(this.exitReason_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason.EXIT_REASON_UNKNOWN : forNumber;
        }

        public boolean hasExitReason() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UserExited userExited) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(userExited);
        }

        public static UserExited parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (UserExited) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static UserExited parseFrom(C63088z zVar, C62921ba baVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static UserExited parseFrom(C62897ae aeVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static UserExited parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static UserExited parseFrom(InputStream inputStream) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static UserExited parseFrom(InputStream inputStream, C62921ba baVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static UserExited parseFrom(ByteBuffer byteBuffer) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static UserExited parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static UserExited parseFrom(byte[] bArr) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static UserExited parseFrom(byte[] bArr, C62921ba baVar) {
            return (UserExited) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$UserExitedOrBuilder */
    /* compiled from: PG */
    public interface UserExitedOrBuilder extends C63001dt {
        ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason getExitReason();

        boolean hasExitReason();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$VideoCaptureMetadata */
    /* compiled from: PG */
    public final class VideoCaptureMetadata extends C62942bv implements VideoCaptureMetadataOrBuilder {
        /* access modifiers changed from: private */
        public static final VideoCaptureMetadata DEFAULT_INSTANCE;
        private static volatile C63010eb PARSER = null;
        public static final int VIDEO_LENGTH_MS_FIELD_NUMBER = 1;
        private int bitField0_;
        private long videoLengthMs_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$VideoCaptureMetadata$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements VideoCaptureMetadataOrBuilder {
            private Builder() {
                super(VideoCaptureMetadata.DEFAULT_INSTANCE);
            }

            public Builder clearVideoLengthMs() {
                copyOnWrite();
                ((VideoCaptureMetadata) this.instance).clearVideoLengthMs();
                return this;
            }

            public long getVideoLengthMs() {
                return ((VideoCaptureMetadata) this.instance).getVideoLengthMs();
            }

            public boolean hasVideoLengthMs() {
                return ((VideoCaptureMetadata) this.instance).hasVideoLengthMs();
            }

            public Builder setVideoLengthMs(long j) {
                copyOnWrite();
                ((VideoCaptureMetadata) this.instance).setVideoLengthMs(j);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }
        }

        static {
            VideoCaptureMetadata videoCaptureMetadata = new VideoCaptureMetadata();
            DEFAULT_INSTANCE = videoCaptureMetadata;
            C62942bv.registerDefaultInstance(VideoCaptureMetadata.class, videoCaptureMetadata);
        }

        private VideoCaptureMetadata() {
        }

        /* access modifiers changed from: private */
        public void clearVideoLengthMs() {
            this.bitField0_ &= -2;
            this.videoLengthMs_ = 0;
        }

        public static VideoCaptureMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static VideoCaptureMetadata parseDelimitedFrom(InputStream inputStream) {
            return (VideoCaptureMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VideoCaptureMetadata parseFrom(C63088z zVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setVideoLengthMs(long j) {
            this.bitField0_ |= 1;
            this.videoLengthMs_ = j;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "videoLengthMs_"});
                case 3:
                    return new VideoCaptureMetadata();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (VideoCaptureMetadata.class) {
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

        public long getVideoLengthMs() {
            return this.videoLengthMs_;
        }

        public boolean hasVideoLengthMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(VideoCaptureMetadata videoCaptureMetadata) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(videoCaptureMetadata);
        }

        public static VideoCaptureMetadata parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (VideoCaptureMetadata) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static VideoCaptureMetadata parseFrom(C63088z zVar, C62921ba baVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static VideoCaptureMetadata parseFrom(C62897ae aeVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static VideoCaptureMetadata parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static VideoCaptureMetadata parseFrom(InputStream inputStream) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static VideoCaptureMetadata parseFrom(InputStream inputStream, C62921ba baVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static VideoCaptureMetadata parseFrom(ByteBuffer byteBuffer) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static VideoCaptureMetadata parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static VideoCaptureMetadata parseFrom(byte[] bArr) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static VideoCaptureMetadata parseFrom(byte[] bArr, C62921ba baVar) {
            return (VideoCaptureMetadata) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$VideoCaptureMetadataOrBuilder */
    /* compiled from: PG */
    public interface VideoCaptureMetadataOrBuilder extends C63001dt {
        long getVideoLengthMs();

        boolean hasVideoLengthMs();
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ViewerPerformance */
    /* compiled from: PG */
    public final class ViewerPerformance extends C62942bv implements ViewerPerformanceOrBuilder {
        /* access modifiers changed from: private */
        public static final ViewerPerformance DEFAULT_INSTANCE;
        public static final int IMPRESS_PERFORMANCE_FIELD_NUMBER = 1;
        private static volatile C63010eb PARSER = null;
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int VIEWER_MODE_FIELD_NUMBER = 3;
        private int bitField0_;
        private ImpressLogOuterClass.PerformanceReport impressPerformance_;
        private int reason_;
        private int viewerMode_;

        /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ViewerPerformance$Builder */
        /* compiled from: PG */
        public final class Builder extends C62934bn implements ViewerPerformanceOrBuilder {
            private Builder() {
                super(ViewerPerformance.DEFAULT_INSTANCE);
            }

            public Builder clearImpressPerformance() {
                copyOnWrite();
                ((ViewerPerformance) this.instance).clearImpressPerformance();
                return this;
            }

            public Builder clearReason() {
                copyOnWrite();
                ((ViewerPerformance) this.instance).clearReason();
                return this;
            }

            public Builder clearViewerMode() {
                copyOnWrite();
                ((ViewerPerformance) this.instance).clearViewerMode();
                return this;
            }

            public ImpressLogOuterClass.PerformanceReport getImpressPerformance() {
                return ((ViewerPerformance) this.instance).getImpressPerformance();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason getReason() {
                return ((ViewerPerformance) this.instance).getReason();
            }

            public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode getViewerMode() {
                return ((ViewerPerformance) this.instance).getViewerMode();
            }

            public boolean hasImpressPerformance() {
                return ((ViewerPerformance) this.instance).hasImpressPerformance();
            }

            public boolean hasReason() {
                return ((ViewerPerformance) this.instance).hasReason();
            }

            public boolean hasViewerMode() {
                return ((ViewerPerformance) this.instance).hasViewerMode();
            }

            public Builder mergeImpressPerformance(ImpressLogOuterClass.PerformanceReport performanceReport) {
                copyOnWrite();
                ((ViewerPerformance) this.instance).mergeImpressPerformance(performanceReport);
                return this;
            }

            public Builder setImpressPerformance(ImpressLogOuterClass.PerformanceReport.Builder builder) {
                copyOnWrite();
                ((ViewerPerformance) this.instance).setImpressPerformance((ImpressLogOuterClass.PerformanceReport) builder.build());
                return this;
            }

            public Builder setReason(ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason performanceReportReason) {
                copyOnWrite();
                ((ViewerPerformance) this.instance).setReason(performanceReportReason);
                return this;
            }

            public Builder setViewerMode(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode viewerMode) {
                copyOnWrite();
                ((ViewerPerformance) this.instance).setViewerMode(viewerMode);
                return this;
            }

            public /* synthetic */ Builder(C47936t tVar) {
                this();
            }

            public Builder setImpressPerformance(ImpressLogOuterClass.PerformanceReport performanceReport) {
                copyOnWrite();
                ((ViewerPerformance) this.instance).setImpressPerformance(performanceReport);
                return this;
            }
        }

        static {
            ViewerPerformance viewerPerformance = new ViewerPerformance();
            DEFAULT_INSTANCE = viewerPerformance;
            C62942bv.registerDefaultInstance(ViewerPerformance.class, viewerPerformance);
        }

        private ViewerPerformance() {
        }

        /* access modifiers changed from: private */
        public void clearImpressPerformance() {
            this.impressPerformance_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearReason() {
            this.bitField0_ &= -3;
            this.reason_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearViewerMode() {
            this.bitField0_ &= -5;
            this.viewerMode_ = 0;
        }

        public static ViewerPerformance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeImpressPerformance(ImpressLogOuterClass.PerformanceReport performanceReport) {
            performanceReport.getClass();
            ImpressLogOuterClass.PerformanceReport performanceReport2 = this.impressPerformance_;
            if (!(performanceReport2 == null || performanceReport2 == ImpressLogOuterClass.PerformanceReport.getDefaultInstance())) {
                ImpressLogOuterClass.PerformanceReport.Builder newBuilder = ImpressLogOuterClass.PerformanceReport.newBuilder(performanceReport2);
                newBuilder.mergeFrom(performanceReport);
                performanceReport = (ImpressLogOuterClass.PerformanceReport) newBuilder.buildPartial();
            }
            this.impressPerformance_ = performanceReport;
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ViewerPerformance parseDelimitedFrom(InputStream inputStream) {
            return (ViewerPerformance) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViewerPerformance parseFrom(C63088z zVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar);
        }

        public static C63010eb parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setImpressPerformance(ImpressLogOuterClass.PerformanceReport performanceReport) {
            performanceReport.getClass();
            this.impressPerformance_ = performanceReport;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setReason(ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason performanceReportReason) {
            this.reason_ = performanceReportReason.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setViewerMode(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode viewerMode) {
            this.viewerMode_ = viewerMode.getNumber();
            this.bitField0_ |= 4;
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
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "impressPerformance_", "reason_", ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason.internalGetVerifier(), "viewerMode_", ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.internalGetVerifier()});
                case 3:
                    return new ViewerPerformance();
                case 4:
                    return new Builder((C47936t) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C63010eb ebVar = PARSER;
                    if (ebVar == null) {
                        synchronized (ViewerPerformance.class) {
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

        public ImpressLogOuterClass.PerformanceReport getImpressPerformance() {
            ImpressLogOuterClass.PerformanceReport performanceReport = this.impressPerformance_;
            return performanceReport == null ? ImpressLogOuterClass.PerformanceReport.getDefaultInstance() : performanceReport;
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason getReason() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason.forNumber(this.reason_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason.PERFORMANCE_REPORT_REASON_UNKNOWN : forNumber;
        }

        public ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode getViewerMode() {
            ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode forNumber = ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.forNumber(this.viewerMode_);
            return forNumber == null ? ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode.VIEWER_MODE_UNKNOWN : forNumber;
        }

        public boolean hasImpressPerformance() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasReason() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasViewerMode() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(ViewerPerformance viewerPerformance) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(viewerPerformance);
        }

        public static ViewerPerformance parseDelimitedFrom(InputStream inputStream, C62921ba baVar) {
            return (ViewerPerformance) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ViewerPerformance parseFrom(C63088z zVar, C62921ba baVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, zVar, baVar);
        }

        public static ViewerPerformance parseFrom(C62897ae aeVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar);
        }

        public static ViewerPerformance parseFrom(C62897ae aeVar, C62921ba baVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, aeVar, baVar);
        }

        public static ViewerPerformance parseFrom(InputStream inputStream) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream);
        }

        public static ViewerPerformance parseFrom(InputStream inputStream, C62921ba baVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, inputStream, baVar);
        }

        public static ViewerPerformance parseFrom(ByteBuffer byteBuffer) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer);
        }

        public static ViewerPerformance parseFrom(ByteBuffer byteBuffer, C62921ba baVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, byteBuffer, baVar);
        }

        public static ViewerPerformance parseFrom(byte[] bArr) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr);
        }

        public static ViewerPerformance parseFrom(byte[] bArr, C62921ba baVar) {
            return (ViewerPerformance) C62942bv.parseFrom((C62942bv) DEFAULT_INSTANCE, bArr, baVar);
        }
    }

    /* renamed from: com.google.ar.core.viewer.analytics.ArViewerLogOuterClass$ViewerPerformanceOrBuilder */
    /* compiled from: PG */
    public interface ViewerPerformanceOrBuilder extends C63001dt {
        ImpressLogOuterClass.PerformanceReport getImpressPerformance();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.PerformanceReportReason getReason();

        ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerMode getViewerMode();

        boolean hasImpressPerformance();

        boolean hasReason();

        boolean hasViewerMode();
    }

    private ArViewerLogOuterClass() {
    }

    public static void registerAllExtensions(C62921ba baVar) {
    }
}
