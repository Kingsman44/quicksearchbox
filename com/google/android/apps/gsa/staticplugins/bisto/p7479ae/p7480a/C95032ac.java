package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.ac */
/* compiled from: PG */
final class C95032ac extends C95034ae {

    /* renamed from: a */
    final /* synthetic */ C95038ai f265871a;

    public C95032ac(C95038ai aiVar) {
        this.f265871a = aiVar;
    }

    /* renamed from: a */
    public final void mo88946a(byte[] bArr) {
        this.f265871a.f265881d.mo88997c();
        C59104x c = C95038ai.f265878a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(18153)).mo56389s("onVoiceData in %s. Ignored.", "CLOSED");
    }

    /* renamed from: b */
    public final void mo88947b(C142383dh dhVar) {
        C37335b a = this.f265871a.f265880c.a(C37360ay.f99224l);
        this.f265871a.mo88958k(dhVar, a);
        this.f265871a.f265886i = C95038ai.m156961g(a);
        this.f265871a.mo88956i("CACHING");
    }

    /* renamed from: c */
    public final C37336c mo88949c(boolean z) {
        if (z) {
            C95038ai aiVar = this.f265871a;
            if (aiVar.f265887j == null) {
                aiVar.f265881d.mo88999f();
            }
        }
        C37335b a = this.f265871a.f265880c.a(C37360ay.f99224l);
        this.f265871a.mo88956i("OPENING");
        C37336c g = C95038ai.m156961g(a);
        this.f265871a.f265886i = g;
        return g;
    }

    /* renamed from: d */
    public final C60870cx mo88950d(boolean z) {
        C59104x d = C95038ai.f265878a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) d).mo56372aa(18148)).mo56386p("closeAudioStream in CLOSED state. Ignored.");
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37516dw dwVar = C37516dw.CLOSED;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dwVar.f99638d);
        duVar.f99631a = 1;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }

    /* renamed from: f */
    public final String mo88951f() {
        return "CLOSED";
    }

    /* renamed from: iu */
    public final void mo88953iu() {
        C95038ai aiVar = this.f265871a;
        C95047j jVar = aiVar.f265887j;
        if (jVar != null) {
            jVar.mo88963c();
        } else {
            C37336c cVar = aiVar.f265886i;
            if (cVar != null) {
                ((C37334a) cVar).f99173a.mo40891i();
            }
        }
        C95038ai aiVar2 = this.f265871a;
        aiVar2.f265886i = null;
        aiVar2.f265887j = null;
        aiVar2.f265884g = Optional.empty();
        C95373bx bxVar = this.f265871a.f265883f;
        C58976aa aaVar = C58975e.f156826a;
        bxVar.f266875e = 3;
    }
}
