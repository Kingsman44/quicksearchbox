package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.google.android.apps.search.assistant.verticals.family.custodio.C132246dc;
import com.google.android.googlequicksearchbox.R;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.db */
/* compiled from: PG */
public final /* synthetic */ class C132245db implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132246dc.C132247a f360943a;

    /* renamed from: b */
    public final /* synthetic */ C8675e f360944b;

    /* renamed from: c */
    public final /* synthetic */ C8628ag f360945c;

    public /* synthetic */ C132245db(C132246dc.C132247a aVar, C8675e eVar, C8628ag agVar) {
        this.f360943a = aVar;
        this.f360944b = eVar;
        this.f360945c = agVar;
    }

    public final void onClick(View view) {
        C132246dc.C132247a aVar = this.f360943a;
        C8675e eVar = this.f360944b;
        C8628ag agVar = this.f360945c;
        if (C132246dc.this.f360949d.getBoolean("finish_flow_on_settings_page", false)) {
            if (!eVar.f29996e) {
                C132246dc.this.mo110564a(agVar.f29893b);
            } else {
                C132246dc.this.f360947b.finish();
            }
        } else if (eVar.f29996e || eVar.f29995d) {
            C132246dc dcVar = C132246dc.this;
            dcVar.f360950e.mo50482c(dcVar.f360948c).mo50508d(R.id.assistant_voice_match_deeplinking_fragment, C132246dc.this.f360949d);
        } else {
            C132246dc.this.mo110564a(agVar.f29893b);
        }
    }
}
