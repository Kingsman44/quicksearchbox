package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.os.Bundle;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43675b;
import com.google.android.libraries.web.contrib.loadingbar.p3397a.C43676c;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.base.C58893dc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.c */
/* compiled from: PG */
public final class C43679c {

    /* renamed from: a */
    public static final C59071e f113970a = C59071e.m91332i("com.google.android.libraries.web.contrib.loadingbar.ui.c");

    /* renamed from: b */
    public final C46792di f113971b = new C46792di() {
        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C43679c.f113970a.mo56226d()).mo56382g(th)).mo56372aa(54093)).mo56386p("Failed to fetch WebState.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
            if ((r4.f113328a & 64) != 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
            if (r0 != 0) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r0.f113296b.isEmpty() == false) goto L_0x001e;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ void mo18078b(java.lang.Object r4) {
            /*
                r3 = this;
                com.google.android.libraries.web.c.u r4 = (com.google.android.libraries.web.p3353c.C43376u) r4
                com.google.android.libraries.web.contrib.loadingbar.ui.c r0 = com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.this
                com.google.android.libraries.web.contrib.loadingbar.ui.j r0 = r0.f113977h
                if (r0 == 0) goto L_0x0076
                java.lang.String r0 = r4.f113329b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x001e
                com.google.android.libraries.web.c.l r0 = r4.f113335h
                if (r0 != 0) goto L_0x0016
                com.google.android.libraries.web.c.l r0 = com.google.android.libraries.web.p3353c.C43367l.f113293h
            L_0x0016:
                java.lang.String r0 = r0.f113296b
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x002b
            L_0x001e:
                int r0 = r4.f113328a
                r0 = r0 & 64
                r1 = 100
                if (r0 == 0) goto L_0x0033
                int r0 = r4.f113333f
                if (r0 == r1) goto L_0x002b
                goto L_0x0033
            L_0x002b:
                com.google.android.libraries.web.contrib.loadingbar.ui.c r4 = com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.this
                com.google.android.libraries.web.contrib.loadingbar.ui.j r4 = r4.f113977h
                r4.mo46702b()
                return
            L_0x0033:
                com.google.android.libraries.web.contrib.loadingbar.ui.c r0 = com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.this
                com.google.android.libraries.web.contrib.loadingbar.a.c r0 = r0.f113973d
                com.google.android.libraries.web.base.t r0 = r0.f113963a
                com.google.android.libraries.web.base.v r0 = r0.mo46385c()
                com.google.android.libraries.web.base.v r2 = com.google.android.libraries.web.base.C43271v.WEB_VIEW
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x005f
                int r0 = r4.f113330c
                com.google.android.libraries.web.c.n r0 = com.google.android.libraries.web.p3353c.C43369n.m76519a(r0)
                if (r0 != 0) goto L_0x004f
                com.google.android.libraries.web.c.n r0 = com.google.android.libraries.web.p3353c.C43369n.UNSPECIFIED
            L_0x004f:
                com.google.common.b.ij r2 = com.google.android.libraries.web.p3353c.C43370o.f113313a
                boolean r0 = r2.contains(r0)
                if (r0 != 0) goto L_0x0058
                goto L_0x0065
            L_0x0058:
                int r0 = r4.f113328a
                r0 = r0 & 64
                if (r0 != 0) goto L_0x0065
                goto L_0x006f
            L_0x005f:
                int r0 = r4.f113333f
                if (r0 == r1) goto L_0x006f
                if (r0 == 0) goto L_0x006f
            L_0x0065:
                com.google.android.libraries.web.contrib.loadingbar.ui.c r0 = com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.this
                com.google.android.libraries.web.contrib.loadingbar.ui.j r0 = r0.f113977h
                int r4 = r4.f113333f
                r0.mo46701a(r4)
                return
            L_0x006f:
                com.google.android.libraries.web.contrib.loadingbar.ui.c r4 = com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.this
                com.google.android.libraries.web.contrib.loadingbar.ui.j r4 = r4.f113977h
                r4.mo46701a(r1)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.web.contrib.loadingbar.p3398ui.C43679c.C436801.mo18078b(java.lang.Object):void");
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    };

    /* renamed from: c */
    public final int f113972c;

    /* renamed from: d */
    public final C43676c f113973d;

    /* renamed from: e */
    public final C46801dp f113974e;

    /* renamed from: f */
    public final C43377v f113975f;

    /* renamed from: g */
    public final C43675b f113976g;

    /* renamed from: h */
    C43687j f113977h;

    public C43679c(C43678b bVar, C46801dp dpVar, C43377v vVar, C43676c cVar, C43675b bVar2) {
        this.f113974e = dpVar;
        this.f113975f = vVar;
        this.f113973d = cVar;
        Bundle arguments = bVar.getArguments();
        C58893dc.m90996a(arguments);
        this.f113972c = arguments.getInt("WebxLoadingBarDrawable", 0);
        this.f113976g = bVar2;
    }

    /* renamed from: a */
    public static C43678b m77075a(AccountId accountId, int i, C43675b bVar) {
        C43678b bVar2 = new C43678b();
        C68324h.m98669f(bVar2);
        C47247a.m84047b(bVar2, accountId);
        C47243l.m84039a(bVar2, bVar);
        Bundle arguments = bVar2.getArguments();
        arguments.getClass();
        arguments.putInt("WebxLoadingBarDrawable", i);
        bVar2.setArguments(arguments);
        return bVar2;
    }
}
