package com.google.android.apps.gsa.nowoverlayservice;

import android.app.PendingIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.search.shared.overlay.SearchOverlayLayout;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87621a;
import com.google.android.apps.gsa.search.shared.overlay.p6933a.C87625ad;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87779dg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87781di;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88787u;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.p7148ui.C90638an;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.googleapp.p10516t.p10521e.C139701a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.be */
/* compiled from: PG */
public final class C83471be extends C87625ad {

    /* renamed from: a */
    public RemoteViews f227578a;

    /* renamed from: b */
    public int f227579b;

    /* renamed from: be */
    private final C83476bj f227580be;

    /* renamed from: c */
    public int f227581c;

    /* renamed from: d */
    public int f227582d;

    /* renamed from: e */
    public int f227583e;

    /* renamed from: f */
    public int f227584f;

    /* renamed from: g */
    public int f227585g;

    /* renamed from: h */
    public int f227586h;

    /* renamed from: i */
    public boolean f227587i;

    /* renamed from: j */
    public boolean f227588j;

    /* renamed from: k */
    public boolean f227589k;

    /* renamed from: l */
    public int f227590l;

    /* renamed from: m */
    public PendingIntent f227591m;

    public C83471be(View view, SearchOverlayLayout searchOverlayLayout, C90929bz bzVar, C22871g gVar, C91097g gVar2, ClientConfig clientConfig, C87621a aVar, C58833ax axVar, C58833ax axVar2, C68214a aVar2, C58833ax axVar3, C68214a aVar3, C83476bj bjVar, C87677ae aeVar, C139701a aVar4, C68214a aVar5) {
        super(view, searchOverlayLayout, bzVar, gVar, gVar2, clientConfig, aVar, axVar, axVar2, aVar2, axVar3, aVar3, aeVar, aVar4, aVar5);
        this.f227580be = bjVar;
    }

