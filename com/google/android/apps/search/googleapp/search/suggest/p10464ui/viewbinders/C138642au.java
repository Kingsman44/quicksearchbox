package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.View;
import com.google.android.apps.search.googleapp.p10139b.C133489e;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.au */
/* compiled from: PG */
public final /* synthetic */ class C138642au implements C133489e {

    /* renamed from: a */
    public final /* synthetic */ C138644aw f377073a;

    /* renamed from: b */
    public final /* synthetic */ C138030av f377074b;

    /* renamed from: c */
    public final /* synthetic */ View f377075c;

    public /* synthetic */ C138642au(C138644aw awVar, C138030av avVar, View view) {
        this.f377073a = awVar;
        this.f377074b = avVar;
        this.f377075c = view;
    }

    /* renamed from: a */
    public final boolean mo111191a(View view) {
        C138590o oVar;
        C138644aw awVar = this.f377073a;
        C138030av avVar = this.f377074b;
        View view2 = this.f377075c;
        C138029au a = C138029au.m224331a(avVar.f375541d);
        if (a == null) {
            a = C138029au.QUERY;
        }
        if (a == C138029au.PERSONALIZED_QUERY || new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PERSONAL) || new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_ICING_SEARCH_HISTORY)) {
            oVar = C138589n.m225048c(avVar, R.string.ga_suggestion_history_deletion_title, awVar.f377080b.f377028c.mo114428b(avVar), awVar.f377080b.mo114438n());
        } else {
            oVar = C138589n.m225047b(avVar, awVar.f377079a.getString(R.string.ga_answers_suggestion_message), true);
        }
        C47393f.m84237h(oVar, view2);
        return true;
    }
}
