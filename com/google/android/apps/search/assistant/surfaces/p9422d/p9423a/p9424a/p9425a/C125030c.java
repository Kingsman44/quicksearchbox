package com.google.android.apps.search.assistant.surfaces.p9422d.p9423a.p9424a.p9425a;

import com.google.common.p4526f.C59052c;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.d.a.a.a.c */
/* compiled from: PG */
final class C125030c extends C57987f implements C70862aj {
    /* renamed from: a */
    public final void mo20121a() {
        this.f155056f.mo54589f(false);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C125031d.f344960a.mo56224b()).mo56382g(th)).mo56372aa(37213)).mo56386p("ResponseObserver: onError");
        this.f155056f.mo54590g(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_ERROR) {
            mo20122b(new Throwable("S3ResponseObserver get response status is error"));
        } else {
            this.f155056f.mo54591h(ciVar);
        }
    }
}
