package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.search.n.c.a.h.am */
/* compiled from: PG */
public final /* synthetic */ class C39548am implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104121a;

    /* renamed from: b */
    public final /* synthetic */ String f104122b;

    public /* synthetic */ C39548am(C39580br brVar, String str) {
        this.f104121a = brVar;
        this.f104122b = str;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C39580br brVar = this.f104121a;
        String str = this.f104122b;
        C59104x b = C39580br.f104168a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b).mo56372aa(53771)).mo56389s("handleStop hasn't been called. Wait for Soda to stop after sent end of audio due to: %s", str);
        if (brVar.f104183p.mo56113h()) {
            C59104x c = C39580br.f104168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) c).mo56372aa(53774)).mo56386p("sodaStopCompleter should not be present!");
        }
        brVar.f104183p = C58833ax.m90834k(cVar);
        C59104x b2 = C39580br.f104168a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b2).mo56372aa(53772)).mo56386p("After setting sodaStopCompleter for sendEndOfAudioAndWaitForSodaToStop");
        if (brVar.f104177j.get() == C39579bq.STARTED || brVar.f104177j.get() == C39579bq.INITIALIZED) {
            C59104x d = C39580br.f104168a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) d).mo56372aa(53773)).mo56389s("Sending END_OF_AUDIO due to %s", str);
            ByteBuffer byteBuffer = C39580br.f104169b;
            ((Soda) brVar.f104186s.mo56107c()).mo24337i(byteBuffer, 0, byteBuffer, 0);
            return String.format("Wait for Soda to stop after sent end of audio. %s", new Object[]{str});
        }
        throw new IllegalStateException(String.format("We send END_OF_AUDIO in a wrong state %s", new Object[]{((C39579bq) brVar.f104177j.get()).name()}));
    }
}
