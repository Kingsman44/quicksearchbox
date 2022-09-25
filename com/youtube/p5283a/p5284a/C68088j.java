package com.youtube.p5283a.p5284a;

import com.google.p370af.C7492e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.youtube.a.a.j */
/* compiled from: PG */
public final class C68088j extends C7492e {
    /* renamed from: j */
    public static C68088j m98409j(ByteBuffer byteBuffer) {
        C68088j jVar = new C68088j();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        jVar.mo16917e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return jVar;
    }

    /* renamed from: g */
    public final float mo60232g() {
        int a = mo16913a(8);
        if (a != 0) {
            return this.f24704b.getFloat(a + this.f24703a);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final long mo60233h() {
        int a = mo16913a(18);
        if (a != 0) {
            return ((long) this.f24704b.getInt(a + this.f24703a)) & 4294967295L;
        }
        return 0;
    }

    /* renamed from: i */
    public final C68087i mo60234i() {
        C68087i iVar = new C68087i();
        int a = mo16913a(20);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        iVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return iVar;
    }

    /* renamed from: k */
    public final C68058au mo60235k() {
        C68058au auVar = new C68058au();
        int a = mo16913a(12);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        auVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return auVar;
    }

    /* renamed from: l */
    public final C68067bc mo60236l() {
        C68067bc bcVar = new C68067bc();
        int a = mo16913a(14);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        bcVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return bcVar;
    }

    /* renamed from: m */
    public final C68075bk mo60237m() {
        C68075bk bkVar = new C68075bk();
        int a = mo16913a(16);
        if (a == 0) {
            return null;
        }
        int i = a + this.f24703a;
        bkVar.mo16917e(i + this.f24704b.getInt(i), this.f24704b);
        return bkVar;
    }
}
