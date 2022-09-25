package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8675e;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.u */
/* compiled from: PG */
public final /* synthetic */ class C132357u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132358v f361291a;

    /* renamed from: b */
    public final /* synthetic */ C8675e f361292b;

    /* renamed from: c */
    public final /* synthetic */ String f361293c;

    public /* synthetic */ C132357u(C132358v vVar, C8675e eVar, String str) {
        this.f361291a = vVar;
        this.f361292b = eVar;
        this.f361293c = str;
    }

    public final void onClick(View view) {
        C132358v vVar = this.f361291a;
        C8675e eVar = this.f361292b;
        String str = this.f361293c;
        C8628ag agVar = eVar.f29994c;
        if (agVar == null) {
            agVar = C8628ag.f29890g;
        }
        int a = C8627af.m23352a(agVar.f29896e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 2;
        String str2 = i != 1 ? i != 2 ? "other" : "female" : "male";
        vVar.f361302i.mo19974a(C37176a.f97029do);
        vVar.f361303j.mo50482c(vVar.f361295b).mo50508d(R.id.assistant_custodio_assistant_features_settings_fragment_to_dialog, C132287ei.m214954a(vVar.f361295b.getString(R.string.assistant_custodio_how_assistant_features_settings_works_dialog_title), C5114a.m13988b(Locale.getDefault(), vVar.f361295b.getString(true != vVar.f361304k ? R.string.assistant_custodio_how_assistant_features_settings_works_dialog_body_no_webview : R.string.assistant_custodio_how_assistant_features_settings_works_dialog_body), "GENDER", str2, "PERSON", str), vVar.f361295b.getString(R.string.assistant_custodio_how_it_works_dialog_primary_button_text), "action_dismiss_dialog", (String) null, (String) null));
    }
}
