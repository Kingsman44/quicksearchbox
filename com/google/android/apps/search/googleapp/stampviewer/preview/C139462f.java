package com.google.android.apps.search.googleapp.stampviewer.preview;

import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139352h;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60901do;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.f */
/* compiled from: PG */
final class C139462f implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139457c f379231a;

    public C139462f(C139457c cVar) {
        this.f379231a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139352h hVar = (C139352h) bVar;
        C139457c cVar = this.f379231a;
        cVar.mo114987c(5);
        if (Duration.ofNanos(cVar.f379220k.mo56159b()).compareTo(Duration.ofMillis(cVar.f379219j)) >= 0) {
            cVar.mo114986b();
        } else {
            C60872cz d = cVar.f379218i.mo29164d(C60901do.f165001a, cVar.f379219j - Duration.ofNanos(cVar.f379220k.mo56159b()).toMillis(), TimeUnit.MILLISECONDS);
            C69664n.m101060f(d, "executorService.schedule…it.MILLISECONDS\n        )");
            C46439e eVar = cVar.f379215f;
            C46438d b = C46438d.m82810b(d);
            eVar.mo50428h(b.f121541a, (Object) null, cVar.f379224o);
        }
        return C47392e.f123115a;
    }
}
