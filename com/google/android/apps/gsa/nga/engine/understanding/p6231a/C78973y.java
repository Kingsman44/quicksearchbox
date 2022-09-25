package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.y */
/* compiled from: PG */
public final class C78973y extends C78955g {

    /* renamed from: a */
    private final C89849ae f217229a;

    /* renamed from: b */
    private final C89849ae f217230b;

    /* renamed from: c */
    private final C89849ae f217231c;

    public C78973y(C89849ae aeVar, C89849ae aeVar2, C89849ae aeVar3) {
        this.f217229a = aeVar;
        this.f217230b = aeVar2;
        this.f217231c = aeVar3;
    }

    /* renamed from: a */
    public final C89849ae mo73710a() {
        return this.f217231c;
    }

    /* renamed from: b */
    public final C89849ae mo73711b() {
        return this.f217230b;
    }

    /* renamed from: c */
    public final C89849ae mo73712c() {
        return this.f217229a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78955g) {
            C78955g gVar = (C78955g) obj;
            return this.f217229a.equals(gVar.mo73712c()) && this.f217230b.equals(gVar.mo73711b()) && this.f217231c.equals(gVar.mo73710a());
        }
    }

    public final int hashCode() {
        return ((((this.f217229a.hashCode() ^ 1000003) * 1000003) ^ this.f217230b.hashCode()) * 1000003) ^ this.f217231c.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f217229a.f245884YW);
        String num2 = Integer.toString(this.f217230b.f245884YW);
        String num3 = Integer.toString(this.f217231c.f245884YW);
        return "AppSearchClassifierEvents{startEvent=" + num + ", positiveSuccessEvent=" + num2 + ", negativeSuccessEvent=" + num3 + "}";
    }
}
