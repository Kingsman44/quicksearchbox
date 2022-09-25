package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7726a;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.a.h */
/* compiled from: PG */
public final class C98795h extends C68247h {

    /* renamed from: a */
    private final C68283d f275973a;

    /* renamed from: c */
    private final C68283d f275974c;

    /* renamed from: d */
    private final C68283d f275975d;

    /* renamed from: e */
    private final C68283d f275976e;

    /* renamed from: f */
    private final C68283d f275977f;

    public C98795h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C98795h.class), aVar);
        this.f275973a = C68236af.m98549d(dVar);
        this.f275974c = C68236af.m98549d(dVar2);
        this.f275975d = C68236af.m98549d(dVar3);
        this.f275976e = C68236af.m98549d(dVar4);
        this.f275977f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        int i;
        String str;
        List list = (List) obj;
        C92504i iVar = (C92504i) list.get(0);
        C89994f fVar = (C89994f) list.get(1);
        C92460b bVar = (C92460b) list.get(2);
        C118826c cVar = (C118826c) list.get(3);
        C58833ax axVar = (C58833ax) list.get(4);
        SettableFuture settableFuture = new SettableFuture();
        boolean t = bVar.mo87208t();
        int f = bVar.mo87195f();
        if (axVar.mo56113h()) {
            C92460b a = ((C74458k) axVar.mo56107c()).mo70774a();
            t = a.mo87208t();
            i = a.mo87195f();
        } else {
            C59104x d = C98793f.f275964a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "MicroEndpointerModule");
            ((C59052c) ((C59052c) d).mo56372aa(31138)).mo56386p("AudioListeningSessionAdapterOptional is not present");
            int i2 = C90755l.f253831a;
            i = f;
        }
        if (t) {
            str = fVar.mo83863Z();
        } else {
            str = fVar.mo83885ae();
        }
        iVar.mo87265f(str, new C98790c(iVar, str, fVar, settableFuture, i), false, fVar.mo83827p());
        return settableFuture;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f275973a.mo60297gq(), this.f275974c.mo60297gq(), this.f275975d.mo60297gq(), this.f275976e.mo60297gq(), this.f275977f.mo60297gq());
    }
}
