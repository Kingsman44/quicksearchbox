package com.google.android.apps.search.sceneviewer.modelviewer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.binaries.satin.app.aqe;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.sceneviewer.C141549g;
import com.google.android.apps.search.sceneviewer.immersiveedge.C141554c;
import com.google.android.apps.search.sceneviewer.immersiveedge.clientevents.C141559e;
import com.google.android.apps.search.sceneviewer.p10646a.C141530e;
import com.google.android.apps.search.sceneviewer.p10648c.C141536a;
import com.google.android.apps.search.sceneviewer.p10648c.C141539d;
import com.google.android.apps.search.sceneviewer.p10649d.C141545e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.p579ar.sceneviewer.hotspots.ButtonType;
import com.google.android.libraries.p579ar.sceneviewer.media.capture.ShutterButtonController;
import com.google.android.libraries.p579ar.sceneviewer.permissions.AllPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.CameraPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.permissions.MediaPermissionsFragment;
import com.google.android.libraries.p579ar.sceneviewer.utilities.AppUtilities;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import com.google.p3723ar.p3724a.p3725a.C47891b;
import com.google.p3723ar.p3724a.p3725a.C47892c;
import com.google.p5261vr.p5266c9.p5267a.C67942d;
import com.google.p5261vr.p5266c9.p5267a.C67944f;
import com.google.p5261vr.p5266c9.p5267a.C67948j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.b */
/* compiled from: PG */
public final class C141592b extends C141590aq implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C141584am f384371a;

    /* renamed from: c */
    private Context f384372c;

    /* renamed from: d */
    private final C2393x f384373d = new C2393x(this);

    /* renamed from: e */
    private boolean f384374e;

    @Deprecated
    public C141592b() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C141584am mo17754z() {
        C141584am amVar = this.f384371a;
        if (amVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f384374e) {
            return amVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo116590b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f384372c == null) {
            this.f384372c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f384372c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f384373d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C141584am a = mo17754z();
        a.mo116585r();
        ShutterButtonController shutterButtonController = a.f384289Q;
        if (shutterButtonController != null) {
            shutterButtonController.updateCaptureOrientation();
        }
        if (AllPermissionsFragment.isVisible(a.f384337f.getChildFragmentManager())) {
            AllPermissionsFragment.hide(a.f384337f.getChildFragmentManager());
            AllPermissionsFragment.showNow(a.f384337f.getChildFragmentManager(), a.f384350s);
        }
        if (CameraPermissionsFragment.isVisible(a.f384337f.getChildFragmentManager())) {
            CameraPermissionsFragment.hide(a.f384337f.getChildFragmentManager());
            CameraPermissionsFragment.showNow(a.f384337f.getChildFragmentManager(), a.f384350s);
        }
        if (MediaPermissionsFragment.isVisible(a.f384337f.getChildFragmentManager())) {
            MediaPermissionsFragment.relaunch(a.f384337f.getChildFragmentManager());
        }
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C141584am a = mo17754z();
            a.f384345n.mo50429i(a.f384348q);
            if (bundle != null) {
                ((C59052c) ((C59052c) C141584am.f384271b.mo56224b()).mo56372aa(41747)).mo56386p("Resuming from saved instance state");
                a.f384336e = true;
                a.f384355x = (C47892c) ProtoParsers.m95520c(bundle, "SceneViewerConfigRestoreKey", C47892c.f123998t, C62921ba.m95368a());
                a.f384335d = false;
                String string = bundle.getString("SceneUriRestoreKey");
                if (string != null) {
                    a.f384298Z = Uri.parse(string);
                }
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C141584am.f384271b.mo56225c()).mo56382g(e)).mo56372aa(41748)).mo56386p("Unable to resume ModelViewFragment from a saved instance state");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C141571a.m229773a(th, th2);
            }
            throw th;
        }
        C47831fm.m85019n();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C141584am a = mo17754z();
            a.f384354w = (ViewGroup) layoutInflater.inflate(R.layout.sceneviewer_model_view, viewGroup, false);
            a.f384346o.mo50707a(new C46719bc(a.f384344m, new C141573ab(a), "model-viewer-provider"), a.f384347p);
            ViewGroup viewGroup2 = a.f384354w;
            C47831fm.m85019n();
            return viewGroup2;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C141584am a = mo17754z();
            if (a.f384292T) {
                ViewGroup viewGroup = (ViewGroup) a.f384354w.findViewById(R.id.sceneviewer_model_view_layout);
                if (viewGroup != null) {
                    viewGroup.removeView(a.f384353v.getRootView());
                }
                if (!a.f384335d) {
                    a.f384353v.destroy();
                }
                a.f384274B.getCardWebView().destroy();
                a.f384292T = false;
            }
            ButtonType.LEFT.setValid(false);
            ButtonType.RIGHT.setValid(false);
            ButtonType.GET_HELP.setValid(false);
            b.close();
            return;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f384374e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C141584am a = mo17754z();
            boolean z = false;
            a.f384293U = false;
            if (a.f384292T) {
                ShutterButtonController shutterButtonController = a.f384289Q;
                if (shutterButtonController != null) {
                    shutterButtonController.pause();
                }
                Runnable runnable = a.f384318aj;
                if (runnable != null) {
                    a.f384354w.removeCallbacks(runnable);
                }
                a.f384353v.pause();
                a.mo116575i();
                long b = a.f384349r.mo26870b() - a.f384294V;
                ViewerLogger instance = ViewerLogger.getInstance();
                if (AllPermissionsFragment.isVisible(a.f384337f.getChildFragmentManager()) || CameraPermissionsFragment.isVisible(a.f384337f.getChildFragmentManager()) || MediaPermissionsFragment.isVisible(a.f384337f.getChildFragmentManager())) {
                    z = true;
                }
                instance.logSessionPaused(b, z);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C141584am a = mo17754z();
            a.f384293U = true;
            if (a.f384292T) {
                a.mo116576j();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C141584am a = mo17754z();
            a.f384335d = true;
            bundle.putParcelable("SceneViewerConfigRestoreKey", new ProtoParsers.InternalDontUse((byte[]) null, a.f384355x));
            Uri uri = a.f384297Y;
            if (uri == null) {
                uri = a.f384298Z;
            }
            if (uri != null) {
                bundle.putString("SceneUriRestoreKey", uri.toString());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C141571a.m229773a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        boolean z;
        boolean z2;
        C141592b bVar = this;
        bVar.f122869b.mo51381i();
        try {
            if (!bVar.f384374e) {
                super.onAttach(context);
                if (bVar.f384371a == null) {
                    Object jN = mo116591d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C141592b) {
                        C141592b bVar2 = (C141592b) fragment;
                        C68225k.m98532d(bVar2);
                        C141589ap apVar = (C141589ap) ((C74176nj) jN).f206768bl.mo17428b();
                        String str = (String) ((C74176nj) jN).f206677a.S.mo17428b();
                        UUID df = ((C141549g) ((C68288b) ((C47215a) ((C74176nj) jN).f206836d.f205423e.mo17428b()).mo51121p()).mo17653jN()).mo116557df();
                        C68225k.m98532d(df);
                        C47890a aVar = C47890a.AGSA;
                        C68225k.m98532d(aVar);
                        Executor executor = (Executor) ((C74176nj) jN).f206677a.n.mo17428b();
                        Executor executor2 = (Executor) ((C74176nj) jN).f206677a.p.mo17428b();
                        C141530e eVar = new C141530e((C42876ab) ((C74176nj) jN).f206730b.f198027a.f199577he.mo17428b());
                        C46128f fVar = (C46128f) ((C74176nj) jN).f206730b.f198504j.mo17428b();
                        AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                        aqe aqe = ((C74176nj) jN).f206730b.f198027a;
                        C69464a aVar2 = aqe.f199175a.a.f202650bA;
                        String e = ((C46897i) aqe.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 44").mo50906e();
                        C68225k.m98532d(e);
                        String e2 = ((C46897i) aqe.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 29").mo50906e();
                        C68225k.m98532d(e2);
                        C141545e eVar2 = new C141545e((Context) aqe.f199175a.g.mo17428b(), (AccountId) aqe.f199228b.f198239e.mo17428b(), aVar2, (C46128f) aqe.f199228b.f198504j.mo17428b(), (Executor) aqe.f199175a.p.mo17428b(), e, e2, ((C46897i) aqe.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 43").mo50907f(), ((C46897i) aqe.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45").mo50907f());
                        C141536a aVar3 = new C141536a(((C74176nj) jN).mo69794gY());
                        aqe aqe2 = ((C74176nj) jN).f206730b.f198027a;
                        C141536a aVar4 = aVar3;
                        double a = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 19").mo50902a();
                        double a2 = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 20").mo50902a();
                        C141545e eVar3 = eVar2;
                        C141530e eVar4 = eVar;
                        String e3 = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 26").mo50906e();
                        C68225k.m98532d(e3);
                        Executor executor3 = executor2;
                        String e4 = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 25").mo50906e();
                        C68225k.m98532d(e4);
                        Executor executor4 = executor;
                        Types.AutoEnvironmentSettings autoEnvironmentSettings = (Types.AutoEnvironmentSettings) ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 1").mo50905d();
                        C68225k.m98532d(autoEnvironmentSettings);
                        C47890a aVar5 = aVar;
                        boolean f = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 21").mo50907f();
                        UUID uuid = df;
                        boolean f2 = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 22").mo50907f();
                        String str2 = str;
                        boolean f3 = ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 23").mo50907f();
                        Types.DynamicResolutionSettings dynamicResolutionSettings = (Types.DynamicResolutionSettings) ((C46897i) aqe2.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 46").mo50905d();
                        C68225k.m98532d(dynamicResolutionSettings);
                        C47891b bVar3 = (C47891b) C47892c.f123998t.createBuilder();
                        Types.ImageBasedLighting imageBasedLighting = Types.ImageBasedLighting.DEFAULT_LIGHTING;
                        bVar3.copyOnWrite();
                        C141589ap apVar2 = apVar;
                        C47892c cVar = (C47892c) bVar3.instance;
                        C141592b bVar4 = bVar2;
                        cVar.f124016q = imageBasedLighting.getNumber();
                        cVar.f124000a |= 32768;
                        Types.LightingSettings.Mode mode = Types.LightingSettings.Mode.ENABLED;
                        bVar3.copyOnWrite();
                        C47892c cVar2 = (C47892c) bVar3.instance;
                        cVar2.f124017r = mode.getNumber();
                        cVar2.f124000a |= 65536;
                        Types.OcclusionSettings.Mode mode2 = Types.OcclusionSettings.Mode.DISABLED;
                        bVar3.copyOnWrite();
                        C47892c cVar3 = (C47892c) bVar3.instance;
                        cVar3.f124018s = mode2.getNumber();
                        cVar3.f124000a |= C89885b.S3REQUEST_VALUE;
                        bVar3.copyOnWrite();
                        C47892c cVar4 = (C47892c) bVar3.instance;
                        cVar4.f124000a |= 32;
                        cVar4.f124006g = BuildConfig.FLAVOR;
                        C63088z byteString = autoEnvironmentSettings.toByteString();
                        bVar3.copyOnWrite();
                        C47892c cVar5 = (C47892c) bVar3.instance;
                        byteString.getClass();
                        cVar5.f124000a |= 1;
                        cVar5.f124001b = byteString;
                        bVar3.copyOnWrite();
                        C47892c cVar6 = (C47892c) bVar3.instance;
                        cVar6.f124000a |= 2;
                        cVar6.f124002c = (float) a;
                        bVar3.copyOnWrite();
                        C47892c cVar7 = (C47892c) bVar3.instance;
                        cVar7.f124000a |= 4;
                        cVar7.f124003d = (float) a2;
                        bVar3.copyOnWrite();
                        C47892c cVar8 = (C47892c) bVar3.instance;
                        cVar8.f124000a |= 8;
                        cVar8.f124004e = e4;
                        bVar3.copyOnWrite();
                        C47892c cVar9 = (C47892c) bVar3.instance;
                        cVar9.f124000a |= 16;
                        cVar9.f124005f = e3;
                        bVar3.copyOnWrite();
                        C47892c cVar10 = (C47892c) bVar3.instance;
                        cVar10.f124000a |= 64;
                        cVar10.f124007h = f;
                        bVar3.copyOnWrite();
                        C47892c cVar11 = (C47892c) bVar3.instance;
                        cVar11.f124000a |= 128;
                        cVar11.f124008i = f2;
                        bVar3.copyOnWrite();
                        C47892c cVar12 = (C47892c) bVar3.instance;
                        cVar12.f124000a |= 256;
                        cVar12.f124009j = f3;
                        C63088z byteString2 = dynamicResolutionSettings.toByteString();
                        bVar3.copyOnWrite();
                        C47892c cVar13 = (C47892c) bVar3.instance;
                        byteString2.getClass();
                        cVar13.f124000a |= 512;
                        cVar13.f124010k = byteString2;
                        C47892c cVar14 = (C47892c) bVar3.build();
                        C68225k.m98532d(cVar14);
                        aqe aqe3 = ((C74176nj) jN).f206730b.f198027a;
                        Context context2 = (Context) aqe3.f199175a.g.mo17428b();
                        boolean f4 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 2").mo50907f();
                        boolean f5 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 4").mo50907f();
                        String e5 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 12").mo50906e();
                        C68225k.m98532d(e5);
                        String e6 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 36").mo50906e();
                        C68225k.m98532d(e6);
                        String e7 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45351074").mo50906e();
                        C68225k.m98532d(e7);
                        String e8 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45351075").mo50906e();
                        C68225k.m98532d(e8);
                        String e9 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 7").mo50906e();
                        C68225k.m98532d(e9);
                        String e10 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 6").mo50906e();
                        C68225k.m98532d(e10);
                        String e11 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 8").mo50906e();
                        C68225k.m98532d(e11);
                        String e12 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 11").mo50906e();
                        C68225k.m98532d(e12);
                        C47892c cVar15 = cVar14;
                        String str3 = e12;
                        long b = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 13").mo50903b();
                        Object obj = jN;
                        C67948j jVar = (C67948j) ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 14").mo50905d();
                        C68225k.m98532d(jVar);
                        C67948j jVar2 = jVar;
                        C67944f fVar2 = (C67944f) ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 15").mo50905d();
                        C68225k.m98532d(fVar2);
                        C67944f fVar3 = fVar2;
                        C67942d dVar = (C67942d) ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 16").mo50905d();
                        C68225k.m98532d(dVar);
                        C67942d dVar2 = dVar;
                        boolean f6 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 33").mo50907f();
                        boolean f7 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 34").mo50907f();
                        long j = b;
                        boolean f8 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 35").mo50907f();
                        String e13 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 41").mo50906e();
                        C68225k.m98532d(e13);
                        String str4 = e11;
                        String e14 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 9").mo50906e();
                        C68225k.m98532d(e14);
                        String str5 = e14;
                        String e15 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 10").mo50906e();
                        C68225k.m98532d(e15);
                        String str6 = e15;
                        String str7 = e10;
                        long b2 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 37").mo50903b();
                        long b3 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 38").mo50903b();
                        long b4 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 39").mo50903b();
                        boolean f9 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45352239").mo50907f();
                        boolean f10 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45367902").mo50907f();
                        boolean z3 = f9;
                        long b5 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45353246").mo50903b();
                        boolean f11 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45357893").mo50907f();
                        boolean f12 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45365884").mo50907f();
                        long b6 = ((C46897i) aqe3.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45365885").mo50903b();
                        if (f12) {
                            z = f8;
                            if (((long) AppUtilities.getArCoreApkVersionCode(context2)) >= b6) {
                                z2 = true;
                                Types.StreamingSettings.Builder newBuilder = Types.StreamingSettings.newBuilder();
                                newBuilder.setModeAllowed(f4);
                                newBuilder.setTestDryrun(f5);
                                newBuilder.setReferrers(e5);
                                newBuilder.setDynamicInfoCardReferrers(e6);
                                newBuilder.setAllowedDomains(e7);
                                newBuilder.setAllowedApiKeys(e8);
                                newBuilder.setInfoCardUri(e9);
                                newBuilder.setTestResultIgnoredOnDataLoss(true);
                                newBuilder.setUseMergedApi(f7);
                                newBuilder.setUseMergedStream(z);
                                newBuilder.setDisallowedModelTitlePattern(e13);
                                newBuilder.setSessionServiceAddress(str7);
                                newBuilder.setSessionServiceApiKey(str4);
                                newBuilder.setTestSessionServiceAddress(str5);
                                newBuilder.setTestSessionServiceApiKey(str6);
                                newBuilder.setCodec(str3);
                                newBuilder.setTestMaxDurationMs(j);
                                newBuilder.setCreationTimeoutMs(b2);
                                newBuilder.setTestEvaluationDurationMs(b3);
                                newBuilder.setTestDecodingWarmupFrames(b4);
                                newBuilder.setTestDecisionParameters(jVar2.toByteString());
                                newBuilder.setMidStreamDecisionParameters(fVar3.toByteString());
                                newBuilder.setDisplayTimingParameters(dVar2.toByteString());
                                newBuilder.setLowPerformanceMode(false);
                                newBuilder.setEnableLighting(f11);
                                newBuilder.setLatestPose(true);
                                newBuilder.setFallbackEnabled(true);
                                newBuilder.setStreamingTestCancellationEnabled(true);
                                newBuilder.setHotspotsEnabled(f6);
                                newBuilder.setTouchEventsEnabled(z3);
                                newBuilder.setSideChannelEventEnabled(f10);
                                newBuilder.setMinArCoreVersion((int) b5);
                                newBuilder.setUseMtls(z2);
                                Types.StreamingSettings streamingSettings = (Types.StreamingSettings) newBuilder.build();
                                C68225k.m98532d(streamingSettings);
                                C141584am amVar = r7;
                                C141584am amVar2 = new C141584am(bVar4, apVar2, str2, uuid, aVar5, executor4, executor3, eVar4, fVar, accountId, eVar3, aVar4, cVar15, streamingSettings, (C47770dh) ((C74176nj) obj).f206730b.f198663m.mo17428b(), (C46439e) ((C74176nj) obj).f206942f.mo17428b(), (C46801dp) ((C74176nj) obj).f207084k.mo17428b(), (C46723bg) ((C74176nj) obj).f206677a.ap.mo17428b(), new C141539d((C46428ao) ((C74176nj) obj).f206677a.aJ.mo17428b()), (C21370a) ((C74176nj) obj).f206677a.i.mo17428b(), ((C46897i) ((C74176nj) obj).f206730b.f198027a.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45365573").mo50907f(), ((C46897i) ((C74176nj) obj).f206730b.f198027a.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45375335").mo50907f(), new C141559e(((C74176nj) obj).f206836d.f205391d, ((C74176nj) obj).f206730b.f198663m), (C141554c) ((C74176nj) obj).f206769bm.mo17428b());
                                bVar = this;
                                bVar.f384371a = amVar;
                                super.getLifecycle().mo5790b(new TracedFragmentLifecycle(bVar.f122869b, bVar.f384373d));
                            }
                        } else {
                            z = f8;
                        }
                        z2 = false;
                        Types.StreamingSettings.Builder newBuilder2 = Types.StreamingSettings.newBuilder();
                        newBuilder2.setModeAllowed(f4);
                        newBuilder2.setTestDryrun(f5);
                        newBuilder2.setReferrers(e5);
                        newBuilder2.setDynamicInfoCardReferrers(e6);
                        newBuilder2.setAllowedDomains(e7);
                        newBuilder2.setAllowedApiKeys(e8);
                        newBuilder2.setInfoCardUri(e9);
                        newBuilder2.setTestResultIgnoredOnDataLoss(true);
                        newBuilder2.setUseMergedApi(f7);
                        newBuilder2.setUseMergedStream(z);
                        newBuilder2.setDisallowedModelTitlePattern(e13);
                        newBuilder2.setSessionServiceAddress(str7);
                        newBuilder2.setSessionServiceApiKey(str4);
                        newBuilder2.setTestSessionServiceAddress(str5);
                        newBuilder2.setTestSessionServiceApiKey(str6);
                        newBuilder2.setCodec(str3);
                        newBuilder2.setTestMaxDurationMs(j);
                        newBuilder2.setCreationTimeoutMs(b2);
                        newBuilder2.setTestEvaluationDurationMs(b3);
                        newBuilder2.setTestDecodingWarmupFrames(b4);
                        newBuilder2.setTestDecisionParameters(jVar2.toByteString());
                        newBuilder2.setMidStreamDecisionParameters(fVar3.toByteString());
                        newBuilder2.setDisplayTimingParameters(dVar2.toByteString());
                        newBuilder2.setLowPerformanceMode(false);
                        newBuilder2.setEnableLighting(f11);
                        newBuilder2.setLatestPose(true);
                        newBuilder2.setFallbackEnabled(true);
                        newBuilder2.setStreamingTestCancellationEnabled(true);
                        newBuilder2.setHotspotsEnabled(f6);
                        newBuilder2.setTouchEventsEnabled(z3);
                        newBuilder2.setSideChannelEventEnabled(f10);
                        newBuilder2.setMinArCoreVersion((int) b5);
                        newBuilder2.setUseMtls(z2);
                        Types.StreamingSettings streamingSettings2 = (Types.StreamingSettings) newBuilder2.build();
                        C68225k.m98532d(streamingSettings2);
                        C141584am amVar3 = amVar2;
                        C141584am amVar22 = new C141584am(bVar4, apVar2, str2, uuid, aVar5, executor4, executor3, eVar4, fVar, accountId, eVar3, aVar4, cVar15, streamingSettings2, (C47770dh) ((C74176nj) obj).f206730b.f198663m.mo17428b(), (C46439e) ((C74176nj) obj).f206942f.mo17428b(), (C46801dp) ((C74176nj) obj).f207084k.mo17428b(), (C46723bg) ((C74176nj) obj).f206677a.ap.mo17428b(), new C141539d((C46428ao) ((C74176nj) obj).f206677a.aJ.mo17428b()), (C21370a) ((C74176nj) obj).f206677a.i.mo17428b(), ((C46897i) ((C74176nj) obj).f206730b.f198027a.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45365573").mo50907f(), ((C46897i) ((C74176nj) obj).f206730b.f198027a.mo67021gi().f184686a.mo17428b()).mo50901a("com.google.ar.sceneviewer.android.user 45375335").mo50907f(), new C141559e(((C74176nj) obj).f206836d.f205391d, ((C74176nj) obj).f206730b.f198663m), (C141554c) ((C74176nj) obj).f206769bm.mo17428b());
                        bVar = this;
                        bVar.f384371a = amVar3;
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(bVar.f122869b, bVar.f384373d));
                    } else {
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + C141584am.class.toString() + ", but the wrapper available is of type: " + String.valueOf(fragment.getClass()) + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = bVar.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e16) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e16);
        } catch (Throwable th) {
            th = th;
            Throwable th2 = th;
            C47831fm.m85019n();
            throw th2;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
