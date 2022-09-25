package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28480t;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2192d.C28350c;
import com.google.android.libraries.logging.p2185ve.p2192d.C28351d;
import com.google.android.libraries.logging.p2185ve.p2199f.C28419f;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4552o.aqr;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.c.b.m */
/* compiled from: PG */
public final class C28330m {

    /* renamed from: a */
    public final List f77027a = new ArrayList();

    /* renamed from: b */
    public boolean f77028b = true;

    /* renamed from: c */
    public Set f77029c = C58733pz.f156496a;

    /* renamed from: d */
    public final boolean f77030d = false;

    /* renamed from: e */
    private final Set f77031e = new LinkedHashSet();

    /* renamed from: f */
    private final Set f77032f = new LinkedHashSet();

    /* renamed from: g */
    private final Map f77033g = new HashMap();

    /* renamed from: h */
    private final List f77034h = new ArrayList();

    /* renamed from: i */
    private final Map f77035i = new HashMap();

    /* renamed from: j */
    private Collection f77036j = null;

    /* renamed from: g */
    private final C28329l m52991g(C28439i iVar) {
        C28329l lVar = new C28329l(this.f77027a.size(), this.f77031e.size());
        C28481u a = lVar.mo33843a(iVar, -1);
        ArrayList arrayList = new ArrayList(1);
        C28318a.m52973a(iVar, arrayList);
        C60214n nVar = a.f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        lVar.mo33844b(new C28350c(1, arrayList, nVar.f162917b));
        this.f77027a.add(lVar);
        this.f77033g.put(a, lVar);
        return lVar;
    }

    /* renamed from: h */
    private final C28329l m52992h(List list, int i) {
        C28481u uVar = (C28481u) C58557jl.m90131l(list);
        C28329l lVar = (C28329l) this.f77033g.get(uVar);
        if (lVar != null) {
            return lVar;
        }
        C28329l lVar2 = new C28329l(this.f77027a.size(), i);
        this.f77027a.add(lVar2);
        this.f77033g.put(uVar, lVar2);
        return lVar2;
    }

