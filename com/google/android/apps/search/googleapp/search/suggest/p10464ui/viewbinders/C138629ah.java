package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ah */
/* compiled from: PG */
public final class C138629ah implements C138635an {

    /* renamed from: a */
    private final Context f377021a;

    /* renamed from: b */
    private final C138631aj f377022b;

    public C138629ah(Context context, C138631aj ajVar) {
        this.f377021a = context;
        this.f377022b = ajVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        if ((aeVar.f142290a & 134217728) != 0) {
            return this.f377022b.mo114432d(avVar, R.string.ga_regular_query_suggestion_message);
        }
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS)) {
            return C138589n.m225046a(avVar, this.f377021a.getString(R.string.ga_trends_suggestion_message), this.f377022b.f377028c.mo114429c(R.string.ga_trends_learn_more_url, 106230), true);
        }
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_ONBOARDING)) {
            return C138589n.m225047b(avVar, this.f377021a.getString(R.string.ga_onboarding_message), true);
        }
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_VASCO)) {
            return C138589n.m225047b(avVar, this.f377021a.getString(R.string.ga_vasco_suggestion_message), true);
        }
        C138034az a = C138034az.m224336a(avVar.f375545i);
        if (a == null) {
            a = C138034az.NONE;
        }
        if (a == C138034az.SUGGEST_2G_LITE) {
            return C138589n.m225046a(avVar, this.f377021a.getString(R.string.googleapp_suggest_2g_suggestion_message), this.f377022b.f377028c.mo114429c(R.string.ga_regular_query_learn_more_url, 106230), true);
        }
        return C138589n.m225046a(avVar, this.f377021a.getString(R.string.ga_regular_query_suggestion_message), this.f377022b.f377028c.mo114429c(R.string.ga_regular_query_learn_more_url, 106230), true);
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
        a.mo114449b(this.f377021a.getResources().getString(R.string.ga_query_suggestion_content_description, new Object[]{avVar.f375539b}));
        C138631aj ajVar = this.f377022b;
        C138631aj.m225139p(a.f377141d, ajVar.mo114433e(avVar, ajVar.mo114437m(avVar)), 1);
        a.mo114453f(C138631aj.m225134h(avVar), 1);
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS)) {
            a.mo114452e(C138631aj.m225140q(avVar, 34));
        } else {
            a.mo114452e(C138631aj.m225140q(avVar, 44));
        }
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
        } else if (!new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS) && !C138631aj.m225136k(avVar)) {
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
