package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129331t;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130288h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.querytext.C130293m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils.C130308f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.ak */
/* compiled from: PG */
final class C130161ak implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C130158ah f356892a;

    public C130161ak(C130158ah ahVar) {
        this.f356892a = ahVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C130158ah ahVar = this.f356892a;
        boolean z = ((C130308f) bVar).f357179a;
        C129320i iVar = (C129320i) ahVar.f356866c.getChildFragmentManager().f634a.mo671c("SUGGESTION_FRAGMENT_TAG");
        if (iVar != null) {
            C129331t j = iVar.mo17754z();
            j.mo108971d(z);
            j.f355218q = true;
        }
        Fragment b = ahVar.f356866c.getChildFragmentManager().f634a.mo670b(R.id.assistant_response_layer_transcription_container);
        if (b != null) {
            C130293m b2 = ((C130288h) b).mo17754z();
            b2.mo109629c(true != z ? 8 : 0);
            b2.f357158j = true;
        }
        return C47392e.f123115a;
    }
}
