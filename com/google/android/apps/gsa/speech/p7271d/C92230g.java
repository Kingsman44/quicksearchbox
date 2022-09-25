package com.google.android.apps.gsa.speech.p7271d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.speech.d.g */
/* compiled from: PG */
final class C92230g extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ C92232i f257142a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92230g(C92232i iVar) {
        super("Dependency checks");
        this.f257142a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f257142a.f257144a.mo83702b(C89849ae.VOICE_MATCH_DEPENDENCY_CHECKER_RUNNER_FAILED);
        C92232i iVar = this.f257142a;
        iVar.f257148e = false;
        iVar.f257146c.run();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        C92232i iVar = this.f257142a;
        iVar.f257148e = false;
        if (list != null) {
            iVar.f257147d = C58758qx.m90652j(iVar.f257147d, new C92231h(list));
        }
        if (iVar.f257147d.isEmpty()) {
            iVar.f257145b.run();
            return;
        }
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        for (C92229f fVar : iVar.f257147d) {
            C92228e eVar = C92228e.EXPERIMENTAL_CONFIG;
            int ordinal = fVar.f257138a.ordinal();
            int i = 3;
            if (ordinal != 0) {
                i = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 1 : 8 : 7 : 6 : 5 : 4;
            }
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            C62961ch chVar = cbVar.f160053R;
            if (!chVar.mo58948c()) {
                cbVar.f160053R = C62942bv.mutableCopy(chVar);
            }
            cbVar.f160053R.mo58916g(i - 1);
        }
        C89859i iVar2 = iVar.f257144a;
        C89856f fVar2 = new C89856f();
        fVar2.f246201a = C89849ae.VOICE_MATCH_DEPENDENCY_CHECKERS_STILL_PENDING;
        fVar2.f246203c = (C59687cb) ajVar.build();
        iVar2.mo74236a(fVar2.mo83699a());
        iVar.f257146c.run();
    }
}
