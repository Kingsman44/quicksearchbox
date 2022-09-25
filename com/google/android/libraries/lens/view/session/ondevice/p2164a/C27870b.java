package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24282h;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.lens.p4701g.C62331d;
import com.google.protos.p4816ai.p4820d.p4826d.p4827a.C63240m;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.b */
/* compiled from: PG */
final class C27870b extends C27891h {

    /* renamed from: a */
    public final C62331d f75954a;

    /* renamed from: b */
    public final C24795f f75955b;

    /* renamed from: c */
    public final C24282h f75956c;

    /* renamed from: d */
    public final C63240m f75957d;

    public C27870b(C62331d dVar, C24795f fVar, C24282h hVar, C63240m mVar) {
        this.f75954a = dVar;
        this.f75955b = fVar;
        this.f75956c = hVar;
        this.f75957d = mVar;
    }

    /* renamed from: a */
    public final C24282h mo33344a() {
        return this.f75956c;
    }

    /* renamed from: b */
    public final C24795f mo33345b() {
        return this.f75955b;
    }

    /* renamed from: c */
    public final C27890g mo33346c() {
        return new C27797a(this);
    }

    /* renamed from: d */
    public final C62331d mo33347d() {
        return this.f75954a;
    }

    /* renamed from: e */
    public final C63240m mo33348e() {
        return this.f75957d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27891h) {
            C27891h hVar = (C27891h) obj;
            return this.f75954a.equals(hVar.mo33347d()) && this.f75955b.equals(hVar.mo33345b()) && this.f75956c.equals(hVar.mo33344a()) && this.f75957d.equals(hVar.mo33348e());
        }
    }

    public final int hashCode() {
        return ((((((this.f75954a.hashCode() ^ 1000003) * 1000003) ^ this.f75955b.hashCode()) * 1000003) ^ this.f75956c.hashCode()) * 1000003) ^ this.f75957d.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f75954a.f168273v);
        String obj = this.f75955b.toString();
        String obj2 = this.f75956c.toString();
        String obj3 = this.f75957d.toString();
        return "CascadeConfiguration{cascadeType=" + num + ", loadConfig=" + obj + ", runtimeParameters=" + obj2 + ", modelMetadata=" + obj3 + "}";
    }
}
