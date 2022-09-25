package com.facebook.litho.p329g.p330a;

import com.facebook.litho.C6154cb;
import com.facebook.litho.p325d.C6180a;
import com.facebook.litho.widget.C6479ck;
import com.facebook.litho.widget.C6491cw;

/* renamed from: com.facebook.litho.g.a.d */
/* compiled from: PG */
final class C6289d implements C6479ck {

    /* renamed from: a */
    private final C6154cb f18565a;

    public C6289d(C6154cb cbVar) {
        this.f18565a = cbVar;
    }

    /* renamed from: a */
    public final C6491cw mo13294a(Object obj, int i) {
        C6154cb cbVar = this.f18565a;
        C6293h hVar = new C6293h();
        hVar.f18571a = i;
        C6491cw cwVar = (C6491cw) cbVar.f18197b.mo13127l().mo12795N(cbVar, hVar);
        if (cwVar != null) {
            boolean z = C6180a.f18234a;
            return cwVar;
        }
        throw new IllegalStateException("Method annotated with '@OnEvent(RenderEvent.class)' is not allowed to return 'null'.");
    }
}
