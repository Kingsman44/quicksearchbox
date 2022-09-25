package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p777b.p779b;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.b.b.b.t */
/* compiled from: PG */
public final class C12267t extends C68247h {

    /* renamed from: a */
    private final C68283d f39036a;

    /* renamed from: c */
    private final C68283d f39037c;

    /* renamed from: d */
    private final C68283d f39038d;

    public C12267t(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C12267t.class), aVar);
        this.f39036a = C68236af.m98549d(dVar);
        this.f39037c = C68236af.m98549d(dVar2);
        this.f39038d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C68283d dVar = this.f39037c;
        C68283d dVar2 = this.f39038d;
        if (booleanValue) {
            ((C59052c) ((C59052c) C12260m.f39021a.mo56224b()).mo56372aa(44146)).mo56386p("running query based request");
            return dVar.mo60297gq();
        }
        ((C59052c) ((C59052c) C12260m.f39021a.mo56224b()).mo56372aa(44145)).mo56386p("running conversationDelta based request");
        return dVar2.mo60297gq();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f39036a.mo60297gq();
    }
}
