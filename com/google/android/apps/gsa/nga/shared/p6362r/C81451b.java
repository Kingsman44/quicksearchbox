package com.google.android.apps.gsa.nga.shared.p6362r;

import java.util.List;
import java.util.Locale;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.shared.r.b */
/* compiled from: PG */
public final class C81451b {
    /* renamed from: a */
    public static boolean m129570a(Locale locale, String str) {
        return ((List) DesugarArrays.stream((T[]) str.split(",")).map(C81450a.f222862a).collect(Collectors.toList())).contains(locale);
    }
}
