package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p10923ac.p10948d.p10953b.C147325e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58371co;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.m */
/* compiled from: PG */
public final class C97290m {

    /* renamed from: a */
    public static final C58495hd f271707a;

    /* renamed from: b */
    public static final C59071e f271708b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bv.m");

    /* renamed from: c */
    public final C147325e f271709c;

    /* renamed from: d */
    public final C86124t f271710d;

    /* renamed from: e */
    public final C22871g f271711e;

    /* renamed from: f */
    public final C21370a f271712f;

    /* renamed from: g */
    public final C68214a f271713g;

    /* renamed from: h */
    public final C68214a f271714h;

    static {
        C118522by byVar = C118522by.MDH_FORCED_SYNC;
        C58485gu n = C58485gu.m89846n("mdh-forcedsync");
        C118522by byVar2 = C118522by.MDH_REGULAR_SYNC;
        C58485gu n2 = C58485gu.m89846n("mdh-regularsync");
        C118522by byVar3 = C118522by.MDH_WIPEOUT;
        C58485gu o = C58485gu.m89847o("mdh-wipeout", "mdh-subscription-cleanup");
        C58371co.m89406a(byVar, n);
        C58371co.m89406a(byVar2, n2);
        C58371co.m89406a(byVar3, o);
        f271707a = new C58723pp(new Object[]{byVar, n, byVar2, n2, byVar3, o}, 3);
    }

    public C97290m(C147325e eVar, C86124t tVar, C22871g gVar, C21370a aVar, C68214a aVar2, C68214a aVar3) {
        this.f271709c = eVar;
        this.f271710d = tVar;
        this.f271711e = gVar;
        this.f271712f = aVar;
        this.f271713g = aVar2;
        this.f271714h = aVar3;
    }

    /* renamed from: a */
    public static C118826c m160990a(Throwable th) {
        C59104x c = f271708b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "mdh-background-task");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(20919)).mo56386p("Ignored an exception while executing a MDH background task.");
        return C118826c.f331422a;
    }

    /* renamed from: b */
    public final C118549h mo90622b(C118522by byVar) {
        C118522by byVar2 = C118522by.UNKNOWN;
        int ordinal = byVar.ordinal();
        if (ordinal == 56 || ordinal == 57) {
            return new C97282e(this, new C97289l(this, new C97285h(this, byVar)));
        }
        return new C97282e(this, new C97285h(this, byVar));
    }
}
