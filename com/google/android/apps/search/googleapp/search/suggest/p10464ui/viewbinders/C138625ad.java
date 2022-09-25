package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.search.googleapp.search.suggest.C138022an;
import com.google.android.apps.search.googleapp.search.suggest.C138025aq;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ad */
/* compiled from: PG */
public final class C138625ad implements C138635an {

    /* renamed from: a */
    private final Context f377012a;

    public C138625ad(Context context) {
        this.f377012a = context;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225047b(avVar, this.f377012a.getString(R.string.ga_regular_app_suggestion_message), false);
    }

    /* renamed from: c */
    public final C47388b mo114423c(C138030av avVar) {
        return C138631aj.m225133c(avVar, getClass().getSimpleName());
    }

    /* renamed from: d */
    public final /* synthetic */ String mo114424d(C138030av avVar) {
        return avVar.f375539b;
    }

    /* renamed from: e */
    public final void mo114425e(View view, C138030av avVar) {
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        C138631aj.m225139p(a.f377141d, avVar.f375539b, 1);
        C138025aq aqVar = avVar.f375548l;
        if (aqVar == null) {
            aqVar = C138025aq.f375512e;
        }
        C138022an anVar = aqVar.f375516c;
        if (anVar == null) {
            anVar = C138022an.f375501e;
        }
        Uri parse = Uri.parse(anVar.f375504b);
        ImageView imageView = a.f377143f;
        imageView.setImageURI(parse);
        imageView.setVisibility(0);
        a.f377143f.clearColorFilter();
        a.mo114449b(this.f377012a.getResources().getString(R.string.ga_on_device_app_suggestion_content_description, new Object[]{avVar.f375539b}));
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
