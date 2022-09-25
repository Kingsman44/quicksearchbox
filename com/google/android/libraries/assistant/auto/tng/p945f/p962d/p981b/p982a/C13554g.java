package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.p982a;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13533i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C13554g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13556i f41521a;

    public /* synthetic */ C13554g(C13556i iVar) {
        this.f41521a = iVar;
    }

    public final Object apply(Object obj) {
        C13556i iVar = this.f41521a;
        C59104x b = C13556i.f41523a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SmartActionProcessor");
        ((C59052c) ((C59052c) b).mo56372aa(44890)).mo56386p("Triggered SmartAction generation");
        Stream map = Collection.EL.stream((List) obj).map(new C13550c(iVar));
        C13533i iVar2 = iVar.f41525c;
        Objects.requireNonNull(iVar2);
        iVar.f41524b.mo21167a((C58485gu) map.map(new C13551d(iVar2)).map(new C13552e(iVar)).collect(C58370cn.f155946a));
        return null;
    }
}
