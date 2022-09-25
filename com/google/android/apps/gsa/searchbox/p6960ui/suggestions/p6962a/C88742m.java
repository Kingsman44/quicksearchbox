package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88693b;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionActionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionViewWithActions;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p7019bc.C89407a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.suggestion.C41661aa;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.aou;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.m */
/* compiled from: PG */
public final class C88742m extends C88728ak implements C89199d {

    /* renamed from: b */
    private static final C59071e f240063b = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.a.m");

    /* renamed from: a */
    C88750u f240064a;

    /* renamed from: c */
    private final Context f240065c;

    /* renamed from: d */
    private final C88693b f240066d;

    /* renamed from: e */
    private final C21370a f240067e;

    /* renamed from: f */
    private List f240068f;

    /* renamed from: t */
    private final int f240069t;

    /* renamed from: u */
    private C88745p f240070u = null;

    public C88742m(Context context, C88693b bVar, C21370a aVar) {
        this.f240065c = context;
        this.f240066d = bVar;
        this.f240067e = aVar;
        this.f240069t = C1878d.m5128a(context, f240002h);
        C1878d.m5128a(context, f240004j);
    }

    /* renamed from: n */
    private final void m143846n(Suggestion suggestion, C88803an anVar, String str, String str2) {
        if (C41670aj.m73086s(suggestion)) {
            anVar.mo82349c(0).mo82561d(C41670aj.m73068a(suggestion), this.f240069t, false);
            return;
        }
        anVar.mo82349c(0).mo82564g(str, str2, this.f240008n);
    }

