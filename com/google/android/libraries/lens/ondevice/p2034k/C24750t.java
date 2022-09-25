package com.google.android.libraries.lens.ondevice.p2034k;

import android.graphics.Bitmap;
import android.util.Size;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4701g.C62344g;
import com.google.lens.p4701g.C62345h;
import com.google.lens.p4701g.C62347j;
import com.google.lens.p4701g.C62352o;
import com.google.lens.p4701g.C62353p;
import com.google.lens.p4701g.C62355r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.protobuf.C62974ct;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.ondevice.k.t */
/* compiled from: PG */
public final class C24750t extends C68247h {

    /* renamed from: a */
    private final C68283d f67632a;

    /* renamed from: c */
    private final C68283d f67633c;

    /* renamed from: d */
    private final C68283d f67634d;

    /* renamed from: e */
    private final C68283d f67635e;

    public C24750t(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C24750t.class), aVar);
        this.f67632a = C68236af.m98549d(dVar);
        this.f67633c = C68236af.m98549d(dVar2);
        this.f67634d = C68236af.m98549d(dVar3);
        this.f67635e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C62347j jVar;
        C62347j jVar2;
        List list = (List) obj;
        C24748r rVar = (C24748r) list.get(0);
        C56220aa aaVar = (C56220aa) list.get(1);
        C56220aa aaVar2 = (C56220aa) list.get(2);
        Bitmap bitmap = (Bitmap) list.get(3);
        Size size = new Size(bitmap.getWidth(), bitmap.getHeight());
        if (aaVar2.f149750a.size() != 0) {
            C24653ej.m45755b(C24745o.class, rVar.f67629b);
            C62352o oVar = (C62352o) C62353p.f168325e.createBuilder();
            oVar.copyOnWrite();
            C62353p pVar = (C62353p) oVar.instance;
            pVar.f168330d = 14;
            pVar.f168327a |= 1;
            C62344g gVar = (C62344g) C62345h.f168304f.createBuilder();
            gVar.copyOnWrite();
            C62345h hVar = (C62345h) gVar.instance;
            aaVar.getClass();
            hVar.f168307b = aaVar;
            hVar.f168306a = 1 | hVar.f168306a;
            gVar.copyOnWrite();
            C62345h hVar2 = (C62345h) gVar.instance;
            aaVar2.getClass();
            hVar2.f168308c = aaVar2;
            hVar2.f168306a = 2 | hVar2.f168306a;
            int width = size.getWidth();
            gVar.copyOnWrite();
            C62345h hVar3 = (C62345h) gVar.instance;
            hVar3.f168306a |= 4;
            hVar3.f168309d = width;
            int height = size.getHeight();
            gVar.copyOnWrite();
            C62345h hVar4 = (C62345h) gVar.instance;
            hVar4.f168306a |= 8;
            hVar4.f168310e = height;
            oVar.copyOnWrite();
            C62353p pVar2 = (C62353p) oVar.instance;
            C62345h hVar5 = (C62345h) gVar.build();
            hVar5.getClass();
            pVar2.f168329c = hVar5;
            pVar2.f168328b = 12;
            try {
                C62355r b = rVar.f67628a.mo30011b((C62353p) oVar.build());
                C24653ej.m45756c(C24745o.class, rVar.f67629b, b);
                aaVar.f149750a.size();
                aaVar2.f149750a.size();
                if (b.f168334a == 16) {
                    jVar = (C62347j) b.f168335b;
                } else {
                    jVar = C62347j.f168312b;
                }
                C56220aa aaVar3 = jVar.f168314a;
                if (aaVar3 == null) {
                    aaVar3 = C56220aa.f149748b;
                }
                aaVar3.f149750a.size();
                if (b.f168334a == 16) {
                    jVar2 = (C62347j) b.f168335b;
                } else {
                    jVar2 = C62347j.f168312b;
                }
                aaVar = jVar2.f168314a;
                if (aaVar == null) {
                    aaVar = C56220aa.f149748b;
                }
            } catch (C62974ct e) {
                C24653ej.m45754a(C24745o.class, rVar.f67629b);
                throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
            }
        }
        return C60856cj.m92900i(aaVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f67632a.mo60297gq(), this.f67633c.mo60297gq(), this.f67634d.mo60297gq(), this.f67635e.mo60297gq());
    }
}
