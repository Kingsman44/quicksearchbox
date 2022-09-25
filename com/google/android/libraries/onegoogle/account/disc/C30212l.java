package com.google.android.libraries.onegoogle.account.disc;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.l */
/* compiled from: PG */
public final class C30212l extends C30192at {

    /* renamed from: a */
    private final C30194av f81675a;

    /* renamed from: b */
    private final String f81676b;

    /* renamed from: c */
    private final C30186an f81677c;

    /* renamed from: d */
    private final int f81678d;

    public C30212l(C30186an anVar, C30194av avVar, String str, int i) {
        this.f81677c = anVar;
        this.f81675a = avVar;
        this.f81676b = str;
        this.f81678d = i;
    }

    /* renamed from: a */
    public final C30194av mo35645a() {
        return this.f81675a;
    }

    /* renamed from: b */
    public final String mo35646b() {
        return this.f81676b;
    }

    /* renamed from: c */
    public final C30186an mo35647c() {
        return this.f81677c;
    }

    /* renamed from: d */
    public final int mo35648d() {
        return this.f81678d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30192at) {
            C30192at atVar = (C30192at) obj;
            C30186an anVar = this.f81677c;
            if (anVar != null ? anVar.equals(atVar.mo35647c()) : atVar.mo35647c() == null) {
                C30194av avVar = this.f81675a;
                if (avVar != null ? avVar.equals(atVar.mo35645a()) : atVar.mo35645a() == null) {
                    String str = this.f81676b;
                    if (str != null ? str.equals(atVar.mo35646b()) : atVar.mo35646b() == null) {
                        int i = this.f81678d;
                        if (i != 0 ? i == atVar.mo35648d() : atVar.mo35648d() == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f81677c);
        String valueOf2 = String.valueOf(this.f81675a);
        String str = this.f81676b;
        int i = this.f81678d;
        String num = i != 0 ? Integer.toString(i - 1) : "null";
        return "RingContent{scalableRingDrawableProvider=" + valueOf + ", ringDrawableProvider=" + valueOf2 + ", contentDescription=" + str + ", discAnimationType=" + num + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        C30186an anVar = this.f81677c;
        int i3 = 0;
        if (anVar == null) {
            i = 0;
        } else {
            i = anVar.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        C30194av avVar = this.f81675a;
        if (avVar == null) {
            i2 = 0;
        } else {
            i2 = avVar.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        String str = this.f81676b;
        int hashCode = (i5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i6 = this.f81678d;
        if (i6 != 0) {
            i3 = i6;
        }
        return hashCode ^ i3;
    }
}
