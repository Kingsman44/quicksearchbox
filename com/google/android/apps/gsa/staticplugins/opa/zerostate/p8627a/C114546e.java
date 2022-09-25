package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114830c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3803ag.p3809c.C49156z;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3994s.p3995a.C53200fb;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53349kp;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.assistant.p3994s.p3995a.C53364ld;
import com.google.assistant.p3994s.p3995a.C53365le;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53368lh;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53419ne;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58585km;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.a.e */
/* compiled from: PG */
public final class C114546e {

    /* renamed from: a */
    public static final C59071e f317638a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.a.e");

    /* renamed from: d */
    private static final C114830c f317639d = new C114830c();

    /* renamed from: b */
    public Map f317640b = new HashMap();

    /* renamed from: c */
    public C58585km f317641c = new C58331bb();

    /* renamed from: e */
    private final C86124t f317642e;

    /* renamed from: f */
    private final C21370a f317643f;

    /* renamed from: g */
    private final List f317644g;

    public C114546e(C86124t tVar, C21370a aVar, C53370lj ljVar, List list) {
        C53420nf nfVar;
        C53420nf nfVar2;
        this.f317642e = tVar;
        this.f317644g = list;
        this.f317643f = aVar;
        for (C53366lf lfVar : ljVar.f140050b) {
            String str = lfVar.f140039d;
            if (this.f317640b.containsKey(str)) {
                ((C59052c) ((C59052c) f317638a.mo56226d()).mo56372aa(29254)).mo56389s("Found multiple CachedElementCandidates with the same ID: %s. Dropping the non-initial one.", str);
            } else {
                this.f317640b.put(str, lfVar);
                if (lfVar.f140037b == 4) {
                    nfVar = (C53420nf) lfVar.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                if ((nfVar.f140167a & C89885b.HTTP_VALUE) != 0) {
                    if (lfVar.f140037b == 4) {
                        nfVar2 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar2 = C53420nf.f140165o;
                    }
                    C53250gy gyVar = nfVar2.f140176j;
                    gyVar = gyVar == null ? C53250gy.f139586c : gyVar;
                    this.f317641c.mo54920x(C53200fb.m86786a(gyVar.f139588a), gyVar);
                }
            }
        }
        this.f317640b.size();
    }

    /* renamed from: a */
    public final C53366lf mo101401a(C53366lf lfVar) {
        C53420nf nfVar;
        C53420nf nfVar2;
        C53350kq kqVar;
        C53420nf nfVar3;
        C53350kq kqVar2;
        if (lfVar.f140037b == 4) {
            nfVar = (C53420nf) lfVar.f140038c;
        } else {
            nfVar = C53420nf.f140165o;
        }
        if (nfVar.f140168b != 3) {
            return lfVar;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        if (lfVar.f140037b == 4) {
            nfVar2 = (C53420nf) lfVar.f140038c;
        } else {
            nfVar2 = C53420nf.f140165o;
        }
        if (nfVar2.f140168b == 3) {
            kqVar = (C53350kq) nfVar2.f140169c;
        } else {
            kqVar = C53350kq.f139991e;
        }
        for (C53354ku kuVar : kqVar.f139994b) {
            C52282lz lzVar = kuVar.f140002b;
            if (lzVar == null) {
                lzVar = C52282lz.f137236h;
            }
            if (hashSet.add(C114874f.m190404d(lzVar))) {
                arrayList.add(kuVar);
            }
        }
        if (this.f317642e.mo79746e(C90014bt.f247672la)) {
            for (C53354ku kuVar2 : this.f317644g) {
                C52282lz lzVar2 = kuVar2.f140002b;
                if (lzVar2 == null) {
                    lzVar2 = C52282lz.f137236h;
                }
                if (hashSet.add(C114874f.m190404d(lzVar2))) {
                    arrayList.add(kuVar2);
                }
            }
        }
        Collections.sort(arrayList, f317639d);
        if (lfVar.f140037b == 4) {
            nfVar3 = (C53420nf) lfVar.f140038c;
        } else {
            nfVar3 = C53420nf.f140165o;
        }
        C53364ld ldVar = (C53364ld) lfVar.toBuilder();
        C53419ne neVar = (C53419ne) nfVar3.toBuilder();
        if (nfVar3.f140168b == 3) {
            kqVar2 = (C53350kq) nfVar3.f140169c;
        } else {
            kqVar2 = C53350kq.f139991e;
        }
        C53349kp kpVar = (C53349kp) kqVar2.toBuilder();
        kpVar.copyOnWrite();
        ((C53350kq) kpVar.instance).f139994b = C53350kq.emptyProtobufList();
        kpVar.mo53979a(arrayList);
        neVar.copyOnWrite();
        C53420nf nfVar4 = (C53420nf) neVar.instance;
        C53350kq kqVar3 = (C53350kq) kpVar.build();
        kqVar3.getClass();
        nfVar4.f140169c = kqVar3;
        nfVar4.f140168b = 3;
        ldVar.copyOnWrite();
        C53366lf lfVar2 = (C53366lf) ldVar.instance;
        C53420nf nfVar5 = (C53420nf) neVar.build();
        nfVar5.getClass();
        lfVar2.f140038c = nfVar5;
        lfVar2.f140037b = 4;
        return (C53366lf) ldVar.build();
    }

    /* renamed from: b */
    public final C58833ax mo101402b(C53368lh lhVar, C114545d dVar) {
        C58833ax axVar;
        if (lhVar == null) {
            ((C59052c) ((C59052c) f317638a.mo56226d()).mo56372aa(29246)).mo56386p("#getBestCachedElementCandidate(): reference is null.");
            return C58836b.f156633a;
        }
        if (lhVar.f140046a.size() != 0) {
            Iterator it = lhVar.f140046a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    axVar = C58836b.f156633a;
                    break;
                }
                String str = (String) it.next();
                C53366lf lfVar = (C53366lf) this.f317640b.get(str);
                if (lfVar == null) {
                    ((C59052c) ((C59052c) f317638a.mo56226d()).mo56372aa(29248)).mo56389s("#getBestCachedElementCandidateInternal(): CachedElementCandidate with id %s not found", str);
                } else {
                    C53366lf a = mo101401a(lfVar);
                    this.f317640b.put(str, a);
                    if (mo101403c(a, dVar, false)) {
                        axVar = C58833ax.m90834k(a);
                        break;
                    }
                }
            }
        } else {
            axVar = C58836b.f156633a;
        }
        return axVar.mo56113h() ? axVar : C58836b.f156633a;
    }

