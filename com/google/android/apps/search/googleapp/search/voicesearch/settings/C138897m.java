package com.google.android.apps.search.googleapp.search.voicesearch.settings;

import android.view.View;
import android.widget.ArrayAdapter;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.tracing.C47580cd;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69540x;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.m */
/* compiled from: PG */
final class C138897m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C138899o f377799a;

    public C138897m(C138899o oVar) {
        this.f377799a = oVar;
    }

    public final void onClick(View view) {
        this.f377799a.f377811k.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C138899o oVar = this.f377799a;
        List list = oVar.f377814n;
        List<String> subList = list.subList(1, list.size());
        ArrayList arrayList = new ArrayList(C69540x.m100804k(subList, 10));
        for (String g : subList) {
            arrayList.add((String) C69505av.m100865g(oVar.f377812l, g));
        }
        oVar.f377815o.mo2532e(new ArrayAdapter(oVar.f377802b, R.layout.googleapp_voice_settings_languages_setting_primry_language_menu_item, arrayList));
        oVar.f377815o.f2361l = new C47580cd(oVar.f377807g, new C138898n(oVar));
        this.f377799a.f377815o.mo1576v();
    }
}
