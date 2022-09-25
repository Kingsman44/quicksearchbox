package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import android.os.IBinder;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.br */
/* compiled from: PG */
final class C121983br {

    /* renamed from: a */
    public final C33824cj f338508a;

    /* renamed from: b */
    public final IBinder f338509b;

    public C121983br(C33824cj cjVar, IBinder iBinder) {
        C69664n.m101061g(cjVar, "process");
        C69664n.m101061g(iBinder, "token");
        this.f338508a = cjVar;
        this.f338509b = iBinder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121983br)) {
            return false;
        }
        C121983br brVar = (C121983br) obj;
        return this.f338508a == brVar.f338508a && C69664n.m101066l(this.f338509b, brVar.f338509b);
    }

    public final int hashCode() {
        return (this.f338508a.hashCode() * 31) + this.f338509b.hashCode();
    }

    public final String toString() {
        C33824cj cjVar = this.f338508a;
        IBinder iBinder = this.f338509b;
        return "ViSession(process=" + cjVar + ", token=" + iBinder + ")";
    }
}
