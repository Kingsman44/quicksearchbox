package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138589n;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138590o;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54248l;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.p4949a.C64369b;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.v */
/* compiled from: PG */
public final class C138669v implements C138635an {

    /* renamed from: a */
    private final Context f377169a;

    /* renamed from: b */
    private final C138631aj f377170b;

    /* renamed from: c */
    private final boolean f377171c;

    public C138669v(Context context, C138631aj ajVar, boolean z) {
        this.f377169a = context;
        this.f377170b = ajVar;
        this.f377171c = z;
    }

    /* renamed from: a */
    public final /* synthetic */ C138127i mo114421a(C138030av avVar) {
        return C138634am.m225153b(avVar);
    }

    /* renamed from: b */
    public final C138590o mo114422b(C138030av avVar) {
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PERSONAL)) {
            return C138589n.m225048c(avVar, R.string.ga_suggestion_history_deletion_title, this.f377170b.f377028c.mo114428b(avVar), this.f377170b.mo114438n());
        }
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        if ((aeVar.f142290a & 134217728) != 0) {
            return this.f377170b.mo114432d(avVar, R.string.ga_entity_suggestion_message);
        }
        if (new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS)) {
            return C138589n.m225046a(avVar, this.f377169a.getString(R.string.ga_trends_suggestion_message), this.f377170b.f377028c.mo114429c(R.string.ga_trends_learn_more_url, 106230), true);
        }
        return C138589n.m225047b(avVar, this.f377169a.getString(R.string.ga_entity_suggestion_message), true);
    }

    /* renamed from: c */
    public final /* synthetic */ C47388b mo114423c(C138030av avVar) {
        return C138634am.m225152a(this, avVar);
    }

    /* renamed from: d */
    public final String mo114424d(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        if ((aqVar.f142330a & 64) == 0) {
            return avVar.f375539b;
        }
        C54228aq aqVar2 = avVar.f375543g;
        if (aqVar2 == null) {
            aqVar2 = C54228aq.f142328w;
        }
        C54248l lVar = aqVar2.f142338j;
        if (lVar == null) {
            lVar = C54248l.f142431m;
        }
        return lVar.f142436d;
    }

    /* renamed from: e */
    public final void mo114425e(View view, C138030av avVar) {
        CharSequence charSequence;
        String str;
        C138658k a = ((CoreSuggestionView) view).mo17754z();
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        if ((aqVar.f142330a & 64) != 0) {
            C54228aq aqVar2 = avVar.f375543g;
            if (aqVar2 == null) {
                aqVar2 = C54228aq.f142328w;
            }
            C54248l lVar = aqVar2.f142338j;
            if (lVar == null) {
                lVar = C54248l.f142431m;
            }
            String str2 = lVar.f142435c;
            if (!TextUtils.isEmpty(str2)) {
                a.mo114453f(Html.fromHtml(str2), 1);
                if (this.f377171c) {
                    view.findViewById(R.id.googleapp_pixel_two_line_suggestion_min_height).setVisibility(4);
                }
            }
            String str3 = lVar.f142439g;
            if (C138631aj.m225137l(str3)) {
                a.f377140c.mo114436j(a.f377139b, a.f377145h, str3, C138631aj.m225131a(lVar.f142441i));
            }
        }
        if (!new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS)) {
            a.mo114451d(mo114424d(avVar));
        }
        C54228aq aqVar3 = avVar.f375543g;
        if (((aqVar3 == null ? C54228aq.f142328w : aqVar3).f142330a & 64) != 0) {
            if (aqVar3 == null) {
                aqVar3 = C54228aq.f142328w;
            }
            C54248l lVar2 = aqVar3.f142338j;
            if (lVar2 == null) {
                lVar2 = C54248l.f142431m;
            }
            charSequence = lVar2.f142440h;
        } else {
            charSequence = this.f377170b.mo114433e(avVar, false);
        }
        C138631aj.m225139p(a.f377141d, charSequence, 1);
        a.mo114452e(C138631aj.m225140q(avVar, true != new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_PERSONAL) ? 44 : 28));
        C54228aq aqVar4 = avVar.f375543g;
        if (((aqVar4 == null ? C54228aq.f142328w : aqVar4).f142330a & 64) != 0) {
            Object[] objArr = new Object[2];
            objArr[0] = avVar.f375539b;
            if (aqVar4 == null) {
                aqVar4 = C54228aq.f142328w;
            }
            C54248l lVar3 = aqVar4.f142338j;
            if (lVar3 == null) {
                lVar3 = C54248l.f142431m;
            }
            objArr[1] = Html.fromHtml(lVar3.f142435c);
            str = String.format("%s %s", objArr);
        } else {
            str = avVar.f375539b;
        }
        a.mo114449b(this.f377169a.getResources().getString(R.string.ga_query_suggestion_content_description, new Object[]{str}));
        C54228aq aqVar5 = avVar.f375543g;
        if (aqVar5 == null) {
            aqVar5 = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar5.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        a.mo114450c(avVar, aeVar.f142288B);
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo114426f() {
        return true;
    }
}
