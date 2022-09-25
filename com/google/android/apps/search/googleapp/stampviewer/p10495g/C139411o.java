package com.google.android.apps.search.googleapp.stampviewer.p10495g;

import com.google.android.apps.search.googleapp.stampviewer.C139317ac;
import com.google.android.apps.search.googleapp.stampviewer.p10488b.C139326h;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.o */
/* compiled from: PG */
public final class C139411o implements C139410n {

    /* renamed from: a */
    public static final C59071e f379074a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.g.o");

    /* renamed from: b */
    public final C139317ac f379075b;

    /* renamed from: c */
    public final C39141kp f379076c;

    /* renamed from: d */
    private final C139326h f379077d;

    /* renamed from: e */
    private final C46801dp f379078e;

    /* renamed from: f */
    private final C139397a f379079f;

    /* renamed from: g */
    private final C139412a f379080g;

    /* renamed from: h */
    private final C37215b f379081h;

    /* renamed from: i */
    private final int f379082i;

    /* renamed from: j */
    private int f379083j = -1;

    /* renamed from: k */
    private boolean f379084k = false;

    /* renamed from: l */
    private final int f379085l;

    /* renamed from: com.google.android.apps.search.googleapp.stampviewer.g.o$a */
    /* compiled from: PG */
    final class C139412a implements C46792di {
        public C139412a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C139411o.this.mo114949d(C62722b.UNKNOWN);
            ((C19567d) C139411o.this.f379076c.f103028e.mo6453a()).mo24822a(1, new Object[0]);
            ((C59052c) ((C59052c) ((C59052c) C139411o.f379074a.mo56225c()).mo56382g(th)).mo56372aa(41378)).mo56386p("getRecommendations() failed");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            List list = (List) obj;
            if (list.isEmpty()) {
                C139411o.this.mo114949d(C62722b.CANCELLED);
                return;
            }
            C139411o.this.f379075b.mo114893d(list);
            C139411o.this.mo114949d(C62722b.OK);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C139411o(C139317ac acVar, int i, C139326h hVar, C39141kp kpVar, C46801dp dpVar, C139397a aVar, C37215b bVar, long j) {
        this.f379075b = acVar;
        this.f379085l = i;
        this.f379077d = hVar;
        this.f379076c = kpVar;
        this.f379078e = dpVar;
        this.f379079f = aVar;
        this.f379080g = new C139412a();
        this.f379081h = bVar;
        this.f379082i = (int) j;
    }

    /* renamed from: a */
    public final void mo9182a(int i) {
    }

    /* renamed from: b */
    public final void mo114948b(int i) {
        if (this.f379082i > 0 && this.f379077d.f378941b && i > this.f379083j) {
            this.f379083j = i;
            this.f379078e.mo50707a(this.f379079f.mo114946a(this.f379075b.mo114892c(), this.f379085l, i), this.f379080g);
            if (!this.f379084k) {
                this.f379081h.mo19974a(C37182a.f98169hd);
                this.f379084k = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo9183c(int i, float f, int i2) {
    }

    /* renamed from: d */
    public final void mo114949d(C62722b bVar) {
        if (this.f379084k) {
            this.f379084k = false;
            this.f379081h.mo19974a(C37182a.f98170he.mo40806d().mo40781e(bVar));
        }
    }

    /* renamed from: e */
    public final void mo9184e(int i) {
        mo114948b(i);
    }
}