    /* renamed from: o */
    private final void m143847o(C88803an anVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Drawable d = C90772bp.m148296d(this.f240065c, Uri.parse(str));
                if (d != null) {
                    anVar.mo82548k(d);
                }
            } catch (IOException e) {
                C59104x c = f240063b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AppResultSuggRenderer");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10005)).mo56386p("Can not load app icon drawable");
            }
        }
    }

    /* renamed from: q */
    private final void m143848q(Suggestion suggestion, C88803an anVar) {
        CharSequence g;
        if (C41670aj.m73069b(suggestion) > 0 && (g = C89407a.m145424g(this.f240065c, C41670aj.m73069b(suggestion))) != null) {
            anVar.mo82554hR(SpannedString.valueOf(g));
        }
    }

    /* renamed from: r */
    private final void m143849r(C88803an anVar, String str, String str2, int i, int i2) {
        C88803an anVar2 = anVar;
        anVar.mo82349c(0).mo82568k(str, this.f240008n, "#".concat(String.valueOf(Integer.toHexString(this.f240069t))), ImageView.ScaleType.CENTER_CROP, 5, i, i2, this.f240069t, 0);
        m143847o(anVar, str2);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 89;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        boolean z = !TextUtils.isEmpty(C41670aj.m73079l(suggestion));
        if (!suggestion.f108925z.contains(269)) {
            return (z || C41670aj.m73070c(suggestion) > 0) ? 39 : 38;
        }
        C41661aa aaVar = eVar.f109013g;
        if (aaVar == null) {
            aaVar = C41661aa.f108926g;
        }
        return (z || (aaVar.f108928a & 4) != 0) ? 13 : 12;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        String f;
        int a = aou.m92448a(suggestion.f108909j);
        if ((a == 11 || a == 12) && (f = C89235z.m145134f(suggestion, this.f240065c)) != null) {
            return this.f240065c.getResources().getString(R.string.app_result_suggestion_content_description, new Object[]{suggestion.f108908i, f});
        }
        return this.f240065c.getResources().getString(R.string.on_device_app_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (suggestion.f108925z.contains(269)) {
            if (this.f240064a == null) {
                this.f240064a = new C88750u(this.f240065c, this.f240007m);
            }
            this.f240064a.mo82479a(suggestion, anVar, 269);
            return true;
        }
        if (suggestion.f108925z.contains(235)) {
            String f = C89235z.m145134f(suggestion, this.f240065c);
            Intent c = C89235z.m145131c(suggestion, this.f240065c);
            if (!TextUtils.isEmpty(f) && c != null) {
                this.f240011q.mo82455D(f, c);
                return true;
            }
        }
        this.f240011q.mo82469z(R.string.regular_app_result_suggestion_message, (Suggestion) null, false);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(SpannedString.valueOf(C89235z.m145132d(suggestion)));
        String l = C41670aj.m73079l(suggestion);
        if (!TextUtils.isEmpty(l)) {
            anVar.mo82588w(SpannedString.valueOf(l));
        }
        String e = C41670aj.m73072e(suggestion);
        String n = C41670aj.m73081n(suggestion);
        C58485gu guVar = suggestion.f108925z;
        if (guVar.contains(238) || guVar.contains(216)) {
            m143847o(anVar, n);
            m143848q(suggestion, anVar);
            if (TextUtils.isEmpty(e) || "android.resource://android/drawable/ic_contact_picture".equals(e)) {
                anVar.mo82349c(0).mo82566i(suggestion.mo44269v());
                return true;
            }
            anVar.mo82349c(0).mo82565h(e, n, this.f240008n, true, ImageView.ScaleType.CENTER_CROP);
            return true;
        } else if (guVar.contains(218)) {
            m143848q(suggestion, anVar);
            m143846n(suggestion, anVar, e, n);
            return true;
        } else if (guVar.contains(235)) {
            m143848q(suggestion, anVar);
            if (C41670aj.m73070c(suggestion) > 0) {
                String d = C89407a.m145421d(C41670aj.m73070c(suggestion));
                if (TextUtils.isEmpty(l)) {
                    anVar.mo82588w(SpannedString.valueOf(d.toString()));
                } else {
                    String valueOf = String.valueOf(d);
                    String string = this.f240065c.getResources().getString(R.string.line_two_text_separator);
                    anVar.mo82588w(SpannedString.valueOf(valueOf + string + l));
                }
            }
            if (C88727aj.m143685M(e)) {
                m143849r(anVar, e, n, R.drawable.quantum_ic_play_circle_filled_white_24, R.drawable.quantum_ic_play_circle_filled_white_18);
                return true;
            }
            m143846n(suggestion, anVar, e, n);
            return true;
        } else if (guVar.contains(269)) {
            C41661aa aaVar = suggestion.f108907B.f109013g;
            if (aaVar == null) {
                aaVar = C41661aa.f108926g;
            }
            if ((aaVar.f108928a & 4) != 0) {
                anVar.mo82588w(SpannedString.valueOf(aaVar.f108929b));
            }
            if (C88727aj.m143685M(e)) {
                m143849r(anVar, e, n, 0, R.drawable.quantum_ic_place_white_18);
                return true;
            }
            m143846n(suggestion, anVar, e, n);
            return true;
        } else {
            m143846n(suggestion, anVar, e, n);
            return true;
        }
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240068f = jVar.f239894t;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (suggestion.f108925z.contains(269) && i != -2) {
            int i2 = ((C58724pq) suggestion.f108921v).f156474d;
            if (i >= 0 && i < i2 && !TextUtils.isEmpty(str)) {
                this.f240012r.mo82414u(i);
                mo82472s(suggestion, view, str);
            }
        }
    }

    /* renamed from: p */
    public final void mo82471p(int i, C88803an anVar, Suggestion suggestion) {
        String str;
        Suggestion suggestion2 = suggestion;
        if (suggestion2.f108925z.contains(269) && i == -1 && suggestion2.f108925z.contains(269)) {
            SuggestionViewWithActions suggestionViewWithActions = (SuggestionViewWithActions) anVar;
            if (this.f240070u == null) {
                this.f240070u = new C88745p(this.f240065c.getPackageManager(), this.f240066d, this.f240068f, this.f240067e);
            }
            C88745p pVar = this.f240070u;
            long c = pVar.f240076d.mo26871c();
            ArrayList arrayList = new ArrayList();
            Iterator it = pVar.f240075c.iterator();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    int intValue = num.intValue();
                    if (intValue != 1) {
                        if (intValue == 7) {
                            C41679e eVar = suggestion2.f108907B;
                            C41661aa aaVar = eVar.f109013g;
                            if (aaVar == null) {
                                aaVar = C41661aa.f108926g;
                            }
                            if ((8 & aaVar.f108928a) != 0) {
                                C41661aa aaVar2 = eVar.f109013g;
                                if (((aaVar2 == null ? C41661aa.f108926g : aaVar2).f108928a & 16) != 0) {
                                    Object[] objArr = new Object[2];
                                    objArr[0] = (aaVar2 == null ? C41661aa.f108926g : aaVar2).f108930c;
                                    if (aaVar2 == null) {
                                        aaVar2 = C41661aa.f108926g;
                                    }
                                    objArr[1] = aaVar2.f108931d;
                                    str = String.format("https://www.google.com/maps/dir/?api=1&destination=%s,%s", objArr);
                                    SuggestionActionView p = suggestionViewWithActions.mo82573p(i2, str);
                                    p.mo82555a(R.string.contact_action_label_navigate, (String) null);
                                    p.f240373c.mo82563f(C88727aj.m143703h(pVar.f240073a, C89235z.m73089I(suggestion)), -1);
                                }
                            }
                            str = C41670aj.m73074g(suggestion);
                            SuggestionActionView p2 = suggestionViewWithActions.mo82573p(i2, str);
                            p2.mo82555a(R.string.contact_action_label_navigate, (String) null);
                            p2.f240373c.mo82563f(C88727aj.m143703h(pVar.f240073a, C89235z.m73089I(suggestion)), -1);
                        } else if (intValue == 8) {
                            SuggestionActionView p3 = suggestionViewWithActions.mo82573p(i2, "search://placeName");
                            p3.f240373c.mo82561d(R.drawable.quantum_ic_search_googblue_24, 0, false);
                            p3.mo82555a(R.string.contact_action_label_search, (String) null);
                        } else if (intValue != 9) {
                            C58976aa aaVar3 = C58975e.f156826a;
                        } else {
                            C41679e eVar2 = suggestion2.f108907B;
                            if ((eVar2.f109007a & 64) != 0) {
                                C41661aa aaVar4 = eVar2.f109013g;
                                if (aaVar4 == null) {
                                    aaVar4 = C41661aa.f108926g;
                                }
                                if ((aaVar4.f108928a & 128) != 0) {
                                    SuggestionActionView p4 = suggestionViewWithActions.mo82573p(i2, aaVar4.f108933f);
                                    p4.mo82555a(R.string.contact_action_label_web, (String) null);
                                    p4.f240373c.mo82561d(R.drawable.quantum_ic_public_googblue_24, 0, true);
                                }
                            }
                            z = false;
                        }
                        i2++;
                        arrayList.add(num);
                    } else {
                        C41679e eVar3 = suggestion2.f108907B;
                        if ((eVar3.f109007a & 64) != 0) {
                            C41661aa aaVar5 = eVar3.f109013g;
                            if (aaVar5 == null) {
                                aaVar5 = C41661aa.f108926g;
                            }
                            if ((aaVar5.f108928a & 64) != 0) {
                                SuggestionActionView p5 = suggestionViewWithActions.mo82573p(i2, String.format("tel:%s", new Object[]{aaVar5.f108932e}));
                                p5.mo82555a(R.string.contact_action_label_call, (String) null);
                                p5.f240373c.mo82561d(R.drawable.quantum_ic_call_googblue_24, 0, true);
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                    }
                    i2++;
                    arrayList.add(num);
                } else {
                    pVar.f240074b.mo82395a((int) (pVar.f240076d.mo26871c() - c));
                    C88727aj.m143710x(suggestion2, arrayList, (List) null, 1);
                    suggestionViewWithActions.mo82575x(true);
                    return;
                }
            }
        }
    }
}
