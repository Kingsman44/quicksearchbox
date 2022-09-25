package com.google.android.libraries.p579ar.sceneviewer.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.sceneviewer.p10647b.C141533a;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1975k.C24019l;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.android.libraries.p579ar.sceneviewer.analytics.SceneViewerCollectionBasisHelper;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogOuterClass;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import com.google.p5261vr.p5262a.p5263a.C67911a;
import com.google.p5261vr.p5262a.p5263a.C67930b;
import com.google.p5261vr.p5262a.p5263a.p5264a.C67918g;
import com.google.p5261vr.p5262a.p5263a.p5264a.C67919h;
import com.google.p5261vr.p5262a.p5263a.p5264a.C67922k;
import com.google.p5261vr.p5262a.p5263a.p5264a.C67923l;
import com.google.p5261vr.p5262a.p5263a.p5264a.C67928q;
import com.google.p5261vr.p5262a.p5263a.p5264a.C67929r;
import com.google.p5261vr.p5262a.p5263a.p5265b.C67932b;
import com.google.p5261vr.p5262a.p5263a.p5265b.C67933c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import java.util.UUID;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72289m;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.ar.sceneviewer.analytics.ViewerLogger */
/* compiled from: PG */
public final class ViewerLogger {
    private static final String ACTIVE_DIFFS_LOG_SOURCE_NAME = "ARCORE_ARVIEWER_ACTIVE_DIFFS";
    private static final String LOG_SOURCE_NAME = "ARCORE_ARVIEWER";
    private static final String SHARED_PREF_ACTIVE_DIFFS_FILE_NAME = "ArViewerActiveUserDiffsSharedPrefs";
    private static final String SHARED_PREF_KEY_PREFIX_ACTIVE_DIFFS = "ArViewer.Analytics.ActiveUserDiffs.";
    private static ViewerLogger instance = null;
    private static final C59071e logger = C59071e.m91332i("com.google.android.libraries.ar.sceneviewer.analytics.ViewerLogger");
    private static final C67928q viewerPackageInfo = new C67928q();
    private C67929r activeDiffLogger;
    private C47890a buildType;
    private C67923l eventLogger;
    private ArViewerLogOuterClass.Params params;
    private final C24019l protoCollectionBasis;
    private boolean reportedActiveDiff;
    private String versionName;
    private UUID viewerSessionUuid;

    private ViewerLogger() {
        this.protoCollectionBasis = SceneViewerCollectionBasisHelper.ArViewerLog.getInstance();
        this.params = ArViewerLogOuterClass.Params.getDefaultInstance();
        this.buildType = C47890a.BUILD_TYPE_UNKNOWN;
        this.versionName = "Unknown";
        this.eventLogger = null;
        this.activeDiffLogger = null;
        this.eventLogger = new C10677a();
    }

