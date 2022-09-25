package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54258v;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ao */
/* compiled from: PG */
public final class C138636ao implements C138635an {

    /* renamed from: a */
    private final Context f377036a;

    /* renamed from: b */
    private final C138633al f377037b;

    /* renamed from: c */
    private final C138631aj f377038c;

    public C138636ao(Context context, C138633al alVar, C138631aj ajVar) {
        this.f377036a = context;
        this.f377037b = alVar;
        this.f377038c = ajVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225047b(avVar, this.f377036a.getString(R.string.ga_regular_query_suggestion_message), true);
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
        String str;
        CharSequence charSequence;
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        if ((aqVar.f142330a & 128) != 0) {
            C54228aq aqVar2 = avVar.f375543g;
            if (aqVar2 == null) {
                aqVar2 = C54228aq.f142328w;
            }
            C54258v vVar = aqVar2.f142339k;
            if (vVar == null) {
                vVar = C54258v.f142462c;
            }
            str = "...".concat(String.valueOf(vVar.f142465b));
        } else {
            str = avVar.f375540c;
        }
        if (this.f377038c.mo114437m(avVar)) {
            charSequence = this.f377037b.mo114441b(str);
        } else {
            charSequence = C138633al.m225149a(str);
        }
        C138631aj.m225139p(a.f377141d, charSequence, 2);
        a.mo114452e(C138631aj.m225140q(avVar, 44));
        if (!C138631aj.m225136k(avVar)) {
            a.mo114451d(avVar.f375539b);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
