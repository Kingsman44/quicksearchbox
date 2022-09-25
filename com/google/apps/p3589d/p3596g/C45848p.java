package com.google.apps.p3589d.p3596g;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45721l;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45740ah;
import com.google.apps.p3589d.p3593d.C45747f;
import com.google.apps.p3589d.p3593d.C45748g;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45761t;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3594e.C45769aa;
import com.google.apps.p3589d.p3594e.C45796z;
import com.google.apps.p3589d.p3595f.C45821x;
import com.google.apps.p3589d.p3600k.C45945j;
import com.google.apps.p3589d.p3600k.C45947l;

/* renamed from: com.google.apps.d.g.p */
/* compiled from: PG */
public final class C45848p {

    /* renamed from: b */
    private static final C45721l f120533b;

    /* renamed from: c */
    private static final C45721l f120534c;

    /* renamed from: a */
    public final C45769aa f120535a;

    /* renamed from: d */
    private final C45840h f120536d;

    /* renamed from: e */
    private final C45847o f120537e;

    /* renamed from: f */
    private boolean f120538f = false;

    /* renamed from: g */
    private C45748g f120539g = null;

    /* renamed from: h */
    private C45846n f120540h;

    /* renamed from: i */
    private C45821x f120541i = C45821x.DEFAULT;

    /* renamed from: j */
    private boolean f120542j = false;

    /* renamed from: k */
    private final C45719j f120543k;

    /* renamed from: l */
    private boolean f120544l = false;

    /* renamed from: m */
    private boolean f120545m = false;

    static {
        C45724o d = C45724o.m81498d();
        d.f120221a.put("\\over", C45748g.f120273E);
        d.f120221a.put("\\atop", C45748g.f120273E);
        d.f120221a.put("\\choose", C45748g.f120278J);
        d.f120221a.put("\\brack", C45748g.f120276H);
        d.f120221a.put("\\brace", C45748g.f120277I);
        f120533b = d.mo49834c();
        C45724o d2 = C45724o.m81498d();
        d2.f120221a.put("matrix", C45748g.f120273E);
        d2.f120221a.put("pmatrix", C45748g.f120278J);
        d2.f120221a.put("bmatrix", C45748g.f120276H);
        d2.f120221a.put("Bmatrix", C45748g.f120277I);
        d2.f120221a.put("vmatrix", C45748g.f120274F);
        d2.f120221a.put("Vmatrix", C45748g.f120275G);
        f120534c = d2.mo49834c();
    }

    public C45848p(String str, C45847o oVar, C45719j jVar) {
        boolean z = false;
        this.f120536d = new C45840h(String.valueOf(str).concat(" "));
        this.f120537e = oVar;
        this.f120543k = jVar;
        C45769aa aaVar = new C45769aa(jVar != null ? true : z);
        this.f120535a = aaVar;
        this.f120540h = new C45846n((String) null, aaVar);
    }

    /* renamed from: a */
    public static C45749h m81812a(String str, C45847o oVar) {
        return C45749h.m81558a(new C45848p(str, oVar, (C45719j) null).mo49993b());
    }

    /* renamed from: d */
    private static C45719j m81813d(C45723n nVar, C45769aa aaVar) {
        C45712c cVar = new C45712c(nVar);
        int i = 0;
        while (cVar.hasNext()) {
            i = Math.max(i, ((C45723n) cVar.next()).f120220a.size());
        }
        C45712c cVar2 = new C45712c(nVar);
        while (cVar2.hasNext()) {
            C45723n nVar2 = (C45723n) cVar2.next();
            for (int size = i - nVar2.f120220a.size(); size > 0; size--) {
                nVar2.f120220a.add(aaVar.mo49903c());
            }
        }
        return nVar.mo49812a(C45842j.f120524a);
    }

    /* renamed from: e */
    private final C45748g m81814e(String str) {
        C45840h hVar = this.f120536d;
        hVar.mo49989d();
        if (hVar.mo49991f()) {
            int a = hVar.mo49986a();
            if (!C45840h.m81796g(a)) {
                String b = a == 92 ? hVar.mo49987b() : C45947l.m82055a(a);
                C45748g gVar = (C45748g) C45833ai.f120503d.f120221a.get(b);
                if (gVar != null) {
                    return gVar;
                }
                throw new C45841i("Invalid delimiter: ".concat(String.valueOf(b)));
            }
            throw new AssertionError("Expected non-space character but got '" + a + "'");
        }
        throw new C45841i("Missing delimiter for ".concat(String.valueOf(str)));
    }

