package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22870f;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.bf */
/* compiled from: PG */
public final /* synthetic */ class C117989bf implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C118000bq f327484a;

    public /* synthetic */ C117989bf(C118000bq bqVar) {
        this.f327484a = bqVar;
    }

    public final void run() {
        C118000bq bqVar = this.f327484a;
        C117975as asVar = bqVar.f327498d;
        if (asVar != null) {
            asVar.f327439j.mo83702b(C89849ae.VOICE_SEARCH_AUTO_LIMITED_CONNECTIVITY);
            C117975as.f327431b = asVar.f327438i.mo26870b() > asVar.f327437h.getLong("CarTtsLastPlayedMs", -1) + TimeUnit.MINUTES.toMillis(asVar.f327432c.mo79743a(C90086ek.f250331bC));
            if (asVar.f327432c.mo79746e(C90086ek.f250260L) && C117975as.f327431b) {
                asVar.f327442m = true;
                String string = asVar.f327436g.getString(R.string.voice_search_limited_connectivity_tts);
                asVar.f327443n = true;
                new C90873ag(asVar.f327434e.mo77887a(asVar.f327441l, new TtsRequest(string, false), C117972ap.f327427a), asVar.f327433d, "Slow internet connection TTS", new C117973aq(asVar)).mo85223a(new C117974ar(asVar));
            } else if (asVar.f327432c.mo79746e(C90086ek.f250259K)) {
                asVar.f327442m = true;
                asVar.mo103491c();
            }
        }
        bqVar.f327496b.mo103499a();
    }
}
