package com.google.android.apps.gsa.staticplugins.microdetection;

import android.widget.Toast;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.n */
/* compiled from: PG */
public final /* synthetic */ class C102858n implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ MicroDetectionWorker f287282a;

    /* renamed from: b */
    public final /* synthetic */ boolean f287283b;

    /* renamed from: c */
    public final /* synthetic */ String f287284c;

    public /* synthetic */ C102858n(MicroDetectionWorker microDetectionWorker, boolean z, String str) {
        this.f287282a = microDetectionWorker;
        this.f287283b = z;
        this.f287284c = str;
    }

    public final void run() {
        MicroDetectionWorker microDetectionWorker = this.f287282a;
        boolean z = this.f287283b;
        String str = this.f287284c;
        if (z) {
            str = str.concat(" - Feedback at:\ngo/hotword-bug");
        }
        Toast.makeText(microDetectionWorker.f286975h, str, z ? 1 : 0).show();
    }
}
