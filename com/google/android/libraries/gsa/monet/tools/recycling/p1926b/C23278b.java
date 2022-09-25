package com.google.android.libraries.gsa.monet.tools.recycling.p1926b;

import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105232c;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23181a;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23188h;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23234c;
import com.google.android.libraries.gsa.monet.tools.recycling.p1925a.C23275a;
import com.google.android.libraries.gsa.monet.tools.recycling.p1925a.C23276b;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23310c;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.C23311d;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.b.b */
/* compiled from: PG */
public class C23278b {

    /* renamed from: a */
    private final C23310c f63751a;

    /* renamed from: b */
    public final C23283g f63752b;

    public C23278b(C23311d dVar, C23052c cVar) {
        C23310c a = dVar.mo28809a(cVar, C23234c.f63682a);
        this.f63751a = a;
        this.f63752b = new C23283g(cVar, a);
        cVar.mo28427o(new C23277a(this));
    }

    /* renamed from: c */
    public void mo28753c(C23056g gVar) {
        this.f63752b.f63757a.mo28642g(gVar);
    }

    /* renamed from: e */
    public final void mo28754e(String str, C23129y yVar, ProtoParcelable protoParcelable, int i) {
        C23275a aVar = (C23275a) C23276b.f63746c.createBuilder();
        String str2 = yVar.f63478c;
        aVar.copyOnWrite();
        C23276b bVar = (C23276b) aVar.instance;
        str2.getClass();
        bVar.f63748a |= 1;
        bVar.f63749b = str2;
        RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData = new RecyclingChildCoordinator$RecyclingChildData(str, this.f63751a, (C23276b) aVar.build());
        C23188h hVar = this.f63752b.f63757a;
        hVar.f63588d.mo28364q(recyclingChildCoordinator$RecyclingChildData.f63675b, yVar, protoParcelable);
        C23056g a = hVar.f63588d.mo28421a(recyclingChildCoordinator$RecyclingChildData.f63675b);
        hVar.mo28640e(recyclingChildCoordinator$RecyclingChildData, a, i);
        C23181a aVar2 = hVar.f63589e;
        if (aVar2 != null) {
            ((C105232c) aVar2).f293504a.mo94711l(a);
        }
    }

    /* renamed from: f */
    public final List mo28755f() {
        return this.f63752b.f63757a.f63585a.mo28705c("CHILDREN");
    }
}
