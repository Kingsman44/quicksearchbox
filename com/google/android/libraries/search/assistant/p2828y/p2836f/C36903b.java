package com.google.android.libraries.search.assistant.p2828y.p2836f;

import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.search.assistant.y.f.b */
/* compiled from: PG */
final class C36903b extends C36906e {

    /* renamed from: a */
    private final boolean f96094a;

    /* renamed from: b */
    private final C58528ij f96095b;

    /* renamed from: c */
    private final C58528ij f96096c;

    /* renamed from: d */
    private final C58528ij f96097d;

    public C36903b(boolean z, C58528ij ijVar, C58528ij ijVar2, C58528ij ijVar3) {
        this.f96094a = z;
        this.f96095b = ijVar;
        this.f96096c = ijVar2;
        this.f96097d = ijVar3;
    }

    /* renamed from: a */
    public final C58528ij mo40452a() {
        return this.f96095b;
    }

    /* renamed from: b */
    public final C58528ij mo40453b() {
        return this.f96096c;
    }

    /* renamed from: c */
    public final C58528ij mo40454c() {
        return this.f96097d;
    }

    /* renamed from: d */
    public final boolean mo40455d() {
        return this.f96094a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36906e) {
            C36906e eVar = (C36906e) obj;
            return this.f96094a == eVar.mo40455d() && this.f96095b.equals(eVar.mo40452a()) && this.f96096c.equals(eVar.mo40453b()) && this.f96097d.equals(eVar.mo40454c());
        }
    }

    public final int hashCode() {
        return (((((((true != this.f96094a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f96095b.hashCode()) * 1000003) ^ this.f96096c.hashCode()) * 1000003) ^ this.f96097d.hashCode();
    }

    public final String toString() {
        boolean z = this.f96094a;
        String obj = this.f96095b.toString();
        String obj2 = this.f96096c.toString();
        String obj3 = this.f96097d.toString();
        return "ClockContextReaderConfiguration{useClockAppSelectionDataServiceInPortmon=" + z + ", supportedAlarmAndroidIntents=" + obj + ", supportedTimerAndroidIntents=" + obj2 + ", versionedClockApps=" + obj3 + "}";
    }
}
