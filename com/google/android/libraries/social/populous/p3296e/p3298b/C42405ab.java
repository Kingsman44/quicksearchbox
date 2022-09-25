package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.p3269d.p3270a.C41932g;
import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.C42306ce;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.common.base.C58817ah;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58662ni;
import com.google.p4181bi.C55794ad;
import com.google.p4181bi.C55796af;
import com.google.p4181bi.C55797ag;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55828ba;
import com.google.p4181bi.C55846h;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55853o;
import com.google.p4181bi.C55855q;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55858t;
import com.google.p4181bi.C55864z;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.e.b.ab */
/* compiled from: PG */
public final class C42405ab {

    /* renamed from: a */
    public final C58833ax f111226a;

    /* renamed from: b */
    public final C58833ax f111227b;

    /* renamed from: c */
    public final Map f111228c;

    /* renamed from: d */
    public int f111229d;

    public C42405ab(C55847i iVar, C41932g gVar, int i, Map map) {
        boolean z = true;
        C58838bb.m90868c((gVar == null ? false : z) ^ (iVar != null));
        this.f111226a = C58833ax.m90833j(iVar);
        this.f111227b = C58833ax.m90833j(gVar);
        this.f111229d = i;
        HashMap j = C58662ni.m90351j(map.size());
        for (Map.Entry entry : map.entrySet()) {
            j.put(entry.getKey(), ((C42313cl) entry.getValue()).mo45276b());
        }
        this.f111228c = j;
    }

    /* renamed from: e */
    static C58485gu m74676e(Object obj) {
        C55815ay ayVar;
        C55794ad adVar;
        C55853o oVar;
        C58480gp e = C58485gu.m89837e();
        HashSet hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        if (obj != null) {
            arrayDeque.offer(obj);
        }
        while (!arrayDeque.isEmpty()) {
            Object poll = arrayDeque.poll();
            if (!hashSet.contains(poll)) {
                e.mo55395g(poll);
                hashSet.add(poll);
                if (poll instanceof C55847i) {
                    C55847i iVar = (C55847i) poll;
                    int i = iVar.f147360a;
                    int a = C55846h.m87793a(i);
                    int i2 = a - 1;
                    if (a == 0) {
                        throw null;
                    } else if (i2 == 0) {
                        if (i == 1) {
                            ayVar = (C55815ay) iVar.f147361b;
                        } else {
                            ayVar = C55815ay.f147275f;
                        }
                        arrayDeque.add(ayVar);
                    } else if (i2 == 1) {
                        if (i == 2) {
                            adVar = (C55794ad) iVar.f147361b;
                        } else {
                            adVar = C55794ad.f147223g;
                        }
                        arrayDeque.add(adVar);
                    } else if (i2 == 2) {
                        if (i == 3) {
                            oVar = (C55853o) iVar.f147361b;
                        } else {
                            oVar = C55853o.f147374d;
                        }
                        arrayDeque.add(oVar);
                    }
                } else if (poll instanceof C55815ay) {
                    arrayDeque.addAll(((C55815ay) poll).f147279c);
                } else if (poll instanceof C55794ad) {
                    arrayDeque.addAll(((C55794ad) poll).f147227c);
                } else if (poll instanceof C55853o) {
                    arrayDeque.addAll(((C55853o) poll).f147377b);
                }
            }
        }
        return e.mo55394f();
    }

