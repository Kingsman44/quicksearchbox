package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
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
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bt */
/* compiled from: PG */
public final class C95369bt extends C95405db {

    /* renamed from: o */
    public static final C59071e f266836o = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.bt");

    /* renamed from: A */
    private C124715m f266837A;

    /* renamed from: B */
    private boolean f266838B;

    /* renamed from: C */
    private final C22871g f266839C;

    /* renamed from: p */
    public boolean f266840p;

    /* renamed from: q */
    public boolean f266841q;

    /* renamed from: r */
    public final ConcurrentLinkedQueue f266842r = new ConcurrentLinkedQueue();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95369bt(C68214a aVar, C95349b bVar, C22871g gVar, C22871g gVar2, C90821bm bmVar, C95295ag agVar, C95426dw dwVar, C95850a aVar2, C95357bh bhVar, C95732aw awVar, C89656k kVar, C95391co coVar, C95416dm dmVar, C68214a aVar3, C124539a aVar4, C95026a aVar5) {
        super(aVar, bVar, gVar, gVar2, bmVar, agVar, dwVar, aVar2, bhVar, awVar, kVar, coVar, dmVar, aVar3, aVar4, aVar5);
        C22872h.m42742b(C0826b.class);
        this.f266839C = gVar;
        this.f266837A = mo89263d();
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        if (!this.f266840p) {
            return super.mo89254E(str, i, i2, bArr);
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }

    public final void close() {
        C22872h.m42742b(C0826b.class);
        this.f266841q = true;
        if (this.f266840p) {
            this.f266840p = false;
        }
        while (true) {
            C95368bs bsVar = (C95368bs) this.f266842r.poll();
            if (bsVar == null) {
                super.close();
                return;
            }
            bsVar.close();
        }
    }

    /* renamed from: d */
    public final C124715m mo89263d() {
        if (!this.f266840p) {
            return super.mo89263d();
        }
        C58976aa aaVar = C58975e.f156826a;
        return this.f266837A;
    }

    /* renamed from: g */
    public final C60870cx mo89266g(long j) {
        if (this.f266840p) {
            C59104x c = f266836o.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoTwsDevice");
            ((C59052c) ((C59052c) c).mo56372aa(14963)).mo56386p("reconnectTws when already reconnecting");
            return C60856cj.m92899h(new Exception("reconnectTws when already reconnecting"));
        }
        this.f266840p = true;
        this.f266837A = mo89263d();
        this.f266838B = mo89278w();
        SettableFuture settableFuture = new SettableFuture();
        new C90873ag(super.mo89266g(j), this.f266839C, "onReconnectComplete", new C95366bq(this, settableFuture)).mo85223a(new C95367br(this, settableFuture));
        return settableFuture;
    }

    /* renamed from: j */
    public final void mo89269j(C95419dp dpVar) {
        if (this.f266840p) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            super.mo89269j(dpVar);
        }
    }

    /* renamed from: w */
    public final boolean mo89278w() {
        if (!this.f266840p) {
            return super.mo89278w();
        }
        C58976aa aaVar = C58975e.f156826a;
        return this.f266838B;
    }

    /* renamed from: D */
    public final C60870cx mo89257D(int i, int i2, byte[] bArr) {
        if (!this.f266840p || this.f266841q) {
            return super.mo89257D(i, i2, bArr);
        }
        C95368bs bsVar = new C95368bs(this, i, i2, bArr);
        this.f266842r.add(bsVar);
        return bsVar.f266834d;
    }
}
