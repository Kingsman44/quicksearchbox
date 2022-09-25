package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c;

import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131860c;
import com.google.android.apps.search.assistant.verticals.automation.routines.p10028d.C131871n;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.a */
/* compiled from: PG */
public final /* synthetic */ class C131850a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f360079a;

    /* renamed from: b */
    public final /* synthetic */ String f360080b;

    public /* synthetic */ C131850a(AtomicReference atomicReference, String str) {
        this.f360079a = atomicReference;
        this.f360080b = str;
    }

    public final void accept(Object obj) {
        String str;
        AtomicReference atomicReference = this.f360079a;
        String str2 = this.f360080b;
        boolean z = obj instanceof C131871n;
        boolean z2 = true;
        if (!z && !(obj instanceof C131860c)) {
            z2 = false;
        }
        C58838bb.m90869d(z2, "Invalid standalone app geofence parameters");
        if (z) {
            C131871n nVar = (C131871n) obj;
            nVar.getClass();
            C131857f.m214333b(nVar);
            C62910ar arVar = nVar.f360110c;
            if (arVar == null) {
                arVar = C62910ar.f169858c;
            }
            str = String.valueOf(C62948a.m95454e(arVar));
        } else {
            C131860c cVar = (C131860c) obj;
            cVar.getClass();
            C131857f.m214332a(cVar);
            C62910ar arVar2 = cVar.f360091b;
            if (arVar2 == null) {
                arVar2 = C62910ar.f169858c;
            }
            str = String.valueOf(C62948a.m95454e(arVar2));
        }
        DesugarAtomicReference.getAndUpdate(atomicReference, new C131855d(str2, str));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
