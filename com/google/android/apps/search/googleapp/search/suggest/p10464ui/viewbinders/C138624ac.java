package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138582g;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54250n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ac */
/* compiled from: PG */
public final class C138624ac implements C138635an {

    /* renamed from: a */
    private final Context f377009a;

    /* renamed from: b */
    private final C138631aj f377010b;

    /* renamed from: c */
    private final boolean f377011c;

    public C138624ac(Context context, C138631aj ajVar, boolean z) {
        this.f377009a = context;
        this.f377010b = ajVar;
        this.f377011c = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225047b(avVar, this.f377009a.getString(R.string.ga_regular_url_suggestion_message), true);
    }

    /* renamed from: c */
    public final C47388b mo114423c(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54250n nVar = aqVar.f142337i;
        if (nVar == null) {
            nVar = C54250n.f142445d;
        }
        return new C138582g(Uri.parse(nVar.f142448b), avVar);
    }

    /* renamed from: d */
    public final /* synthetic */ String mo114424d(C138030av avVar) {
        return avVar.f375539b;
    }

    /* renamed from: e */
    public final void mo114425e(View view, C138030av avVar) {
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        C138631aj ajVar = this.f377010b;
        CharSequence f = ajVar.mo114434f(avVar, ajVar.mo114437m(avVar));
        C138631aj ajVar2 = this.f377010b;
        CharSequence g = ajVar2.mo114435g(avVar, ajVar2.mo114437m(avVar));
        if (TextUtils.isEmpty(f)) {
            C138631aj.m225139p(a.f377141d, g, 3);
        } else {
            C138631aj.m225139p(a.f377141d, f, 3);
            a.mo114453f(g, 3);
            if (this.f377011c) {
                view.findViewById(R.id.googleapp_pixel_two_line_suggestion_min_height).setVisibility(4);
            }
        }
        a.mo114452e(C138631aj.m225140q(avVar, 8));
        a.mo114449b(this.f377009a.getResources().getString(R.string.ga_nav_suggestion_content_description, new Object[]{avVar.f375539b}));
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
