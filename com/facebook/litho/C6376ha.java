package com.facebook.litho;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.p060c.C0985o;
import com.facebook.litho.p322a.C6076i;
import com.facebook.litho.p322a.C6077j;
import com.facebook.litho.p322a.C6078k;
import com.facebook.litho.p322a.C6083p;
import com.facebook.litho.p322a.C6084q;
import com.facebook.litho.p322a.C6085r;
import com.facebook.litho.p322a.C6089v;
import com.facebook.p313c.C6040e;
import com.facebook.p313c.C6064w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.litho.ha */
/* compiled from: PG */
public final class C6376ha {

    /* renamed from: a */
    public final Map f18861a = new HashMap();

    /* renamed from: b */
    public final C6368gu f18862b = new C6368gu();

    /* renamed from: c */
    public final C0985o f18863c = new C0985o(10);

    /* renamed from: d */
    public final Map f18864d = new HashMap();

    /* renamed from: e */
    public final ArrayList f18865e = new ArrayList();

    /* renamed from: f */
    public final C6372gy f18866f = new C6372gy(this);

    /* renamed from: g */
    public final C6371gx f18867g = new C6371gx(this);

    /* renamed from: h */
    public final C6373gz f18868h = new C6373gz(this);

    /* renamed from: i */
    public C6078k f18869i;

    /* renamed from: j */
    public final Map f18870j = new LinkedHashMap();

    /* renamed from: k */
    public final C6378hc f18871k;

    public C6376ha(C6378hc hcVar) {
        this.f18871k = hcVar;
    }

    /* renamed from: b */
    public static void m17089b(C6369gv gvVar) {
        if (gvVar.f18835d != null) {
            gvVar.f18835d = null;
        }
        if (gvVar.f18836e != null) {
            gvVar.f18836e = null;
        }
    }

    /* renamed from: e */
    public static void m17090e(C6076i iVar, C6259fb fbVar) {
        short s = fbVar.f18498b;
        for (int i = 0; i < s; i++) {
            iVar.mo12762c(fbVar.f18497a[fbVar.mo13249a(i)]);
        }
    }

