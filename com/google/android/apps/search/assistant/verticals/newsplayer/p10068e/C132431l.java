package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import android.os.Handler;
import com.google.android.apps.search.assistant.verticals.newsplayer.media.C132446a;
import com.google.android.apps.search.assistant.verticals.newsplayer.p10066c.C132412d;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.l */
/* compiled from: PG */
public final /* synthetic */ class C132431l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C132441v f361448a;

    /* renamed from: b */
    public final /* synthetic */ C47770dh f361449b;

    /* renamed from: c */
    public final /* synthetic */ C132412d f361450c;

    public /* synthetic */ C132431l(C132441v vVar, C47770dh dhVar, C132412d dVar) {
        this.f361448a = vVar;
        this.f361449b = dhVar;
        this.f361450c = dVar;
    }

    public final void run() {
        C132441v vVar = this.f361448a;
        C47770dh dhVar = this.f361449b;
        C132412d dVar = this.f361450c;
        C132446a q = vVar.mo110715q();
        q.f361493a.mo1040h(new C132433n(dhVar, dVar), (Handler) null);
    }
}
