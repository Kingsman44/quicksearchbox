package com.google.android.libraries.home.p1948c.p1949a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23643e;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23645g;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23646h;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23571er;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import com.google.android.libraries.home.p1940a.p1943c.C23583j;
import com.google.android.libraries.home.p1940a.p1943c.C23585l;
import com.google.android.libraries.home.p1955d.p1956a.C23765a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.c.a.a */
/* compiled from: PG */
public final class C23619a implements C23623e {

    /* renamed from: a */
    public static final C23619a f64631a = new C23619a();

    private C23619a() {
    }

    /* renamed from: c */
    public static final C23642d m44093c(Context context, C23404ag agVar) {
        C23583j jVar;
        C69664n.m101061g(agVar, "device");
        C23585l lVar = (C23585l) ((C23571er) C23765a.m44264a(agVar.mo28854a(C23574eu.BRIGHTNESS, C23585l.class)));
        int i = 0;
        if (!(lVar == null || (jVar = lVar.f64606c) == null)) {
            i = Integer.valueOf(jVar.f64210c).intValue();
        }
        String str = C23574eu.BRIGHTNESS.f64575as;
        String string = context.getString(R.string.systemcontrol_percentage_format);
        C69664n.m101060f(string, "applicationContext.getSt…ontrol_percentage_format)");
        C69664n.m101061g(str, "templateId");
        C69664n.m101061g(string, "formatString");
        Float valueOf = Float.valueOf((float) i);
        C23645g gVar = C23645g.f64663a;
        if (valueOf.floatValue() < 0.0f) {
            gVar.mo5761a("minValue=0.0 > currentValue=" + valueOf);
        } else if (valueOf.floatValue() <= 100.0f) {
            return new C23646h(str, valueOf.floatValue(), string);
        } else {
            gVar.mo5761a("currentValue=" + valueOf + " > maxValue=100.0");
        }
        return C23643e.f64661a;
    }

    /* renamed from: a */
    public final C23642d mo28939a(Context context, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        return m44093c(context, agVar);
    }

    /* renamed from: b */
    public final /* synthetic */ CharSequence mo28940b(Context context, C23404ag agVar) {
        return C23622d.m44099a(agVar);
    }
}
