package com.google.android.apps.search.googleapp.discover.p10199k;

import android.os.Build;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.googleapp.discover.k.b */
/* compiled from: PG */
public final class C134456b {

    /* renamed from: a */
    private static final C58528ij f366190a = C58528ij.m90015O("SM-F9260", "SM-F926B", "SM-F926N", "SM-F926U", "SM-F926U1", "SM-F926W", new String[0]);

    /* renamed from: b */
    private static final C58528ij f366191b = C58528ij.m90015O("SM-F936U", "SM-F936W", "SM-F936U1", "SM-F936N", "SM-F9360", "SM-F936B", "SC-55C", "SCG16");

    /* renamed from: c */
    private static final C58528ij f366192c = C58528ij.m90015O("SM-X700", "SM-X706B", "SM-X706C", "SM-X706N", "SM-X900", "SM-X906B", "SM-X906C", "SM-X906N", "SM-X800", "SM-X806B", "SM-X806C", "SM-X806N", "SM-X808U");

    /* renamed from: d */
    private static final C58528ij f366193d = C58528ij.m90014N("SM-T636B", "SM-T636N", "SM-T638U", "SM-T638B", "SM-T630");

    /* renamed from: e */
    private final boolean f366194e;

    public C134456b(boolean z) {
        this.f366194e = z;
    }

    /* renamed from: a */
    public final boolean mo111787a() {
        if (C58890d.m90990e(Build.MANUFACTURER, "Samsung") && f366190a.contains(Build.MODEL)) {
            return true;
        }
        if (C58890d.m90990e(Build.MANUFACTURER, "Samsung") && f366192c.contains(Build.MODEL)) {
            return true;
        }
        if (!C58890d.m90990e(Build.MANUFACTURER, "Samsung") || !f366191b.contains(Build.MODEL)) {
            return C58890d.m90990e(Build.MANUFACTURER, "Samsung") && f366193d.contains(Build.MODEL);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo111788b() {
        if (this.f366194e || mo111787a()) {
            return true;
        }
        return C58890d.m90990e(Build.MANUFACTURER, "Google") && "Felix".equals(Build.MODEL);
    }
}