    /* renamed from: b */
    public final C88709j mo76806b() {
        C83476bj bjVar = this.f227580be;
        C88709j b = super.mo76806b();
        boolean z = this.f227587i;
        boolean z2 = this.f227588j;
        RemoteViews remoteViews = this.f227578a;
        int i = this.f227579b;
        int i2 = this.f227581c;
        int i3 = this.f227582d;
        int i4 = this.f227583e;
        int i5 = this.f227584f;
        int i6 = this.f227585g;
        int i7 = this.f227586h;
        int i8 = this.f227590l;
        if (z) {
            b.f239885k = remoteViews;
            b.f239886l = i;
            b.f239887m = i2;
            b.f239888n = i3;
            b.f239889o = i4;
            b.f239890p = i5;
            b.f239891q = i8;
            b.f239856M = true;
            C88787u a = b.mo82433a(C41669ai.f108954c.intValue());
            C88787u a2 = b.mo82433a(C41669ai.f108958g.intValue());
            C88787u a3 = b.mo82433a(C41669ai.f108960i.intValue());
            C88787u a4 = b.mo82433a(C41669ai.f108961j.intValue());
            int dimensionPixelSize = bjVar.f227615a.getDimensionPixelSize(R.dimen.divider_left_right_padding);
            int dimensionPixelSize2 = bjVar.f227615a.getDimensionPixelSize(R.dimen.web_suggestion_list_left_right_padding);
            if (a != null) {
                a.f240281G = false;
                a.f240282H = false;
                C90638an anVar = a.f240277C;
                anVar.f253489r = 5;
                anVar.f253490s = 5;
                a.f240283I = false;
                a.f240289c = 0;
                a.f240302p = true;
                a.f240308v = i7 - bjVar.f227615a.getDimensionPixelSize(R.dimen.web_suggestion_list_top_padding);
                a.f240310x = i7;
                a.f240286L = false;
            }
            if (a2 != null) {
                a2.f240281G = false;
                a2.f240282H = false;
                C90638an anVar2 = a2.f240277C;
                anVar2.f253489r = 5;
                anVar2.f253490s = 5;
                a2.f240283I = true;
                a2.f240285K = R.color.pixel_apps_search_suggestion_divider;
                a2.f240289c = 0;
                a2.f240290d = 0;
                a2.f240311y = dimensionPixelSize - dimensionPixelSize2;
                if (!z2 || !b.f239896v) {
                    a2.f240293g = (float) i;
                    a2.f240278D = i;
                } else {
                    a2.f240292f = 1;
                    a2.f240293g = 0.0f;
                    a2.f240278D = i + i;
                }
                a2.f240302p = true;
                a2.f240304r = -bjVar.f227615a.getDimensionPixelSize(R.dimen.suggestion_containers_padding_inbetween);
                a2.f240308v = 0;
                int i9 = (-dimensionPixelSize2) + i6;
                a2.f240309w = i9;
                a2.f240307u = i9;
            }
            if (a3 != null) {
                a3.f240282H = false;
                C90638an anVar3 = a3.f240277C;
                anVar3.f253489r = 5;
                anVar3.f253490s = 5;
                a3.f240283I = true;
                a3.f240285K = R.color.pixel_apps_search_suggestion_divider;
                a3.f240289c = 0;
                a3.f240290d = 0;
                a3.f240311y = dimensionPixelSize - dimensionPixelSize2;
                a3.f240293g = (float) i;
                a3.f240278D = i;
                a3.f240302p = true;
                a3.f240304r = -bjVar.f227615a.getDimensionPixelSize(R.dimen.suggestion_containers_padding_inbetween);
                a3.f240310x = i7;
                a3.f240308v = i7;
                int i10 = (-dimensionPixelSize2) + i6;
                a3.f240309w = i10;
                a3.f240307u = i10;
            }
            if (a4 != null) {
                a4.f240281G = false;
                a4.f240282H = false;
                C90638an anVar4 = a4.f240277C;
                anVar4.f253489r = 5;
                anVar4.f253490s = 5;
                a4.f240285K = R.color.pixel_apps_search_suggestion_divider;
                a4.f240289c = 0;
                a4.f240290d = 0;
                a4.f240302p = true;
                a4.f240304r = -bjVar.f227615a.getDimensionPixelSize(R.dimen.suggestion_containers_padding_inbetween);
                a4.f240311y = dimensionPixelSize - dimensionPixelSize2;
                a4.f240283I = false;
                a4.f240286L = false;
            }
            C88787u uVar = new C88787u();
            uVar.f240281G = false;
            uVar.f240282H = false;
            C90638an anVar5 = uVar.f240277C;
            anVar5.f253489r = 5;
            anVar5.f253490s = 5;
            uVar.f240283I = true;
            uVar.f240285K = R.color.pixel_apps_search_suggestion_divider;
            uVar.f240289c = 0;
            uVar.f240290d = 0;
            int i11 = dimensionPixelSize - dimensionPixelSize2;
            uVar.f240311y = i11;
            b.f239895u.mo44243b(C41669ai.f108957f.intValue(), uVar);
            C88787u uVar2 = new C88787u();
            uVar2.f240289c = 0;
            uVar2.f240290d = 0;
            uVar2.f240286L = false;
            uVar2.f240283I = false;
            uVar2.f240311y = i11;
            b.f239895u.mo44243b(C41669ai.f108953b.intValue(), uVar2);
            C88787u uVar3 = new C88787u();
            uVar3.f240289c = 0;
            uVar3.f240281G = false;
            uVar3.f240282H = false;
            C90638an anVar6 = uVar3.f240277C;
            anVar6.f253489r = 5;
            anVar6.f253490s = 5;
            b.f239895u.mo44243b(C41669ai.f108969r.intValue(), uVar3);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo76807c(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.DISPLAY_DYNAMIC_ICON) {
            SearchPlate searchPlate = (SearchPlate) this.f236880v.findViewById(R.id.search_plate);
            searchPlate.getClass();
            C62940bt btVar = C87779dg.f237555a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r1 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r1);
            if (!uoVar.f169962ag.mo58857o(r1.f169971d)) {
                searchPlate.mo82678k((String) null);
            } else {
                searchPlate.mo82678k(((C87781di) serviceEventData.mo81918e(C87779dg.f237555a)).f237559b);
            }
        }
        super.mo76807c(serviceEventData);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[Catch:{ CanceledException -> 0x007d }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo76809f(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r13, android.view.View r14) {
        /*
            r12 = this;
            int r0 = r13.f108909j
            r1 = 19
            r2 = 0
            if (r0 != r1) goto L_0x007d
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            r3.<init>(r2, r2, r4, r0)
            android.graphics.Point r0 = com.google.android.apps.gsa.searchbox.p6960ui.C88711l.m143617a(r14)
            r4 = r1[r2]
            int r5 = r0.x
            int r4 = r4 - r5
            r5 = 1
            r1 = r1[r5]
            int r6 = r0.y
            int r1 = r1 - r6
            r3.offset(r4, r1)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            r9.setSourceBounds(r3)
            com.google.android.libraries.searchbox.shared.suggestion.e r13 = r13.f108907B
            int r1 = r13.f109007a
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0053
            com.google.android.libraries.searchbox.shared.suggestion.y r13 = r13.f109017k
            if (r13 != 0) goto L_0x004b
            com.google.android.libraries.searchbox.shared.suggestion.y r13 = com.google.android.libraries.searchbox.shared.suggestion.C41699y.f109072f
        L_0x004b:
            int r1 = r13.f109074a
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0053
            java.lang.String r13 = r13.f109075b
            goto L_0x0055
        L_0x0053:
            java.lang.String r13 = ""
        L_0x0055:
            android.net.Uri r13 = android.net.Uri.parse(r13)
            android.content.Intent r13 = r9.setData(r13)
            java.lang.String r1 = "partial_long_press"
            android.content.Intent r13 = r13.putExtra(r1, r5)
            java.lang.String r1 = "icon_touch_offset"
            r13.putExtra(r1, r0)
            android.app.PendingIntent r6 = r12.f227591m     // Catch:{ CanceledException -> 0x007d }
            if (r6 == 0) goto L_0x007d
            android.content.Context r7 = r12.f236874p     // Catch:{ CanceledException -> 0x007d }
            com.google.android.apps.gsa.nowoverlayservice.bd r10 = new com.google.android.apps.gsa.nowoverlayservice.bd     // Catch:{ CanceledException -> 0x007d }
            r10.<init>(r12, r14)     // Catch:{ CanceledException -> 0x007d }
            android.os.Handler r11 = new android.os.Handler     // Catch:{ CanceledException -> 0x007d }
            r11.<init>()     // Catch:{ CanceledException -> 0x007d }
            r8 = 0
            r6.send(r7, r8, r9, r10, r11)     // Catch:{ CanceledException -> 0x007d }
            return r5
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nowoverlayservice.C83471be.mo76809f(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, android.view.View):boolean");
    }

    /* renamed from: e */
    public final void mo76808e(boolean z) {
        if (!z || !this.f236795Y) {
            C58976aa aaVar = C58975e.f156826a;
            this.f236773C.mo81938j(z);
            return;
        }
        C87673aa aaVar2 = this.f236773C;
        aaVar2.mo81948t(false);
        aaVar2.mo81933e();
        C58976aa aaVar3 = C58975e.f156826a;
        this.f236795Y = false;
        aaVar2.mo81932c();
        aaVar2.mo81947s((Bundle) null);
    }
}
