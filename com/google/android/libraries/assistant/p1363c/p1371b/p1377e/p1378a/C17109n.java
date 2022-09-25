package com.google.android.libraries.assistant.p1363c.p1371b.p1377e.p1378a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1377e.C17095a;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58670nq;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.b.e.a.n */
/* compiled from: PG */
public final /* synthetic */ class C17109n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Optional f49781a;

    public /* synthetic */ C17109n(Optional optional) {
        this.f49781a = optional;
    }

    public final Object apply(Object obj) {
        Optional optional = this.f49781a;
        List list = (List) obj;
        C58528ij ijVar = (C58528ij) list.get(0);
        C58528ij ijVar2 = (C58528ij) list.get(1);
        if (ijVar.isEmpty() && ijVar2.isEmpty()) {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56224b()).mo56372aa(42611)).mo56389s("PendingGroupStatus - Group %s: No installed or supported packs found.", optional.get());
            return new C17095a(Optional.empty(), false);
        } else if (!ijVar2.isEmpty()) {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56224b()).mo56372aa(42610)).mo56389s("PendingGroupStatus - Group %s: pack already installed.", optional.get());
            return new C17095a(Optional.empty(), true);
        } else {
            ((C58970a) ((C58970a) C17119x.f49800a.mo56224b()).mo56372aa(42609)).mo56389s("PendingGroupStatus - Group %s: pack not installed, but found a supported pack.", optional.orElse("N/A"));
            return new C17095a(Optional.m71637of(Long.valueOf(((C10882h) Collection.EL.stream(ijVar).collect(C58670nq.f156403c)).mo19283b())), false);
        }
    }
}
