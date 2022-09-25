package com.google.android.libraries.componentview.services.application;

import com.google.common.base.C58838bb;
import com.google.common.base.C58898h;
import java.util.Locale;

/* renamed from: com.google.android.libraries.componentview.services.application.bd */
/* compiled from: PG */
public abstract class C20577bd {
    /* renamed from: b */
    public static C20577bd m38612b(String str) {
        C58838bb.m90873h(C58898h.f156736a.mo56188g(str), "Only ASCII header keys are permitted: %s", str);
        return new C20600c(str.toLowerCase(Locale.US));
    }

    /* renamed from: a */
    public abstract String mo25515a();
}
