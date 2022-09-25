package com.google.android.apps.search.googleapp.homescreen.p10315e.p10317b;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b.o */
/* compiled from: PG */
public final class C136174o {

    /* renamed from: a */
    public final String f370853a;

    /* renamed from: b */
    public final List f370854b;

    public C136174o(String str, List list) {
        C69664n.m101061g(list, "weatherConditions");
        this.f370853a = str;
        this.f370854b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136174o)) {
            return false;
        }
        C136174o oVar = (C136174o) obj;
        return C69664n.m101066l(this.f370853a, oVar.f370853a) && C69664n.m101066l(this.f370854b, oVar.f370854b);
    }

    public final int hashCode() {
        return (this.f370853a.hashCode() * 31) + this.f370854b.hashCode();
    }

    public final String toString() {
        String str = this.f370853a;
        List list = this.f370854b;
        return "WeatherWidgetData(displayTemperature=" + str + ", weatherConditions=" + list + ")";
    }
}
