package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9872c.C130190b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130288h;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128614c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128617f;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.ag */
/* compiled from: PG */
final class C130157ag implements C46852f {

    /* renamed from: a */
    private final C130169as f356855a;

    public C130157ag(C130169as asVar) {
        this.f356855a = asVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x d = C130158ah.f356856a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ResponseLayerFragment");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(38742)).mo56386p("Failed to provide a transcription response type.");
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        C130190b bVar = (C130190b) obj;
        C58976aa aaVar = C58975e.f156826a;
        C130169as asVar = this.f356855a;
        C69664n.m101061g(bVar, "type");
        C130190b bVar2 = C130190b.LIVE_TRANSCRIPTION;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            Fragment b = C130169as.m212507b(asVar.f356898a);
            if (b == null) {
                C130169as.m212508c(asVar.f356898a, C128617f.m209910b(asVar.f356899b));
            } else if (!(b instanceof C128614c)) {
                C130169as.m212509d(asVar.f356898a, C128617f.m209910b(asVar.f356899b), b);
            }
        } else if (ordinal == 1) {
            Fragment b2 = C130169as.m212507b(asVar.f356898a);
            if (b2 == null) {
                C130169as.m212508c(asVar.f356898a, C130288h.m212705a(asVar.f356899b));
            } else if (!(b2 instanceof C130288h)) {
                C130169as.m212509d(asVar.f356898a, C130288h.m212705a(asVar.f356899b), b2);
            }
        } else if (ordinal != 2) {
            throw new C69677g();
        } else {
            throw new IllegalArgumentException("Transcription type is required.");
        }
    }
}
