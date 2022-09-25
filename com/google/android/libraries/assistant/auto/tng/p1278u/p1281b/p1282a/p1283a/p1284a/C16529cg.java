package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import com.google.assistant.p3897e.p3917i.p3918a.C51478je;
import com.google.assistant.p3897e.p3917i.p3918a.C51479jf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.protobuf.C63088z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.cg */
/* compiled from: PG */
public final class C16529cg extends C68247h {

    /* renamed from: a */
    private final C68283d f48518a;

    public C16529cg(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C16529cg.class), aVar);
        this.f48518a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C51478je jeVar = (C51478je) C51479jf.f134133c.createBuilder();
            C63088z byteString = ((C55876h) axVar.mo56107c()).toByteString();
            jeVar.copyOnWrite();
            C51479jf jfVar = (C51479jf) jeVar.instance;
            byteString.getClass();
            jfVar.f134135a |= 1;
            jfVar.f134136b = byteString;
            obj2 = C58833ax.m90834k((C51479jf) jeVar.build());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f48518a.mo60297gq();
    }
}
