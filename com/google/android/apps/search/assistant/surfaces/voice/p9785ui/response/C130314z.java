package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128565a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128625d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9742f.C128626e;
import com.google.android.googlequicksearchbox.R;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.z */
/* compiled from: PG */
public final /* synthetic */ class C130314z implements C69626l {

    /* renamed from: a */
    public final /* synthetic */ C130158ah f357185a;

    /* renamed from: b */
    public final /* synthetic */ View f357186b;

    public /* synthetic */ C130314z(C130158ah ahVar, View view) {
        this.f357185a = ahVar;
        this.f357186b = view;
    }

    /* renamed from: a */
    public final Object mo5761a(Object obj) {
        C130158ah ahVar = this.f357185a;
        View view = this.f357186b;
        C128565a aVar = (C128565a) obj;
        View r = C2043bi.m5589r(view, R.id.assistant_response_container);
        int i = r.getResources().getDisplayMetrics().heightPixels;
        float f = r.getResources().getDisplayMetrics().density;
        int max = C128567c.m209820c(aVar.f353517a).f5822c + Math.max((int) (48.0f * f), (int) (((float) i) - (f * 960.0f)));
        C69664n.m101061g(r, "<this>");
        ViewGroup.LayoutParams layoutParams = r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (!(marginLayoutParams == null || marginLayoutParams.topMargin == max)) {
            marginLayoutParams.topMargin = max;
            r.setLayoutParams(marginLayoutParams);
        }
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), C128567c.m209818a(aVar.f353517a).f5824e);
        View r2 = C2043bi.m5589r(view, R.id.assistant_response_layer_dev_badge);
        r2.setVisibility(true != ahVar.f356889z ? 8 : 0);
        C128625d.m209921a(r2, C128626e.m209922a(view.getContext(), R.dimen.assistant_dev_badge_bottom_margin_fix) + C128567c.m209820c(aVar.f353517a).f5824e);
        return C69788q.f186170a;
    }
}
