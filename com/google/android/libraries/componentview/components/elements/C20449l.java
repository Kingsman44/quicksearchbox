package com.google.android.libraries.componentview.components.elements;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.componentview.components.base.C20075cf;
import com.google.android.libraries.componentview.components.base.p1687a.C19927ba;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.android.libraries.componentview.services.p1701a.C20536e;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.libraries.componentview.services.p1701a.C20544m;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.elements.l */
/* compiled from: PG */
public final class C20449l extends C0640fb {

    /* renamed from: a */
    private final C20470a f57504a;

    /* renamed from: b */
    private final List f57505b;

    /* renamed from: c */
    private final Map f57506c;

    /* renamed from: d */
    private final C20537f f57507d;

    /* renamed from: e */
    private final C20601ca f57508e;

    public C20449l(C20470a aVar, List list, Map map, C20537f fVar, C20601ca caVar) {
        this.f57504a = aVar;
        this.f57505b = list;
        this.f57506c = map;
        this.f57507d = fVar;
        this.f57508e = caVar;
    }

    /* renamed from: a */
    public static C20470a m38362a(C20470a aVar, C56425d dVar, C20537f fVar, C20601ca caVar, int i) {
        C20544m mVar = (C20544m) fVar;
        C20470a b = mVar.mo25451b(aVar, dVar, (C20536e) null);
        if (b != null) {
            return b;
        }
        C20614e eVar = new C20614e();
        eVar.mo25535e(C19742a.INVALID_CHILD);
        eVar.f57822b = i + " child is null!";
        C20520h.m38498c("AbsCarouselLazy", eVar.mo25531a(), caVar, new Object[0]);
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.copyOnWrite();
        C56425d dVar2 = (C56425d) cVar.instance;
        dVar2.f150539a |= 1;
        dVar2.f150540b = "android-empty-view";
        cVar.mo58885m(C19927ba.f55761d, C19927ba.f55760c);
        return mVar.mo25451b(aVar, (C56425d) cVar.build(), (C20536e) null);
    }

    public final int getItemCount() {
        return this.f57505b.size();
    }

    public final int getItemViewType(int i) {
        return i;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C20450m mVar = (C20450m) ghVar;
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        Map map = this.f57506c;
        Integer valueOf = Integer.valueOf(i);
        C20470a aVar = (C20470a) map.get(valueOf);
        if (aVar == null) {
            aVar = m38362a(this.f57504a, (C56425d) this.f57505b.get(i), this.f57507d, this.f57508e, i);
            this.f57506c.put(valueOf, aVar);
        }
        return new C20450m(aVar);
    }

    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C0673gh ghVar) {
        C20450m mVar = (C20450m) ghVar;
        View kH = mVar.f57509a.mo25098kH();
        if (kH != null) {
            kH.getLayoutParams().height = -1;
        }
        C20075cf.m37938v(mVar.f57509a);
    }
}
