package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c;

import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.e */
/* compiled from: PG */
public final class C131856e {
    /* renamed from: a */
    public static String m214331a(String str, String str2, Optional optional) {
        AtomicReference atomicReference = new AtomicReference(str);
        optional.ifPresentOrElse(new C131850a(atomicReference, str2), new C131852b(atomicReference, str2));
        String str3 = (String) atomicReference.get();
        C58838bb.m90877l(str3.length() <= 100, "The Geofence ID '%s' cannot exceed %s characters; see http://shortn/_in2dIWuRC3", str3, 100);
        return str3;
    }
}