    /* renamed from: g */
    public static void m17091g(C6076i iVar, float f, C6259fb fbVar) {
        short s = fbVar.f18498b;
        for (int i = 0; i < s; i++) {
            iVar.mo12763d(fbVar.f18497a[fbVar.mo13249a(i)], f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.facebook.litho.a.i, java.lang.Object] */
    /* renamed from: i */
    private final void m17092i(C6363gp gpVar, C6367gt gtVar, ArrayList arrayList) {
        float f;
        float f2;
        Float f3;
        ? r0 = gpVar.f18816a.f18798b.f18807a;
        C6369gv gvVar = (C6369gv) this.f18862b.mo13380a(gtVar);
        C6089v vVar = null;
        if (!(gvVar == null || (gvVar.f18835d == null && gvVar.f18836e == null))) {
            gvVar.f18839h = gpVar.mo13376b() || gvVar.f18839h;
            int i = gvVar.f18834c;
            if (i != 0 ? i != 2 || gpVar.mo13376b() : gpVar.mo13375a()) {
                C6370gw gwVar = (C6370gw) gvVar.f18832a.get(r0);
                C6085r rVar = new C6085r(gtVar, r0);
                if (gwVar != null) {
                    f = gwVar.f18840a.f18404c;
                } else {
                    f = gvVar.f18834c != 0 ? r0.mo12764e((C6185de) gvVar.f18835d.mo13250b()) : gpVar.f18819d.f17966a;
                }
                if (gvVar.f18834c != 2) {
                    f2 = r0.mo12764e((C6185de) gvVar.f18836e.mo13250b());
                } else {
                    f2 = gpVar.f18820e.f17966a;
                }
                if (gwVar == null || (f3 = gwVar.f18842c) == null ? f != f2 : f2 != f3.floatValue()) {
                    C6089v a = gpVar.f18817b.mo13374a(new C6084q(rVar, f2));
                    a.mo12769b(this.f18866f);
                    a.mo12775h();
                    if (gwVar == null) {
                        gwVar = new C6370gw();
                        gwVar.f18840a = new C6077j(gvVar.f18833b, r0);
                        gvVar.f18832a.put(r0, gwVar);
                    }
                    C6077j jVar = gwVar.f18840a;
                    jVar.f18404c = f;
                    jVar.mo12767c(f);
                    gwVar.f18844e++;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(rVar);
                    this.f18861a.put(a, arrayList2);
                    this.f18864d.put(rVar, Float.valueOf(f));
                    if (!TextUtils.isEmpty((CharSequence) null)) {
                        this.f18863c.mo3730i(a.hashCode(), (Object) null);
                    }
                    vVar = a;
                }
            } else {
                gvVar.f18838g = true;
            }
        }
        if (vVar != null) {
            arrayList.add(vVar);
        }
    }

    /* renamed from: j */
    private final void m17093j(View view, boolean z) {
        if ((view instanceof C6040e) && !(view instanceof C6064w)) {
            if (!z) {
                C6040e eVar = (C6040e) view;
                this.f18870j.put(eVar, Boolean.valueOf(eVar.getClipChildren()));
                eVar.setClipChildren(false);
            } else if (this.f18870j.containsKey(view)) {
                ((C6040e) view).setClipChildren(((Boolean) this.f18870j.remove(view)).booleanValue());
            }
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof C6040e) && !(parent instanceof C6064w)) {
            m17093j((View) parent, z);
        }
    }

    /* renamed from: a */
    public final C6078k mo13391a(C6365gr grVar) {
        if (grVar instanceof C6363gp) {
            C6363gp gpVar = (C6363gp) grVar;
            C6354gg ggVar = gpVar.f18816a;
            ArrayList arrayList = new ArrayList();
            C6356gi giVar = ggVar.f18797a;
            int i = giVar.f18806b - 1;
            if (i == 1) {
                Object obj = giVar.f18805a;
                C6368gu guVar = this.f18862b;
                String str = gpVar.f18818c;
                m17092i(gpVar, guVar.mo13384e((String) obj), arrayList);
            } else if (i != 2) {
                m17092i(gpVar, (C6367gt) this.f18862b.f18828a.get(giVar.f18805a), arrayList);
            } else {
                String[] strArr = (String[]) giVar.f18805a;
                String str2 = gpVar.f18818c;
                for (String e : strArr) {
                    C6367gt e2 = this.f18862b.mo13384e(e);
                    if (e2 != null) {
                        m17092i(gpVar, e2, arrayList);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            if (arrayList.size() == 1) {
                return (C6078k) arrayList.get(0);
            }
            return new C6083p(arrayList);
        } else if (grVar instanceof C6377hb) {
            C6377hb hbVar = (C6377hb) grVar;
            ArrayList arrayList2 = hbVar.f18872a;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6078k a = mo13391a((C6365gr) arrayList2.get(i2));
                if (a != null) {
                    arrayList3.add(a);
                }
            }
            if (arrayList3.isEmpty()) {
                return null;
            }
            return hbVar.mo13255a(arrayList3);
        } else {
            throw new RuntimeException("Unhandled Transition type: ".concat(String.valueOf(String.valueOf(grVar))));
        }
    }

    /* renamed from: c */
    public final void mo13392c(C6367gt gtVar, C6259fb fbVar, C6259fb fbVar2) {
        C6369gv gvVar = (C6369gv) this.f18862b.mo13380a(gtVar);
        if (gvVar == null) {
            gvVar = new C6369gv();
            C6368gu guVar = this.f18862b;
            if (guVar.f18831d.put(gtVar, gvVar) == null) {
                int i = gtVar.f18824a;
                if (i == 1) {
                    guVar.f18828a.put(gtVar.f18825b, gtVar);
                } else if (i != 2) {
                    guVar.f18830c.put(gtVar.f18825b, gtVar);
                } else {
                    String str = gtVar.f18826c;
                    Map map = (Map) guVar.f18829b.get(str);
                    if (map == null) {
                        map = new LinkedHashMap();
                        guVar.f18829b.put(str, map);
                    }
                    map.put(gtVar.f18825b, gtVar);
                }
            }
        }
        if (fbVar == null && fbVar2 == null) {
            throw new RuntimeException("Both current and next LayoutOutput groups were null!");
        }
        if (fbVar == null) {
            gvVar.f18834c = 0;
        } else if (fbVar2 != null) {
            gvVar.f18834c = 1;
        } else {
            int i2 = gvVar.f18834c;
            if ((i2 == 0 || i2 == 1) && !gvVar.f18839h) {
                gvVar.f18838g = true;
            }
            gvVar.f18834c = 2;
        }
        gvVar.f18835d = fbVar;
        gvVar.f18836e = fbVar2;
        C6259fb fbVar3 = gvVar.f18836e;
        C6185de deVar = fbVar3 != null ? (C6185de) fbVar3.mo13250b() : null;
        for (C6076i iVar : gvVar.f18832a.keySet()) {
            C6370gw gwVar = (C6370gw) gvVar.f18832a.get(iVar);
            if (deVar == null) {
                gwVar.f18843d = null;
            } else {
                gwVar.f18843d = Float.valueOf(iVar.mo12764e(deVar));
            }
        }
        gvVar.f18837f = true;
    }

    /* renamed from: d */
    public final void mo13393d(C6259fb fbVar, boolean z) {
        Object obj = fbVar.f18497a[3];
        if (obj instanceof View) {
            m17093j((View) obj, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo13394f(C6367gt gtVar, C6259fb fbVar) {
        C6369gv gvVar = (C6369gv) this.f18862b.mo13380a(gtVar);
        if (gvVar != null) {
            mo13395h(gvVar, fbVar);
        }
    }

    /* renamed from: h */
    public final void mo13395h(C6369gv gvVar, C6259fb fbVar) {
        C6259fb fbVar2 = gvVar.f18833b;
        if (fbVar2 != null || fbVar != null) {
            if (fbVar2 == null || !fbVar2.equals(fbVar)) {
                Map map = gvVar.f18832a;
                if (gvVar.f18833b != null) {
                    for (C6076i e : map.keySet()) {
                        m17090e(e, gvVar.f18833b);
                    }
                    mo13393d(gvVar.f18833b, true);
                }
                for (C6370gw gwVar : map.values()) {
                    C6077j jVar = gwVar.f18840a;
                    jVar.mo12766b(fbVar);
                    jVar.mo12767c(jVar.f18404c);
                }
                if (fbVar != null) {
                    mo13393d(fbVar, false);
                }
                gvVar.f18833b = fbVar;
            }
        }
    }
}
