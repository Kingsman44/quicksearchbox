package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.media.MediaPlayer;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62736g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.g */
/* compiled from: PG */
public final /* synthetic */ class C13421g implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C13426l f41230a;

    /* renamed from: b */
    public final /* synthetic */ BundledMessageNotification f41231b;

    /* renamed from: c */
    public final /* synthetic */ C13425k f41232c;

    /* renamed from: d */
    public final /* synthetic */ String f41233d;

    /* renamed from: e */
    public final /* synthetic */ String f41234e;

    public /* synthetic */ C13421g(C13426l lVar, BundledMessageNotification bundledMessageNotification, C13425k kVar, String str, String str2) {
        this.f41230a = lVar;
        this.f41231b = bundledMessageNotification;
        this.f41232c = kVar;
        this.f41233d = str;
        this.f41234e = str2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C13426l lVar = this.f41230a;
        BundledMessageNotification bundledMessageNotification = this.f41231b;
        C13425k kVar = this.f41232c;
        String str = this.f41233d;
        String str2 = this.f41234e;
        if (!kVar.f41242b.equals("audio")) {
            return lVar.mo21074b(bundledMessageNotification, kVar.f41241a, str, str2);
        }
        C62736g gVar = (C62736g) kVar.f41241a.get(0);
        if ((gVar.f169450a & 8) == 0) {
            return C60856cj.m92899h(new Exception("Notification audio file is not ready"));
        }
        String str3 = gVar.f169453d;
        String str4 = gVar.f169454e;
        if (lVar.f41245c == null) {
            lVar.f41245c = new MediaPlayer();
        }
        C60870cx a = C2169h.m6027a(new C13417c(lVar, gVar));
        C13418d dVar = new C13418d(lVar, bundledMessageNotification, gVar, str, str2);
        return C60846c.m92879h(a, Throwable.class, C47810es.m84966f(dVar), lVar.f41246d);
    }
}
