package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9698b;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.libraries.search.assistant.performer.communication.C35723es;
import com.google.android.libraries.search.assistant.performer.communication.C35724et;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.b.h */
/* compiled from: PG */
final class C128278h implements C35472h {

    /* renamed from: a */
    final /* synthetic */ C35724et f352828a;

    /* renamed from: b */
    final /* synthetic */ C126879a f352829b;

    /* renamed from: c */
    final /* synthetic */ C37215b f352830c;

    /* renamed from: d */
    private final C35472h f352831d;

    public C128278h(C35724et etVar, C126879a aVar, C37215b bVar) {
        this.f352828a = etVar;
        this.f352829b = aVar;
        this.f352830c = bVar;
        Context context = (Context) etVar.f93632a.mo17428b();
        context.getClass();
        C60888db dbVar = (C60888db) etVar.f93633b.mo17428b();
        dbVar.getClass();
        C46877q qVar = (C46877q) etVar.f93634c.mo17428b();
        qVar.getClass();
        PackageManager packageManager = (PackageManager) etVar.f93635d.mo17428b();
        packageManager.getClass();
        this.f352831d = new C35723es(context, dbVar, qVar, packageManager, aVar);
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        this.f352830c.mo19974a(C37176a.f97090ew);
        C60870cx a = this.f352831d.mo20766a(dyVar);
        C128277g gVar = new C128277g(this.f352830c);
        return C60922j.m93044g(a, C47810es.m84963c(gVar), C60826bg.f164896a);
    }
}
