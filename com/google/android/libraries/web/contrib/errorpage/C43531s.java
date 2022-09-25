package com.google.android.libraries.web.contrib.errorpage;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.contrib.errorpage.p3373a.p3374a.C43511c;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.p3420k.C43861g;
import com.google.android.libraries.web.shared.lifecycle.WebModelProvider;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.web.contrib.errorpage.s */
/* compiled from: PG */
public final class C43531s {

    /* renamed from: a */
    public static final C59071e f113661a = C59071e.m91332i("com.google.android.libraries.web.contrib.errorpage.s");

    /* renamed from: b */
    public final Fragment f113662b;

    /* renamed from: c */
    public final C46801dp f113663c;

    /* renamed from: d */
    public final C43269t f113664d;

    /* renamed from: e */
    public final C43377v f113665e;

    /* renamed from: f */
    public final C43511c f113666f;

    /* renamed from: g */
    public C43532a f113667g;

    /* renamed from: com.google.android.libraries.web.contrib.errorpage.s$a */
    /* compiled from: PG */
    public final class C43532a implements C46792di {

        /* renamed from: a */
        private final Fragment f113668a;

        /* renamed from: b */
        private final C43269t f113669b;

        /* renamed from: c */
        private final C43377v f113670c;

        /* renamed from: d */
        private final C43511c f113671d;

        /* renamed from: e */
        private final Predicate f113672e;

        /* renamed from: f */
        private final C43516d f113673f;

        /* renamed from: g */
        private final C43525m f113674g;

        /* renamed from: h */
        private final View f113675h;

        /* renamed from: i */
        private boolean f113676i;

        /* renamed from: j */
        private C43363h f113677j;

        /* renamed from: k */
        private C43514b f113678k;

        /* renamed from: l */
        private C43512b f113679l;

        /* renamed from: m */
        private int f113680m;

        public C43532a(Fragment fragment, C43269t tVar, C43377v vVar, C43511c cVar, Predicate predicate, C43516d dVar, C43525m mVar, View view) {
            this.f113668a = fragment;
            this.f113669b = tVar;
            this.f113670c = vVar;
            this.f113671d = cVar;
            this.f113672e = predicate;
            this.f113673f = dVar;
            this.f113674g = mVar;
            this.f113675h = view;
        }

        /* renamed from: e */
        private final void m76808e() {
            this.f113676i = false;
            this.f113671d.mo46580c(false);
            this.f113675h.setVisibility(8);
            m76810g(0);
            C43516d dVar = this.f113673f;
            if (dVar != null) {
                dVar.mo46581a();
            }
        }

        /* renamed from: f */
        private final void m76809f(C43376u uVar, C43512b bVar) {
            this.f113676i = true;
            this.f113671d.mo46580c(true);
            this.f113675h.setVisibility(0);
            m76810g(8);
            C43516d dVar = this.f113673f;
            if (dVar != null) {
                dVar.mo46582b(uVar, Optional.ofNullable(bVar));
            }
        }

