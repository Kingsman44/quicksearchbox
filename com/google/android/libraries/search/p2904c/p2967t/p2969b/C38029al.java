package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37657hd;
import com.google.android.libraries.search.p2904c.C37658he;
import com.google.android.libraries.search.p2904c.C37659hf;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.search.c.t.b.al */
/* compiled from: PG */
public final class C38029al implements C37659hf {

    /* renamed from: d */
    private static final C59071e f100749d = C59071e.m91332i("com.google.android.libraries.search.c.t.b.al");

    /* renamed from: a */
    public final C37773c f100750a;

    /* renamed from: b */
    public final C37966b f100751b;

    /* renamed from: c */
    public final C60870cx f100752c;

    /* renamed from: e */
    private final int f100753e;

    /* renamed from: f */
    private final C37895i f100754f;

    /* renamed from: g */
    private final C60888db f100755g;

    /* renamed from: h */
    private final C60870cx f100756h;

    /* renamed from: i */
    private final C58833ax f100757i;

    public C38029al(int i, C37773c cVar, C37360ay ayVar, C60870cx cxVar, C60870cx cxVar2, C37895i iVar, C60888db dbVar, C37966b bVar) {
        this.f100753e = i;
        this.f100750a = cVar;
        this.f100756h = cxVar;
        this.f100752c = cxVar2;
        this.f100754f = iVar;
        this.f100755g = dbVar;
        this.f100751b = bVar;
        this.f100757i = (ayVar.f99226a & 128) != 0 ? C58833ax.m90834k(dbVar.mo29164d(new C38026ai(this, cxVar2, bVar, cVar), ayVar.f99234i, TimeUnit.MILLISECONDS)) : C58836b.f156633a;
    }

    /* renamed from: a */
    public final C37657hd mo41057a() {
        return new C38027aj(this);
    }

    /* renamed from: b */
    public final C37657hd mo41058b() {
        return mo41208e(C37565ef.CLIENT_REQUESTED);
    }

    /* renamed from: c */
    public final C37658he mo41059c() {
        C59104x b = f100749d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52930)).mo56387q("#audio# stop listening hotword client session(token(%d)) seamlessly", this.f100753e);
        C37658he e = this.f100754f.mo41104e(this.f100753e, C37565ef.CLIENT_REQUESTED);
        this.f100755g.mo29165e(new C38028ak(this), 10000, TimeUnit.MILLISECONDS);
        return e;
    }

    /* renamed from: d */
    public final C60870cx mo41060d() {
        return this.f100756h;
    }

    /* renamed from: e */
    public final C37657hd mo41208e(C37565ef efVar) {
        C59104x b = f100749d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52929)).mo56352E("#audio# stop(reason(%s)) listening hotword client session(token(%d))", efVar.name(), this.f100753e);
        C37657hd d = this.f100754f.mo41103d(this.f100753e, efVar);
        if (this.f100757i.mo56113h()) {
            ((Future) this.f100757i.mo56107c()).cancel(false);
        }
        return d;
    }
}
