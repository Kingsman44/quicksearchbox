package com.google.android.apps.search.soundsearch.p10652a;

import com.google.android.apps.search.soundsearch.p10660g.p10661a.C141679i;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37405bj;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.p2927f.C37587a;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.C37769l;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.soundsearch.a.e */
/* compiled from: PG */
public final class C141633e {

    /* renamed from: a */
    public static final C59071e f384444a = C59071e.m91332i("com.google.android.apps.search.soundsearch.a.e");

    /* renamed from: b */
    public final AtomicBoolean f384445b = new AtomicBoolean(false);

    /* renamed from: c */
    public final C141679i f384446c;

    /* renamed from: d */
    private final C60887da f384447d;

    /* renamed from: e */
    private final C60887da f384448e;

    /* renamed from: f */
    private final C37419bx f384449f;

    /* renamed from: g */
    private C60870cx f384450g;

    /* renamed from: h */
    private C37402bg f384451h;

    public C141633e(C37419bx bxVar, C60887da daVar, C60887da daVar2, C141679i iVar) {
        this.f384449f = bxVar;
        this.f384447d = daVar;
        this.f384448e = daVar2;
        this.f384446c = iVar;
    }

    /* renamed from: d */
    private final synchronized C60870cx m229848d(C37402bg bgVar) {
        C60870cx d;
        C141629a aVar;
        d = bgVar.mo20357d();
        aVar = C141629a.f384441a;
        return C60922j.m93045h(d, C47810es.m84966f(aVar), this.f384447d);
    }

    /* renamed from: a */
    public final synchronized InputStream mo116623a() {
        return new C37587a(this.f384450g);
    }

    /* renamed from: b */
    public final synchronized void mo116624b() {
        if (this.f384445b.compareAndSet(false, true)) {
            C37402bg bgVar = this.f384451h;
            if (bgVar != null) {
                C60870cx a = bgVar.mo20354a().mo20353a();
                C141632d dVar = new C141632d();
                C60856cj.m92911t(a, C47810es.m84974n(dVar), this.f384447d);
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo116625c() {
        if (this.f384445b.get()) {
            ((C59052c) ((C59052c) f384444a.mo56225c()).mo56372aa(41767)).mo56386p("#closeMicIfNeeded called before #initializeAsync");
            this.f384450g = C60856cj.m92899h(new Exception("Mic closed before initialization"));
            return;
        }
        ((C59052c) ((C59052c) f384444a.mo56224b()).mo56372aa(41766)).mo56386p("#activateAudioRequestClientAndStartListening");
        C37419bx bxVar = this.f384449f;
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37769l lVar = C37769l.f100202a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        lVar.getClass();
        cVar.f100246b = lVar;
        cVar.f100245a = 19;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        blVar.f99328b = cVar2;
        blVar.f99327a |= 1;
        C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
        C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        ayVar.f99226a |= 4;
        ayVar.f99229d = 16;
        avVar.copyOnWrite();
        C37360ay ayVar2 = (C37360ay) avVar.instance;
        ayVar2.f99226a |= 2;
        ayVar2.f99228c = 16000;
        C37360ay ayVar3 = (C37360ay) avVar.build();
        bnVar.copyOnWrite();
        C37410bo boVar = (C37410bo) bnVar.instance;
        ayVar3.getClass();
        boVar.f99337f = ayVar3;
        boVar.f99332a |= 1;
        C39226b bVar = C39226b.TAG_SOUND_SEARCH_MUSIC_RECOGNITION;
        bnVar.copyOnWrite();
        C37410bo boVar2 = (C37410bo) bnVar.instance;
        boVar2.f99336e = Integer.valueOf(bVar.getNumber());
        boVar2.f99335d = 14;
        C37405bj b = bxVar.mo40943b((C37407bl) bkVar.build(), (C37410bo) bnVar.build());
        b.mo40941b().mo40939e().mo4106b(new C141630b(this), C60826bg.f164896a);
        C37402bg a = b.mo40940a();
        this.f384451h = a;
        this.f384450g = m229848d(a);
        C60856cj.m92904m(C47810es.m84978r(new C141631c(this)), this.f384448e);
    }
}
