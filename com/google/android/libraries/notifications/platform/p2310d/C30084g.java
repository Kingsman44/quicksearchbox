package com.google.android.libraries.notifications.platform.p2310d;

import com.google.common.base.C58838bb;
import com.google.common.base.C58898h;
import java.util.Locale;

/* renamed from: com.google.android.libraries.notifications.platform.d.g */
/* compiled from: PG */
public abstract class C30084g {

    /* renamed from: a */
    public static final C30084g f81416a = m55892b("Content-Encoding");

    /* renamed from: b */
    public static final C30084g f81417b = m55892b("X-DFE-Device-Id");

    /* renamed from: c */
    public static final C30084g f81418c = m55892b("X-DFE-Debug-Overrides");

    static {
        m55892b("Content-Type");
    }

    /* renamed from: b */
    public static C30084g m55892b(String str) {
        C58838bb.m90873h(C58898h.f156736a.mo56188g(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new C30077a(str.toLowerCase(Locale.US));
    }

    /* renamed from: a */
    public abstract String mo35458a();
}
