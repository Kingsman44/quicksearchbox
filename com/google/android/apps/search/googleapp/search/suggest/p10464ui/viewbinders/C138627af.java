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

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.af */
/* compiled from: PG */
public final class C138627af implements C138635an {

    /* renamed from: a */
    private final Context f377015a;

    /* renamed from: b */
    private final C138631aj f377016b;

    /* renamed from: c */
    private final boolean f377017c;

    /* renamed from: d */
    private final boolean f377018d;

    public C138627af(Context context, C138631aj ajVar, boolean z, boolean z2) {
        this.f377015a = context;
        this.f377016b = ajVar;
        this.f377017c = z;
        this.f377018d = z2;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        return C138589n.m225048c(avVar, R.string.ga_remove_pnav_title, this.f377015a.getString(R.string.ga_remove_url_history_message), this.f377016b.mo114438n());
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
        CharSequence f = this.f377016b.mo114434f(avVar, this.f377017c);
        CharSequence g = this.f377016b.mo114435g(avVar, this.f377017c);
        if (TextUtils.isEmpty(f)) {
            C138631aj.m225139p(a.f377141d, g, 3);
        } else {
            C138631aj.m225139p(a.f377141d, f, 3);
            a.mo114453f(g, 3);
            if (this.f377018d) {
                view.findViewById(R.id.googleapp_pixel_two_line_suggestion_min_height).setVisibility(4);
            }
        }
        a.mo114452e(C138631aj.m225140q(avVar, 8));
        a.mo114449b(this.f377015a.getResources().getString(R.string.ga_nav_suggestion_content_description, new Object[]{avVar.f375539b}));
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
