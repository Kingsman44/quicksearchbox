package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95838j;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.p2907ab.C37334a;
import com.google.android.libraries.search.p2904c.p2907ab.C37336c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.ad */
/* compiled from: PG */
final class C95033ad extends C95037ah {

    /* renamed from: a */
    final /* synthetic */ C95038ai f265872a;

    /* renamed from: d */
    private SettableFuture f265873d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95033ad(C95038ai aiVar) {
        super(aiVar);
        this.f265872a = aiVar;
    }

    /* renamed from: a */
    public final void mo88946a(byte[] bArr) {
        this.f265872a.mo88957j(bArr);
    }

    /* renamed from: c */
    public final C37336c mo88949c(boolean z) {
        C59104x c = C95038ai.f265878a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(18149)).mo56386p("getWriteableAudioBufferData in CLOSING");
        C37336c cVar = this.f265872a.f265886i;
        cVar.getClass();
        C37336c f = C95038ai.m156960f(((C37334a) cVar).f99173a);
        this.f265872a.f265886i = f;
        return f;
    }

    /* renamed from: d */
    public final C60870cx mo88950d(boolean z) {
        if (z) {
            this.f265872a.f265881d.mo88997c();
        }
        SettableFuture settableFuture = this.f265873d;
        if (settableFuture != null) {
            return settableFuture;
        }
        C59104x c = C95038ai.f265878a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
        ((C59052c) ((C59052c) c).mo56372aa(18150)).mo56386p("ClosingMicState. closeAudioStream: closingFuture is null. Must not happen.");
        if (this.f265872a.f265884g.isPresent()) {
            ((C95838j) this.f265872a.f265884g.get()).mo89807h();
        }
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37512ds dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dsVar.f99628K);
        duVar.f99631a = 2;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }

    /* renamed from: e */
    public final void mo88948e() {
        SettableFuture settableFuture = this.f265873d;
        if (settableFuture != null) {
            C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
            C37516dw dwVar = C37516dw.CLOSED;
            dtVar.copyOnWrite();
            C37514du duVar = (C37514du) dtVar.instance;
            duVar.f99632b = Integer.valueOf(dwVar.f99638d);
            duVar.f99631a = 1;
            settableFuture.mo57356n((C37514du) dtVar.build());
        } else {
            C59104x c = C95038ai.f265878a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
            ((C59052c) ((C59052c) c).mo56372aa(18152)).mo56386p("Null closingFuture when onVoiceStop called in ClosingMicState.");
            if (this.f265872a.f265884g.isPresent()) {
                ((C95838j) this.f265872a.f265884g.get()).mo89807h();
            }
        }
        this.f265872a.mo88956i("CLOSED");
    }

    /* renamed from: f */
    public final String mo88951f() {
        return "CLOSING";
    }

    /* renamed from: g */
    public final void mo88952g() {
        this.f265872a.f265881d.mo88997c();
        this.f265872a.mo88956i("CLOSED");
        if (this.f265872a.f265884g.isPresent()) {
            ((C95838j) this.f265872a.f265884g.get()).mo89808i();
        }
    }

    /* renamed from: h */
    public final void mo88954h() {
        super.mo88954h();
        SettableFuture settableFuture = this.f265873d;
        if (settableFuture != null && !settableFuture.isDone()) {
            SettableFuture settableFuture2 = this.f265873d;
            C59104x c = C95038ai.f265878a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VoiceInputManager");
            ((C59052c) ((C59052c) c).mo56372aa(18151)).mo56386p("closingFuture is not done when exit ClosingMicState.");
            C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
            C37512ds dsVar = C37512ds.UNKNOWN_CLOSING_FAILURE;
            dtVar.copyOnWrite();
            C37514du duVar = (C37514du) dtVar.instance;
            duVar.f99632b = Integer.valueOf(dsVar.f99628K);
            duVar.f99631a = 2;
            settableFuture2.mo57356n((C37514du) dtVar.build());
            if (this.f265872a.f265884g.isPresent()) {
                ((C95838j) this.f265872a.f265884g.get()).mo89807h();
            }
        }
        this.f265873d = null;
    }

    /* renamed from: iu */
    public final void mo88953iu() {
        super.mo88953iu();
        this.f265873d = new SettableFuture();
    }
}
