package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d;

import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13529e;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.f */
/* compiled from: PG */
public final /* synthetic */ class C13520f implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C58490gz f41453a;

    public /* synthetic */ C13520f(C58490gz gzVar) {
        this.f41453a = gzVar;
    }

    public final void accept(Object obj, Object obj2) {
        C58490gz gzVar = this.f41453a;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        C13529e a = C13529e.m29814a(num.intValue());
        if (a != null) {
            gzVar.mo55429h(a, f);
        } else {
            ((C59052c) ((C59052c) C13526l.f41459c.mo56225c()).mo56372aa(44868)).mo56389s("Invalid type value %d in the request", num);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
