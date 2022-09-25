package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.graphics.RectF;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40251e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58541iw;
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

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.u */
/* compiled from: PG */
public final class C40149u {

    /* renamed from: b */
    private static final C59071e f105468b = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.u");

    /* renamed from: c */
    private static final C147454r f105469c = new C147454r(600.0f, 0.6f);

    /* renamed from: a */
    public final Set f105470a = new HashSet();

    /* renamed from: d */
    private C58833ax f105471d = C58836b.f156633a;

    /* renamed from: e */
    public static boolean m69723e(C40248b bVar, C40137i iVar, List list) {
        float f;
        C40130b bVar2 = iVar.f105431l;
        if (C40130b.m69694e(bVar.mo42347a(), bVar2.f105403b) && C40130b.m69694e(bVar.mo42348b(), bVar2.f105404c)) {
            RectF c = iVar.mo42242c(bVar);
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

    /* renamed from: f */
    private static void m69724f(List list, C58839bc bcVar, Object obj) {
        if (bcVar.mo5941a(obj)) {
            list.add(obj);
        }
    }

    /* renamed from: g */
    private final boolean m69725g(C40137i iVar) {
        if (!this.f105471d.mo56113h() || ((C40148t) this.f105471d.mo56107c()).mo42224a() == iVar) {
            return true;
        }
        ((C59052c) ((C59052c) f105468b.mo56225c()).mo56372aa(53279)).mo56354G("moveOtherBubblesDuringDrag was called with a different source bubble without calling stopDrag in between. Previous source: %s, current source: %s", C40111d.m69657b(((C40148t) this.f105471d.mo56107c()).mo42224a().f105426g), C40111d.m69657b(iVar.f105426g));
        return false;
    }

    /* renamed from: a */
    public final C58495hd mo42254a() {
        HashMap hashMap = new HashMap();
        for (C40137i iVar : this.f105470a) {
            hashMap.put(iVar, iVar.f105431l.mo42221b());
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: b */
    public final void mo42255b(C40137i iVar, RectF rectF, C58495hd hdVar) {
        C58495hd hdVar2 = hdVar;
        if (this.f105470a.size() != 1) {
            C58541iw S = C58541iw.m90068S(new C40146r(new C40247a(rectF.centerX(), rectF.centerY()), hdVar2), C58758qx.m90645c(this.f105470a, new C58759qy(iVar)));
            HashMap hashMap = new HashMap();
            ArrayList<RectF> arrayList = new ArrayList<>();
            arrayList.add(rectF);
            C58800sl lA = S.iterator();
            while (lA.hasNext()) {
                C40137i iVar2 = (C40137i) lA.next();
                C40248b bVar = (C40248b) hdVar2.get(iVar2);
                bVar.getClass();
                if (!m69723e(bVar, iVar2, arrayList)) {
                    ArrayList arrayList2 = new ArrayList(arrayList.size() * 4);
                    C40147s sVar = new C40147s(iVar2, arrayList);
                    for (RectF rectF2 : arrayList) {
                        float b = (float) iVar2.mo42241b();
                        float a = (float) iVar2.mo42240a();
                        float f = rectF2.right;
                        float f2 = (b * 0.5f) - (b * 0.2178f);
                        float f3 = rectF2.left;
                        float f4 = rectF2.top;
                        float f5 = (0.5f * a) - (a * 0.2178f);
                        float f6 = rectF2.bottom;
                        float a2 = bVar.mo42347a();
                        float b2 = bVar.mo42348b();
                        int size = arrayList2.size();
                        m69724f(arrayList2, sVar, iVar2.mo42244e(f + f2, b2));
                        m69724f(arrayList2, sVar, iVar2.mo42244e(f3 - f2, b2));
                        m69724f(arrayList2, sVar, iVar2.mo42244e(a2, f4 - f5));
                        m69724f(arrayList2, sVar, iVar2.mo42244e(a2, f6 + f5));
                        if (arrayList2.size() - size > 4) {
                            ((C59052c) ((C59052c) f105468b.mo56225c()).mo56372aa(53275)).mo56387q("more than %d candidates produced", 4);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        C40111d.m69657b(iVar2.f105426g);
                        arrayList2.size();
                    } else {
                        bVar = C40251e.m69866c(arrayList2, bVar);
                    }
                }
                hashMap.put(iVar2, bVar);
                arrayList.add(iVar2.mo42242c(bVar));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ((C40137i) entry.getKey()).mo42245f(f105469c, (C40248b) entry.getValue());
            }
        }
    }

    /* renamed from: c */
    public final void mo42256c(C40137i iVar, RectF rectF) {
        if (!m69725g(iVar)) {
            this.f105471d = C58836b.f156633a;
        }
        if (!this.f105471d.mo56113h()) {
            this.f105471d = C58833ax.m90834k(new C40131c(iVar, mo42254a()));
        }
        mo42255b(iVar, rectF, ((C40148t) this.f105471d.mo56107c()).mo42225b());
    }

    /* renamed from: d */
    public final void mo42257d(C40137i iVar) {
        m69725g(iVar);
        this.f105471d = C58836b.f156633a;
    }
}
