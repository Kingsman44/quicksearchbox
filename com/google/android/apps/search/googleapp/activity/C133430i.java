package com.google.android.apps.search.googleapp.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.gsa.h.e.a;
import com.google.android.apps.gsa.h.i.c;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84489b;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84490c;
import com.google.android.apps.gsa.search.core.p6507ag.p6510c.C84492e;
import com.google.android.apps.search.googleapp.activity.p10136a.C133376f;
import com.google.android.apps.search.googleapp.activity.p10137b.C133411h;
import com.google.android.apps.search.googleapp.homescreen.p10312b.C136148a;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136234d;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.incognito.p10329g.C136337z;
import com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f;
import com.google.android.apps.search.googleapp.p10117aa.p10119b.C133110a;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136380ac;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136382ae;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136384c;
import com.google.android.apps.search.googleapp.p10338l.p10339a.C136386e;
import com.google.android.apps.search.googleapp.p10370p.C136885u;
import com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b;
import com.google.android.apps.search.googleapp.p10527u.C139762c;
import com.google.android.apps.search.googleapp.p10527u.C139777r;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.p10536x.p10538b.C139866a;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137117k;
import com.google.android.apps.search.googleapp.promomanager.p10377f.C137120n;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.apps.search.googleapp.startup.appinteractive.C139684f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2476a.p2482d.C32214c;
import com.google.android.libraries.search.p2476a.p2482d.C32215d;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C62995dn;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69036bf;
import p5304e.p5305a.p5306a.p5411p.p5416c.p5417a.C69058ca;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.i */
/* compiled from: PG */
public final class C133430i extends C133422bi implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f363574a = new C2393x(this);

    /* renamed from: c */
    private C133444w f363575c;

    /* renamed from: d */
    private Context f363576d;

    /* renamed from: e */
    private boolean f363577e;

    @Deprecated
    public C133430i() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C133444w mo17754z() {
        C133444w wVar = this.f363575c;
        if (wVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f363577e) {
            return wVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo111137b() {
        return new C47242k(this);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        mo17754z().mo111156m(str, printWriter);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f363576d == null) {
            this.f363576d = new C47236e((Fragment) this, super.getContext());
        }
        return this.f363576d;
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
        return this.f363574a;
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
            C133429h.m216567a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C139779t tVar;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C133444w a = mo17754z();
            a.mo111147d(a.f363618c.getIntent());
            C47558bi a2 = C47831fm.m85006a("GoogleAppActivityMainFragmentPeer#onCreate");
            try {
                a.f363620e.mo50429i(a.f363603L);
                if (bundle == null) {
                    C139777r rVar = a.f363621f.f363481b;
                    if (rVar == null) {
                        rVar = C139777r.f379893c;
                    }
                    C139779t a3 = C139779t.m227245a(rVar.f379896b);
                    if (a3 == null) {
                        a3 = C139779t.UNSPECIFIED;
                    }
                    if (a3 != C139779t.TABS || a.f363640y.mo110979b()) {
                        int i = rVar.f379896b;
                        C139779t a4 = C139779t.m227245a(i);
                        if (a4 == null) {
                            a4 = C139779t.UNSPECIFIED;
                        }
                        C139779t tVar2 = C139779t.UNSPECIFIED;
                        if (a4 != tVar2) {
                            Map map = a.f363622g;
                            C139779t a5 = C139779t.m227245a(i);
                            if (a5 != null) {
                                tVar2 = a5;
                            }
                            if (map.containsKey(tVar2)) {
                                tVar = C139779t.m227245a(rVar.f379896b);
                                if (tVar == null) {
                                    tVar = C139779t.UNSPECIFIED;
                                }
                            }
                        }
                        tVar = C139779t.HOME_SCREEN;
                    } else {
                        tVar = C139779t.HOME_SCREEN;
                    }
                    a.f363606O = tVar;
                    if (a.f363622g.containsKey(a.f363606O)) {
                        a.f363606O.name();
                    } else {
                        a.f363606O = (C139779t) C58557jl.m90133n(((C58495hd) a.f363622g).keySet());
                        ((C58970a) ((C58970a) C133444w.f363591a.mo56226d()).mo56372aa(40040)).mo56386p("Fallback to show the only tab fragment provided in this dev build");
                    }
                    a.f363607P = a.f363606O;
                } else {
                    C133415bb bbVar = (C133415bb) ProtoParsers.m95520c(bundle, "instanceState", C133415bb.f363541e, a.f363623h);
                    C139779t a6 = C139779t.m227245a(bbVar.f363545c);
                    if (a6 == null) {
                        a6 = C139779t.UNSPECIFIED;
                    }
                    a.f363606O = a6;
                    C139779t a7 = C139779t.m227245a(bbVar.f363546d);
                    if (a7 == null) {
                        a7 = C139779t.UNSPECIFIED;
                    }
                    a.f363607P = a7;
                    Map unmodifiableMap = Collections.unmodifiableMap(bbVar.f363544b);
                    a.f363633r.clear();
                    for (Map.Entry entry : unmodifiableMap.entrySet()) {
                        a.f363633r.put(C139779t.m227245a(((Integer) entry.getKey()).intValue()), (Integer) entry.getValue());
                    }
                    Bundle bundle2 = bundle.getBundle("navControllerInstanceState");
                    if (bundle2 != null) {
                        a.f363595D.mo111114f(bundle2);
                    }
                    a.mo111152i(a.f363606O);
                }
            } catch (C62974ct e) {
                ((C58970a) ((C58970a) ((C58970a) C133444w.f363591a.mo56226d()).mo56382g(e)).mo56372aa(40039)).mo56389s("failed to parse bundle for key %s", "instanceState");
                a.f363606O = C139779t.HOME_SCREEN;
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
            a.mo111149f(a.f363618c.getIntent());
            a2.close();
            C47831fm.m85019n();
        } catch (Throwable th2) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th3) {
                C133429h.m216567a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        if (r4.equals("and.gsa.widget.text") != false) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101 A[Catch:{ all -> 0x02cd, all -> 0x02d2, all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0107 A[Catch:{ all -> 0x02cd, all -> 0x02d2, all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010c A[Catch:{ all -> 0x02cd, all -> 0x02d2, all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123 A[Catch:{ all -> 0x02cd, all -> 0x02d2, all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0126 A[Catch:{ all -> 0x02cd, all -> 0x02d2, all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b A[Catch:{ all -> 0x02cd, all -> 0x02d2, all -> 0x02d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            com.google.apps.tiktok.tracing.ab r0 = r12.f122869b
            r0.mo51381i()
            r12.mo51119t(r13, r14, r15)     // Catch:{ all -> 0x02d7 }
            com.google.android.apps.search.googleapp.activity.w r0 = r12.mo17754z()     // Catch:{ all -> 0x02d7 }
            java.lang.String r1 = "GoogleAppActivityMainFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r1)     // Catch:{ all -> 0x02d7 }
            r2 = 2131625191(0x7f0e04e7, float:1.8877583E38)
            r3 = 0
            android.view.View r13 = r13.inflate(r2, r14, r3)     // Catch:{ all -> 0x02cd }
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.b.i r14 = r0.f363600I     // Catch:{ all -> 0x02cd }
            boolean r14 = r14.mo111133a()     // Catch:{ all -> 0x02cd }
            r2 = 8
            r4 = 2131431725(0x7f0b112d, float:1.8485187E38)
            r5 = 4
            if (r14 == 0) goto L_0x0048
            android.view.View r14 = r13.findViewById(r4)     // Catch:{ all -> 0x02cd }
            r6 = 2131431735(0x7f0b1137, float:1.8485208E38)
            android.view.View r6 = r13.findViewById(r6)     // Catch:{ all -> 0x02cd }
            r14.setVisibility(r2)     // Catch:{ all -> 0x02cd }
            r6.setVisibility(r5)     // Catch:{ all -> 0x02cd }
            if (r15 == 0) goto L_0x0048
            java.lang.String r14 = "navRailVisibilityState"
            int r14 = r15.getInt(r14, r2)     // Catch:{ all -> 0x02cd }
            if (r14 != 0) goto L_0x0048
            r6.setVisibility(r3)     // Catch:{ all -> 0x02cd }
        L_0x0048:
            boolean r14 = r0.f363629n     // Catch:{ all -> 0x02cd }
            if (r14 == 0) goto L_0x0058
            android.view.View r14 = r13.findViewById(r4)     // Catch:{ all -> 0x02cd }
            r15 = 0
            r14.setElevation(r15)     // Catch:{ all -> 0x02cd }
            r15 = 0
            r14.setBackground(r15)     // Catch:{ all -> 0x02cd }
        L_0x0058:
            r14 = 2131431449(0x7f0b1019, float:1.8484628E38)
            android.view.View r14 = r13.findViewById(r14)     // Catch:{ all -> 0x02cd }
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14     // Catch:{ all -> 0x02cd }
            android.view.View r15 = r13.findViewById(r4)     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.s r4 = new com.google.android.apps.search.googleapp.activity.s     // Catch:{ all -> 0x02cd }
            r4.<init>(r14)     // Catch:{ all -> 0x02cd }
            r15.addOnLayoutChangeListener(r4)     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.t r4 = new com.google.android.apps.search.googleapp.activity.t     // Catch:{ all -> 0x02cd }
            r4.<init>(r15)     // Catch:{ all -> 0x02cd }
            androidx.core.p098j.C2043bi.m5555ai(r14, r4)     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.a.f r14 = r0.f363595D     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.t r15 = r0.f363606O     // Catch:{ all -> 0x02cd }
            r15.getClass()
            com.google.android.apps.search.googleapp.activity.bd r4 = r0.f363632q     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.as r6 = r0.f363621f     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.k r7 = com.google.android.apps.search.googleapp.p10527u.C139770k.f379882c     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.j r7 = (com.google.android.apps.search.googleapp.p10527u.C139769j) r7     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.t r8 = com.google.android.apps.search.googleapp.p10527u.C139779t.SEARCH     // Catch:{ all -> 0x02cd }
            r9 = 3
            r10 = 2
            r11 = 1
            if (r15 != r8) goto L_0x0161
            com.google.android.apps.search.googleapp.search.e r5 = com.google.android.apps.search.googleapp.search.C137411e.f373755g     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.search.d r5 = (com.google.android.apps.search.googleapp.search.C137404d) r5     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.t.c.b r4 = r4.f363547a     // Catch:{ all -> 0x02cd }
            j$.util.Optional r4 = r4.mo115169a()     // Catch:{ all -> 0x02cd }
            boolean r8 = r4.isPresent()     // Catch:{ all -> 0x02cd }
            if (r8 == 0) goto L_0x00eb
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x02cd }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x02cd }
            int r8 = r4.hashCode()     // Catch:{ all -> 0x02cd }
            switch(r8) {
                case -1802356473: goto L_0x00cf;
                case 103236435: goto L_0x00c5;
                case 987896351: goto L_0x00bb;
                case 1139966940: goto L_0x00b1;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x00d8
        L_0x00b1:
            java.lang.String r3 = "and.gsa.launcher.shelf.appssearch"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00d8
            r3 = 2
            goto L_0x00d9
        L_0x00bb:
            java.lang.String r3 = "and.gsa.launcher.homescreen.appssearch"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00d8
            r3 = 1
            goto L_0x00d9
        L_0x00c5:
            java.lang.String r3 = "and.gsa.launcher.allapps.appssearch"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00d8
            r3 = 3
            goto L_0x00d9
        L_0x00cf:
            java.lang.String r8 = "and.gsa.widget.text"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r3 = -1
        L_0x00d9:
            if (r3 == 0) goto L_0x00e8
            if (r3 == r11) goto L_0x00e5
            if (r3 == r10) goto L_0x00e5
            if (r3 == r9) goto L_0x00e2
            goto L_0x00eb
        L_0x00e2:
            com.google.android.apps.search.googleapp.t.e.d r3 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.PIXEL_LAUNCHER_ALL_APPS     // Catch:{ all -> 0x02cd }
            goto L_0x00ed
        L_0x00e5:
            com.google.android.apps.search.googleapp.t.e.d r3 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.PIXEL_LAUNCHER     // Catch:{ all -> 0x02cd }
            goto L_0x00ed
        L_0x00e8:
            com.google.android.apps.search.googleapp.t.e.d r3 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.WIDGET     // Catch:{ all -> 0x02cd }
            goto L_0x00ed
        L_0x00eb:
            com.google.android.apps.search.googleapp.t.e.d r3 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN     // Catch:{ all -> 0x02cd }
        L_0x00ed:
            r5.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.search.e r4 = (com.google.android.apps.search.googleapp.search.C137411e) r4     // Catch:{ all -> 0x02cd }
            int r3 = r3.f379715p     // Catch:{ all -> 0x02cd }
            r4.f373758b = r3     // Catch:{ all -> 0x02cd }
            int r3 = r4.f373757a     // Catch:{ all -> 0x02cd }
            r3 = r3 | r11
            r4.f373757a = r3     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.p r3 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r3 != 0) goto L_0x0103
            com.google.android.apps.search.googleapp.u.p r3 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x0103:
            int r4 = r3.f379890a     // Catch:{ all -> 0x02cd }
            if (r4 != r11) goto L_0x010c
            java.lang.Object r3 = r3.f379891b     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.search.e.g r3 = (com.google.android.apps.search.googleapp.search.p10409e.C137418g) r3     // Catch:{ all -> 0x02cd }
            goto L_0x010e
        L_0x010c:
            com.google.android.apps.search.googleapp.search.e.g r3 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x02cd }
        L_0x010e:
            r5.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.search.e r4 = (com.google.android.apps.search.googleapp.search.C137411e) r4     // Catch:{ all -> 0x02cd }
            r3.getClass()     // Catch:{ all -> 0x02cd }
            r4.f373761e = r3     // Catch:{ all -> 0x02cd }
            int r3 = r4.f373757a     // Catch:{ all -> 0x02cd }
            r2 = r2 | r3
            r4.f373757a = r2     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.p r2 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r2 != 0) goto L_0x0126
            com.google.android.apps.search.googleapp.u.p r3 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
            goto L_0x0127
        L_0x0126:
            r3 = r2
        L_0x0127:
            int r3 = r3.f379890a     // Catch:{ all -> 0x02cd }
            if (r3 != r9) goto L_0x014b
            if (r2 != 0) goto L_0x012f
            com.google.android.apps.search.googleapp.u.p r2 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x012f:
            int r3 = r2.f379890a     // Catch:{ all -> 0x02cd }
            if (r3 != r9) goto L_0x0138
            java.lang.Object r2 = r2.f379891b     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.h.p r2 = (com.google.android.apps.search.googleapp.p10310h.C136135p) r2     // Catch:{ all -> 0x02cd }
            goto L_0x013a
        L_0x0138:
            com.google.android.apps.search.googleapp.h.p r2 = com.google.android.apps.search.googleapp.p10310h.C136135p.f370764b     // Catch:{ all -> 0x02cd }
        L_0x013a:
            r5.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.search.e r3 = (com.google.android.apps.search.googleapp.search.C137411e) r3     // Catch:{ all -> 0x02cd }
            r2.getClass()     // Catch:{ all -> 0x02cd }
            r3.f373759c = r2     // Catch:{ all -> 0x02cd }
            int r2 = r3.f373757a     // Catch:{ all -> 0x02cd }
            r2 = r2 | r10
            r3.f373757a = r2     // Catch:{ all -> 0x02cd }
        L_0x014b:
            r7.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r2 = r7.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.k r2 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r2     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r3 = r5.build()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.search.e r3 = (com.google.android.apps.search.googleapp.search.C137411e) r3     // Catch:{ all -> 0x02cd }
            r3.getClass()     // Catch:{ all -> 0x02cd }
            r2.f379885b = r3     // Catch:{ all -> 0x02cd }
            r2.f379884a = r10     // Catch:{ all -> 0x02cd }
            goto L_0x0228
        L_0x0161:
            com.google.android.apps.search.googleapp.u.t r2 = com.google.android.apps.search.googleapp.p10527u.C139779t.HOME_SCREEN     // Catch:{ all -> 0x02cd }
            if (r15 != r2) goto L_0x01af
            com.google.android.apps.search.googleapp.homescreen.c r2 = com.google.android.apps.search.googleapp.homescreen.C136149c.f370793c     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.homescreen.b r2 = (com.google.android.apps.search.googleapp.homescreen.C136147b) r2     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.p r3 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r3 != 0) goto L_0x0173
            com.google.android.apps.search.googleapp.u.p r3 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x0173:
            int r3 = r3.f379890a     // Catch:{ all -> 0x02cd }
            if (r3 != r10) goto L_0x0199
            com.google.android.apps.search.googleapp.u.p r3 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r3 != 0) goto L_0x017d
            com.google.android.apps.search.googleapp.u.p r3 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x017d:
            int r4 = r3.f379890a     // Catch:{ all -> 0x02cd }
            if (r4 != r10) goto L_0x0186
            java.lang.Object r3 = r3.f379891b     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.h.d r3 = (com.google.android.apps.search.googleapp.p10310h.C136123d) r3     // Catch:{ all -> 0x02cd }
            goto L_0x0188
        L_0x0186:
            com.google.android.apps.search.googleapp.h.d r3 = com.google.android.apps.search.googleapp.p10310h.C136123d.f370743d     // Catch:{ all -> 0x02cd }
        L_0x0188:
            r2.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.homescreen.c r4 = (com.google.android.apps.search.googleapp.homescreen.C136149c) r4     // Catch:{ all -> 0x02cd }
            r3.getClass()     // Catch:{ all -> 0x02cd }
            r4.f370796b = r3     // Catch:{ all -> 0x02cd }
            int r3 = r4.f370795a     // Catch:{ all -> 0x02cd }
            r3 = r3 | r11
            r4.f370795a = r3     // Catch:{ all -> 0x02cd }
        L_0x0199:
            r7.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r3 = r7.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.k r3 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r3     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.homescreen.c r2 = (com.google.android.apps.search.googleapp.homescreen.C136149c) r2     // Catch:{ all -> 0x02cd }
            r2.getClass()     // Catch:{ all -> 0x02cd }
            r3.f379885b = r2     // Catch:{ all -> 0x02cd }
            r3.f379884a = r11     // Catch:{ all -> 0x02cd }
            goto L_0x0228
        L_0x01af:
            com.google.android.apps.search.googleapp.u.t r2 = com.google.android.apps.search.googleapp.p10527u.C139779t.COLLECTIONS     // Catch:{ all -> 0x02cd }
            if (r15 != r2) goto L_0x0204
            com.google.android.apps.search.googleapp.collections.l r2 = com.google.android.apps.search.googleapp.collections.C133514l.f363786c     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.collections.k r2 = (com.google.android.apps.search.googleapp.collections.C133513k) r2     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.p r3 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r3 != 0) goto L_0x01c1
            com.google.android.apps.search.googleapp.u.p r3 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x01c1:
            int r3 = r3.f379890a     // Catch:{ all -> 0x02cd }
            if (r3 != r5) goto L_0x01ef
            com.google.android.apps.search.googleapp.u.p r3 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r3 != 0) goto L_0x01cb
            com.google.android.apps.search.googleapp.u.p r3 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x01cb:
            int r4 = r3.f379890a     // Catch:{ all -> 0x02cd }
            if (r4 != r5) goto L_0x01d4
            java.lang.Object r3 = r3.f379891b     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.collections.a.b r3 = (com.google.android.apps.search.googleapp.collections.p10142a.C133493b) r3     // Catch:{ all -> 0x02cd }
            goto L_0x01d6
        L_0x01d4:
            com.google.android.apps.search.googleapp.collections.a.b r3 = com.google.android.apps.search.googleapp.collections.p10142a.C133493b.f363732c     // Catch:{ all -> 0x02cd }
        L_0x01d6:
            java.lang.String r3 = r3.f363735b     // Catch:{ all -> 0x02cd }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x02cd }
            if (r4 != 0) goto L_0x01ef
            r2.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.collections.l r4 = (com.google.android.apps.search.googleapp.collections.C133514l) r4     // Catch:{ all -> 0x02cd }
            r3.getClass()     // Catch:{ all -> 0x02cd }
            int r5 = r4.f363788a     // Catch:{ all -> 0x02cd }
            r5 = r5 | r11
            r4.f363788a = r5     // Catch:{ all -> 0x02cd }
            r4.f363789b = r3     // Catch:{ all -> 0x02cd }
        L_0x01ef:
            r7.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r3 = r7.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.k r3 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r3     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.collections.l r2 = (com.google.android.apps.search.googleapp.collections.C133514l) r2     // Catch:{ all -> 0x02cd }
            r2.getClass()     // Catch:{ all -> 0x02cd }
            r3.f379885b = r2     // Catch:{ all -> 0x02cd }
            r3.f379884a = r9     // Catch:{ all -> 0x02cd }
            goto L_0x0228
        L_0x0204:
            com.google.android.apps.search.googleapp.u.t r2 = com.google.android.apps.search.googleapp.p10527u.C139779t.GOOGLE_APP_BROWSER     // Catch:{ all -> 0x02cd }
            if (r15 != r2) goto L_0x0228
            com.google.android.apps.search.googleapp.u.p r2 = r6.f363482c     // Catch:{ all -> 0x02cd }
            if (r2 != 0) goto L_0x020e
            com.google.android.apps.search.googleapp.u.p r2 = com.google.android.apps.search.googleapp.p10527u.C139775p.f379888c     // Catch:{ all -> 0x02cd }
        L_0x020e:
            int r3 = r2.f379890a     // Catch:{ all -> 0x02cd }
            r4 = 6
            if (r3 != r4) goto L_0x0218
            java.lang.Object r2 = r2.f379891b     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r2 = (com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h) r2     // Catch:{ all -> 0x02cd }
            goto L_0x021a
        L_0x0218:
            com.google.android.apps.search.googleapp.googleappbrowser.a.h r2 = com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h.f369059n     // Catch:{ all -> 0x02cd }
        L_0x021a:
            r7.copyOnWrite()     // Catch:{ all -> 0x02cd }
            com.google.protobuf.bv r3 = r7.instance     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.k r3 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r3     // Catch:{ all -> 0x02cd }
            r2.getClass()     // Catch:{ all -> 0x02cd }
            r3.f379885b = r2     // Catch:{ all -> 0x02cd }
            r3.f379884a = r5     // Catch:{ all -> 0x02cd }
        L_0x0228:
            com.google.protobuf.bv r2 = r7.build()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.u.k r2 = (com.google.android.apps.search.googleapp.p10527u.C139770k) r2     // Catch:{ all -> 0x02cd }
            r14.mo111112d(r15, r2)     // Catch:{ all -> 0x02cd }
            int r14 = r0.f363599H     // Catch:{ all -> 0x02cd }
            android.view.View r14 = r13.findViewById(r14)     // Catch:{ all -> 0x02cd }
            com.google.android.libraries.logging.ve.ab r15 = r0.f363630o     // Catch:{ all -> 0x02cd }
            com.google.android.libraries.logging.ve.af r2 = r15.f76990a     // Catch:{ all -> 0x02cd }
            r3 = 118804(0x1d014, float:1.6648E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x02cd }
            com.google.android.libraries.logging.ve.c r2 = r2.mo33805a(r3)     // Catch:{ all -> 0x02cd }
            r15.mo33801b(r14, r2)     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.dp r14 = r0.f363637v     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.incognito.b.d r15 = r0.f363636u     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.bg r15 = r15.f371018a     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.incognito.b.b r2 = com.google.android.apps.search.googleapp.incognito.p10320b.C136232b.f371016a     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.bc r3 = new com.google.apps.tiktok.dataservice.bc     // Catch:{ all -> 0x02cd }
            java.lang.String r4 = "incognito-mode-state"
            r3.<init>(r15, r2, r4)     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.di r15 = r0.f363604M     // Catch:{ all -> 0x02cd }
            r14.mo50707a(r3, r15)     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.dp r14 = r0.f363637v     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.promomanager.b.bx r15 = r0.f363594C     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.ag r15 = r15.mo113449f()     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.promomanager.f.m r2 = r0.f363592A     // Catch:{ all -> 0x02cd }
            r14.mo50707a(r15, r2)     // Catch:{ all -> 0x02cd }
            boolean r14 = r0.f363628m     // Catch:{ all -> 0x02cd }
            if (r14 != 0) goto L_0x02ab
            com.google.apps.tiktok.dataservice.dp r14 = r0.f363637v     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.b.h r15 = r0.f363638w     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.bg r2 = r15.f363529a     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.b.g r3 = new com.google.android.apps.search.googleapp.activity.b.g     // Catch:{ all -> 0x02cd }
            r3.<init>(r15)     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.bc r15 = new com.google.apps.tiktok.dataservice.bc     // Catch:{ all -> 0x02cd }
            java.lang.String r4 = "NAV_BAR_VISIBILITY_KEY"
            r15.<init>(r2, r3, r4)     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.w$a r2 = new com.google.android.apps.search.googleapp.activity.w$a     // Catch:{ all -> 0x02cd }
            r2.<init>(r0)     // Catch:{ all -> 0x02cd }
            r14.mo50707a(r15, r2)     // Catch:{ all -> 0x02cd }
            boolean r14 = r0.f363597F     // Catch:{ all -> 0x02cd }
            if (r14 == 0) goto L_0x02ab
            com.google.android.apps.search.googleapp.aa.b.a r14 = r0.f363640y     // Catch:{ all -> 0x02cd }
            boolean r14 = r14.mo110979b()     // Catch:{ all -> 0x02cd }
            if (r14 == 0) goto L_0x02ab
            com.google.apps.tiktok.dataservice.dp r14 = r0.f363637v     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.aa.a.f r15 = r0.f363641z     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.bg r2 = r15.f362839b     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.aa.a.e r3 = new com.google.android.apps.search.googleapp.aa.a.e     // Catch:{ all -> 0x02cd }
            r3.<init>(r15)     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.ah r15 = com.google.android.apps.search.googleapp.p10117aa.p10118a.C133081f.f362838a     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.bc r4 = new com.google.apps.tiktok.dataservice.bc     // Catch:{ all -> 0x02cd }
            r4.<init>(r2, r3, r15)     // Catch:{ all -> 0x02cd }
            com.google.apps.tiktok.dataservice.di r15 = r0.f363605N     // Catch:{ all -> 0x02cd }
            r14.mo50707a(r4, r15)     // Catch:{ all -> 0x02cd }
        L_0x02ab:
            com.google.android.apps.search.googleapp.startup.appinteractive.f r14 = r0.f363626k     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.p r15 = new com.google.android.apps.search.googleapp.activity.p     // Catch:{ all -> 0x02cd }
            r15.<init>(r0, r13)     // Catch:{ all -> 0x02cd }
            r14.mo115167b(r15)     // Catch:{ all -> 0x02cd }
            j$.util.Optional r14 = r0.f363639x     // Catch:{ all -> 0x02cd }
            com.google.android.apps.search.googleapp.activity.q r15 = com.google.android.apps.search.googleapp.activity.C133438q.f363585a     // Catch:{ all -> 0x02cd }
            r14.ifPresent(r15)     // Catch:{ all -> 0x02cd }
            r1.close()     // Catch:{ all -> 0x02d7 }
            if (r13 == 0) goto L_0x02c5
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r13
        L_0x02c5:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException     // Catch:{ all -> 0x02d7 }
            java.lang.String r14 = "Fragment cannot use Event annotations with null view!"
            r13.<init>(r14)     // Catch:{ all -> 0x02d7 }
            throw r13     // Catch:{ all -> 0x02d7 }
        L_0x02cd:
            r13 = move-exception
            r1.close()     // Catch:{ all -> 0x02d2 }
            goto L_0x02d6
        L_0x02d2:
            r14 = move-exception
            com.google.android.apps.search.googleapp.activity.C133431j.m216575a(r13, r14)     // Catch:{ all -> 0x02d7 }
        L_0x02d6:
            throw r13     // Catch:{ all -> 0x02d7 }
        L_0x02d7:
            r13 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x02dc }
            goto L_0x02e0
        L_0x02dc:
            r14 = move-exception
            com.google.android.apps.search.googleapp.activity.C133429h.m216567a(r13, r14)
        L_0x02e0:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.activity.C133430i.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f363577e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C133429h.m216567a(th, th);
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
            C133429h.m216567a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C133444w a = mo17754z();
            if (a.mo111145b() != null) {
                a.mo111148e();
            }
            e.close();
            return;
        } catch (Throwable th) {
            C133429h.m216567a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C133444w a = mo17754z();
            C133402az azVar = (C133402az) C133415bb.f363541e.createBuilder();
            C139779t tVar = a.f363606O;
            if (tVar != null) {
                azVar.copyOnWrite();
                C133415bb bbVar = (C133415bb) azVar.instance;
                bbVar.f363545c = tVar.f379907i;
                bbVar.f363543a |= 1;
            }
            C139779t tVar2 = a.f363607P;
            if (tVar2 != null) {
                azVar.copyOnWrite();
                C133415bb bbVar2 = (C133415bb) azVar.instance;
                bbVar2.f363546d = tVar2.f379907i;
                bbVar2.f363543a |= 2;
            }
            for (Map.Entry entry : a.f363633r.entrySet()) {
                int i = ((C139779t) entry.getKey()).f379907i;
                int intValue = ((Integer) entry.getValue()).intValue();
                azVar.copyOnWrite();
                C133415bb bbVar3 = (C133415bb) azVar.instance;
                C62995dn dnVar = bbVar3.f363544b;
                if (!dnVar.f170058b) {
                    bbVar3.f363544b = dnVar.mo58980a();
                }
                bbVar3.f363544b.put(Integer.valueOf(i), Integer.valueOf(intValue));
            }
            ProtoParsers.m95532o(bundle, "instanceState", azVar.build());
            Bundle a2 = a.f363595D.mo111109a();
            if (a2 != null) {
                bundle.putBundle("navControllerInstanceState", a2);
            }
            if (a.f363600I.mo111133a()) {
                bundle.putInt("navRailVisibilityState", a.mo111144a().findViewById(R.id.googleapp_navigation_rail_container).getVisibility());
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133429h.m216567a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C133444w a = mo17754z();
            C47393f.m84233d(this, C139762c.class, new C133449x(a));
            C47393f.m84233d(this, C137117k.class, new C133450y(a));
            C47393f.m84233d(this, C32214c.class, new C133451z(a));
            C47393f.m84233d(this, C32215d.class, new C133377aa(a));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C133429h.m216567a(th, th);
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
        C133376f fVar;
        C133430i iVar = this;
        iVar.f122869b.mo51381i();
        try {
            if (!iVar.f363577e) {
                super.onAttach(context);
                if (iVar.f363575c == null) {
                    Object jN = mo111138d().mo17653jN();
                    AccountId accountId = (AccountId) ((C74176nj) jN).f206730b.f198239e.mo17428b();
                    Activity activity = (Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C133430i) {
                        C133430i iVar2 = (C133430i) fragment;
                        C68225k.m98532d(iVar2);
                        C46439e eVar = (C46439e) ((C74176nj) jN).f206942f.mo17428b();
                        Map hH = ((C74176nj) jN).mo69830hH();
                        Bundle b = ((C74176nj) jN).mo69504b();
                        C58838bb.m90869d(b.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                        C133395as asVar = (C133395as) ProtoParsers.m95522e(b, "TIKTOK_FRAGMENT_ARGUMENT", C133395as.f363478e, (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b());
                        C68225k.m98532d(asVar);
                        C62921ba baVar = (C62921ba) ((C74176nj) jN).f206677a.gG.mo17428b();
                        C136148a cl = ((C74176nj) jN).f206730b.mo66145cl();
                        C137419h cx = ((C74176nj) jN).f206730b.mo66157cx();
                        C28443m mVar = (C28443m) ((C74176nj) jN).f206677a.a.f202879fR.mo17428b();
                        boolean f = ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 262").mo50907f();
                        Optional empty = Optional.empty();
                        C139684f eb = ((C74176nj) jN).mo69691eb();
                        Object b2 = ((C74176nj) jN).f206836d.f205430l.mo17428b();
                        C84492e eVar2 = (C84492e) ((C74176nj) jN).f206677a.d.f201566bY.mo17428b();
                        C84489b bVar = (C84489b) ((C74176nj) jN).f206677a.d.f201567bZ.mo17428b();
                        C84490c cVar = (C84490c) ((C74176nj) jN).f206730b.f198027a.f199442fB.mo17428b();
                        C28306ab abVar = (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b();
                        C38553h hVar = (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b();
                        C133421bh bhVar = new C133421bh(new c((Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a, Optional.m71637of((C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b()), ((C74176nj) jN).mo69716f(), ((C74176nj) jN).mo69557c(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b()), ((C74176nj) jN).mo69918k(), ((C74176nj) jN).mo69971l(), (a) ((C74176nj) jN).f206665O.mo17428b(), (C139695b) ((C74176nj) jN).f206730b.f198027a.f199333cz.mo17428b(), (Executor) ((C74176nj) jN).f206677a.n.mo17428b(), ((C74176nj) jN).mo69587cd(), ((C74176nj) jN).f206730b.mo66139cf(), ((C74176nj) jN).f206730b.mo66145cl(), ((C74176nj) jN).f206730b.mo66157cx());
                        C133417bd bdVar = new C133417bd((C139695b) ((C74176nj) jN).f206730b.f198027a.f199333cz.mo17428b());
                        C133411h hVar2 = (C133411h) ((C74176nj) jN).f206836d.f205431m.mo17428b();
                        C38553h hVar3 = (C38553h) ((C74176nj) jN).f206730b.f198027a.f199220as.mo17428b();
                        IncognitoLifecycleObserver incognitoLifecycleObserver = (IncognitoLifecycleObserver) ((C74176nj) jN).f206664N.mo17428b();
                        C136247a aVar = (C136247a) ((C74176nj) jN).f206662L.mo17428b();
                        C136337z cC = ((C74176nj) jN).mo69560cC();
                        C136234d dVar = new C136234d((C46723bg) ((C74176nj) jN).f206677a.ap.mo17428b(), ((C74176nj) jN).f206677a.bH());
                        C46801dp dpVar = (C46801dp) ((C74176nj) jN).f207084k.mo17428b();
                        Optional empty2 = Optional.empty();
                        AtomicReference atomicReference = (AtomicReference) ((C74176nj) jN).f206783c.f205455i.mo17428b();
                        C133110a ed = ((C74176nj) jN).mo69693ed();
                        C133081f fVar2 = (C133081f) ((C74176nj) jN).f206836d.f205432n.mo17428b();
                        C137120n cY = ((C74176nj) jN).mo69582cY();
                        C136969bx bxVar = (C136969bx) ((C74176nj) jN).f206730b.f198027a.f199441fA.mo17428b();
                        C139866a dz = ((C74176nj) jN).mo69662dz();
                        C136885u uVar = (C136885u) ((C74176nj) jN).f206730b.f198018R.mo17428b();
                        boolean a = C69036bf.m100108a(((C74176nj) jN).f206730b.f198009I);
                        C69464a aVar2 = ((C74176nj) jN).f206667Q;
                        C136234d dVar2 = dVar;
                        C69464a aVar3 = ((C74176nj) jN).f206668R;
                        C133417bd bdVar2 = bdVar;
                        C69664n.m101061g(aVar2, "androidXNavigationController");
                        C69664n.m101061g(aVar3, "customNavigationController");
                        if (a) {
                            Object b3 = aVar2.mo17428b();
                            C69664n.m101060f(b3, "{\n      androidXNavigationController.get()\n    }");
                            fVar = (C133376f) b3;
                        } else {
                            Object b4 = aVar3.mo17428b();
                            C69664n.m101060f(b4, "{\n      customNavigationController.get()\n    }");
                            fVar = (C133376f) b4;
                        }
                        C133376f fVar3 = fVar;
                        C68225k.m98532d(fVar3);
                        iVar = this;
                        iVar.f363575c = new C133444w(accountId, activity, iVar2, eVar, hH, asVar, baVar, cl, cx, mVar, f, empty, eb, (HotwordDetectionRequester) b2, eVar2, bVar, cVar, abVar, bhVar, bdVar2, hVar2, hVar3, incognitoLifecycleObserver, aVar, cC, dVar2, dpVar, empty2, atomicReference, ed, fVar2, cY, bxVar, dz, uVar, fVar3, new C136382ae((C136380ac) ((C74176nj) jN).f206669S.mo17428b(), (C136384c) ((C74176nj) jN).f206730b.f198027a.f199444fD.mo17428b(), new C136386e((Activity) ((C74176nj) jN).f206836d.f205391d.mo17428b()), (C69585o) ((C74176nj) jN).f206677a.G.mo17428b(), (C71422aw) ((C74176nj) jN).f206677a.cy.mo17428b()), C69058ca.m100140a(((C74176nj) jN).f206730b.f198009I), ((Boolean) ((C74176nj) jN).f206730b.f198027a.f199443fC.mo17428b()).booleanValue(), C69036bf.m100108a(((C74176nj) jN).f206730b.f198009I), ((C74176nj) jN).f206730b.f198027a.mo67079jT(), ((C74176nj) jN).mo69551bu(), ((C74176nj) jN).f206677a.d.mo67789bm().mo60830b(), ((C46897i) ((C74176nj) jN).f206730b.f198027a.f199228b.f198009I.mo17428b()).mo50901a("com.google.android.libraries.search.googleapp.user 45379418").mo50907f(), ((C74176nj) jN).mo69793gX());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(iVar.f122869b, iVar.f363574a));
                    } else {
                        String obj = C133444w.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar2 = iVar.f122869b;
                    if (abVar2.f123354b == null) {
                        abVar2.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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
