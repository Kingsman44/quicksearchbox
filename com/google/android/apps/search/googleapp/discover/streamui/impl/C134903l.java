package com.google.android.apps.search.googleapp.discover.streamui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0646fh;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.C0661fw;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.lifecycle.C2368bp;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.p10187b.C134267a;
import com.google.android.apps.search.googleapp.discover.loggingsignals.C134468f;
import com.google.android.apps.search.googleapp.discover.p10181d.C134206ak;
import com.google.android.apps.search.googleapp.discover.p10181d.C134210ao;
import com.google.android.apps.search.googleapp.discover.p10181d.C134212aq;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.apps.search.googleapp.discover.p10248y.C135212a;
import com.google.android.apps.search.googleapp.discover.p10248y.C135243bd;
import com.google.android.apps.search.googleapp.discover.p10248y.C135244be;
import com.google.android.apps.search.googleapp.discover.p10248y.C135263n;
import com.google.android.apps.search.googleapp.discover.p10249z.C135327ba;
import com.google.android.apps.search.googleapp.discover.streamui.C134720e;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w;
import com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y;
import com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b.C134840g;
import com.google.android.apps.search.googleapp.discover.streamui.p10225a.C134698d;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134703a;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134704b;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134705c;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134706d;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134707e;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134709g;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134710h;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134711i;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134712j;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134713k;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134722b;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134725e;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134726f;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134727g;
import com.google.android.apps.search.googleapp.discover.streamui.p10229e.C134743w;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134763n;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.android.apps.search.googleapp.discover.streamui.viewmodel.DiscoverViewModel;
import com.google.android.apps.search.googleapp.notificationsurvey.C136811b;
import com.google.android.apps.search.googleapp.p10310h.C136123d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
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
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62974ct;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.p5299a.C68288b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;
import p5488io.p5490b.p5494b.C69803b;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.l */
/* compiled from: PG */
public final class C134903l extends C134848bh implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    public final C2393x f367246a = new C2393x(this);

    /* renamed from: c */
    private C134904m f367247c;

    /* renamed from: d */
    private Context f367248d;

    /* renamed from: e */
    private boolean f367249e;

    @Deprecated
    public C134903l() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C134904m mo17754z() {
        C134904m mVar = this.f367247c;
        if (mVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f367249e) {
            return mVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47222f mo112026b() {
        return C47244m.m84043e(this);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C134904m a = mo17754z();
        C69664n.m101061g(str, "prefix");
        C69664n.m101061g(printWriter, "writer");
        printWriter.println(String.valueOf(str).concat(" google_app_discover"));
        try {
            String str2 = (String) a.f367324q.mo111672a(C134267a.f365769c).get(1, TimeUnit.SECONDS);
            C69664n.m101060f(str2, "data");
            for (String str3 : new C69762k("\n").mo61433a(str2, 0)) {
                printWriter.println(str + " " + str3);
            }
        } catch (Exception e) {
            C59052c cVar = (C59052c) ((C59052c) C134904m.f367250a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(40491));
            cVar.mo56386p("Bug report dump for Discover failed.");
            if (e instanceof InterruptedException) {
                e.printStackTrace(printWriter);
                Thread.currentThread().interrupt();
            } else if (!(e instanceof ExecutionException) && !(e instanceof TimeoutException)) {
                throw e;
            } else {
                e.printStackTrace(printWriter);
            }
        }
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f367248d == null) {
            this.f367248d = new C47236e((Fragment) this, super.getContext());
        }
        return this.f367248d;
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
        return this.f367246a;
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
            C134902k.m218748a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        C134904m a;
        C134893y yVar;
        Instant instant;
        C135244be beVar;
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            a = mo17754z();
            C2393x xVar = a.f367327t.f367246a;
            xVar.mo5790b(a.f367331x);
            xVar.mo5790b(a.f367254C);
            xVar.mo5790b(a.f367267P);
            xVar.mo5790b(a.f367333z);
            C46439e eVar = a.f367252A;
            eVar.mo50429i(a.f367295al);
            eVar.mo50429i(a.f367296am);
            eVar.mo50429i(C134904m.f367251b);
            a.f367289af = (DiscoverViewModel) new C2368bp(a.f367327t).mo5770a(DiscoverViewModel.class);
            yVar = null;
            if (bundle == null) {
                C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
                cVar.mo56379ah(new C59094n(40487));
                cVar.mo56386p("No savedInstanceState.");
            } else {
                MessageLite c = ProtoParsers.m95520c(bundle, "discoverRestoreBundle", C134893y.f367221f, a.f367330w);
                C69664n.m101060f(c, "{\n        ProtoParsers.g…egistry\n        )\n      }");
                C134893y yVar2 = (C134893y) c;
                C134891w wVar = yVar2.f367224b;
                if (wVar == null) {
                    wVar = C134891w.f367215e;
                }
                if ((wVar.f367217a & 1) != 0) {
                    yVar = yVar2;
                } else {
                    C59052c cVar2 = (C59052c) C134904m.f367250a.mo56226d();
                    cVar2.mo56379ah(new C59094n(40485));
                    cVar2.mo56386p("Has no top level contentId.");
                }
            }
        } catch (C62974ct e) {
            C59052c cVar3 = (C59052c) ((C59052c) C134904m.f367250a.mo56225c()).mo56382g(e);
            cVar3.mo56379ah(new C59094n(40486));
            cVar3.mo56386p("Failed to parse bundle.");
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C134902k.m218748a(th, th2);
            }
            throw th;
        }
        if (yVar == null) {
            instant = a.f367322o.mo57444a();
            C69664n.m101060f(instant, "timeSource.now()");
        } else {
            instant = Instant.ofEpochMilli(yVar.f367226d);
            C69664n.m101060f(instant, "ofEpochMilli(restoreData.fragmentCreationTimeMs)");
        }
        C69664n.m101061g(instant, "<set-?>");
        a.f367284aa = instant;
        if (yVar != null) {
            C134845be beVar2 = a.f367286ac;
            C134867aa aaVar = yVar.f367225c;
            if (aaVar == null) {
                aaVar = C134867aa.f367152d;
            }
            C69664n.m101060f(aaVar, "restoreData.scrollState");
            C69664n.m101061g(aaVar, "scrollState");
            beVar2.f367104d = new C134843bc(aaVar.f367155b, aaVar.f367156c);
            if ((yVar.f367223a & 8) != 0) {
                C57315dp dpVar = yVar.f367227e;
                if (dpVar == null) {
                    dpVar = C57315dp.f152986c;
                }
                a.f367293aj = dpVar;
            }
        } else {
            C136123d dVar = a.f367310c.f366910c;
            if (dVar == null) {
                dVar = C136123d.f370743d;
            }
            if ((dVar.f370745a & 1) != 0) {
                C134212aq aqVar = (C134212aq) a.f367326s.mo27525b();
                synchronized (aqVar.f365586d) {
                    boolean z = aqVar.f365589g;
                    if (aqVar.f365588f) {
                        aqVar.f365588f = false;
                        ((C59052c) ((C59052c) C134212aq.f365583a.mo56224b()).mo56372aa(40281)).mo56386p("#onDiscoverLaunchStartedFromNotification - not logging because it was a configuration change");
                        aqVar.f365590h.mo41716e("SKIPPED_CONFIG_CHANGE");
                    } else if (aqVar.f365587e != null) {
                        aqVar.mo111641b();
                        aqVar.f365590h.mo41716e("SKIPPED_MULTIPLE_FLOWS");
                    } else {
                        aqVar.mo111644e(new C134210ao(aqVar, z));
                        aqVar.f365589g = true;
                        aqVar.f365590h.mo41716e("STARTED");
                    }
                }
            }
        }
        if (yVar == null) {
            C136123d dVar2 = a.f367310c.f366910c;
            if (dVar2 == null) {
                dVar2 = C136123d.f370743d;
            }
            if ((dVar2.f370745a & 1) != 0) {
                int i = (int) a.f367313f;
                Instant b = a.mo111948b();
                C135050dx dxVar = a.f367288ae;
                C69664n.m101061g(b, "fragmentCreationTime");
                C69664n.m101061g(dxVar, "requestConfig");
                beVar = new C135263n(i, b, dxVar);
            } else {
                beVar = C135243bd.m219380b((int) a.f367313f, a.mo111948b(), a.f367288ae);
            }
        } else {
            C134891w wVar2 = yVar.f367224b;
            if (wVar2 == null) {
                wVar2 = C134891w.f367215e;
            }
            int i2 = wVar2.f367219c;
            Instant b2 = a.mo111948b();
            C134891w wVar3 = yVar.f367224b;
            if (wVar3 == null) {
                wVar3 = C134891w.f367215e;
            }
            String str = wVar3.f367218b;
            C69664n.m101060f(str, "restoreData.contentState.topLevelContentId");
            C134891w wVar4 = yVar.f367224b;
            if (wVar4 == null) {
                wVar4 = C134891w.f367215e;
            }
            String str2 = wVar4.f367220d;
            C69664n.m101060f(str2, "restoreData.contentState.sessionId");
            beVar = C135243bd.m219379a(i2, b2, new C135212a(str, str2, C135327ba.FORWARD), a.f367288ae);
        }
        a.mo112064u(beVar);
        C47831fm.m85019n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.ab r0 = r5.f122869b
            r0.mo51381i()
            r5.mo51119t(r6, r7, r8)     // Catch:{ all -> 0x0109 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r8 = r5.mo17754z()     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "inflater"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = "DiscoverStreamFragmentPeer#onCreateView"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)     // Catch:{ all -> 0x0109 }
            r1 = 2131625427(0x7f0e05d3, float:1.8878062E38)
            r2 = 0
            android.view.View r6 = r6.inflate(r1, r7, r2)     // Catch:{ all -> 0x0102 }
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            p5462h.p5473f.p5475b.C69664n.m101059e(r6, r7)     // Catch:{ all -> 0x0102 }
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6     // Catch:{ all -> 0x0102 }
            j$.util.Optional r7 = r8.f367275X     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.ab r1 = new com.google.android.apps.search.googleapp.discover.streamui.impl.ab     // Catch:{ all -> 0x0102 }
            r1.<init>(r6)     // Catch:{ all -> 0x0102 }
            r7.ifPresent(r1)     // Catch:{ all -> 0x0102 }
            j$.util.Optional r7 = r8.f367276Y     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.ac r1 = new com.google.android.apps.search.googleapp.discover.streamui.impl.ac     // Catch:{ all -> 0x0102 }
            r1.<init>(r6)     // Catch:{ all -> 0x0102 }
            r7.ifPresent(r1)     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.aa.r r7 = r8.f367332y     // Catch:{ all -> 0x0102 }
            kotlinx.coroutines.aw r1 = r8.f367319l     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.w r3 = new com.google.android.apps.search.googleapp.discover.streamui.impl.w     // Catch:{ all -> 0x0102 }
            r4 = 0
            r3.<init>(r7, r4)     // Catch:{ all -> 0x0102 }
            r7 = 3
            com.google.common.util.concurrent.cx r7 = kotlinx.coroutines.p5578d.C71663i.m104692e(r1, r4, r3, r7)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "Failed to enqueue the sync worker."
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0102 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r7, r1, r3)     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.u.a.a.a r7 = r8.f367299ap     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.s r1 = r8.f367302as     // Catch:{ all -> 0x0102 }
            java.util.Set r7 = r7.f367389b     // Catch:{ all -> 0x0102 }
            r7.add(r1)     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.i.k r7 = r8.f367266O     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.i.j r1 = new com.google.android.apps.search.googleapp.discover.streamui.i.j     // Catch:{ all -> 0x0102 }
            g.a.a r3 = r7.f366975a     // Catch:{ all -> 0x0102 }
            dagger.a.g r3 = (dagger.p5294a.C68221g) r3     // Catch:{ all -> 0x0102 }
            java.lang.Object r3 = r3.f184583a     // Catch:{ all -> 0x0102 }
            android.support.v4.app.Fragment r3 = (android.support.p031v4.app.Fragment) r3     // Catch:{ all -> 0x0102 }
            r3.getClass()     // Catch:{ all -> 0x0102 }
            g.a.a r7 = r7.f366976b     // Catch:{ all -> 0x0102 }
            java.lang.Object r7 = r7.mo17428b()     // Catch:{ all -> 0x0102 }
            com.google.apps.tiktok.account.AccountId r7 = (com.google.apps.tiktok.account.AccountId) r7     // Catch:{ all -> 0x0102 }
            r7.getClass()     // Catch:{ all -> 0x0102 }
            r6.getClass()     // Catch:{ all -> 0x0102 }
            r1.<init>(r3, r7, r6)     // Catch:{ all -> 0x0102 }
            r7 = 2131431517(0x7f0b105d, float:1.8484765E38)
            android.view.View r7 = androidx.core.p098j.C2043bi.m5589r(r6, r7)     // Catch:{ all -> 0x0102 }
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7     // Catch:{ all -> 0x0102 }
            android.view.View r3 = r1.f366973c     // Catch:{ all -> 0x0102 }
            r7.addView(r3)     // Catch:{ all -> 0x0102 }
            r8.f367294ak = r1     // Catch:{ all -> 0x0102 }
            boolean r7 = r8.f367316i     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00ae
            com.google.android.apps.search.googleapp.discover.streamui.impl.l r7 = r8.f367327t     // Catch:{ all -> 0x0102 }
            android.support.v4.app.FragmentManager r7 = r7.getChildFragmentManager()     // Catch:{ all -> 0x0102 }
            android.support.v4.app.cc r7 = r7.f634a     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "YOUTUBE_FRAGMENT_TAG"
            android.support.v4.app.Fragment r7 = r7.mo671c(r1)     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00ae
            com.google.android.apps.search.googleapp.discover.streamui.impl.l r1 = r8.f367327t     // Catch:{ all -> 0x0102 }
            android.support.v4.app.FragmentManager r1 = r1.getChildFragmentManager()     // Catch:{ all -> 0x0102 }
            android.support.v4.app.a r3 = new android.support.v4.app.a     // Catch:{ all -> 0x0102 }
            r3.<init>((android.support.p031v4.app.FragmentManager) r1)     // Catch:{ all -> 0x0102 }
            r3.mo516m(r7)     // Catch:{ all -> 0x0102 }
            r3.mo509f()     // Catch:{ all -> 0x0102 }
        L_0x00ae:
            com.google.android.apps.search.googleapp.discover.m.a r7 = r8.f367268Q     // Catch:{ all -> 0x0102 }
            r7.mo111798h()     // Catch:{ all -> 0x0102 }
            boolean r7 = androidx.core.p098j.C2043bi.m5569aw(r6)     // Catch:{ all -> 0x0102 }
            if (r7 != 0) goto L_0x00fa
            r7 = 2131431507(0x7f0b1053, float:1.8484745E38)
            android.view.View r7 = androidx.core.p098j.C2043bi.m5589r(r6, r7)     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "null cannot be cast to non-null type com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView"
            p5462h.p5473f.p5475b.C69664n.m101059e(r7, r1)     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView r7 = (com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView) r7     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.g r7 = r7.mo17754z()     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView r1 = r7.f367234b     // Catch:{ all -> 0x0102 }
            android.view.View$OnAttachStateChangeListener r7 = r7.f367244l     // Catch:{ all -> 0x0102 }
            r1.addOnAttachStateChangeListener(r7)     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.bf r7 = r8.f367270S     // Catch:{ all -> 0x0102 }
            r7.f367105a = r2     // Catch:{ all -> 0x0102 }
            r7.f367106b = r2     // Catch:{ all -> 0x0102 }
            boolean r7 = r8.f367318k     // Catch:{ all -> 0x0102 }
            if (r7 == 0) goto L_0x00e9
            com.google.android.apps.search.googleapp.discover.p.a.a r7 = r8.f367277Z     // Catch:{ all -> 0x0102 }
            com.google.apps.tiktok.contrib.work.a r8 = r7.f366242b     // Catch:{ all -> 0x0102 }
            com.google.apps.tiktok.account.AccountId r1 = r7.f366243c     // Catch:{ all -> 0x0102 }
            com.google.android.apps.search.googleapp.discover.p.a.c r7 = r7.f366241a     // Catch:{ all -> 0x0102 }
            com.google.apps.tiktok.contrib.work.t r7 = r7.f366249d     // Catch:{ all -> 0x0102 }
            r8.mo50518b(r1, r7)     // Catch:{ all -> 0x0102 }
        L_0x00e9:
            p5462h.p5472e.C69598b.m101013a(r0, r4)     // Catch:{ all -> 0x0109 }
            if (r6 == 0) goto L_0x00f2
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r6
        L_0x00f2:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch:{ all -> 0x0109 }
            java.lang.String r7 = "Fragment cannot use Event annotations with null view!"
            r6.<init>(r7)     // Catch:{ all -> 0x0109 }
            throw r6     // Catch:{ all -> 0x0109 }
        L_0x00fa:
            java.lang.String r6 = "Check failed."
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0102 }
            r7.<init>(r6)     // Catch:{ all -> 0x0102 }
            throw r7     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r7 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r6)     // Catch:{ all -> 0x0109 }
            throw r7     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r6 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x010e }
            goto L_0x0112
        L_0x010e:
            r7 = move-exception
            com.google.android.apps.search.googleapp.discover.streamui.impl.C134902k.m218748a(r6, r7)
        L_0x0112:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134903l.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0068, code lost:
        com.google.android.apps.search.googleapp.discover.streamui.impl.C134902k.m218748a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDestroy() {
        /*
            r4 = this;
            com.google.apps.tiktok.tracing.ab r0 = r4.f122869b
            com.google.apps.tiktok.tracing.bx r0 = r0.mo51374b()
            r4.mo51112m()     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r1 = r4.mo17754z()     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.l r2 = r1.f367327t     // Catch:{ all -> 0x0062 }
            androidx.lifecycle.x r2 = r2.f367246a     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.streamui.FeedRenderingStateUpdater r3 = r1.f367331x     // Catch:{ all -> 0x0062 }
            r2.mo5791c(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.scrolllock.LauncherHorizontalScrollLocker r3 = r1.f367254C     // Catch:{ all -> 0x0062 }
            r2.mo5791c(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.streamui.RecoverableErrorIntentHandler r3 = r1.f367267P     // Catch:{ all -> 0x0062 }
            r2.mo5791c(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.y.bb r2 = r1.f367292ai     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0040
            com.google.android.libraries.search.rendering.xuikit.d.a.b r2 = r2.f368411n     // Catch:{ all -> 0x0062 }
            com.google.android.libraries.elements.interfaces.ab r2 = r2.mo32545d()     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "null cannot be cast to non-null type com.google.android.libraries.search.rendering.xuikit.runtime.persistentstore.PersistentByteStore"
            p5462h.p5473f.p5475b.C69664n.m101059e(r2, r3)     // Catch:{ all -> 0x0062 }
            com.google.android.libraries.search.rendering.xuikit.d.h.i r2 = (com.google.android.libraries.search.rendering.xuikit.p3131d.p3139h.C40423i) r2     // Catch:{ all -> 0x0062 }
            java.lang.Object r3 = r2.f106098b     // Catch:{ all -> 0x0062 }
            monitor-enter(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.libraries.search.rendering.xuikit.d.h.r r2 = r2.f106099c     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            goto L_0x0040
        L_0x003d:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0062 }
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0040:
            com.google.android.apps.search.googleapp.discover.u.a.a.a r2 = r1.f367299ap     // Catch:{ all -> 0x0062 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.s r3 = r1.f367302as     // Catch:{ all -> 0x0062 }
            java.util.Set r2 = r2.f367389b     // Catch:{ all -> 0x0062 }
            r2.remove(r3)     // Catch:{ all -> 0x0062 }
            boolean r2 = r1.f367317j     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x0052
            com.google.android.apps.search.googleapp.discover.streamui.d.a r1 = r1.f367253B     // Catch:{ all -> 0x0062 }
            r2 = 0
            r1.f366835a = r2     // Catch:{ all -> 0x0062 }
        L_0x0052:
            java.lang.Object r1 = com.facebook.litho.C6105ap.f18035a     // Catch:{ all -> 0x0062 }
            monitor-enter(r1)     // Catch:{ all -> 0x0062 }
            java.util.Map r2 = com.facebook.litho.C6105ap.f18036b     // Catch:{ all -> 0x005f }
            r2.clear()     // Catch:{ all -> 0x005f }
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            r0.close()
            return
        L_0x005f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x005f }
            throw r2     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            com.google.android.apps.search.googleapp.discover.streamui.impl.C134902k.m218748a(r1, r0)
        L_0x006b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134903l.onDestroy():void");
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C134904m a = mo17754z();
            SwipeRefreshView s = a.mo112062s();
            if (s != null) {
                s.f13508a = null;
            }
            a.f367261J.f367245a.clear();
            a.f367255D.mo111495f();
            C134898g r = a.mo112061r();
            if (r != null) {
                DiscoverRecyclerView discoverRecyclerView = r.f367234b;
                discoverRecyclerView.clearOnScrollListeners();
                discoverRecyclerView.setItemAnimator((C0646fh) null);
                discoverRecyclerView.removeOnAttachStateChangeListener(r.f367244l);
            }
            DiscoverRecyclerView q = a.mo112060q();
            if (q != null) {
                if (!C2043bi.m5569aw(q)) {
                    q.removeOnLayoutChangeListener(a.f367290ag);
                    a.f367290ag = null;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            a.f367258G.mo13324V(-1, -1);
            a.f367268Q.mo111792b();
            a.f367294ak = null;
            C134698d dVar = a.f367274W;
            for (C69803b dispose : dVar.f366812d.values()) {
                dispose.dispose();
            }
            dVar.f366812d.clear();
            c.close();
            return;
        } catch (Throwable th) {
            C134902k.m218748a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f367249e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C134902k.m218748a(th, th);
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
            C134902k.m218748a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        C134720e eVar;
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C134904m a = mo17754z();
            C0167am activity = a.f367327t.getActivity();
            if (activity == null || !activity.isChangingConfigurations()) {
                eVar = C134720e.FRAGMENT_PAUSED;
            } else {
                eVar = C134720e.CONFIGURATION_CHANGED;
            }
            a.f367325r.mo111908d(eVar);
            C134847bg bgVar = a.f367271T;
            Snackbar snackbar = bgVar.f367109b;
            if (snackbar != null) {
                snackbar.mo48340e(3);
            }
            bgVar.f367109b = null;
            if (!a.f367265N.mo111990b()) {
                a.mo111954h();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134902k.m218748a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        mo51116q();
        C134904m a = mo17754z();
        C134722b bVar = a.f367325r;
        C134727g gVar = bVar.f366866b;
        C134766q qVar = bVar.f366865a;
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(gVar.f366882a, qVar, new C134726f(qVar));
        C69664n.m101060f(computeIfAbsent, "surface: TngDiscoverSurf…erLaunchStatus(surface) }");
        C134725e eVar = (C134725e) computeIfAbsent;
        synchronized (eVar) {
            if (eVar.mo111917c() && !(eVar.f366875a instanceof C134763n)) {
                eVar.mo111916b(true);
                C134743w wVar = bVar.f366868d;
                if (wVar != null) {
                    wVar.mo111946i();
                }
            }
            try {
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    C134902k.m218748a(th, th2);
                }
                throw th;
            }
        }
        C136123d dVar = a.f367310c.f366910c;
        if (dVar == null) {
            dVar = C136123d.f370743d;
        }
        if ((dVar.f370745a & 1) != 0) {
            C136123d dVar2 = a.f367310c.f366910c;
            if (dVar2 == null) {
                dVar2 = C136123d.f370743d;
            }
            C57315dp dpVar = dVar2.f370746b;
            if (dpVar == null) {
                dpVar = C57315dp.f152986c;
            }
            C69664n.m101060f(dpVar, "discoverStreamFragmentAr…s.pinnedContentParamToken");
            if (!dpVar.equals(a.f367293aj)) {
                C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
                cVar.mo56379ah(new C59094n(40495));
                cVar.mo56386p("Handling pinned content refresh");
                a.f367293aj = dpVar;
                C134212aq aqVar = (C134212aq) a.f367326s.mo27525b();
                synchronized (aqVar.f365586d) {
                    C134206ak akVar = aqVar.f365587e;
                    if (akVar != null) {
                        akVar.mo111629h();
                    }
                }
                C46439e eVar2 = a.f367252A;
                C46438d b = C135209c.m219303b(C71663i.m104692e(a.f367319l, (C71424ay) null, new C134917v(a, dpVar, (C69577g) null), 3));
                eVar2.mo50428h(b.f121541a, (Object) null, a.f367296am);
            }
        }
        if (!a.f367265N.mo111990b()) {
            a.mo111955i();
        }
        e.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0193, code lost:
        if (r0 == null) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ all -> 0x01fc, all -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[Catch:{ all -> 0x01fc, all -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0130 A[Catch:{ all -> 0x01fc, all -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d8 A[Catch:{ all -> 0x01fc, all -> 0x0201 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSaveInstanceState(android.os.Bundle r15) {
        /*
            r14 = this;
            java.lang.String r0 = "builder"
            java.lang.String r1 = "newBuilder()"
            com.google.apps.tiktok.tracing.ab r2 = r14.f122869b
            r2.mo51381i()
            com.google.android.libraries.at.c.ar r2 = r14.f54442o     // Catch:{ all -> 0x01fc }
            r2.mo24721A(r15)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r2 = r14.mo17754z()     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "outState"
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r3)     // Catch:{ all -> 0x01fc }
            java.lang.String r3 = "discoverRestoreBundle"
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y r4 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y.f367221f     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.x r4 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134892x) r4     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r0)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r5 = r2.f367323p     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.y.ad r6 = r5.f367201j     // Catch:{ all -> 0x01fc }
            r7 = 0
            if (r6 == 0) goto L_0x0033
            com.google.android.apps.search.googleapp.discover.y.aa r8 = r6.mo112170b()     // Catch:{ all -> 0x01fc }
            goto L_0x0034
        L_0x0033:
            r8 = r7
        L_0x0034:
            java.lang.String r9 = "_builder.build()"
            java.lang.String r10 = "getDefaultInstance()"
            java.lang.String r11 = "value"
            if (r8 == 0) goto L_0x0110
            boolean r12 = r8 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135274y     // Catch:{ all -> 0x01fc }
            if (r12 != 0) goto L_0x0042
            goto L_0x0110
        L_0x0042:
            com.google.android.apps.search.googleapp.discover.y.y r8 = (com.google.android.apps.search.googleapp.discover.p10248y.C135274y) r8     // Catch:{ all -> 0x01fc }
            java.lang.String r8 = r8.f368523a     // Catch:{ all -> 0x01fc }
            java.util.List r6 = r6.mo112171c()     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x006a
            h.l.k r6 = p5462h.p5463a.C69540x.m100847ac(r6)     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x006a
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.q r12 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134885q.f367189a     // Catch:{ all -> 0x01fc }
            h.l.k r6 = p5462h.p5482l.C69734n.m101140h(r6, r12)     // Catch:{ all -> 0x01fc }
            java.lang.String r12 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"
            p5462h.p5473f.p5475b.C69664n.m101059e(r6, r12)     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = p5462h.p5482l.C69734n.m101137e(r6)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.y.e r6 = (com.google.android.apps.search.googleapp.discover.p10248y.C135254e) r6     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = r6.f368467b     // Catch:{ all -> 0x01fc }
            goto L_0x006b
        L_0x006a:
            r6 = r7
        L_0x006b:
            if (r6 != 0) goto L_0x0074
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w.f367215e     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)     // Catch:{ all -> 0x01fc }
            goto L_0x0115
        L_0x0074:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r10 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w.f367215e     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.v r10 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134890v) r10     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r0)     // Catch:{ all -> 0x01fc }
            r10.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r0 = r10.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w) r0     // Catch:{ all -> 0x01fc }
            int r12 = r0.f367217a     // Catch:{ all -> 0x01fc }
            r12 = r12 | 1
            r0.f367217a = r12     // Catch:{ all -> 0x01fc }
            r0.f367218b = r6     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.y.ad r0 = r5.f367201j     // Catch:{ all -> 0x01fc }
            r5 = 0
            if (r0 == 0) goto L_0x00e2
            java.util.List r0 = r0.mo112171c()     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x00e2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x01fc }
            r5.<init>()     // Catch:{ all -> 0x01fc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01fc }
        L_0x00a5:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x01fc }
            if (r6 == 0) goto L_0x00b7
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x01fc }
            boolean r12 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135254e     // Catch:{ all -> 0x01fc }
            if (r12 == 0) goto L_0x00a5
            r5.add(r6)     // Catch:{ all -> 0x01fc }
            goto L_0x00a5
        L_0x00b7:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x01fc }
            r0.<init>()     // Catch:{ all -> 0x01fc }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01fc }
            r6.<init>()     // Catch:{ all -> 0x01fc }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01fc }
        L_0x00c5:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x01fc }
            if (r12 == 0) goto L_0x00de
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x01fc }
            r13 = r12
            com.google.android.apps.search.googleapp.discover.y.e r13 = (com.google.android.apps.search.googleapp.discover.p10248y.C135254e) r13     // Catch:{ all -> 0x01fc }
            java.lang.String r13 = r13.f368467b     // Catch:{ all -> 0x01fc }
            boolean r13 = r0.add(r13)     // Catch:{ all -> 0x01fc }
            if (r13 == 0) goto L_0x00c5
            r6.add(r12)     // Catch:{ all -> 0x01fc }
            goto L_0x00c5
        L_0x00de:
            int r5 = r6.size()     // Catch:{ all -> 0x01fc }
        L_0x00e2:
            r10.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r0 = r10.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w) r0     // Catch:{ all -> 0x01fc }
            int r6 = r0.f367217a     // Catch:{ all -> 0x01fc }
            r6 = r6 | 2
            r0.f367217a = r6     // Catch:{ all -> 0x01fc }
            r0.f367219c = r5     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r11)     // Catch:{ all -> 0x01fc }
            r10.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r0 = r10.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w) r0     // Catch:{ all -> 0x01fc }
            r8.getClass()     // Catch:{ all -> 0x01fc }
            int r5 = r0.f367217a     // Catch:{ all -> 0x01fc }
            r5 = r5 | 4
            r0.f367217a = r5     // Catch:{ all -> 0x01fc }
            r0.f367220d = r8     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r0 = r10.build()     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w) r0     // Catch:{ all -> 0x01fc }
            goto L_0x0115
        L_0x0110:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.w r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134891w.f367215e     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)     // Catch:{ all -> 0x01fc }
        L_0x0115:
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)     // Catch:{ all -> 0x01fc }
            r4.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y r5 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y) r5     // Catch:{ all -> 0x01fc }
            r0.getClass()     // Catch:{ all -> 0x01fc }
            r5.f367224b = r0     // Catch:{ all -> 0x01fc }
            int r0 = r5.f367223a     // Catch:{ all -> 0x01fc }
            r0 = r0 | 1
            r5.f367223a = r0     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.g r0 = r2.mo112061r()     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x0195
            java.lang.Integer r5 = r0.mo112050b()     // Catch:{ all -> 0x01fc }
            if (r5 == 0) goto L_0x0180
            int r5 = r5.intValue()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r6 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa.f367152d     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.z r6 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134894z) r6     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.ac r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.z r8 = r6.f367157a     // Catch:{ all -> 0x01fc }
            r8.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r8 = r8.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r8 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa) r8     // Catch:{ all -> 0x01fc }
            int r10 = r8.f367154a     // Catch:{ all -> 0x01fc }
            r10 = r10 | 1
            r8.f367154a = r10     // Catch:{ all -> 0x01fc }
            r8.f367155b = r5     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.DiscoverRecyclerView r0 = r0.f367234b     // Catch:{ all -> 0x01fc }
            android.support.v7.widget.fo r0 = r0.mLayout     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x017b
            android.view.View r0 = r0.findViewByPosition(r5)     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x017b
            int r0 = r0.getTop()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.z r5 = r6.f367157a     // Catch:{ all -> 0x01fc }
            r5.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r5 = r5.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r5 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa) r5     // Catch:{ all -> 0x01fc }
            int r8 = r5.f367154a     // Catch:{ all -> 0x01fc }
            r8 = r8 | 2
            r5.f367154a = r8     // Catch:{ all -> 0x01fc }
            r5.f367156c = r0     // Catch:{ all -> 0x01fc }
        L_0x017b:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r0 = r6.mo112039a()     // Catch:{ all -> 0x01fc }
            goto L_0x0193
        L_0x0180:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa.f367152d     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.z r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134894z) r0     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.ac r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r0 = r0.mo112039a()     // Catch:{ all -> 0x01fc }
        L_0x0193:
            if (r0 != 0) goto L_0x01a8
        L_0x0195:
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134867aa.f367152d     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.z r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134894z) r0     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.ac r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.aa r0 = r0.mo112039a()     // Catch:{ all -> 0x01fc }
        L_0x01a8:
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)     // Catch:{ all -> 0x01fc }
            r4.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y r1 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y) r1     // Catch:{ all -> 0x01fc }
            r0.getClass()     // Catch:{ all -> 0x01fc }
            r1.f367225c = r0     // Catch:{ all -> 0x01fc }
            int r0 = r1.f367223a     // Catch:{ all -> 0x01fc }
            r0 = r0 | 2
            r1.f367223a = r0     // Catch:{ all -> 0x01fc }
            j$.time.Instant r0 = r2.mo111948b()     // Catch:{ all -> 0x01fc }
            long r0 = r0.toEpochMilli()     // Catch:{ all -> 0x01fc }
            r4.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y r5 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y) r5     // Catch:{ all -> 0x01fc }
            int r6 = r5.f367223a     // Catch:{ all -> 0x01fc }
            r6 = r6 | 4
            r5.f367223a = r6     // Catch:{ all -> 0x01fc }
            r5.f367226d = r0     // Catch:{ all -> 0x01fc }
            com.google.bv.e.b.c.a.dp r0 = r2.f367293aj     // Catch:{ all -> 0x01fc }
            if (r0 == 0) goto L_0x01e7
            r4.copyOnWrite()     // Catch:{ all -> 0x01fc }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y r1 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y) r1     // Catch:{ all -> 0x01fc }
            r1.f367227e = r0     // Catch:{ all -> 0x01fc }
            int r0 = r1.f367223a     // Catch:{ all -> 0x01fc }
            r0 = r0 | 8
            r1.f367223a = r0     // Catch:{ all -> 0x01fc }
        L_0x01e7:
            com.google.protobuf.bv r0 = r4.build()     // Catch:{ all -> 0x01fc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x01fc }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.y r0 = (com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134893y) r0     // Catch:{ all -> 0x01fc }
            com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse r1 = new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse     // Catch:{ all -> 0x01fc }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x01fc }
            r15.putParcelable(r3, r1)     // Catch:{ all -> 0x01fc }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x01fc:
            r15 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0201 }
            goto L_0x0205
        L_0x0201:
            r0 = move-exception
            com.google.android.apps.search.googleapp.discover.streamui.impl.C134902k.m218748a(r15, r0)
        L_0x0205:
            goto L_0x0207
        L_0x0206:
            throw r15
        L_0x0207:
            goto L_0x0206
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134903l.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0074, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0078, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r8 = this;
            com.google.apps.tiktok.tracing.ab r0 = r8.f122869b
            r0.mo51381i()
            r8.mo51117r()     // Catch:{ all -> 0x0080 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = r8.mo17754z()     // Catch:{ all -> 0x0080 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.m$c r0 = r0.f367297an     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "DiscoverStreamFragmentPeer#maybeReissueLastRenderableStream"
            com.google.android.apps.search.googleapp.discover.streamui.impl.m r0 = com.google.android.apps.search.googleapp.discover.streamui.impl.C134904m.this     // Catch:{ all -> 0x0080 }
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r1)     // Catch:{ all -> 0x0080 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.t r0 = r0.f367323p     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "RecyclerViewContentManager#reloadThemeData"
            com.google.apps.tiktok.tracing.bi r2 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r2)     // Catch:{ all -> 0x0079 }
            com.google.android.apps.search.googleapp.discover.y.ad r3 = r0.f367201j     // Catch:{ all -> 0x0072 }
            boolean r4 = r3 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135215ac     // Catch:{ all -> 0x0072 }
            r5 = 0
            if (r4 != 0) goto L_0x0029
            p5462h.p5472e.C69598b.m101013a(r2, r5)     // Catch:{ all -> 0x0079 }
            goto L_0x006b
        L_0x0029:
            com.google.android.apps.search.googleapp.discover.y.ac r3 = (com.google.android.apps.search.googleapp.discover.p10248y.C135215ac) r3     // Catch:{ all -> 0x0072 }
            java.util.List r3 = r3.f368319g     // Catch:{ all -> 0x0072 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0072 }
        L_0x0031:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0072 }
            com.google.bv.e.b.b.b.ab r4 = (com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57118ab) r4     // Catch:{ all -> 0x0072 }
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.h r6 = r0.f367198g     // Catch:{ all -> 0x0072 }
            com.google.bv.j.b.a.p r4 = r4.f152472a     // Catch:{ all -> 0x0072 }
            if (r4 != 0) goto L_0x0045
            com.google.bv.j.b.a.p r4 = com.google.p4283bv.p4380j.p4385b.p4386a.C57784p.f154382f     // Catch:{ all -> 0x0072 }
        L_0x0045:
            java.lang.String r7 = "ElementsInitializer#reloadThemeData"
            com.google.apps.tiktok.tracing.bi r7 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r7)     // Catch:{ all -> 0x0072 }
            com.google.android.libraries.search.rendering.xuikit.d.a.b r6 = r6.f367179a     // Catch:{ all -> 0x005e }
            com.google.android.libraries.search.rendering.xuikit.a.d r6 = r6.mo32550i()     // Catch:{ all -> 0x005e }
            com.google.bv.j.b.a.h r4 = r4.f154387d     // Catch:{ all -> 0x005e }
            if (r4 != 0) goto L_0x0057
            com.google.bv.j.b.a.h r4 = com.google.p4283bv.p4380j.p4385b.p4386a.C57776h.f154365b     // Catch:{ all -> 0x005e }
        L_0x0057:
            r6.mo42164a(r4)     // Catch:{ all -> 0x005e }
            r7.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0031
        L_0x005e:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r3 = move-exception
            com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.C134875g.m218717a(r0, r3)     // Catch:{ all -> 0x0072 }
        L_0x0067:
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0068:
            p5462h.p5472e.C69598b.m101013a(r2, r5)     // Catch:{ all -> 0x0079 }
        L_0x006b:
            p5462h.p5472e.C69598b.m101013a(r1, r5)     // Catch:{ all -> 0x0080 }
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return
        L_0x0072:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r3 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r0)     // Catch:{ all -> 0x0079 }
            throw r3     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r0)     // Catch:{ all -> 0x0080 }
            throw r2     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r0 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            com.google.android.apps.search.googleapp.discover.streamui.impl.C134902k.m218748a(r0, r1)
        L_0x0089:
            goto L_0x008b
        L_0x008a:
            throw r0
        L_0x008b:
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.streamui.impl.C134903l.onStart():void");
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            mo17754z();
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134902k.m218748a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47389c.m84226a(getContext()).f123128b = view;
            C134904m a = mo17754z();
            C47393f.m84233d(this, C134707e.class, new C134814ah(a));
            C47393f.m84233d(this, C134709g.class, new C134815ai(a));
            C47393f.m84233d(this, C134703a.class, new C134816aj(a));
            C47393f.m84233d(this, C134706d.class, new C134817ak(a));
            C47393f.m84233d(this, C134705c.class, new C134818al(a));
            C47393f.m84233d(this, C134711i.class, new C134819am(a));
            C47393f.m84233d(this, C134712j.class, new C134820an(a));
            C47393f.m84233d(this, C134840g.class, new C134821ao(a));
            C47393f.m84233d(this, C134710h.class, new C134822ap(a));
            C47393f.m84233d(this, C134713k.class, new C134811ae(a));
            C47393f.m84233d(this, C136811b.class, new C134812af(a));
            C47393f.m84233d(this, C134704b.class, new C134813ag());
            this.f54442o.mo24720k(bundle);
            C134904m a2 = mo17754z();
            C69664n.m101061g(view, "view");
            C134898g r = a2.mo112061r();
            if (r == null) {
                C59052c cVar = (C59052c) C134904m.f367250a.mo56226d();
                cVar.mo56379ah(new C59094n(40511));
                cVar.mo56386p("setUpRecyclerView() called when RecyclerView peer isn't present.");
            } else {
                a2.f367261J.mo112056a(a2.f367257F);
                C134468f fVar = a2.f367255D;
                DiscoverRecyclerView discoverRecyclerView = r.f367234b;
                C57528m a3 = C57528m.m88369a(a2.f367310c.f366909b);
                if (a3 == null) {
                    a3 = C57528m.UNKNOWN_SURFACE;
                }
                C69664n.m101060f(a3, "discoverStreamFragmentArgs.surface");
                fVar.mo111507r(discoverRecyclerView, a3);
                a2.f367290ag = new C134912q(a2);
                r.f367234b.addOnLayoutChangeListener(a2.f367290ag);
                boolean z = a2.f367310c.f366913f;
                C0658ft ftVar = a2.f367285ab;
                C69664n.m101060f(ftVar, "onScrollListener");
                C69664n.m101061g(ftVar, "onScrollListener");
                DiscoverRecyclerView discoverRecyclerView2 = r.f367234b;
                if (r.f367235c) {
                    int dimensionPixelSize = discoverRecyclerView2.getResources().getDimensionPixelSize(R.dimen.googleapp_discover_stream_two_column_side_margin);
                    discoverRecyclerView2.setPadding(dimensionPixelSize, discoverRecyclerView2.getPaddingTop(), dimensionPixelSize, discoverRecyclerView2.getPaddingBottom());
                }
                C0661fw fwVar = discoverRecyclerView2.mRecycler;
                fwVar.f2435e = 0;
                fwVar.mo3038o();
                discoverRecyclerView2.setItemAnimator(r.f367236d);
                r.f367241i = Duration.ofMillis(r.f367236d.f2411k);
                r.f367242j = Duration.ofMillis(r.f367236d.f2410j);
                C69788q qVar = null;
                r.f367237e.mo37098h(r.f367234b, C31164au.m58092b("DiscoverStreamFragmentPeer"), (C71207aq) null);
                if (z) {
                    discoverRecyclerView2.setOverScrollMode(1);
                    discoverRecyclerView2.setWillNotDraw(false);
                }
                discoverRecyclerView2.addOnScrollListener(ftVar);
                SwipeRefreshView s = a2.mo112062s();
                if (s != null) {
                    C2043bi.m5555ai(s, new C134920y(a2));
                    qVar = C69788q.f186170a;
                }
                if (qVar == null) {
                    C59052c cVar2 = (C59052c) C134904m.f367250a.mo56226d();
                    cVar2.mo56379ah(new C59094n(40510));
                    cVar2.mo56386p("Could not set windows inset listener");
                }
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C134902k.m218748a(th, th);
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
            if (!this.f367249e) {
                super.onAttach(context);
                if (this.f367247c == null) {
                    this.f367247c = ((C134823aq) mo112027d().mo17653jN()).mo112012bS();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f367246a));
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
                C134902k.m218748a(th, th2);
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
