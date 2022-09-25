package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.c.a.a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8082b.C103493b;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c.C103560v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.dn */
/* compiled from: PG */
public final class C103605dn extends C68247h {

    /* renamed from: a */
    private final C68283d f288620a;

    /* renamed from: c */
    private final C68283d f288621c;

    public C103605dn(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103605dn.class), aVar);
        this.f288620a = C68236af.m98549d(dVar);
        this.f288621c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        byte[] byteArray;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C58833ax axVar2 = (C58833ax) list.get(1);
        if (!axVar.mo56113h() || !axVar2.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C103560v vVar = (C103560v) axVar.mo56107c();
            C92460b bVar = vVar.f288522a;
            int f = bVar.mo87195f();
            int bitCount = Integer.bitCount(bVar.mo87190a());
            C103493b bVar2 = vVar.f288523b;
            synchronized (bVar2.f288393a) {
                byteArray = bVar2.f288394b.toByteArray();
            }
            obj2 = C58833ax.m90834k(new a(f, bitCount, byteArray));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288620a.mo60297gq(), this.f288621c.mo60297gq());
    }
}
