package com.google.android.libraries.gsa.monet.internal.p1887a;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.internal.shared.BoundedParcelable;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.p1886a.C22937b;
import com.google.android.libraries.gsa.monet.p1886a.C22940e;
import com.google.android.libraries.gsa.monet.p1886a.C22951p;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23095a;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23099b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23105h;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.ae */
/* compiled from: PG */
public final class C22962ae implements C22951p {

    /* renamed from: a */
    private final C22995s f63164a;

    /* renamed from: b */
    private final C22970am f63165b;

    /* renamed from: c */
    private final C22937b f63166c;

    /* renamed from: d */
    private final C68214a f63167d;

    public C22962ae(C22995s sVar, C22970am amVar, C22937b bVar, C68214a aVar) {
        this.f63164a = sVar;
        this.f63165b = amVar;
        this.f63166c = bVar;
        this.f63167d = aVar;
    }

    /* renamed from: a */
    public final Bundle mo28323a() {
        Bundle bundle = new Bundle();
        C22995s sVar = this.f63164a;
        C23099b bVar = ((C22968ak) this.f63167d.mo27525b()).f63176a;
        C22977at atVar = (C22977at) sVar.f63253b.get("DC");
        if (atVar == null) {
            throw new C22940e("No DisplayCoordinator model.");
        } else if (atVar.f63193a != C23105h.INITIALIZED_BY_CONTROLLER) {
            throw new C22940e("The DisplayCoordinator's controller has not taken over yet.");
        } else if (atVar.f63194b.mo28469e().isEmpty() || !sVar.f63253b.containsKey(C22995s.f63252a)) {
            throw new C22940e("No root feature to save.");
        } else {
            ArrayList arrayList = new ArrayList();
            sVar.mo28389d(atVar, arrayList);
            if (arrayList.size() > 1 && !((FeatureStateSnapshot) arrayList.get(1)).mo28454a().f63376b.equals(C22995s.f63252a)) {
                sVar.f63255d.mo28559a("ModelStore", "The root feature should be the second element.", new Object[0]);
            }
            HierarchyState hierarchyState = new HierarchyState(arrayList, bVar);
            C23099b bVar2 = ((C22968ak) this.f63167d.mo27525b()).f63176a;
            bundle.putParcelable("HIERARCHY_STATE", new BoundedParcelable(hierarchyState, (bVar2.f63442a & 1) != 0 ? bVar2.f63443b : 500000));
            return bundle;
        }
    }

    /* renamed from: b */
    public final boolean mo28324b(Bundle bundle, C23129y yVar, ProtoParcelable protoParcelable) {
        BoundedParcelable boundedParcelable = (BoundedParcelable) bundle.getParcelable("HIERARCHY_STATE");
        if (boundedParcelable == null) {
            return false;
        }
        HierarchyState hierarchyState = (HierarchyState) boundedParcelable.f63359a;
        if (hierarchyState == null) {
            C23095a.m43281d("StateManagerImpl", "Monet data was discarded because it was too large.", new Object[0]);
            return false;
        }
        this.f63166c.mo28287c(hierarchyState);
        this.f63165b.mo28354b(hierarchyState, yVar, protoParcelable);
        return true;
    }
}
