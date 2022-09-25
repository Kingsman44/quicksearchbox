package com.google.android.libraries.lens.view.session;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24213e;
import com.google.android.libraries.lens.p2014e.C24214f;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.p2014e.C24230v;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.abp;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;

/* renamed from: com.google.android.libraries.lens.view.session.bd */
/* compiled from: PG */
public final /* synthetic */ class C27768bd {
    /* renamed from: a */
    public static C27777bm m51651a(boolean z, C24231w wVar) {
        C27769be g = C27770bf.m51660g();
        ((C27783c) g).f75789a = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        g.mo33249c();
        g.mo33252f(z);
        g.mo33251e(wVar);
        return g.mo33253g();
    }

    /* renamed from: b */
    public static C24233y m51652b(C24230v vVar, C27777bm bmVar, C56251be beVar, boolean z, C60214n nVar, abp abp, int i, int i2) {
        C24231w wVar;
        int i3;
        int i4;
        C58485gu guVar;
        C56226ag agVar;
        C24230v vVar2 = vVar;
        vVar2.mo29755f(bmVar.mo33258e());
        C24213e eVar = (C24213e) vVar2;
        eVar.f66191h = C58833ax.m90833j(beVar);
        vVar2.mo29751b(z);
        vVar2.mo29752c(bmVar.mo33256c());
        vVar2.mo29753d(bmVar.mo33260h());
        vVar2.mo29754e(bmVar.mo33259f());
        eVar.f66186c = C58833ax.m90833j(nVar);
        eVar.f66194k = C58833ax.m90833j(abp);
        eVar.f66198o = i;
        eVar.f66199p = i2;
        if (eVar.f66195l != 1 || (wVar = eVar.f66184a) == null || (i3 = eVar.f66196m) == 0 || (i4 = eVar.f66197n) == 0 || (guVar = eVar.f66190g) == null || (agVar = eVar.f66193j) == null) {
            StringBuilder sb = new StringBuilder();
            if (eVar.f66184a == null) {
                sb.append(" origin");
            }
            if (eVar.f66196m == 0) {
                sb.append(" selectionType");
            }
            if (eVar.f66197n == 0) {
                sb.append(" autoTextSelectionMode");
            }
            if (eVar.f66190g == null) {
                sb.append(" tappedObjects");
            }
            if (eVar.f66195l == 0) {
                sb.append(" hideTranslations");
            }
            if (eVar.f66193j == null) {
                sb.append(" clientTextSelection");
            }
            if (eVar.f66198o == 0) {
                sb.append(" selectionTypeForLogging");
            }
            if (eVar.f66199p == 0) {
                sb.append(" selectionImageTypeForLogging");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C24214f fVar = r3;
        C24214f fVar2 = new C24214f(wVar, i3, eVar.f66185b, eVar.f66186c, eVar.f66187d, eVar.f66188e, eVar.f66189f, i4, guVar, eVar.f66191h, eVar.f66192i, agVar, i, i2, eVar.f66194k);
        int i5 = fVar.f66204e - 1;
        boolean z2 = false;
        if (i5 == 0) {
            C58838bb.m90869d(fVar.f66200a.mo56113h(), "POINT interaction must specify selectionPoint");
            PointF pointF = (PointF) fVar.f66200a.mo56107c();
            if (pointF.x >= 0.0f && pointF.x <= 1.0f && pointF.y >= 0.0f && pointF.y <= 1.0f) {
                z2 = true;
            }
            C58838bb.m90869d(z2, "POINT interaction must be in valid normalized coordinates");
        } else if (i5 == 1) {
            C58838bb.m90869d(fVar.f66201b.mo56113h(), "WORD_BOXES interaction must specify selectionWordBoxes");
        } else if (i5 != 2) {
            C58838bb.m90869d(fVar.f66202c.mo56113h(), "REGION_SEARCH interaction must specify selectionBox");
            C58838bb.m90869d(C24227s.f66272a.contains((RectF) fVar.f66202c.mo56107c()), "REGION_SEARCH interaction must be in valid normalized coordinates");
        } else {
            if (fVar.f66202c.mo56113h() && fVar.f66203d.mo56113h()) {
                z2 = true;
            }
            C58838bb.m90869d(z2, "BOX interaction must specify selectionBox and selectionAngleDegrees");
            C58838bb.m90869d(C24227s.f66272a.contains((RectF) fVar.f66202c.mo56107c()), "BOX interaction must be in valid normalized coordinates");
        }
        return fVar;
    }
}
