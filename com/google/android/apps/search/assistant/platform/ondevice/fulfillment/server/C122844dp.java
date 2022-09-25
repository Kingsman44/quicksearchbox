package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65186et;
import com.google.protos.p4985f.p5030q.C65187eu;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dp */
/* compiled from: PG */
public final /* synthetic */ class C122844dp implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340244a;

    /* renamed from: b */
    public final /* synthetic */ C65185es f340245b;

    /* renamed from: c */
    public final /* synthetic */ C122461p f340246c;

    public /* synthetic */ C122844dp(C122870ea eaVar, C65185es esVar, C122461p pVar) {
        this.f340244a = eaVar;
        this.f340245b = esVar;
        this.f340246c = pVar;
    }

    public final Object apply(Object obj) {
        C122445cj cjVar;
        C122870ea eaVar = this.f340244a;
        C65185es esVar = this.f340245b;
        C122461p pVar = this.f340246c;
        C58485gu guVar = (C58485gu) obj;
        C65186et etVar = (C65186et) C65187eu.f176405e.createBuilder();
        if (pVar.f339490b == 1) {
            cjVar = (C122445cj) pVar.f339491c;
        } else {
            cjVar = C122445cj.f339450b;
        }
        String str = cjVar.f339452a;
        etVar.copyOnWrite();
        str.getClass();
        ((C65187eu) etVar.instance).f176407a = str;
        boolean z = eaVar.f340313n;
        etVar.copyOnWrite();
        ((C65187eu) etVar.instance).f176410d = z;
        etVar.mo59347a(guVar);
        esVar.copyOnWrite();
        C65191ey eyVar = (C65191ey) esVar.instance;
        C65187eu euVar = (C65187eu) etVar.build();
        C65191ey eyVar2 = C65191ey.f176424p;
        euVar.getClass();
        eyVar.f176428c = euVar;
        eyVar.f176427b = 10;
        return esVar;
    }
}
