package com.google.android.apps.gsa.staticplugins.customtabs.p7708a;

import com.google.android.apps.gsa.shared.p7117n.p7118a.p7119a.C90357a;
import com.google.android.apps.gsa.shared.p7117n.p7118a.p7119a.C90358b;
import com.google.android.libraries.p1703d.C20646b;
import com.google.android.libraries.p1703d.C20647c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.a.b */
/* compiled from: PG */
public final /* synthetic */ class C98566b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f275295a;

    /* renamed from: b */
    public final /* synthetic */ boolean f275296b;

    /* renamed from: c */
    public final /* synthetic */ C20646b f275297c;

    public /* synthetic */ C98566b(boolean z, boolean z2, C20646b bVar) {
        this.f275295a = z;
        this.f275296b = z2;
        this.f275297c = bVar;
    }

    public final Object apply(Object obj) {
        boolean z = this.f275295a;
        boolean z2 = this.f275296b;
        C20646b bVar = this.f275297c;
        C90357a aVar = (C90357a) ((C90358b) obj).toBuilder();
        aVar.copyOnWrite();
        C90358b bVar2 = (C90358b) aVar.instance;
        bVar2.f252351a |= 2;
        bVar2.f252352b = z;
        if (z2) {
            aVar.copyOnWrite();
            ((C90358b) aVar.instance).f252353c = C62942bv.emptyProtobufList();
        } else if (bVar != null) {
            aVar.copyOnWrite();
            ((C90358b) aVar.instance).f252353c = C62942bv.emptyProtobufList();
            C58528ij w = ((C20647c) bVar).f57887c.keySet();
            aVar.copyOnWrite();
            C90358b bVar3 = (C90358b) aVar.instance;
            C62971cq cqVar = bVar3.f252353c;
            if (!cqVar.mo58948c()) {
                bVar3.f252353c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) w, (List) bVar3.f252353c);
        }
        return (C90358b) aVar.build();
    }
}
