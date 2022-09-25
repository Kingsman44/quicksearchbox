package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.android.libraries.search.p2904c.C37657hd;
import com.google.android.libraries.search.p2904c.C37658he;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2982x.C38246e;
import com.google.android.libraries.search.p2904c.p2982x.C38250i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.c.t.b.ag */
/* compiled from: PG */
public final class C38024ag implements C37659hf {

    /* renamed from: c */
    private static final C59071e f100735c = C59071e.m91332i("com.google.android.libraries.search.c.t.b.ag");

    /* renamed from: a */
    public final C60870cx f100736a;

    /* renamed from: b */
    public final Executor f100737b;

    /* renamed from: d */
    private final C37679hz f100738d;

    /* renamed from: e */
    private final C58881cr f100739e;

    /* renamed from: f */
    private final C38246e f100740f;

    public C38024ag(C37679hz hzVar, C37561eb ebVar, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C60870cx cxVar, C38246e eVar, Executor executor) {
        this.f100738d = hzVar;
        this.f100740f = eVar;
        this.f100736a = cxVar;
        this.f100737b = executor;
        this.f100739e = C58886cw.m90973a(new C38018aa(axVar, axVar2, ebVar, axVar3));
    }

    /* renamed from: a */
    public final C37657hd mo41057a() {
        return new C38019ab(this);
    }

    /* renamed from: b */
    public final C37657hd mo41058b() {
        C59104x b = f100735c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52927)).mo56387q("#audio# stop listening hotword client session(token(%d)) remotely", this.f100738d.f100070b);
        C38246e eVar = this.f100740f;
        return new C38020ac(C70876o.m103760a(eVar.f189039a.mo39510a(C38250i.m67543k(), eVar.f189040b), this.f100738d));
    }

    /* renamed from: c */
    public final C37658he mo41059c() {
        C59104x b = f100735c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52928)).mo56387q("#audio# stop listening hotword client session(token(%d)) seamlessly remotely", this.f100738d.f100070b);
        C38246e eVar = this.f100740f;
        return new C38023af(this, C70876o.m103760a(eVar.f189039a.mo39510a(C38250i.m67544l(), eVar.f189040b), this.f100738d));
    }

    /* renamed from: d */
    public final C60870cx mo41060d() {
        return C60856cj.m92900i((C37656hc) this.f100739e.mo6453a());
    }
}
