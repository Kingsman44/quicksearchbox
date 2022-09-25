package com.google.android.apps.gsa.staticplugins.p7676ck;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6626bx.C85034a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7055e.C89905b;
import com.google.android.apps.gsa.shared.logger.p7055e.C89910d;
import com.google.android.apps.gsa.shared.logger.p7055e.p7058b.C89906a;
import com.google.android.apps.gsa.shared.logger.p7055e.p7058b.C89908b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ck.a */
/* compiled from: PG */
public final class C97865a extends C86734a implements C85034a {

    /* renamed from: a */
    private final C89908b f273279a;

    /* renamed from: b */
    private final C89910d f273280b;

    public C97865a(C89908b bVar, C89910d dVar) {
        super(C118575h.WORKER_PLATFORM_TASK_STATISTICS, "platform_task_statistics");
        this.f273279a = bVar;
        this.f273280b = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo78662a() {
        C58976aa aaVar = C58975e.f156826a;
        C89905b a = this.f273280b.mo83748a();
        C89908b bVar = this.f273279a;
        C89905b b = C89906a.m146417b((C89905b) bVar.f246337c.b(bVar.f246336b), new C89906a(a).f246334a);
        if (b.f246331b.size() > 0) {
            C62971cq cqVar = b.f246331b;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1291;
            tzVar.copyOnWrite();
            ((C60555uf) tzVar.instance).f164226cd = C60555uf.emptyProtobufList();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C62971cq cqVar2 = ufVar2.f164226cd;
            if (!cqVar2.mo58948c()) {
                ufVar2.f164226cd = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) cqVar, (List) ufVar2.f164226cd);
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
        return C118826c.f331423b;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
