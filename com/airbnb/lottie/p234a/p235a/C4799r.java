package com.airbnb.lottie.p234a.p235a;

import android.graphics.Path;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p238c.p240b.C4871n;
import com.airbnb.lottie.p238c.p241c.C4878b;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.r */
/* compiled from: PG */
public final class C4799r implements C4795n, C4802a {

    /* renamed from: a */
    private final Path f15275a = new Path();

    /* renamed from: b */
    private final boolean f15276b;

    /* renamed from: c */
    private final C4825ac f15277c;

    /* renamed from: d */
    private final C4807f f15278d;

    /* renamed from: e */
    private boolean f15279e;

    /* renamed from: f */
    private final C4784c f15280f = new C4784c();

    public C4799r(C4825ac acVar, C4878b bVar, C4871n nVar) {
        this.f15276b = nVar.f15517b;
        this.f15277c = acVar;
        C4807f a = nVar.f15516a.mo9797a();
        this.f15278d = a;
        bVar.mo9811h(a);
        a.mo9740g(this);
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15279e = false;
        this.f15277c.invalidateSelf();
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C4785d dVar = (C4785d) list.get(i);
            if (dVar instanceof C4801t) {
                C4801t tVar = (C4801t) dVar;
                if (tVar.f15290e == 1) {
                    this.f15280f.mo9720a(tVar);
                    tVar.mo9727a(this);
                }
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        throw null;
    }

    /* renamed from: i */
    public final Path mo9724i() {
        if (this.f15279e) {
            return this.f15275a;
        }
        this.f15275a.reset();
        if (this.f15276b) {
            this.f15279e = true;
            return this.f15275a;
        }
        this.f15275a.set((Path) this.f15278d.mo9738e());
        this.f15275a.setFillType(Path.FillType.EVEN_ODD);
        this.f15280f.mo9721b(this.f15275a);
        this.f15279e = true;
        return this.f15275a;
    }
}
