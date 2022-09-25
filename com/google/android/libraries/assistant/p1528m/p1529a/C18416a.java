package com.google.android.libraries.assistant.p1528m.p1529a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.android.libraries.assistant.m.a.a */
/* compiled from: PG */
public final class C18416a extends C18424i {

    /* renamed from: a */
    private final double f52260a;

    /* renamed from: b */
    private final C58485gu f52261b;

    /* renamed from: c */
    private final C63037fb f52262c;

    /* renamed from: d */
    private final C63037fb f52263d;

    public C18416a(double d, C58485gu guVar, C63037fb fbVar, C63037fb fbVar2) {
        this.f52260a = d;
        if (guVar != null) {
            this.f52261b = guVar;
            if (fbVar != null) {
                this.f52262c = fbVar;
                if (fbVar2 != null) {
                    this.f52263d = fbVar2;
                    return;
                }
                throw new NullPointerException("Null deviceInfo");
            }
            throw new NullPointerException("Null userInfo");
        }
        throw new NullPointerException("Null urlLoadingOverrideWhitelist");
    }

    /* renamed from: a */
    public final double mo23909a() {
        return this.f52260a;
    }

    /* renamed from: b */
    public final C58485gu mo23910b() {
        return this.f52261b;
    }

    /* renamed from: c */
    public final C63037fb mo23911c() {
        return this.f52263d;
    }

    /* renamed from: d */
    public final C63037fb mo23912d() {
        return this.f52262c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18424i) {
            C18424i iVar = (C18424i) obj;
            return Double.doubleToLongBits(this.f52260a) == Double.doubleToLongBits(iVar.mo23909a()) && C58597ky.m90218i(this.f52261b, iVar.mo23910b()) && this.f52262c.equals(iVar.mo23912d()) && this.f52263d.equals(iVar.mo23911c());
        }
    }

    public final int hashCode() {
        return this.f52263d.hashCode() ^ ((((((((int) ((Double.doubleToLongBits(this.f52260a) >>> 32) ^ Double.doubleToLongBits(this.f52260a))) ^ 1000003) * 1000003) ^ this.f52261b.hashCode()) * 1000003) ^ this.f52262c.hashCode()) * 1000003);
    }

    public final String toString() {
        double d = this.f52260a;
        String obj = this.f52261b.toString();
        String obj2 = this.f52262c.toString();
        String obj3 = this.f52263d.toString();
        return "HostConfiguration{headerHeightDp=" + d + ", urlLoadingOverrideWhitelist=" + obj + ", userInfo=" + obj2 + ", deviceInfo=" + obj3 + "}";
    }
}
