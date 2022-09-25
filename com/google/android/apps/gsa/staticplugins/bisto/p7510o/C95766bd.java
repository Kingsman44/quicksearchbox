package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95295ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7511a.C95709a;
import com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7513c.C95794e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142359ck;
import com.google.android.p10712d.C142360cl;
import com.google.android.p10712d.C142365cq;
import com.google.android.p10712d.C142366cr;
import com.google.android.p10712d.C142377db;
import com.google.android.p10712d.C142379dd;
import com.google.android.p10712d.C142381df;
import com.google.android.p10712d.C142383dh;
import com.google.android.p10712d.C142386dk;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import dagger.C68214a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.bd */
/* compiled from: PG */
public final class C95766bd implements AutoCloseable, C95352bc, C89495cg {

    /* renamed from: a */
    public static final C59071e f268135a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.bd");

    /* renamed from: b */
    public final C95355bf f268136b;

    /* renamed from: c */
    public final C68214a f268137c;

    /* renamed from: d */
    public final C95803ci f268138d;

    /* renamed from: e */
    public final C95735az f268139e;

    /* renamed from: f */
    private C124548d f268140f;

    /* renamed from: g */
    private final C95295ag f268141g;

    /* renamed from: h */
    private final C95794e f268142h;

    /* renamed from: i */
    private final C95708a f268143i;

    /* renamed from: j */
    private final C95709a f268144j;

    public C95766bd(C95355bf bfVar, C68214a aVar, C95803ci ciVar, C95295ag agVar, C95794e eVar, C95735az azVar, C95709a aVar2, C95708a aVar3) {
        this.f268136b = bfVar;
        this.f268137c = aVar;
        this.f268138d = ciVar;
        this.f268140f = ((C89496ch) aVar.mo27525b()).mo83401b(bfVar.mo89270k());
        this.f268141g = agVar;
        this.f268142h = eVar;
        this.f268139e = azVar;
        this.f268144j = aVar2;
        this.f268143i = aVar3;
    }

