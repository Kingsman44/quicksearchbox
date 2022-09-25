package com.google.android.libraries.appactions.p11035a;

import com.google.android.libraries.appactions.p11035a.p11036a.C147817b;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63060fy;
import com.google.protobuf.C63063ga;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.appactions.a.f */
/* compiled from: PG */
public final /* synthetic */ class C147838f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f398855a;

    /* renamed from: b */
    public final /* synthetic */ C63063ga f398856b;

    /* renamed from: c */
    public final /* synthetic */ C147832ah f398857c;

    public /* synthetic */ C147838f(String str, C63063ga gaVar, C147832ah ahVar) {
        this.f398855a = str;
        this.f398856b = gaVar;
        this.f398857c = ahVar;
    }

    public final void accept(Object obj) {
        String str = this.f398855a;
        C63063ga gaVar = this.f398856b;
        C147832ah ahVar = this.f398857c;
        C147817b bVar = (C147817b) obj;
        ((C59052c) ((C59052c) C147839g.f398858a.mo56224b()).mo56372aa(42254)).mo56354G("Inventory match found for: (%s, %s)", str, gaVar);
        if (!bVar.mo124482e().isEmpty()) {
            C63060fy fyVar = (C63060fy) C63063ga.f170179c.createBuilder();
            String e = bVar.mo124482e();
            fyVar.copyOnWrite();
            C63063ga gaVar2 = (C63063ga) fyVar.instance;
            e.getClass();
            gaVar2.f170181a = 3;
            gaVar2.f170182b = e;
            ahVar.f398842a.put(str, (C63063ga) fyVar.build());
            ahVar.f398843b.add(str);
        }
        if (!bVar.mo124485h().isEmpty()) {
            ahVar.f398845d = bVar.mo124485h();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
