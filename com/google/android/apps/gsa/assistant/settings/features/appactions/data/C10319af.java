package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.af */
/* compiled from: PG */
public final /* synthetic */ class C10319af implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f34967a;

    /* renamed from: b */
    public final /* synthetic */ long f34968b;

    public /* synthetic */ C10319af(String str, long j) {
        this.f34967a = str;
        this.f34968b = j;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = this.f34967a;
        long j = this.f34968b;
        C10339az a = C10325al.m25260a((C10341ba) obj, new C10355m(str));
        if (a.mo18431a() == 0) {
            return Collection.EL.stream(a.mo18434d()).filter(new C10356n(j)).findFirst();
        }
        return Optional.empty();
    }
}
