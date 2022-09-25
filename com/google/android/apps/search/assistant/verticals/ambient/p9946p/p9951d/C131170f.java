package com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9951d;

import android.net.Uri;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131142n;
import com.google.android.apps.search.assistant.verticals.ambient.p9946p.p9949b.C131151w;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.p3312f.C42782f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4535g.C59127at;
import com.google.common.p4535g.C59226t;
import com.google.common.p4535g.C59227u;
import com.google.p4479cg.C58079k;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.p.d.f */
/* compiled from: PG */
public final /* synthetic */ class C131170f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131171g f358689a;

    /* renamed from: b */
    public final /* synthetic */ C58079k f358690b;

    public /* synthetic */ C131170f(C131171g gVar, C58079k kVar) {
        this.f358689a = gVar;
        this.f358690b = kVar;
    }

    public final Object apply(Object obj) {
        boolean z;
        C131171g gVar = this.f358689a;
        C58079k kVar = this.f358690b;
        C29690f fVar = (C29690f) obj;
        C59227u uVar = new C59227u();
        if (fVar != null) {
            C29689e eVar = C29689e.DOWNLOADED;
            C29689e a = C29689e.m54781a(fVar.f80415f);
            if (a == null) {
                a = C29689e.UNSPECIFIED;
            }
            if (eVar.equals(a)) {
                ArrayList arrayList = new ArrayList();
                uVar.f157335a = (ArrayList) Collection.EL.stream(fVar.f80416g).map(C131162a.f358681a).map(new C131166b(arrayList)).collect(Collectors.toCollection(C131167c.f358686a));
                C59227u.m91962d(uVar.f157335a);
                ((C58970a) ((C58970a) gVar.f358691a.mo56224b()).mo56372aa(39054)).mo56389s("Covered cells: [%s]", Collection.EL.stream(arrayList).collect(Collectors.joining(", ")));
            }
        }
        if (uVar.mo56680b(C59226t.m91939t(C59127at.m91610b(kVar.f155252a, kVar.f155253b).mo56453d()))) {
            try {
                C131151w wVar = gVar.f358694d;
                if (fVar != null) {
                    if (fVar.f80416g.size() != 0) {
                        z = false;
                        if (new C131142n((MappedByteBuffer) wVar.f358663a.mo45889c(Uri.parse(((C28595b) fVar.f80416g.get(0)).f77799c), new C42782f())).f358647b >= 3) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            } catch (IOException unused) {
            }
        }
        return true;
    }
}
