package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88811av;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88814ay;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionActionView;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.am */
/* compiled from: PG */
public final class C88730am extends C88728ak implements C89199d {

    /* renamed from: a */
    private List f240018a;

    /* renamed from: b */
    private final Context f240019b;

    /* renamed from: c */
    private boolean f240020c;

    /* renamed from: d */
    private final int f240021d;

    public C88730am(Context context) {
        this.f240019b = context;
        this.f240021d = C1878d.m5128a(context, f240002h);
    }

    /* renamed from: n */
    private final boolean m143757n(Suggestion suggestion, C88814ay ayVar) {
        if (ayVar.f240462u) {
            List list = this.f240018a;
            if (list != null && !list.isEmpty()) {
                C88727aj.m143710x(suggestion, this.f240018a, (List) null, 3);
            }
            return false;
        }
        try {
            JSONArray jSONArray = new JSONObject(C88767al.m143947i(suggestion)).getJSONArray("sa");
            if (jSONArray != null) {
                if (jSONArray.length() != 0) {
                    if (ayVar.f240449c == null) {
                        ayVar.removeAllViews();
                        ayVar.f240449c = new RelativeLayout(ayVar.getContext());
                        ayVar.f240449c.setId(View.generateViewId());
                        ayVar.f240449c.addView(ayVar.f240452f);
                        ayVar.f240449c.addView(ayVar.f240455i);
                        ayVar.f240449c.addView(ayVar.f240454h);
                        ayVar.addView(ayVar.f240449c);
                        ayVar.addView(ayVar.f240450d);
                    }
                    if (ayVar.f240459r == null) {
                        ayVar.f240459r = new HorizontalScrollView(ayVar.getContext());
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams.addRule(3, ayVar.f240449c.getId());
                        ayVar.f240459r.setLayoutParams(layoutParams);
                        ayVar.f240459r.setHorizontalScrollBarEnabled(false);
                        ayVar.addView(ayVar.f240459r);
                    }
                    if (ayVar.f240460s == null) {
                        ayVar.f240460s = new LinearLayout(ayVar.getContext());
                        ayVar.f240460s.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        int dimensionPixelSize = ayVar.f240448b.getDimensionPixelSize(R.dimen.suggestion_divider_margin_start);
                        int dimensionPixelSize2 = ayVar.getContext().getResources().getDimensionPixelSize(R.dimen.universal_suggestion_default_padding);
                        ayVar.f240460s.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, ayVar.getContext().getResources().getDimensionPixelSize(R.dimen.universal_suggestion_right_padding), dimensionPixelSize2);
                        ayVar.f240460s.setGravity(16);
                        ayVar.f240460s.setOrientation(0);
                        ayVar.f240459r.addView(ayVar.f240460s);
                    }
                    if (ayVar.f240463v == null) {
                        ayVar.f240463v = new ArrayList();
                    }
                    this.f240018a = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("e");
                        if (i >= ayVar.f240463v.size()) {
                            SuggestionActionView suggestionActionView = (SuggestionActionView) LayoutInflater.from(ayVar.getContext()).inflate(R.layout.suggestion_action_view, ayVar.f240460s, false);
                            ayVar.f240463v.add(i, suggestionActionView);
                            ayVar.f240460s.addView(suggestionActionView, i);
                        }
                        SuggestionActionView suggestionActionView2 = (SuggestionActionView) ayVar.f240463v.get(i);
                        suggestionActionView2.setOnClickListener(new C88811av(ayVar, i, suggestionActionView2, optString));
                        suggestionActionView2.f240373c.setVisibility(8);
                        suggestionActionView2.setVisibility(0);
                        suggestionActionView2.f240371a.setText(jSONObject.optString(C42181t.f110467a));
                        this.f240018a.add(10);
                    }
                    C88727aj.m143710x(suggestion, this.f240018a, (List) null, 3);
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
    }

    /* renamed from: b */
    public final int mo82327b() {
        return -2;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 3;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return null;
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (suggestion.f108910k == 35 || suggestion.f108925z.contains(39) || suggestion.f108925z.contains(136)) {
            this.f240011q.mo82454C(suggestion, this);
        } else {
            this.f240011q.mo82469z(R.string.answers_suggestion_message, suggestion, true);
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a8 A[Catch:{ JSONException -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0441 A[Catch:{ JSONException -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0445 A[Catch:{ JSONException -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x044f A[Catch:{ JSONException -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0157 A[Catch:{ JSONException -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026f A[Catch:{ JSONException -> 0x0478 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0271 A[Catch:{ JSONException -> 0x0478 }] */
    /* renamed from: hI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82331hI(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r22, com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "c"
            java.lang.String r3 = "sa"
            java.lang.String r4 = "ab"
            int r5 = r1.f108910k
            r6 = 35
            if (r5 != r6) goto L_0x0013
            int r5 = f240005k
            goto L_0x0015
        L_0x0013:
            int r5 = f240006l
        L_0x0015:
            int r5 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj.m143699c(r1, r5)
            int r6 = r0.f240021d
            int r6 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj.m143696a(r1, r6)
            java.lang.String r7 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143947i(r22)
            long r8 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143942d(r22)
            java.lang.String r8 = java.lang.Long.toString(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            r10 = 0
            if (r9 != 0) goto L_0x049c
            r9 = r23
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.ay r9 = (com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88814ay) r9
            boolean r11 = r0.f240020c
            if (r11 == 0) goto L_0x004c
            com.google.common.b.gu r11 = r1.f108925z
            com.google.protos.ba.a.b r13 = com.google.protos.p4948ba.p4949a.C64369b.SUBTYPE_PERSONAL
            int r13 = r13.f174585kE
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r11 = r11.contains(r13)
            if (r11 == 0) goto L_0x004c
            r11 = 1
            goto L_0x004d
        L_0x004c:
            r11 = 0
        L_0x004d:
            r9.f240464w = r11
            com.google.android.apps.gsa.searchbox.ui.f r11 = r0.f240008n
            java.lang.String r13 = r9.f240458q
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r14 = r9.f240417n
            java.lang.String r14 = r14.mo44269v()
            boolean r13 = android.text.TextUtils.equals(r13, r14)
            if (r13 == 0) goto L_0x0080
            java.lang.String r13 = r9.f240457k
            boolean r13 = android.text.TextUtils.equals(r13, r8)
            if (r13 == 0) goto L_0x0080
            boolean r2 = r9.f240461t
            if (r2 == 0) goto L_0x0075
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r2 = r9.f240417n
            boolean r2 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak.m143730u(r2)
            if (r2 == 0) goto L_0x0075
            r2 = 1
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            r9.f240462u = r2
            if (r2 != 0) goto L_0x007d
            r9.mo82605y(r10)
        L_0x007d:
            r10 = 1
            goto L_0x047b
        L_0x0080:
            android.widget.LinearLayout r13 = r9.f240455i
            r13.removeAllViews()
            android.widget.ImageView r13 = r9.f240452f
            r14 = 0
            r13.setImageDrawable(r14)
            android.widget.ImageView r13 = r9.f240452f
            r15 = 4
            r13.setVisibility(r15)
            android.widget.ImageView r13 = r9.f240454h
            r15 = 8
            if (r13 == 0) goto L_0x009a
            r13.setVisibility(r15)
        L_0x009a:
            android.widget.TextView r13 = r9.f240456j
            if (r13 == 0) goto L_0x00a1
            r13.setVisibility(r15)
        L_0x00a1:
            java.util.List r13 = r9.f240463v
            if (r13 == 0) goto L_0x00bb
            java.util.Iterator r13 = r13.iterator()
        L_0x00a9:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x00bb
            java.lang.Object r16 = r13.next()
            r12 = r16
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.SuggestionActionView r12 = (com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.SuggestionActionView) r12
            r12.setVisibility(r15)
            goto L_0x00a9
        L_0x00bb:
            r9.f240462u = r10
            boolean r12 = r9.f240461t
            if (r12 == 0) goto L_0x00c4
            r9.mo82605y(r10)
        L_0x00c4:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0478 }
            r12.<init>(r7)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r7 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143946h(r12)     // Catch:{ JSONException -> 0x0478 }
            boolean r13 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r15 = "https:"
            if (r13 != 0) goto L_0x0108
            boolean r13 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0478 }
            if (r13 == 0) goto L_0x00de
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0108
        L_0x00de:
            boolean r5 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143951m(r7)     // Catch:{ JSONException -> 0x0478 }
            if (r5 != 0) goto L_0x00ec
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r7 = r15.concat(r5)     // Catch:{ JSONException -> 0x0478 }
        L_0x00ec:
            android.widget.ImageView r5 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            r9.mo82602B(r11, r5, r7)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r5 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r6 = 2131172866(0x7f071e02, float:1.7960159E38)
            int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ JSONException -> 0x0478 }
            android.widget.ImageView r6 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            r6.setPaddingRelative(r5, r5, r5, r5)     // Catch:{ JSONException -> 0x0478 }
            android.widget.ImageView r5 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            r5.setColorFilter(r14)     // Catch:{ JSONException -> 0x0478 }
            r9.mo82606z()     // Catch:{ JSONException -> 0x0478 }
            goto L_0x014c
        L_0x0108:
            android.content.Context r7 = r9.getContext()     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ JSONException -> 0x0478 }
            android.graphics.drawable.Drawable r5 = r7.getDrawable(r5)     // Catch:{ JSONException -> 0x0478 }
            if (r5 != 0) goto L_0x011a
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ JSONException -> 0x0478 }
            goto L_0x047b
        L_0x011a:
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.e r7 = r9.f240451e     // Catch:{ JSONException -> 0x0478 }
            r7.f240478b = r14     // Catch:{ JSONException -> 0x0478 }
            r7.mo82610c(r5, r14)     // Catch:{ JSONException -> 0x0478 }
            if (r6 == 0) goto L_0x012a
            android.widget.ImageView r5 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ JSONException -> 0x0478 }
            r5.setColorFilter(r6, r7)     // Catch:{ JSONException -> 0x0478 }
        L_0x012a:
            android.widget.ImageView r5 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            r5.setAdjustViewBounds(r10)     // Catch:{ JSONException -> 0x0478 }
            android.widget.ImageView r5 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ JSONException -> 0x0478 }
            r5.setScaleType(r6)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r5 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r6 = 2131172869(0x7f071e05, float:1.7960165E38)
            int r5 = r5.getDimensionPixelSize(r6)     // Catch:{ JSONException -> 0x0478 }
            android.widget.ImageView r6 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            r6.setPaddingRelative(r5, r5, r5, r5)     // Catch:{ JSONException -> 0x0478 }
            r9.mo82606z()     // Catch:{ JSONException -> 0x0478 }
            android.widget.ImageView r5 = r9.f240452f     // Catch:{ JSONException -> 0x0478 }
            r5.setVisibility(r10)     // Catch:{ JSONException -> 0x0478 }
        L_0x014c:
            org.json.JSONArray r5 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143949k(r12)     // Catch:{ JSONException -> 0x0478 }
            r6 = 0
        L_0x0151:
            int r7 = r5.length()     // Catch:{ JSONException -> 0x0478 }
            if (r6 >= r7) goto L_0x0292
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ JSONException -> 0x0478 }
            org.json.JSONObject r7 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143950l(r5, r6)     // Catch:{ JSONException -> 0x0478 }
            android.widget.LinearLayout r13 = new android.widget.LinearLayout     // Catch:{ JSONException -> 0x0478 }
            android.content.Context r14 = r9.getContext()     // Catch:{ JSONException -> 0x0478 }
            r13.<init>(r14)     // Catch:{ JSONException -> 0x0478 }
            r13.setOrientation(r10)     // Catch:{ JSONException -> 0x0478 }
            r14 = 1
            r13.setDuplicateParentStateEnabled(r14)     // Catch:{ JSONException -> 0x0478 }
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0478 }
            r17 = r5
            r5 = -1
            r10 = -2
            r14.<init>(r5, r10)     // Catch:{ JSONException -> 0x0478 }
            r13.setLayoutParams(r14)     // Catch:{ JSONException -> 0x0478 }
            android.widget.LinearLayout r5 = r9.f240455i     // Catch:{ JSONException -> 0x0478 }
            r5.addView(r13)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r5 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143945g(r7)     // Catch:{ JSONException -> 0x0478 }
            int r10 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143939a(r7)     // Catch:{ JSONException -> 0x0478 }
            int r14 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143940b(r7)     // Catch:{ JSONException -> 0x0478 }
            if (r5 == 0) goto L_0x0230
            android.widget.ImageView r1 = new android.widget.ImageView     // Catch:{ JSONException -> 0x0478 }
            android.content.Context r0 = r9.getContext()     // Catch:{ JSONException -> 0x0478 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0478 }
            r0 = 5
            r18 = r8
            if (r14 == r0) goto L_0x01d6
            android.content.res.Resources r0 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r14 = 2131172876(0x7f071e0c, float:1.796018E38)
            int r0 = r0.getDimensionPixelSize(r14)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r14 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r8 = 2131172871(0x7f071e07, float:1.796017E38)
            int r8 = r14.getDimensionPixelSize(r8)     // Catch:{ JSONException -> 0x0478 }
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0478 }
            r14.<init>(r0, r8)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r0 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r8 = 2131172874(0x7f071e0a, float:1.7960175E38)
            int r0 = r0.getDimensionPixelSize(r8)     // Catch:{ JSONException -> 0x0478 }
            if (r10 != 0) goto L_0x01c1
            r20 = r3
            r3 = 0
        L_0x01bf:
            r8 = 0
            goto L_0x01cd
        L_0x01c1:
            android.content.res.Resources r8 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r20 = r3
            r3 = 2131172873(0x7f071e09, float:1.7960173E38)
            int r3 = r8.getDimensionPixelSize(r3)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x01bf
        L_0x01cd:
            r14.setMargins(r3, r8, r0, r8)     // Catch:{ JSONException -> 0x0478 }
            r1.setLayoutParams(r14)     // Catch:{ JSONException -> 0x0478 }
            r19 = r2
            goto L_0x0222
        L_0x01d6:
            r20 = r3
            android.content.res.Resources r0 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r3 = 2131172877(0x7f071e0d, float:1.7960181E38)
            int r0 = r0.getDimensionPixelSize(r3)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r3 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r8 = 2131172872(0x7f071e08, float:1.7960171E38)
            int r3 = r3.getDimensionPixelSize(r8)     // Catch:{ JSONException -> 0x0478 }
            boolean r8 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148875g()     // Catch:{ JSONException -> 0x0478 }
            r14 = 1
            if (r14 == r8) goto L_0x01f4
            r8 = 1119092736(0x42b40000, float:90.0)
            goto L_0x01f6
        L_0x01f4:
            r8 = -1028390912(0xffffffffc2b40000, float:-90.0)
        L_0x01f6:
            r1.setRotation(r8)     // Catch:{ JSONException -> 0x0478 }
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams     // Catch:{ JSONException -> 0x0478 }
            r8.<init>(r0, r3)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r0 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r3 = 2131172874(0x7f071e0a, float:1.7960175E38)
            int r0 = r0.getDimensionPixelSize(r3)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r3 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r14 = 2131172873(0x7f071e09, float:1.7960173E38)
            int r3 = r3.getDimensionPixelSize(r14)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r14 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r19 = r2
            r2 = 2131172875(0x7f071e0b, float:1.7960177E38)
            int r2 = r14.getDimensionPixelSize(r2)     // Catch:{ JSONException -> 0x0478 }
            r14 = 0
            r8.setMargins(r3, r2, r0, r14)     // Catch:{ JSONException -> 0x0478 }
            r1.setLayoutParams(r8)     // Catch:{ JSONException -> 0x0478 }
        L_0x0222:
            boolean r0 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143951m(r5)     // Catch:{ JSONException -> 0x0478 }
            if (r0 != 0) goto L_0x022c
            java.lang.String r5 = r15.concat(r5)     // Catch:{ JSONException -> 0x0478 }
        L_0x022c:
            r9.mo82602B(r11, r1, r5)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0237
        L_0x0230:
            r19 = r2
            r20 = r3
            r18 = r8
            r1 = 0
        L_0x0237:
            java.util.List r0 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143948j(r7)     // Catch:{ JSONException -> 0x0478 }
            boolean r2 = r0.isEmpty()     // Catch:{ JSONException -> 0x0478 }
            if (r2 != 0) goto L_0x0272
            if (r10 == 0) goto L_0x0266
            int r2 = r0.size()     // Catch:{ JSONException -> 0x0478 }
            if (r10 < r2) goto L_0x024a
            goto L_0x0266
        L_0x024a:
            r2 = 0
            java.util.List r3 = r0.subList(r2, r10)     // Catch:{ JSONException -> 0x0478 }
            int r2 = r0.size()     // Catch:{ JSONException -> 0x0478 }
            java.util.List r0 = r0.subList(r10, r2)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r2 = r9.mo82604p(r3)     // Catch:{ JSONException -> 0x0478 }
            r13.addView(r2)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r0 = r9.mo82604p(r0)     // Catch:{ JSONException -> 0x0478 }
            r13.addView(r0)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x026d
        L_0x0266:
            android.widget.TextView r0 = r9.mo82604p(r0)     // Catch:{ JSONException -> 0x0478 }
            r13.addView(r0)     // Catch:{ JSONException -> 0x0478 }
        L_0x026d:
            if (r10 != 0) goto L_0x0271
            r10 = 0
            goto L_0x0272
        L_0x0271:
            r10 = 1
        L_0x0272:
            if (r1 == 0) goto L_0x0277
            r13.addView(r1, r10)     // Catch:{ JSONException -> 0x0478 }
        L_0x0277:
            java.lang.String r0 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143944f(r7)     // Catch:{ JSONException -> 0x0478 }
            if (r0 == 0) goto L_0x0280
            r13.setContentDescription(r0)     // Catch:{ JSONException -> 0x0478 }
        L_0x0280:
            int r6 = r6 + 1
            r10 = 0
            r14 = 0
            r0 = r21
            r1 = r22
            r5 = r17
            r8 = r18
            r2 = r19
            r3 = r20
            goto L_0x0151
        L_0x0292:
            r19 = r2
            r20 = r3
            r18 = r8
            android.widget.LinearLayout r0 = r9.f240455i     // Catch:{ JSONException -> 0x0478 }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ JSONException -> 0x0478 }
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0     // Catch:{ JSONException -> 0x0478 }
            boolean r1 = r12.has(r4)     // Catch:{ JSONException -> 0x0478 }
            r2 = 21
            if (r1 == 0) goto L_0x0441
            org.json.JSONObject r1 = r12.getJSONObject(r4)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r3 = "tp"
            java.lang.String r3 = r1.optString(r3)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r4 = "au"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r5 = "tt"
            java.lang.String r5 = r1.optString(r5)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r6 = "2"
            boolean r3 = r3.equals(r6)     // Catch:{ JSONException -> 0x0478 }
            if (r3 == 0) goto L_0x0352
            android.widget.TextView r3 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            if (r3 != 0) goto L_0x02e4
            android.widget.TextView r3 = new android.widget.TextView     // Catch:{ JSONException -> 0x0478 }
            android.content.Context r6 = r9.getContext()     // Catch:{ JSONException -> 0x0478 }
            r3.<init>(r6)     // Catch:{ JSONException -> 0x0478 }
            r9.f240456j = r3     // Catch:{ JSONException -> 0x0478 }
            android.widget.RelativeLayout r3 = r9.f240449c     // Catch:{ JSONException -> 0x0478 }
            if (r3 != 0) goto L_0x02df
            android.widget.TextView r3 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r9.addView(r3)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x02e4
        L_0x02df:
            android.widget.TextView r6 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r3.addView(r6)     // Catch:{ JSONException -> 0x0478 }
        L_0x02e4:
            android.widget.TextView r3 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r6 = 2131436793(0x7f0b24f9, float:1.8495466E38)
            r3.setId(r6)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r6 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r7 = 2131172884(0x7f071e14, float:1.7960195E38)
            int r6 = r6.getDimensionPixelSize(r7)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r7 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r8 = 2131172886(0x7f071e16, float:1.79602E38)
            int r7 = r7.getDimensionPixelSize(r8)     // Catch:{ JSONException -> 0x0478 }
            android.content.res.Resources r8 = r9.f240448b     // Catch:{ JSONException -> 0x0478 }
            r10 = 2131172885(0x7f071e15, float:1.7960197E38)
            int r8 = r8.getDimensionPixelSize(r10)     // Catch:{ JSONException -> 0x0478 }
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ JSONException -> 0x0478 }
            r11 = -2
            r10.<init>(r11, r6)     // Catch:{ JSONException -> 0x0478 }
            r6 = 0
            com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148873e(r10, r6, r6, r8, r6)     // Catch:{ JSONException -> 0x0478 }
            r10.addRule(r2)     // Catch:{ JSONException -> 0x0478 }
            r8 = 15
            r10.addRule(r8)     // Catch:{ JSONException -> 0x0478 }
            r3.setPaddingRelative(r7, r6, r7, r6)     // Catch:{ JSONException -> 0x0478 }
            r3.setDuplicateParentStateEnabled(r6)     // Catch:{ JSONException -> 0x0478 }
            r3.setLayoutParams(r10)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r3 = "t"
            java.lang.String r1 = r1.optString(r3)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r3 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r3.setText(r1)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r1 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            android.content.Context r3 = r9.getContext()     // Catch:{ JSONException -> 0x0478 }
            r6 = 2132151125(0x7f160b55, float:1.9944304E38)
            r1.setTextAppearance(r3, r6)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r1 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r3 = 2131231261(0x7f08021d, float:1.8078598E38)
            r1.setBackgroundResource(r3)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r1 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r3 = 17
            r1.setGravity(r3)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r1 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            r3 = 0
            r1.setVisibility(r3)     // Catch:{ JSONException -> 0x0478 }
            android.widget.TextView r1 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            goto L_0x03ed
        L_0x0352:
            java.lang.String r3 = "i"
            org.json.JSONObject r3 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x0478 }
            java.lang.String r6 = "d"
            java.lang.String r3 = r3.optString(r6)     // Catch:{ JSONException -> 0x0478 }
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0478 }
            if (r6 == 0) goto L_0x0369
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ JSONException -> 0x0478 }
        L_0x0366:
            r14 = 0
            goto L_0x0443
        L_0x0369:
            android.widget.ImageView r6 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            if (r6 != 0) goto L_0x0387
            android.widget.ImageView r6 = new android.widget.ImageView     // Catch:{ JSONException -> 0x0478 }
            android.content.Context r7 = r9.getContext()     // Catch:{ JSONException -> 0x0478 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0478 }
            r9.f240454h = r6     // Catch:{ JSONException -> 0x0478 }
            android.widget.RelativeLayout r6 = r9.f240449c     // Catch:{ JSONException -> 0x0478 }
            if (r6 != 0) goto L_0x0382
            android.widget.ImageView r6 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            r9.addView(r6)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0387
        L_0x0382:
            android.widget.ImageView r7 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            r6.addView(r7)     // Catch:{ JSONException -> 0x0478 }
        L_0x0387:
            android.widget.ImageView r6 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.e r7 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88814ay.m144191x(r6)     // Catch:{ JSONException -> 0x0478 }
            r9.f240453g = r7     // Catch:{ JSONException -> 0x0478 }
            r7 = 0
            r9.mo82601A(r6, r7)     // Catch:{ JSONException -> 0x0478 }
            boolean r6 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88767al.m143951m(r3)     // Catch:{ JSONException -> 0x0478 }
            if (r6 == 0) goto L_0x039f
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            r9.mo82602B(r11, r1, r3)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x03eb
        L_0x039f:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x043e }
            int r3 = com.google.protos.p4948ba.C64380j.m96396a(r3)     // Catch:{ NumberFormatException -> 0x043e }
            int r3 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj.m143694X(r3)     // Catch:{ NumberFormatException -> 0x043e }
            r6 = -1
            if (r3 != r6) goto L_0x03af
            goto L_0x0366
        L_0x03af:
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.e r6 = r9.f240453g     // Catch:{ NumberFormatException -> 0x043e }
            android.content.res.Resources r7 = r9.f240448b     // Catch:{ NumberFormatException -> 0x043e }
            android.graphics.drawable.Drawable r3 = r7.getDrawable(r3)     // Catch:{ NumberFormatException -> 0x043e }
            r7 = 0
            r6.f240478b = r7     // Catch:{ NumberFormatException -> 0x043f }
            r6.mo82610c(r3, r7)     // Catch:{ NumberFormatException -> 0x043f }
            android.widget.ImageView r3 = r9.f240454h     // Catch:{ NumberFormatException -> 0x043f }
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NumberFormatException -> 0x043f }
            r3.setScaleType(r6)     // Catch:{ NumberFormatException -> 0x043f }
            r3 = r19
            boolean r6 = r1.has(r3)     // Catch:{ NumberFormatException -> 0x043f }
            if (r6 == 0) goto L_0x03dc
            android.widget.ImageView r6 = r9.f240454h     // Catch:{ NumberFormatException -> 0x043f }
            java.lang.String r1 = r1.optString(r3)     // Catch:{ NumberFormatException -> 0x043f }
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ NumberFormatException -> 0x043f }
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ NumberFormatException -> 0x043f }
            r6.setColorFilter(r1, r3)     // Catch:{ NumberFormatException -> 0x043f }
            goto L_0x03e5
        L_0x03dc:
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ NumberFormatException -> 0x043f }
            int r3 = com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88814ay.f240447a     // Catch:{ NumberFormatException -> 0x043f }
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch:{ NumberFormatException -> 0x043f }
            r1.setColorFilter(r3, r6)     // Catch:{ NumberFormatException -> 0x043f }
        L_0x03e5:
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ NumberFormatException -> 0x043f }
            r3 = 0
            r1.setVisibility(r3)     // Catch:{ NumberFormatException -> 0x043f }
        L_0x03eb:
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
        L_0x03ed:
            r14 = r1
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0478 }
            if (r1 != 0) goto L_0x03f7
            r14.setContentDescription(r5)     // Catch:{ JSONException -> 0x0478 }
        L_0x03f7:
            boolean r1 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148875g()     // Catch:{ JSONException -> 0x0478 }
            r3 = 1
            if (r3 == r1) goto L_0x0400
            r1 = 0
            goto L_0x0402
        L_0x0400:
            r1 = 1127481344(0x43340000, float:180.0)
        L_0x0402:
            r14.setRotationY(r1)     // Catch:{ JSONException -> 0x0478 }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0478 }
            if (r1 != 0) goto L_0x0417
            r14.setClickable(r3)     // Catch:{ JSONException -> 0x0478 }
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.at r1 = new com.google.android.apps.gsa.searchbox.ui.suggestions.views.at     // Catch:{ JSONException -> 0x0478 }
            r1.<init>(r9, r4)     // Catch:{ JSONException -> 0x0478 }
            r14.setOnClickListener(r1)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0443
        L_0x0417:
            r1 = r20
            boolean r3 = r12.has(r1)     // Catch:{ JSONException -> 0x0478 }
            if (r3 == 0) goto L_0x0443
            org.json.JSONArray r1 = r12.getJSONArray(r1)     // Catch:{ JSONException -> 0x0478 }
            if (r1 == 0) goto L_0x0436
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0478 }
            if (r1 <= 0) goto L_0x0436
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            com.google.android.apps.gsa.searchbox.ui.suggestions.views.au r3 = new com.google.android.apps.gsa.searchbox.ui.suggestions.views.au     // Catch:{ JSONException -> 0x0478 }
            r3.<init>(r9)     // Catch:{ JSONException -> 0x0478 }
            r1.setOnClickListener(r3)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0443
        L_0x0436:
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            r3 = 8
            r1.setVisibility(r3)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0443
        L_0x043e:
            r7 = 0
        L_0x043f:
            goto L_0x0442
        L_0x0441:
            r7 = 0
        L_0x0442:
            r14 = r7
        L_0x0443:
            if (r14 == 0) goto L_0x044f
            int r1 = r14.getId()     // Catch:{ JSONException -> 0x0478 }
            r2 = 16
            r0.addRule(r2, r1)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0463
        L_0x044f:
            android.widget.ImageView r1 = r9.f240454h     // Catch:{ JSONException -> 0x0478 }
            if (r1 == 0) goto L_0x0458
            r3 = 4
            r1.setVisibility(r3)     // Catch:{ JSONException -> 0x0478 }
            goto L_0x0459
        L_0x0458:
            r3 = 4
        L_0x0459:
            android.widget.TextView r1 = r9.f240456j     // Catch:{ JSONException -> 0x0478 }
            if (r1 == 0) goto L_0x0460
            r1.setVisibility(r3)     // Catch:{ JSONException -> 0x0478 }
        L_0x0460:
            r0.addRule(r2)     // Catch:{ JSONException -> 0x0478 }
        L_0x0463:
            android.widget.LinearLayout r1 = r9.f240455i     // Catch:{ JSONException -> 0x0478 }
            r1.setLayoutParams(r0)     // Catch:{ JSONException -> 0x0478 }
            r0 = r18
            r9.f240457k = r0     // Catch:{ JSONException -> 0x0476 }
            com.google.android.libraries.searchbox.shared.suggestion.Suggestion r0 = r9.f240417n     // Catch:{ JSONException -> 0x0476 }
            java.lang.String r0 = r0.mo44269v()     // Catch:{ JSONException -> 0x0476 }
            r9.f240458q = r0     // Catch:{ JSONException -> 0x0476 }
            goto L_0x007d
        L_0x0476:
            r10 = 1
            goto L_0x0479
        L_0x0478:
            r10 = 0
        L_0x0479:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x047b:
            r0 = r21
            if (r10 == 0) goto L_0x049b
            com.google.android.apps.gsa.searchbox.ui.a.g r1 = r0.f240012r
            java.lang.String r2 = r22.mo44269v()
            r1.mo82401h(r2)
            boolean r1 = m143730u(r22)
            if (r1 == 0) goto L_0x049b
            r1 = r22
            boolean r1 = r0.m143757n(r1, r9)
            if (r1 == 0) goto L_0x049b
            r9.mo82603C()
            r1 = 1
            return r1
        L_0x049b:
            return r10
        L_0x049c:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88730am.mo82331hI(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, com.google.android.apps.gsa.searchbox.ui.suggestions.views.an):boolean");
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f240020c = jVar.f239864U;
        this.f240013s = jVar;
    }

    /* renamed from: hK */
    public final void mo82333hK(int i, View view, Suggestion suggestion, String str) {
        if (i == 7) {
            C88814ay ayVar = (C88814ay) view;
            if (!m143757n(suggestion, ayVar)) {
                i = 7;
            } else {
                ayVar.mo82603C();
                return;
            }
        }
        if (!TextUtils.isEmpty(str) && i == 1) {
            mo82472s(suggestion, view, str);
            InputMethodManager inputMethodManager = (InputMethodManager) this.f240019b.getSystemService("input_method");
            if (inputMethodManager != null && view != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo82334j() {
        return true;
    }

    /* renamed from: v */
    public final void mo82474v(int i, View view, Suggestion suggestion, String str) {
        if (!C58837ba.m90859h(str)) {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setPreferFirstRepeatedParameter(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseQuery(str);
            HashMap hashMap = new HashMap();
            for (String next : urlQuerySanitizer.getParameterSet()) {
                hashMap.put(next, urlQuerySanitizer.getValue(next));
            }
            C88727aj.m143708q(suggestion, hashMap);
            this.f240007m.mo44280t(suggestion, view, suggestion.mo44269v());
            if (i >= 0 && i < ((C58724pq) suggestion.f108921v).f156474d) {
                this.f240012r.mo82414u(i);
                return;
            }
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
    }
}
