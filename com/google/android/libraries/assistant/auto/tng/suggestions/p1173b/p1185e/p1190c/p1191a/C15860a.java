package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1190c.p1191a;

import com.google.android.apps.auto.p450a.p451a.C8876au;
import com.google.android.apps.auto.p450a.p451a.C8877av;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C15860a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C8877av f47110a;

    public /* synthetic */ C15860a(C8877av avVar) {
        this.f47110a = avVar;
    }

    public final Object apply(Object obj) {
        C8877av avVar = this.f47110a;
        C8877av avVar2 = (C8877av) obj;
        int a = C8876au.m23504a(avVar2.f30817b);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        int a2 = C8876au.m23504a(avVar.f30817b);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a == a2 && avVar2.f30818c.size() == avVar.f30818c.size()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
