package com.google.android.apps.search.assistant.verticals.newsplayer.p10068e;

import androidx.media3.common.C2646bh;
import androidx.media3.common.C2666j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.e.d */
/* compiled from: PG */
public final /* synthetic */ class C132423d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C132441v f361436a;

    /* renamed from: b */
    public final /* synthetic */ C132419ac f361437b;

    /* renamed from: c */
    public final /* synthetic */ C62910ar f361438c;

    public /* synthetic */ C132423d(C132441v vVar, C132419ac acVar, C62910ar arVar) {
        this.f361436a = vVar;
        this.f361437b = acVar;
        this.f361438c = arVar;
    }

    public final void run() {
        C132441v vVar = this.f361436a;
        C132419ac acVar = this.f361437b;
        C62910ar arVar = this.f361438c;
        C2646bh r = vVar.mo110724r(acVar.f361431d);
        C2666j jVar = (C2666j) r;
        jVar.mo5973A(jVar.mo5996c(), C62948a.m95453d(arVar));
        if (vVar.f361480o != 2) {
            new C132440u(vVar).run();
        }
    }
}
