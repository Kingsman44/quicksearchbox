package com.google.android.apps.gsa.staticplugins.p7426ay;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57003m;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57004n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ay.k */
/* compiled from: PG */
public final class C94427k extends C68247h {

    /* renamed from: a */
    private final C68283d f264002a;

    /* renamed from: c */
    private final C68283d f264003c;

    public C94427k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C94427k.class), aVar);
        this.f264002a = C68236af.m98549d(dVar);
        this.f264003c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C87841fo foVar = (C87841fo) list.get(0);
        C90476a aVar = (C90476a) list.get(1);
        C58838bb.m90884s("gcm".equals(foVar.f237666c), "Invalid message type.");
        byte[] N = (foVar.f237664a & 4) != 0 ? foVar.f237667d.mo59174N() : null;
        C58838bb.m90866a(N, "No binary data in push message");
        int length = N.length;
        try {
            return C60856cj.m92900i((C57004n) ((C57003m) ((C57003m) C57004n.f152167g.createBuilder()).mergeFrom(N, C62921ba.m95368a())).build());
        } catch (C62974ct e) {
            throw new IllegalStateException("Bad push message received over GCM", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264002a.mo60297gq(), this.f264003c.mo60297gq());
    }
}
