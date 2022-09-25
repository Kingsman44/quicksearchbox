package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.text.TextUtils;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7746ik;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62963cj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.d */
/* compiled from: PG */
public final /* synthetic */ class C98433d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98446m f274808a;

    public /* synthetic */ C98433d(C98446m mVar) {
        this.f274808a = mVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98359ag agVar;
        C98446m mVar = this.f274808a;
        C98423cq cqVar = (C98423cq) obj;
        synchronized (mVar.f274846d) {
            if (mVar.f274850h.size() == 0) {
                C58976aa aaVar = C58975e.f156826a;
                agVar = C98359ag.f274567a;
            } else {
                int b = mVar.mo91116b();
                if (cqVar == C98423cq.NETWORK_RESTORED) {
                    C98435db dbVar = mVar.f274844b;
                    dbVar.f274817e = Math.max(dbVar.f274817e, dbVar.mo91098a() + b);
                } else if (cqVar == C98423cq.NETWORK_UNAVAILABLE) {
                    agVar = C98359ag.f274567a;
                }
                mVar.mo91121j(b);
                Iterator it = mVar.mo91118g(b).iterator();
                C98400bu buVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C98400bu buVar2 = (C98400bu) it.next();
                    if (buVar == null) {
                        buVar = buVar2;
                    }
                    C98414ch chVar = buVar2.f274692c;
                    if (chVar == null) {
                        chVar = C98414ch.f274733s;
                    }
                    C98413cg a = C98413cg.m162977a(chVar.f274736b);
                    if (a == null) {
                        a = C98413cg.REQUEST_TYPE_INVALID;
                    }
                    if (a == C98413cg.REQUEST_TYPE_FULL) {
                        buVar = buVar2;
                        break;
                    }
                }
                if (buVar == null) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    mVar.mo91120i();
                    agVar = C98359ag.f274567a;
                } else {
                    ArrayList<C98400bu> arrayList = new ArrayList<>();
                    arrayList.add(buVar);
                    C98414ch chVar2 = buVar.f274692c;
                    if (chVar2 == null) {
                        chVar2 = C98414ch.f274733s;
                    }
                    if (chVar2 == null) {
                        C58976aa aaVar3 = C58975e.f156826a;
                        mVar.mo91120i();
                        agVar = C98359ag.f274567a;
                    } else {
                        for (int i = 0; i < mVar.f274850h.size(); i++) {
                            C98400bu buVar3 = (C98400bu) mVar.f274850h.valueAt(i);
                            C98411ce ceVar = (C98411ce) chVar2.toBuilder();
                            if (buVar3 != buVar) {
                                C98395bp bpVar = mVar.f274845c;
                                C98414ch chVar3 = buVar3.f274692c;
                                if (chVar3 == null) {
                                    chVar3 = C98414ch.f274733s;
                                }
                                EnumSet enumSet = C98359ag.f274568b;
                                C98413cg a2 = C98413cg.m162977a(((C98414ch) ceVar.instance).f274736b);
                                if (a2 == null) {
                                    a2 = C98413cg.REQUEST_TYPE_INVALID;
                                }
                                C58838bb.m90868c(enumSet.contains(a2));
                                EnumSet enumSet2 = C98359ag.f274568b;
                                C98413cg a3 = C98413cg.m162977a(chVar3.f274736b);
                                if (a3 == null) {
                                    a3 = C98413cg.REQUEST_TYPE_INVALID;
                                }
                                C58838bb.m90868c(enumSet2.contains(a3));
                                if (!bpVar.mo91067a(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274740f))) {
                                    if (!bpVar.mo91067a(chVar3.f274740f)) {
                                        if (TextUtils.equals(((C98414ch) ceVar.instance).f274737c, chVar3.f274737c)) {
                                            int i2 = ((C98414ch) ceVar.instance).f274736b;
                                            C98413cg a4 = C98413cg.m162977a(i2);
                                            if (a4 == null) {
                                                a4 = C98413cg.REQUEST_TYPE_INVALID;
                                            }
                                            if (a4 != C98413cg.REQUEST_TYPE_FULL) {
                                                C98413cg a5 = C98413cg.m162977a(i2);
                                                if (a5 == null) {
                                                    a5 = C98413cg.REQUEST_TYPE_INVALID;
                                                }
                                                C98413cg a6 = C98413cg.m162977a(chVar3.f274736b);
                                                if (a6 == null) {
                                                    a6 = C98413cg.REQUEST_TYPE_INVALID;
                                                }
                                                if (a5 != a6) {
                                                }
                                            }
                                            if (chVar3.f274738d) {
                                                ceVar.copyOnWrite();
                                                C98414ch chVar4 = (C98414ch) ceVar.instance;
                                                chVar4.f274735a |= 4;
                                                chVar4.f274738d = true;
                                            }
                                            if (chVar3.f274739e) {
                                                ceVar.copyOnWrite();
                                                C98414ch chVar5 = (C98414ch) ceVar.instance;
                                                chVar5.f274735a |= 8;
                                                chVar5.f274739e = true;
                                            }
                                            if (chVar3.f274740f.size() != 0) {
                                                TreeSet treeSet = new TreeSet();
                                                treeSet.addAll(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274740f));
                                                treeSet.addAll(chVar3.f274740f);
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274740f = C98414ch.emptyIntList();
                                                ceVar.copyOnWrite();
                                                C98414ch chVar6 = (C98414ch) ceVar.instance;
                                                chVar6.mo91083a();
                                                C62947c.addAll((Iterable) treeSet, (List) chVar6.f274740f);
                                            }
                                            if (chVar3.f274748o.size() != 0) {
                                                TreeSet treeSet2 = new TreeSet();
                                                treeSet2.addAll(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274748o));
                                                treeSet2.addAll(chVar3.f274748o);
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274748o = C98414ch.emptyIntList();
                                                ceVar.copyOnWrite();
                                                C98414ch chVar7 = (C98414ch) ceVar.instance;
                                                chVar7.mo91087e();
                                                C62947c.addAll((Iterable) treeSet2, (List) chVar7.f274748o);
                                            }
                                            if (chVar3.f274747n.size() != 0) {
                                                C58526ih ihVar = new C58526ih();
                                                ihVar.mo55489i(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274747n));
                                                ihVar.mo55489i(chVar3.f274747n);
                                                C58528ij f = ihVar.mo55486f();
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274747n = C98414ch.emptyProtobufList();
                                                ceVar.mo91078b(f);
                                            }
                                            if (chVar3.f274743j.size() != 0) {
                                                C58526ih ihVar2 = new C58526ih();
                                                ihVar2.mo55489i(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274743j));
                                                ihVar2.mo55489i(chVar3.f274743j);
                                                C58528ij f2 = ihVar2.mo55486f();
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274743j = C98414ch.emptyProtobufList();
                                                ceVar.copyOnWrite();
                                                C98414ch chVar8 = (C98414ch) ceVar.instance;
                                                chVar8.mo91084b();
                                                C62947c.addAll((Iterable) f2, (List) chVar8.f274743j);
                                            }
                                            if (chVar3.f274745l.size() != 0) {
                                                C58526ih ihVar3 = new C58526ih();
                                                ihVar3.mo55489i(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274745l));
                                                ihVar3.mo55489i(chVar3.f274745l);
                                                C58528ij f3 = ihVar3.mo55486f();
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274745l = C98414ch.emptyProtobufList();
                                                ceVar.copyOnWrite();
                                                C98414ch chVar9 = (C98414ch) ceVar.instance;
                                                chVar9.mo91085c();
                                                C62947c.addAll((Iterable) f3, (List) chVar9.f274745l);
                                            }
                                            if (chVar3.f274746m.size() != 0) {
                                                TreeSet treeSet3 = new TreeSet();
                                                treeSet3.addAll(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274746m));
                                                treeSet3.addAll(chVar3.f274746m);
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274746m = C62942bv.emptyProtobufList();
                                                ceVar.copyOnWrite();
                                                C98414ch chVar10 = (C98414ch) ceVar.instance;
                                                chVar10.mo91086d();
                                                C62947c.addAll((Iterable) treeSet3, (List) chVar10.f274746m);
                                            }
                                            if (chVar3.f274749p) {
                                                ceVar.copyOnWrite();
                                                C98414ch chVar11 = (C98414ch) ceVar.instance;
                                                chVar11.f274735a |= 32;
                                                chVar11.f274749p = true;
                                            }
                                            if (chVar3.f274744k) {
                                                ceVar.copyOnWrite();
                                                C98414ch chVar12 = (C98414ch) ceVar.instance;
                                                chVar12.f274735a |= 16;
                                                chVar12.f274744k = true;
                                            }
                                            if (chVar3.f274750q) {
                                                ceVar.copyOnWrite();
                                                C98414ch chVar13 = (C98414ch) ceVar.instance;
                                                chVar13.f274735a |= 64;
                                                chVar13.f274750q = true;
                                            }
                                            int i3 = ((C98414ch) ceVar.instance).f274736b;
                                            C98413cg a7 = C98413cg.m162977a(i3);
                                            if (a7 == null) {
                                                a7 = C98413cg.REQUEST_TYPE_INVALID;
                                            }
                                            if (a7 == C98413cg.REQUEST_TYPE_ENTRY_TYPE_RESTRICT) {
                                                EnumSet<E> noneOf = EnumSet.noneOf(C7746ik.class);
                                                noneOf.addAll(new C62963cj(((C98414ch) ceVar.instance).f274741g, C98414ch.f274732h));
                                                noneOf.addAll(new C62963cj(chVar3.f274741g, C98414ch.f274732h));
                                                ceVar.copyOnWrite();
                                                ((C98414ch) ceVar.instance).f274741g = C98414ch.emptyIntList();
                                                ceVar.mo91079c(noneOf);
                                            } else {
                                                C98413cg a8 = C98413cg.m162977a(i3);
                                                if (a8 == null) {
                                                    a8 = C98413cg.REQUEST_TYPE_INVALID;
                                                }
                                                if (a8 == C98413cg.REQUEST_TYPE_CARD_SELECTOR) {
                                                    C58526ih ihVar4 = new C58526ih();
                                                    ihVar4.mo55489i(Collections.unmodifiableList(((C98414ch) ceVar.instance).f274742i));
                                                    ihVar4.mo55489i(chVar3.f274742i);
                                                    C58528ij f4 = ihVar4.mo55486f();
                                                    ceVar.copyOnWrite();
                                                    ((C98414ch) ceVar.instance).f274742i = C98414ch.emptyProtobufList();
                                                    ceVar.mo91077a(f4);
                                                }
                                            }
                                            arrayList.add(buVar3);
                                        }
                                    }
                                }
                            }
                            chVar2 = (C98414ch) ceVar.build();
                        }
                        C58976aa aaVar4 = C58975e.f156826a;
                        C98435db dbVar2 = mVar.f274844b;
                        ArrayList<C98400bu> arrayList2 = new ArrayList<>();
                        for (C98400bu buVar4 : arrayList) {
                            C98418cl clVar = buVar4.f274693d;
                            if (clVar == null) {
                                clVar = C98418cl.f274760h;
                            }
                            C98417ck ckVar = (C98417ck) clVar.toBuilder();
                            C98418cl clVar2 = buVar4.f274693d;
                            if (clVar2 == null) {
                                clVar2 = C98418cl.f274760h;
                            }
                            if ((clVar2.f274762a & 16) != 0) {
                                ckVar.copyOnWrite();
                                C98418cl clVar3 = (C98418cl) ckVar.instance;
                                clVar3.f274762a |= 16;
                                clVar3.f274768g = false;
                            }
                            C98418cl clVar4 = buVar4.f274693d;
                            if (clVar4 == null) {
                                clVar4 = C98418cl.f274760h;
                            }
                            if ((clVar4.f274762a & 1) == 0) {
                                ckVar.copyOnWrite();
                                C98418cl clVar5 = (C98418cl) ckVar.instance;
                                clVar5.f274762a |= 1;
                                clVar5.f274763b = b;
                            }
                            C98399bt btVar = (C98399bt) buVar4.toBuilder();
                            btVar.copyOnWrite();
                            C98400bu buVar5 = (C98400bu) btVar.instance;
                            C98418cl clVar6 = (C98418cl) ckVar.build();
                            clVar6.getClass();
                            buVar5.f274693d = clVar6;
                            buVar5.f274690a |= 4;
                            arrayList2.add((C98400bu) btVar.build());
                        }
                        dbVar2.f274814b.mo91095c(b);
                        mVar.mo91122m(arrayList2);
                        for (C98400bu buVar6 : arrayList2) {
                            mVar.f274851i.put(buVar6.f274691b, b);
                        }
                        agVar = new C98359ag(chVar2);
                        C98445l lVar = new C98445l(mVar, b, arrayList2);
                        lVar.mo91115a("getNext");
                        agVar.f274570d = lVar;
                        mVar.mo91120i();
                    }
                }
            }
        }
        return agVar;
    }
}
