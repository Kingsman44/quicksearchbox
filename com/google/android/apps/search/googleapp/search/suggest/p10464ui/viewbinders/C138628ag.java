package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ag */
/* compiled from: PG */
public final class C138628ag implements C138635an {

    /* renamed from: a */
    private final Context f377019a;

    /* renamed from: b */
    private final C138631aj f377020b;

    public C138628ag(Context context, C138631aj ajVar) {
        this.f377019a = context;
        this.f377020b = ajVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225048c(avVar, R.string.ga_suggestion_history_deletion_title, this.f377020b.f377028c.mo114428b(avVar), this.f377020b.mo114438n());
    }

    /* renamed from: c */
    public final /* synthetic */ C47388b mo114423c(C138030av avVar) {
        return C138634am.m225152a(this, avVar);
    }

    /* renamed from: d */
    public final /* synthetic */ String mo114424d(C138030av avVar) {
        return avVar.f375539b;
    }

    /* renamed from: e */
    public final void mo114425e(View view, C138030av avVar) {
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        a.mo114449b(this.f377019a.getResources().getString(R.string.ga_query_suggestion_content_description, new Object[]{avVar.f375539b}));
        C138631aj ajVar = this.f377020b;
        C138631aj.m225139p(a.f377141d, ajVar.mo114433e(avVar, ajVar.mo114437m(avVar)), 1);
        a.mo114453f(C138631aj.m225134h(avVar), 1);
        a.mo114452e(C138631aj.m225140q(avVar, 28));
        String i = C138631aj.m225135i(avVar);
        if (C138631aj.m225137l(i)) {
            C54228aq aqVar = avVar.f375543g;
            if (aqVar == null) {
                aqVar = C54228aq.f142328w;
            }
            C54216ae aeVar = aqVar.f142334f;
            if (aeVar == null) {
                aeVar = C54216ae.f142285C;
            }
            a.mo114448a(i, C138631aj.m225131a(aeVar.f142301l));
        } else if (!C138631aj.m225136k(avVar)) {
            a.mo114451d(avVar.f375539b);
        }
        C54228aq aqVar2 = avVar.f375543g;
        if (aqVar2 == null) {
            aqVar2 = C54228aq.f142328w;
        }
        C54216ae aeVar2 = aqVar2.f142334f;
        if (aeVar2 == null) {
            aeVar2 = C54216ae.f142285C;
        }
        a.mo114450c(avVar, aeVar2.f142288B);
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
