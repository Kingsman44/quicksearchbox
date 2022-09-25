package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.android.libraries.lens.common.text.C24129e;
import com.google.android.libraries.lens.ondevice.p2037n.C24788au;
import com.google.android.libraries.lens.ondevice.p2037n.C24790aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.hf */
/* compiled from: PG */
public final class C24730hf extends C68247h {

    /* renamed from: a */
    private final C68283d f67601a;

    /* renamed from: c */
    private final C68283d f67602c;

    public C24730hf(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24730hf.class), aVar);
        this.f67601a = C68236af.m98549d(dVar);
        this.f67602c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C58833ax axVar = ((C24735hk) list.get(1)).f67615a;
        C58833ax a = C24129e.m44827a((C58127b) list.get(0));
        if (!axVar.mo56113h() || !((C24790aw) axVar.mo56107c()).f67738e || !a.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C24788au auVar = (C24788au) ((C24790aw) axVar.mo56107c()).toBuilder();
            String str = (String) a.mo56107c();
            auVar.copyOnWrite();
            C24790aw awVar = (C24790aw) auVar.instance;
            str.getClass();
            awVar.f67734a = 1 | awVar.f67734a;
            awVar.f67735b = str;
            obj2 = C58833ax.m90834k((C24790aw) auVar.build());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67601a.mo60297gq(), this.f67602c.mo60297gq());
    }
}
