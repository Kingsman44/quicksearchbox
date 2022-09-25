package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3111c.p3112a.p3113a;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a.C64171l;
import com.google.protos.p5146w.p5149b.p5154b.p5155a.p5156a.C65945a;
import com.google.protos.p5146w.p5149b.p5154b.p5155a.p5156a.C65946b;
import com.google.protos.youtube.elements.C66059au;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.c.a.a.e */
/* compiled from: PG */
public final class C39990e implements C21312s {

    /* renamed from: a */
    public final C21232ab f105123a;

    public C39990e(C21232ab abVar) {
        this.f105123a = abVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64171l.f173500g;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64171l lVar = (C64171l) obj;
        String str = lVar.f173502a;
        String str2 = lVar.f173503b;
        double d = lVar.f173505d;
        int i = lVar.f173506e;
        return this.f105123a.mo26139b(str).mo61656r(C58836b.f156633a).mo61663a(new C39988c(this, str, str2, lVar.f173504c, d, i));
    }

    /* renamed from: d */
    public final C65945a mo42107d(String str) {
        ArrayList arrayList = new ArrayList();
        C69828d.m101309f((AtomicReference) this.f105123a.mo26139b(str).mo61654n(new C39989d(arrayList)));
        if (arrayList.isEmpty()) {
            return (C65945a) C65946b.f179363d.createBuilder();
        }
        try {
            return (C65945a) ((C65945a) C65946b.f179363d.createBuilder()).mergeFrom((byte[]) ((C58833ax) arrayList.get(0)).mo56109e(new byte[0]), C62921ba.m95368a());
        } catch (C62974ct unused) {
            return (C65945a) C65946b.f179363d.createBuilder();
        }
    }
}
