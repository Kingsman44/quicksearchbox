package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2;

import android.content.Context;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88728ak;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.features.querybuilderv2.b */
/* compiled from: PG */
public final class C88668b extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f239733a;

    /* renamed from: b */
    private C41704d f239734b;

    /* renamed from: c */
    private final C88667a f239735c;

    /* renamed from: d */
    private int f239736d;

    /* renamed from: e */
    private int f239737e;

    public C88668b(Context context, C88667a aVar) {
        this.f239733a = context;
        this.f239735c = aVar;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 50;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return 32;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        mo82185d((C88715p) obj);
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f239733a.getResources().getString(R.string.accessibility_query_refinement, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hD */
    public final /* bridge */ /* synthetic */ void mo82217hD(Object obj) {
        mo82217hD((C88709j) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* renamed from: hI */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82331hI(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r3, com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an r4) {
        /*
            r2 = this;
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.querybuilderv2.QueryBuilderV2SuggestionView r4 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2.QueryBuilderV2SuggestionView) r4
            boolean r0 = r3.mo44265s()
            r1 = 0
            if (r0 == 0) goto L_0x002f
            com.google.at.h.d.a.aq r0 = r3.f108906A
            com.google.at.h.d.a.z r0 = r0.f142346r
            if (r0 != 0) goto L_0x0011
            com.google.at.h.d.a.z r0 = com.google.p4017at.p4060h.p4073d.p4074a.C54262z.f142473b
        L_0x0011:
            boolean r0 = r0.f142475a
            if (r0 == 0) goto L_0x002f
            android.text.Spanned r3 = r3.mo44268u()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "..."
            java.lang.String r3 = r0.concat(r3)
            android.text.SpannableStringBuilder r3 = android.text.SpannableStringBuilder.valueOf(r3)
            r4.mo82350d(r3, r1)
            goto L_0x0036
        L_0x002f:
            android.text.Spanned r3 = r3.mo44268u()
            r4.mo82350d(r3, r1)
        L_0x0036:
            int r3 = r2.f239736d
            android.widget.TextView r0 = r4.f239730a
            r0.setTextColor(r3)
            int r3 = r2.f239737e
            android.widget.TextView r0 = r4.f239730a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.RippleDrawable
            if (r0 == 0) goto L_0x005e
            android.widget.TextView r4 = r4.f239730a
            android.graphics.drawable.Drawable r4 = r4.getBackground()
            android.graphics.drawable.RippleDrawable r4 = (android.graphics.drawable.RippleDrawable) r4
            r0 = 2131436273(0x7f0b22f1, float:1.8494412E38)
            android.graphics.drawable.Drawable r4 = r4.findDrawableByLayerId(r0)
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            r4.setColor(r3)
            goto L_0x0073
        L_0x005e:
            android.widget.TextView r0 = r4.f239730a
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x0073
            android.widget.TextView r4 = r4.f239730a
            android.graphics.drawable.Drawable r4 = r4.getBackground()
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            r4.setColor(r3)
        L_0x0073:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.querybuilderv2.C88668b.mo82331hI(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, com.google.android.apps.gsa.searchbox.ui.suggestions.views.an):boolean");
    }

    /* renamed from: hJ */
    public final void mo82332hJ(C88709j jVar) {
        this.f239736d = jVar.f239882h;
        this.f239737e = jVar.f239883i;
        this.f240013s = jVar;
    }

    /* renamed from: k */
    public final void mo82352k(C88803an anVar, Suggestion suggestion) {
        String v = suggestion.mo44269v();
        int length = this.f239734b.mo44287a().length();
        this.f240009o.mo82430c(v);
        this.f239735c.mo82351a(this.f239734b.mo44287a().length() - length);
        if (length == 0) {
            C88667a aVar = this.f239735c;
            C89205j jVar = aVar.f239732b;
            if (jVar == null || jVar.mo83161a("ZERO_PREFIX_CHIPS_TAPPED") == 1) {
                C59104x c = C88667a.f239731a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "sb.u.QBLogWriter");
                ((C59052c) ((C59052c) c).mo56372aa(9877)).mo56386p("SearchboxStateAccessor is null");
                return;
            }
            aVar.f239732b.mo83171k("ZERO_PREFIX_CHIPS_TAPPED", 1);
        }
    }

    /* renamed from: l */
    public final void mo82353l(C88715p pVar) {
        super.mo82185d(pVar);
        this.f239734b = pVar.f239941m;
    }
}
