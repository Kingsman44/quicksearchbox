package org.p5633c.p5634a.p5640f;

import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.f.i */
/* compiled from: PG */
public final class C72279i extends C72288l {
    private static final long serialVersionUID = -3513011772763289092L;

    /* renamed from: a */
    private final String f192381a;

    /* renamed from: f */
    private final int f192382f;

    /* renamed from: g */
    private final int f192383g;

    public C72279i(String str, String str2, int i, int i2) {
        super(str);
        this.f192381a = str2;
        this.f192382f = i;
        this.f192383g = i2;
    }

    /* renamed from: a */
    public final int mo37823a(long j) {
        return this.f192382f;
    }

    /* renamed from: b */
    public final int mo37824b(long j) {
        return this.f192383g;
    }

    /* renamed from: d */
    public final long mo37826d(long j) {
        return j;
    }

    /* renamed from: e */
    public final long mo37827e(long j) {
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72279i) {
            C72279i iVar = (C72279i) obj;
            return this.f192423d.equals(iVar.f192423d) && this.f192383g == iVar.f192383g && this.f192382f == iVar.f192382f;
        }
    }

    /* renamed from: g */
    public final String mo37830g(long j) {
        return this.f192381a;
    }

    /* renamed from: h */
    public final boolean mo37831h() {
        return true;
    }

    public final int hashCode() {
        return this.f192423d.hashCode() + (this.f192383g * 37) + (this.f192382f * 31);
    }

    /* renamed from: i */
    public final int mo63661i(long j) {
        return this.f192382f;
    }
}
