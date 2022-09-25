package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5484h;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33232j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.o */
/* compiled from: PG */
public final /* synthetic */ class C33256o implements C5484h {

    /* renamed from: a */
    public final /* synthetic */ C33259r f88924a;

    public /* synthetic */ C33256o(C33259r rVar) {
        this.f88924a = rVar;
    }

    /* renamed from: a */
    public final void mo11819a(String str) {
        Optional optional;
        C33259r rVar = this.f88924a;
        String g = C33232j.m61633g(str, rVar.getResources());
        if (str != null) {
            C5033s sVar = new C5033s();
            sVar.mo9970e(str);
            if (sVar.f15892g <= 0) {
                sVar.f15892g = 1;
            }
            optional = Optional.m71637of(sVar);
        } else {
            optional = Optional.empty();
        }
        C33258q qVar = rVar.f88930c;
        if (qVar != null) {
            Optional e = C33232j.m61631e(optional, qVar.f88927c);
            C33257p pVar = rVar.f88931d;
            if (pVar != null) {
                Optional.ofNullable(str);
                pVar.mo38636a(g, e);
            }
        }
    }
}