    /* renamed from: p */
    private final C58485gu m74678p() {
        C55815ay ayVar;
        C55794ad adVar;
        C55853o oVar;
        C58833ax axVar = this.f111226a;
        if (!axVar.mo56113h()) {
            return C58485gu.m89845m();
        }
        C55847i iVar = (C55847i) axVar.mo56107c();
        int i = iVar.f147360a;
        int a = C55846h.m87793a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                ayVar = (C55815ay) iVar.f147361b;
            } else {
                ayVar = C55815ay.f147275f;
            }
            return C58485gu.m89842j(ayVar.f147279c);
        } else if (i2 == 1) {
            C58480gp e = C58485gu.m89837e();
            if (iVar.f147360a == 2) {
                adVar = (C55794ad) iVar.f147361b;
            } else {
                adVar = C55794ad.f147223g;
            }
            for (C55815ay ayVar2 : adVar.f147227c) {
                e.mo55396h(ayVar2.f147279c);
            }
            return e.mo55394f();
        } else if (i2 != 2) {
            return C58485gu.m89845m();
        } else {
            if (i == 3) {
                oVar = (C55853o) iVar.f147361b;
            } else {
                oVar = C55853o.f147374d;
            }
            return C58485gu.m89842j(oVar.f147377b);
        }
    }

    /* renamed from: a */
    public final C58833ax mo45399a(C55797ag agVar) {
        C55815ay ayVar;
        C55828ba baVar;
        if (mo45410l()) {
            C55847i iVar = (C55847i) this.f111226a.mo56107c();
            if (iVar.f147360a == 1) {
                ayVar = (C55815ay) iVar.f147361b;
            } else {
                ayVar = C55815ay.f147275f;
            }
            int a = C55796af.m87735a(agVar.f147235b);
            int i = a - 1;
            if (a == 0) {
                throw null;
            } else if (i == 0) {
                for (C55856r rVar : ayVar.f147279c) {
                    if (rVar.f147383b == 2) {
                        if (((C55864z) rVar.f147384c).f147409b.equals(agVar.f147235b == 2 ? (String) agVar.f147236c : BuildConfig.FLAVOR)) {
                            return C58833ax.m90834k(rVar);
                        }
                    }
                }
            } else if (i == 1) {
                for (C55856r rVar2 : ayVar.f147279c) {
                    if (rVar2.f147383b == 3) {
                        if (!((C55828ba) rVar2.f147384c).f147325b.equals(agVar.f147235b == 3 ? (String) agVar.f147236c : BuildConfig.FLAVOR)) {
                            if (rVar2.f147383b == 3) {
                                baVar = (C55828ba) rVar2.f147384c;
                            } else {
                                baVar = C55828ba.f147322d;
                            }
                            if (baVar.f147326c.equals(agVar.f147235b == 3 ? (String) agVar.f147236c : BuildConfig.FLAVOR)) {
                            }
                        }
                        return C58833ax.m90834k(rVar2);
                    }
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C58833ax mo45400b() {
        C55815ay ayVar;
        if (mo45410l()) {
            C55847i iVar = (C55847i) this.f111226a.mo56107c();
            if (iVar.f147360a == 1) {
                ayVar = (C55815ay) iVar.f147361b;
            } else {
                ayVar = C55815ay.f147275f;
            }
            if (ayVar.f147279c.size() == 1) {
                return C58833ax.m90834k((C55856r) ayVar.f147279c.get(0));
            }
            for (C55856r rVar : ayVar.f147279c) {
                C55858t tVar = rVar.f147385d;
                if (tVar == null) {
                    tVar = C55858t.f147392f;
                }
                if (tVar.f147398e) {
                    return C58833ax.m90834k(rVar);
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public final C58833ax mo45401c(Object obj) {
        C58833ax d = mo45402d(obj);
        return d.mo56113h() ? C58833ax.m90833j(((C42313cl) d.mo56107c()).mo45275a()) : C58836b.f156633a;
    }

    /* renamed from: d */
    public final C58833ax mo45402d(Object obj) {
        C58838bb.m90866a(obj, "Metadata key cannot be null.");
        C58838bb.m90869d(!(obj instanceof C58833ax), "Metadata key cannot be an Optional.");
        return C58833ax.m90833j((C42313cl) this.f111228c.get(obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42405ab) {
            C42405ab abVar = (C42405ab) obj;
            return this.f111229d == abVar.f111229d && C58832aw.m90831a(this.f111226a, abVar.f111226a) && C58832aw.m90831a(this.f111227b, abVar.f111227b) && C58832aw.m90831a(this.f111228c, abVar.f111228c);
        }
    }

    /* renamed from: f */
    public final C58485gu mo45404f(Set set) {
        return C58485gu.m89841i(C58557jl.m90124e(m74678p(), new C42447z(set)));
    }

    /* renamed from: g */
    public final Object mo45405g() {
        C58833ax axVar = this.f111226a;
        if (!axVar.mo56113h()) {
            axVar = this.f111227b;
        }
        return axVar.mo56107c();
    }

    /* renamed from: h */
    public final void mo45406h(Object obj, C42313cl clVar) {
        C58838bb.m90866a(obj, "Metadata key cannot be null.");
        C58838bb.m90869d(!(obj instanceof C58833ax), "Metadata key cannot be an Optional.");
        C58838bb.m90866a(clVar, "Metadata cannot be null. To remove metadata for a key, call ::removeMetadata.");
        this.f111228c.put(obj, clVar.mo45276b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f111226a, this.f111227b, this.f111228c, Integer.valueOf(this.f111229d)});
    }

    /* renamed from: i */
    public final void mo45408i(Object obj, C58817ah ahVar) {
        C58838bb.m90866a(obj, "Metadata key cannot be null.");
        C58838bb.m90869d(!(obj instanceof C58833ax), "Metadata key cannot be an Optional.");
        C58838bb.m90866a(ahVar, "Updater function cannot be null.");
        mo45406h(obj, ((C42313cl) ahVar.apply(mo45413o(obj))).mo45276b());
    }

    /* renamed from: k */
    public final boolean mo45409k() {
        C58833ax axVar = this.f111226a;
        return axVar.mo56113h() && ((C55847i) axVar.mo56107c()).f147360a == 2;
    }

    /* renamed from: l */
    public final boolean mo45410l() {
        C58833ax axVar = this.f111226a;
        return axVar.mo56113h() && ((C55847i) axVar.mo56107c()).f147360a == 1;
    }

    /* renamed from: m */
    public final boolean mo45411m() {
        C58485gu p = m74678p();
        int size = p.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (((C55856r) p.get(i)).f147387f) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* renamed from: n */
    public final int mo45412n() {
        return this.f111226a.mo56113h() ? 1 : 2;
    }

    /* renamed from: o */
    public final C42306ce mo45413o(Object obj) {
        C58838bb.m90866a(obj, "Metadata key cannot be null.");
        C58838bb.m90869d(!(obj instanceof C58833ax), "Metadata key cannot be an Optional.");
        return (C42306ce) mo45402d(obj).mo56106b(C42445x.f111352a).mo56108d(C42446y.f111353a);
    }

    /* renamed from: j */
    public static boolean m74677j(Set set, C55856r rVar) {
        int a = C55855q.m87794a(rVar.f147383b);
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            return set.contains(C42262ao.EMAIL);
        } else {
            if (i == 1) {
                return set.contains(C42262ao.PHONE_NUMBER);
            }
            if (i != 2) {
                return false;
            }
            return set.contains(C42262ao.IN_APP_NOTIFICATION_TARGET);
        }
    }
}
