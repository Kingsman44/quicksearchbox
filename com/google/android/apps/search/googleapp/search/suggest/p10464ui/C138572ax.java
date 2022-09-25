package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.app.Activity;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.googleapp.search.p10412h.p10414b.C137470a;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138584i;
import com.google.android.libraries.performance.primes.metrics.p2414h.C31499r;
import com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.ax */
/* compiled from: PG */
final class C138572ax implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C138558am f376899a;

    public C138572ax(C138558am amVar) {
        this.f376899a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C138584i iVar = (C138584i) bVar;
        C137470a aVar = this.f376899a.f376869j;
        if (!aVar.f373907b.f373911b) {
            aVar.f373906a.mo41630d(C37248a.f98948N.mo40811d(aVar.f373909d.mo26872d()));
            aVar.f373908c.mo83763g(C89849ae.SEARCH_OVERLAY_STARTUP_KEYBOARD_SHOWN);
            if (aVar.f373907b.f373912c) {
                aVar.f373908c.mo83760d();
                aVar.f373906a.mo41634h();
                C31499r.f84816a.mo37197a((Activity) null);
            }
            aVar.f373907b.f373911b = true;
        }
        return C47392e.f123115a;
    }
}
