package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
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

/* renamed from: com.google.android.libraries.lens.ondevice.k.et */
/* compiled from: PG */
public final class C24663et extends C68247h {

    /* renamed from: a */
    private final C68283d f67472a;

    /* renamed from: c */
    private final C68283d f67473c;

    public C24663et(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C24663et.class), aVar);
        this.f67472a = C68236af.m98549d(dVar);
        this.f67473c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C19665d dVar;
        List list = (List) obj;
        Bitmap bitmap = (Bitmap) list.get(0);
        C24661er erVar = (C24661er) list.get(1);
        C24653ej.m45755b(C24658eo.class, erVar.f67468b);
        C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
        oVar.copyOnWrite();
        C62353p pVar = (C62353p) oVar.instance;
        pVar.f168330d = 5;
        pVar.f168327a = 1 | pVar.f168327a;
        try {
            C62355r c = erVar.f67467a.mo30012c((C62353p) oVar.build(), bitmap);
            C24653ej.m45756c(C24658eo.class, erVar.f67468b, c);
            if (c.f168334a == 7) {
                dVar = (C19665d) c.f168335b;
            } else {
                dVar = C19665d.f54690b;
            }
            return C60856cj.m92900i(dVar);
        } catch (C62974ct e) {
            C24653ej.m45754a(C24658eo.class, erVar.f67468b);
            throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67472a.mo60297gq(), this.f67473c.mo60297gq());
    }
}
