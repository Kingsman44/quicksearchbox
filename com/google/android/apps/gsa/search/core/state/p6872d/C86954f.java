package com.google.android.apps.gsa.search.core.state.p6872d;

import com.google.android.apps.gsa.search.core.p6519al.p6686d.C85273a;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86786a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4500cm.p4518d.C58189f;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.f */
/* compiled from: PG */
public final class C86954f extends C86898ct implements C86786a {

    /* renamed from: a */
    public static final C59071e f234869a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.f");

    /* renamed from: b */
    static final int[] f234870b = {500, 10000, 600000, 1800000, 3600000, 7200000};

    /* renamed from: c */
    public final Queue f234871c = new ArrayDeque();

    /* renamed from: d */
    public boolean f234872d;

    /* renamed from: e */
    public boolean f234873e;

    /* renamed from: f */
    private boolean f234874f;

    /* renamed from: g */
    private int f234875g;

    /* renamed from: h */
    private long f234876h = -1;

    /* renamed from: i */
    private final C85273a f234877i;

    /* renamed from: j */
    private C60870cx f234878j;

    /* renamed from: k */
    private long f234879k = -1;

    /* renamed from: l */
    private final C22871g f234880l;

    /* renamed from: m */
    private final C21370a f234881m;

    public C86954f(C68214a aVar, C21370a aVar2, C85273a aVar3, C22871g gVar) {
        super(aVar, 13);
        this.f234877i = aVar3;
        this.f234881m = aVar2;
        this.f234880l = gVar;
    }

    /* renamed from: k */
    private final void m140352k() {
        C60870cx cxVar;
        if (!this.f234872d && (cxVar = this.f234878j) != null) {
            cxVar.cancel(false);
            this.f234878j = null;
            this.f234879k = -1;
        }
    }

    /* renamed from: a */
    public final void mo80426a(C58189f fVar) {
        this.f234871c.add(fVar);
        mo80609g();
    }

    /* renamed from: b */
    public final void mo80427b() {
        mo80610i();
        mo80609g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo80608e() {
        ((C59052c) ((C59052c) f234869a.mo56225c()).mo56372aa(9085)).mo56386p("Sending failed");
        C58838bb.m90883r(this.f234872d);
        this.f234872d = false;
        this.f234875g++;
        mo80609g();
    }

    /* renamed from: g */
    public final void mo80609g() {
        boolean z = true;
        boolean z2 = !this.f234872d && !this.f234871c.isEmpty();
        boolean z3 = this.f234872d;
        if (z2 && (!this.f234874f || this.f234876h < 0)) {
            int[] iArr = f234870b;
            int i = this.f234875g;
            int length = iArr.length;
            this.f234876h = this.f234881m.mo26870b() + ((long) iArr[Math.min(i, 5)]);
        }
        this.f234874f = z2;
        boolean z4 = (!this.f234871c.isEmpty()) | z3;
        if (this.f234873e != z4) {
            this.f234873e = z4;
        } else {
            z = false;
        }
        if (this.f234874f) {
            long j = this.f234876h;
            if (!(this.f234878j == null || this.f234879k == j)) {
                m140352k();
            }
            if (this.f234878j == null) {
                this.f234879k = j;
                long b = j - this.f234881m.mo26870b();
                if (b <= 0) {
                    mo80611j();
                } else {
                    this.f234878j = this.f234880l.mo28208h("startUploadFromMainThread", b, new C86953e(this));
                }
            }
        } else {
            m140352k();
        }
        if (z && !this.f234872d) {
            mo80591ar();
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ActionVeLoggingState");
        fVar.mo85279c("ReadyToSend").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234874f)));
        fVar.mo85279c("SendingEvents").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234872d)));
        fVar.mo85279c("HasPendingWork").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234873e)));
        fVar.mo85279c("PendingSessions").mo85276a(C90752i.m148230d(Integer.valueOf(this.f234871c.size())));
    }

    /* renamed from: i */
    public final void mo80610i() {
        this.f234875g = 0;
        this.f234876h = -1;
    }

    /* renamed from: j */
    public final void mo80611j() {
        this.f234878j = null;
        this.f234879k = -1;
        if (this.f234874f) {
            C85273a aVar = this.f234877i;
            C58838bb.m90883r(!this.f234872d);
            this.f234872d = true;
            mo80609g();
            C58189f fVar = (C58189f) this.f234871c.peek();
            fVar.getClass();
            new C90873ag(aVar.mo78835a(fVar), this.f234880l, "start VE session upload", new C86951c(this)).mo85223a(new C86952d(this));
        }
    }
}
