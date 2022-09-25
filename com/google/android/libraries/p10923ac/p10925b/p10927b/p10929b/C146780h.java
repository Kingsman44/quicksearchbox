package com.google.android.libraries.p10923ac.p10925b.p10927b.p10929b;

import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97248d;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C64013bw;
import com.google.protos.p4895aw.p4902b.C64014bx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70769g;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.libraries.ac.b.b.b.h */
/* compiled from: PG */
public final class C146780h extends C68247h {

    /* renamed from: a */
    private final C68283d f396319a;

    /* renamed from: c */
    private final C68283d f396320c;

    /* renamed from: d */
    private final C68283d f396321d;

    public C146780h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C146780h.class), aVar);
        this.f396319a = C68236af.m98549d(dVar);
        this.f396320c = C68236af.m98549d(dVar2);
        this.f396321d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        return C60856cj.m92900i((C64014bx) ((C64014bx) ((C64014bx) C70864c.m103731e(new C64013bw(), (C70888j) list.get(0), C70851i.f189015a)).mo62574m((C70769g) list.get(1))).mo62575n(((Long) new C97248d(((C147266a) list.get(2)).f397503b).mo6453a()).longValue(), TimeUnit.SECONDS));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396319a.mo60297gq(), this.f396320c.mo60297gq(), this.f396321d.mo60297gq());
    }
}
