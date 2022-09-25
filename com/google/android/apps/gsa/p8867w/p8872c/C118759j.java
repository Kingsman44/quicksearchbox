package com.google.android.apps.gsa.p8867w.p8872c;

import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16867b;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1337c.C16868c;
import com.google.common.p4522b.C58733pz;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.w.c.j */
/* compiled from: PG */
public final /* synthetic */ class C118759j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C118744ab f331257a;

    /* renamed from: b */
    public final /* synthetic */ C16867b f331258b;

    /* renamed from: c */
    public final /* synthetic */ String f331259c;

    public /* synthetic */ C118759j(C118744ab abVar, C16867b bVar, String str) {
        this.f331257a = abVar;
        this.f331258b = bVar;
        this.f331259c = str;
    }

    public final void accept(Object obj) {
        C118744ab abVar = this.f331257a;
        C16867b bVar = this.f331258b;
        Set stringSet = ((C86338r) abVar.f331220b.mo17428b()).getStringSet(((C118750ah) obj).mo103945a(this.f331259c), C58733pz.f156496a);
        bVar.copyOnWrite();
        C16868c cVar = (C16868c) bVar.instance;
        C16868c cVar2 = C16868c.f49349j;
        C62971cq cqVar = cVar.f49354d;
        if (!cqVar.mo58948c()) {
            cVar.f49354d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) stringSet, (List) cVar.f49354d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
