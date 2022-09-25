package com.google.frameworks.client.data.android;

import com.google.common.base.C58838bb;
import com.google.common.base.C58898h;
import java.util.Locale;

/* renamed from: com.google.frameworks.client.data.android.ad */
/* compiled from: PG */
public abstract class C61362ad {
    /* renamed from: b */
    public static C61362ad m93870b(String str) {
        C58838bb.m90873h(C58898h.f156736a.mo56188g(str), "Only ASCII header keys are permitted: %s", str);
        return new C61401d(str.toLowerCase(Locale.US));
    }

    /* renamed from: a */
    public abstract String mo57931a();
}