    public static ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType convertBuildType(C47890a aVar) {
        C47890a aVar2 = C47890a.BUILD_TYPE_UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            return ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.AGSA_RELEASE;
        }
        if (ordinal != 3) {
            return ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.BUILD_TYPE_UNKNOWN;
        }
        return ArViewerLogEnumOuterClass.ArViewerLogEnum.BuildType.STANDALONE;
    }

    public static ViewerLogger getInstance() {
        if (instance == null) {
            instance = new ViewerLogger();
        }
        return instance;
    }

    private void log(ArViewerLogOuterClass.ArViewerLog arViewerLog) {
        C67923l lVar = this.eventLogger;
        if (lVar != null) {
            int b = lVar.mo18731b();
            if (b != 0 && !this.reportedActiveDiff) {
                C67929r rVar = this.activeDiffLogger;
                if (rVar != null) {
                    C67928q qVar = viewerPackageInfo;
                    C67933c cVar = rVar.f184111d;
                    int i = C72289m.m106806b(C67929r.f184108a, new C72210d(System.currentTimeMillis(), C72288l.f192416b).mo63547e()).f191967k;
                    C67932b bVar = new C67932b(cVar.f184124a.edit());
                    String str = qVar.f184106a;
                    int a = C67929r.m98211a(rVar.f184110c.concat("platform"), i, cVar, bVar);
                    int a2 = C67929r.m98211a(rVar.f184110c + "package_" + str, i, cVar, bVar);
                    if (!(a == i && a2 == i)) {
                        C67911a aVar = (C67911a) C67930b.f184112h.createBuilder();
                        aVar.copyOnWrite();
                        C67930b bVar2 = (C67930b) aVar.instance;
                        bVar2.f184114a |= 1;
                        bVar2.f184115b = str;
                        aVar.copyOnWrite();
                        C67930b bVar3 = (C67930b) aVar.instance;
                        bVar3.f184114a |= 4;
                        bVar3.f184117d = i;
                        aVar.copyOnWrite();
                        C67930b bVar4 = (C67930b) aVar.instance;
                        bVar4.f184120g = b - 1;
                        bVar4.f184114a |= 32;
                        boolean z = qVar.f184107b;
                        aVar.copyOnWrite();
                        C67930b bVar5 = (C67930b) aVar.instance;
                        bVar5.f184114a |= 2;
                        bVar5.f184116c = false;
                        if (a != -1) {
                            aVar.copyOnWrite();
                            C67930b bVar6 = (C67930b) aVar.instance;
                            bVar6.f184114a |= 8;
                            bVar6.f184118e = a;
                        }
                        if (a2 != -1) {
                            aVar.copyOnWrite();
                            C67930b bVar7 = (C67930b) aVar.instance;
                            bVar7.f184114a |= 16;
                            bVar7.f184119f = a2;
                        }
                        ((C67919h) rVar.f184109b).mo18730a(C67922k.m98201d((C67930b) aVar.build()).mo60052a());
                        bVar.f184123a.apply();
                    }
                    this.reportedActiveDiff = true;
                } else {
                    return;
                }
            }
            lVar.mo18730a(C67922k.m98201d(arViewerLog).mo60052a());
        }
    }

    private void logFromProducer(ViewerMessageProducer viewerMessageProducer) {
        ArViewerLogOuterClass.ArViewerLog.Builder newBuilder = ArViewerLogOuterClass.ArViewerLog.newBuilder();
        viewerMessageProducer.buildEvent(newBuilder);
        UUID uuid = this.viewerSessionUuid;
        if (uuid != null) {
            newBuilder.setViewerSessionId(uuid.toString());
        }
        newBuilder.setParams(this.params);
        newBuilder.setArcoreSessionId(BuildConfig.FLAVOR);
        newBuilder.setApkVersion(this.versionName);
        newBuilder.setBuildType(convertBuildType(this.buildType));
        log((ArViewerLogOuterClass.ArViewerLog) newBuilder.build());
    }

    public static void reset() {
        instance = null;
    }

    public void initialize(Context context, C47890a aVar, UUID uuid) {
        String str;
        String str2 = "Unknown";
        this.buildType = aVar;
        this.viewerSessionUuid = uuid;
        if (aVar != C47890a.STANDALONE) {
            this.eventLogger = new C67918g(context, new C67919h(C143658k.m233373b(context, LOG_SOURCE_NAME).mo118952a(), 3, C24006d.m44596b(context, this.protoCollectionBasis)));
            this.activeDiffLogger = new C67929r(new C67919h(C143658k.m233374c(context, ACTIVE_DIFFS_LOG_SOURCE_NAME).mo118952a(), 5, C24006d.m44596b(context, this.protoCollectionBasis)), new C67933c(context.getSharedPreferences(SHARED_PREF_ACTIVE_DIFFS_FILE_NAME, 0)));
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42319)).mo56386p("The version name could not be found");
            str = str2;
        }
        if (str != null) {
            str2 = str;
        }
        this.versionName = str2;
        ((C59052c) ((C59052c) logger.mo56224b()).mo56372aa(42318)).mo56389s("ViewerLogger initialized with buildType %s", aVar);
    }

    public void logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action action) {
        logFromProducer(new ActionMessageProducer(action));
    }

    public void logFromSerializedMessage(byte[] bArr) {
        try {
            log(ArViewerLogOuterClass.ArViewerLog.parseFrom(bArr, C62921ba.m95368a()));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) logger.mo56225c()).mo56382g(e)).mo56372aa(42322)).mo56386p("Failed to deserialize and log message fromo native.");
        }
    }

    public void logLoadingError(ArViewerLogEnumOuterClass.ArViewerLogEnum.LoadErrorReason loadErrorReason, String str, long j) {
        logFromProducer(new LoadingErrorMessageProducer(loadErrorReason, str, j));
    }

    public void logSessionAnalytics(Duration duration, Duration duration2) {
        logFromProducer(new SessionAnalyticsMessageProducer(duration, duration2));
    }

    public void logSessionPaused(long j, boolean z) {
        logFromProducer(new SessionPausedMessageProducer(j, z));
    }

    public void logUIEvent(ArViewerLogEnumOuterClass.ArViewerLogEnum.UIEvent uIEvent) {
        logFromProducer(new UIEventMessageProducer(uIEvent));
    }

    public void logUserExited(ArViewerLogEnumOuterClass.ArViewerLogEnum.ExitReason exitReason) {
        logFromProducer(new UserExitedMessageProducer(exitReason));
    }

    public void logVideoCaptureMetadata(long j) {
        logFromProducer(new VideoCaptureMessageProducer(j));
    }

    public void setSessionInfo(Uri uri) {
        ArViewerLogOuterClass.Params.Builder builder = (ArViewerLogOuterClass.Params.Builder) this.params.toBuilder();
        String m = C141533a.m229741m(uri);
        if (m != null) {
            builder.setModelUrl(m);
        }
        String o = C141533a.m229743o(uri);
        if (o != null) {
            builder.setReferrer(o);
        }
        String p = C141533a.m229744p(uri);
        if (p != null) {
            builder.setAppSessionId(p);
        }
        String j = C141533a.m229738j(uri);
        if (j != null) {
            builder.setLinkUrl(j);
        }
        String l = C141533a.m229740l(uri);
        if (l != null) {
            builder.setTitle(l);
        }
        String r = C141533a.m229746r(uri);
        if (r != null) {
            builder.setSoundUrl(r);
        }
        this.params = (ArViewerLogOuterClass.Params) builder.build();
    }

    public void setViewerClientVersion(ArViewerLogEnumOuterClass.ArViewerLogEnum.ViewerClientVersion viewerClientVersion) {
        ArViewerLogOuterClass.Params.Builder builder = (ArViewerLogOuterClass.Params.Builder) this.params.toBuilder();
        builder.setViewerClientVersion(viewerClientVersion);
        this.params = (ArViewerLogOuterClass.Params) builder.build();
    }
}
