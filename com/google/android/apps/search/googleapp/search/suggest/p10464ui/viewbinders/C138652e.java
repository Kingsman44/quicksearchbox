package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.text.Html;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54244h;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.e */
/* compiled from: PG */
public final class C138652e implements C138635an {

    /* renamed from: a */
    private final Context f377119a;

    /* renamed from: b */
    private final C138631aj f377120b;

    public C138652e(Context context, C138631aj ajVar) {
        this.f377119a = context;
        this.f377120b = ajVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225046a(avVar, this.f377119a.getString(R.string.ga_regular_query_suggestion_message), this.f377120b.f377028c.mo114429c(R.string.ga_regular_query_learn_more_url, 106230), false);
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
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        if ((aqVar.f142330a & 512) != 0) {
            C54244h hVar = aqVar.f142341m;
            if (hVar == null) {
                hVar = C54244h.f142422d;
            }
            String str2 = hVar.f142425b;
            C54244h hVar2 = aqVar.f142341m;
            if (hVar2 == null) {
                hVar2 = C54244h.f142422d;
            }
            str = String.format("%s = %s", new Object[]{str2, hVar2.f142426c}).replace("�", "&nbsp;");
        } else {
            str = avVar.f375540c;
        }
        C138631aj.m225139p(a.f377141d, Html.fromHtml(str), 1);
        a.mo114452e(C138631aj.m225140q(avVar, 44));
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
