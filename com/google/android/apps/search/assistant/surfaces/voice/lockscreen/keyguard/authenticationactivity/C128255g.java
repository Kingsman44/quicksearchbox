package com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.authenticationactivity;

import android.app.Activity;
import android.app.KeyguardManager;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9694b.C128258a;
import com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.p9695c.C128260b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.lockscreen.keyguard.authenticationactivity.g */
/* compiled from: PG */
final class C128255g extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ int f352780a;

    /* renamed from: b */
    final /* synthetic */ Activity f352781b;

    /* renamed from: c */
    final /* synthetic */ C128256h f352782c;

    /* renamed from: d */
    final /* synthetic */ C128260b f352783d;

    public C128255g(C128256h hVar, C128260b bVar, int i, Activity activity) {
        this.f352782c = hVar;
        this.f352783d = bVar;
        this.f352780a = i;
        this.f352781b = activity;
    }

    public final void onDismissCancelled() {
        ((C59052c) ((C59052c) C128256h.f352784a.mo56224b()).mo56372aa(37815)).mo56386p("Keyguard dismiss canceled");
        C128260b bVar = this.f352783d;
        bVar.f352795a.mo5437b(C128258a.CANCELLED);
        this.f352782c.f352786c.mo108394a(this.f352780a);
        this.f352781b.finish();
        super.onDismissCancelled();
    }

    public final void onDismissError() {
        ((C59052c) ((C59052c) C128256h.f352784a.mo56224b()).mo56372aa(37816)).mo56386p("Keyguard dismiss errored");
        C128260b bVar = this.f352783d;
        bVar.f352795a.mo5437b(C128258a.ERROR);
        this.f352782c.f352786c.mo108394a(this.f352780a);
        this.f352781b.finish();
        super.onDismissError();
    }

    public final void onDismissSucceeded() {
        ((C59052c) ((C59052c) C128256h.f352784a.mo56224b()).mo56372aa(37817)).mo56386p("Keyguard dismiss succeeded");
        C128260b bVar = this.f352783d;
        bVar.f352795a.mo5437b(C128258a.SUCCEEDED);
        this.f352782c.f352786c.mo108394a(this.f352780a);
        this.f352781b.finish();
        super.onDismissSucceeded();
    }
}
