package com.google.android.apps.search.podcasts.language;

import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.search.podcasts.language.p10577a.C140519d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.play.unison.binding.C31978d;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.s */
/* compiled from: PG */
public final class C140554s extends C31978d {

    /* renamed from: a */
    private final C47400m f381723a;

    /* renamed from: b */
    private final CheckBox f381724b;

    public C140554s(View view, C47400m mVar) {
        super(view);
        this.f381723a = mVar;
        View findViewById = view.findViewById(R.id.podcasts_language_item_checkbox);
        C69664n.m101060f(findViewById, "view.findViewById(R.id.p…s_language_item_checkbox)");
        this.f381724b = (CheckBox) findViewById;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo37735a(Object obj, C31989o oVar) {
        String str;
        C140519d dVar = (C140519d) obj;
        C69664n.m101061g(dVar, "viewData");
        this.f381724b.setChecked(dVar.f381657b);
        this.f381724b.setText(dVar.f381656a.f142798b);
        this.f381724b.setEnabled(dVar.f381658c);
        this.f85977f.setEnabled(dVar.f381658c);
        String str2 = dVar.f381656a.f142797a;
        C69664n.m101060f(str2, "this.languageOption.languageCode");
        C47400m mVar = this.f381723a;
        View view = this.f85977f;
        if (str2 == null) {
            C69664n.m101065k("languageCode");
            str = null;
        } else {
            str = str2;
        }
        mVar.mo51252a(view, new C140556u(str));
        this.f381723a.mo51252a(this.f381724b, new C140556u(str2));
    }
}