    /* renamed from: a */
    private final void m158665a(C142360cl clVar) {
        C142359ck ckVar;
        C142359ck ckVar2;
        C95294af a = this.f268141g.mo89222a();
        ArrayList arrayList = new ArrayList(new C62963cj(clVar.f386306b, C142360cl.f386302c));
        C59104x b = f268135a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QpuBistoSdkHandler");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(15316);
        String a2 = C95708a.m158482a(7);
        StringBuilder sb = new StringBuilder("[ ");
        for (C142359ck name : new C62963cj(clVar.f386306b, C142360cl.f386302c)) {
            sb.append(name.name());
            sb.append(" ");
        }
        sb.append("]");
        cVar.mo56354G("Context %s Action input %s", a2, sb.toString());
        if (!this.f268139e.mo89720b(a, clVar, 7)) {
            C58557jl.m90145z(arrayList, new C95765bc(this));
            C142359ck a3 = this.f268142h.mo89774a(arrayList);
            if (a3 != null) {
                this.f268143i.mo89667b(arrayList, a3, 7);
            }
            if (arrayList.contains(C142359ck.COMPLETE_VOICE_INPUT)) {
                this.f268138d.mo89711Q();
                ckVar = C142359ck.COMPLETE_VOICE_INPUT;
            } else {
                ckVar = null;
            }
            if (ckVar != null) {
                this.f268143i.mo89667b(arrayList, ckVar, 7);
            } else if (!arrayList.contains(C142359ck.ASSISTANT_NO_OP)) {
                if (arrayList.contains(C142359ck.PERFORM_VOICE_INPUT)) {
                    this.f268138d.mo89710P((C95288a) null, (PlaybackStatus) null);
                    ckVar2 = C142359ck.PERFORM_VOICE_INPUT;
                } else if (arrayList.contains(C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT)) {
                    this.f268138d.mo89710P((C95288a) null, (PlaybackStatus) null);
                    ckVar2 = C142359ck.ANNOUNCEMENTS_OR_VOICE_INPUT;
                } else {
                    ckVar2 = null;
                }
                if (ckVar2 != null) {
                    this.f268143i.mo89667b(arrayList, ckVar2, 7);
                } else {
                    this.f268143i.mo89667b(arrayList, (C142359ck) null, 7);
                }
            } else {
                this.f268143i.mo89667b(arrayList, C142359ck.ASSISTANT_NO_OP, 7);
            }
        }
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        if (i != 2) {
            return false;
        }
        if (!str.equals(this.f268136b.mo89270k())) {
            C59104x d = f268135a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "QpuBistoSdkHandler");
            ((C59052c) ((C59052c) d).mo56372aa(15325)).mo56386p("Ignoring input from different device");
            return false;
        }
        try {
            if (!this.f268139e.mo89721c(i2, bArr, 7)) {
                C142360cl clVar = null;
                if (i2 == 6) {
                    C142366cr crVar = (C142366cr) C62942bv.parseFrom((C62942bv) C142366cr.f386310c, bArr, C62921ba.m95368a());
                    C58976aa aaVar = C58975e.f156826a;
                    int a = C142365cq.m231068a(crVar.f386312a);
                    if (a == 0) {
                        a = 1;
                    }
                    boolean z = crVar.f386313b;
                    C124548d dVar = this.f268140f;
                    if (dVar == null) {
                        C59104x c = f268135a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "QpuBistoSdkHandler");
                        ((C59052c) ((C59052c) c).mo56372aa(15315)).mo56389s("Can't process input for device %s", this.f268136b.mo89270k());
                    } else {
                        clVar = C95827z.m158862a(dVar, a, z);
                    }
                    if (clVar != null) {
                        m158665a(clVar);
                    }
                } else if (i2 == 2) {
                    C142383dh dhVar = (C142383dh) C62942bv.parseFrom((C62942bv) C142383dh.f386354m, bArr, C62921ba.m95368a());
                    C58976aa aaVar2 = C58975e.f156826a;
                    boolean z2 = dhVar.f386366k;
                    boolean z3 = dhVar.f386367l;
                    this.f268138d.mo89712R(dhVar, (PlaybackStatus) null);
                } else if (i2 == 3) {
                    C142386dk dkVar = (C142386dk) C62942bv.parseFrom((C62942bv) C142386dk.f386370c, bArr, C62921ba.m95368a());
                    C58976aa aaVar3 = C58975e.f156826a;
                    int i3 = dkVar.f386373b;
                    this.f268138d.mo89706L(dkVar);
                } else if (i2 == 4) {
                    C58976aa aaVar4 = C58975e.f156826a;
                    C142377db dbVar = (C142377db) C62942bv.parseFrom((C62942bv) C142377db.f386340b, bArr, C62921ba.m95368a());
                    C95709a aVar = this.f268144j;
                    dbVar.f386342a.mo59174N();
                    aVar.mo89669b();
                    this.f268138d.mo89705K(dbVar);
                } else if (i2 == 5) {
                    C62921ba a2 = C62921ba.m95368a();
                    this.f268138d.mo89715k((C142381df) C62942bv.parseFrom((C62942bv) C142381df.f386349b, bArr, a2));
                } else if (i2 == 10) {
                    C142379dd ddVar = (C142379dd) C62942bv.parseFrom((C62942bv) C142379dd.f386345b, bArr, C62921ba.m95368a());
                    C58976aa aaVar5 = C58975e.f156826a;
                    boolean z4 = ddVar.f386347a;
                    this.f268138d.mo89714j(ddVar);
                } else if (i2 == 9) {
                    m158665a((C142360cl) C62942bv.parseFrom((C62942bv) C142360cl.f386303e, bArr, C62921ba.m95368a()));
                } else {
                    C59104x c2 = f268135a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "QpuBistoSdkHandler");
                    ((C59052c) ((C59052c) c2).mo56372aa(15318)).mo56387q("Unknown message type:%d", i2);
                }
            }
            return true;
        } catch (IOException e) {
            C59104x c3 = f268135a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "QpuBistoSdkHandler");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(15319)).mo56386p("Error parsing received proto");
            return false;
        }
    }

    public final void close() {
        this.f268138d.mo89713g();
        ((C89496ch) this.f268137c.mo27525b()).mo83379U(this);
        this.f268136b.mo89275p(this);
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (str.equals(this.f268136b.mo89270k())) {
            this.f268140f = dVar;
        }
    }
}
