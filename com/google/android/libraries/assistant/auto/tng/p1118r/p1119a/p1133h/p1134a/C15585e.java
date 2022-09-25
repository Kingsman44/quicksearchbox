package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1133h.p1134a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122417bi;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.h.a.e */
/* compiled from: PG */
public final /* synthetic */ class C15585e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15586f f46606a;

    /* renamed from: b */
    public final /* synthetic */ C52081en f46607b;

    public /* synthetic */ C15585e(C15586f fVar, C52081en enVar) {
        this.f46606a = fVar;
        this.f46607b = enVar;
    }

    public final Object apply(Object obj) {
        C15586f fVar = this.f46606a;
        C52081en enVar = this.f46607b;
        C122419bk bkVar = (C122419bk) obj;
        if (!fVar.f46608a || !fVar.f46609b) {
            return null;
        }
        fVar.f46615h = fVar.f46610c.mo105629a();
        C122549e eVar = fVar.f46615h;
        C122417bi biVar = (C122417bi) bkVar.toBuilder();
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        biVar.copyOnWrite();
        exVar.getClass();
        ((C122419bk) biVar.instance).f339396c = exVar;
        eVar.mo105650b((C122419bk) biVar.build());
        return null;
    }
}