    /* renamed from: c */
    public final boolean mo101403c(C53366lf lfVar, C114545d dVar, boolean z) {
        C48971br brVar;
        C49156z zVar;
        C48971br brVar2;
        C49156z zVar2;
        C53420nf nfVar;
        C53350kq kqVar;
        C53365le a = C53365le.m86815a(lfVar.f140037b);
        if (a.ordinal() == 4 && !z) {
            if (lfVar.f140037b == 4) {
                nfVar = (C53420nf) lfVar.f140038c;
            } else {
                nfVar = C53420nf.f140165o;
            }
            if (nfVar.f140168b != 3 || ((C53350kq) nfVar.f140169c).f139994b.size() != 0) {
                if (nfVar.f140168b == 3) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(this.f317643f.mo26870b());
                    int i = instance.get(11);
                    if (nfVar.f140168b == 3) {
                        kqVar = (C53350kq) nfVar.f140169c;
                    } else {
                        kqVar = C53350kq.f139991e;
                    }
                    Iterator it = kqVar.f139994b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C53354ku kuVar = (C53354ku) it.next();
                        if (C114874f.m190418r(kuVar)) {
                            C52282lz lzVar = kuVar.f140002b;
                            if (lzVar == null) {
                                lzVar = C52282lz.f137236h;
                            }
                            if (C114874f.m190413m(lzVar)) {
                                break;
                            }
                        }
                        if (i > 16 && C114874f.m190418r(kuVar)) {
                            C52282lz lzVar2 = kuVar.f140002b;
                            if (lzVar2 == null) {
                                lzVar2 = C52282lz.f137236h;
                            }
                            if (C114874f.m190417q(lzVar2)) {
                                break;
                            }
                        }
                    }
                }
            }
            a = C53365le.CACHEDELEMENT_NOT_SET;
        }
        if (!dVar.mo101397a().contains(a)) {
            return false;
        }
        if ((lfVar.f140036a & 8) == 0) {
            return true;
        }
        C48952az azVar = lfVar.f140041f;
        if (azVar == null) {
            azVar = C48952az.f126657c;
        }
        if (azVar.f126659a == 1 && ((C48971br) azVar.f126660b).f126691a == 1) {
            long b = this.f317643f.mo26870b();
            if (azVar.f126659a == 1) {
                brVar = (C48971br) azVar.f126660b;
            } else {
                brVar = C48971br.f126689d;
            }
            if (brVar.f126691a == 1) {
                zVar = (C49156z) brVar.f126692b;
            } else {
                zVar = C49156z.f127111d;
            }
            C63042fg fgVar = zVar.f127115c;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (b > C62953e.m95478c(fgVar)) {
                return false;
            }
            if (azVar.f126659a == 1) {
                brVar2 = (C48971br) azVar.f126660b;
            } else {
                brVar2 = C48971br.f126689d;
            }
            if (brVar2.f126691a == 1) {
                zVar2 = (C49156z) brVar2.f126692b;
            } else {
                zVar2 = C49156z.f127111d;
            }
            C63042fg fgVar2 = zVar2.f127114b;
            if (fgVar2 == null) {
                fgVar2 = C63042fg.f170152c;
            }
            if (b < C62953e.m95478c(fgVar2)) {
                return false;
            }
        }
        return true;
    }
}
