package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ci */
/* compiled from: PG */
final class C126829ci implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126824cf f349287a;

    public C126829ci(C126824cf cfVar) {
        this.f349287a = cfVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126824cf.f349260a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37205)).mo56386p("Transcription loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        int following;
        C119885dz dzVar = (C119885dz) obj;
        C59104x b = C126824cf.f349260a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
        ((C59052c) ((C59052c) b).mo56372aa(37206)).mo56389s("onTranscriptionUpdate: %s", dzVar);
        TextView textView = (TextView) this.f349287a.f349263d.requireView().findViewById(R.id.assistant_roti_intent_api_text);
        if (!dzVar.f333868b.isEmpty()) {
            C126824cf cfVar = this.f349287a;
            if (!cfVar.f349278s) {
                cfVar.f349266g.mo19974a(C37176a.f97330x);
                this.f349287a.f349278s = true;
            }
            C126840ct ctVar = this.f349287a.f349279t;
            ctVar.getClass();
            int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
            int i = 0;
            if (ctVar.f349308e != width) {
                ctVar.f349307d = 0;
                ctVar.f349308e = width;
            }
            C126840ct ctVar2 = this.f349287a.f349279t;
            ctVar2.getClass();
            String concat = String.valueOf(dzVar.f333868b).concat(BuildConfig.FLAVOR);
            int i2 = ctVar2.f349307d;
            if (i2 > concat.length()) {
                ctVar2.f349307d = 0;
                i2 = 0;
            }
            if (ctVar2.mo107827a(concat.substring(i2)).getLineCount() > 2) {
                ctVar2.f349305b.setText(concat);
                while (ctVar2.mo107827a("…".concat(String.valueOf(concat.substring(ctVar2.f349307d).trim()))).getLineCount() > 2 && (following = ctVar2.f349305b.following(ctVar2.f349307d)) != -1) {
                    ctVar2.f349307d = following;
                }
            }
            ctVar2.f349304a.clear();
            ctVar2.f349304a.clearSpans();
            if (ctVar2.f349307d > 0) {
                ctVar2.f349304a.append("…");
            }
            ctVar2.f349304a.append(concat.substring(ctVar2.f349307d).trim());
            if (ctVar2.f349304a.length() > 0) {
                i = ctVar2.f349304a.length();
            }
            if (i != ctVar2.f349304a.length()) {
                SpannableStringBuilder spannableStringBuilder = ctVar2.f349304a;
                spannableStringBuilder.setSpan(ctVar2.f349306c, i, spannableStringBuilder.length(), 33);
            }
            C126840ct ctVar3 = this.f349287a.f349279t;
            ctVar3.getClass();
            textView.setText(new SpannedString(ctVar3.f349304a));
        }
    }
}
