package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33213b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33217f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33218g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33221j;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d.C33222k;
import com.google.apps.tiktok.inject.C47231d;
import com.google.assistant.p3897e.p3921j.p3926e.C51952fe;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.o */
/* compiled from: PG */
public final class C33201o {
    @Deprecated

    /* renamed from: a */
    public static final C33217f f88803a = C33217f.DEFAULT;

    /* renamed from: a */
    public static final C33177b m61573a(View view) {
        if (view instanceof C33177b) {
            return (C33177b) view;
        }
        if (view instanceof C47231d) {
            Object z = ((C47231d) view).mo17754z();
            if (z instanceof C33177b) {
                return (C33177b) z;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final C33222k m61574b(C33221j jVar, C51952fe feVar, C33218g gVar) {
        C33213b bVar = new C33213b();
        bVar.f88820a = gVar;
        bVar.mo38595b(jVar);
        bVar.mo38596c(feVar);
        C33222k a = bVar.mo38594a();
        C69664n.m101060f(a, "builder()\n      .setForm…gStrategy)\n      .build()");
        return a;
    }
}
