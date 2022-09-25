package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.at */
/* compiled from: PG */
public final class C113045at {

    /* renamed from: a */
    Optional f313232a = Optional.empty();

    /* renamed from: b */
    Optional f313233b = Optional.empty();

    /* renamed from: c */
    Optional f313234c = Optional.empty();

    private C113045at() {
    }

    /* renamed from: a */
    public static C113045at m187027a(String str, List list) {
        C113045at atVar = new C113045at();
        String lowerCase = str.toLowerCase(Locale.getDefault());
        int binarySearch = Collections.binarySearch(list, lowerCase);
        if (binarySearch >= 0) {
            atVar.f313232a = Optional.m71637of(Integer.valueOf(binarySearch));
        }
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 1);
        }
        if (binarySearch < list.size() && ((String) list.get(binarySearch)).startsWith(lowerCase)) {
            atVar.f313233b = Optional.m71637of(Integer.valueOf(binarySearch));
        }
        int i = -(Collections.binarySearch(list, lowerCase, C113044as.f313231a) + 2);
        if (i >= 0 && i < list.size() && ((String) list.get(i)).startsWith(lowerCase)) {
            atVar.f313234c = Optional.m71637of(Integer.valueOf(i));
        }
        return atVar;
    }
}
