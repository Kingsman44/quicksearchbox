package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.p10415i.C137509k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61366ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C137924aj implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C137924aj f375255a = new C137924aj();

    private /* synthetic */ C137924aj() {
    }

    public final C60870cx apply(Object obj) {
        int i = ((C61366ah) obj).f165947c;
        if (i < 200 || i > 299) {
            return C60856cj.m92899h(new C137509k(i));
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
