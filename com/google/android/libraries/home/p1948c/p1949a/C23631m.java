package com.google.android.libraries.home.p1948c.p1949a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23641c;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23653o;
import com.google.android.libraries.home.p1940a.p1943c.C23404ag;
import com.google.android.libraries.home.p1940a.p1943c.C23574eu;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.c.a.m */
/* compiled from: PG */
public final class C23631m implements C23623e {

    /* renamed from: a */
    public static final C23631m f64651a = new C23631m();

    private C23631m() {
    }

    /* renamed from: c */
    public static final C23641c m44111c(Context context, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        boolean a = C23630l.m44110a(agVar);
        String string = context.getString(true != C23630l.m44110a(agVar) ? R.string.systemcontrol_action_description_turn_on : R.string.systemcontrol_action_description_turn_off);
        C69664n.m101060f(string, "applicationContext.getSt…_on\n          }\n        )");
        return new C23641c(a, string);
    }

    /* renamed from: a */
    public final C23642d mo28939a(Context context, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        return new C23653o(C23574eu.ON_OFF.f64575as, m44111c(context, agVar));
    }

    /* renamed from: b */
    public final CharSequence mo28940b(Context context, C23404ag agVar) {
        C69664n.m101061g(agVar, "device");
        String string = context.getString(true != C23630l.m44110a(agVar) ? R.string.systemcontrol_light_off_status : R.string.systemcontrol_light_on_status);
        C69664n.m101060f(string, "applicationContext.getSt…_off_status\n      }\n    )");
        return string;
    }
}
