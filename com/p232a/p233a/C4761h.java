package com.p232a.p233a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xml.sax.SAXException;

/* renamed from: com.a.a.h */
/* compiled from: PG */
public final class C4761h {

    /* renamed from: a */
    private final C4745c f15079a;

    /* renamed from: b */
    private boolean f15080b = false;

    public C4761h(C4745c cVar) {
        this.f15079a = cVar;
    }

    /* renamed from: b */
    public static boolean m13267b(String str, C4745c cVar) {
        C4718b bVar = new C4718b(str);
        bVar.mo9652k();
        List f = m13271f(bVar);
        if (bVar.mo9655n()) {
            return m13272g(f, cVar);
        }
        throw new SAXException("Invalid @media type list");
    }

    /* renamed from: c */
    public static boolean m13268c(C4759f fVar, int i, List list, int i2, C4713av avVar) {
        C4760g b = fVar.mo9670b(i);
        if (!m13269d(b, list, i2, avVar)) {
            return false;
        }
        int i3 = b.f15078d;
        if (i3 == 1) {
            if (i == 0) {
                return true;
            }
            while (i2 >= 0) {
                if (m13273h(fVar, i - 1, list, i2)) {
                    return true;
                }
                i2--;
            }
            return false;
        } else if (i3 == 2) {
            return m13273h(fVar, i - 1, list, i2);
        } else {
            int e = m13270e(list, i2, avVar);
            if (e <= 0) {
                return false;
            }
            return m13268c(fVar, i - 1, list, i2, (C4713av) avVar.f14834u.mo9602n().get(e - 1));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13269d(com.p232a.p233a.C4760g r5, java.util.List r6, int r7, com.p232a.p233a.C4713av r8) {
        /*
            java.lang.String r0 = r5.f15075a
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = "G"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r8 instanceof com.p232a.p233a.C4776w
            if (r0 == 0) goto L_0x0012
            goto L_0x002a
        L_0x0012:
            return r1
        L_0x0013:
            java.lang.String r0 = r5.f15075a
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toLowerCase(r3)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x002a
            return r1
        L_0x002a:
            java.util.List r0 = r5.f15076b
            if (r0 == 0) goto L_0x0061
            java.util.Iterator r0 = r0.iterator()
        L_0x0032:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r0.next()
            com.a.a.a r2 = (com.p232a.p233a.C4691a) r2
            java.lang.String r3 = r2.f14732a
            java.lang.String r4 = "id"
            if (r3 != r4) goto L_0x004f
            java.lang.String r2 = r2.f14733b
            java.lang.String r3 = r8.f14824o
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0032
            return r1
        L_0x004f:
            java.lang.String r4 = "class"
            if (r3 != r4) goto L_0x0060
            java.util.List r3 = r8.f14828s
            if (r3 != 0) goto L_0x0058
            return r1
        L_0x0058:
            java.lang.String r2 = r2.f14733b
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0032
        L_0x0060:
            return r1
        L_0x0061:
            java.util.List r5 = r5.f15077c
            if (r5 == 0) goto L_0x0084
            java.util.Iterator r5 = r5.iterator()
        L_0x0069:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "first-child"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0083
            int r0 = m13270e(r6, r7, r8)
            if (r0 == 0) goto L_0x0069
        L_0x0083:
            return r1
        L_0x0084:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4761h.m13269d(com.a.a.g, java.util.List, int, com.a.a.av):boolean");
    }

    /* renamed from: e */
    private static int m13270e(List list, int i, C4713av avVar) {
        C4711at atVar;
        if (i < 0 || list.get(i) != (atVar = avVar.f14834u)) {
            return -1;
        }
        int i2 = 0;
        for (C4715ax axVar : atVar.mo9602n()) {
            if (axVar == avVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: f */
    private static List m13271f(C4718b bVar) {
        ArrayList arrayList = new ArrayList();
        while (!bVar.mo9655n()) {
            try {
                arrayList.add(C4745c.m13152a(bVar.mo9651j(',')));
                if (!bVar.mo9657p()) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid @media type list");
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static boolean m13272g(List list, C4745c cVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4745c cVar2 = (C4745c) it.next();
            if (cVar2 == C4745c.all) {
                return true;
            }
            if (cVar2 == cVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m13273h(C4759f fVar, int i, List list, int i2) {
        C4760g b = fVar.mo9670b(i);
        C4713av avVar = (C4713av) list.get(i2);
        if (!m13269d(b, list, i2, avVar)) {
            return false;
        }
        int i3 = b.f15078d;
        if (i3 == 1) {
            if (i == 0) {
                return true;
            }
            while (i2 > 0) {
                i2--;
                if (m13273h(fVar, i - 1, list, i2)) {
                    return true;
                }
            }
            return false;
        } else if (i3 == 2) {
            return m13273h(fVar, i - 1, list, i2 - 1);
        } else {
            int e = m13270e(list, i2, avVar);
            if (e <= 0) {
                return false;
            }
            return m13268c(fVar, i - 1, list, i2, (C4713av) avVar.f14834u.mo9602n().get(e - 1));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v41, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: com.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v44, resolved type: com.a.a.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b1, code lost:
        r10 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01b3, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b4, code lost:
        if (r10 == 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b6, code lost:
        r18.mo9652k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01bd, code lost:
        if (r18.mo9655n() == false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bf, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c2, code lost:
        r16 = r18.mo9650i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c6, code lost:
        if (r16 != null) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c8, code lost:
        r16 = r18.mo9615a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cc, code lost:
        if (r16 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ce, code lost:
        r18.mo9652k();
        r15 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d9, code lost:
        throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01da, code lost:
        r10 = 0;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01e2, code lost:
        if (r1.mo9653l(']') == false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e4, code lost:
        if (r10 != 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01e6, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e7, code lost:
        r8.mo9674a(r7, r10, r15);
        r11.mo9671c();
        r10 = null;
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f9, code lost:
        throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01ff, code lost:
        throw new org.xml.sax.SAXException("Invalid attribute selector in <style> element");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0200, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0204, code lost:
        if (r1.mo9653l(':') == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0206, code lost:
        r5 = r1.f15058b;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x020c, code lost:
        if (r18.mo9615a() == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0214, code lost:
        if (r1.mo9653l('(') == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0216, code lost:
        r18.mo9652k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x021d, code lost:
        if (r18.mo9615a() == null) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021f, code lost:
        r18.mo9652k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0228, code lost:
        if (r1.mo9653l(')') != false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x022a, code lost:
        r1.f15058b = r5 - 1;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x022f, code lost:
        r5 = r1.f15057a.substring(r5, r1.f15058b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0239, code lost:
        if (r8.f15077c != null) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x023b, code lost:
        r8.f15077c = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0242, code lost:
        r8.f15077c.add(r5);
        r11.mo9671c();
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x024a, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0125, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0152, code lost:
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0158, code lost:
        if (r1.mo9653l('#') == false) goto L_0x017b;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015a, code lost:
        if (r8 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x015c, code lost:
        r8 = new com.p232a.p233a.C4760g(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0161, code lost:
        r7 = r18.mo9615a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0165, code lost:
        if (r7 == null) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0167, code lost:
        r8.mo9674a("id", r15, r7);
        r11.f15074b += 10000;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017a, code lost:
        throw new org.xml.sax.SAXException("Invalid \"#id\" selector in <style> element");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017b, code lost:
        if (r8 != 0) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0185, code lost:
        if (r1.mo9653l('[') == false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0187, code lost:
        r18.mo9652k();
        r7 = r18.mo9615a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0190, code lost:
        if (r7 == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0192, code lost:
        r18.mo9652k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019b, code lost:
        if (r1.mo9653l('=') == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x019d, code lost:
        r10 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01a5, code lost:
        if (r1.mo9654m("~=") == false) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01a7, code lost:
        r10 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01af, code lost:
        if (r1.mo9654m("|=") == false) goto L_0x01b3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0271 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x024a A[EDGE_INSN: B:248:0x024a->B:138:0x024a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p232a.p233a.C4758e mo9676a(com.p232a.p233a.C4718b r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.a.a.e r2 = new com.a.a.e
            r2.<init>()
        L_0x0009:
            boolean r3 = r18.mo9655n()
            if (r3 != 0) goto L_0x0383
            java.lang.String r3 = "<!--"
            boolean r3 = r1.mo9654m(r3)
            if (r3 != 0) goto L_0x0009
            java.lang.String r3 = "-->"
            boolean r3 = r1.mo9654m(r3)
            if (r3 != 0) goto L_0x0009
            r3 = 64
            boolean r3 = r1.mo9653l(r3)
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 125(0x7d, float:1.75E-43)
            r6 = 59
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L_0x00bc
            java.lang.String r3 = r18.mo9615a()
            r18.mo9652k()
            if (r3 == 0) goto L_0x00b4
            boolean r9 = r0.f15080b
            if (r9 != 0) goto L_0x007f
            java.lang.String r9 = "media"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x007f
            java.util.List r3 = m13271f(r18)
            boolean r4 = r1.mo9653l(r4)
            if (r4 == 0) goto L_0x0077
            r18.mo9652k()
            com.a.a.c r4 = r0.f15079a
            boolean r3 = m13272g(r3, r4)
            if (r3 == 0) goto L_0x0065
            r0.f15080b = r7
            com.a.a.e r3 = r17.mo9676a(r18)
            r2.mo9667a(r3)
            r0.f15080b = r8
            goto L_0x0068
        L_0x0065:
            r17.mo9676a(r18)
        L_0x0068:
            boolean r3 = r1.mo9653l(r5)
            if (r3 == 0) goto L_0x006f
            goto L_0x00af
        L_0x006f:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid @media rule: expected '}' at end of rule set"
            r1.<init>(r2)
            throw r1
        L_0x0077:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid @media rule: missing rule set"
            r1.<init>(r2)
            throw r1
        L_0x007f:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r8] = r3
            java.lang.String r3 = "Ignoring @%s rule"
            java.lang.String r3 = java.lang.String.format(r3, r7)
            java.lang.String r7 = "AndroidSVG CSSParser"
            android.util.Log.w(r7, r3)
        L_0x008e:
            boolean r3 = r18.mo9655n()
            if (r3 != 0) goto L_0x00af
            java.lang.Integer r3 = r18.mo9649h()
            int r3 = r3.intValue()
            if (r3 != r6) goto L_0x00a2
            if (r8 == 0) goto L_0x00af
            r3 = 59
        L_0x00a2:
            if (r3 != r4) goto L_0x00a7
            int r8 = r8 + 1
            goto L_0x008e
        L_0x00a7:
            if (r3 != r5) goto L_0x008e
            if (r8 <= 0) goto L_0x008e
            int r8 = r8 + -1
            if (r8 != 0) goto L_0x008e
        L_0x00af:
            r18.mo9652k()
            goto L_0x0009
        L_0x00b4:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid '@' rule in <style> element"
            r1.<init>(r2)
            throw r1
        L_0x00bc:
            boolean r3 = r18.mo9655n()
            r9 = 58
            r10 = 0
            if (r3 == 0) goto L_0x00c8
            r3 = r10
            goto L_0x027c
        L_0x00c8:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r7)
            com.a.a.f r11 = new com.a.a.f
            r11.<init>()
        L_0x00d2:
            boolean r12 = r18.mo9655n()
            if (r12 != 0) goto L_0x0273
            boolean r12 = r18.mo9655n()
            if (r12 == 0) goto L_0x00e0
            goto L_0x0273
        L_0x00e0:
            int r12 = r1.f15058b
            boolean r13 = r11.mo9672d()
            r15 = 2
            if (r13 != 0) goto L_0x0103
            r13 = 62
            boolean r13 = r1.mo9653l(r13)
            if (r13 == 0) goto L_0x00f6
            r18.mo9652k()
            r13 = 2
            goto L_0x0104
        L_0x00f6:
            r13 = 43
            boolean r13 = r1.mo9653l(r13)
            if (r13 == 0) goto L_0x0103
            r18.mo9652k()
            r13 = 3
            goto L_0x0104
        L_0x0103:
            r13 = 0
        L_0x0104:
            r8 = 42
            boolean r8 = r1.mo9653l(r8)
            if (r8 == 0) goto L_0x0112
            com.a.a.g r8 = new com.a.a.g
            r8.<init>(r13, r10)
            goto L_0x0125
        L_0x0112:
            java.lang.String r8 = r18.mo9615a()
            if (r8 == 0) goto L_0x0124
            com.a.a.g r14 = new com.a.a.g
            r14.<init>(r13, r8)
            int r8 = r11.f15074b
            int r8 = r8 + r7
            r11.f15074b = r8
            r8 = r14
            goto L_0x0125
        L_0x0124:
            r8 = r10
        L_0x0125:
            boolean r14 = r18.mo9655n()
            if (r14 != 0) goto L_0x024a
            r14 = 46
            boolean r14 = r1.mo9653l(r14)
            if (r14 == 0) goto L_0x0152
            if (r8 != 0) goto L_0x013a
            com.a.a.g r8 = new com.a.a.g
            r8.<init>(r13, r10)
        L_0x013a:
            java.lang.String r14 = r18.mo9615a()
            if (r14 == 0) goto L_0x014a
            java.lang.String r7 = "class"
            r8.mo9674a(r7, r15, r14)
            r11.mo9671c()
            r7 = 1
            goto L_0x0125
        L_0x014a:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid \".class\" selector in <style> element"
            r1.<init>(r2)
            throw r1
        L_0x0152:
            r7 = 35
            boolean r7 = r1.mo9653l(r7)
            if (r7 == 0) goto L_0x017b
            if (r8 != 0) goto L_0x0161
            com.a.a.g r8 = new com.a.a.g
            r8.<init>(r13, r10)
        L_0x0161:
            java.lang.String r7 = r18.mo9615a()
            if (r7 == 0) goto L_0x0173
            java.lang.String r14 = "id"
            r8.mo9674a(r14, r15, r7)
            int r7 = r11.f15074b
            int r7 = r7 + 10000
            r11.f15074b = r7
            goto L_0x017b
        L_0x0173:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid \"#id\" selector in <style> element"
            r1.<init>(r2)
            throw r1
        L_0x017b:
            if (r8 != 0) goto L_0x017f
            goto L_0x024a
        L_0x017f:
            r7 = 91
            boolean r7 = r1.mo9653l(r7)
            if (r7 == 0) goto L_0x0200
            r18.mo9652k()
            java.lang.String r7 = r18.mo9615a()
            java.lang.String r14 = "Invalid attribute selector in <style> element"
            if (r7 == 0) goto L_0x01fa
            r18.mo9652k()
            r10 = 61
            boolean r10 = r1.mo9653l(r10)
            if (r10 == 0) goto L_0x019f
            r10 = 2
            goto L_0x01b4
        L_0x019f:
            java.lang.String r10 = "~="
            boolean r10 = r1.mo9654m(r10)
            if (r10 == 0) goto L_0x01a9
            r10 = 3
            goto L_0x01b4
        L_0x01a9:
            java.lang.String r10 = "|="
            boolean r10 = r1.mo9654m(r10)
            if (r10 == 0) goto L_0x01b3
            r10 = 4
            goto L_0x01b4
        L_0x01b3:
            r10 = 0
        L_0x01b4:
            if (r10 == 0) goto L_0x01da
            r18.mo9652k()
            boolean r16 = r18.mo9655n()
            if (r16 == 0) goto L_0x01c2
            r16 = 0
            goto L_0x01cc
        L_0x01c2:
            java.lang.String r16 = r18.mo9650i()
            if (r16 != 0) goto L_0x01cc
            java.lang.String r16 = r18.mo9615a()
        L_0x01cc:
            if (r16 == 0) goto L_0x01d4
            r18.mo9652k()
            r15 = r16
            goto L_0x01dc
        L_0x01d4:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            r1.<init>(r14)
            throw r1
        L_0x01da:
            r10 = 0
            r15 = 0
        L_0x01dc:
            r5 = 93
            boolean r5 = r1.mo9653l(r5)
            if (r5 == 0) goto L_0x01f4
            if (r10 != 0) goto L_0x01e7
            r10 = 1
        L_0x01e7:
            r8.mo9674a(r7, r10, r15)
            r11.mo9671c()
            r5 = 125(0x7d, float:1.75E-43)
            r7 = 1
            r10 = 0
            r15 = 2
            goto L_0x0125
        L_0x01f4:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            r1.<init>(r14)
            throw r1
        L_0x01fa:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            r1.<init>(r14)
            throw r1
        L_0x0200:
            boolean r5 = r1.mo9653l(r9)
            if (r5 == 0) goto L_0x024a
            int r5 = r1.f15058b
            java.lang.String r7 = r18.mo9615a()
            if (r7 == 0) goto L_0x024a
            r7 = 40
            boolean r7 = r1.mo9653l(r7)
            if (r7 == 0) goto L_0x022f
            r18.mo9652k()
            java.lang.String r7 = r18.mo9615a()
            if (r7 == 0) goto L_0x022f
            r18.mo9652k()
            r7 = 41
            boolean r7 = r1.mo9653l(r7)
            if (r7 != 0) goto L_0x022f
            int r5 = r5 + -1
            r1.f15058b = r5
            goto L_0x024a
        L_0x022f:
            java.lang.String r7 = r1.f15057a
            int r10 = r1.f15058b
            java.lang.String r5 = r7.substring(r5, r10)
            java.util.List r7 = r8.f15077c
            if (r7 != 0) goto L_0x0242
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8.f15077c = r7
        L_0x0242:
            java.util.List r7 = r8.f15077c
            r7.add(r5)
            r11.mo9671c()
        L_0x024a:
            if (r8 == 0) goto L_0x0271
            java.util.List r5 = r11.f15073a
            if (r5 != 0) goto L_0x0257
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r11.f15073a = r5
        L_0x0257:
            java.util.List r5 = r11.f15073a
            r5.add(r8)
            boolean r5 = r18.mo9657p()
            if (r5 == 0) goto L_0x026a
            r3.add(r11)
            com.a.a.f r11 = new com.a.a.f
            r11.<init>()
        L_0x026a:
            r5 = 125(0x7d, float:1.75E-43)
            r7 = 1
            r8 = 0
            r10 = 0
            goto L_0x00d2
        L_0x0271:
            r1.f15058b = r12
        L_0x0273:
            boolean r5 = r11.mo9672d()
            if (r5 != 0) goto L_0x027c
            r3.add(r11)
        L_0x027c:
            if (r3 == 0) goto L_0x0383
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L_0x0383
            boolean r4 = r1.mo9653l(r4)
            if (r4 == 0) goto L_0x037b
            r18.mo9652k()
            com.a.a.ao r4 = new com.a.a.ao
            r4.<init>()
        L_0x0292:
            java.lang.String r5 = r18.mo9615a()
            r18.mo9652k()
            boolean r7 = r1.mo9653l(r9)
            if (r7 == 0) goto L_0x0373
            r18.mo9652k()
            boolean r7 = r18.mo9655n()
            r8 = 33
            if (r7 == 0) goto L_0x02ad
            r7 = 0
            r12 = 1
            goto L_0x02eb
        L_0x02ad:
            int r7 = r1.f15058b
            java.lang.String r10 = r1.f15057a
            char r10 = r10.charAt(r7)
            r11 = r7
        L_0x02b6:
            r12 = -1
            if (r10 == r12) goto L_0x02dc
            if (r10 == r6) goto L_0x02dc
            r12 = 125(0x7d, float:1.75E-43)
            if (r10 == r12) goto L_0x02dc
            if (r10 == r8) goto L_0x02dc
            r12 = 10
            if (r10 == r12) goto L_0x02dc
            r12 = 13
            if (r10 != r12) goto L_0x02ca
            goto L_0x02dc
        L_0x02ca:
            boolean r10 = com.p232a.p233a.C4718b.m13208r(r10)
            if (r10 != 0) goto L_0x02d6
            int r10 = r1.f15058b
            r12 = 1
            int r11 = r10 + 1
            goto L_0x02d7
        L_0x02d6:
            r12 = 1
        L_0x02d7:
            int r10 = r18.mo9646e()
            goto L_0x02b6
        L_0x02dc:
            r12 = 1
            int r10 = r1.f15058b
            if (r10 <= r7) goto L_0x02e8
            java.lang.String r10 = r1.f15057a
            java.lang.String r7 = r10.substring(r7, r11)
            goto L_0x02eb
        L_0x02e8:
            r1.f15058b = r7
            r7 = 0
        L_0x02eb:
            if (r7 == 0) goto L_0x0373
            r18.mo9652k()
            boolean r8 = r1.mo9653l(r8)
            if (r8 == 0) goto L_0x030d
            r18.mo9652k()
            java.lang.String r8 = "important"
            boolean r8 = r1.mo9654m(r8)
            if (r8 == 0) goto L_0x0305
            r18.mo9652k()
            goto L_0x030d
        L_0x0305:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Malformed rule set in <style> element: found unexpected '!'"
            r1.<init>(r2)
            throw r1
        L_0x030d:
            r1.mo9653l(r6)
            com.p232a.p233a.C4756ck.m13236c(r4, r5, r7)
            r18.mo9652k()
            r5 = 125(0x7d, float:1.75E-43)
            boolean r7 = r1.mo9653l(r5)
            if (r7 == 0) goto L_0x036b
            r18.mo9652k()
            java.util.Iterator r3 = r3.iterator()
        L_0x0325:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0009
            java.lang.Object r5 = r3.next()
            com.a.a.f r5 = (com.p232a.p233a.C4759f) r5
            com.a.a.d r6 = new com.a.a.d
            r6.<init>(r5, r4)
            java.util.List r5 = r2.f15072a
            if (r5 != 0) goto L_0x0341
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.f15072a = r5
        L_0x0341:
            r5 = 0
        L_0x0342:
            java.util.List r7 = r2.f15072a
            int r7 = r7.size()
            if (r5 >= r7) goto L_0x0365
            java.util.List r7 = r2.f15072a
            java.lang.Object r7 = r7.get(r5)
            com.a.a.d r7 = (com.p232a.p233a.C4757d) r7
            com.a.a.f r7 = r7.f15070a
            int r7 = r7.f15074b
            com.a.a.f r8 = r6.f15070a
            int r8 = r8.f15074b
            if (r7 <= r8) goto L_0x0362
            java.util.List r7 = r2.f15072a
            r7.add(r5, r6)
            goto L_0x0325
        L_0x0362:
            int r5 = r5 + 1
            goto L_0x0342
        L_0x0365:
            java.util.List r5 = r2.f15072a
            r5.add(r6)
            goto L_0x0325
        L_0x036b:
            boolean r7 = r18.mo9655n()
            if (r7 != 0) goto L_0x0373
            goto L_0x0292
        L_0x0373:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Malformed rule set in <style> element"
            r1.<init>(r2)
            throw r1
        L_0x037b:
            org.xml.sax.SAXException r1 = new org.xml.sax.SAXException
            java.lang.String r2 = "Malformed rule block in <style> element: missing '{'"
            r1.<init>(r2)
            throw r1
        L_0x0383:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4761h.mo9676a(com.a.a.b):com.a.a.e");
    }
}
