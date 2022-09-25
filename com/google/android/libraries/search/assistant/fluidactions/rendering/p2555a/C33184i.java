package com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a;

import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.a.i */
/* compiled from: PG */
public final class C33184i {

    /* renamed from: a */
    public final C51950fc f88751a;

    /* renamed from: b */
    public final Integer f88752b;

    /* renamed from: c */
    public final boolean f88753c;

    public C33184i() {
        C51950fc fcVar = C51950fc.FORM_UI_THEME_DEFAULT;
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33184i)) {
            return false;
        }
        C33184i iVar = (C33184i) obj;
        if (this.f88751a != iVar.f88751a) {
            return false;
        }
        Integer num = iVar.f88752b;
        return C69664n.m101066l((Object) null, (Object) null);
    }

    public final int hashCode() {
        return this.f88751a.hashCode() * 31;
    }

    public final String toString() {
        C51950fc fcVar = this.f88751a;
        return "ThemeConfig(formUiTheme=" + fcVar + ", defaultThemeOverride=null)";
    }

    public C33184i(C51950fc fcVar) {
        C69664n.m101061g(fcVar, "formUiTheme");
        this.f88751a = fcVar;
        this.f88752b = null;
        this.f88753c = fcVar == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY;
    }
}
