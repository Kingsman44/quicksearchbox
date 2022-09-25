package com.google.android.libraries.web.coordinator.internal.fragment;

import com.google.android.libraries.web.shared.contrib.WebFeature;
import java.util.LinkedHashSet;
import java.util.Map;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.coordinator.internal.fragment.e */
/* compiled from: PG */
final class C43746e extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ WebCoordinatorInfoInternal f114102a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43746e(WebCoordinatorInfoInternal webCoordinatorInfoInternal) {
        super(0);
        this.f114102a = webCoordinatorInfoInternal;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        WebCoordinatorInfoInternal webCoordinatorInfoInternal = this.f114102a;
        linkedHashSet.addAll(webCoordinatorInfoInternal.f114084a.f112962a);
        for (Map.Entry value : webCoordinatorInfoInternal.f114087d.entrySet()) {
            linkedHashSet.addAll(((WebFeature) value.getValue()).mo41576a().f114758b);
        }
        return C69540x.m100846ab(linkedHashSet);
    }
}
