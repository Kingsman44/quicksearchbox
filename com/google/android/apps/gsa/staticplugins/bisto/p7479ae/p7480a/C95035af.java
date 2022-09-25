package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95838j;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.android.p10712d.C142383dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.af */
/* compiled from: PG */
final class C95035af extends C95037ah {

    /* renamed from: a */
    final /* synthetic */ C95038ai f265874a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95035af(C95038ai aiVar) {
        super(aiVar);
        this.f265874a = aiVar;
    }

    /* renamed from: a */
    public final void mo88946a(byte[] bArr) {
        this.f265874a.mo88957j(bArr);
    }

    /* renamed from: c */
    public final C37336c mo88949c(boolean z) {
        if (z) {
            C95038ai aiVar = this.f265874a;
            if (aiVar.f265887j == null) {
                aiVar.f265881d.mo88999f();
            }
        }
        C37336c cVar = this.f265874a.f265886i;
        cVar.getClass();
        C37336c g = C95038ai.m156961g(((C37334a) cVar).f99173a);
        this.f265874a.f265886i = g;
        return g;
    }

    /* renamed from: d */
    public final C60870cx mo88950d(boolean z) {
        if (z) {
            this.f265874a.f265881d.mo88997c();
            this.f265874a.mo88956i("CLOSING");
            return this.f265874a.f265885h.mo88950d(false);
        }
        this.f265874a.mo88956i("CLOSED");
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37516dw dwVar = C37516dw.CLOSED;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dwVar.f99638d);
        duVar.f99631a = 1;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }

    /* renamed from: e */
    public final void mo88948e() {
        C59104x c = C95038ai.f265878a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(18156)).mo56386p("Unexpected onVoiceStop in OPENING. Moving to CLOSED.");
        this.f265874a.mo88956i("CLOSED");
        if (this.f265874a.f265884g.isPresent()) {
            ((C95838j) this.f265874a.f265884g.get()).mo89812m();
        }
    }

    /* renamed from: f */
    public final String mo88951f() {
        return "OPENING";
    }

    /* renamed from: g */
    public final void mo88952g() {
        this.f265874a.f265881d.mo88997c();
        this.f265874a.mo88956i("CLOSING");
        if (this.f265874a.f265884g.isPresent()) {
            ((C95838j) this.f265874a.f265884g.get()).mo89813n();
        }
    }

    /* renamed from: b */
    public final void mo88947b(C142383dh dhVar) {
        C95038ai aiVar = this.f265874a;
        C37336c cVar = aiVar.f265886i;
        cVar.getClass();
        aiVar.mo88958k(dhVar, ((C37334a) cVar).f99173a);
        this.f265874a.mo88956i("ACTIVE");
    }
}
