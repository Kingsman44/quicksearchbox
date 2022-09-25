package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8675e;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.du */
/* compiled from: PG */
public final /* synthetic */ class C132268du implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132271dx f361016a;

    /* renamed from: b */
    public final /* synthetic */ C8628ag f361017b;

    /* renamed from: c */
    public final /* synthetic */ C8675e f361018c;

    public /* synthetic */ C132268du(C132271dx dxVar, C8628ag agVar, C8675e eVar) {
        this.f361016a = dxVar;
        this.f361017b = agVar;
        this.f361018c = eVar;
    }

    public final void onClick(View view) {
        C132271dx dxVar = this.f361016a;
        C8628ag agVar = this.f361017b;
        C8675e eVar = this.f361018c;
        int a = C8627af.m23352a(agVar.f29896e);
        if (a == 0) {
            a = 1;
        }
        String g = C132271dx.m214937g(a);
        String str = agVar.f29893b;
        C8633al alVar = eVar.f29993b;
        if (alVar == null) {
            alVar = C8633al.f29901j;
        }
        boolean f = C132271dx.m214936f(alVar);
        dxVar.f361035k.mo19974a(C37176a.f97027dm);
        dxVar.f361036l.mo50482c(dxVar.f361026b).mo50508d(R.id.assistant_custodio_video_settings_fragment_to_dialog, C132287ei.m214954a(dxVar.f361026b.getString(R.string.assistant_custodio_how_video_setting_works_dialog_title), C5114a.m13988b(Locale.getDefault(), dxVar.f361026b.getString(true != f ? R.string.assistant_custodio_how_video_setting_works_dialog_body_no_providers : R.string.assistant_custodio_how_video_setting_works_dialog_body_with_youtube), "GENDER", g, "PERSON", str), dxVar.f361026b.getString(R.string.assistant_custodio_how_it_works_dialog_primary_button_text), "action_dismiss_dialog", (String) null, (String) null));
    }
}
