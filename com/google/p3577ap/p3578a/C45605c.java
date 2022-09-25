package com.google.p3577ap.p3578a;

import com.google.protobuf.C63088z;

/* renamed from: com.google.ap.a.c */
/* compiled from: PG */
public final class C45605c extends C45610h {

    /* renamed from: a */
    private final String f119960a;

    /* renamed from: b */
    private final int f119961b;

    /* renamed from: c */
    private final int f119962c;

    /* renamed from: d */
    private final int f119963d;

    /* renamed from: e */
    private final int f119964e;

    /* renamed from: f */
    private final int f119965f;

    /* renamed from: g */
    private final C45608f f119966g;

    /* renamed from: h */
    private final boolean f119967h;

    public C45605c(String str, int i, int i2, int i3, int i4, int i5, C45608f fVar, boolean z) {
        this.f119960a = str;
        this.f119961b = i;
        this.f119962c = i2;
        this.f119963d = i3;
        this.f119964e = i4;
        this.f119965f = i5;
        this.f119966g = fVar;
        this.f119967h = z;
    }

    /* renamed from: a */
    public final int mo49692a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo49693b() {
        return this.f119965f;
    }

    /* renamed from: c */
    public final int mo49694c() {
        return this.f119964e;
    }

    /* renamed from: d */
    public final int mo49695d() {
        return this.f119963d;
    }

    /* renamed from: e */
    public final int mo49696e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45610h) {
            C45610h hVar = (C45610h) obj;
            return this.f119960a.equals(hVar.mo49704k()) && this.f119961b == hVar.mo49700h() && this.f119962c == hVar.mo49699g() && this.f119963d == hVar.mo49695d() && this.f119964e == hVar.mo49694c() && this.f119965f == hVar.mo49693b() && hVar.mo49696e() == 0 && hVar.mo49698f() == 0 && hVar.mo49692a() == 0 && this.f119966g.equals(hVar.mo49702i()) && hVar.mo49703j() == null && this.f119967h == hVar.mo49706m() && !hVar.mo49705l();
        }
    }

    /* renamed from: f */
    public final int mo49698f() {
        return 0;
    }

    /* renamed from: g */
    public final int mo49699g() {
        return this.f119962c;
    }

    /* renamed from: h */
    public final int mo49700h() {
        return this.f119961b;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f119960a.hashCode() ^ 1000003) * 1000003) ^ this.f119961b) * 1000003) ^ this.f119962c) * 1000003) ^ this.f119963d) * 1000003) ^ this.f119964e) * 1000003) ^ this.f119965f) * 1525764945) ^ this.f119966g.hashCode()) * -721379959) ^ (true != this.f119967h ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    /* renamed from: i */
    public final C45608f mo49702i() {
        return this.f119966g;
    }

    /* renamed from: j */
    public final C63088z mo49703j() {
        return null;
    }

    /* renamed from: k */
    public final String mo49704k() {
        return this.f119960a;
    }

    /* renamed from: l */
    public final boolean mo49705l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo49706m() {
        return this.f119967h;
    }

    public final String toString() {
        String str = this.f119960a;
        int i = this.f119961b;
        int i2 = this.f119962c;
        int i3 = this.f119963d;
        int i4 = this.f119964e;
        int i5 = this.f119965f;
        String obj = this.f119966g.toString();
        boolean z = this.f119967h;
        return "InputItem{id=" + str + ", thumbWidth=" + i + ", thumbHeight=" + i2 + ", imageWidth=" + i3 + ", imageHeight=" + i4 + ", colSpan=" + i5 + ", textHeight=0, textWidth=0, boxWidth=0, cropHints=" + obj + ", deepcropBytes=null, visible=" + z + ", limitDisplaySize=false}";
    }
}
