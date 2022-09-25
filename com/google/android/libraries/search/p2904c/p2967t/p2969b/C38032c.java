package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37453cb;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.c.t.b.c */
/* compiled from: PG */
public final class C38032c implements C37402bg {

    /* renamed from: b */
    private static final C59071e f100765b = C59071e.m91332i("com.google.android.libraries.search.c.t.b.c");

    /* renamed from: c */
    private static final Duration f100766c = Duration.ofMinutes(10);

    /* renamed from: a */
    public final C60870cx f100767a;

    /* renamed from: d */
    private final int f100768d;

    /* renamed from: e */
    private final int f100769e;

    /* renamed from: f */
    private final C37895i f100770f;

    /* renamed from: g */
    private final C37360ay f100771g;

    /* renamed from: h */
    private final C60870cx f100772h;

    /* renamed from: i */
    private final Future f100773i;

    /* renamed from: a */
    public final C37401bf mo20354a() {
        return mo41211f(C37565ef.CLIENT_REQUESTED);
    }

    /* renamed from: b */
    public final C60870cx mo20355b() {
        return C60856cj.m92900i(this.f100771g);
    }

    /* renamed from: c */
    public final C60870cx mo20356c() {
        C37453cb cbVar = (C37453cb) C37454cc.f99428c.createBuilder();
        int i = this.f100768d;
        cbVar.copyOnWrite();
        C37454cc ccVar = (C37454cc) cbVar.instance;
        ccVar.f99430a |= 1;
        ccVar.f99431b = i;
        return C60856cj.m92900i((C37454cc) cbVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo20357d() {
        return this.f100772h;
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo20358e() {
        return new C37979a(this);
    }

    /* renamed from: f */
    public final C37401bf mo41211f(C37565ef efVar) {
        C59104x b = f100765b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52904)).mo56359L("#audio# stop(reason(%s)) listening audio request client(token(%d)) session(token(%d))", efVar.name(), Integer.valueOf(this.f100769e), Integer.valueOf(this.f100768d));
        C37401bf a = this.f100770f.mo41100a(this.f100769e, this.f100768d, efVar);
        this.f100773i.cancel(false);
        return a;
    }

    public C38032c(int i, int i2, C37360ay ayVar, C60870cx cxVar, C60870cx cxVar2, C37773c cVar, C37895i iVar, C37966b bVar, C60888db dbVar) {
        long j;
        this.f100769e = i;
        this.f100768d = i2;
        this.f100771g = ayVar;
        this.f100772h = cxVar;
        this.f100770f = iVar;
        this.f100767a = cxVar2;
        C38031b bVar2 = new C38031b(this, cxVar2, bVar, cVar);
        if ((ayVar.f99226a & 128) != 0) {
            j = ayVar.f99234i;
        } else {
            j = f100766c.toMillis();
        }
        this.f100773i = dbVar.mo29164d(bVar2, j, TimeUnit.MILLISECONDS);
    }
}
