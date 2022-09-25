package com.google.android.apps.search.googleapp.search.voicesearch.settings.p10476a;

import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.settings.a.h */
/* compiled from: PG */
public final /* synthetic */ class C138874h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138880n f377748a;

    public /* synthetic */ C138874h(C138880n nVar) {
        this.f377748a = nVar;
    }

    public final Object apply(Object obj) {
        C138880n nVar = this.f377748a;
        if (((String) obj).equals("handsFreeOnly")) {
            return nVar.f377759e.getString(R.string.googleapp_voice_settings_spoken_results_value_hands_free_only);
        }
        return nVar.f377759e.getString(R.string.googleapp_voice_settings_spoken_results_value_all_voices);
    }
}
