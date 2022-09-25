package com.google.android.libraries.lens.view.gleam;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import com.google.android.libraries.lens.view.p2069am.C25302aj;
import com.google.android.libraries.lens.view.p2069am.C25303ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4522b.C58557jl;
import com.google.lens.p4707j.C62475cy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.gleam.bt */
/* compiled from: PG */
final class C26488bt extends C26595fo {

    /* renamed from: a */
    public static final /* synthetic */ int f72151a = 0;

    /* renamed from: b */
    private final List f72152b = new ArrayList();

    /* renamed from: c */
    private final Path f72153c = new Path();

    public C26488bt(C26491bw bwVar, C25303ak akVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            List list = this.f72152b;
            Iterable e = C58557jl.m90124e(akVar.f68826d, new C26487bs(i2, i));
            C25302aj ajVar = akVar.f68827e;
            int b = C62475cy.m94782b((ajVar == null ? C25302aj.f68817c : ajVar).f68820b);
            if (b == 0) {
                b = 1;
            }
            list.add(new C26477bi(bwVar, e, b, i2));
        }
        for (C26477bi biVar : this.f72152b) {
            C58833ax.m90834k(biVar.f72113a);
            this.f72153c.op((Path) ((C58847bk) C58833ax.m90834k(biVar.f72113a)).f156646a, Path.Op.UNION);
        }
    }

    /* renamed from: a */
    public final C58833ax mo31731a() {
        return C58833ax.m90834k(this.f72153c);
    }

    /* renamed from: b */
    public final C58833ax mo31732b(Point point) {
        for (C26477bi b : this.f72152b) {
            C58833ax b2 = b.mo31732b(point);
            if (b2.mo56113h()) {
                return b2;
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final void mo31733c(Canvas canvas, C26493by byVar) {
        for (C26477bi c : this.f72152b) {
            c.mo31733c(canvas, byVar);
        }
    }
}
