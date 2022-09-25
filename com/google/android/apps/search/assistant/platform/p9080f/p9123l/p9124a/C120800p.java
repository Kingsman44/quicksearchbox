package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119823br;
import com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120527b;
import com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120530c;
import com.google.android.apps.search.assistant.platform.p9080f.p9092d.C120531a;
import com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9095a.C120541b;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35484k;
import com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35485l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.p */
/* compiled from: PG */
public final /* synthetic */ class C120800p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120530c f335941a;

    /* renamed from: b */
    public final /* synthetic */ Executor f335942b;

    /* renamed from: c */
    public final /* synthetic */ C120531a f335943c;

    /* renamed from: d */
    public final /* synthetic */ Optional f335944d;

    public /* synthetic */ C120800p(C120530c cVar, Executor executor, C120531a aVar, Optional optional) {
        this.f335941a = cVar;
        this.f335942b = executor;
        this.f335943c = aVar;
        this.f335944d = optional;
    }

    public final C60870cx apply(Object obj) {
        C120530c cVar = this.f335941a;
        Executor executor = this.f335942b;
        C120531a aVar = this.f335943c;
        Optional optional = this.f335944d;
        C120541b bVar = (C120541b) obj;
        int a = C119823br.m198726a(cVar.f335204d.f333741a);
        if (a != 0 && a == 2) {
            C58485gu c = bVar.mo104817c();
            C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
            dxVar.copyOnWrite();
            C51809dy dyVar = (C51809dy) dxVar.instance;
            dyVar.f135935a |= 1;
            dyVar.f135936b = "apa.RETURN_REMOTE";
            C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
            C33480d dVar = C120530c.f335201a;
            C35484k kVar = (C35484k) C35485l.f93191b.createBuilder();
            kVar.copyOnWrite();
            C35485l lVar = (C35485l) kVar.instance;
            C62971cq cqVar = lVar.f93193a;
            if (!cqVar.mo58948c()) {
                lVar.f93193a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) c, (List) lVar.f93193a);
            dvVar.mo53733c(dVar.mo38881b((C35485l) kVar.build()));
            dxVar.copyOnWrite();
            C51809dy dyVar2 = (C51809dy) dxVar.instance;
            C51807dw dwVar = (C51807dw) dvVar.build();
            dwVar.getClass();
            dyVar2.f135938d = dwVar;
            dyVar2.f135935a |= 4;
            return C60922j.m93044g(C60922j.m93044g(cVar.f335203c.mo104603a((C51809dy) dxVar.build()).mo104299a(), C47810es.m84963c(C120527b.f335197a), C60826bg.f164896a), C47810es.m84963c(C120798n.f335939a), executor);
        }
        if (!bVar.mo104817c().isEmpty()) {
            aVar.mo104808c(bVar.mo104817c());
        }
        optional.ifPresent(new C120799o(bVar));
        return C60856cj.m92900i(bVar.mo104815a());
    }
}
