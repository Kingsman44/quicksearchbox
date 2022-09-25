package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139345a;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139346b;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139352h;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139354j;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139355k;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139358n;
import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139360p;
import com.google.android.apps.search.googleapp.stampviewer.p10493e.C139382a;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3657c.p3658a.C47222f;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3659d.C47244m;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import dagger.hilt.p5299a.C68288b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.h */
/* compiled from: PG */
public final class C139618h extends C139518ae implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139638n f379528a;

    /* renamed from: c */
    private Context f379529c;

    /* renamed from: d */
    private final C2393x f379530d = new C2393x(this);

    /* renamed from: e */
    private boolean f379531e;

    @Deprecated
    public C139618h() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public static C139618h m226960a(AccountId accountId, C139392b bVar) {
        C139618h hVar = new C139618h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        C47243l.m84039a(hVar, bVar);
        return hVar;
    }

    /* renamed from: b */
    public final C139638n mo17754z() {
        C139638n nVar = this.f379528a;
        if (nVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f379531e) {
            return nVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ C47222f mo115024d() {
        return C47244m.m84043e(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f379529c == null) {
            this.f379529c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f379529c;
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
        return this.f379530d;
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
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onCreate(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            mo51111l(bundle);
            C139638n b = mo17754z();
            b.f379586j.mo46748c(R.id.googleapp_stamp_viewer_external_links, new C139634j(b), new C139635k(b));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x021f A[Catch:{ ct -> 0x003e, all -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0253 A[Catch:{ ct -> 0x003e, all -> 0x0264 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x025c A[SYNTHETIC, Splitter:B:98:0x025c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            java.lang.String r0 = "WEB_FRAGMENT_CONTAINER"
            java.lang.String r1 = "ampWebViewFragmentPeerState"
            com.google.apps.tiktok.tracing.ab r2 = r9.f122869b
            r2.mo51381i()
            r9.mo51119t(r10, r11, r12)     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.n r2 = r9.mo17754z()     // Catch:{ all -> 0x0264 }
            if (r12 == 0) goto L_0x004d
            boolean r3 = r12.containsKey(r1)     // Catch:{ all -> 0x0264 }
            if (r3 != 0) goto L_0x0019
            goto L_0x004d
        L_0x0019:
            com.google.android.apps.search.googleapp.stampviewer.webview.p r3 = com.google.android.apps.search.googleapp.stampviewer.webview.C139640p.f379603f     // Catch:{ ct -> 0x003e }
            com.google.protobuf.ba r4 = r2.f379587k     // Catch:{ ct -> 0x003e }
            com.google.protobuf.MessageLite r12 = com.google.protobuf.contrib.android.ProtoParsers.m95520c(r12, r1, r3, r4)     // Catch:{ ct -> 0x003e }
            com.google.android.apps.search.googleapp.stampviewer.webview.p r12 = (com.google.android.apps.search.googleapp.stampviewer.webview.C139640p) r12     // Catch:{ ct -> 0x003e }
            if (r12 == 0) goto L_0x004d
            boolean r1 = r12.f379606b     // Catch:{ all -> 0x0264 }
            r2.f379594r = r1     // Catch:{ all -> 0x0264 }
            boolean r1 = r12.f379607c     // Catch:{ all -> 0x0264 }
            r2.f379595s = r1     // Catch:{ all -> 0x0264 }
            int r1 = r12.f379609e     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.b.y r1 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.m226483a(r1)     // Catch:{ all -> 0x0264 }
            if (r1 != 0) goto L_0x0037
            com.google.android.apps.search.googleapp.stampviewer.b.y r1 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.VIEWER_MODE_UNSPECIFIED     // Catch:{ all -> 0x0264 }
        L_0x0037:
            r2.f379596t = r1     // Catch:{ all -> 0x0264 }
            boolean r12 = r12.f379608d     // Catch:{ all -> 0x0264 }
            r2.f379600x = r12     // Catch:{ all -> 0x0264 }
            goto L_0x004d
        L_0x003e:
            r12 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.googleapp.stampviewer.webview.C139638n.f379570a     // Catch:{ all -> 0x0264 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0264 }
            java.lang.String r3 = "Invalid proto in saved instance state for AmpWebViewFragmentPeerState"
            r4 = 41380(0xa1a4, float:5.7986E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r12)).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x0264 }
        L_0x004d:
            android.view.ContextThemeWrapper r12 = new android.view.ContextThemeWrapper     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.h r1 = r2.f379580d     // Catch:{ all -> 0x0264 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0264 }
            r3 = 2132150085(0x7f160745, float:1.9942194E38)
            r12.<init>(r1, r3)     // Catch:{ all -> 0x0264 }
            android.view.LayoutInflater r10 = r10.cloneInContext(r12)     // Catch:{ all -> 0x0264 }
            r12 = 2131625199(0x7f0e04ef, float:1.88776E38)
            r1 = 0
            android.view.View r10 = r10.inflate(r12, r11, r1)     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.search.logging.g.u r11 = com.google.android.libraries.search.logging.p3046g.C39215u.f103167f     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.search.logging.g.t r11 = (com.google.android.libraries.search.logging.p3046g.C39214t) r11     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.f.b r12 = r2.f379579c     // Catch:{ all -> 0x0264 }
            com.google.bv.b.a.a.a.b r12 = r12.f379032b     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x0077
            com.google.bv.b.a.a.a.b r12 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b.f151140k     // Catch:{ all -> 0x0264 }
        L_0x0077:
            java.lang.String r12 = r12.f151143b     // Catch:{ all -> 0x0264 }
            r11.copyOnWrite()     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bv r1 = r11.instance     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.search.logging.g.u r1 = (com.google.android.libraries.search.logging.p3046g.C39215u) r1     // Catch:{ all -> 0x0264 }
            r12.getClass()     // Catch:{ all -> 0x0264 }
            int r3 = r1.f103169a     // Catch:{ all -> 0x0264 }
            r4 = 1
            r3 = r3 | r4
            r1.f103169a = r3     // Catch:{ all -> 0x0264 }
            r1.f103170b = r12     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.f.b r12 = r2.f379579c     // Catch:{ all -> 0x0264 }
            int r12 = r12.f379037g     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.b.y r12 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.m226483a(r12)     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x0097
            com.google.android.apps.search.googleapp.stampviewer.b.y r12 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.VIEWER_MODE_UNSPECIFIED     // Catch:{ all -> 0x0264 }
        L_0x0097:
            com.google.android.apps.search.googleapp.stampviewer.b.y r1 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.VIEWER_MODE_INLINE     // Catch:{ all -> 0x0264 }
            boolean r12 = r12.equals(r1)     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x00c2
            r12 = 2131432001(0x7f0b1241, float:1.8485747E38)
            android.view.View r12 = r10.findViewById(r12)     // Catch:{ all -> 0x0264 }
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12     // Catch:{ all -> 0x0264 }
            if (r12 == 0) goto L_0x00c2
            com.google.android.apps.search.googleapp.stampviewer.webview.h r1 = r2.f379580d     // Catch:{ all -> 0x0264 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ all -> 0x0264 }
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch:{ all -> 0x0264 }
            float r1 = r1.density     // Catch:{ all -> 0x0264 }
            r3 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r3
            int r1 = (int) r1     // Catch:{ all -> 0x0264 }
            float r1 = (float) r1     // Catch:{ all -> 0x0264 }
            r12.mo4475e(r1)     // Catch:{ all -> 0x0264 }
        L_0x00c2:
            com.google.android.apps.search.googleapp.stampviewer.f.b r12 = r2.f379579c     // Catch:{ all -> 0x0264 }
            int r1 = r12.f379031a     // Catch:{ all -> 0x0264 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00e2
            com.google.protos.ai.b.j r12 = r12.f379034d     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x00d0
            com.google.protos.ai.b.j r12 = com.google.protos.p4816ai.p4818b.C63204j.f170749e     // Catch:{ all -> 0x0264 }
        L_0x00d0:
            r11.copyOnWrite()     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bv r1 = r11.instance     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.search.logging.g.u r1 = (com.google.android.libraries.search.logging.p3046g.C39215u) r1     // Catch:{ all -> 0x0264 }
            r12.getClass()     // Catch:{ all -> 0x0264 }
            r1.f103173e = r12     // Catch:{ all -> 0x0264 }
            int r12 = r1.f103169a     // Catch:{ all -> 0x0264 }
            r12 = r12 | 4
            r1.f103169a = r12     // Catch:{ all -> 0x0264 }
        L_0x00e2:
            com.google.android.libraries.logging.ve.ab r12 = r2.f379585i     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.af r1 = r12.f76990a     // Catch:{ all -> 0x0264 }
            r3 = 92502(0x16956, float:1.29623E-40)
            com.google.android.libraries.logging.ve.h r3 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r3)     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.c r1 = r1.mo33805a(r3)     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bt r3 = com.google.android.libraries.search.logging.p3046g.C39216v.f103175a     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bv r5 = r11.build()     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.search.logging.g.u r5 = (com.google.android.libraries.search.logging.p3046g.C39215u) r5     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.e r6 = new com.google.android.libraries.logging.ve.e     // Catch:{ all -> 0x0264 }
            r6.<init>(r3, r5)     // Catch:{ all -> 0x0264 }
            r1.mo33858f(r6)     // Catch:{ all -> 0x0264 }
            r12.mo33801b(r10, r1)     // Catch:{ all -> 0x0264 }
            r12 = 2131431955(0x7f0b1213, float:1.8485654E38)
            android.view.View r12 = r10.findViewById(r12)     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.ab r1 = r2.f379585i     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.af r3 = r1.f76990a     // Catch:{ all -> 0x0264 }
            r5 = 145144(0x236f8, float:2.0339E-40)
            com.google.android.libraries.logging.ve.h r5 = com.google.android.libraries.logging.p2185ve.C28427h.m53115a(r5)     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.c r3 = r3.mo33805a(r5)     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bt r5 = com.google.android.libraries.search.logging.p3046g.C39216v.f103175a     // Catch:{ all -> 0x0264 }
            com.google.protobuf.bv r11 = r11.build()     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.search.logging.g.u r11 = (com.google.android.libraries.search.logging.p3046g.C39215u) r11     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.logging.ve.e r6 = new com.google.android.libraries.logging.ve.e     // Catch:{ all -> 0x0264 }
            r6.<init>(r5, r11)     // Catch:{ all -> 0x0264 }
            r3.mo33858f(r6)     // Catch:{ all -> 0x0264 }
            r1.mo33801b(r12, r3)     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.h r11 = r2.f379580d     // Catch:{ all -> 0x0264 }
            android.support.v4.app.FragmentManager r11 = r11.getChildFragmentManager()     // Catch:{ all -> 0x0264 }
            android.support.v4.app.cc r11 = r11.f634a     // Catch:{ all -> 0x0264 }
            android.support.v4.app.Fragment r11 = r11.mo671c(r0)     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.web.k.g r11 = (com.google.android.libraries.web.p3420k.C43861g) r11     // Catch:{ all -> 0x0264 }
            if (r11 != 0) goto L_0x0166
            com.google.apps.tiktok.account.AccountId r11 = r2.f379578b     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.web.k.g r11 = com.google.android.libraries.web.p3420k.C43864j.m77436b(r11)     // Catch:{ all -> 0x0264 }
            android.view.accessibility.AccessibilityManager r12 = r2.f379589m     // Catch:{ all -> 0x0264 }
            boolean r12 = r12.isTouchExplorationEnabled()     // Catch:{ all -> 0x0264 }
            if (r12 == 0) goto L_0x014f
            boolean r12 = r2.f379594r     // Catch:{ all -> 0x0264 }
            if (r12 == 0) goto L_0x0152
        L_0x014f:
            r2.mo115121d()     // Catch:{ all -> 0x0264 }
        L_0x0152:
            com.google.android.apps.search.googleapp.stampviewer.webview.h r12 = r2.f379580d     // Catch:{ all -> 0x0264 }
            android.support.v4.app.FragmentManager r12 = r12.getChildFragmentManager()     // Catch:{ all -> 0x0264 }
            android.support.v4.app.a r1 = new android.support.v4.app.a     // Catch:{ all -> 0x0264 }
            r1.<init>((android.support.p031v4.app.FragmentManager) r12)     // Catch:{ all -> 0x0264 }
            r12 = 2131432000(0x7f0b1240, float:1.8485745E38)
            r1.mo511h(r12, r11, r0, r4)     // Catch:{ all -> 0x0264 }
            r1.mo509f()     // Catch:{ all -> 0x0264 }
        L_0x0166:
            com.google.android.apps.search.googleapp.stampviewer.webview.h r11 = r2.f379580d     // Catch:{ all -> 0x0264 }
            android.support.v4.app.Fragment r11 = com.google.android.apps.search.googleapp.stampviewer.preview.C139468l.m226674a(r11)     // Catch:{ all -> 0x0264 }
            if (r11 != 0) goto L_0x019b
            com.google.android.apps.search.googleapp.stampviewer.webview.h r11 = r2.f379580d     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.f.b r12 = r2.f379579c     // Catch:{ all -> 0x0264 }
            com.google.bv.b.a.a.a.b r12 = r12.f379032b     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x0178
            com.google.bv.b.a.a.a.b r12 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b.f151140k     // Catch:{ all -> 0x0264 }
        L_0x0178:
            com.google.bv.b.a.a.a.n r12 = r12.f151150i     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x017e
            com.google.bv.b.a.a.a.n r12 = com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n.f151177e     // Catch:{ all -> 0x0264 }
        L_0x017e:
            com.google.bp.e.a.j r12 = r12.f151182d     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x0184
            com.google.bp.e.a.j r12 = com.google.p4242bp.p4253e.p4254a.C56190j.f149710d     // Catch:{ all -> 0x0264 }
        L_0x0184:
            int r12 = r12.f149713b     // Catch:{ all -> 0x0264 }
            java.lang.String r12 = com.google.android.apps.search.googleapp.stampviewer.preview.C139468l.m226675b(r12)     // Catch:{ all -> 0x0264 }
        L_0x018a:
            if (r11 == 0) goto L_0x019b
            java.lang.String r0 = r11.getTag()     // Catch:{ all -> 0x0264 }
            boolean r0 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r12)     // Catch:{ all -> 0x0264 }
            if (r0 != 0) goto L_0x019b
            android.support.v4.app.Fragment r11 = r11.getParentFragment()     // Catch:{ all -> 0x0264 }
            goto L_0x018a
        L_0x019b:
            if (r11 == 0) goto L_0x01ac
            androidx.lifecycle.bp r12 = new androidx.lifecycle.bp     // Catch:{ all -> 0x0264 }
            r12.<init>(r11)     // Catch:{ all -> 0x0264 }
            java.lang.Class<com.google.android.apps.search.googleapp.stampviewer.preview.z> r11 = com.google.android.apps.search.googleapp.stampviewer.preview.C139483z.class
            androidx.lifecycle.bf r11 = r12.mo5770a(r11)     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.preview.z r11 = (com.google.android.apps.search.googleapp.stampviewer.preview.C139483z) r11     // Catch:{ all -> 0x0264 }
            r2.f379597u = r11     // Catch:{ all -> 0x0264 }
        L_0x01ac:
            com.google.android.apps.search.googleapp.stampviewer.preview.z r11 = r2.f379597u     // Catch:{ all -> 0x0264 }
            if (r11 == 0) goto L_0x01cc
            io.b.k.f r11 = r11.f379265d     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.l r12 = new com.google.android.apps.search.googleapp.stampviewer.webview.l     // Catch:{ all -> 0x0264 }
            r12.<init>(r2)     // Catch:{ all -> 0x0264 }
            io.b.b.b r11 = r11.mo61654n(r12)     // Catch:{ all -> 0x0264 }
            r2.f379598v = r11     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.preview.z r11 = r2.f379597u     // Catch:{ all -> 0x0264 }
            io.b.k.f r11 = r11.f379266e     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.m r12 = new com.google.android.apps.search.googleapp.stampviewer.webview.m     // Catch:{ all -> 0x0264 }
            r12.<init>(r2)     // Catch:{ all -> 0x0264 }
            io.b.b.b r11 = r11.mo61654n(r12)     // Catch:{ all -> 0x0264 }
            r2.f379599w = r11     // Catch:{ all -> 0x0264 }
        L_0x01cc:
            com.google.android.apps.search.googleapp.stampviewer.f.b r11 = r2.f379579c     // Catch:{ all -> 0x0264 }
            int r11 = r11.f379037g     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.b.y r12 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.m226483a(r11)     // Catch:{ all -> 0x0264 }
            if (r12 != 0) goto L_0x01d8
            com.google.android.apps.search.googleapp.stampviewer.b.y r12 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.VIEWER_MODE_UNSPECIFIED     // Catch:{ all -> 0x0264 }
        L_0x01d8:
            com.google.android.apps.search.googleapp.stampviewer.b.y r0 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.VIEWER_MODE_UNSPECIFIED     // Catch:{ all -> 0x0264 }
            if (r12 == r0) goto L_0x020c
            com.google.android.apps.search.googleapp.stampviewer.b.y r11 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.m226483a(r11)     // Catch:{ all -> 0x0264 }
            if (r11 != 0) goto L_0x01e3
            goto L_0x01e4
        L_0x01e3:
            r0 = r11
        L_0x01e4:
            com.google.android.apps.search.googleapp.stampviewer.b.y r11 = com.google.android.apps.search.googleapp.stampviewer.p10488b.C139343y.VIEWER_MODE_FULLSCREEN     // Catch:{ all -> 0x0264 }
            if (r0 == r11) goto L_0x020c
            com.google.android.apps.search.googleapp.stampviewer.preview.z r12 = r2.f379597u     // Catch:{ all -> 0x0264 }
            if (r12 == 0) goto L_0x01f1
            com.google.android.apps.search.googleapp.stampviewer.b.y r12 = r12.f379264c     // Catch:{ all -> 0x0264 }
            if (r12 != r11) goto L_0x01f1
            goto L_0x020c
        L_0x01f1:
            r11 = 2131431972(0x7f0b1224, float:1.8485688E38)
            android.view.View r11 = r10.findViewById(r11)     // Catch:{ all -> 0x0264 }
            r12 = 8
            if (r11 == 0) goto L_0x01ff
            r11.setVisibility(r12)     // Catch:{ all -> 0x0264 }
        L_0x01ff:
            r11 = 2131431954(0x7f0b1212, float:1.8485652E38)
            android.view.View r11 = r10.findViewById(r11)     // Catch:{ all -> 0x0264 }
            if (r11 == 0) goto L_0x020f
            r11.setVisibility(r12)     // Catch:{ all -> 0x0264 }
            goto L_0x020f
        L_0x020c:
            r2.mo115118a()     // Catch:{ all -> 0x0264 }
        L_0x020f:
            com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.d r11 = r2.f379582f     // Catch:{ all -> 0x0264 }
            com.google.android.libraries.web.postmessage.c r12 = r2.f379581e     // Catch:{ all -> 0x0264 }
            java.util.Set r11 = r11.f379632b     // Catch:{ all -> 0x0264 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0264 }
        L_0x0219:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x024f
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.a r0 = (com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a.C139642a) r0     // Catch:{ all -> 0x0264 }
            int r4 = r0.mo115138a()     // Catch:{ all -> 0x0264 }
            java.lang.String r1 = r0.mo115139b()     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.b r5 = new com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.b     // Catch:{ all -> 0x0264 }
            r5.<init>(r1)     // Catch:{ all -> 0x0264 }
            com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.c r6 = new com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.c     // Catch:{ all -> 0x0264 }
            r6.<init>(r0)     // Catch:{ all -> 0x0264 }
            boolean r0 = r0.mo115141d()     // Catch:{ all -> 0x0264 }
            if (r0 == 0) goto L_0x0246
            r3 = r12
            com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl r3 = (com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl) r3     // Catch:{ all -> 0x0264 }
            r7 = 1
            r8 = 0
            r3.mo46952c(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0264 }
            goto L_0x0219
        L_0x0246:
            r3 = r12
            com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl r3 = (com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl) r3     // Catch:{ all -> 0x0264 }
            r7 = 0
            r8 = 0
            r3.mo46952c(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0264 }
            goto L_0x0219
        L_0x024f:
            boolean r11 = r2.f379594r     // Catch:{ all -> 0x0264 }
            if (r11 == 0) goto L_0x0256
            r2.mo115123f()     // Catch:{ all -> 0x0264 }
        L_0x0256:
            if (r10 == 0) goto L_0x025c
            com.google.apps.tiktok.tracing.C47831fm.m85019n()
            return r10
        L_0x025c:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x0264 }
            java.lang.String r11 = "Fragment cannot use Event annotations with null view!"
            r10.<init>(r11)     // Catch:{ all -> 0x0264 }
            throw r10     // Catch:{ all -> 0x0264 }
        L_0x0264:
            r10 = move-exception
            com.google.apps.tiktok.tracing.C47831fm.m85019n()     // Catch:{ all -> 0x0269 }
            goto L_0x026d
        L_0x0269:
            r11 = move-exception
            com.google.android.apps.search.googleapp.stampviewer.webview.C139608g.m226936a(r10, r11)
        L_0x026d:
            goto L_0x026f
        L_0x026e:
            throw r10
        L_0x026f:
            goto L_0x026e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.stampviewer.webview.C139618h.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        C47573bx c = this.f122869b.mo51375c();
        try {
            mo51113n();
            C139638n b = mo17754z();
            C69803b bVar = b.f379598v;
            if (bVar != null) {
                C69828d.m101309f((AtomicReference) bVar);
                b.f379598v = null;
            }
            C69803b bVar2 = b.f379599w;
            if (bVar2 != null) {
                C69828d.m101309f((AtomicReference) bVar2);
                b.f379599w = null;
            }
            c.close();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f379531e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
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
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onPause() {
        this.f122869b.mo51381i();
        try {
            mo51115p();
            C69803b bVar = mo17754z().f379601y;
            if (bVar != null) {
                C69828d.m101309f((AtomicReference) bVar);
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onResume() {
        C47573bx e = this.f122869b.mo51377e();
        try {
            mo51116q();
            C139638n b = mo17754z();
            if (b.f379594r) {
                b.mo115124g("visible");
            }
            b.f379601y = b.f379588l.f379334b.mo61654n(new C139627i(b));
            e.close();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            this.f54442o.mo24721A(bundle);
            C139638n b = mo17754z();
            C139639o oVar = (C139639o) C139640p.f379603f.createBuilder();
            boolean z = b.f379594r;
            oVar.copyOnWrite();
            C139640p pVar = (C139640p) oVar.instance;
            pVar.f379605a |= 1;
            pVar.f379606b = z;
            boolean z2 = b.f379595s;
            oVar.copyOnWrite();
            C139640p pVar2 = (C139640p) oVar.instance;
            pVar2.f379605a |= 2;
            pVar2.f379607c = z2;
            C139343y yVar = b.f379596t;
            oVar.copyOnWrite();
            C139640p pVar3 = (C139640p) oVar.instance;
            pVar3.f379609e = yVar.f378967d;
            pVar3.f379605a |= 8;
            boolean z3 = b.f379600x;
            oVar.copyOnWrite();
            C139640p pVar4 = (C139640p) oVar.instance;
            pVar4.f379605a |= 4;
            pVar4.f379608d = z3;
            bundle.putParcelable("ampWebViewFragmentPeerState", new ProtoParsers.InternalDontUse((byte[]) null, (C139640p) oVar.build()));
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onStop() {
        this.f122869b.mo51381i();
        try {
            mo51118s();
            C139638n b = mo17754z();
            b.mo115127j(C37182a.f97930dC.mo40806d());
            if (b.f379590n.f156708a) {
                C139382a aVar = b.f379591o;
                C56610b bVar = b.f379579c.f379032b;
                if (bVar == null) {
                    bVar = C56610b.f151140k;
                }
                aVar.mo114939a(bVar.f151143b, Duration.ofNanos(b.f379590n.mo56159b()));
                b.f379590n.mo56162g();
            }
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C139638n b = mo17754z();
            C47393f.m84233d(this, C139355k.class, new C139659q(b));
            C47393f.m84233d(this, C139345a.class, new C139660r(b));
            C47393f.m84233d(this, C139346b.class, new C139661s(b));
            C47393f.m84233d(this, C139354j.class, new C139662t(b));
            C47393f.m84233d(this, C139358n.class, new C139663u());
            C47393f.m84233d(this, C139360p.class, new C139664v(b));
            C47393f.m84233d(this, C139352h.class, new C139665w(b));
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_stamp_viewer_bottom_bar_story_info), new C139666x(b));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139608g.m226936a(th, th);
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
            if (!this.f379531e) {
                super.onAttach(context);
                if (this.f379528a == null) {
                    this.f379528a = ((C139667y) mo115025f().mo17653jN()).mo115156dN();
                    super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f379530d));
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
                C139608g.m226936a(th, th2);
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
