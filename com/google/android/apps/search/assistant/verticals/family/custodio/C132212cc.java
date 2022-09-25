package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.p427am.p432b.p433a.C8627af;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8633al;
import com.google.p427am.p432b.p433a.C8641at;
import com.google.p427am.p432b.p433a.C8642au;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8692v;
import com.google.p427am.p432b.p433a.C8693w;
import com.google.protobuf.C62963cj;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cc */
/* compiled from: PG */
public final /* synthetic */ class C132212cc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132213cd f360865a;

    /* renamed from: b */
    public final /* synthetic */ C8628ag f360866b;

    /* renamed from: c */
    public final /* synthetic */ C8675e f360867c;

    public /* synthetic */ C132212cc(C132213cd cdVar, C8628ag agVar, C8675e eVar) {
        this.f360865a = cdVar;
        this.f360866b = agVar;
        this.f360867c = eVar;
    }

    public final void onClick(View view) {
        C132213cd cdVar = this.f360865a;
        C8628ag agVar = this.f360866b;
        C8675e eVar = this.f360867c;
        int a = C8627af.m23352a(agVar.f29896e);
        if (a == 0) {
            a = 1;
        }
        String f = C132213cd.m214856f(a);
        String str = agVar.f29893b;
        C8633al alVar = eVar.f29993b;
        if (alVar == null) {
            alVar = C8633al.f29901j;
        }
        C8642au auVar = alVar.f29904b;
        if (auVar == null) {
            auVar = C8642au.f29924f;
        }
        HashSet hashSet = new HashSet(new C62963cj(auVar.f29928d, C8642au.f29923e));
        C8693w wVar = alVar.f29903a;
        if (wVar == null) {
            wVar = C8693w.f30027f;
        }
        boolean z = hashSet.contains(C8641at.YOUTUBE) || hashSet.contains(C8641at.YOUTUBE_KIDS) || hashSet.contains(C8641at.YOUTUBE_TV) || new HashSet(new C62963cj(wVar.f30031d, C8693w.f30026e)).contains(C8692v.YOUTUBE);
        cdVar.f360878k.mo19974a(C37176a.f97026dl);
        cdVar.f360879l.mo50482c(cdVar.f360869b).mo50508d(R.id.assistant_custodio_music_settings_fragment_to_dialog, C132287ei.m214954a(cdVar.f360869b.getString(R.string.assistant_custodio_how_music_setting_works_dialog_title), C5114a.m13988b(Locale.getDefault(), cdVar.f360869b.getString(true != z ? R.string.assistant_custodio_how_music_setting_works_dialog_body_no_youtube : R.string.assistant_custodio_how_music_setting_works_dialog_body_with_youtube), "GENDER", f, "PERSON", str), cdVar.f360869b.getString(R.string.assistant_custodio_how_it_works_dialog_primary_button_text), "action_dismiss_dialog", (String) null, (String) null));
    }
}
