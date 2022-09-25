package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6184j.p6185a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80985e;
import com.google.android.apps.gsa.nga.shared.p6417x.C83344ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.j.a.d */
/* compiled from: PG */
public final /* synthetic */ class C78588d implements C83344ae {

    /* renamed from: a */
    public final /* synthetic */ C78583aa f216384a;

    public /* synthetic */ C78588d(C78583aa aaVar) {
        this.f216384a = aaVar;
    }

    /* renamed from: a */
    public final Object mo73140a(Object obj, Object obj2, Object obj3, Object obj4) {
        C78583aa aaVar = this.f216384a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        Optional optional = (Optional) obj3;
        C78815q qVar = (C78815q) obj4;
        if (!booleanValue && !booleanValue2) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C78610z.DISABLED;
        } else if (!aaVar.f216345e.a().mo71323c()) {
            C58976aa aaVar3 = C58975e.f156826a;
            C89859i iVar = aaVar.f216353m;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.ASSISTANT_AVS_ENABLED;
            iVar.mo74236a(fVar.mo83699a());
            C89859i iVar2 = aaVar.f216353m;
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.ASSISTANT_AVS_SCREENSHOT_NOT_ALLOWED;
            iVar2.mo74236a(fVar2.mo83699a());
            C89859i iVar3 = aaVar.f216353m;
            C89856f fVar3 = new C89856f();
            fVar3.f246201a = C89849ae.ASSISTANT_AVS_GLEAMS_DISPOSED;
            iVar3.mo74236a(fVar3.mo83699a());
            return C78610z.DISABLED;
        } else if (C78816r.m126599d(qVar)) {
            C58976aa aaVar4 = C58975e.f156826a;
            return C78610z.DISABLED;
        } else if (qVar.f216931c && C78816r.m126601f(qVar)) {
            C58976aa aaVar5 = C58975e.f156826a;
            C89859i iVar4 = aaVar.f216353m;
            C89856f fVar4 = new C89856f();
            fVar4.f246201a = C89849ae.ASSISTANT_AVS_ENABLED;
            iVar4.mo74236a(fVar4.mo83699a());
            C89859i iVar5 = aaVar.f216353m;
            C89856f fVar5 = new C89856f();
            fVar5.f246201a = C89849ae.ASSISTANT_AVS_INVOKED_ON_LOCK_SCREEN;
            iVar5.mo74236a(fVar5.mo83699a());
            C89859i iVar6 = aaVar.f216353m;
            C89856f fVar6 = new C89856f();
            fVar6.f246201a = C89849ae.ASSISTANT_AVS_GLEAMS_DISPOSED;
            iVar6.mo74236a(fVar6.mo83699a());
            return C78610z.DISABLED;
        } else if (aaVar.f216350j.mo74766b().equals(C80985e.IN_FOREGROUND) && C78816r.m126601f(qVar)) {
            C58976aa aaVar6 = C58975e.f156826a;
            C89859i iVar7 = aaVar.f216353m;
            C89856f fVar7 = new C89856f();
            fVar7.f246201a = C89849ae.ASSISTANT_AVS_ENABLED;
            iVar7.mo74236a(fVar7.mo83699a());
            C89859i iVar8 = aaVar.f216353m;
            C89856f fVar8 = new C89856f();
            fVar8.f246201a = C89849ae.ASSISTANT_AVS_INVOKED_ON_HOME_SCREEN;
            iVar8.mo74236a(fVar8.mo83699a());
            C89859i iVar9 = aaVar.f216353m;
            C89856f fVar9 = new C89856f();
            fVar9.f246201a = C89849ae.ASSISTANT_AVS_GLEAMS_DISPOSED;
            iVar9.mo74236a(fVar9.mo83699a());
            return C78610z.DISABLED;
        } else if (!C78816r.m126601f(qVar)) {
            C58976aa aaVar7 = C58975e.f156826a;
            return C78610z.DISABLED;
        } else if (!booleanValue2) {
            return C78610z.GLEAM_ONLY;
        } else {
            if (!optional.isPresent()) {
                new C90873ag(aaVar.f216346f.mo28201a("[NGA] Lens allowlist fetch", C78604t.f216408a), aaVar.f216348h, "[NGA] setting allowlist", new C78605u(aaVar)).mo85223a(C78606v.f216410a);
                C58976aa aaVar8 = C58975e.f156826a;
                return C78610z.DISABLED;
            } else if (((C58528ij) optional.get()).contains(aaVar.mo73547c())) {
                C89859i iVar10 = aaVar.f216353m;
                C89856f fVar10 = new C89856f();
                fVar10.f246201a = C89849ae.ASSISTANT_AVS_ENABLED;
                iVar10.mo74236a(fVar10.mo83699a());
                if (booleanValue) {
                    return C78610z.GLEAM_WITH_TRANSPARENT_ACTIVITY;
                }
                return C78610z.TRANSPARENT_ACTIVITY_ONLY;
            } else {
                C58976aa aaVar9 = C58975e.f156826a;
                return C78610z.DISABLED;
            }
        }
    }
}
