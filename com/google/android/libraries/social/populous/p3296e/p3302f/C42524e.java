package com.google.android.libraries.social.populous.p3296e.p3302f;

import com.google.android.libraries.social.populous.core.C42305cd;
import com.google.android.libraries.social.populous.core.C42306ce;
import com.google.android.libraries.social.populous.core.C42313cl;
import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42422as;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import com.google.p4181bi.C55794ad;
import com.google.p4181bi.C55810at;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55846h;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55853o;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55858t;
import com.google.protobuf.MessageLite;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.social.populous.e.f.e */
/* compiled from: PG */
public final class C42524e implements C42520a {

    /* renamed from: a */
    public static final Comparator f111519a = C42521b.f111505a;

    /* renamed from: b */
    public final C42591z f111520b;

    public C42524e(C42591z zVar) {
        this.f111520b = zVar;
    }

    /* renamed from: a */
    public static double m74971a(C42405ab abVar) {
        C55815ay ayVar;
        if (abVar.mo45410l()) {
            C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
            if (iVar.f147360a == 1) {
                ayVar = (C55815ay) iVar.f147361b;
            } else {
                ayVar = C55815ay.f147275f;
            }
            C58833ax d = abVar.mo45402d(ayVar);
            if (d.mo56113h()) {
                return ((Double) ((C42313cl) d.mo56107c()).mo45278d().mo56109e(Double.valueOf(C59203do.f157270a))).doubleValue();
            }
        }
        return C59203do.f157270a;
    }

