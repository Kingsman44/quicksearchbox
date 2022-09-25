package com.google.android.libraries.search.p2904c.p2942m.p2944b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37396ba;
import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.p2906aa.C37329d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.c.m.b.c */
/* compiled from: PG */
public final class C37875c {

    /* renamed from: a */
    public static final C59071e f100422a = C59071e.m91332i("com.google.android.libraries.search.c.m.b.c");

    /* renamed from: b */
    public final C60870cx f100423b;

    /* renamed from: c */
    public C2164c f100424c;

    /* renamed from: d */
    private final AtomicBoolean f100425d = new AtomicBoolean(false);

    /* renamed from: e */
    private final C21370a f100426e;

    /* renamed from: f */
    private final C37360ay f100427f;

    public C37875c(C37360ay ayVar, C21370a aVar, Executor executor) {
        this.f100423b = C60846c.m92879h(C2169h.m6027a(new C37873a(this)), Throwable.class, C47810es.m84966f(C37874b.f100421a), executor);
        this.f100427f = ayVar;
        this.f100426e = aVar;
    }

    /* renamed from: a */
    public final void mo41094a(int i) {
        if (this.f100425d.compareAndSet(false, true)) {
            C37396ba baVar = (C37396ba) C37397bb.f99320c.createBuilder();
            if (i >= 0) {
                long b = (long) ((i * 1000) / C37329d.m66334b(this.f100427f));
                C59104x b2 = f100422a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "ALT.FirstByteReporter");
                ((C59052c) ((C59052c) b2).mo56372aa(52820)).mo56388r("#audio# mark first byte read result as non-empty, %dms spent reading", b);
                long c = this.f100426e.mo26871c();
                baVar.copyOnWrite();
                C37397bb bbVar = (C37397bb) baVar.instance;
                bbVar.f99322a |= 1;
                bbVar.f99323b = c - b;
            } else {
                C59104x b3 = f100422a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "ALT.FirstByteReporter");
                ((C59052c) ((C59052c) b3).mo56372aa(52819)).mo56386p("#audio# mark first byte read result as non-determined");
            }
            this.f100424c.mo5437b((C37397bb) baVar.build());
        }
    }
}
