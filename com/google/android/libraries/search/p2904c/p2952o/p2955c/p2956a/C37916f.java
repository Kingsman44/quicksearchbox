package com.google.android.libraries.search.p2904c.p2952o.p2955c.p2956a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37321a;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37453cb;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2916e.C37521a;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.c.o.c.a.f */
/* compiled from: PG */
final class C37916f implements C37402bg {

    /* renamed from: a */
    public static final Duration f100504a = Duration.ofMinutes(10);

    /* renamed from: b */
    public final C37321a f100505b;

    /* renamed from: c */
    public final C60870cx f100506c = C2169h.m6027a(new C37912b(this));

    /* renamed from: d */
    public C2164c f100507d;

    /* renamed from: e */
    private final C37521a f100508e;

    /* renamed from: f */
    private final C37360ay f100509f;

    /* renamed from: g */
    private final Future f100510g;

    public C37916f(C37321a aVar, C37521a aVar2, C37360ay ayVar, C60888db dbVar) {
        long j;
        this.f100505b = aVar;
        this.f100508e = aVar2;
        C37357av avVar = (C37357av) ayVar.toBuilder();
        avVar.copyOnWrite();
        C37360ay ayVar2 = (C37360ay) avVar.instance;
        ayVar2.f99226a |= 512;
        ayVar2.f99236k = false;
        this.f100509f = (C37360ay) avVar.build();
        C37913c cVar = new C37913c(this);
        if ((ayVar.f99226a & 128) != 0) {
            j = ayVar.f99234i;
        } else {
            j = f100504a.toMillis();
        }
        this.f100510g = dbVar.mo29165e(cVar, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final C37401bf mo20354a() {
        return mo41151f(C37565ef.CLIENT_REQUESTED);
    }

    /* renamed from: b */
    public final C60870cx mo20355b() {
        return C60856cj.m92900i(this.f100509f);
    }

    /* renamed from: c */
    public final C60870cx mo20356c() {
        C37453cb cbVar = (C37453cb) C37454cc.f99428c.createBuilder();
        cbVar.copyOnWrite();
        C37454cc ccVar = (C37454cc) cbVar.instance;
        ccVar.f99430a |= 1;
        ccVar.f99431b = -1;
        return C60856cj.m92900i((C37454cc) cbVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo20357d() {
        return C60856cj.m92900i(new C37915e(this));
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo20358e() {
        return new C37911a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C37401bf mo41151f(C37565ef efVar) {
        C37418bw e = C37846as.m66799e(this.f100508e.mo41002a(), efVar);
        this.f100507d.mo5437b(e);
        this.f100510g.cancel(false);
        return new C37914d(e);
    }
}
