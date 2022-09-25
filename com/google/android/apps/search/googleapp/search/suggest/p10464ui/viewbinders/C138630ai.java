package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.text.Html;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62963cj;
import com.google.protos.p4948ba.C64383m;
import com.google.protos.p4948ba.C64384n;
import com.google.protos.p4948ba.C64387q;
import com.google.protos.p4948ba.C64388r;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.ai */
/* compiled from: PG */
public final class C138630ai {

    /* renamed from: a */
    private static final C58495hd f377023a;

    /* renamed from: b */
    private final Context f377024b;

    /* renamed from: c */
    private final Map f377025c;

    static {
        C64383m mVar = C64383m.PQ_BASED;
        Integer valueOf = Integer.valueOf(R.string.ga_vasco_suggestion_message);
        C64383m mVar2 = C64383m.INTEREST_BASED;
        Integer valueOf2 = Integer.valueOf(R.string.ga_interest_based_suggestion_message);
        C64383m mVar3 = C64383m.ENGAGE_RETENTIVE;
        Integer valueOf3 = Integer.valueOf(R.string.ga_onboarding_message);
        C64383m mVar4 = C64383m.SIGNED_OUT_PQ_BASED;
        Integer valueOf4 = Integer.valueOf(R.string.googleapp_signed_out_pq_based_suggestion_message);
        C64383m mVar5 = C64383m.TRENDS;
        Integer valueOf5 = Integer.valueOf(R.string.ga_trends_suggestion_message);
        f377023a = C58495hd.m89905s(mVar, valueOf, mVar2, valueOf2, mVar3, valueOf3, mVar4, valueOf4, mVar5, valueOf5, C64383m.PERSONALIZED_TRENDS, valueOf5);
    }

    public C138630ai(Context context, C64388r rVar) {
        this.f377024b = context;
        EnumMap enumMap = new EnumMap(C64383m.class);
        for (C64387q qVar : rVar.f174634a) {
            C64383m a = C64383m.m96397a(qVar.f174630c);
            if (a == null) {
                a = C64383m.CATEGORY_UNSPECIFIED;
            }
            enumMap.put(a, qVar);
        }
        this.f377025c = enumMap;
    }

    /* renamed from: a */
    public static int m225126a(C64383m mVar, int i) {
        return ((Integer) Optional.ofNullable((Integer) f377023a.get(mVar)).orElse(Integer.valueOf(i))).intValue();
    }

    /* renamed from: b */
    public final String mo114428b(C138030av avVar) {
        Context context = this.f377024b;
        Object[] objArr = new Object[1];
        String escapeHtml = Html.escapeHtml(avVar.f375539b);
        if (escapeHtml.length() > 100) {
            escapeHtml = String.valueOf(escapeHtml.substring(0, 100)).concat("...");
        }
        objArr[0] = escapeHtml;
        return context.getString(R.string.ga_suggestion_history_deletion_message, objArr);
    }

    /* renamed from: c */
    public final String mo114429c(int i, int i2) {
        return this.f377024b.getResources().getString(i, new Object[]{Integer.valueOf(i2), Locale.getDefault().getLanguage()});
    }

    /* renamed from: d */
    public final String mo114430d(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        C64384n nVar = aeVar.f142313x;
        if (nVar == null) {
            nVar = C64384n.f174622b;
        }
        C64383m a = C64383m.m96397a(nVar.f174624a);
        if (a == null) {
            a = C64383m.CATEGORY_UNSPECIFIED;
        }
        Optional ofNullable = Optional.ofNullable((C64387q) this.f377025c.get(a));
        if (!ofNullable.isPresent()) {
            return null;
        }
        C64387q qVar = (C64387q) ofNullable.get();
        int i = true != new C62963cj(avVar.f375542e, C138030av.f375535f).contains(C64369b.SUBTYPE_TRENDS) ? R.string.ga_regular_query_learn_more_url : R.string.ga_trends_learn_more_url;
        int i2 = qVar.f174628a;
        if (i2 == 2) {
            return mo114429c(i, ((Integer) qVar.f174629b).intValue());
        }
        return mo114431e(i2 == 3 ? (String) qVar.f174629b : BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    public final String mo114431e(String str) {
        return this.f377024b.getResources().getString(R.string.googleapp_regular_query_learn_more_url_with_p_value, new Object[]{str, Locale.getDefault().getLanguage()});
    }
}