        /* renamed from: g */
        private final void m76810g(int i) {
            if (!this.f113669b.mo46385c().equals(C43271v.WEB_LAYER)) {
                Fragment parentFragment = this.f113668a.getParentFragment();
                parentFragment.getClass();
                parentFragment.requireView().findViewById(R.id.webx_web_viewport_root).setVisibility(i);
            }
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C43531s.f113661a.mo56226d()).mo56382g(th)).mo56372aa(54085)).mo56386p("Failed to fetch WebState for errors.");
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ void mo18078b(java.lang.Object r6) {
            /*
                r5 = this;
                com.google.android.libraries.web.c.u r6 = (com.google.android.libraries.web.p3353c.C43376u) r6
                int r0 = r6.f113328a
                r0 = r0 & 64
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x001b
                com.google.android.libraries.web.contrib.errorpage.m r0 = r5.f113674g
                j$.util.function.Predicate r0 = r0.f113646b
                com.google.android.libraries.web.c.l r3 = r6.f113335h
                if (r3 != 0) goto L_0x0014
                com.google.android.libraries.web.c.l r3 = com.google.android.libraries.web.p3353c.C43367l.f113293h
            L_0x0014:
                boolean r0 = r0.test(r3)
                if (r0 == 0) goto L_0x001b
                r2 = 1
            L_0x001b:
                int r0 = r6.f113337j
                com.google.android.libraries.web.c.s r0 = com.google.android.libraries.web.p3353c.C43374s.m76523a(r0)
                if (r0 != 0) goto L_0x0025
                com.google.android.libraries.web.c.s r0 = com.google.android.libraries.web.p3353c.C43374s.RENDER_UNSUPPORTED
            L_0x0025:
                com.google.android.libraries.web.c.s r3 = com.google.android.libraries.web.p3353c.C43374s.RENDER_DEAD_IN_FOREGROUND
                boolean r0 = r0.equals(r3)
                r3 = 0
                if (r0 != 0) goto L_0x0043
                int r0 = r6.f113330c
                com.google.android.libraries.web.c.n r0 = com.google.android.libraries.web.p3353c.C43369n.m76519a(r0)
                if (r0 != 0) goto L_0x0038
                com.google.android.libraries.web.c.n r0 = com.google.android.libraries.web.p3353c.C43369n.UNSPECIFIED
            L_0x0038:
                com.google.android.libraries.web.c.n r4 = com.google.android.libraries.web.p3353c.C43369n.FAILED
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r1 = r2
                goto L_0x0090
            L_0x0043:
                if (r2 != 0) goto L_0x0090
                int r0 = r5.f113680m
                com.google.android.libraries.web.contrib.errorpage.m r1 = r5.f113674g
                int r1 = r1.mo46584e()
                if (r0 != r1) goto L_0x005b
                com.google.android.libraries.web.contrib.errorpage.b r0 = com.google.android.libraries.web.contrib.errorpage.C43514b.m76781b(r6)
                com.google.android.libraries.web.contrib.errorpage.b r1 = r5.f113678k
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00ab
            L_0x005b:
                com.google.android.libraries.web.contrib.errorpage.m r0 = r5.f113674g
                int r0 = r0.mo46584e()
                r5.f113680m = r0
                com.google.android.libraries.web.contrib.errorpage.b r0 = com.google.android.libraries.web.contrib.errorpage.C43514b.m76781b(r6)
                j$.util.function.Predicate r1 = r5.f113672e
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0088
                r5.f113678k = r0
                com.google.android.libraries.web.contrib.errorpage.b r1 = com.google.android.libraries.web.contrib.errorpage.C43514b.RENDERER_GONE
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007a
                goto L_0x0080
            L_0x007a:
                com.google.android.libraries.web.c.h r3 = r6.f113331d
                if (r3 != 0) goto L_0x0080
                com.google.android.libraries.web.c.h r3 = com.google.android.libraries.web.p3353c.C43363h.f113275f
            L_0x0080:
                r5.f113677j = r3
                com.google.android.libraries.web.contrib.errorpage.a.b r0 = r5.f113679l
                r5.m76809f(r6, r0)
                return
            L_0x0088:
                boolean r6 = r5.f113676i
                if (r6 == 0) goto L_0x00ab
                r5.m76808e()
                return
            L_0x0090:
                int r6 = r6.f113330c
                com.google.android.libraries.web.c.n r6 = com.google.android.libraries.web.p3353c.C43369n.m76519a(r6)
                if (r6 != 0) goto L_0x009a
                com.google.android.libraries.web.c.n r6 = com.google.android.libraries.web.p3353c.C43369n.UNSPECIFIED
            L_0x009a:
                boolean r6 = com.google.android.libraries.web.p3353c.C43370o.m76522b(r6)
                if (r6 != 0) goto L_0x00a2
                if (r1 == 0) goto L_0x00ab
            L_0x00a2:
                com.google.android.libraries.web.contrib.errorpage.b r6 = r5.f113678k
                if (r6 != 0) goto L_0x00ac
                com.google.android.libraries.web.contrib.errorpage.a.b r6 = r5.f113679l
                if (r6 == 0) goto L_0x00ab
                goto L_0x00ac
            L_0x00ab:
                return
            L_0x00ac:
                r5.f113678k = r3
                r5.f113677j = r3
                r5.f113679l = r3
                com.google.android.libraries.web.contrib.errorpage.m r6 = r5.f113674g
                r6.f113647c = r3
                r5.m76808e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.errorpage.C43531s.C43532a.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }

        /* renamed from: d */
        public final void mo46593d(C43512b bVar) {
            if (this.f113679l != bVar) {
                if (bVar != null) {
                    this.f113679l = bVar;
                    this.f113680m = this.f113674g.mo46584e();
                    m76809f(this.f113670c.mo46468a(), bVar);
                    return;
                }
                this.f113679l = null;
                if (this.f113677j == null) {
                    m76808e();
                }
            }
        }
    }

    public C43531s(Fragment fragment, C46801dp dpVar, C43269t tVar, C43377v vVar, C43511c cVar) {
        this.f113662b = fragment;
        this.f113663c = dpVar;
        this.f113664d = tVar;
        this.f113665e = vVar;
        this.f113666f = cVar;
    }

    /* renamed from: a */
    public final C43525m mo46591a() {
        return (C43525m) new WebModelProvider((Fragment) mo46592b()).mo47072a(C43525m.class);
    }

    /* renamed from: b */
    public final C43861g mo46592b() {
        Fragment parentFragment = this.f113662b.getParentFragment();
        parentFragment.getClass();
        C58838bb.m90884s(parentFragment instanceof C43861g, "ErrorPageMixin can only be used by a fragment that was registered with ErrorPageApi.");
        return (C43861g) parentFragment;
    }
}