    /* renamed from: i */
    private final C28329l m52993i(C28439i iVar) {
        int i = iVar.f77221g;
        if (i == -1) {
            C58838bb.m90887v(iVar.mo33888e(), "%s has no VE id, it may need to be reinstrumented if it has been reset.", iVar);
            this.f77034h.add(iVar);
            C28316c cVar = iVar.f77220f;
            if (cVar.mo33830n()) {
                return m52991g(iVar);
            }
            C28439i iVar2 = (C28439i) cVar.mo33819b();
            if (iVar2 == null) {
                C28481u a = iVar.mo33884a();
                C62940bt r3 = C62942bv.checkIsLite(C28419f.f77188a);
                a.mo58887l(r3);
                if (a.f169962ag.mo58857o(r3.f169971d)) {
                    return m52991g(iVar);
                }
                int i2 = C28485y.f77298f;
                C28316c cVar2 = iVar.f77220f;
                View view = cVar2 instanceof C28485y ? ((C28485y) cVar2).f77299a : null;
                while (true) {
                    if (view != null) {
                        if (!C28485y.m53235o(view)) {
                            ViewParent parent = view.getParent();
                            if (!(parent instanceof View)) {
                                break;
                            }
                            view = (View) parent;
                        } else {
                            String valueOf = String.valueOf(iVar);
                            Log.e("GIL", "Unexpected visual element (" + valueOf + ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements.");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (Log.isLoggable("GIL", 2)) {
                    String valueOf2 = String.valueOf(iVar);
                    Log.v("GIL", "Ignoring CVE (" + valueOf2 + ") outside of AutoLogger scope.");
                }
                iVar.f77221g = -2;
                return null;
            } else if (iVar2.f77221g != -1 || !iVar2.mo33889f()) {
                C28329l i3 = m52993i(iVar2);
                if (i3 == null) {
                    return null;
                }
                C60214n nVar = ((C28481u) iVar2.f77217c.instance).f77290c;
                if (nVar == null) {
                    nVar = C60214n.f162914g;
                }
                i3.mo33843a(iVar, nVar.f162917b);
                return i3;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Object) null);
                C28318a.m52973a(iVar2, arrayList);
                C58838bb.m90883r(arrayList.size() > 1);
                C28329l h = m52992h(arrayList, this.f77031e.size());
                C28481u a2 = h.mo33843a(iVar, -1);
                arrayList.set(0, a2);
                C60214n nVar2 = a2.f77290c;
                if (nVar2 == null) {
                    nVar2 = C60214n.f162914g;
                }
                h.mo33844b(new C28350c(1, arrayList, nVar2.f162917b));
                return h;
            }
        } else if (i == -2) {
            return null;
        } else {
            return (C28329l) this.f77027a.get(i);
        }
    }

    /* renamed from: a */
    public final List mo33845a() {
        C47558bi a = C47831fm.m85006a("GIL:LogBatch");
        try {
            ArrayList arrayList = new ArrayList(this.f77027a.size());
            for (C28329l lVar : this.f77027a) {
                arrayList.add(new C28351d(lVar.f77020a, lVar.f77021b, lVar.f77022c, lVar.f77023d, lVar.f77024e, lVar.f77025f));
            }
            this.f77027a.clear();
            this.f77033g.clear();
            a.close();
            return arrayList;
        } catch (Throwable th) {
            C28327j.m52986a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo33846b() {
        if (Log.isLoggable("GIL", 2)) {
            Log.v("GIL", String.format(Locale.US, "AutoGIL Batch: inserts=%d; visibility=%d; removes=%d", new Object[]{Integer.valueOf(this.f77031e.size()), Integer.valueOf(this.f77032f.size()), Integer.valueOf(this.f77035i.size())}));
        }
        C47558bi a = C47831fm.m85006a("GIL:CreateInsertGrafts");
        try {
            for (C28439i iVar : this.f77031e) {
                if (iVar.f77221g == -1) {
                    m52993i(iVar);
                }
            }
            this.f77031e.clear();
            for (C28439i iVar2 : this.f77034h) {
                iVar2.f77221g = -1;
            }
            this.f77034h.clear();
            a.close();
            C47558bi a2 = C47831fm.m85006a("GIL:CreateVisibilityGrafts");
            try {
                for (C28439i iVar3 : this.f77032f) {
                    C58838bb.m90887v(iVar3.mo33889f(), "Not impressed: %s", iVar3);
                    int h = iVar3.mo33891h();
                    C28480t tVar = iVar3.f77217c;
                    int i = ((C28481u) tVar.instance).f77291d;
                    int b = aqr.m92462b(i);
                    if (b == 0) {
                        b = 1;
                    }
                    if (b != h) {
                        int b2 = aqr.m92462b(i);
                        if (b2 == 0) {
                            b2 = 1;
                        }
                        int i2 = b2 - 1;
                        if (i2 == 2 || i2 == 4) {
                            if (h == 2) {
                                continue;
                            } else {
                                C58838bb.m90884s(h != 1, "Repressed VE was visible.");
                            }
                        }
                        tVar.copyOnWrite();
                        C28481u uVar = (C28481u) tVar.instance;
                        int i3 = h - 1;
                        if (h != 0) {
                            uVar.f77291d = i3;
                            uVar.f77288a |= 2;
                            ArrayList arrayList = new ArrayList();
                            C28318a.m52973a(iVar3, arrayList);
                            C28329l h2 = m52992h(arrayList, 0);
                            int b3 = aqr.m92462b(((C28481u) arrayList.get(0)).f77291d);
                            if (b3 != 0) {
                                if (b3 != 1) {
                                    h2.mo33844b(new C28350c(3, arrayList, -1));
                                }
                            }
                            h2.mo33844b(new C28350c(2, arrayList, h2.f77024e.size()));
                            C28328k kVar = new C28328k(h2);
                            C60214n nVar = ((C28481u) iVar3.f77217c.instance).f77290c;
                            if (nVar == null) {
                                nVar = C60214n.f162914g;
                            }
                            C60218r rVar = nVar.f162921f;
                            if (rVar == null) {
                                rVar = C60218r.f162925d;
                            }
                            if ((rVar.f162927a & 2) != 0) {
                                kVar.mo33799b(iVar3);
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                this.f77032f.clear();
                a2.close();
                if (!this.f77035i.isEmpty()) {
                    C47558bi a3 = C47831fm.m85006a("GIL:CreateRemoveGrafts");
                    try {
                        for (Map.Entry entry : this.f77035i.entrySet()) {
                            Collection<C28481u> collection = (Collection) entry.getValue();
                            for (C28481u uVar2 : collection) {
                                C28439i iVar4 = (C28439i) entry.getKey();
                                int b4 = aqr.m92462b(uVar2.f77291d);
                                if (b4 != 0) {
                                    if (b4 != 1) {
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList();
                                C28480t tVar2 = (C28480t) uVar2.toBuilder();
                                tVar2.copyOnWrite();
                                C28481u uVar3 = (C28481u) tVar2.instance;
                                uVar3.f77291d = 1;
                                uVar3.f77288a |= 2;
                                arrayList2.add((C28481u) tVar2.build());
                                if (iVar4 != null) {
                                    C28318a.m52973a(iVar4, arrayList2);
                                }
                                m52992h(arrayList2, 0).mo33844b(new C28350c(3, arrayList2, -1));
                            }
                            collection.clear();
                            this.f77036j = collection;
                        }
                        a3.close();
                        this.f77035i.clear();
                        return;
                    } catch (Throwable th) {
                        C28327j.m52986a(th, th);
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                C28327j.m52986a(th, th2);
            }
            throw th;
            throw th;
            throw th;
        } catch (Throwable th3) {
            C28327j.m52986a(th, th3);
        }
    }

    /* renamed from: c */
    public final boolean mo33847c() {
        return !this.f77027a.isEmpty() || !this.f77031e.isEmpty() || !this.f77032f.isEmpty() || !this.f77035i.isEmpty();
    }

    /* renamed from: d */
    public final boolean mo33848d(C28439i iVar) {
        C28316c cVar = iVar.f77220f;
        C28480t tVar = iVar.f77217c;
        C60214n nVar = ((C28481u) tVar.instance).f77290c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        int i = 1;
        if ((nVar.f162916a & 2048) != 0) {
            int r = cVar.mo33831r();
            int b = aqr.m92462b(((C28481u) tVar.instance).f77291d);
            if (b != 0) {
                i = b;
            }
            if (i != r) {
                return mo33850f(iVar, r);
            }
            return false;
        }
        this.f77031e.add(iVar);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0.contains(java.lang.Integer.valueOf(r1.f162918c)) != false) goto L_0x001c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33849e(com.google.android.libraries.logging.p2185ve.C28439i r4) {
        /*
            r3 = this;
            boolean r0 = r3.f77028b
            if (r0 != 0) goto L_0x001c
            java.util.Set r0 = r3.f77029c
            com.google.android.libraries.logging.ve.u r1 = r4.mo33884a()
            com.google.common.o.l.n r1 = r1.f77290c
            if (r1 != 0) goto L_0x0010
            com.google.common.o.l.n r1 = com.google.common.p4552o.p4566l.C60214n.f162914g
        L_0x0010:
            int r1 = r1.f162918c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0082
        L_0x001c:
            java.util.Map r0 = r3.f77035i
            java.lang.Object r0 = r0.remove(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x002b
            r0.clear()
            r3.f77036j = r0
        L_0x002b:
            boolean r0 = r4.mo33889f()
            if (r0 == 0) goto L_0x0082
            com.google.android.libraries.logging.ve.c.a.c r0 = r4.f77220f
            java.lang.Object r0 = r0.mo33819b()
            com.google.android.libraries.logging.ve.i r0 = (com.google.android.libraries.logging.p2185ve.C28439i) r0
            com.google.android.libraries.logging.ve.c.a.c r1 = r4.f77220f
            boolean r1 = r1.mo33830n()
            if (r1 != 0) goto L_0x0049
            if (r0 == 0) goto L_0x0082
            boolean r1 = r0.mo33889f()
            if (r1 == 0) goto L_0x0082
        L_0x0049:
            java.util.Map r1 = r3.f77035i
            java.lang.Object r1 = r1.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x005b
            com.google.android.libraries.logging.ve.u r0 = r4.mo33884a()
            r1.add(r0)
            goto L_0x0082
        L_0x005b:
            java.util.Collection r1 = r3.f77036j
            if (r1 == 0) goto L_0x0063
            r2 = 0
            r3.f77036j = r2
            goto L_0x0076
        L_0x0063:
            r1 = 2
            java.lang.String r2 = "GIL"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = "Array Alloc for Removal"
            android.util.Log.v(r2, r1)
        L_0x0071:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0076:
            com.google.android.libraries.logging.ve.u r2 = r4.mo33884a()
            r1.add(r2)
            java.util.Map r2 = r3.f77035i
            r2.put(r0, r1)
        L_0x0082:
            java.util.Set r0 = r3.f77031e
            r0.remove(r4)
            java.util.Set r0 = r3.f77032f
            r0.remove(r4)
            java.util.Map r4 = r3.f77035i
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0096
            r4 = 1
            return r4
        L_0x0096:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.logging.p2185ve.p2188c.p2190b.C28330m.mo33849e(com.google.android.libraries.logging.ve.i):boolean");
    }

    /* renamed from: f */
    public final boolean mo33850f(C28439i iVar, int i) {
        if (this.f77031e.contains(iVar)) {
            return false;
        }
        int b = aqr.m92462b(((C28481u) iVar.f77217c.instance).f77291d);
        if (b == 0) {
            b = 1;
        }
        if (b == i) {
            this.f77032f.remove(iVar);
            return false;
        }
        this.f77032f.add(iVar);
        return true;
    }
}
