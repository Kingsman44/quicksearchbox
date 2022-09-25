package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62971cq;
import com.google.protos.youtube.elements.p5168d.p5169a.C66184b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p5460g.p5461a.C69464a;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.m */
/* compiled from: PG */
public final class C40073m implements C40066f {

    /* renamed from: a */
    public static final C59071e f105287a = C59071e.m91331h();

    /* renamed from: b */
    public final C69464a f105288b;

    /* renamed from: c */
    public final Set f105289c = new LinkedHashSet();

    /* renamed from: d */
    private final C60887da f105290d;

    public C40073m(C69464a aVar, C60887da daVar) {
        C69664n.m101061g(aVar, "resourceLoader");
        C69664n.m101061g(daVar, "blockingExecutor");
        this.f105288b = aVar;
        this.f105290d = daVar;
    }

    /* renamed from: a */
    public final C58528ij mo42168a() {
        C58528ij F;
        synchronized (this.f105289c) {
            F = C58528ij.m90006F(this.f105289c);
            C69664n.m101060f(F, "copyOf(loadedTemplateKeys)");
        }
        return F;
    }

    /* renamed from: b */
    public final void mo42169b(C66184b bVar) {
        C69664n.m101061g(bVar, "emlParcel");
        synchronized (this.f105289c) {
            C62971cq cqVar = bVar.f179969a;
            C69664n.m101060f(cqVar, "emlParcel\n          .emlTemplateDataList");
            Iterator a = C69734n.m101143k(C69734n.m101140h(C69540x.m100847ac(cqVar), new C40071k(this)), C40072l.f105286a).mo5191a();
            ArrayList arrayList = new ArrayList();
            C58570jy.m90163o(arrayList, a);
            if (!arrayList.isEmpty()) {
                Status handleResources = ((ResourceLoader) this.f105288b.mo17428b()).handleResources(arrayList);
                if (C40068h.f105282a[handleResources.getCode().ordinal()] != 1) {
                    C59052c cVar = (C59052c) f105287a.mo56226d();
                    cVar.mo56379ah(new C59094n(53293));
                    cVar.mo56389s("handleResources() failed: %s", handleResources);
                }
                this.f105290d.execute(C47810es.m84977q(new C40070j(this)));
            }
        }
    }
}
