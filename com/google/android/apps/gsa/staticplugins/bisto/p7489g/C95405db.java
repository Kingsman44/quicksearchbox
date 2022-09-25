package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.bisto.C89646bc;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.staticplugins.bisto.p7478ad.C95026a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95732aw;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60285mz;
import com.google.common.p4552o.C60290nc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.db */
/* compiled from: PG */
public class C95405db extends C95345aw {

    /* renamed from: A */
    private static final int f266922A = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: o */
    private static final int f266923o = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: p */
    private static final int f266924p = ((int) TimeUnit.SECONDS.toMillis(10));

    /* renamed from: q */
    private static final int f266925q = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: r */
    private static final int f266926r = ((int) TimeUnit.MINUTES.toMillis(3));

    /* renamed from: s */
    public static final C59071e f266927s = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.db");

    /* renamed from: t */
    public final C89646bc f266928t;

    /* renamed from: u */
    public final C89646bc f266929u;

    /* renamed from: v */
    public final C22871g f266930v;

    /* renamed from: w */
    public final C68214a f266931w;

    /* renamed from: x */
    public SettableFuture f266932x;

    /* renamed from: y */
    public C60870cx f266933y;

    /* renamed from: z */
    public boolean f266934z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95405db(C68214a aVar, C95349b bVar, C22871g gVar, C22871g gVar2, C90821bm bmVar, C95295ag agVar, C95426dw dwVar, C95850a aVar2, C95357bh bhVar, C95732aw awVar, C89656k kVar, C95391co coVar, C95416dm dmVar, C68214a aVar3, C124539a aVar4, C95026a aVar5) {
        super(aVar, bVar, gVar, gVar2, bmVar, agVar, dwVar, aVar2, bhVar, awVar, kVar, coVar, dmVar, aVar3, aVar4, aVar5);
        int i = f266923o;
        int i2 = f266924p;
        long j = (long) f266922A;
        this.f266928t = new C89646bc(i, 1, (long) i2, j);
        this.f266929u = new C89646bc(f266925q, 4, (long) f266926r, j);
        C22872h.m42742b(C0826b.class);
        this.f266930v = gVar;
        this.f266931w = aVar3;
    }

    public void close() {
        C22872h.m42742b(C0826b.class);
        this.f266934z = false;
        C60870cx cxVar = this.f266933y;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f266933y = null;
        }
        SettableFuture settableFuture = this.f266932x;
        if (settableFuture != null) {
            settableFuture.cancel(false);
            this.f266932x = null;
        }
        super.close();
    }

    /* renamed from: e */
    public final C60870cx mo89264e() {
        SettableFuture settableFuture = this.f266932x;
        if (settableFuture != null) {
            C59104x b = f266927s.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) b).mo56372aa(14998)).mo56386p("Already connecting");
            return settableFuture;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (this.f266934z) {
            this.f266928t.mo83535b();
        } else {
            this.f266929u.mo83535b();
        }
        this.f266932x = new SettableFuture();
        if (mo89347u()) {
            this.f266933y = super.mo89264e();
        } else {
            C59104x d = f266927s.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) d).mo56372aa(14996)).mo56386p("connect stopped");
            this.f266933y = C60856cj.m92899h(new Exception("connect stopped"));
        }
        mo89346t();
        SettableFuture settableFuture2 = this.f266932x;
        if (settableFuture2 != null) {
            return settableFuture2;
        }
        C59104x d2 = f266927s.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
        ((C59052c) ((C59052c) d2).mo56372aa(14997)).mo56386p("Null connectFuture");
        int i = C90755l.f253831a;
        return C60856cj.m92899h(new Exception("Null connectFuture"));
    }

    /* renamed from: f */
    public final C60870cx mo89265f(String str) {
        C59104x b = f266927s.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
        ((C59052c) ((C59052c) b).mo56372aa(14999)).mo56389s("disconnect %s", str);
        C60870cx cxVar = this.f266933y;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f266933y = null;
        }
        SettableFuture settableFuture = this.f266932x;
        if (settableFuture != null) {
            settableFuture.cancel(false);
            this.f266932x = null;
        }
        this.f266929u.mo83535b();
        this.f266928t.mo83535b();
        return super.mo89265f(str);
    }

    /* renamed from: g */
    public C60870cx mo89266g(long j) {
        this.f266934z = true;
        C60285mz mzVar = ((C95373bx) this.f266931w.mo27525b()).f266874d;
        if (mzVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            mzVar.copyOnWrite();
            C60290nc ncVar = (C60290nc) mzVar.instance;
            C60290nc ncVar2 = C60290nc.f163102j;
            ncVar.f163104a |= 8;
            ncVar.f163108e = 0;
        }
        C60870cx g = super.mo89266g(j);
        C90875ai.m148465b(new C95399cw(this), g, this.f266930v, "onReconnectComplete").mo85223a(new C95400cx(this));
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ C60870cx mo89345s() {
        if (!mo89347u()) {
            C59104x d = f266927s.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) d).mo56372aa(15001)).mo56386p("!shouldConnect");
            return C60856cj.m92899h(new Exception("!shouldConnect"));
        }
        C58976aa aaVar = C58975e.f156826a;
        return super.mo89264e();
    }

    /* renamed from: t */
    public final void mo89346t() {
        if (this.f266933y == null) {
            C59104x c = f266927s.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) c).mo56372aa(15003)).mo56386p("Null currentConnectAttemptFuture");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        C60285mz mzVar = ((C95373bx) this.f266931w.mo27525b()).f266874d;
        if (mzVar != null) {
            int i = ((C60290nc) mzVar.instance).f163108e;
            mzVar.copyOnWrite();
            C60290nc ncVar = (C60290nc) mzVar.instance;
            ncVar.f163104a |= 8;
            ncVar.f163108e = i + 1;
        }
        C90875ai.m148465b(new C95402cz(this), this.f266933y, this.f266930v, "currentConnectAttemptFuture").mo85223a(new C95404da(this));
    }

    /* renamed from: u */
    public final boolean mo89347u() {
        C124715m a = mo89259a();
        return !this.f266752f.get() || a.equals(C124715m.AUDIO_ONLY) || a.equals(C124715m.DATA_DISCONNECTED_AUDIO_UNKNOWN) || a.equals(C124715m.FULLY_CONNECTED);
    }
}
