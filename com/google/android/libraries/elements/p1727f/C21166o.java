package com.google.android.libraries.elements.p1727f;

import com.google.android.libraries.elements.interfaces.Component;
import com.google.protos.youtube.elements.p5166b.C66105j;
import p5488io.p5490b.p5519k.C70118f;

/* renamed from: com.google.android.libraries.elements.f.o */
/* compiled from: PG */
public final class C21166o {

    /* renamed from: a */
    public final C70118f f59366a = new C70118f();

    /* renamed from: b */
    public Component f59367b;

    /* renamed from: c */
    public final String f59368c;

    /* renamed from: d */
    public C66105j f59369d;

    /* renamed from: e */
    public final Object f59370e = new Object();

    public C21166o(String str, Component component) {
        this.f59368c = str;
        this.f59367b = component;
    }

    /* renamed from: a */
    public final void mo26195a(C66105j jVar) {
        synchronized (this.f59370e) {
            this.f59369d = jVar;
        }
    }

    public final String toString() {
        String str = this.f59368c;
        boolean z = this.f59369d != null;
        return "DebuggerInfo(" + str + ", " + z + ")";
    }
}
