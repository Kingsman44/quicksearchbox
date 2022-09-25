package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import com.android.p256b.C5033s;
import com.android.recurrencepicker.C5484h;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.p */
/* compiled from: PG */
final class C11328p implements C5484h {

    /* renamed from: a */
    final /* synthetic */ C11331s f36804a;

    public C11328p(C11331s sVar) {
        this.f36804a = sVar;
    }

    /* renamed from: a */
    public final void mo11819a(String str) {
        C58833ax axVar;
        String g = C11306d.m26907g(str, this.f36804a.getResources());
        if (str != null) {
            C5033s sVar = new C5033s();
            sVar.mo9970e(str);
            if (sVar.f15892g <= 0) {
                sVar.f15892g = 1;
            }
            axVar = C58833ax.m90834k(sVar);
        } else {
            axVar = C58836b.f156633a;
        }
        this.f36804a.f36810c.mo19762c(C58833ax.m90833j(str), g, C11306d.m26905e(axVar, this.f36804a.f36809b.f36807c));
    }
}
