package com.google.android.apps.gsa.assistant.settings.features.appactions.p568d;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.d.c */
/* compiled from: PG */
public final class C10311c {

    /* renamed from: a */
    public final Context f34929a;

    /* renamed from: b */
    public final C22871g f34930b;

    /* renamed from: c */
    public final C22871g f34931c;

    /* renamed from: d */
    public Optional f34932d = Optional.empty();

    public C10311c(Context context, C22871g gVar, C22871g gVar2) {
        this.f34929a = context;
        this.f34930b = gVar;
        this.f34931c = gVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18408a() {
        if (this.f34932d.isPresent()) {
            return (C60870cx) this.f34932d.get();
        }
        return C60856cj.m92900i(C58729pv.f156485a);
    }
}
