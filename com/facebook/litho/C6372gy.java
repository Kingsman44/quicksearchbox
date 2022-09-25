package com.facebook.litho;

import android.text.TextUtils;
import com.facebook.litho.p322a.C6076i;
import com.facebook.litho.p322a.C6078k;
import com.facebook.litho.p322a.C6079l;
import com.facebook.litho.p322a.C6084q;
import com.facebook.litho.p322a.C6085r;
import com.facebook.p313c.C6058q;
import com.facebook.p313c.p316c.C6036d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.litho.gy */
/* compiled from: PG */
final class C6372gy implements C6079l {

    /* renamed from: a */
    final /* synthetic */ C6376ha f18846a;

    /* renamed from: b */
    private final ArrayList f18847b = new ArrayList();

    public C6372gy(C6376ha haVar) {
        this.f18846a = haVar;
    }

    /* renamed from: a */
    public final void mo12776a(C6078k kVar) {
        mo13385e(kVar);
    }

    /* renamed from: b */
    public final void mo12777b(C6078k kVar) {
        List<C6085r> list = (List) this.f18846a.f18861a.get(kVar);
        if (!(list == null || this.f18846a.f18871k == null)) {
            for (C6085r rVar : list) {
                C6154cb cbVar = (C6154cb) kVar.mo12768a();
                if (cbVar != null) {
                    Object[] objArr = new Object[1];
                    String str = rVar.f17977a.f18825b;
                    C6076i iVar = rVar.f17978b;
                    cbVar.mo13111fD(new C6366gs());
                }
            }
        }
        mo13385e(kVar);
    }

    /* renamed from: c */
    public final void mo12778c(C6078k kVar) {
        kVar.mo12770c(this.f18847b);
        int size = this.f18847b.size();
        for (int i = 0; i < size; i++) {
            C6084q qVar = (C6084q) this.f18847b.get(i);
            C6369gv gvVar = (C6369gv) this.f18846a.f18862b.mo13380a(qVar.f17975a.f17977a);
            if (gvVar != null) {
                C6370gw gwVar = (C6370gw) gvVar.f18832a.get(qVar.f17975a.f17978b);
                gwVar.f18842c = Float.valueOf(qVar.f17976b);
                gwVar.f18841b = kVar;
            }
        }
        this.f18847b.clear();
        if (!TextUtils.isEmpty((String) this.f18846a.f18863c.mo3726e(kVar.hashCode()))) {
            kVar.hashCode();
            C6057p pVar = C6058q.f17821a;
        }
    }

    /* renamed from: d */
    public final boolean mo12779d(C6078k kVar) {
        Float f;
        kVar.mo12770c(this.f18847b);
        int size = this.f18847b.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C6084q qVar = (C6084q) this.f18847b.get(i);
            C6369gv gvVar = (C6369gv) this.f18846a.f18862b.mo13380a(qVar.f17975a.f17977a);
            C6370gw gwVar = gvVar != null ? (C6370gw) gvVar.f18832a.get(qVar.f17975a.f17978b) : null;
            if (gwVar == null) {
                z = false;
            }
            if (!(!z || (f = gwVar.f18843d) == null || f.floatValue() == qVar.f17976b)) {
                z = false;
            }
        }
        this.f18847b.clear();
        return z;
    }

    /* renamed from: e */
    public final void mo13385e(C6078k kVar) {
        boolean z;
        List list = (List) this.f18846a.f18861a.remove(kVar);
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C6085r rVar = (C6085r) list.get(i);
                C6367gt gtVar = rVar.f17977a;
                C6369gv gvVar = (C6369gv) this.f18846a.f18862b.mo13380a(gtVar);
                C6076i iVar = rVar.f17978b;
                if (gvVar.f18834c == 2) {
                    C6370gw gwVar = (C6370gw) gvVar.f18832a.get(iVar);
                    if (gwVar != null) {
                        gwVar.f18844e--;
                        if (gvVar.f18834c == 2) {
                            Iterator it = gvVar.f18832a.values().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C6370gw) it.next()).f18844e > 0) {
                                        z = false;
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z && gvVar.f18833b != null) {
                                for (C6076i e : gvVar.f18832a.keySet()) {
                                    C6376ha.m17090e(e, gvVar.f18833b);
                                }
                            }
                        } else {
                            throw new RuntimeException("This should only be checked for disappearing animations");
                        }
                    } else {
                        throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                    }
                } else {
                    C6370gw gwVar2 = (C6370gw) gvVar.f18832a.get(iVar);
                    if (gwVar2 != null) {
                        int i2 = gwVar2.f18844e - 1;
                        gwVar2.f18844e = i2;
                        if (i2 <= 0) {
                            gvVar.f18832a.remove(iVar);
                            boolean isEmpty = gvVar.f18832a.isEmpty();
                            if (gvVar.f18833b != null) {
                                C6376ha.m17091g(iVar, iVar.mo12764e((C6185de) gvVar.f18836e.mo13250b()), gvVar.f18833b);
                            }
                            z = isEmpty;
                        }
                    } else {
                        throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                    }
                }
                if (z) {
                    C6259fb fbVar = gvVar.f18833b;
                    if (fbVar != null) {
                        this.f18846a.mo13393d(fbVar, true);
                    }
                    C6378hc hcVar = this.f18846a.f18871k;
                    if (hcVar != null) {
                        C6259fb fbVar2 = (C6259fb) hcVar.f18874b.f18875a.remove(gtVar);
                        if (fbVar2 != null) {
                            C6380he.m17101j(hcVar.f18873a, fbVar2);
                        } else {
                            if (!hcVar.f18874b.f18880f.remove(gtVar)) {
                                String str = ((C6379hd) hcVar.f18873a.f17741b).f18884j;
                            }
                            C6036d dVar = hcVar.f18874b.f18883i;
                            C6259fb fbVar3 = dVar != null ? (C6259fb) ((C6187dg) dVar).f18268A.get(gtVar) : null;
                            if (fbVar3 != null) {
                                short s = fbVar3.f18498b;
                                for (int i3 = 0; i3 < s; i3++) {
                                    C6380he.m17102l(hcVar.f18873a, hcVar.f18874b.f18883i, hcVar.f18874b.f18883i.mo12622f(((C6185de) fbVar3.f18497a[fbVar3.mo13249a(i3)]).f18263m), false);
                                }
                            }
                        }
                    }
                    this.f18846a.f18862b.mo13383d(gtVar);
                    C6376ha.m17089b(gvVar);
                }
            }
            if (!TextUtils.isEmpty((String) this.f18846a.f18863c.mo3726e(kVar.hashCode()))) {
                kVar.hashCode();
                C6057p pVar = C6058q.f17821a;
                this.f18846a.f18863c.mo3731j(kVar.hashCode());
            }
        }
    }
}
