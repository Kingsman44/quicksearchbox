package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62962ci;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.i.a.cb */
/* compiled from: PG */
public final class C51286cb {

    /* renamed from: a */
    public final C51303cs f133515a;

    public C51286cb(C51303cs csVar) {
        this.f133515a = csVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C51334dw mo53567a() {
        C62942bv build = this.f133515a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51334dw) build;
    }

    /* renamed from: b */
    public final void mo53568b(String str) {
        C69664n.m101061g(str, "value");
        C51303cs csVar = this.f133515a;
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C62962ci ciVar = C51334dw.f133657N;
        str.getClass();
        dwVar.f133685a |= 134217728;
        dwVar.f133709w = str;
    }

    /* renamed from: c */
    public final void mo53569c(C52428rj rjVar) {
        C69664n.m101061g(rjVar, "value");
        C51303cs csVar = this.f133515a;
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C62962ci ciVar = C51334dw.f133657N;
        rjVar.getClass();
        dwVar.f133696j = rjVar;
        dwVar.f133685a |= 256;
    }

    /* renamed from: d */
    public final void mo53570d(C51333dv dvVar) {
        C69664n.m101061g(dvVar, "value");
        C51303cs csVar = this.f133515a;
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C62962ci ciVar = C51334dw.f133657N;
        dwVar.f133703q = dvVar.f133656g;
        dwVar.f133685a |= C89885b.S3REQUEST_VALUE;
    }
}
