package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.p1689c.p1690a.C20172r;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20173s;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20174t;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20175u;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20176v;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20177w;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20178x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.c.ac */
/* compiled from: PG */
public final class C20183ac {

    /* renamed from: a */
    public final C20177w f56639a;

    /* renamed from: b */
    public boolean f56640b;

    /* renamed from: c */
    public C20172r f56641c;

    /* renamed from: d */
    public List f56642d;

    /* renamed from: e */
    public List f56643e;

    /* renamed from: f */
    private Map f56644f;

    public C20183ac(C20178x xVar) {
        C20177w wVar = (C20177w) xVar.toBuilder();
        this.f56639a = wVar;
        C20178x xVar2 = (C20178x) wVar.instance;
        if (!((xVar2.f56612a & 1) == 0 || xVar2.f56614c.size() == 0)) {
            C20178x xVar3 = (C20178x) wVar.instance;
            if ((xVar3.f56612a & 2) != 0) {
                C20174t tVar = xVar3.f56615d;
                if (((tVar == null ? C20174t.f56599d : tVar).f56601a & 2) != 0) {
                    C20178x xVar4 = (C20178x) wVar.instance;
                    if ((xVar4.f56612a & 4) != 0) {
                        C20174t tVar2 = xVar4.f56616e;
                        if (((tVar2 == null ? C20174t.f56599d : tVar2).f56601a & 2) != 0) {
                            C20174t tVar3 = xVar4.f56615d;
                            String str = (tVar3 == null ? C20174t.f56599d : tVar3).f56603c;
                            String str2 = (tVar2 == null ? C20174t.f56599d : tVar2).f56603c;
                            boolean z = false;
                            boolean z2 = false;
                            for (C20172r rVar : Collections.unmodifiableList(xVar4.f56614c)) {
                                z |= rVar.f56596a.equals(str);
                                z2 |= rVar.f56596a.equals(str2);
                                if (z && z2) {
                                    C20178x xVar5 = (C20178x) this.f56639a.instance;
                                    C20174t tVar4 = xVar5.f56615d;
                                    String str3 = (tVar4 == null ? C20174t.f56599d : tVar4).f56603c;
                                    C20174t tVar5 = xVar5.f56616e;
                                    String str4 = (tVar5 == null ? C20174t.f56599d : tVar5).f56603c;
                                    ArrayList arrayList = new ArrayList();
                                    int i = 0;
                                    for (C20172r rVar2 : Collections.unmodifiableList(((C20178x) this.f56639a.instance).f56614c)) {
                                        String str5 = rVar2.f56596a;
                                        if (str5.equals(str3)) {
                                            arrayList.add(0, rVar2);
                                            i = 1;
                                        } else if (str5.equals(str4)) {
                                            arrayList.add(i, rVar2);
                                        } else {
                                            arrayList.add(rVar2);
                                        }
                                    }
                                    this.f56642d = arrayList;
                                    C20178x xVar6 = (C20178x) this.f56639a.instance;
                                    C20174t tVar6 = xVar6.f56615d;
                                    String str6 = (tVar6 == null ? C20174t.f56599d : tVar6).f56603c;
                                    C20174t tVar7 = xVar6.f56616e;
                                    String str7 = (tVar7 == null ? C20174t.f56599d : tVar7).f56603c;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (C20172r rVar3 : Collections.unmodifiableList(((C20178x) this.f56639a.instance).f56614c)) {
                                        String str8 = rVar3.f56596a;
                                        if (str8.equals(str7)) {
                                            arrayList2.add(0, rVar3);
                                        } else if (str8.equals(str6)) {
                                            this.f56641c = rVar3;
                                        } else {
                                            arrayList2.add(rVar3);
                                        }
                                    }
                                    this.f56643e = arrayList2;
                                    HashMap hashMap = new HashMap();
                                    for (C20172r rVar4 : Collections.unmodifiableList(((C20178x) this.f56639a.instance).f56614c)) {
                                        hashMap.put(rVar4.f56596a, rVar4.f56597b);
                                    }
                                    this.f56644f = hashMap;
                                    this.f56640b = true;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f56640b = false;
    }

    /* renamed from: n */
    public static final List m37980n(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C20172r) it.next()).f56597b);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final double mo25261a() {
        C20174t tVar = ((C20178x) this.f56639a.instance).f56615d;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        C20176v vVar = tVar.f56602b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        return vVar.f56607b;
    }

    /* renamed from: b */
    public final double mo25262b() {
        C20176v vVar = ((C20178x) this.f56639a.instance).f56613b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        return vVar.f56607b;
    }

    /* renamed from: c */
    public final double mo25263c() {
        C20174t tVar = ((C20178x) this.f56639a.instance).f56616e;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        C20176v vVar = tVar.f56602b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        return vVar.f56607b;
    }

    /* renamed from: d */
    public final int mo25264d() {
        C20174t tVar = ((C20178x) this.f56639a.instance).f56615d;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        C20176v vVar = tVar.f56602b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        return vVar.f56608c;
    }

    /* renamed from: e */
    public final int mo25265e() {
        C20174t tVar = ((C20178x) this.f56639a.instance).f56616e;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        C20176v vVar = tVar.f56602b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        return vVar.f56608c;
    }

    /* renamed from: f */
    public final C20178x mo25266f() {
        return (C20178x) this.f56639a.build();
    }

    /* renamed from: g */
    public final String mo25267g(int i) {
        return ((C20172r) this.f56642d.get(i)).f56596a;
    }

    /* renamed from: h */
    public final String mo25268h(String str) {
        return (String) this.f56644f.get(str);
    }

    /* renamed from: i */
    public final String mo25269i() {
        C20174t tVar = ((C20178x) this.f56639a.instance).f56615d;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        return tVar.f56603c;
    }

    /* renamed from: j */
    public final String mo25270j() {
        C20174t tVar = ((C20178x) this.f56639a.instance).f56616e;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        return tVar.f56603c;
    }

    /* renamed from: k */
    public final String mo25271k(int i) {
        return ((C20172r) this.f56643e.get(i)).f56596a;
    }

    /* renamed from: l */
    public final void mo25272l(double d) {
        C20177w wVar = this.f56639a;
        C20174t tVar = ((C20178x) wVar.instance).f56615d;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        C20173s sVar = (C20173s) tVar.toBuilder();
        C20174t tVar2 = ((C20178x) this.f56639a.instance).f56615d;
        if (tVar2 == null) {
            tVar2 = C20174t.f56599d;
        }
        C20176v vVar = tVar2.f56602b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        C20175u uVar = (C20175u) vVar.toBuilder();
        uVar.copyOnWrite();
        C20176v vVar2 = (C20176v) uVar.instance;
        vVar2.f56606a |= 1;
        vVar2.f56607b = d;
        sVar.copyOnWrite();
        C20174t tVar3 = (C20174t) sVar.instance;
        C20176v vVar3 = (C20176v) uVar.build();
        vVar3.getClass();
        tVar3.f56602b = vVar3;
        tVar3.f56601a |= 1;
        wVar.copyOnWrite();
        C20178x xVar = (C20178x) wVar.instance;
        C20174t tVar4 = (C20174t) sVar.build();
        tVar4.getClass();
        xVar.f56615d = tVar4;
        xVar.f56612a |= 2;
    }

    /* renamed from: m */
    public final void mo25273m(double d) {
        C20177w wVar = this.f56639a;
        C20174t tVar = ((C20178x) wVar.instance).f56616e;
        if (tVar == null) {
            tVar = C20174t.f56599d;
        }
        C20173s sVar = (C20173s) tVar.toBuilder();
        C20174t tVar2 = ((C20178x) this.f56639a.instance).f56616e;
        if (tVar2 == null) {
            tVar2 = C20174t.f56599d;
        }
        C20176v vVar = tVar2.f56602b;
        if (vVar == null) {
            vVar = C20176v.f56604d;
        }
        C20175u uVar = (C20175u) vVar.toBuilder();
        uVar.copyOnWrite();
        C20176v vVar2 = (C20176v) uVar.instance;
        vVar2.f56606a |= 1;
        vVar2.f56607b = d;
        sVar.copyOnWrite();
        C20174t tVar3 = (C20174t) sVar.instance;
        C20176v vVar3 = (C20176v) uVar.build();
        vVar3.getClass();
        tVar3.f56602b = vVar3;
        tVar3.f56601a |= 1;
        wVar.copyOnWrite();
        C20178x xVar = (C20178x) wVar.instance;
        C20174t tVar4 = (C20174t) sVar.build();
        tVar4.getClass();
        xVar.f56616e = tVar4;
        xVar.f56612a |= 4;
    }
}
