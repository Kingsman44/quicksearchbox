package com.google.android.libraries.search.assistant.fluidactions.rendering.p2558c;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0815b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.c.b */
/* compiled from: PG */
final /* synthetic */ class C33188b implements C0815b {

    /* renamed from: a */
    final /* synthetic */ C33190d f88764a;

    public C33188b(C33190d dVar) {
        this.f88764a = dVar;
    }

    public final /* bridge */ /* synthetic */ void onActivityResult(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        C69664n.m101061g(activityResult, "p0");
        C0815b bVar = this.f88764a.f88773f;
        if (bVar != null) {
            bVar.onActivityResult(activityResult);
        }
    }
}
