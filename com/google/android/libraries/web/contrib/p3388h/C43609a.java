package com.google.android.libraries.web.contrib.p3388h;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.web.contrib.h.a */
/* compiled from: PG */
public final /* synthetic */ class C43609a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C43612d f113827a;

    /* renamed from: b */
    public final /* synthetic */ String f113828b = "agaMavatarFeedbackScreenshot";

    public /* synthetic */ C43609a(C43612d dVar) {
        this.f113827a = dVar;
    }

    public final Object call() {
        C43612d dVar = this.f113827a;
        return new File(dVar.f113836c.getFilesDir(), this.f113828b);
    }
}
