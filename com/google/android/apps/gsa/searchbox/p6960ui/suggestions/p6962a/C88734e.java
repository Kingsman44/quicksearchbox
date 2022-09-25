package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87749cd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87752cg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87753ch;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87847fu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88693b;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88838v;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88840x;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionActionView;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionViewWithActions;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.e */
/* compiled from: PG */
public abstract class C88734e extends C88728ak implements C89199d {

    /* renamed from: a */
    public static final Pattern f240029a = Pattern.compile(";package=([\\S]+);end");

    /* renamed from: b */
    public boolean f240030b;

    /* renamed from: c */
    private final Context f240031c;

    /* renamed from: d */
    private C88710k f240032d;

    /* renamed from: e */
    private long f240033e;

    /* renamed from: f */
    private final C88693b f240034f;

    /* renamed from: t */
    private final int f240035t;

    /* renamed from: u */
    private final int f240036u;

    public C88734e(Context context, C88693b bVar) {
        this.f240031c = context;
        this.f240034f = bVar;
        this.f240035t = C1878d.m5128a(context, f240002h);
        this.f240036u = C1878d.m5128a(context, f240004j);
    }

    /* renamed from: q */
    public static void m143780q(SuggestionViewWithActions suggestionViewWithActions, int i) {
        SuggestionActionView p = suggestionViewWithActions.mo82573p(i, "search://contactName");
        p.f240373c.mo82561d(R.drawable.quantum_ic_search_googblue_24, 0, false);
        p.mo82555a(R.string.contact_action_label_search, (String) null);
    }

