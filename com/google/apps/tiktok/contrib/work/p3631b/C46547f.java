package com.google.apps.tiktok.contrib.work.p3631b;

import com.google.apps.tiktok.contrib.work.C46577k;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.contrib.work.b.f */
/* compiled from: PG */
final class C46547f extends C46539ay {

    /* renamed from: a */
    private final C46577k f121712a;

    /* renamed from: b */
    private final C60870cx f121713b;

    public C46547f(C46577k kVar, C60870cx cxVar) {
        if (kVar != null) {
            this.f121712a = kVar;
            this.f121713b = cxVar;
            return;
        }
        throw new NullPointerException("Null monitor");
    }

    /* renamed from: a */
    public final C46577k mo50533a() {
        return this.f121712a;
    }

    /* renamed from: b */
    public final C60870cx mo50534b() {
        return this.f121713b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46539ay) {
            C46539ay ayVar = (C46539ay) obj;
            return this.f121712a.equals(ayVar.mo50533a()) && this.f121713b.equals(ayVar.mo50534b());
        }
    }

    public final int hashCode() {
        return ((this.f121712a.hashCode() ^ 1000003) * 1000003) ^ this.f121713b.hashCode();
    }

    public final String toString() {
        String obj = this.f121712a.toString();
        String obj2 = this.f121713b.toString();
        return "MonitorReport{monitor=" + obj + ", startReport=" + obj2 + "}";
    }
}
