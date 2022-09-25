package org.p5623b.p5624a;

/* renamed from: org.b.a.c */
/* compiled from: PG */
public final class C72074c extends C72108u {

    /* renamed from: a */
    public static final C72074c f191866a = new C72074c((byte) 0);

    /* renamed from: b */
    public static final C72074c f191867b = new C72074c((byte) -1);

    /* renamed from: c */
    private final byte f191868c;

    public C72074c(byte b) {
        this.f191868c = b;
    }

    /* renamed from: a */
    public final int mo63217a() {
        return 3;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        byte b = this.f191868c;
        if (z) {
            sVar.f191935a.write(1);
        }
        sVar.mo63304h(1);
        sVar.f191935a.write(b);
    }

    /* renamed from: c */
    public final boolean mo63219c(C72108u uVar) {
        if ((uVar instanceof C72074c) && mo63260e() == ((C72074c) uVar).mo63260e()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo63220d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo63260e() {
        return this.f191868c != 0;
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return mo63260e() ? f191867b : f191866a;
    }

    public final int hashCode() {
        return mo63260e() ? 1 : 0;
    }

    public final String toString() {
        return true != mo63260e() ? "FALSE" : "TRUE";
    }
}