    /* renamed from: f */
    private final C45755n m81815f(C45755n nVar) {
        C45840h hVar;
        int i;
        if (!nVar.mo49893m()) {
            return nVar;
        }
        C45796z c = this.f120535a.mo49903c();
        C45796z c2 = this.f120535a.mo49903c();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            hVar = this.f120536d;
            i = hVar.f120522a;
            hVar.mo49989d();
            if (!this.f120536d.mo49991f()) {
                break;
            }
            int a = this.f120536d.mo49986a();
            if (a == 94) {
                c.mo49920c(mo49994c());
            } else if (a == 95) {
                c2.mo49920c(mo49994c());
                z2 = true;
            } else if (a == 39) {
                C45755n c3 = C45833ai.m81764c("\\prime");
                C45945j.m82042d(c3);
                c.f120420a.f120220a.add(c3);
            } else if (a != 92 || !m81819j(this.f120536d.mo49987b(), nVar)) {
                hVar.f120522a = i;
            }
            z = true;
        }
        hVar.f120522a = i;
        if (!z) {
            if (!z2) {
                return nVar;
            }
            z2 = true;
        }
        C45763v vVar = null;
        C45763v a2 = z ? c.mo49918a() : null;
        if (z2) {
            vVar = c2.mo49918a();
        }
        return nVar.mo49886b(a2, vVar);
    }

    /* renamed from: g */
    private final C45755n m81816g(String str) {
        char c;
        C45755n nVar;
        C45740ah ahVar;
        C45846n nVar2 = this.f120540h;
        C45846n nVar3 = new C45846n(str, this.f120535a);
        this.f120540h = nVar3;
        while (true) {
            c = 65535;
            if (!nVar3.f120529c && this.f120536d.mo49991f()) {
                C45796z h = m81817h(false, 0);
                if (!nVar3.f120529c) {
                    C45723n nVar4 = nVar3.f120532f;
                    ((C45723n) nVar4.mo49815d(nVar4.f120220a.size() - 1)).f120220a.add(h);
                    if (nVar3.f120531e) {
                        if (!nVar3.f120529c) {
                            C45723n nVar5 = nVar3.f120532f;
                            nVar5.f120220a.add(new C45723n(0));
                            nVar3.f120531e = false;
                        } else {
                            throw new AssertionError("Cannot add rows after environment ended.");
                        }
                    }
                    nVar3.f120529c = nVar3.f120530d;
                } else {
                    throw new AssertionError("Cannot add cells after environment ended.");
                }
            }
        }
        if (nVar3.f120529c || nVar3.f120528b == null) {
            String str2 = nVar3.f120528b;
            C45723n nVar6 = nVar3.f120532f;
            C45769aa aaVar = nVar3.f120527a;
            if (str2 == null) {
                nVar = C45737ae.m81535o(C45740ah.LINES, (String) null, m81813d(nVar6, aaVar));
            } else {
                C45747f fVar = (C45747f) f120534c.f120221a.get(str2);
                if (fVar != null) {
                    nVar = C45737ae.m81535o(C45740ah.MATRIX, "matrix", m81813d(nVar6, aaVar));
                    if (fVar != C45748g.f120273E) {
                        nVar = new C45761t(C45763v.m81598f(nVar), fVar);
                    }
                } else {
                    switch (str2.hashCode()) {
                        case -1565468710:
                            if (str2.equals("gathered")) {
                                c = 6;
                                break;
                            }
                            break;
                        case -1523411495:
                            if (str2.equals("eqalign")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1253024261:
                            if (str2.equals("gather")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -914360732:
                            if (str2.equals("aligned")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 92903173:
                            if (str2.equals("align")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 94432067:
                            if (str2.equals("cases")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 109648666:
                            if (str2.equals("split")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 381182551:
                            if (str2.equals("eqnarray")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 1626955645:
                            if (str2.equals("displaylines")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            ahVar = C45740ah.ALIGN;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            ahVar = C45740ah.GATHER;
                            break;
                        case 7:
                            ahVar = C45740ah.EQN_ARRAY;
                            break;
                        case 8:
                            ahVar = C45740ah.CASES;
                            break;
                        default:
                            throw new C45841i("Unknown environment: ".concat(str2));
                    }
                    nVar = C45737ae.m81535o(ahVar, str2, m81813d(nVar6, aaVar));
                }
            }
            this.f120540h = nVar2;
            return nVar;
        }
        throw new C45841i("Missing \\end.");
    }

    /* renamed from: i */
    private final void m81818i(C45796z zVar, C45796z zVar2) {
        zVar.mo49919b(zVar2);
        C45723n nVar = zVar.f120420a;
        C45723n nVar2 = zVar2.f120420a;
        nVar.mo49833l(nVar2, 0, nVar2.f120220a.size() - 1);
        C45755n nVar3 = (C45755n) zVar2.f120420a.mo49816e(zVar2.f120420a.f120220a.size() - 1);
        if (nVar3 != null) {
            zVar.f120420a.f120220a.add(m81815f(nVar3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m81819j(java.lang.String r5, com.google.apps.p3589d.p3593d.C45755n r6) {
        /*
            int r0 = r5.hashCode()
            r1 = -1720514187(0xffffffff99730975, float:-1.2564715E-23)
            r2 = 0
            java.lang.String r3 = "\\limits"
            r4 = 1
            if (r0 == r1) goto L_0x001b
            r1 = -1056737420(0xffffffffc1037774, float:-8.216663)
            if (r0 == r1) goto L_0x0013
            goto L_0x0025
        L_0x0013:
            boolean r0 = r5.equals(r3)
            if (r0 == 0) goto L_0x0025
            r0 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "\\nolimits"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0025
            r0 = 1
            goto L_0x0026
        L_0x0025:
            r0 = -1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            if (r0 == r4) goto L_0x002b
            return r2
        L_0x002b:
            boolean r0 = r6 instanceof com.google.apps.p3589d.p3593d.C45762u
            if (r0 == 0) goto L_0x003a
            com.google.apps.d.d.u r6 = (com.google.apps.p3589d.p3593d.C45762u) r6
            boolean r5 = r3.equals(r5)
            r6.f120339b = r5
            r6.f120340i = r4
            return r4
        L_0x003a:
            com.google.apps.d.g.i r6 = new com.google.apps.d.g.i
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " can only be applied to an operator."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3596g.C45848p.m81819j(java.lang.String, com.google.apps.d.d.n):boolean");
    }

    /* renamed from: b */
    public final C45737ae mo49993b() {
        C45755n g = m81816g((String) null);
        if (this.f120536d.mo49991f()) {
            throw new C45841i("Mismatched braces");
        } else if (g instanceof C45737ae) {
            return (C45737ae) g;
        } else {
            throw new AssertionError("Parsed atom should have been a MathTable.");
        }
    }

    /* renamed from: c */
    public final C45796z mo49994c() {
        return m81817h(true, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.apps.d.d.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.google.apps.d.d.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.apps.d.d.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v62, resolved type: com.google.apps.d.d.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v65, resolved type: com.google.apps.d.d.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: com.google.apps.d.d.n} */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: type inference failed for: r4v47, types: [com.google.apps.d.d.s] */
    /* JADX WARNING: type inference failed for: r11v14, types: [com.google.apps.d.d.s] */
    /* JADX WARNING: type inference failed for: r4v48, types: [com.google.apps.d.d.s] */
    /* JADX WARNING: type inference failed for: r11v15, types: [com.google.apps.d.d.s] */
    /* JADX WARNING: type inference failed for: r4v49, types: [com.google.apps.d.d.s] */
    /* JADX WARNING: type inference failed for: r11v16, types: [com.google.apps.d.d.s] */
    /* JADX WARNING: type inference failed for: r3v71 */
    /* JADX WARNING: type inference failed for: r3v72 */
    /* JADX WARNING: type inference failed for: r3v73 */
    /* JADX WARNING: type inference failed for: r3v74 */
    /* JADX WARNING: type inference failed for: r3v75 */
    /* JADX WARNING: type inference failed for: r3v76 */
    /* JADX WARNING: type inference failed for: r3v77 */
    /* JADX WARNING: type inference failed for: r3v78 */
    /* JADX WARNING: type inference failed for: r3v79 */
    /* JADX WARNING: type inference failed for: r3v80 */
    /* JADX WARNING: type inference failed for: r3v81 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b6, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024f, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x027c, code lost:
        if (r5 == null) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x027e, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0283, code lost:
        if (r3.equals("\\right") != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0285, code lost:
        r5 = (com.google.apps.p3589d.p3595f.C45821x) com.google.apps.p3589d.p3596g.C45833ai.f120500a.f120221a.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x028f, code lost:
        if (r5 == null) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0291, code lost:
        r4 = r0.f120542j;
        r0.f120542j = r3.startsWith("\\text");
        r0.f120536d.mo49989d();
        r3 = r0.f120541i;
        r0.f120541i = r5;
        r5 = mo49994c();
        r0.f120541i = r3;
        r0.f120542j = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ac, code lost:
        if (r26 == false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ae, code lost:
        r2.mo49920c(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02b1, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02b2, code lost:
        m81818i(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02b7, code lost:
        r5 = com.google.apps.p3589d.p3596g.C45833ai.m81764c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02bb, code lost:
        if (r5 != null) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02bd, code lost:
        r5 = com.google.apps.p3589d.p3596g.C45833ai.m81766e(r3, new com.google.apps.p3589d.p3596g.C45844l(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c6, code lost:
        if (r5 != null) goto L_0x06d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02ce, code lost:
        switch(r3.hashCode()) {
            case -1933392518: goto L_0x0441;
            case -1926337040: goto L_0x0436;
            case -1596902679: goto L_0x042b;
            case -1596902678: goto L_0x0420;
            case -1596902673: goto L_0x0415;
            case -1567469107: goto L_0x040a;
            case -1567350007: goto L_0x03ff;
            case -1567350006: goto L_0x03f4;
            case -1567350001: goto L_0x03e9;
            case -1567343031: goto L_0x03de;
            case -1566505483: goto L_0x03d3;
            case -1566242681: goto L_0x03c7;
            case -1565581962: goto L_0x03bc;
            case -1550805626: goto L_0x03b1;
            case -1321764394: goto L_0x03a5;
            case -1292349795: goto L_0x039a;
            case -834283379: goto L_0x038f;
            case -816704234: goto L_0x0383;
            case 2807556: goto L_0x0379;
            case 2838308: goto L_0x036d;
            case 87034339: goto L_0x0361;
            case 87034344: goto L_0x0355;
            case 87034345: goto L_0x0349;
            case 87034350: goto L_0x033d;
            case 87987651: goto L_0x0331;
            case 87987656: goto L_0x0325;
            case 87987657: goto L_0x0319;
            case 87987662: goto L_0x030d;
            case 88115274: goto L_0x0302;
            case 88281699: goto L_0x02f6;
            case 88502140: goto L_0x02eb;
            case 1133051264: goto L_0x02df;
            case 1747732260: goto L_0x02d3;
            default: goto L_0x02d1;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02d9, code lost:
        if (r3.equals("\\overline") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02db, code lost:
        r5 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02e5, code lost:
        if (r3.equals("\\bcancel") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02e7, code lost:
        r5 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02f1, code lost:
        if (r3.equals("\\sqrt") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x02f3, code lost:
        r5 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x02fc, code lost:
        if (r3.equals("\\left") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02fe, code lost:
        r5 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0308, code lost:
        if (r3.equals("\\frac") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x030a, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0313, code lost:
        if (r3.equals("\\bigr") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0315, code lost:
        r5 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x031f, code lost:
        if (r3.equals("\\bigm") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0321, code lost:
        r5 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x032b, code lost:
        if (r3.equals("\\bigl") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x032d, code lost:
        r5 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0337, code lost:
        if (r3.equals("\\bigg") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0339, code lost:
        r5 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0343, code lost:
        if (r3.equals("\\Bigr") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0345, code lost:
        r5 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x034f, code lost:
        if (r3.equals("\\Bigm") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0351, code lost:
        r5 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x035b, code lost:
        if (r3.equals("\\Bigl") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x035d, code lost:
        r5 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0367, code lost:
        if (r3.equals("\\Bigg") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0369, code lost:
        r5 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0373, code lost:
        if (r3.equals("\\big") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0375, code lost:
        r5 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x037d, code lost:
        if (r3.equals("\\Big") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x037f, code lost:
        r5 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0389, code lost:
        if (r3.equals("\\xcancel") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x038b, code lost:
        r5 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0395, code lost:
        if (r3.equals("\\tbinom") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0397, code lost:
        r5 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03a0, code lost:
        if (r3.equals("\\dbinom") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03a2, code lost:
        r5 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03ab, code lost:
        if (r3.equals("\\cancel") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03ad, code lost:
        r5 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x03b7, code lost:
        if (r3.equals("\\tfrac") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x03b9, code lost:
        r5 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03c2, code lost:
        if (r3.equals("\\dfrac") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03c4, code lost:
        r5 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x03cd, code lost:
        if (r3.equals("\\color") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03cf, code lost:
        r5 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03d9, code lost:
        if (r3.equals("\\cfrac") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03db, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x03e4, code lost:
        if (r3.equals("\\binom") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x03e6, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x03ef, code lost:
        if (r3.equals("\\biggr") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x03f1, code lost:
        r5 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x03fa, code lost:
        if (r3.equals("\\biggm") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03fc, code lost:
        r5 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0405, code lost:
        if (r3.equals("\\biggl") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0407, code lost:
        r5 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0410, code lost:
        if (r3.equals("\\begin") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0412, code lost:
        r5 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x041b, code lost:
        if (r3.equals("\\Biggr") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x041d, code lost:
        r5 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0426, code lost:
        if (r3.equals("\\Biggm") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0428, code lost:
        r5 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0431, code lost:
        if (r3.equals("\\Biggl") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0433, code lost:
        r5 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x043c, code lost:
        if (r3.equals("\\underline") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x043e, code lost:
        r5 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0447, code lost:
        if (r3.equals("\\textcolor") == false) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0449, code lost:
        r5 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x044c, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x044d, code lost:
        switch(r5) {
            case 0: goto L_0x06b6;
            case 1: goto L_0x0699;
            case 2: goto L_0x067d;
            case 3: goto L_0x0660;
            case 4: goto L_0x0643;
            case 5: goto L_0x0625;
            case 6: goto L_0x0608;
            case 7: goto L_0x05ce;
            case 8: goto L_0x0573;
            case 9: goto L_0x0573;
            case 10: goto L_0x0573;
            case 11: goto L_0x0573;
            case 12: goto L_0x0573;
            case 13: goto L_0x0573;
            case 14: goto L_0x0573;
            case 15: goto L_0x0573;
            case 16: goto L_0x0573;
            case 17: goto L_0x0573;
            case 18: goto L_0x0573;
            case 19: goto L_0x0573;
            case 20: goto L_0x0573;
            case 21: goto L_0x0573;
            case 22: goto L_0x0573;
            case 23: goto L_0x0573;
            case 24: goto L_0x0525;
            case 25: goto L_0x0511;
            case 26: goto L_0x04ff;
            case 27: goto L_0x04f0;
            case 28: goto L_0x04e1;
            case 29: goto L_0x04d2;
            case 30: goto L_0x04c6;
            case 31: goto L_0x0460;
            case 32: goto L_0x0460;
            default: goto L_0x0450;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x045f, code lost:
        throw new com.google.apps.p3589d.p3596g.C45841i("Invalid command ".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0460, code lost:
        r5 = r0.f120536d;
        r5.mo49992h('{');
        r5.mo49992h('#');
        r6 = new java.lang.StringBuilder("#");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0477, code lost:
        if (r5.mo49991f() == false) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0479, code lost:
        r7 = r5.mo49986a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x047f, code lost:
        if (r7 < 65) goto L_0x0485;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0483, code lost:
        if (r7 <= 70) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0487, code lost:
        if (r7 < 97) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x048b, code lost:
        if (r7 <= 102) goto L_0x0495;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x048f, code lost:
        if (r7 < 48) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0493, code lost:
        if (r7 > 57) goto L_0x0499;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0495, code lost:
        r6.appendCodePoint(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0499, code lost:
        r5.mo49990e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x049c, code lost:
        r7 = com.google.apps.p3589d.p3600k.C45941f.m82030g(r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04a4, code lost:
        if (r7 == null) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x04a6, code lost:
        r5.mo49992h('}');
        r3 = new com.google.apps.p3589d.p3593d.C45759r(r7, mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x04c5, code lost:
        throw new com.google.apps.p3589d.p3596g.C45841i("Could not parse color ".concat(r6.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04c6, code lost:
        r3 = m81816g(r0.f120536d.mo49988c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04d2, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45758q(3, mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x04e1, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45758q(2, mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x04f0, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45758q(1, mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04ff, code lost:
        r4 = new com.google.apps.p3589d.p3593d.C45739ag(15, "̲", mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0511, code lost:
        r4 = new com.google.apps.p3589d.p3593d.C45739ag(16, "̄", mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0522, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0525, code lost:
        r3 = r0.f120538f;
        r4 = r0.f120539g;
        r0.f120538f = true;
        r5 = m81814e("\\left");
        r6 = m81817h(false, 0);
        r7 = r0.f120539g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0537, code lost:
        if (r7 == null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0539, code lost:
        r11 = new com.google.apps.p3589d.p3593d.C45761t(r6.mo49918a(), com.google.apps.p3589d.p3593d.C45748g.m81553a(r5, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x054d, code lost:
        if (((com.google.apps.p3589d.p3596g.C45834b) r0.f120537e).f120515a == false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x054f, code lost:
        r5 = com.google.apps.p3589d.p3596g.C45833ai.m81767f(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0557, code lost:
        if (r5.mo49891k() != false) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0559, code lost:
        r2.f120420a.f120220a.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0560, code lost:
        r2.mo49920c(r6);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0564, code lost:
        r0.f120538f = r3;
        r0.f120539g = r4;
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0572, code lost:
        throw new com.google.apps.p3589d.p3596g.C45841i("Missing \\right");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0573, code lost:
        r4 = m81814e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x057d, code lost:
        if (r3.startsWith("\\Bigg") == false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x057f, code lost:
        r5 = com.google.apps.p3589d.p3593d.C45756o.f120323d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0588, code lost:
        if (r3.startsWith("\\bigg") == false) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x058a, code lost:
        r5 = com.google.apps.p3589d.p3593d.C45756o.f120322c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0591, code lost:
        if (r3.startsWith("\\Big") == false) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0593, code lost:
        r5 = com.google.apps.p3589d.p3593d.C45756o.f120321b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0596, code lost:
        r5 = com.google.apps.p3589d.p3593d.C45756o.f120320a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x059e, code lost:
        if (r3.endsWith("m") == false) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05a0, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45757p(7, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05ad, code lost:
        if (r3.endsWith(com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r.f88929b) == false) goto L_0x05b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05af, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45757p(9, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05bc, code lost:
        if (r3.endsWith("l") == false) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05be, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45757p(8, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x05c7, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45757p(2, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05d4, code lost:
        if (r0.f120536d.mo49991f() == false) goto L_0x0600;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05d6, code lost:
        r3 = r0.f120536d.mo49986a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05de, code lost:
        if (r3 != 91) goto L_0x05eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x05e0, code lost:
        r11 = m81817h(false, ']').mo49918a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x05eb, code lost:
        r0.f120536d.mo49990e(r3);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05f1, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45765x(r11, mo49994c().mo49918a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0607, code lost:
        throw new com.google.apps.p3589d.p3596g.C45841i("\\sqrt missing arguments.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0608, code lost:
        r3 = new com.google.apps.p3589d.p3593d.C45760s(false, false, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120278J, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0625, code lost:
        r11 = new com.google.apps.p3589d.p3593d.C45760s(false, false, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120278J, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0643, code lost:
        r4 = new com.google.apps.p3589d.p3593d.C45760s(false, false, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120278J, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0660, code lost:
        r11 = new com.google.apps.p3589d.p3593d.C45760s(true, false, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120273E, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x067d, code lost:
        r4 = new com.google.apps.p3589d.p3593d.C45760s(true, false, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120273E, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0699, code lost:
        r11 = new com.google.apps.p3589d.p3593d.C45760s(true, true, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120273E, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06b6, code lost:
        r4 = new com.google.apps.p3589d.p3593d.C45760s(true, false, mo49994c().mo49918a(), mo49994c().mo49918a(), com.google.apps.p3589d.p3593d.C45748g.f120273E, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06d2, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x06d3, code lost:
        if (r3 != 0) goto L_0x06e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0017, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0017, code lost:
        continue;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x0705 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.apps.p3589d.p3594e.C45796z m81817h(boolean r26, char r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            if (r26 == 0) goto L_0x0011
            if (r1 > 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Cannot set both oneArgOnly and stopChar."
            r1.<init>(r2)
            throw r1
        L_0x0011:
            com.google.apps.d.e.aa r2 = r0.f120535a
            com.google.apps.d.e.z r2 = r2.mo49903c()
        L_0x0017:
            com.google.apps.d.g.h r3 = r0.f120536d
            boolean r3 = r3.mo49991f()
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == 0) goto L_0x071e
            com.google.apps.d.g.h r3 = r0.f120536d
            int r3 = r3.mo49986a()
            r5 = 95
            r6 = 94
            r7 = 38
            if (r26 == 0) goto L_0x0052
            if (r3 == r6) goto L_0x003a
            if (r3 == r4) goto L_0x003a
            if (r3 == r5) goto L_0x003a
            if (r3 == r7) goto L_0x0038
            goto L_0x0052
        L_0x0038:
            r3 = 38
        L_0x003a:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            char[] r2 = java.lang.Character.toChars(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Expected argument, instead found "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
        L_0x0052:
            if (r1 <= 0) goto L_0x0058
            if (r3 == r1) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            return r2
        L_0x0058:
            java.lang.String r8 = "This should have been handled before."
            if (r3 == r7) goto L_0x0715
            r7 = 39
            if (r3 == r7) goto L_0x06d7
            r7 = 92
            r9 = 123(0x7b, float:1.72E-43)
            r10 = 32
            r11 = 0
            r12 = 0
            if (r3 == r7) goto L_0x00d6
            if (r3 == r9) goto L_0x00c7
            if (r3 == r4) goto L_0x00b4
            if (r3 == r6) goto L_0x06d7
            if (r3 == r5) goto L_0x06d7
            boolean r4 = r0.f120542j
            if (r4 == 0) goto L_0x0080
            if (r3 != r10) goto L_0x0080
            java.lang.String r3 = "\\ "
            com.google.apps.d.d.n r3 = com.google.apps.p3589d.p3596g.C45833ai.m81764c(r3)
            goto L_0x06e2
        L_0x0080:
            java.lang.String r4 = com.google.apps.p3589d.p3600k.C45947l.m82055a(r3)
            com.google.apps.d.d.n r4 = com.google.apps.p3589d.p3596g.C45833ai.m81764c(r4)
            if (r4 != 0) goto L_0x0092
            if (r3 != r10) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            com.google.apps.d.d.n r11 = com.google.apps.p3589d.p3596g.C45833ai.m81765d(r3)
            goto L_0x0093
        L_0x0092:
            r11 = r4
        L_0x0093:
            if (r11 == 0) goto L_0x0017
            com.google.apps.d.g.h r3 = r0.f120536d
            boolean r3 = r3.mo49991f()
            if (r3 == 0) goto L_0x00b1
            com.google.apps.d.g.h r3 = r0.f120536d
            int r3 = r3.mo49986a()
            com.google.apps.d.d.n r4 = com.google.apps.p3589d.p3596g.C45833ai.m81763b(r3, r11)
            if (r11 != r4) goto L_0x00ae
            com.google.apps.d.g.h r5 = r0.f120536d
            r5.mo49990e(r3)
        L_0x00ae:
            r3 = r4
            goto L_0x06e2
        L_0x00b1:
            r3 = r11
            goto L_0x06e2
        L_0x00b4:
            if (r26 != 0) goto L_0x00c1
            if (r1 != r4) goto L_0x00b9
            goto L_0x00c1
        L_0x00b9:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Mismatched braces."
            r1.<init>(r2)
            throw r1
        L_0x00c1:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r8)
            throw r1
        L_0x00c7:
            com.google.apps.d.e.z r3 = r0.m81817h(r12, r4)
            if (r26 == 0) goto L_0x00d1
            r2.mo49920c(r3)
            return r2
        L_0x00d1:
            r0.m81818i(r2, r3)
            goto L_0x0017
        L_0x00d6:
            com.google.apps.d.g.h r3 = r0.f120536d
            java.lang.String r3 = r3.mo49987b()
            java.lang.String r5 = "\\cursor"
            boolean r5 = r3.equals(r5)
            r6 = 1
            if (r5 != 0) goto L_0x00f0
            java.lang.String r7 = "\\cursorIfSelection"
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            r7 = 0
            goto L_0x00f1
        L_0x00f0:
            r7 = 1
        L_0x00f1:
            com.google.apps.d.b.j r8 = r0.f120543k
            if (r8 == 0) goto L_0x013b
            if (r7 != 0) goto L_0x011e
            java.lang.String r5 = "\\selection"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x013b
            boolean r3 = r0.f120544l
            if (r3 != 0) goto L_0x0116
            com.google.apps.d.b.j r3 = r0.f120543k
            com.google.apps.d.b.n r4 = r2.f120420a
            r4.mo49832k(r3)
            r0.f120544l = r6
            boolean r3 = r0.f120545m
            if (r3 != 0) goto L_0x0113
            r2.mo49921d()
        L_0x0113:
            if (r26 == 0) goto L_0x0017
            return r2
        L_0x0116:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "\\selection must not appear more than once"
            r1.<init>(r2)
            throw r1
        L_0x011e:
            boolean r3 = r0.f120545m
            if (r3 != 0) goto L_0x0133
            r0.f120545m = r6
            if (r5 != 0) goto L_0x012e
            java.util.ArrayList r3 = r8.f120220a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0017
        L_0x012e:
            r2.mo49921d()
            goto L_0x0017
        L_0x0133:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "\\cursor and \\cursorIfSelection must not appear more than once and cannot appear together"
            r1.<init>(r2)
            throw r1
        L_0x013b:
            m81819j(r3, r11)
            int r5 = r3.hashCode()
            java.lang.String r14 = "\\over"
            r7 = 9
            r8 = 7
            r11 = 3
            java.lang.String r13 = "\\right"
            r15 = 2
            switch(r5) {
                case -1567087785: goto L_0x01a8;
                case -1567087779: goto L_0x019e;
                case -1552573632: goto L_0x0196;
                case -1315257997: goto L_0x018c;
                case -1024284232: goto L_0x0181;
                case 2944: goto L_0x0177;
                case 91595: goto L_0x016d;
                case 2841343: goto L_0x0162;
                case 87968688: goto L_0x0158;
                case 88387376: goto L_0x0150;
                default: goto L_0x014e;
            }
        L_0x014e:
            goto L_0x01b2
        L_0x0150:
            boolean r5 = r3.equals(r14)
            if (r5 == 0) goto L_0x01b2
            r5 = 1
            goto L_0x01b3
        L_0x0158:
            java.lang.String r5 = "\\atop"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 2
            goto L_0x01b3
        L_0x0162:
            java.lang.String r5 = "\\end"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 9
            goto L_0x01b3
        L_0x016d:
            java.lang.String r5 = "\\cr"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 7
            goto L_0x01b3
        L_0x0177:
            java.lang.String r5 = "\\\\"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 6
            goto L_0x01b3
        L_0x0181:
            java.lang.String r5 = "\\newline"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 8
            goto L_0x01b3
        L_0x018c:
            java.lang.String r5 = "\\choose"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 3
            goto L_0x01b3
        L_0x0196:
            boolean r5 = r3.equals(r13)
            if (r5 == 0) goto L_0x01b2
            r5 = 0
            goto L_0x01b3
        L_0x019e:
            java.lang.String r5 = "\\brack"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 4
            goto L_0x01b3
        L_0x01a8:
            java.lang.String r5 = "\\brace"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x01b2
            r5 = 5
            goto L_0x01b3
        L_0x01b2:
            r5 = -1
        L_0x01b3:
            switch(r5) {
                case 0: goto L_0x0241;
                case 1: goto L_0x020e;
                case 2: goto L_0x020e;
                case 3: goto L_0x020e;
                case 4: goto L_0x020e;
                case 5: goto L_0x020e;
                case 6: goto L_0x01fd;
                case 7: goto L_0x01fd;
                case 8: goto L_0x01fd;
                case 9: goto L_0x01b9;
                default: goto L_0x01b6;
            }
        L_0x01b6:
            r5 = 0
            goto L_0x027c
        L_0x01b9:
            com.google.apps.d.g.n r5 = r0.f120540h
            java.lang.String r5 = r5.f120528b
            if (r5 == 0) goto L_0x01f5
            com.google.apps.d.g.h r5 = r0.f120536d
            java.lang.String r5 = r5.mo49988c()
            com.google.apps.d.g.n r14 = r0.f120540h
            java.lang.String r14 = r14.f120528b
            boolean r14 = r5.equals(r14)
            if (r14 == 0) goto L_0x01d5
            com.google.apps.d.g.n r5 = r0.f120540h
            r5.f120530d = r6
            goto L_0x024f
        L_0x01d5:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            com.google.apps.d.g.n r2 = r0.f120540h
            java.lang.String r2 = r2.f120528b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Begin environment name "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " does not match end name "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x01f5:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Missing \\begin"
            r1.<init>(r2)
            throw r1
        L_0x01fd:
            com.google.apps.d.g.n r5 = r0.f120540h
            boolean r14 = r5.f120531e
            if (r14 != 0) goto L_0x0206
            r5.f120531e = r6
            goto L_0x024f
        L_0x0206:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Shouldn't have a new row end before the previous was handled."
            r1.<init>(r2)
            throw r1
        L_0x020e:
            boolean r19 = r14.equals(r3)
            com.google.apps.d.d.v r21 = r2.mo49918a()
            com.google.apps.d.e.z r5 = r0.m81817h(r12, r1)
            com.google.apps.d.d.v r22 = r5.mo49918a()
            com.google.apps.d.b.l r5 = f120533b
            java.lang.Object r5 = r5.mo49822a(r3)
            r23 = r5
            com.google.apps.d.d.f r23 = (com.google.apps.p3589d.p3593d.C45747f) r23
            com.google.apps.d.e.aa r5 = r0.f120535a
            com.google.apps.d.e.z r5 = r5.mo49903c()
            com.google.apps.d.d.s r14 = new com.google.apps.d.d.s
            r20 = 0
            r24 = 0
            r18 = r14
            r18.<init>(r19, r20, r21, r22, r23, r24)
            com.google.apps.d.b.n r10 = r5.f120420a
            java.util.ArrayList r10 = r10.f120220a
            r10.add(r14)
            goto L_0x027c
        L_0x0241:
            com.google.apps.d.d.g r5 = r0.f120539g
            if (r5 != 0) goto L_0x0274
            com.google.apps.d.d.g r5 = r0.m81814e(r13)
            r0.f120539g = r5
            boolean r10 = r0.f120538f
            if (r10 == 0) goto L_0x0251
        L_0x024f:
            r5 = r2
            goto L_0x027c
        L_0x0251:
            com.google.apps.d.g.o r10 = r0.f120537e
            com.google.apps.d.g.b r10 = (com.google.apps.p3589d.p3596g.C45834b) r10
            boolean r10 = r10.f120515a
            if (r10 == 0) goto L_0x026c
            com.google.apps.d.d.n r5 = com.google.apps.p3589d.p3596g.C45833ai.m81767f(r5)
            boolean r10 = r5.mo49891k()
            if (r10 != 0) goto L_0x01b6
            com.google.apps.d.b.n r10 = r2.f120420a
            java.util.ArrayList r10 = r10.f120220a
            r10.add(r5)
            goto L_0x01b6
        L_0x026c:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Missing \\left"
            r1.<init>(r2)
            throw r1
        L_0x0274:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "\\right should have already been processed by now."
            r1.<init>(r2)
            throw r1
        L_0x027c:
            if (r5 == 0) goto L_0x027f
            return r5
        L_0x027f:
            boolean r5 = r3.equals(r13)
            if (r5 != 0) goto L_0x0017
            com.google.apps.d.b.l r5 = com.google.apps.p3589d.p3596g.C45833ai.f120500a
            java.util.HashMap r5 = r5.f120221a
            java.lang.Object r5 = r5.get(r3)
            com.google.apps.d.f.x r5 = (com.google.apps.p3589d.p3595f.C45821x) r5
            if (r5 == 0) goto L_0x02b7
            boolean r4 = r0.f120542j
            java.lang.String r6 = "\\text"
            boolean r3 = r3.startsWith(r6)
            r0.f120542j = r3
            com.google.apps.d.g.h r3 = r0.f120536d
            r3.mo49989d()
            com.google.apps.d.f.x r3 = r0.f120541i
            r0.f120541i = r5
            com.google.apps.d.e.z r5 = r25.mo49994c()
            r0.f120541i = r3
            r0.f120542j = r4
            if (r26 == 0) goto L_0x02b2
            r2.mo49920c(r5)
            return r2
        L_0x02b2:
            r0.m81818i(r2, r5)
            goto L_0x0017
        L_0x02b7:
            com.google.apps.d.d.n r5 = com.google.apps.p3589d.p3596g.C45833ai.m81764c(r3)
            if (r5 != 0) goto L_0x06d2
            com.google.apps.d.g.l r5 = new com.google.apps.d.g.l
            r5.<init>(r0)
            com.google.apps.d.d.n r5 = com.google.apps.p3589d.p3596g.C45833ai.m81766e(r3, r5)
            if (r5 != 0) goto L_0x06d2
            int r5 = r3.hashCode()
            java.lang.String r10 = "\\Big"
            switch(r5) {
                case -1933392518: goto L_0x0441;
                case -1926337040: goto L_0x0436;
                case -1596902679: goto L_0x042b;
                case -1596902678: goto L_0x0420;
                case -1596902673: goto L_0x0415;
                case -1567469107: goto L_0x040a;
                case -1567350007: goto L_0x03ff;
                case -1567350006: goto L_0x03f4;
                case -1567350001: goto L_0x03e9;
                case -1567343031: goto L_0x03de;
                case -1566505483: goto L_0x03d3;
                case -1566242681: goto L_0x03c7;
                case -1565581962: goto L_0x03bc;
                case -1550805626: goto L_0x03b1;
                case -1321764394: goto L_0x03a5;
                case -1292349795: goto L_0x039a;
                case -834283379: goto L_0x038f;
                case -816704234: goto L_0x0383;
                case 2807556: goto L_0x0379;
                case 2838308: goto L_0x036d;
                case 87034339: goto L_0x0361;
                case 87034344: goto L_0x0355;
                case 87034345: goto L_0x0349;
                case 87034350: goto L_0x033d;
                case 87987651: goto L_0x0331;
                case 87987656: goto L_0x0325;
                case 87987657: goto L_0x0319;
                case 87987662: goto L_0x030d;
                case 88115274: goto L_0x0302;
                case 88281699: goto L_0x02f6;
                case 88502140: goto L_0x02eb;
                case 1133051264: goto L_0x02df;
                case 1747732260: goto L_0x02d3;
                default: goto L_0x02d1;
            }
        L_0x02d1:
            goto L_0x044c
        L_0x02d3:
            java.lang.String r5 = "\\overline"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 25
            goto L_0x044d
        L_0x02df:
            java.lang.String r5 = "\\bcancel"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 28
            goto L_0x044d
        L_0x02eb:
            java.lang.String r5 = "\\sqrt"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 7
            goto L_0x044d
        L_0x02f6:
            java.lang.String r5 = "\\left"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 24
            goto L_0x044d
        L_0x0302:
            java.lang.String r5 = "\\frac"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 0
            goto L_0x044d
        L_0x030d:
            java.lang.String r5 = "\\bigr"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 10
            goto L_0x044d
        L_0x0319:
            java.lang.String r5 = "\\bigm"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 11
            goto L_0x044d
        L_0x0325:
            java.lang.String r5 = "\\bigl"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 9
            goto L_0x044d
        L_0x0331:
            java.lang.String r5 = "\\bigg"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 16
            goto L_0x044d
        L_0x033d:
            java.lang.String r5 = "\\Bigr"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 14
            goto L_0x044d
        L_0x0349:
            java.lang.String r5 = "\\Bigm"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 15
            goto L_0x044d
        L_0x0355:
            java.lang.String r5 = "\\Bigl"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 13
            goto L_0x044d
        L_0x0361:
            java.lang.String r5 = "\\Bigg"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 20
            goto L_0x044d
        L_0x036d:
            java.lang.String r5 = "\\big"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 8
            goto L_0x044d
        L_0x0379:
            boolean r5 = r3.equals(r10)
            if (r5 == 0) goto L_0x044c
            r5 = 12
            goto L_0x044d
        L_0x0383:
            java.lang.String r5 = "\\xcancel"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 29
            goto L_0x044d
        L_0x038f:
            java.lang.String r5 = "\\tbinom"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 6
            goto L_0x044d
        L_0x039a:
            java.lang.String r5 = "\\dbinom"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 5
            goto L_0x044d
        L_0x03a5:
            java.lang.String r5 = "\\cancel"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 27
            goto L_0x044d
        L_0x03b1:
            java.lang.String r5 = "\\tfrac"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 3
            goto L_0x044d
        L_0x03bc:
            java.lang.String r5 = "\\dfrac"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 2
            goto L_0x044d
        L_0x03c7:
            java.lang.String r5 = "\\color"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 31
            goto L_0x044d
        L_0x03d3:
            java.lang.String r5 = "\\cfrac"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 1
            goto L_0x044d
        L_0x03de:
            java.lang.String r5 = "\\binom"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 4
            goto L_0x044d
        L_0x03e9:
            java.lang.String r5 = "\\biggr"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 18
            goto L_0x044d
        L_0x03f4:
            java.lang.String r5 = "\\biggm"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 19
            goto L_0x044d
        L_0x03ff:
            java.lang.String r5 = "\\biggl"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 17
            goto L_0x044d
        L_0x040a:
            java.lang.String r5 = "\\begin"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 30
            goto L_0x044d
        L_0x0415:
            java.lang.String r5 = "\\Biggr"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 22
            goto L_0x044d
        L_0x0420:
            java.lang.String r5 = "\\Biggm"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 23
            goto L_0x044d
        L_0x042b:
            java.lang.String r5 = "\\Biggl"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 21
            goto L_0x044d
        L_0x0436:
            java.lang.String r5 = "\\underline"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 26
            goto L_0x044d
        L_0x0441:
            java.lang.String r5 = "\\textcolor"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x044c
            r5 = 32
            goto L_0x044d
        L_0x044c:
            r5 = -1
        L_0x044d:
            switch(r5) {
                case 0: goto L_0x06b6;
                case 1: goto L_0x0699;
                case 2: goto L_0x067d;
                case 3: goto L_0x0660;
                case 4: goto L_0x0643;
                case 5: goto L_0x0625;
                case 6: goto L_0x0608;
                case 7: goto L_0x05ce;
                case 8: goto L_0x0573;
                case 9: goto L_0x0573;
                case 10: goto L_0x0573;
                case 11: goto L_0x0573;
                case 12: goto L_0x0573;
                case 13: goto L_0x0573;
                case 14: goto L_0x0573;
                case 15: goto L_0x0573;
                case 16: goto L_0x0573;
                case 17: goto L_0x0573;
                case 18: goto L_0x0573;
                case 19: goto L_0x0573;
                case 20: goto L_0x0573;
                case 21: goto L_0x0573;
                case 22: goto L_0x0573;
                case 23: goto L_0x0573;
                case 24: goto L_0x0525;
                case 25: goto L_0x0511;
                case 26: goto L_0x04ff;
                case 27: goto L_0x04f0;
                case 28: goto L_0x04e1;
                case 29: goto L_0x04d2;
                case 30: goto L_0x04c6;
                case 31: goto L_0x0460;
                case 32: goto L_0x0460;
                default: goto L_0x0450;
            }
        L_0x0450:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Invalid command "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x0460:
            com.google.apps.d.d.r r3 = new com.google.apps.d.d.r
            com.google.apps.d.g.h r5 = r0.f120536d
            r5.mo49992h(r9)
            r6 = 35
            r5.mo49992h(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "#"
            r6.<init>(r7)
        L_0x0473:
            boolean r7 = r5.mo49991f()
            if (r7 == 0) goto L_0x049c
            int r7 = r5.mo49986a()
            r8 = 65
            if (r7 < r8) goto L_0x0485
            r8 = 70
            if (r7 <= r8) goto L_0x0495
        L_0x0485:
            r8 = 97
            if (r7 < r8) goto L_0x048d
            r8 = 102(0x66, float:1.43E-43)
            if (r7 <= r8) goto L_0x0495
        L_0x048d:
            r8 = 48
            if (r7 < r8) goto L_0x0499
            r8 = 57
            if (r7 > r8) goto L_0x0499
        L_0x0495:
            r6.appendCodePoint(r7)
            goto L_0x0473
        L_0x0499:
            r5.mo49990e(r7)
        L_0x049c:
            java.lang.String r7 = r6.toString()
            com.google.apps.d.k.f r7 = com.google.apps.p3589d.p3600k.C45941f.m82030g(r7)
            if (r7 == 0) goto L_0x04b6
            r5.mo49992h(r4)
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r4 = r4.mo49918a()
            r3.<init>((com.google.apps.p3589d.p3600k.C45941f) r7, (com.google.apps.p3589d.p3593d.C45763v) r4)
            goto L_0x06d3
        L_0x04b6:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Could not parse color "
            java.lang.String r3 = r6.toString()
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            throw r1
        L_0x04c6:
            com.google.apps.d.g.h r3 = r0.f120536d
            java.lang.String r3 = r3.mo49988c()
            com.google.apps.d.d.n r3 = r0.m81816g(r3)
            goto L_0x06d3
        L_0x04d2:
            com.google.apps.d.d.q r3 = new com.google.apps.d.d.q
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r4 = r4.mo49918a()
            r3.<init>((int) r11, (com.google.apps.p3589d.p3593d.C45763v) r4)
            goto L_0x06d3
        L_0x04e1:
            com.google.apps.d.d.q r3 = new com.google.apps.d.d.q
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r4 = r4.mo49918a()
            r3.<init>((int) r15, (com.google.apps.p3589d.p3593d.C45763v) r4)
            goto L_0x06d3
        L_0x04f0:
            com.google.apps.d.d.q r3 = new com.google.apps.d.d.q
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r4 = r4.mo49918a()
            r3.<init>((int) r6, (com.google.apps.p3589d.p3593d.C45763v) r4)
            goto L_0x06d3
        L_0x04ff:
            com.google.apps.d.e.z r3 = r25.mo49994c()
            com.google.apps.d.d.v r3 = r3.mo49918a()
            com.google.apps.d.d.ag r4 = new com.google.apps.d.d.ag
            r5 = 15
            java.lang.String r6 = "̲"
            r4.<init>(r5, r6, r3)
            goto L_0x0522
        L_0x0511:
            com.google.apps.d.e.z r3 = r25.mo49994c()
            com.google.apps.d.d.v r3 = r3.mo49918a()
            com.google.apps.d.d.ag r4 = new com.google.apps.d.d.ag
            r5 = 16
            java.lang.String r6 = "̄"
            r4.<init>(r5, r6, r3)
        L_0x0522:
            r3 = r4
            goto L_0x06d3
        L_0x0525:
            boolean r3 = r0.f120538f
            com.google.apps.d.d.g r4 = r0.f120539g
            r0.f120538f = r6
            java.lang.String r5 = "\\left"
            com.google.apps.d.d.g r5 = r0.m81814e(r5)
            com.google.apps.d.e.z r6 = r0.m81817h(r12, r12)
            com.google.apps.d.d.g r7 = r0.f120539g
            if (r7 == 0) goto L_0x0547
            com.google.apps.d.d.t r11 = new com.google.apps.d.d.t
            com.google.apps.d.d.v r6 = r6.mo49918a()
            com.google.apps.d.d.f r5 = com.google.apps.p3589d.p3593d.C45748g.m81553a(r5, r7)
            r11.<init>((com.google.apps.p3589d.p3593d.C45763v) r6, (com.google.apps.p3589d.p3593d.C45747f) r5)
            goto L_0x0564
        L_0x0547:
            com.google.apps.d.g.o r7 = r0.f120537e
            com.google.apps.d.g.b r7 = (com.google.apps.p3589d.p3596g.C45834b) r7
            boolean r7 = r7.f120515a
            if (r7 == 0) goto L_0x056b
            com.google.apps.d.d.n r5 = com.google.apps.p3589d.p3596g.C45833ai.m81767f(r5)
            boolean r7 = r5.mo49891k()
            if (r7 != 0) goto L_0x0560
            com.google.apps.d.b.n r7 = r2.f120420a
            java.util.ArrayList r7 = r7.f120220a
            r7.add(r5)
        L_0x0560:
            r2.mo49920c(r6)
            r11 = 0
        L_0x0564:
            r0.f120538f = r3
            r0.f120539g = r4
            r3 = r11
            goto L_0x06d3
        L_0x056b:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Missing \\right"
            r1.<init>(r2)
            throw r1
        L_0x0573:
            com.google.apps.d.d.g r4 = r0.m81814e(r3)
            java.lang.String r5 = "\\Bigg"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x0582
            com.google.apps.d.d.o r5 = com.google.apps.p3589d.p3593d.C45756o.BBIGG
            goto L_0x0598
        L_0x0582:
            java.lang.String r5 = "\\bigg"
            boolean r5 = r3.startsWith(r5)
            if (r5 == 0) goto L_0x058d
            com.google.apps.d.d.o r5 = com.google.apps.p3589d.p3593d.C45756o.BIGG
            goto L_0x0598
        L_0x058d:
            boolean r5 = r3.startsWith(r10)
            if (r5 == 0) goto L_0x0596
            com.google.apps.d.d.o r5 = com.google.apps.p3589d.p3593d.C45756o.BBIG
            goto L_0x0598
        L_0x0596:
            com.google.apps.d.d.o r5 = com.google.apps.p3589d.p3593d.C45756o.BIG
        L_0x0598:
            java.lang.String r6 = "m"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x05a7
            com.google.apps.d.d.p r3 = new com.google.apps.d.d.p
            r3.<init>(r8, r4, r5)
            goto L_0x06d3
        L_0x05a7:
            java.lang.String r6 = "r"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x05b6
            com.google.apps.d.d.p r3 = new com.google.apps.d.d.p
            r3.<init>(r7, r4, r5)
            goto L_0x06d3
        L_0x05b6:
            java.lang.String r6 = "l"
            boolean r3 = r3.endsWith(r6)
            if (r3 == 0) goto L_0x05c7
            com.google.apps.d.d.p r3 = new com.google.apps.d.d.p
            r6 = 8
            r3.<init>(r6, r4, r5)
            goto L_0x06d3
        L_0x05c7:
            com.google.apps.d.d.p r3 = new com.google.apps.d.d.p
            r3.<init>(r15, r4, r5)
            goto L_0x06d3
        L_0x05ce:
            com.google.apps.d.g.h r3 = r0.f120536d
            boolean r3 = r3.mo49991f()
            if (r3 == 0) goto L_0x0600
            com.google.apps.d.g.h r3 = r0.f120536d
            int r3 = r3.mo49986a()
            r4 = 91
            if (r3 != r4) goto L_0x05eb
            r3 = 93
            com.google.apps.d.e.z r3 = r0.m81817h(r12, r3)
            com.google.apps.d.d.v r11 = r3.mo49918a()
            goto L_0x05f1
        L_0x05eb:
            com.google.apps.d.g.h r4 = r0.f120536d
            r4.mo49990e(r3)
            r11 = 0
        L_0x05f1:
            com.google.apps.d.d.x r3 = new com.google.apps.d.d.x
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r4 = r4.mo49918a()
            r3.<init>((com.google.apps.p3589d.p3593d.C45763v) r11, (com.google.apps.p3589d.p3593d.C45763v) r4)
            goto L_0x06d3
        L_0x0600:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "\\sqrt missing arguments."
            r1.<init>(r2)
            throw r1
        L_0x0608:
            com.google.apps.d.d.s r10 = new com.google.apps.d.d.s
            r4 = 0
            r5 = 0
            com.google.apps.d.e.z r3 = r25.mo49994c()
            com.google.apps.d.d.v r6 = r3.mo49918a()
            com.google.apps.d.e.z r3 = r25.mo49994c()
            com.google.apps.d.d.v r7 = r3.mo49918a()
            com.google.apps.d.d.f r8 = com.google.apps.p3589d.p3593d.C45748g.f120278J
            r9 = 2
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x06d3
        L_0x0625:
            com.google.apps.d.d.s r3 = new com.google.apps.d.d.s
            r12 = 0
            r13 = 0
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r14 = r4.mo49918a()
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r15 = r4.mo49918a()
            com.google.apps.d.d.f r16 = com.google.apps.p3589d.p3593d.C45748g.f120278J
            r17 = 1
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x06d3
        L_0x0643:
            com.google.apps.d.d.s r3 = new com.google.apps.d.d.s
            r5 = 0
            r6 = 0
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r7 = r4.mo49918a()
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r8 = r4.mo49918a()
            com.google.apps.d.d.f r9 = com.google.apps.p3589d.p3593d.C45748g.f120278J
            r10 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x06d3
        L_0x0660:
            com.google.apps.d.d.s r3 = new com.google.apps.d.d.s
            r12 = 1
            r13 = 0
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r14 = r4.mo49918a()
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r15 = r4.mo49918a()
            com.google.apps.d.d.f r16 = com.google.apps.p3589d.p3593d.C45748g.f120273E
            r17 = 2
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x06d3
        L_0x067d:
            com.google.apps.d.d.s r3 = new com.google.apps.d.d.s
            r5 = 1
            r6 = 0
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r7 = r4.mo49918a()
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r8 = r4.mo49918a()
            com.google.apps.d.d.f r9 = com.google.apps.p3589d.p3593d.C45748g.f120273E
            r10 = 1
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x06d3
        L_0x0699:
            com.google.apps.d.d.s r3 = new com.google.apps.d.d.s
            r12 = 1
            r13 = 1
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r14 = r4.mo49918a()
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r15 = r4.mo49918a()
            com.google.apps.d.d.f r16 = com.google.apps.p3589d.p3593d.C45748g.f120273E
            r17 = 1
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17)
            goto L_0x06d3
        L_0x06b6:
            com.google.apps.d.d.s r3 = new com.google.apps.d.d.s
            r5 = 1
            r6 = 0
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r7 = r4.mo49918a()
            com.google.apps.d.e.z r4 = r25.mo49994c()
            com.google.apps.d.d.v r8 = r4.mo49918a()
            com.google.apps.d.d.f r9 = com.google.apps.p3589d.p3593d.C45748g.f120273E
            r10 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x06d3
        L_0x06d2:
            r3 = r5
        L_0x06d3:
            if (r3 != 0) goto L_0x06e2
            goto L_0x0017
        L_0x06d7:
            if (r26 != 0) goto L_0x070d
            com.google.apps.d.g.h r4 = r0.f120536d
            r4.mo49990e(r3)
            com.google.apps.d.d.n r3 = com.google.apps.p3589d.p3593d.C45755n.m81570c()
        L_0x06e2:
            if (r3 == 0) goto L_0x0705
            com.google.apps.d.f.x r4 = r3.f120317f
            com.google.apps.d.f.x r5 = com.google.apps.p3589d.p3595f.C45821x.DEFAULT
            if (r4 != r5) goto L_0x06ee
            com.google.apps.d.f.x r4 = r0.f120541i
            r3.f120317f = r4
        L_0x06ee:
            if (r26 == 0) goto L_0x06f8
            com.google.apps.d.b.n r1 = r2.f120420a
            java.util.ArrayList r1 = r1.f120220a
            r1.add(r3)
            return r2
        L_0x06f8:
            com.google.apps.d.d.n r3 = r0.m81815f(r3)
            com.google.apps.d.b.n r4 = r2.f120420a
            java.util.ArrayList r4 = r4.f120220a
            r4.add(r3)
            goto L_0x0017
        L_0x0705:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Atom shouldn't be null."
            r1.<init>(r2)
            throw r1
        L_0x070d:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "This should have been handled before"
            r1.<init>(r2)
            throw r1
        L_0x0715:
            if (r26 != 0) goto L_0x0718
            return r2
        L_0x0718:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r8)
            throw r1
        L_0x071e:
            if (r26 == 0) goto L_0x073a
            com.google.apps.d.b.n r1 = r2.f120420a
            java.util.ArrayList r1 = r1.f120220a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0732
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Should have returned directly after adding to list."
            r1.<init>(r2)
            throw r1
        L_0x0732:
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Unexpected end of LaTeX when parsing argument."
            r1.<init>(r2)
            throw r1
        L_0x073a:
            if (r1 <= 0) goto L_0x075a
            if (r1 != r4) goto L_0x0746
            com.google.apps.d.g.i r1 = new com.google.apps.d.g.i
            java.lang.String r2 = "Missing closing brace."
            r1.<init>(r2)
            throw r1
        L_0x0746:
            com.google.apps.d.g.i r2 = new com.google.apps.d.g.i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected character not found: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x075a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3596g.C45848p.m81817h(boolean, char):com.google.apps.d.e.z");
    }
}
