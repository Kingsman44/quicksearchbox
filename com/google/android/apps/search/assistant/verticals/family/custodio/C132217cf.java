package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cf */
/* compiled from: PG */
public final /* synthetic */ class C132217cf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132220ci f360882a;

    /* renamed from: b */
    public final /* synthetic */ C8628ag f360883b;

    public /* synthetic */ C132217cf(C132220ci ciVar, C8628ag agVar) {
        this.f360882a = ciVar;
        this.f360883b = agVar;
    }

    public final void onClick(View view) {
        C132220ci ciVar = this.f360882a;
        C8628ag agVar = this.f360883b;
        int a = C8627af.m23352a(agVar.f29896e);
        if (a == 0) {
            a = 1;
        }
        String str = agVar.f29893b;
        ciVar.f360897j.mo19974a(C37176a.f97028dn);
        ciVar.f360896i.mo50482c(ciVar.f360889b).mo50508d(R.id.assistant_custodio_news_and_podcasts_settings_fragment_to_dialog, C132287ei.m214954a(ciVar.f360889b.getString(R.string.assistant_custodio_news_and_podcasts_how_it_works_dialog_title), C5114a.m13988b(Locale.getDefault(), ciVar.f360889b.getString(R.string.assistant_custodio_news_and_podcasts_how_it_works_dialog_body), "GENDER", C132220ci.m214867d(a), "PERSON", str), ciVar.f360889b.getString(R.string.assistant_custodio_how_it_works_dialog_primary_button_text), "action_dismiss_dialog", (String) null, (String) null));
    }
}
