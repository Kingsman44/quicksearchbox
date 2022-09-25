package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138580e;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.y */
/* compiled from: PG */
public final class C138672y implements C138635an {

    /* renamed from: a */
    private final boolean f377176a;

    /* renamed from: b */
    private final Context f377177b;

    public C138672y(Context context, boolean z) {
        this.f377177b = context;
        this.f377176a = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225047b(avVar, this.f377177b.getString(R.string.googleapp_lens_explainer), false);
    }

    /* renamed from: c */
    public final C47388b mo114423c(C138030av avVar) {
        return new C138580e(avVar);
    }

    /* renamed from: d */
    public final /* synthetic */ String mo114424d(C138030av avVar) {
        return avVar.f375539b;
    }

    /* renamed from: e */
    public final void mo114425e(View view, C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        C138631aj.m225139p(a.f377141d, aqVar.f142331b, 1);
        C138631aj.m225138o(a.f377143f, R.drawable.product_logo_lens_camera_color_24);
        a.f377143f.clearColorFilter();
        C138631aj.m225138o(a.f377144g, R.drawable.googleapp_query_builder_arrow);
        a.f377144g.clearColorFilter();
    }

    /* renamed from: f */
    public final boolean mo114426f() {
        return !this.f377176a;
    }
}