    /* renamed from: b */
    public static double m74972b(C42405ab abVar) {
        C55815ay ayVar;
        C55794ad adVar;
        C55853o oVar;
        C58833ax axVar = abVar.f111226a;
        if (!axVar.mo56113h()) {
            return C59203do.f157270a;
        }
        C55847i iVar = (C55847i) axVar.mo56107c();
        C42422as asVar = C42422as.NOT_COMPARABLE;
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
            C55817b bVar = ayVar.f147278b;
            if (bVar == null) {
                bVar = C55817b.f147283d;
            }
            return bVar.f147287c;
        } else if (i2 == 1) {
            if (i == 2) {
                adVar = (C55794ad) iVar.f147361b;
            } else {
                adVar = C55794ad.f147223g;
            }
            C55858t tVar = adVar.f147226b;
            if (tVar == null) {
                tVar = C55858t.f147392f;
            }
            C55817b bVar2 = tVar.f147397d;
            if (bVar2 == null) {
                bVar2 = C55817b.f147283d;
            }
            return bVar2.f147287c;
        } else if (i2 != 2) {
            return C59203do.f157270a;
        } else {
            if (i == 3) {
                oVar = (C55853o) iVar.f147361b;
            } else {
                oVar = C55853o.f147374d;
            }
            C55858t tVar2 = oVar.f147376a;
            if (tVar2 == null) {
                tVar2 = C55858t.f147392f;
            }
            C55817b bVar3 = tVar2.f147397d;
            if (bVar3 == null) {
                bVar3 = C55817b.f147283d;
            }
            return bVar3.f147287c;
        }
    }

    /* renamed from: c */
    public static C42405ab m74973c(C42522c cVar) {
        C55815ay ayVar;
        Double d;
        double d2;
        C42405ab abVar = cVar.f111507b;
        if (cVar.f111513h == null) {
            Iterator it = cVar.f111509d.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C42523d dVar = (C42523d) it.next();
                if (cVar.f111506a) {
                    if (!dVar.f111516c.isEmpty()) {
                        break;
                    }
                } else if (!dVar.f111515b.isEmpty()) {
                    break;
                }
            }
        }
        if (abVar.mo45410l()) {
            C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
            if (iVar.f147360a == 1) {
                ayVar = (C55815ay) iVar.f147361b;
            } else {
                ayVar = C55815ay.f147275f;
            }
            for (C55856r rVar : ayVar.f147279c) {
                C42523d dVar2 = (C42523d) cVar.f111509d.get(m74976f(rVar));
                if (dVar2 != null) {
                    if (cVar.f111506a) {
                        d2 = dVar2.f111518e;
                    } else {
                        d2 = dVar2.f111517d;
                    }
                    if (d2 > C59203do.f157270a) {
                        C55858t tVar = rVar.f147385d;
                        if (tVar == null) {
                            tVar = C55858t.f147392f;
                        }
                        C55817b bVar = tVar.f147397d;
                        if (bVar == null) {
                            bVar = C55817b.f147283d;
                        }
                        m74977g(abVar, rVar, Double.valueOf(bVar.f147287c + d2));
                    }
                }
            }
            if (cVar.f111512g != null) {
                C55817b bVar2 = ayVar.f147278b;
                if (bVar2 == null) {
                    bVar2 = C55817b.f147283d;
                }
                d = Double.valueOf(bVar2.f147287c + cVar.f111512g.doubleValue());
            } else {
                d = null;
            }
            m74977g(abVar, ayVar, d);
            m74977g(abVar, (MessageLite) abVar.f111226a.mo56107c(), d);
        }
        return abVar;
    }

    /* renamed from: d */
    public static void m74974d(ClientConfigInternal clientConfigInternal, List list, C42522c[] cVarArr, boolean z, int i, Map map) {
        C42523d dVar;
        int i2;
        boolean z2 = z;
        Map map2 = map;
        int i3 = 0;
        while (i3 < list.size()) {
            C42405ab abVar = (C42405ab) list.get(i3);
            C42522c cVar = new C42522c(abVar, i3, z2, i);
            cVarArr[i3] = cVar;
            if (abVar.mo45410l()) {
                C58485gu f = abVar.mo45404f(clientConfigInternal.f110725k);
                int size = f.size();
                int i4 = 0;
                while (i4 < size) {
                    C55856r rVar = (C55856r) f.get(i4);
                    String f2 = m74976f(rVar);
                    if (f2 == null) {
                        dVar = null;
                    } else {
                        C42523d dVar2 = (C42523d) map2.get(f2);
                        if (dVar2 == null) {
                            dVar2 = new C42523d(f2);
                            map2.put(f2, dVar2);
                        }
                        dVar = dVar2;
                    }
                    if (dVar != null) {
                        if (z2) {
                            dVar.f111515b.add(Integer.valueOf(i3));
                            C55858t tVar = rVar.f147385d;
                            if (tVar == null) {
                                tVar = C55858t.f147392f;
                            }
                            C55817b bVar = tVar.f147397d;
                            if (bVar == null) {
                                bVar = C55817b.f147283d;
                            }
                            double d = bVar.f147287c;
                            i2 = i3;
                            if (d > dVar.f111517d) {
                                dVar.f111517d = d;
                            }
                        } else {
                            i2 = i3;
                            dVar.f111516c.add(Integer.valueOf(i2));
                            C55858t tVar2 = rVar.f147385d;
                            if (tVar2 == null) {
                                tVar2 = C55858t.f147392f;
                            }
                            C55817b bVar2 = tVar2.f147397d;
                            if (bVar2 == null) {
                                bVar2 = C55817b.f147283d;
                            }
                            double d2 = bVar2.f147287c;
                            if (d2 > dVar.f111518e) {
                                dVar.f111518e = d2;
                            }
                        }
                        cVar.f111509d.put(dVar.f111514a, dVar);
                        C55858t tVar3 = rVar.f147385d;
                        if (tVar3 == null) {
                            tVar3 = C55858t.f147392f;
                        }
                        C55810at atVar = tVar3.f147396c;
                        if (atVar == null) {
                            atVar = C55810at.f147265f;
                        }
                        if ((atVar.f147267a & 1) != 0) {
                            Set set = cVar.f111510e;
                            C55858t tVar4 = rVar.f147385d;
                            if (tVar4 == null) {
                                tVar4 = C55858t.f147392f;
                            }
                            C55810at atVar2 = tVar4.f147396c;
                            if (atVar2 == null) {
                                atVar2 = C55810at.f147265f;
                            }
                            set.add(atVar2.f147268b);
                        }
                    } else {
                        i2 = i3;
                    }
                    i4++;
                    i3 = i2;
                }
            } else {
                ClientConfigInternal clientConfigInternal2 = clientConfigInternal;
            }
            i3++;
        }
    }

    /* renamed from: e */
    public static boolean m74975e(C42405ab abVar) {
        C55815ay ayVar;
        if (!abVar.mo45410l()) {
            return false;
        }
        C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
        if (iVar.f147360a == 1) {
            ayVar = (C55815ay) iVar.f147361b;
        } else {
            ayVar = C55815ay.f147275f;
        }
        C58833ax d = abVar.mo45402d(ayVar);
        if (d.mo56113h()) {
            return ((C42313cl) d.mo56107c()).mo45278d().mo56113h();
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m74976f(com.google.p4181bi.C55856r r8) {
        /*
            com.google.android.libraries.social.populous.e.b.as r0 = com.google.android.libraries.social.populous.p3296e.p3298b.C42422as.NOT_COMPARABLE
            int r0 = r8.f147383b
            int r1 = com.google.p4181bi.C55855q.m87794a(r0)
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x00ca
            r1 = 2
            if (r2 == 0) goto L_0x00be
            r4 = 1
            r5 = 3
            if (r2 == r4) goto L_0x0094
            if (r2 == r1) goto L_0x0018
            goto L_0x0093
        L_0x0018:
            r2 = 4
            if (r0 != r2) goto L_0x0020
            java.lang.Object r0 = r8.f147384c
            com.google.bi.ag r0 = (com.google.p4181bi.C55797ag) r0
            goto L_0x0022
        L_0x0020:
            com.google.bi.ag r0 = com.google.p4181bi.C55797ag.f147232e
        L_0x0022:
            int r0 = r0.f147234a
            r0 = r0 & r4
            java.lang.String r4 = "iant:"
            if (r0 == 0) goto L_0x003f
            int r0 = r8.f147383b
            if (r0 != r2) goto L_0x0032
            java.lang.Object r8 = r8.f147384c
            com.google.bi.ag r8 = (com.google.p4181bi.C55797ag) r8
            goto L_0x0034
        L_0x0032:
            com.google.bi.ag r8 = com.google.p4181bi.C55797ag.f147232e
        L_0x0034:
            java.lang.String r8 = r8.f147237d
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = r4.concat(r8)
            return r8
        L_0x003f:
            int r0 = r8.f147383b
            if (r0 != r2) goto L_0x0048
            java.lang.Object r6 = r8.f147384c
            com.google.bi.ag r6 = (com.google.p4181bi.C55797ag) r6
            goto L_0x004a
        L_0x0048:
            com.google.bi.ag r6 = com.google.p4181bi.C55797ag.f147232e
        L_0x004a:
            int r6 = r6.f147235b
            java.lang.String r7 = ""
            if (r6 != r1) goto L_0x006b
            if (r0 != r2) goto L_0x0057
            java.lang.Object r8 = r8.f147384c
            com.google.bi.ag r8 = (com.google.p4181bi.C55797ag) r8
            goto L_0x0059
        L_0x0057:
            com.google.bi.ag r8 = com.google.p4181bi.C55797ag.f147232e
        L_0x0059:
            int r0 = r8.f147235b
            if (r0 != r1) goto L_0x0062
            java.lang.Object r8 = r8.f147236c
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
        L_0x0062:
            java.lang.String r8 = java.lang.String.valueOf(r7)
            java.lang.String r8 = r4.concat(r8)
            return r8
        L_0x006b:
            if (r0 != r2) goto L_0x0072
            java.lang.Object r1 = r8.f147384c
            com.google.bi.ag r1 = (com.google.p4181bi.C55797ag) r1
            goto L_0x0074
        L_0x0072:
            com.google.bi.ag r1 = com.google.p4181bi.C55797ag.f147232e
        L_0x0074:
            int r1 = r1.f147235b
            if (r1 != r5) goto L_0x0093
            if (r0 != r2) goto L_0x007f
            java.lang.Object r8 = r8.f147384c
            com.google.bi.ag r8 = (com.google.p4181bi.C55797ag) r8
            goto L_0x0081
        L_0x007f:
            com.google.bi.ag r8 = com.google.p4181bi.C55797ag.f147232e
        L_0x0081:
            int r0 = r8.f147235b
            if (r0 != r5) goto L_0x008a
            java.lang.Object r8 = r8.f147236c
            r7 = r8
            java.lang.String r7 = (java.lang.String) r7
        L_0x008a:
            java.lang.String r8 = java.lang.String.valueOf(r7)
            java.lang.String r8 = r4.concat(r8)
            return r8
        L_0x0093:
            return r3
        L_0x0094:
            if (r0 != r5) goto L_0x009b
            java.lang.Object r0 = r8.f147384c
            com.google.bi.ba r0 = (com.google.p4181bi.C55828ba) r0
            goto L_0x009d
        L_0x009b:
            com.google.bi.ba r0 = com.google.p4181bi.C55828ba.f147322d
        L_0x009d:
            int r0 = r0.f147324a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00b0
            int r0 = r8.f147383b
            if (r0 != r5) goto L_0x00ab
            java.lang.Object r8 = r8.f147384c
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            goto L_0x00ad
        L_0x00ab:
            com.google.bi.ba r8 = com.google.p4181bi.C55828ba.f147322d
        L_0x00ad:
            java.lang.String r8 = r8.f147326c
            goto L_0x00bd
        L_0x00b0:
            int r0 = r8.f147383b
            if (r0 != r5) goto L_0x00b9
            java.lang.Object r8 = r8.f147384c
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            goto L_0x00bb
        L_0x00b9:
            com.google.bi.ba r8 = com.google.p4181bi.C55828ba.f147322d
        L_0x00bb:
            java.lang.String r8 = r8.f147325b
        L_0x00bd:
            return r8
        L_0x00be:
            if (r0 != r1) goto L_0x00c5
            java.lang.Object r8 = r8.f147384c
            com.google.bi.z r8 = (com.google.p4181bi.C55864z) r8
            goto L_0x00c7
        L_0x00c5:
            com.google.bi.z r8 = com.google.p4181bi.C55864z.f147406f
        L_0x00c7:
            java.lang.String r8 = r8.f147409b
            return r8
        L_0x00ca:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3302f.C42524e.m74976f(com.google.bi.r):java.lang.String");
    }

    /* renamed from: g */
    private static void m74977g(C42405ab abVar, MessageLite messageLite, Double d) {
        C42306ce o = abVar.mo45413o(messageLite);
        o.f110941c = C58833ax.m90833j(d);
        C42305cd i = o.mo45285i();
        i.f110936c.add(C42331dc.DEVICE);
        i.f110936c.add(C42331dc.PAPI_TOPN);
        abVar.mo45406h(messageLite, o);
    }
}
