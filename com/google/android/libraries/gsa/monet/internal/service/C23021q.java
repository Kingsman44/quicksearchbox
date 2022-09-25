package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23099b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.q */
/* compiled from: PG */
public final class C23021q {

    /* renamed from: a */
    public final Map f63338a = new HashMap();

    /* renamed from: b */
    public final C23099b f63339b;

    public C23021q(C23099b bVar) {
        this.f63339b = bVar;
    }

    /* renamed from: a */
    public final C23015k mo28443a(String str) {
        return (C23015k) this.f63338a.get(str);
    }

    /* renamed from: b */
    public final void mo28444b(String str, C23015k kVar) {
        this.f63338a.put(str, kVar);
    }

    /* renamed from: c */
    public final void mo28445c(FeatureStateSnapshot featureStateSnapshot, List list) {
        list.add(featureStateSnapshot);
        if (featureStateSnapshot.f63362b == null) {
            for (C23035b bVar : featureStateSnapshot.mo28454a().f63378d) {
                C23015k kVar = (C23015k) this.f63338a.get(bVar.f63371c);
                if (kVar != null) {
                    mo28445c(kVar.f63312g.mo28465a(), list);
                }
            }
        }
    }
}
