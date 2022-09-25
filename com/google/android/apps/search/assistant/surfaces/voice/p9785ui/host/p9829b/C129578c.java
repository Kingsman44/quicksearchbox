package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2069cc;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127105w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127108z;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129567ai;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129675m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33564e;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33565f;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import kotlinx.coroutines.C71643cp;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c */
/* compiled from: PG */
public final class C129578c extends C129572ab implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C129636o f355653a;

    /* renamed from: c */
    private Context f355654c;

    /* renamed from: d */
    private final C2393x f355655d = new C2393x(this);

    /* renamed from: e */
    private boolean f355656e;

    @Deprecated
    public C129578c() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C129636o mo17754z() {
        C129636o oVar = this.f355653a;
        if (oVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f355656e) {
            return oVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo109111b() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f355654c == null) {
            this.f355654c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f355654c;
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
        return this.f355655d;
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
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C129636o a = mo17754z();
            C59052c cVar = (C59052c) C129636o.f355779b.mo56224b();
            String f = a.mo109140f();
            String a2 = C129567ai.m211554a(a.mo109137c().f355878b);
            String b = C129567ai.m211555b(a.mo109137c().f355877a);
            cVar.mo56379ah(new C59094n(38325));
            cVar.mo56359L("FragmentHost created [%s] with following destination:%s and host:%s", f, a2, b);
            a.mo109140f();
            int i = 1;
            if (a.f355788h.mo56113h()) {
                C59052c cVar2 = (C59052c) C129636o.f355779b.mo56224b();
                String f2 = a.mo109140f();
                cVar2.mo56379ah(new C59094n(38314));
                cVar2.mo56389s("[%s] Adding lockscreen permission", f2);
                Object c = a.f355788h.mo56107c();
                C69664n.m101060f(c, "optionalActivity.get()");
                Activity activity = (Activity) c;
                activity.getWindow().addFlags(C89885b.ACETONE_VALUE);
                activity.setShowWhenLocked(true);
                activity.setTurnScreenOn(true);
            }
            C129575ae aeVar = a.f355789i;
            C2069cc.m5650a(aeVar.f355649b.mo51123r(), false);
            Window r = aeVar.f355649b.mo51123r();
            C69664n.m101060f(r, BuildConfig.FLAVOR);
            r.clearFlags(134217728);
            r.setNavigationBarColor(0);
            r.setNavigationBarContrastEnforced(false);
            WindowManager.LayoutParams attributes = r.getAttributes();
            if (Build.VERSION.SDK_INT >= 30) {
                i = 3;
            }
            attributes.layoutInDisplayCutoutMode = i;
            r.setAttributes(attributes);
            aeVar.f355650c.mo50829i(R.id.assistant_state_host_subscription, aeVar.f355651d.mo107943b(), new C129573ac(r), new C129574ad(r));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C129636o a = mo17754z();
            C69664n.m101061g(layoutInflater, "inflater");
            a.mo109140f();
            View inflate = layoutInflater.inflate(R.layout.assistant_fragment_host_container, viewGroup, false);
            View r = C2043bi.m5589r(inflate, R.id.assistant_fragment_host_container);
            C69664n.m101060f(r, "requireViewById<View>(ro…_fragment_host_container)");
            a.f355790j.mo108810b(158177, r);
            C69664n.m101060f(inflate, "rootView");
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final void onDestroy() {
        C47573bx b = this.f122869b.mo51374b();
        try {
            mo51112m();
            C129636o a = mo17754z();
            C59052c cVar = (C59052c) C129636o.f355779b.mo56224b();
            String f = a.mo109140f();
            cVar.mo56379ah(new C59094n(38327));
            cVar.mo56389s("[%s] #onDestroy", f);
            C129675m d = a.mo109138d();
            if (d != null) {
                d.mo109187a();
            }
            a.f355799s.f349984c.mo5761a(false);
            b.close();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f355656e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
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
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C129636o a = mo17754z();
            C59052c cVar = (C59052c) C129636o.f355779b.mo56224b();
            String f = a.mo109140f();
            cVar.mo56379ah(new C59094n(38328));
            cVar.mo56389s("[%s] FragmentHost paused", f);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C129636o a = mo17754z();
            C59052c cVar = (C59052c) C129636o.f355779b.mo56224b();
            String f = a.mo109140f();
            cVar.mo56379ah(new C59094n(38329));
            cVar.mo56389s("[%s] FragmentHost resumed", f);
            e.close();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    public final void onStart() {
        this.f122869b.mo51381i();
        try {
            mo51117r();
            C129636o a = mo17754z();
            C59052c cVar = (C59052c) C129636o.f355779b.mo56224b();
            String f = a.mo109140f();
            cVar.mo56379ah(new C59094n(38330));
            cVar.mo56389s("[%s] #onStart", f);
            C127105w wVar = a.f355799s;
            Duration duration = C127108z.f349991a;
            wVar.f349984c.mo5761a(false);
            if (!wVar.f349985d) {
                wVar.f349985d = true;
                wVar.f349982a.incrementAndGet();
            }
            C71643cp g = a.mo109141g();
            if (g != null) {
                if (!g.mo62868mk()) {
                    if (!g.mo62875x()) {
                        if (g.mo62867mj()) {
                        }
                        C47831fm.m85019n();
                        return;
                    }
                    a.mo109140f();
                    C47831fm.m85019n();
                    return;
                }
            }
            if (g == null) {
                C59052c cVar2 = (C59052c) C129636o.f355779b.mo56226d();
                String f2 = a.mo109140f();
                cVar2.mo56379ah(new C59094n(38335));
                cVar2.mo56389s("[%s] onStart the transition should be not null, but it is", f2);
            } else {
                a.mo109140f();
            }
            Fragment c = a.f355783c.getChildFragmentManager().f634a.mo671c("ROOT_FRAGMENT");
            if (c == null) {
                a.mo109140f();
                a.mo109137c();
                a.mo109150r(a.mo109137c());
            } else if (c.isHidden()) {
                a.mo109140f();
                a.mo109137c();
                a.mo109149q(c);
            } else {
                a.mo109140f();
                a.mo109137c();
                a.mo109145m(a.mo109136a(a.mo109137c().f355878b), false);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r0.f355794n != false) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStop() {
        /*
            r7 = this;
            com.google.apps.tiktok.tracing.ab r0 = r7.f122869b
            r0.mo51381i()
            r7.mo51118s()     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.o r0 = r7.mo17754z()     // Catch:{ all -> 0x01fe }
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] #onStop"
            java.lang.String r3 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r5 = 38338(0x95c2, float:5.3723E-41)
            r4.<init>(r5)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r4)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x01fe }
            kotlinx.coroutines.cp r1 = r0.mo109141g()     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x0032
            r2 = 0
            r1.mo62723u(r2)     // Catch:{ all -> 0x01fe }
        L_0x0032:
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.w r1 = r0.f355799s     // Catch:{ all -> 0x01fe }
            j$.time.Duration r2 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127108z.f349991a     // Catch:{ all -> 0x01fe }
            boolean r2 = r1.f349985d     // Catch:{ all -> 0x01fe }
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x003d
            goto L_0x0055
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f349982a     // Catch:{ all -> 0x01fe }
            r2.decrementAndGet()     // Catch:{ all -> 0x01fe }
            r1.f349985d = r4     // Catch:{ all -> 0x01fe }
            android.os.PowerManager r2 = r1.f349983b     // Catch:{ all -> 0x01fe }
            boolean r2 = r2.isInteractive()     // Catch:{ all -> 0x01fe }
            if (r2 != 0) goto L_0x0055
            h.f.a.l r1 = r1.f349984c     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x01fe }
            r1.mo5761a(r2)     // Catch:{ all -> 0x01fe }
        L_0x0055:
            android.os.PowerManager r1 = r0.f355791k     // Catch:{ all -> 0x01fe }
            boolean r1 = r1.isInteractive()     // Catch:{ all -> 0x01fe }
            if (r1 != 0) goto L_0x00b3
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.w r1 = r0.f355784d     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.g r2 = r0.mo109137c()     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r2 = r2.f355878b     // Catch:{ all -> 0x01fe }
            java.lang.String r5 = "content"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.r r1 = r1.mo109155a(r2)     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.c r1 = r1.mo109193b()     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.c r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129648c.DISMISS_CONFIGURATION_UNDEFINED     // Catch:{ all -> 0x01fe }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x008d
            if (r1 == r3) goto L_0x008d
            r2 = 2
            if (r1 == r2) goto L_0x0089
            r2 = 3
            if (r1 != r2) goto L_0x0083
            goto L_0x00b3
        L_0x0083:
            h.g r0 = new h.g     // Catch:{ all -> 0x01fe }
            r0.<init>()     // Catch:{ all -> 0x01fe }
            throw r0     // Catch:{ all -> 0x01fe }
        L_0x0089:
            boolean r1 = r0.f355794n     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x00b3
        L_0x008d:
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Dismissing UI and Stopping interaction because screen turned off."
            java.lang.String r3 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r5 = 38344(0x95c8, float:5.3731E-41)
            r4.<init>(r5)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r4)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x01fe }
            r0.mo109148p()     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.j r0 = r0.f355786f     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127117i.m207897a(r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01fa
        L_0x00b3:
            com.google.common.base.ax r1 = r0.f355788h     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.f r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129627f.f355754a     // Catch:{ all -> 0x01fe }
            com.google.common.base.ax r1 = r1.mo56106b(r2)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01fe }
            java.lang.Object r1 = r1.mo56109e(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "optionalActivity.transfo…onfigurations }.or(false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01fe }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x00ee
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Keeping interaction. Reason: Changing configurations."
            java.lang.String r0 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r4 = 38343(0x95c7, float:5.373E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01fa
        L_0x00ee:
            boolean r1 = r0.f355796p     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x0110
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Keeping interaction. Reason: Navigating to different host."
            java.lang.String r0 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r4 = 38342(0x95c6, float:5.3729E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01fa
        L_0x0110:
            boolean r1 = r0.f355795o     // Catch:{ all -> 0x01fe }
            if (r1 != 0) goto L_0x0134
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Keeping interaction. Reason: Screen off initially."
            java.lang.String r4 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r6 = 38341(0x95c5, float:5.3727E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r5)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r4)     // Catch:{ all -> 0x01fe }
            r0.f355795o = r3     // Catch:{ all -> 0x01fe }
            goto L_0x01fa
        L_0x0134:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.aa r1 = r0.f355802v     // Catch:{ all -> 0x01fe }
            java.util.concurrent.atomic.AtomicReference r1 = r1.f355642a     // Catch:{ all -> 0x01fe }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x01fe }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x016d
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.aa r1 = r0.f355802v     // Catch:{ all -> 0x01fe }
            java.util.concurrent.atomic.AtomicReference r1 = r1.f355642a     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x01fe }
            r1.set(r2)     // Catch:{ all -> 0x01fe }
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Keeping interaction. Reason: Starting external activity."
            java.lang.String r0 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r4 = 38340(0x95c4, float:5.3726E-41)
            r3.<init>(r4)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r3)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r0)     // Catch:{ all -> 0x01fe }
            goto L_0x01fa
        L_0x016d:
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Stopping interaction."
            java.lang.String r3 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r6 = 38339(0x95c3, float:5.3724E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r5)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.g r1 = r0.mo109137c()     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r1 = r1.f355878b     // Catch:{ all -> 0x01fe }
            int r1 = r1.f355893b     // Catch:{ all -> 0x01fe }
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.m211713a(r1)     // Catch:{ all -> 0x01fe }
            if (r1 != 0) goto L_0x0199
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.DEFAULT_NOT_VISIBLE     // Catch:{ all -> 0x01fe }
        L_0x0199:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r2 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.INPUT     // Catch:{ all -> 0x01fe }
            if (r1 != r2) goto L_0x01ba
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Not removing lockscreen permission for InputPlate"
            java.lang.String r3 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r4 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r5 = 38319(0x95af, float:5.3696E-41)
            r4.<init>(r5)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r4)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x01fe }
            goto L_0x01f7
        L_0x01ba:
            com.google.common.base.ax r1 = r0.f355788h     // Catch:{ all -> 0x01fe }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x01fe }
            if (r1 == 0) goto L_0x01f7
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129636o.f355779b     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "[%s] Removing lockscreen permission"
            java.lang.String r3 = r0.mo109140f()     // Catch:{ all -> 0x01fe }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x01fe }
            r6 = 38318(0x95ae, float:5.3695E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x01fe }
            r1.mo56379ah(r5)     // Catch:{ all -> 0x01fe }
            r1.mo56389s(r2, r3)     // Catch:{ all -> 0x01fe }
            com.google.common.base.ax r1 = r0.f355788h     // Catch:{ all -> 0x01fe }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "optionalActivity.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ all -> 0x01fe }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x01fe }
            android.view.Window r2 = r1.getWindow()     // Catch:{ all -> 0x01fe }
            r3 = 524288(0x80000, float:7.34684E-40)
            r2.clearFlags(r3)     // Catch:{ all -> 0x01fe }
            r1.setShowWhenLocked(r4)     // Catch:{ all -> 0x01fe }
        L_0x01f7:
            r0.mo109148p()     // Catch:{ all -> 0x01fe }
        L_0x01fa:
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x01fe:
            r0 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0203 }
            goto L_0x0207
        L_0x0203:
            r1 = move-exception
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129576b.m211567a(r0, r1)
        L_0x0207:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129578c.onStop():void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C129636o a2 = mo17754z();
            C47393f.m84233d(this, C33564e.class, new C129637p(a2));
            C47393f.m84233d(this, C33565f.class, new C129638q(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_fragment_host), new C129639r(a2));
            a.mo51254d(a.f123128b.findViewById(R.id.assistant_fragment_host_container), new C129640s(a2));
            this.f54442o.mo24720k(bundle);
            C129636o a3 = mo17754z();
            C69664n.m101061g(view, "view");
            if (bundle != null) {
                a3.mo109140f();
                a3.mo109137c();
            } else {
                a3.mo109150r(a3.mo109137c());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C129576b.m211567a(th, th);
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
        this.f122869b.mo51381i();
        try {
            if (!this.f355656e) {
                super.onAttach(context);
                if (this.f355653a == null) {
                    this.f355653a = ((C129641t) mo109112d().mo17653jN()).mo109153aq();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f355655d));
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C129576b.m211567a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
