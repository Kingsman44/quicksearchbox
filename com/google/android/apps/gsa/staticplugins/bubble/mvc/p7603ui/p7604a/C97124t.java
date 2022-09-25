package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a;

import android.graphics.RectF;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97218f;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97034b;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58541iw;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.t */
/* compiled from: PG */
public final class C97124t {

    /* renamed from: b */
    private static final C59071e f271380b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a.t");

    /* renamed from: c */
    private static final C147454r f271381c = new C147454r(600.0f, 0.6f);

    /* renamed from: a */
    public final Set f271382a = new HashSet();

    /* renamed from: d */
    private C58833ax f271383d = C58836b.f156633a;

    /* renamed from: d */
    public static boolean m160772d(C97214b bVar, C97112h hVar, List list) {
        float f;
        C97106b bVar2 = hVar.f271343l;
        if (C97106b.m160742e(bVar.mo90592a(), bVar2.f271316b) && C97106b.m160742e(bVar.mo90593b(), bVar2.f271317c)) {
            RectF c = hVar.mo90494c(bVar);
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= list.size()) {
                    return true;
                }
                RectF rectF = (RectF) list.get(i);
                float f2 = c.left;
                float f3 = c.top;
                float f4 = c.right;
                float f5 = c.bottom;
                if (f2 >= rectF.right || rectF.left >= f4 || f3 >= rectF.bottom || rectF.top >= f5) {
                    z = false;
                } else {
                    if (f2 < rectF.left) {
                        f2 = rectF.left;
                    }
                    if (f3 < rectF.top) {
                        f3 = rectF.top;
                    }
                    if (f4 > rectF.right) {
                        f4 = rectF.right;
                    }
                    if (f5 > rectF.bottom) {
                        f5 = rectF.bottom;
                    }
                }
                float f6 = f5 - f3;
                float f7 = f4 - f2;
                if (!z) {
                    f = 0.0f;
                } else {
                    f = Math.min(f6 / c.height(), f7 / c.width());
                }
                if (f > 0.22f) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static void m160773e(List list, C58839bc bcVar, Object obj) {
        if (bcVar.mo5941a(obj)) {
            list.add(obj);
        }
    }

    /* renamed from: f */
    private final boolean m160774f(C97112h hVar) {
        if (!this.f271383d.mo56113h() || ((C97123s) this.f271383d.mo56107c()).mo90476a() == hVar) {
            return true;
        }
        ((C59052c) ((C59052c) f271380b.mo56226d()).mo56372aa(18441)).mo56354G("moveOtherBubblesDuringDrag was called with a different source bubble without calling stopDrag in between. Previous source: %s, current source: %s", C97034b.m160607a(((C97123s) this.f271383d.mo56107c()).mo90476a().f271337f), C97034b.m160607a(hVar.f271337f));
        int i = C90755l.f253831a;
        return false;
    }

    /* renamed from: a */
    public final void mo90507a(C97112h hVar, RectF rectF, C58495hd hdVar) {
        C58495hd hdVar2 = hdVar;
        if (this.f271382a.size() != 1) {
            C58541iw S = C58541iw.m90068S(new C97122r(new C97213a(rectF.centerX(), rectF.centerY()), hdVar2), C58758qx.m90645c(this.f271382a, new C58759qy(hVar)));
            HashMap hashMap = new HashMap();
            ArrayList<RectF> arrayList = new ArrayList<>();
            arrayList.add(rectF);
            C58800sl lA = S.iterator();
            while (lA.hasNext()) {
                C97112h hVar2 = (C97112h) lA.next();
                C97214b bVar = (C97214b) hdVar2.get(hVar2);
                bVar.getClass();
                if (!m160772d(bVar, hVar2, arrayList)) {
                    ArrayList arrayList2 = new ArrayList(arrayList.size() * 4);
                    C97121q qVar = new C97121q(hVar2, arrayList);
                    for (RectF rectF2 : arrayList) {
                        float b = (float) hVar2.mo90493b();
                        float a = (float) hVar2.mo90492a();
                        float f = rectF2.right;
                        float f2 = (b * 0.5f) - (b * 0.2178f);
                        float f3 = rectF2.left;
                        float f4 = rectF2.top;
                        float f5 = (0.5f * a) - (a * 0.2178f);
                        float f6 = rectF2.bottom;
                        float a2 = bVar.mo90592a();
                        float b2 = bVar.mo90593b();
                        int size = arrayList2.size();
                        m160773e(arrayList2, qVar, hVar2.mo90496e(f + f2, b2));
                        m160773e(arrayList2, qVar, hVar2.mo90496e(f3 - f2, b2));
                        m160773e(arrayList2, qVar, hVar2.mo90496e(a2, f4 - f5));
                        m160773e(arrayList2, qVar, hVar2.mo90496e(a2, f6 + f5));
                        if (arrayList2.size() - size > 4) {
                            ((C59052c) ((C59052c) f271380b.mo56226d()).mo56372aa(18437)).mo56387q("more than %d candidates produced", 4);
                            int i = C90755l.f253831a;
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C97034b.m160607a(hVar2.f271337f);
                        arrayList2.size();
                    } else {
                        bVar = C97218f.m160924c(arrayList2, bVar);
                    }
                }
                hashMap.put(hVar2, bVar);
                arrayList.add(hVar2.mo90494c(bVar));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ((C97112h) entry.getKey()).mo90498g(f271381c, (C97214b) entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public final void mo90508b(C97112h hVar, RectF rectF) {
        if (!m160774f(hVar)) {
            this.f271383d = C58836b.f156633a;
        }
        if (!this.f271383d.mo56113h()) {
            this.f271383d = C58833ax.m90834k(new C97107c(hVar, C58662ni.m90358q(this.f271382a)));
        }
        mo90507a(hVar, rectF, ((C97123s) this.f271383d.mo56107c()).mo90477b());
    }

    /* renamed from: c */
    public final void mo90509c(C97112h hVar) {
        m160774f(hVar);
        this.f271383d = C58836b.f156633a;
    }
}
