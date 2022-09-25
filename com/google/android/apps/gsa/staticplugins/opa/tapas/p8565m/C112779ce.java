package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.support.p033v7.widget.C0673gh;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.alh;
import com.google.assistant.p3897e.p3921j.alj;
import com.google.common.base.C58890d;
import java.util.ArrayList;
import p3186j$.util.Comparator;
import p3186j$.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ce */
/* compiled from: PG */
public final class C112779ce extends C112920hk {

    /* renamed from: a */
    private final C112880fy f312596a;

    /* renamed from: b */
    private final int f312597b;

    /* renamed from: c */
    private final C86124t f312598c;

    public C112779ce(Context context, C112880fy fyVar, C86124t tVar, C104149a aVar) {
        this.f312596a = fyVar;
        this.f312598c = tVar;
        if (aVar.mo93970a()) {
            this.f312597b = C19391a.m36980a(context, R.attr.colorOutline);
        } else {
            this.f312597b = C1878d.m5128a(context, R.color.tapas_personalized_query_text_matching);
        }
    }

    /* renamed from: k */
    private static SpannableString m186639k(SpannableString spannableString, C90735as asVar) {
        return new SpannableString("...".concat(String.valueOf(String.valueOf(spannableString.subSequence(asVar.f253812a, spannableString.length())))));
    }

    /* renamed from: l */
    private final void m186640l(String str, String str2, C90735as asVar, SpannableString spannableString) {
        int length = str.length() - asVar.f253813b;
        if (str2.length() > length && C58890d.m90990e(str.substring(str.length() - length), str2.substring(str2.length() - length))) {
            spannableString.setSpan(new ForegroundColorSpan(this.f312597b), str2.length() - length, str2.length(), 17);
        }
    }

    /* renamed from: m */
    private final void m186641m(String str, String str2, C90735as asVar, SpannableString spannableString) {
        int i = asVar.f253812a;
        if (str2.length() > i && C58890d.m90990e(str.substring(0, i), str2.substring(0, i))) {
            spannableString.setSpan(new ForegroundColorSpan(this.f312597b), 0, i, 17);
        }
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 102229;
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        this.f312596a.mo99775c(ezVar.mo100199L(), esVar, ezVar, 16);
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        this.f312596a.mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C112919hj hjVar = (C112919hj) ghVar;
        String p = esVar.mo100118a().mo100033p();
        if (this.f312598c.mo79746e(C90029ch.f248253an)) {
            hjVar.f312954b.setMaxLines(2);
            hjVar.f312954b.addOnLayoutChangeListener(new C112778cd(this, p, ezVar));
        }
        String str = (String) ezVar.mo100223w().get();
        alf alf = (alf) ezVar.mo100190C().get();
        if (alf != null && (this.f312598c.mo79746e(C90029ch.f248255ap) || this.f312598c.mo79746e(C90029ch.f248253an))) {
            TextView textView = hjVar.f312954b;
            SpannableString spannableString = new SpannableString(alf.f135317b);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < alf.f135318c.size(); i++) {
                alh alh = (alh) alf.f135318c.get(i);
                alj alj = alh.f135324d;
                if (alj == null) {
                    alj = alj.f135325f;
                }
                if (alj.f135331e) {
                    arrayList.add(alh);
                }
            }
            List.EL.sort(arrayList, Comparator.CC.comparingInt(C112777cc.f312592a));
            int size = arrayList.size();
            if (size == 0) {
                spannableString.setSpan(new ForegroundColorSpan(this.f312597b), 0, spannableString.length(), 17);
            } else {
                spannableString.setSpan(new ForegroundColorSpan(this.f312597b), 0, Math.max(0, ((alh) arrayList.get(0)).f135322b), 17);
                for (int i2 = 1; i2 < size; i2++) {
                    alh alh2 = (alh) arrayList.get(i2);
                    spannableString.setSpan(new ForegroundColorSpan(this.f312597b), Math.min(((alh) arrayList.get(i2 - 1)).f135323c + 1, alh2.f135322b), Math.min(alh2.f135322b, spannableString.length()), 17);
                }
                int length = spannableString.length();
                spannableString.setSpan(new ForegroundColorSpan(this.f312597b), Math.min(((alh) arrayList.get(size - 1)).f135323c + 1, length), length, 17);
            }
            textView.setText(spannableString);
        } else if (!TextUtils.isEmpty(str)) {
            hjVar.f312954b.setText(Html.fromHtml(str));
        } else {
            hjVar.f312954b.setText(mo99738j(p, ezVar.mo100199L(), ezVar.mo100221u(), false));
        }
        hjVar.f312953a.setImageResource(R.drawable.quantum_ic_edit_grey600_24);
        hjVar.f312953a.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final SpannableString mo99738j(String str, String str2, Optional optional, boolean z) {
        int i;
        SpannableString spannableString = new SpannableString(str2);
        if (optional.isEmpty()) {
            return spannableString;
        }
        C90735as asVar = (C90735as) optional.get();
        if (str.length() - 1 > asVar.f253812a && str.length() >= (i = asVar.f253813b)) {
            if (asVar.f253812a == 0) {
                m186640l(str, str2, asVar, spannableString);
            } else if (i == str.length()) {
                m186641m(str, str2, asVar, spannableString);
                return (!this.f312598c.mo79746e(C90029ch.f248253an) || !z) ? spannableString : m186639k(spannableString, asVar);
            } else {
                if (this.f312598c.mo79746e(C90029ch.f248216aC)) {
                    m186641m(str, str2, asVar, spannableString);
                    m186640l(str, str2, asVar, spannableString);
                    if (this.f312598c.mo79746e(C90029ch.f248253an) && z) {
                        SpannableString k = m186639k(spannableString, asVar);
                        int length = str.length() - asVar.f253813b;
                        if (length < k.length()) {
                            k.setSpan(new ForegroundColorSpan(this.f312597b), k.length() - length, k.length(), 17);
                        }
                        return k;
                    }
                } else {
                    int length2 = str.length();
                    int length3 = str2.length();
                    int i2 = 1;
                    while (i2 < Math.min(length2, length3) && Character.toLowerCase(str.charAt(length2 - i2)) == Character.toLowerCase(str2.charAt(length3 - i2))) {
                        i2++;
                    }
                    int i3 = asVar.f253812a;
                    if (i3 < length3 && C58890d.m90990e(str.substring(0, i3), str2.substring(0, asVar.f253812a))) {
                        spannableString.setSpan(new ForegroundColorSpan(this.f312597b), 0, asVar.f253812a, 17);
                    }
                    int i4 = i2 - 1;
                    if (i4 != 0) {
                        int i5 = length3 - i4;
                        if (C58890d.m90990e(str.substring(length2 - i4), str2.substring(i5))) {
                            spannableString.setSpan(new ForegroundColorSpan(this.f312597b), i5, length3, 17);
                        }
                    }
                }
                return spannableString;
            }
        }
        return spannableString;
    }
}
