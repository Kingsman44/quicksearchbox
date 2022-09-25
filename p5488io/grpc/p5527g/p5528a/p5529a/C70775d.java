package p5488io.grpc.p5527g.p5528a.p5529a;

import p5589m.C71831h;
import p5589m.C71832i;

/* renamed from: io.grpc.g.a.a.d */
/* compiled from: PG */
public final class C70775d {

    /* renamed from: a */
    public static final C71832i f188719a = C71831h.m105170a(":status");

    /* renamed from: b */
    public static final C71832i f188720b = C71831h.m105170a(":method");

    /* renamed from: c */
    public static final C71832i f188721c = C71831h.m105170a(":path");

    /* renamed from: d */
    public static final C71832i f188722d = C71831h.m105170a(":scheme");

    /* renamed from: e */
    public static final C71832i f188723e = C71831h.m105170a(":authority");

    /* renamed from: f */
    public final C71832i f188724f;

    /* renamed from: g */
    public final C71832i f188725g;

    /* renamed from: h */
    final int f188726h;

    static {
        C71832i iVar = C71832i.f191357a;
        C71831h.m105170a(":host");
        C71831h.m105170a(":version");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C70775d(String str, String str2) {
        this(C71831h.m105170a(str), C71831h.m105170a(str2));
        C71832i iVar = C71832i.f191357a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C70775d) {
            C70775d dVar = (C70775d) obj;
            if (!this.f188724f.equals(dVar.f188724f) || !this.f188725g.equals(dVar.f188725g)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f188724f.hashCode() + 527) * 31) + this.f188725g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", new Object[]{this.f188724f.mo63097d(), this.f188725g.mo63097d()});
    }

    public C70775d(C71832i iVar, C71832i iVar2) {
        this.f188724f = iVar;
        this.f188725g = iVar2;
        this.f188726h = iVar.mo63094b() + 32 + iVar2.mo63094b();
    }
}