    /* renamed from: x */
    private final void m143781x(Suggestion suggestion, C88803an anVar, boolean z) {
        SuggestionViewWithActions suggestionViewWithActions = (SuggestionViewWithActions) anVar;
        suggestionViewWithActions.mo82576y();
        String o = mo82445o(suggestion);
        if (TextUtils.isEmpty(o)) {
            m143780q(suggestionViewWithActions, 0);
            suggestionViewWithActions.mo82575x(z);
            mo82476r(suggestion, C58485gu.m89846n(8), C58485gu.m89846n(BuildConfig.FLAVOR), 1);
            return;
        }
        C87847fu fuVar = (C87847fu) C87848fv.f237681d.createBuilder();
        fuVar.copyOnWrite();
        C87848fv fvVar = (C87848fv) fuVar.instance;
        fvVar.f237683a |= 2;
        fvVar.f237685c = 168764118;
        C87752cg cgVar = (C87752cg) C87753ch.f237506e.createBuilder();
        cgVar.copyOnWrite();
        C87753ch chVar = (C87753ch) cgVar.instance;
        o.getClass();
        chVar.f237508a |= 2;
        chVar.f237510c = o;
        String v = suggestion.mo44269v();
        cgVar.copyOnWrite();
        C87753ch chVar2 = (C87753ch) cgVar.instance;
        v.getClass();
        chVar2.f237508a = 1 | chVar2.f237508a;
        chVar2.f237509b = v;
        Long n = mo82444n(suggestion);
        if (n != null) {
            long longValue = n.longValue();
            cgVar.copyOnWrite();
            C87753ch chVar3 = (C87753ch) cgVar.instance;
            chVar3.f237508a = 8 | chVar3.f237508a;
            chVar3.f237511d = longValue;
        }
        fuVar.mo58885m(C87749cd.f237500a, (C87753ch) cgVar.build());
        this.f240007m.mo82300A((C87848fv) fuVar.build(), new C88733d(suggestion, suggestionViewWithActions, this, this.f240034f));
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        if (C41669ai.f108960i.equals(suggestion.f108915p)) {
            return this.f240013s.f239885k != null ? 43 : 4;
        }
        return 13;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240031c.getResources().getString(R.string.on_device_contact_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        this.f240011q.mo82469z(R.string.contact_suggestion_message, suggestion, false);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        Spanned m = C88727aj.m143704m(suggestion.mo44268u(), suggestion, this.f240032d);
        if (m != null) {
            anVar.mo82587v(m);
        }
        Spanned m2 = mo82443m(suggestion, this.f240032d);
        if (TextUtils.isEmpty(m2)) {
            m2 = SpannedString.valueOf(this.f240031c.getResources().getString(R.string.contact_annotation));
        }
        anVar.mo82588w(m2);
        boolean z = false;
        if (anVar instanceof C88838v) {
            C88838v vVar = (C88838v) anVar;
            String e = C41670aj.m73072e(suggestion);
            int dimensionPixelSize = this.f240031c.getResources().getDimensionPixelSize(R.dimen.pixel_contact_icon_padding);
            if (TextUtils.isEmpty(e) || "android.resource://android/drawable/ic_contact_picture".equals(e)) {
                String v = suggestion.mo44269v();
                if (vVar.f240507e != null) {
                    vVar.f240513k = true;
                }
                C88840x xVar = new C88840x(vVar.f240503a.getResources());
                xVar.mo82621b();
                xVar.mo82620a(v);
                int i = dimensionPixelSize + dimensionPixelSize;
                int i2 = vVar.f240509g - i;
                vVar.f240511i = i2;
                int i3 = vVar.f240510h - i;
                vVar.f240512j = i3;
                if (i2 > 0 && i3 > 0) {
                    if (!(xVar.f240527c && xVar.f240525a == i2 && xVar.f240526b == i3)) {
                        z = true;
                    }
                    xVar.f240525a = i2;
                    xVar.f240526b = i3;
                    xVar.f240527c = true;
                    if (z) {
                        xVar.invalidateSelf();
                    }
                }
                vVar.f240506d.setImageDrawable(xVar);
            } else {
                vVar.mo82618n(e, true, dimensionPixelSize, this.f240008n);
            }
            return true;
        }
        if (C41670aj.m73086s(suggestion)) {
            anVar.mo82349c(0).mo82561d(C41670aj.m73068a(suggestion), this.f240035t, false);
        } else {
            String e2 = C41670aj.m73072e(suggestion);
            if (TextUtils.isEmpty(e2) || "android.resource://android/drawable/ic_contact_picture".equals(e2)) {
                anVar.mo82349c(0).mo82566i(suggestion.mo44269v());
            } else {
                anVar.mo82349c(0).mo82565h(e2, "android.resource://android/drawable/ic_contact_picture", this.f240008n, true, ImageView.ScaleType.CENTER_CROP);
            }
        }
        if (anVar.mo82584r() == 12 || anVar.mo82584r() == 13) {
            anVar.mo82349c(-1).mo82562e(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, this.f240036u, this.f240031c.getResources().getString(R.string.accessibility_expand));
            if (m143730u(suggestion)) {
                m143781x(suggestion, anVar, false);
            }
        }
        return true;
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240030b = jVar.f239881g;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i != -2) {
            int i2 = ((C58724pq) suggestion.f108921v).f156474d;
            if (i >= 0 && i < i2 && !TextUtils.isEmpty(str)) {
                this.f240012r.mo82414u(i);
                mo82472s(suggestion, view, str);
            }
        }
    }

    /* renamed from: l */
    public final void mo82353l(C88715p pVar) {
        super.mo82185d(pVar);
        this.f240032d = pVar.f239938j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract Spanned mo82443m(Suggestion suggestion, C88710k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Long mo82444n(Suggestion suggestion);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract String mo82445o(Suggestion suggestion);

    /* renamed from: p */
    public final void mo82471p(int i, C88803an anVar, Suggestion suggestion) {
        if (i == -1) {
            this.f240033e = System.currentTimeMillis();
            m143781x(suggestion, anVar, true);
        }
    }

    /* renamed from: r */
    public final void mo82476r(Suggestion suggestion, List list, List list2, int i) {
        this.f240034f.mo82395a((int) (System.currentTimeMillis() - this.f240033e));
        C88727aj.m143710x(suggestion, list, list2, i - 1);
    }
}
