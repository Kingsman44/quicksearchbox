package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import android.graphics.Bitmap;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61539c;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.protobuf.C62942bv;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$onHandleScreenshot$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {160})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ad */
/* compiled from: PG */
final class C33764ad extends C69572j implements C69626l {

    /* renamed from: a */
    int f90174a;

    /* renamed from: b */
    final /* synthetic */ C33768ah f90175b;

    /* renamed from: c */
    final /* synthetic */ Bitmap f90176c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33764ad(C33768ah ahVar, Bitmap bitmap, C69577g gVar) {
        super(1, gVar);
        this.f90175b = ahVar;
        this.f90176c = bitmap;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33764ad(this.f90175b, this.f90176c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C33850di diVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90174a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C33787b bVar = this.f90175b.f90186b;
            Bitmap bitmap = this.f90176c;
            this.f90174a = 1;
            if (bitmap != null) {
                C33850di diVar2 = bVar.f90237a;
                C61541e eVar = C33487a.f89617b;
                C69664n.m101060f(eVar, "BITMAP_KEYS");
                diVar = (C33850di) C61539c.m94271a(diVar2, eVar, bitmap);
            } else {
                diVar = bVar.f90237a;
            }
            C33803bp bpVar = (C33803bp) C33804bq.f90256a.createBuilder();
            C69664n.m101060f(bpVar, "newBuilder()");
            C69664n.m101061g(bpVar, "builder");
            C62942bv build = bpVar.build();
            C69664n.m101060f(build, "_builder.build()");
            if (diVar.mo39095h((C33804bq) build, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
