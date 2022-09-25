package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.widget.TextView;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bu */
/* compiled from: PG */
final class C126812bu implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126804bo f349246a;

    public C126812bu(C126804bo boVar) {
        this.f349246a = boVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126804bo.f349196a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37185)).mo56386p("Transcription loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C119885dz dzVar = (C119885dz) obj;
        C59104x b = C126804bo.f349196a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) b).mo56372aa(37186)).mo56389s("onTranscriptionUpdate: '%s'", dzVar);
        TextView textView = (TextView) this.f349246a.f349216d.requireView().findViewById(R.id.assistant_roti_inputplate_transcription);
        if (!dzVar.f333868b.isEmpty()) {
            if (textView.getVisibility() == 8) {
                this.f349246a.mo107804j(8);
            }
            this.f349246a.f349220h.mo19974a(C37176a.f97330x);
            textView.setText(dzVar.f333868b);
            textView.setTextColor(this.f349246a.f349221i.getResources().getColor(R.color.assistant_roti_inputplate_text_color));
        }
    }
}
