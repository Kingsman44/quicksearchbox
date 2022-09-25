package com.google.android.apps.search.googleapp.searchwidget;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.p5855h.p5860q.C74541e;
import com.google.android.apps.search.googleapp.homescreen.p10312b.C136148a;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10335j.C136374e;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137419h;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.p11029ao.p11030a.C147798a;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.b */
/* compiled from: PG */
public final class C138926b {

    /* renamed from: a */
    public final C139921f f377857a;

    /* renamed from: b */
    public final boolean f377858b;

    /* renamed from: c */
    public final C137419h f377859c;

    /* renamed from: d */
    public final C136374e f377860d;

    /* renamed from: e */
    private final C136148a f377861e;

    public C138926b(C139921f fVar, boolean z, C137419h hVar, C136374e eVar, C136148a aVar) {
        this.f377857a = fVar;
        this.f377858b = z;
        this.f377859c = hVar;
        this.f377860d = eVar;
        this.f377861e = aVar;
    }

    /* renamed from: a */
    public final PendingIntent mo114636a(Context context) {
        Intent intent = new Intent();
        if (!this.f377858b) {
            intent.setClassName("com.google.android.googlequicksearchbox", e.b());
            intent.setAction("android.intent.action.MAIN");
            intent.setFlags(268468224);
        } else if (this.f377861e.mo112802a()) {
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.HOME_SCREEN);
            l.mo112767b(true);
            C136127h.m221196a(intent, l.mo112766a());
        } else {
            intent = C74541e.m120515a(8);
        }
        intent.putExtra("source", "and.gsa.widget.logo");
        ClipData clipData = C147798a.f398772a;
        PendingIntent activity = PendingIntent.getActivity(context, 2, C147798a.m240896b(intent, 201326592, 0), 201326592);
        activity.getClass();
        return activity;
    }
}
