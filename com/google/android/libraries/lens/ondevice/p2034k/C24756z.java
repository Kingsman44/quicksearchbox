package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19658f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.z */
/* compiled from: PG */
public final class C24756z extends C68247h {

    /* renamed from: a */
    private final C68283d f67646a;

    /* renamed from: c */
    private final C68283d f67647c;

    public C24756z(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24756z.class), aVar);
        this.f67646a = C68236af.m98549d(dVar);
        this.f67647c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C19658f fVar;
        List list = (List) obj;
        Bitmap bitmap = (Bitmap) list.get(0);
        C24754x xVar = (C24754x) list.get(1);
        C24653ej.m45755b(C24751u.class, xVar.f67643b);
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 11;
        pVar.f168327a = 1 | pVar.f168327a;
        try {
            C62355r c = xVar.f67642a.mo30012c((C62353p) oVar.build(), bitmap);
            C24653ej.m45756c(C24751u.class, xVar.f67643b, c);
            if (c.f168334a == 13) {
                fVar = (C19658f) c.f168335b;
            } else {
                fVar = C19658f.f54678b;
            }
            return C60856cj.m92900i(fVar);
        } catch (C62974ct e) {
            C24653ej.m45754a(C24751u.class, xVar.f67643b);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67646a.mo60297gq(), this.f67647c.mo60297gq());
    }
}
