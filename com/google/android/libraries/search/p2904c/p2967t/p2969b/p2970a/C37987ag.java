package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2906aa.C37331f;
import com.google.android.libraries.search.p2904c.p2916e.C37521a;
import com.google.android.libraries.search.p2904c.p2942m.C37877c;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.c.t.b.a.ag */
/* compiled from: PG */
public final class C37987ag {

    /* renamed from: a */
    public static final C59071e f100634a = C59071e.m91332i("com.google.android.libraries.search.c.t.b.a.ag");

    /* renamed from: b */
    public final C37521a f100635b;

    /* renamed from: c */
    public final C60870cx f100636c = C2169h.m6027a(new C37983ac(this));

    /* renamed from: d */
    public final C37877c f100637d;

    /* renamed from: e */
    public C2164c f100638e;

    /* renamed from: f */
    private final C60836bq f100639f;

    /* renamed from: g */
    private final Executor f100640g;

    /* renamed from: h */
    private final Executor f100641h;

    /* renamed from: i */
    private C60870cx f100642i;

    public C37987ag(C37521a aVar, C37877c cVar, Executor executor, Executor executor2, C60836bq bqVar) {
        this.f100635b = aVar;
        this.f100640g = executor;
        this.f100641h = executor2;
        this.f100639f = bqVar;
        this.f100637d = cVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo41190a(C37565ef efVar) {
        C60870cx cxVar;
        C59071e eVar = f100634a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.SourceSequencer");
        ((C59052c) ((C59052c) b).mo56372aa(52943)).mo56389s("#audio# close audio source(%s)", C37331f.m66337a(this.f100635b));
        if (this.f100642i == null) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.SourceSequencer");
            ((C59052c) ((C59052c) d).mo56372aa(52944)).mo56386p("#audio# closeAudioSource failed: audio source wasn't opened.");
            cxVar = C60856cj.m92900i(C37846as.m66801g(C37512ds.FAILED_CLOSING_WAS_NOT_OPENED));
        } else {
            C60836bq bqVar = this.f100639f;
            C37521a aVar = this.f100635b;
            Objects.requireNonNull(aVar);
            cxVar = bqVar.mo57304a(C47810es.m84978r(new C37982ab(aVar)), this.f100640g);
        }
        C60856cj.m92911t(cxVar, C47810es.m84974n(new C37986af(this, efVar)), this.f100641h);
        return cxVar;
    }

    /* renamed from: b */
    public final synchronized C60870cx mo41191b() {
        C59104x b = f100634a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.SourceSequencer");
        ((C59052c) ((C59052c) b).mo56372aa(52945)).mo56389s("#audio# open audio source(%s)", C37331f.m66337a(this.f100635b));
        if (this.f100642i == null) {
            this.f100642i = this.f100639f.mo57304a(C47810es.m84978r(new C37984ad(this)), this.f100640g);
        }
        C60856cj.m92911t(this.f100642i, C47810es.m84974n(new C37985ae(this)), this.f100641h);
        return this.f100642i;
    }
}
