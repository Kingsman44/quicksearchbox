package com.google.android.libraries.gsa.monet.internal.service;

import com.google.android.apps.gsa.shared.monet.C90349t;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23035b;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23090d;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.service.u */
/* compiled from: PG */
public final class C23025u {

    /* renamed from: a */
    public final C23020p f63346a;

    /* renamed from: b */
    public final C90349t f63347b;

    public C23025u(C23020p pVar, C90349t tVar) {
        this.f63346a = pVar;
        this.f63347b = tVar;
    }

    /* renamed from: a */
    public static C23029y m43148a(FeatureStateSnapshot featureStateSnapshot, Map map) {
        HashMap hashMap = new HashMap();
        ProtoParcelable protoParcelable = featureStateSnapshot.f63362b;
        if (protoParcelable == null) {
            for (C23035b bVar : featureStateSnapshot.mo28454a().f63378d) {
                FeatureStateSnapshot featureStateSnapshot2 = (FeatureStateSnapshot) map.get(bVar.f63371c);
                if (featureStateSnapshot2 != null) {
                    C23090d.m43273a(bVar.f63370b, m43148a(featureStateSnapshot2, map), hashMap);
                }
            }
        }
        return new C23029y(new C23129y(featureStateSnapshot.mo28454a().f63377c), featureStateSnapshot.f63361a, new C23091e(hashMap), protoParcelable);
    }

    /* renamed from: b */
    public static C23091e m43149b(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FeatureStateSnapshot featureStateSnapshot = (FeatureStateSnapshot) it.next();
            C23090d.m43273a(featureStateSnapshot.mo28454a().f63376b, featureStateSnapshot, hashMap);
        }
        return new C23091e(hashMap);
    }
}
