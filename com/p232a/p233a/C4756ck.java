package com.p232a.p233a;

import android.graphics.Matrix;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.chromium.net.PrivateKeyType;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* renamed from: com.a.a.ck */
/* compiled from: PG */
public final class C4756ck extends DefaultHandler2 {

    /* renamed from: a */
    private C4734bp f15061a = null;

    /* renamed from: b */
    private C4711at f15062b = null;

    /* renamed from: c */
    private boolean f15063c = false;

    /* renamed from: d */
    private int f15064d;

    /* renamed from: e */
    private boolean f15065e = false;

    /* renamed from: f */
    private C4754ci f15066f = null;

    /* renamed from: g */
    private StringBuilder f15067g = null;

    /* renamed from: h */
    private boolean f15068h = false;

    /* renamed from: i */
    private StringBuilder f15069i = null;

    /* renamed from: A */
    private static final void m13225A(C4708aq aqVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            C4753ch chVar = C4753ch.CLASS;
            C4754ci ciVar = C4754ci.svg;
            int ordinal = C4753ch.m13206a(attributes.getLocalName(i)).ordinal();
            if (ordinal != 73) {
                switch (ordinal) {
                    case 52:
                        C4755cj cjVar = new C4755cj(trim);
                        HashSet hashSet = new HashSet();
                        while (!cjVar.mo9655n()) {
                            String j = cjVar.mo9651j(' ');
                            if (j.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(j.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            cjVar.mo9652k();
                        }
                        aqVar.mo9610i(hashSet);
                        break;
                    case 53:
                        aqVar.mo9609h(trim);
                        break;
                    case 54:
                        C4755cj cjVar2 = new C4755cj(trim);
                        HashSet hashSet2 = new HashSet();
                        while (!cjVar2.mo9655n()) {
                            hashSet2.add(cjVar2.mo9651j(' '));
                            cjVar2.mo9652k();
                        }
                        aqVar.mo9612k(hashSet2);
                        break;
                    case 55:
                        List m = m13246m(trim);
                        aqVar.mo9611j(m != null ? new HashSet(m) : new HashSet(0));
                        break;
                }
            } else {
                C4755cj cjVar3 = new C4755cj(trim);
                HashSet hashSet3 = new HashSet();
                while (!cjVar3.mo9655n()) {
                    String j2 = cjVar3.mo9651j(' ');
                    int indexOf = j2.indexOf(45);
                    if (indexOf != -1) {
                        j2 = j2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(j2, BuildConfig.FLAVOR, BuildConfig.FLAVOR).getLanguage());
                    cjVar3.mo9652k();
                }
                aqVar.mo9613l(hashSet3);
            }
        }
    }

    /* renamed from: B */
    private static final void m13226B(C4713av avVar, Attributes attributes) {
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                avVar.f14824o = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    avVar.f14825p = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    avVar.f14825p = Boolean.TRUE;
                    return;
                } else {
                    throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(trim)));
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: C */
    private static final void m13227C(C4701aj ajVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (C4753ch.m13206a(attributes.getLocalName(i)) == C4753ch.points) {
                C4755cj cjVar = new C4755cj(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                cjVar.mo9652k();
                while (!cjVar.mo9655n()) {
                    float c = cjVar.mo9644c();
                    if (!Float.isNaN(c)) {
                        cjVar.mo9657p();
                        float c2 = cjVar.mo9644c();
                        if (!Float.isNaN(c2)) {
                            cjVar.mo9657p();
                            arrayList.add(Float.valueOf(c));
                            arrayList.add(Float.valueOf(c2));
                        } else {
                            throw new SAXException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                        }
                    } else {
                        throw new SAXException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                }
                ajVar.f14763a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    ajVar.f14763a[i3] = ((Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    /* renamed from: D */
    private static final void m13228D(C4713av avVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                C4753ch chVar = C4753ch.CLASS;
                C4754ci ciVar = C4754ci.svg;
                int ordinal = C4753ch.m13206a(attributes.getLocalName(i)).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 72) {
                        C4755cj cjVar = new C4755cj(trim.replaceAll("/\\*.*?\\*/", BuildConfig.FLAVOR));
                        while (true) {
                            String j = cjVar.mo9651j(':');
                            cjVar.mo9652k();
                            if (!cjVar.mo9653l(':')) {
                                break;
                            }
                            cjVar.mo9652k();
                            String j2 = cjVar.mo9651j(';');
                            if (j2 == null) {
                                break;
                            }
                            cjVar.mo9652k();
                            if (cjVar.mo9655n() || cjVar.mo9653l(';')) {
                                if (avVar.f14827r == null) {
                                    avVar.f14827r = new C4706ao();
                                }
                                m13236c(avVar.f14827r, j, j2);
                                cjVar.mo9652k();
                            }
                        }
                    } else {
                        if (avVar.f14826q == null) {
                            avVar.f14826q = new C4706ao();
                        }
                        m13236c(avVar.f14826q, attributes.getLocalName(i), attributes.getValue(i).trim());
                    }
                } else {
                    C4718b bVar = new C4718b(trim);
                    ArrayList arrayList = null;
                    while (!bVar.mo9655n()) {
                        String a = bVar.mo9615a();
                        if (a != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(a);
                            bVar.mo9652k();
                        } else {
                            throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(trim)));
                        }
                    }
                    avVar.f14828s = arrayList;
                }
            }
        }
    }

    /* renamed from: E */
    private static final void m13229E(C4729bk bkVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            C4753ch chVar = C4753ch.CLASS;
            C4754ci ciVar = C4754ci.svg;
            int ordinal = C4753ch.m13206a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                bkVar.f14851d = m13247n(trim);
            } else if (ordinal == 10) {
                bkVar.f14852e = m13247n(trim);
            } else if (ordinal == 82) {
                bkVar.f14849b = m13247n(trim);
            } else if (ordinal == 83) {
                bkVar.f14850c = m13247n(trim);
            }
        }
    }

    /* renamed from: F */
    private static final void m13230F(C4720bb bbVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            C4753ch chVar = C4753ch.CLASS;
            C4754ci ciVar = C4754ci.svg;
            int ordinal = C4753ch.m13206a(attributes.getLocalName(i)).ordinal();
            if (ordinal == 48) {
                m13257x(bbVar, trim);
            } else if (ordinal != 80) {
                continue;
            } else {
                C4755cj cjVar = new C4755cj(trim);
                cjVar.mo9652k();
                float c = cjVar.mo9644c();
                cjVar.mo9657p();
                float c2 = cjVar.mo9644c();
                cjVar.mo9657p();
                float c3 = cjVar.mo9644c();
                cjVar.mo9657p();
                float c4 = cjVar.mo9644c();
                if (Float.isNaN(c) || Float.isNaN(c2) || Float.isNaN(c3) || Float.isNaN(c4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                } else if (c3 < 0.0f) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                } else if (c4 >= 0.0f) {
                    bbVar.f14841w = new C4766m(c, c2, c3, c4);
                } else {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
            }
        }
    }

    /* renamed from: G */
    private static float m13231G(String str, int i) {
        float a = new C4763j().mo9677a(str, 0, i);
        if (!Float.isNaN(a)) {
            return a;
        }
        throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
    }

    /* renamed from: H */
    private static final Matrix m13232H(String str) {
        Matrix matrix = new Matrix();
        C4755cj cjVar = new C4755cj(str);
        cjVar.mo9652k();
        while (!cjVar.mo9655n()) {
            String str2 = null;
            if (!cjVar.mo9655n()) {
                int i = cjVar.f15058b;
                int charAt = cjVar.f15057a.charAt(i);
                while (true) {
                    if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                        int i2 = cjVar.f15058b;
                    } else {
                        charAt = cjVar.mo9646e();
                    }
                }
                int i22 = cjVar.f15058b;
                while (C4755cj.m13208r(charAt)) {
                    charAt = cjVar.mo9646e();
                }
                if (charAt == 40) {
                    cjVar.f15058b++;
                    str2 = cjVar.f15057a.substring(i, i22);
                } else {
                    cjVar.f15058b = i;
                }
            }
            if (str2 != null) {
                if (str2.equals("matrix")) {
                    cjVar.mo9652k();
                    float c = cjVar.mo9644c();
                    cjVar.mo9657p();
                    float c2 = cjVar.mo9644c();
                    cjVar.mo9657p();
                    float c3 = cjVar.mo9644c();
                    cjVar.mo9657p();
                    float c4 = cjVar.mo9644c();
                    cjVar.mo9657p();
                    float c5 = cjVar.mo9644c();
                    cjVar.mo9657p();
                    float c6 = cjVar.mo9644c();
                    cjVar.mo9652k();
                    if (Float.isNaN(c6) || !cjVar.mo9653l(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{c, c3, c5, c2, c4, c6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                } else if (str2.equals("translate")) {
                    cjVar.mo9652k();
                    float c7 = cjVar.mo9644c();
                    float d = cjVar.mo9645d();
                    cjVar.mo9652k();
                    if (Float.isNaN(c7) || !cjVar.mo9653l(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    } else if (Float.isNaN(d)) {
                        matrix.preTranslate(c7, 0.0f);
                    } else {
                        matrix.preTranslate(c7, d);
                    }
                } else if (str2.equals("scale")) {
                    cjVar.mo9652k();
                    float c8 = cjVar.mo9644c();
                    float d2 = cjVar.mo9645d();
                    cjVar.mo9652k();
                    if (Float.isNaN(c8) || !cjVar.mo9653l(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    } else if (Float.isNaN(d2)) {
                        matrix.preScale(c8, c8);
                    } else {
                        matrix.preScale(c8, d2);
                    }
                } else if (str2.equals("rotate")) {
                    cjVar.mo9652k();
                    float c9 = cjVar.mo9644c();
                    float d3 = cjVar.mo9645d();
                    float d4 = cjVar.mo9645d();
                    cjVar.mo9652k();
                    if (Float.isNaN(c9) || !cjVar.mo9653l(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    } else if (Float.isNaN(d3)) {
                        matrix.preRotate(c9);
                    } else if (!Float.isNaN(d4)) {
                        matrix.preRotate(c9, d3, d4);
                    } else {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                } else if (str2.equals("skewX")) {
                    cjVar.mo9652k();
                    float c10 = cjVar.mo9644c();
                    cjVar.mo9652k();
                    if (Float.isNaN(c10) || !cjVar.mo9653l(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians((double) c10)), 0.0f);
                } else if (str2.equals("skewY")) {
                    cjVar.mo9652k();
                    float c11 = cjVar.mo9644c();
                    cjVar.mo9652k();
                    if (Float.isNaN(c11) || !cjVar.mo9653l(')')) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) c11)));
                } else {
                    throw new SAXException("Invalid transform list fn: " + str2 + ")");
                }
                if (cjVar.mo9655n()) {
                    break;
                }
                cjVar.mo9657p();
            } else {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
        }
        return matrix;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m13233I(com.p232a.p233a.C4774u r7, org.xml.sax.Attributes r8) {
        /*
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r8.getLength()
            if (r1 >= r2) goto L_0x00d1
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.CLASS
            com.a.a.ci r3 = com.p232a.p233a.C4754ci.svg
            java.lang.String r3 = r8.getLocalName(r1)
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.m13206a(r3)
            int r3 = r3.ordinal()
            r4 = 23
            if (r3 == r4) goto L_0x00c7
            r4 = 24
            r5 = 1
            if (r3 == r4) goto L_0x00a1
            r4 = 26
            if (r3 == r4) goto L_0x0092
            r4 = 60
            if (r3 == r4) goto L_0x0033
            goto L_0x00cd
        L_0x0033:
            int r3 = r2.hashCode()     // Catch:{ IllegalArgumentException -> 0x0079 }
            r4 = -934531685(0xffffffffc84c2d9b, float:-209078.42)
            r6 = 2
            if (r3 == r4) goto L_0x005c
            r4 = 110739(0x1b093, float:1.55178E-40)
            if (r3 == r4) goto L_0x0052
            r4 = 1085265597(0x40afd6bd, float:5.494963)
            if (r3 == r4) goto L_0x0048
            goto L_0x0066
        L_0x0048:
            java.lang.String r3 = "reflect"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0066
            r3 = 1
            goto L_0x0067
        L_0x0052:
            java.lang.String r3 = "pad"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0066
            r3 = 0
            goto L_0x0067
        L_0x005c:
            java.lang.String r3 = "repeat"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0066
            r3 = 2
            goto L_0x0067
        L_0x0066:
            r3 = -1
        L_0x0067:
            if (r3 == 0) goto L_0x0076
            if (r3 == r5) goto L_0x0075
            if (r3 != r6) goto L_0x006f
            r5 = 3
            goto L_0x0076
        L_0x006f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0079 }
            r7.<init>()     // Catch:{ IllegalArgumentException -> 0x0079 }
            throw r7     // Catch:{ IllegalArgumentException -> 0x0079 }
        L_0x0075:
            r5 = 2
        L_0x0076:
            r7.f15124e = r5     // Catch:{ IllegalArgumentException -> 0x0079 }
            goto L_0x00cd
        L_0x0079:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r0 = "\" is not a valid value."
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0092:
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            java.lang.String r4 = r8.getURI(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00cd
            r7.f15123d = r2
            goto L_0x00cd
        L_0x00a1:
            java.lang.String r3 = "objectBoundingBox"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00b0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r7.f15121b = r2
            goto L_0x00cd
        L_0x00b0:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00bf
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r7.f15121b = r2
            goto L_0x00cd
        L_0x00bf:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute gradientUnits"
            r7.<init>(r8)
            throw r7
        L_0x00c7:
            android.graphics.Matrix r2 = m13232H(r2)
            r7.f15122c = r2
        L_0x00cd:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4756ck.m13233I(com.a.a.u, org.xml.sax.Attributes):void");
    }

    /* renamed from: J */
    private static final void m13234J(C4777x xVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (C4753ch.m13206a(attributes.getLocalName(i)) == C4753ch.transform) {
                xVar.mo9617a(m13232H(attributes.getValue(i)));
            }
        }
    }

    /* renamed from: a */
    protected static C4779z m13235a(String str) {
        int i;
        if (str.length() != 0) {
            int length = str.length();
            int i2 = length - 1;
            char charAt = str.charAt(i2);
            if (charAt == '%') {
                length = i2;
                i = 9;
            } else {
                i = 1;
                if (length > 2 && Character.isLetter(charAt)) {
                    int i3 = length - 2;
                    if (Character.isLetter(str.charAt(i3))) {
                        try {
                            i = C4731bm.m13117a(str.substring(i3).toLowerCase(Locale.US));
                            length = i3;
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                        }
                    }
                }
            }
            try {
                return new C4779z(m13231G(str, length), i);
            } catch (NumberFormatException e) {
                throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
            }
        } else {
            throw new SAXException("Invalid length value (empty string)");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.a.a.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.a.a.z[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m13236c(com.p232a.p233a.C4706ao r11, java.lang.String r12, java.lang.String r13) {
        /*
            int r0 = r13.length()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "inherit"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            com.a.a.ch r0 = com.p232a.p233a.C4753ch.CLASS
            com.a.a.ci r0 = com.p232a.p233a.C4754ci.svg
            com.a.a.ch r0 = com.p232a.p233a.C4753ch.m13206a(r12)
            int r0 = r0.ordinal()
            java.lang.String r1 = "auto"
            r2 = 5
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L_0x05c0
            r5 = 2
            if (r0 == r5) goto L_0x05b1
            r6 = 4
            if (r0 == r6) goto L_0x05a2
            if (r0 == r2) goto L_0x0594
            r7 = 8
            if (r0 == r7) goto L_0x0565
            r7 = 35
            if (r0 == r7) goto L_0x0556
            r7 = 40
            if (r0 == r7) goto L_0x0544
            r7 = 42
            java.lang.String r8 = "visible"
            if (r0 == r7) goto L_0x0506
            r1 = 78
            java.lang.String r7 = "none"
            if (r0 == r1) goto L_0x04d9
            r1 = 58
            java.lang.String r9 = "currentColor"
            if (r0 == r1) goto L_0x04bd
            r1 = 59
            if (r0 == r1) goto L_0x04a8
            r1 = 74
            r10 = 3
            if (r0 == r1) goto L_0x0471
            r1 = 75
            if (r0 == r1) goto L_0x0428
            r1 = 124(0x7c, float:1.74E-43)
            r2 = -1
            java.lang.String r6 = "|"
            switch(r0) {
                case 14: goto L_0x03e7;
                case 15: goto L_0x03d7;
                case 16: goto L_0x03c9;
                case 17: goto L_0x03b7;
                case 18: goto L_0x02f8;
                case 19: goto L_0x02ea;
                case 20: goto L_0x02dc;
                case 21: goto L_0x02bb;
                case 22: goto L_0x029a;
                default: goto L_0x005e;
            }
        L_0x005e:
            switch(r0) {
                case 28: goto L_0x0285;
                case 29: goto L_0x0276;
                case 30: goto L_0x0267;
                case 31: goto L_0x0258;
                default: goto L_0x0061;
            }
        L_0x0061:
            java.lang.String r12 = "round"
            switch(r0) {
                case 62: goto L_0x023e;
                case 63: goto L_0x022b;
                case 64: goto L_0x021b;
                case 65: goto L_0x0184;
                case 66: goto L_0x0176;
                case 67: goto L_0x0142;
                case 68: goto L_0x010e;
                case 69: goto L_0x00fc;
                case 70: goto L_0x00ea;
                case 71: goto L_0x00dc;
                default: goto L_0x0066;
            }
        L_0x0066:
            switch(r0) {
                case 88: goto L_0x00c0;
                case 89: goto L_0x00ab;
                case 90: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x030f
        L_0x006b:
            int r12 = r13.indexOf(r1)
            if (r12 >= 0) goto L_0x009b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r13)
            r12.append(r6)
            java.lang.String r0 = "|visible|hidden|collapse|"
            java.lang.String r12 = r12.toString()
            int r12 = r0.indexOf(r12)
            if (r12 == r2) goto L_0x009b
            boolean r12 = r13.equals(r8)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11.f14803u = r12
            long r12 = r11.f14783a
            r0 = 33554432(0x2000000, double:1.6578092E-316)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x009b:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid value for \"visibility\" attribute: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x00ab:
            float r12 = m13238e(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14773C = r12
            long r12 = r11.f14783a
            r0 = 17179869184(0x400000000, double:8.4879831639E-314)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x00c0:
            boolean r12 = r13.equals(r9)
            if (r12 == 0) goto L_0x00cb
            com.a.a.r r12 = com.p232a.p233a.C4771r.f15115a
            r11.f14772B = r12
            goto L_0x00d1
        L_0x00cb:
            com.a.a.q r12 = m13240g(r13)
            r11.f14772B = r12
        L_0x00d1:
            long r12 = r11.f14783a
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x00dc:
            com.a.a.z r12 = m13235a(r13)
            r11.f14788f = r12
            long r12 = r11.f14783a
            r0 = 32
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x00ea:
            float r12 = m13238e(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14787e = r12
            long r12 = r11.f14783a
            r0 = 16
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x00fc:
            float r12 = m13237d(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14789g = r12
            long r12 = r11.f14783a
            r0 = 256(0x100, double:1.265E-321)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x010e:
            java.lang.String r0 = "miter"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0117
            goto L_0x0128
        L_0x0117:
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x011f
            r4 = 2
            goto L_0x0128
        L_0x011f:
            java.lang.String r12 = "bevel"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0132
            r4 = 3
        L_0x0128:
            r11.f14776F = r4
            long r12 = r11.f14783a
            r0 = 128(0x80, double:6.32E-322)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0132:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid stroke-linejoin property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0142:
            java.lang.String r0 = "butt"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x014b
            goto L_0x015c
        L_0x014b:
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0153
            r4 = 2
            goto L_0x015c
        L_0x0153:
            java.lang.String r12 = "square"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0166
            r4 = 3
        L_0x015c:
            r11.f14775E = r4
            long r12 = r11.f14783a
            r0 = 64
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0166:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid stroke-linecap property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0176:
            com.a.a.z r12 = m13235a(r13)
            r11.f14791i = r12
            long r12 = r11.f14783a
            r0 = 1024(0x400, double:5.06E-321)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0184:
            boolean r12 = r7.equals(r13)
            if (r12 == 0) goto L_0x018e
            r11.f14790h = r3
            goto L_0x0205
        L_0x018e:
            com.a.a.cj r12 = new com.a.a.cj
            r12.<init>(r13)
            r12.mo9652k()
            boolean r0 = r12.mo9655n()
            if (r0 == 0) goto L_0x019d
            goto L_0x0203
        L_0x019d:
            com.a.a.z r0 = r12.mo9647f()
            if (r0 != 0) goto L_0x01a4
            goto L_0x0203
        L_0x01a4:
            boolean r1 = r0.mo9685e()
            java.lang.String r2 = "Invalid stroke-dasharray. Dash segemnts cannot be negative: "
            if (r1 != 0) goto L_0x020d
            float r1 = r0.f15133a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r0)
        L_0x01b6:
            boolean r0 = r12.mo9655n()
            if (r0 != 0) goto L_0x01f0
            r12.mo9657p()
            com.a.a.z r0 = r12.mo9647f()
            if (r0 == 0) goto L_0x01e0
            boolean r5 = r0.mo9685e()
            if (r5 != 0) goto L_0x01d2
            r4.add(r0)
            float r0 = r0.f15133a
            float r1 = r1 + r0
            goto L_0x01b6
        L_0x01d2:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r2.concat(r12)
            r11.<init>(r12)
            throw r11
        L_0x01e0:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid stroke-dasharray. Non-Length content found: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x01f0:
            r12 = 0
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x01f6
            goto L_0x0203
        L_0x01f6:
            int r12 = r4.size()
            com.a.a.z[] r12 = new com.p232a.p233a.C4779z[r12]
            java.lang.Object[] r12 = r4.toArray(r12)
            r3 = r12
            com.a.a.z[] r3 = (com.p232a.p233a.C4779z[]) r3
        L_0x0203:
            r11.f14790h = r3
        L_0x0205:
            long r12 = r11.f14783a
            r0 = 512(0x200, double:2.53E-321)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x020d:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r2.concat(r12)
            r11.<init>(r12)
            throw r11
        L_0x021b:
            java.lang.String r12 = "stroke"
            com.a.a.ay r12 = m13244k(r13, r12)
            r11.f14786d = r12
            long r12 = r11.f14783a
            r0 = 8
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x022b:
            float r12 = m13238e(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14805w = r12
            long r12 = r11.f14783a
            r0 = 134217728(0x8000000, double:6.63123685E-316)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x023e:
            boolean r12 = r13.equals(r9)
            if (r12 == 0) goto L_0x0249
            com.a.a.r r12 = com.p232a.p233a.C4771r.f15115a
            r11.f14804v = r12
            goto L_0x024f
        L_0x0249:
            com.a.a.q r12 = m13240g(r13)
            r11.f14804v = r12
        L_0x024f:
            long r12 = r11.f14783a
            r0 = 67108864(0x4000000, double:3.31561842E-316)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0258:
            java.lang.String r12 = m13245l(r13, r12)
            r11.f14801s = r12
            long r12 = r11.f14783a
            r0 = 8388608(0x800000, double:4.144523E-317)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0267:
            java.lang.String r12 = m13245l(r13, r12)
            r11.f14800r = r12
            long r12 = r11.f14783a
            r0 = 4194304(0x400000, double:2.0722615E-317)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0276:
            java.lang.String r12 = m13245l(r13, r12)
            r11.f14799q = r12
            long r12 = r11.f14783a
            r0 = 2097152(0x200000, double:1.0361308E-317)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0285:
            java.lang.String r12 = m13245l(r13, r12)
            r11.f14799q = r12
            java.lang.String r12 = r11.f14799q
            r11.f14800r = r12
            r11.f14801s = r12
            long r12 = r11.f14783a
            r0 = 14680064(0xe00000, double:7.2529153E-317)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x029a:
            int r12 = m13259z(r13)
            if (r12 == 0) goto L_0x02ab
            r11.f14777G = r12
            long r12 = r11.f14783a
            r0 = 65536(0x10000, double:3.2379E-319)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x02ab:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid font-style property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x02bb:
            java.lang.Integer r12 = com.p232a.p233a.C4752cg.m13205a(r13)
            if (r12 == 0) goto L_0x02cc
            r11.f14796n = r12
            long r12 = r11.f14783a
            r0 = 32768(0x8000, double:1.61895E-319)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x02cc:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid font-weight property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x02dc:
            com.a.a.z r12 = m13241h(r13)
            r11.f14795m = r12
            long r12 = r11.f14783a
            r0 = 16384(0x4000, double:8.0948E-320)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x02ea:
            java.util.List r12 = m13246m(r13)
            r11.f14794l = r12
            long r12 = r11.f14783a
            r0 = 8192(0x2000, double:4.0474E-320)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x02f8:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r13)
            r12.append(r6)
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            java.lang.String r12 = r12.toString()
            int r12 = r0.indexOf(r12)
            if (r12 == r2) goto L_0x0310
        L_0x030f:
            return
        L_0x0310:
            com.a.a.cj r12 = new com.a.a.cj
            r12.<init>(r13)
            r13 = 0
            r0 = r3
            r2 = r0
            r1 = 0
        L_0x0319:
            r5 = 47
            java.lang.String r6 = r12.mo9651j(r5)
            r12.mo9652k()
            if (r6 == 0) goto L_0x03af
            if (r0 == 0) goto L_0x032b
            if (r1 == 0) goto L_0x0329
            goto L_0x0352
        L_0x0329:
            r7 = 0
            goto L_0x032c
        L_0x032b:
            r7 = r1
        L_0x032c:
            java.lang.String r8 = "normal"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0319
            if (r0 != 0) goto L_0x033c
            java.lang.Integer r0 = com.p232a.p233a.C4752cg.m13205a(r6)
            if (r0 != 0) goto L_0x0319
        L_0x033c:
            if (r7 != 0) goto L_0x0345
            int r1 = m13259z(r6)
            if (r1 != 0) goto L_0x0319
            goto L_0x0346
        L_0x0345:
            r1 = r7
        L_0x0346:
            if (r2 != 0) goto L_0x0352
            java.lang.String r2 = "small-caps"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0352
            r2 = r6
            goto L_0x0319
        L_0x0352:
            com.a.a.z r13 = m13241h(r6)
            boolean r2 = r12.mo9653l(r5)
            if (r2 == 0) goto L_0x0376
            r12.mo9652k()
            r2 = 32
            java.lang.String r2 = r12.mo9651j(r2)
            if (r2 == 0) goto L_0x036e
            m13235a(r2)
            r12.mo9652k()
            goto L_0x0376
        L_0x036e:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid font style attribute: missing line-height"
            r11.<init>(r12)
            throw r11
        L_0x0376:
            boolean r2 = r12.mo9655n()
            if (r2 == 0) goto L_0x037d
            goto L_0x0389
        L_0x037d:
            int r2 = r12.f15058b
            int r3 = r12.f15059c
            r12.f15058b = r3
            java.lang.String r12 = r12.f15057a
            java.lang.String r3 = r12.substring(r2)
        L_0x0389:
            java.util.List r12 = m13246m(r3)
            r11.f14794l = r12
            r11.f14795m = r13
            if (r0 != 0) goto L_0x0396
            r12 = 400(0x190, float:5.6E-43)
            goto L_0x039a
        L_0x0396:
            int r12 = r0.intValue()
        L_0x039a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.f14796n = r12
            if (r1 != 0) goto L_0x03a3
            goto L_0x03a4
        L_0x03a3:
            r4 = r1
        L_0x03a4:
            r11.f14777G = r4
            long r12 = r11.f14783a
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x03af:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid font style attribute: missing font size and family"
            r11.<init>(r12)
            throw r11
        L_0x03b7:
            float r12 = m13238e(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14785c = r12
            long r12 = r11.f14783a
            r0 = 4
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x03c9:
            int r12 = m13258y(r13)
            r11.f14774D = r12
            long r12 = r11.f14783a
            r0 = 2
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x03d7:
            java.lang.String r12 = "fill"
            com.a.a.ay r12 = m13244k(r13, r12)
            r11.f14784b = r12
            long r12 = r11.f14783a
            r0 = 1
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x03e7:
            int r12 = r13.indexOf(r1)
            if (r12 >= 0) goto L_0x0418
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r13)
            r12.append(r6)
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            java.lang.String r12 = r12.toString()
            int r12 = r0.indexOf(r12)
            if (r12 == r2) goto L_0x0418
            boolean r12 = r13.equals(r7)
            r12 = r12 ^ r4
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r11.f14802t = r12
            long r12 = r11.f14783a
            r0 = 16777216(0x1000000, double:8.289046E-317)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0418:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid value for \"display\" attribute: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0428:
            boolean r12 = r7.equals(r13)
            if (r12 == 0) goto L_0x0430
            r2 = 1
            goto L_0x0456
        L_0x0430:
            java.lang.String r12 = "underline"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x043a
            r2 = 2
            goto L_0x0456
        L_0x043a:
            java.lang.String r12 = "overline"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0444
            r2 = 3
            goto L_0x0456
        L_0x0444:
            java.lang.String r12 = "line-through"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x044e
            r2 = 4
            goto L_0x0456
        L_0x044e:
            java.lang.String r12 = "blink"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0461
        L_0x0456:
            r11.f14778H = r2
            long r12 = r11.f14783a
            r0 = 131072(0x20000, double:6.47582E-319)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0461:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid text-decoration property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0471:
            java.lang.String r12 = "start"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x047a
            goto L_0x048d
        L_0x047a:
            java.lang.String r12 = "middle"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0484
            r4 = 2
            goto L_0x048d
        L_0x0484:
            java.lang.String r12 = "end"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0498
            r4 = 3
        L_0x048d:
            r11.f14780J = r4
            long r12 = r11.f14783a
            r0 = 262144(0x40000, double:1.295163E-318)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0498:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid text-anchor property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x04a8:
            float r12 = m13238e(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14771A = r12
            long r12 = r11.f14783a
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x04bd:
            boolean r12 = r13.equals(r9)
            if (r12 == 0) goto L_0x04c8
            com.a.a.r r12 = com.p232a.p233a.C4771r.f15115a
            r11.f14808z = r12
            goto L_0x04ce
        L_0x04c8:
            com.a.a.q r12 = m13240g(r13)
            r11.f14808z = r12
        L_0x04ce:
            long r12 = r11.f14783a
            r0 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x04d9:
            boolean r12 = r7.equals(r13)
            if (r12 == 0) goto L_0x04e0
            goto L_0x04e9
        L_0x04e0:
            java.lang.String r12 = "non-scaling-stroke"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x04f6
            r4 = 2
        L_0x04e9:
            r11.f14782L = r4
            long r12 = r11.f14783a
            r0 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x04f6:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid vector-effect property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0506:
            boolean r12 = r8.equals(r13)
            if (r12 != 0) goto L_0x0537
            boolean r12 = r1.equals(r13)
            if (r12 == 0) goto L_0x0513
            goto L_0x0537
        L_0x0513:
            java.lang.String r12 = "hidden"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0534
            java.lang.String r12 = "scroll"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0524
            goto L_0x0534
        L_0x0524:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid toverflow property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0534:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x0539
        L_0x0537:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
        L_0x0539:
            r11.f14797o = r12
            long r12 = r11.f14783a
            r0 = 524288(0x80000, double:2.590327E-318)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0544:
            float r12 = m13238e(r13)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            r11.f14792j = r12
            long r12 = r11.f14783a
            r0 = 2048(0x800, double:1.0118E-320)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0556:
            java.lang.String r12 = m13245l(r13, r12)
            r11.f14807y = r12
            long r12 = r11.f14783a
            r0 = 1073741824(0x40000000, double:5.304989477E-315)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0565:
            java.lang.String r12 = "ltr"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x056e
            goto L_0x0577
        L_0x056e:
            java.lang.String r12 = "rtl"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0584
            r4 = 2
        L_0x0577:
            r11.f14779I = r4
            long r12 = r11.f14783a
            r0 = 68719476736(0x1000000000, double:3.39519326554E-313)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0584:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid direction property: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0594:
            com.a.a.q r12 = m13240g(r13)
            r11.f14793k = r12
            long r12 = r11.f14783a
            r0 = 4096(0x1000, double:2.0237E-320)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x05a2:
            int r12 = m13258y(r13)
            r11.f14781K = r12
            long r12 = r11.f14783a
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x05b1:
            java.lang.String r12 = m13245l(r13, r12)
            r11.f14806x = r12
            long r12 = r11.f14783a
            r0 = 268435456(0x10000000, double:1.32624737E-315)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x05c0:
            boolean r12 = r1.equals(r13)
            if (r12 == 0) goto L_0x05c7
            goto L_0x060b
        L_0x05c7:
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = r13.toLowerCase(r12)
            java.lang.String r0 = "rect("
            boolean r12 = r12.startsWith(r0)
            if (r12 == 0) goto L_0x0626
            com.a.a.cj r12 = new com.a.a.cj
            java.lang.String r0 = r13.substring(r2)
            r12.<init>(r0)
            r12.mo9652k()
            com.a.a.z r0 = m13242i(r12)
            r12.mo9657p()
            com.a.a.z r1 = m13242i(r12)
            r12.mo9657p()
            com.a.a.z r2 = m13242i(r12)
            r12.mo9657p()
            com.a.a.z r3 = m13242i(r12)
            r12.mo9652k()
            r4 = 41
            boolean r12 = r12.mo9653l(r4)
            if (r12 == 0) goto L_0x0616
            com.a.a.n r12 = new com.a.a.n
            r12.<init>(r0, r1, r2, r3)
            r3 = r12
        L_0x060b:
            r11.f14798p = r3
            long r12 = r11.f14783a
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r12 = r12 | r0
            r11.f14783a = r12
            return
        L_0x0616:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Bad rect() clip definition: "
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r12 = r12.concat(r13)
            r11.<init>(r12)
            throw r11
        L_0x0626:
            org.xml.sax.SAXException r11 = new org.xml.sax.SAXException
            java.lang.String r12 = "Invalid clip attribute shape. Only rect() is supported."
            r11.<init>(r12)
            goto L_0x062f
        L_0x062e:
            throw r11
        L_0x062f:
            goto L_0x062e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4756ck.m13236c(com.a.a.ao, java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    private static float m13237d(String str) {
        int length = str.length();
        if (length != 0) {
            return m13231G(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    /* renamed from: e */
    private static float m13238e(String str) {
        float d = m13237d(str);
        if (d < 0.0f) {
            return 0.0f;
        }
        if (d > 1.0f) {
            return 1.0f;
        }
        return d;
    }

    /* renamed from: f */
    private static int m13239f(float f) {
        if (f < 0.0f) {
            return 0;
        }
        return f > 255.0f ? PrivateKeyType.INVALID : Math.round(f);
    }

    /* renamed from: g */
    private static C4770q m13240g(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            C4762i iVar = null;
            if (length > 1) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt < 'A' || charAt > 'F') {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        } else {
                            j = j2 * 16;
                            i = charAt - 'A';
                        }
                        j2 = j + ((long) i) + 10;
                    } else {
                        j2 = (j2 * 16) + ((long) (charAt - '0'));
                    }
                    if (j2 > 4294967295L) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    iVar = new C4762i(j2, i2);
                }
            }
            if (iVar != null) {
                int i3 = iVar.f15081a;
                if (i3 == 7) {
                    return new C4770q((int) iVar.f15082b);
                }
                if (i3 == 4) {
                    int i4 = (int) iVar.f15082b;
                    int i5 = i4 & 3840;
                    int i6 = i4 & 240;
                    int i7 = i4 & 15;
                    return new C4770q(i7 | (i5 << 8) | (i5 << 12) | -16777216 | (i6 << 8) | (i6 << 4) | (i7 << 4));
                }
                throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
            }
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        } else if (str.toLowerCase(Locale.US).startsWith("rgb(")) {
            C4755cj cjVar = new C4755cj(str.substring(4));
            cjVar.mo9652k();
            float c = cjVar.mo9644c();
            if (!Float.isNaN(c) && cjVar.mo9653l('%')) {
                c = (c * 256.0f) / 100.0f;
            }
            float b = cjVar.mo9643b(c);
            if (!Float.isNaN(b) && cjVar.mo9653l('%')) {
                b = (b * 256.0f) / 100.0f;
            }
            float b2 = cjVar.mo9643b(b);
            if (!Float.isNaN(b2) && cjVar.mo9653l('%')) {
                b2 = (b2 * 256.0f) / 100.0f;
            }
            cjVar.mo9652k();
            if (!Float.isNaN(b2) && cjVar.mo9653l(')')) {
                return new C4770q((m13239f(c) << 16) | (m13239f(b) << 8) | m13239f(b2));
            }
            throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
        } else {
            Integer num = (Integer) C4750ce.f14926a.get(str.toLowerCase(Locale.US));
            if (num != null) {
                return new C4770q(num.intValue());
            }
            throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: h */
    private static C4779z m13241h(String str) {
        C4779z zVar = (C4779z) C4751cf.f14927a.get(str);
        return zVar == null ? m13235a(str) : zVar;
    }

    /* renamed from: i */
    private static C4779z m13242i(C4755cj cjVar) {
        if (cjVar.mo9654m("auto")) {
            return new C4779z(0.0f);
        }
        return cjVar.mo9647f();
    }

    /* renamed from: j */
    private static C4716ay m13243j(String str) {
        if (str.equals("none")) {
            return null;
        }
        if (str.equals("currentColor")) {
            return C4771r.f15115a;
        }
        return m13240g(str);
    }

    /* renamed from: k */
    private static C4716ay m13244k(String str, String str2) {
        if (!str.startsWith("url(")) {
            return m13243j(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf != -1) {
            String trim = str.substring(4, indexOf).trim();
            String trim2 = str.substring(indexOf + 1).trim();
            return new C4696ae(trim, trim2.length() > 0 ? m13243j(trim2) : null);
        }
        throw new SAXException("Bad " + str2 + " attribute. Unterminated url() reference");
    }

    /* renamed from: l */
    private static String m13245l(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException("Bad " + str2 + " attribute. Expected \"none\" or \"url()\" format");
    }

    /* renamed from: m */
    private static List m13246m(String str) {
        C4755cj cjVar = new C4755cj(str);
        ArrayList arrayList = null;
        do {
            String i = cjVar.mo9650i();
            if (i == null) {
                i = cjVar.mo9651j(',');
            }
            if (i == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(i);
            cjVar.mo9657p();
        } while (!cjVar.mo9655n());
        return arrayList;
    }

    /* renamed from: n */
    private static List m13247n(String str) {
        if (str.length() != 0) {
            ArrayList arrayList = new ArrayList(1);
            C4755cj cjVar = new C4755cj(str);
            cjVar.mo9652k();
            while (!cjVar.mo9655n()) {
                float c = cjVar.mo9644c();
                if (Float.isNaN(c)) {
                    int i = cjVar.f15058b;
                    while (!cjVar.mo9655n() && !C4755cj.m13208r(cjVar.f15057a.charAt(cjVar.f15058b))) {
                        cjVar.f15058b++;
                    }
                    String substring = cjVar.f15057a.substring(i, cjVar.f15058b);
                    cjVar.f15058b = i;
                    throw new SAXException("Invalid length list value: ".concat(String.valueOf(substring)));
                }
                int q = cjVar.mo9658q();
                if (q == 0) {
                    q = 1;
                }
                arrayList.add(new C4779z(c, q));
                cjVar.mo9657p();
            }
            return arrayList;
        }
        throw new SAXException("Invalid length list (empty string)");
    }

    /* renamed from: o */
    private final void m13248o(Attributes attributes) {
        C4711at atVar = this.f15062b;
        if (atVar != null) {
            C4768o oVar = new C4768o();
            oVar.f14833t = this.f15061a;
            oVar.f14834u = atVar;
            m13226B(oVar, attributes);
            m13228D(oVar, attributes);
            m13234J(oVar, attributes);
            m13225A(oVar, attributes);
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                C4753ch chVar = C4753ch.CLASS;
                C4754ci ciVar = C4754ci.svg;
                int ordinal = C4753ch.m13206a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 6) {
                    oVar.f15109a = m13235a(trim);
                } else if (ordinal == 7) {
                    oVar.f15110b = m13235a(trim);
                } else if (ordinal != 49) {
                    continue;
                } else {
                    oVar.f15111c = m13235a(trim);
                    if (oVar.f15111c.mo9685e()) {
                        throw new SAXException("Invalid <circle> element. r cannot be negative");
                    }
                }
            }
            this.f15062b.mo9601b(oVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: p */
    private final void m13249p(Attributes attributes) {
        if (this.f15062b != null) {
            C4769p pVar = new C4769p();
            pVar.f14833t = this.f15061a;
            pVar.f14834u = this.f15062b;
            m13226B(pVar, attributes);
            m13228D(pVar, attributes);
            m13234J(pVar, attributes);
            m13225A(pVar, attributes);
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                C4753ch chVar = C4753ch.CLASS;
                C4754ci ciVar = C4754ci.svg;
                if (C4753ch.m13206a(attributes.getLocalName(i)).ordinal() == 3) {
                    if ("objectBoundingBox".equals(trim)) {
                        pVar.f15112a = false;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        pVar.f15112a = true;
                    } else {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
                }
            }
            this.f15062b.mo9601b(pVar);
            this.f15062b = pVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: q */
    private final void m13250q(Attributes attributes) {
        if (this.f15062b != null) {
            C4772s sVar = new C4772s();
            sVar.f14833t = this.f15061a;
            sVar.f14834u = this.f15062b;
            m13226B(sVar, attributes);
            m13228D(sVar, attributes);
            m13234J(sVar, attributes);
            this.f15062b.mo9601b(sVar);
            this.f15062b = sVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: r */
    private final void m13251r(Attributes attributes) {
        C4711at atVar = this.f15062b;
        if (atVar != null) {
            C4773t tVar = new C4773t();
            tVar.f14833t = this.f15061a;
            tVar.f14834u = atVar;
            m13226B(tVar, attributes);
            m13228D(tVar, attributes);
            m13234J(tVar, attributes);
            m13225A(tVar, attributes);
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                C4753ch chVar = C4753ch.CLASS;
                C4754ci ciVar = C4754ci.svg;
                int ordinal = C4753ch.m13206a(attributes.getLocalName(i)).ordinal();
                if (ordinal == 6) {
                    tVar.f15116a = m13235a(trim);
                } else if (ordinal == 7) {
                    tVar.f15117b = m13235a(trim);
                } else if (ordinal == 56) {
                    tVar.f15118c = m13235a(trim);
                    if (tVar.f15118c.mo9685e()) {
                        throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                    }
                } else if (ordinal != 57) {
                    continue;
                } else {
                    tVar.f15119d = m13235a(trim);
                    if (tVar.f15119d.mo9685e()) {
                        throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                    }
                }
            }
            this.f15062b.mo9601b(tVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* renamed from: s */
    private final void m13252s(Attributes attributes) {
        if (this.f15062b != null) {
            C4776w wVar = new C4776w();
            wVar.f14833t = this.f15061a;
            wVar.f14834u = this.f15062b;
            m13226B(wVar, attributes);
            m13228D(wVar, attributes);
            m13234J(wVar, attributes);
            m13225A(wVar, attributes);
            this.f15062b.mo9601b(wVar);
            this.f15062b = wVar;
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        continue;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13253t(org.xml.sax.Attributes r6) {
        /*
            r5 = this;
            com.a.a.at r0 = r5.f15062b
            if (r0 == 0) goto L_0x00a5
            com.a.a.y r0 = new com.a.a.y
            r0.<init>()
            com.a.a.bp r1 = r5.f15061a
            r0.f14833t = r1
            com.a.a.at r1 = r5.f15062b
            r0.f14834u = r1
            m13226B(r0, r6)
            m13228D(r0, r6)
            m13234J(r0, r6)
            m13225A(r0, r6)
            r1 = 0
        L_0x001e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L_0x009d
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.CLASS
            com.a.a.ci r3 = com.p232a.p233a.C4754ci.svg
            java.lang.String r3 = r6.getLocalName(r1)
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.m13206a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x0084
            r4 = 26
            if (r3 == r4) goto L_0x0075
            r4 = 48
            if (r3 == r4) goto L_0x0071
            switch(r3) {
                case 81: goto L_0x005a;
                case 82: goto L_0x0053;
                case 83: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0092
        L_0x004c:
            com.a.a.z r2 = m13235a(r2)
            r0.f15129c = r2
            goto L_0x0092
        L_0x0053:
            com.a.a.z r2 = m13235a(r2)
            r0.f15128b = r2
            goto L_0x0092
        L_0x005a:
            com.a.a.z r2 = m13235a(r2)
            r0.f15130d = r2
            com.a.a.z r2 = r0.f15130d
            boolean r2 = r2.mo9685e()
            if (r2 != 0) goto L_0x0069
            goto L_0x0092
        L_0x0069:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x0071:
            m13257x(r0, r2)
            goto L_0x0092
        L_0x0075:
            java.lang.String r3 = "http://www.w3.org/1999/xlink"
            java.lang.String r4 = r6.getURI(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0092
            r0.f15127a = r2
            goto L_0x0092
        L_0x0084:
            com.a.a.z r2 = m13235a(r2)
            r0.f15131e = r2
            com.a.a.z r2 = r0.f15131e
            boolean r2 = r2.mo9685e()
            if (r2 != 0) goto L_0x0095
        L_0x0092:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x0095:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L_0x009d:
            com.a.a.at r6 = r5.f15062b
            r6.mo9601b(r0)
            r5.f15062b = r0
            return
        L_0x00a5:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            goto L_0x00ae
        L_0x00ad:
            throw r6
        L_0x00ae:
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4756ck.m13253t(org.xml.sax.Attributes):void");
    }

    /* renamed from: u */
    private final void m13254u(Attributes attributes) {
        C4711at atVar = this.f15062b;
        if (atVar != null) {
            C4692aa aaVar = new C4692aa();
            aaVar.f14833t = this.f15061a;
            aaVar.f14834u = atVar;
            m13226B(aaVar, attributes);
            m13228D(aaVar, attributes);
            m13234J(aaVar, attributes);
            m13225A(aaVar, attributes);
            for (int i = 0; i < attributes.getLength(); i++) {
                String trim = attributes.getValue(i).trim();
                C4753ch chVar = C4753ch.CLASS;
                C4754ci ciVar = C4754ci.svg;
                switch (C4753ch.m13206a(attributes.getLocalName(i)).ordinal()) {
                    case 84:
                        aaVar.f14735a = m13235a(trim);
                        break;
                    case 85:
                        aaVar.f14736b = m13235a(trim);
                        break;
                    case 86:
                        aaVar.f14737c = m13235a(trim);
                        break;
                    case 87:
                        aaVar.f14738d = m13235a(trim);
                        break;
                }
            }
            this.f15062b.mo9601b(aaVar);
            return;
        }
        throw new SAXException("Invalid document. Root element must be <svg>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c4, code lost:
        continue;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13255v(org.xml.sax.Attributes r7) {
        /*
            r6 = this;
            com.a.a.at r0 = r6.f15062b
            if (r0 == 0) goto L_0x00d0
            com.a.a.ab r0 = new com.a.a.ab
            r0.<init>()
            com.a.a.bp r1 = r6.f15061a
            r0.f14833t = r1
            com.a.a.at r1 = r6.f15062b
            r0.f14834u = r1
            m13226B(r0, r7)
            m13228D(r0, r7)
            m13225A(r0, r7)
            m13230F(r0, r7)
            r1 = 0
            r2 = 0
        L_0x001f:
            int r3 = r7.getLength()
            if (r2 >= r3) goto L_0x00c8
            java.lang.String r3 = r7.getValue(r2)
            java.lang.String r3 = r3.trim()
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.CLASS
            com.a.a.ci r4 = com.p232a.p233a.C4754ci.svg
            java.lang.String r4 = r7.getLocalName(r2)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            r5 = 41
            if (r4 == r5) goto L_0x00a9
            r5 = 50
            if (r4 == r5) goto L_0x00a2
            r5 = 51
            if (r4 == r5) goto L_0x009b
            switch(r4) {
                case 32: goto L_0x0084;
                case 33: goto L_0x0065;
                case 34: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00c4
        L_0x004e:
            com.a.a.z r3 = m13235a(r3)
            r0.f14742d = r3
            com.a.a.z r3 = r0.f14742d
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x005d
            goto L_0x00c4
        L_0x005d:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            r7.<init>(r0)
            throw r7
        L_0x0065:
            java.lang.String r4 = "strokeWidth"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0070
            r0.f14739a = r1
            goto L_0x00c4
        L_0x0070:
            java.lang.String r4 = "userSpaceOnUse"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x007c
            r3 = 1
            r0.f14739a = r3
            goto L_0x00c4
        L_0x007c:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            r7.<init>(r0)
            throw r7
        L_0x0084:
            com.a.a.z r3 = m13235a(r3)
            r0.f14743e = r3
            com.a.a.z r3 = r0.f14743e
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x0093
            goto L_0x00c4
        L_0x0093:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            r7.<init>(r0)
            throw r7
        L_0x009b:
            com.a.a.z r3 = m13235a(r3)
            r0.f14741c = r3
            goto L_0x00c4
        L_0x00a2:
            com.a.a.z r3 = m13235a(r3)
            r0.f14740b = r3
            goto L_0x00c4
        L_0x00a9:
            java.lang.String r4 = "auto"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x00ba
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f14744f = r3
            goto L_0x00c4
        L_0x00ba:
            float r3 = m13237d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f14744f = r3
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x00c8:
            com.a.a.at r7 = r6.f15062b
            r7.mo9601b(r0)
            r6.f15062b = r0
            return
        L_0x00d0:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r7.<init>(r0)
            goto L_0x00d9
        L_0x00d8:
            throw r7
        L_0x00d9:
            goto L_0x00d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4756ck.m13255v(org.xml.sax.Attributes):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        continue;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13256w(org.xml.sax.Attributes r8) {
        /*
            r7 = this;
            com.a.a.at r0 = r7.f15062b
            if (r0 == 0) goto L_0x00b8
            com.a.a.ac r0 = new com.a.a.ac
            r0.<init>()
            com.a.a.bp r1 = r7.f15061a
            r0.f14833t = r1
            com.a.a.at r1 = r7.f15062b
            r0.f14834u = r1
            m13226B(r0, r8)
            m13228D(r0, r8)
            m13225A(r0, r8)
            r1 = 0
        L_0x001b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto L_0x00b0
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.CLASS
            com.a.a.ci r3 = com.p232a.p233a.C4754ci.svg
            java.lang.String r3 = r8.getLocalName(r1)
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.m13206a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L_0x0096
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L_0x0081
            r4 = 37
            if (r3 == r4) goto L_0x006c
            switch(r3) {
                case 81: goto L_0x0055;
                case 82: goto L_0x0051;
                case 83: goto L_0x004d;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00a4
        L_0x004d:
            m13235a(r2)
            goto L_0x00a4
        L_0x0051:
            m13235a(r2)
            goto L_0x00a4
        L_0x0055:
            com.a.a.z r2 = m13235a(r2)
            r0.f14745a = r2
            com.a.a.z r2 = r0.f14745a
            boolean r2 = r2.mo9685e()
            if (r2 != 0) goto L_0x0064
            goto L_0x00a4
        L_0x0064:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L_0x006c:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto L_0x00a4
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0079
            goto L_0x00a4
        L_0x0079:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L_0x0081:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto L_0x00a4
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x008e
            goto L_0x00a4
        L_0x008e:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L_0x0096:
            com.a.a.z r2 = m13235a(r2)
            r0.f14746b = r2
            com.a.a.z r2 = r0.f14746b
            boolean r2 = r2.mo9685e()
            if (r2 != 0) goto L_0x00a8
        L_0x00a4:
            int r1 = r1 + 1
            goto L_0x001b
        L_0x00a8:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        L_0x00b0:
            com.a.a.at r8 = r7.f15062b
            r8.mo9601b(r0)
            r7.f15062b = r0
            return
        L_0x00b8:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            goto L_0x00c1
        L_0x00c0:
            throw r8
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4756ck.m13256w(org.xml.sax.Attributes):void");
    }

    /* renamed from: x */
    private static void m13257x(C4717az azVar, String str) {
        int i;
        C4755cj cjVar = new C4755cj(str);
        cjVar.mo9652k();
        String j = cjVar.mo9651j(' ');
        if ("defer".equals(j)) {
            cjVar.mo9652k();
            j = cjVar.mo9651j(' ');
        }
        C4764k kVar = (C4764k) C4749cd.f14925a.get(j);
        cjVar.mo9652k();
        if (!cjVar.mo9655n()) {
            String j2 = cjVar.mo9651j(' ');
            if (j2.equals("meet")) {
                i = 1;
            } else if (j2.equals("slice")) {
                i = 2;
            } else {
                throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
            }
        } else {
            i = 0;
        }
        azVar.f14835v = new C4765l(kVar, i);
    }

    /* renamed from: y */
    private static int m13258y(String str) {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    /* renamed from: z */
    private static int m13259z(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C4734bp mo9659b(GZIPInputStream gZIPInputStream) {
        if (!gZIPInputStream.markSupported()) {
            gZIPInputStream = new BufferedInputStream(gZIPInputStream);
        }
        try {
            gZIPInputStream.mark(3);
            int read = gZIPInputStream.read() + (gZIPInputStream.read() << 8);
            gZIPInputStream.reset();
            if (read == 35615) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        try {
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            xMLReader.setContentHandler(this);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
            xMLReader.parse(new InputSource(gZIPInputStream));
            try {
                gZIPInputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
            return this.f15061a;
        } catch (IOException e) {
            throw new C4748cc("File error", e);
        } catch (ParserConfigurationException e2) {
            throw new C4748cc("XML Parser problem", e2);
        } catch (SAXException e3) {
            String message = e3.getMessage();
            throw new C4748cc("SVG parse error: " + message, e3);
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (IOException unused3) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
            throw th;
        }
    }

    public final void characters(char[] cArr, int i, int i2) {
        C4715ax axVar;
        if (!this.f15063c) {
            if (this.f15065e) {
                if (this.f15067g == null) {
                    this.f15067g = new StringBuilder(i2);
                }
                this.f15067g.append(cArr, i, i2);
            } else if (this.f15068h) {
                if (this.f15069i == null) {
                    this.f15069i = new StringBuilder(i2);
                }
                this.f15069i.append(cArr, i, i2);
            } else {
                C4711at atVar = this.f15062b;
                if (atVar instanceof C4727bi) {
                    C4709ar arVar = (C4709ar) atVar;
                    int size = arVar.f14813i.size();
                    if (size == 0) {
                        axVar = null;
                    } else {
                        axVar = (C4715ax) arVar.f14813i.get(size - 1);
                    }
                    if (axVar instanceof C4730bl) {
                        C4730bl blVar = (C4730bl) axVar;
                        String str = blVar.f14853a;
                        blVar.f14853a = String.valueOf(str).concat(new String(cArr, i, i2));
                        return;
                    }
                    ((C4709ar) this.f15062b).mo9601b(new C4730bl(new String(cArr, i, i2)));
                }
            }
        }
    }

    public final void comment(char[] cArr, int i, int i2) {
        if (!this.f15063c && this.f15068h) {
            if (this.f15069i == null) {
                this.f15069i = new StringBuilder(i2);
            }
            this.f15069i.append(cArr, i, i2);
        }
    }

    public final void endDocument() {
    }

    public final void endElement(String str, String str2, String str3) {
        if (this.f15063c) {
            int i = this.f15064d - 1;
            this.f15064d = i;
            if (i == 0) {
                this.f15063c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || BuildConfig.FLAVOR.equals(str)) {
            C4753ch chVar = C4753ch.CLASS;
            switch (C4754ci.m13207a(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f15062b = ((C4715ax) this.f15062b).f14834u;
                    return;
                case 5:
                case 26:
                    this.f15065e = false;
                    C4754ci ciVar = this.f15066f;
                    if (ciVar == C4754ci.title) {
                        this.f15067g.toString();
                    } else if (ciVar == C4754ci.desc) {
                        this.f15067g.toString();
                    }
                    this.f15067g.setLength(0);
                    return;
                case 21:
                    StringBuilder sb = this.f15069i;
                    if (sb != null) {
                        this.f15068h = false;
                        String sb2 = sb.toString();
                        C4761h hVar = new C4761h(C4745c.screen);
                        C4734bp bpVar = this.f15061a;
                        C4718b bVar = new C4718b(sb2);
                        bVar.mo9652k();
                        bpVar.f14860b.mo9667a(hVar.mo9676a(bVar));
                        this.f15069i.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void startDocument() {
        this.f15061a = new C4734bp();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x00ec, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x046b, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0632, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0aa2, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void startElement(java.lang.String r24, java.lang.String r25, java.lang.String r26, org.xml.sax.Attributes r27) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r27
            boolean r3 = r1.f15063c
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r3 == 0) goto L_0x0015
            int r0 = r1.f15064d
            int r0 = r0 + r4
            r1.f15064d = r0
            return
        L_0x0015:
            java.lang.String r3 = "http://www.w3.org/2000/svg"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0027
            java.lang.String r3 = ""
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            return
        L_0x0027:
            com.a.a.ci r0 = com.p232a.p233a.C4754ci.m13207a(r25)
            com.a.a.ch r3 = com.p232a.p233a.C4753ch.CLASS
            int r3 = r0.ordinal()
            r6 = 77
            java.lang.String r7 = "http://www.w3.org/1999/xlink"
            r8 = 26
            r9 = 25
            r10 = 0
            r11 = 0
            java.lang.String r12 = "Invalid document. Root element must be <svg>"
            switch(r3) {
                case 0: goto L_0x0a35;
                case 1: goto L_0x0a30;
                case 2: goto L_0x0a2b;
                case 3: goto L_0x0a26;
                case 4: goto L_0x0a21;
                case 5: goto L_0x0a1c;
                case 6: goto L_0x0a17;
                case 7: goto L_0x0a30;
                case 8: goto L_0x0a12;
                case 9: goto L_0x0a0d;
                case 10: goto L_0x09a8;
                case 11: goto L_0x09a3;
                case 12: goto L_0x099e;
                case 13: goto L_0x064c;
                case 14: goto L_0x0565;
                case 15: goto L_0x0539;
                case 16: goto L_0x050d;
                case 17: goto L_0x0483;
                case 18: goto L_0x03c7;
                case 19: goto L_0x03a4;
                case 20: goto L_0x0301;
                case 21: goto L_0x02b6;
                case 22: goto L_0x028b;
                case 23: goto L_0x0260;
                case 24: goto L_0x0232;
                case 25: goto L_0x01c0;
                case 26: goto L_0x0a1c;
                case 27: goto L_0x014f;
                case 28: goto L_0x0105;
                case 29: goto L_0x006d;
                case 30: goto L_0x0045;
                default: goto L_0x0040;
            }
        L_0x0040:
            r1.f15063c = r4
            r1.f15064d = r4
            return
        L_0x0045:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0067
            com.a.a.bo r0 = new com.a.a.bo
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13225A(r0, r2)
            m13230F(r0, r2)
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x0067:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x006d:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x00ff
            com.a.a.bn r0 = new com.a.a.bn
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13234J(r0, r2)
            m13225A(r0, r2)
        L_0x008a:
            int r3 = r27.getLength()
            if (r10 >= r3) goto L_0x00f7
            java.lang.String r3 = r2.getValue(r10)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            if (r4 == r9) goto L_0x00de
            if (r4 == r8) goto L_0x00d1
            switch(r4) {
                case 81: goto L_0x00ba;
                case 82: goto L_0x00b3;
                case 83: goto L_0x00ac;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            goto L_0x00ec
        L_0x00ac:
            com.a.a.z r3 = m13235a(r3)
            r0.f14856d = r3
            goto L_0x00ec
        L_0x00b3:
            com.a.a.z r3 = m13235a(r3)
            r0.f14855c = r3
            goto L_0x00ec
        L_0x00ba:
            com.a.a.z r3 = m13235a(r3)
            r0.f14857e = r3
            com.a.a.z r3 = r0.f14857e
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x00c9
            goto L_0x00ec
        L_0x00c9:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <use> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00d1:
            java.lang.String r4 = r2.getURI(r10)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x00ec
            r0.f14854a = r3
            goto L_0x00ec
        L_0x00de:
            com.a.a.z r3 = m13235a(r3)
            r0.f14858f = r3
            com.a.a.z r3 = r0.f14858f
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x00ef
        L_0x00ec:
            int r10 = r10 + 1
            goto L_0x008a
        L_0x00ef:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <use> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x00f7:
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x00ff:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0105:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0149
            boolean r0 = r0 instanceof com.p232a.p233a.C4727bi
            if (r0 == 0) goto L_0x0141
            com.a.a.bf r0 = new com.a.a.bf
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13225A(r0, r2)
            m13229E(r0, r2)
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            com.a.a.at r2 = r0.f14834u
            boolean r3 = r2 instanceof com.p232a.p233a.C4725bg
            if (r3 == 0) goto L_0x0138
            com.a.a.bg r2 = (com.p232a.p233a.C4725bg) r2
            r0.f14844a = r2
            return
        L_0x0138:
            com.a.a.bh r2 = (com.p232a.p233a.C4726bh) r2
            com.a.a.bg r2 = r2.mo9616m()
            r0.f14844a = r2
            return
        L_0x0141:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x0149:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x014f:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r0 instanceof com.p232a.p233a.C4727bi
            if (r0 == 0) goto L_0x01b2
            com.a.a.be r0 = new com.a.a.be
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13225A(r0, r2)
        L_0x016d:
            int r3 = r27.getLength()
            if (r10 >= r3) goto L_0x0199
            java.lang.String r3 = r2.getValue(r10)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            if (r4 == r8) goto L_0x018a
            goto L_0x0196
        L_0x018a:
            java.lang.String r4 = r2.getURI(r10)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0196
            r0.f14842a = r3
        L_0x0196:
            int r10 = r10 + 1
            goto L_0x016d
        L_0x0199:
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            com.a.a.at r2 = r0.f14834u
            boolean r3 = r2 instanceof com.p232a.p233a.C4725bg
            if (r3 == 0) goto L_0x01a9
            com.a.a.bg r2 = (com.p232a.p233a.C4725bg) r2
            r0.f14843b = r2
            return
        L_0x01a9:
            com.a.a.bh r2 = (com.p232a.p233a.C4726bh) r2
            com.a.a.bg r2 = r2.mo9616m()
            r0.f14843b = r2
            return
        L_0x01b2:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            r0.<init>(r2)
            throw r0
        L_0x01ba:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x01c0:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x022c
            com.a.a.bj r0 = new com.a.a.bj
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13225A(r0, r2)
        L_0x01da:
            int r3 = r27.getLength()
            if (r10 >= r3) goto L_0x0211
            java.lang.String r3 = r2.getValue(r10)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            if (r4 == r8) goto L_0x0202
            r5 = 61
            if (r4 == r5) goto L_0x01fb
            goto L_0x020e
        L_0x01fb:
            com.a.a.z r3 = m13235a(r3)
            r0.f14847b = r3
            goto L_0x020e
        L_0x0202:
            java.lang.String r4 = r2.getURI(r10)
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x020e
            r0.f14846a = r3
        L_0x020e:
            int r10 = r10 + 1
            goto L_0x01da
        L_0x0211:
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            com.a.a.at r2 = r0.f14834u
            boolean r3 = r2 instanceof com.p232a.p233a.C4725bg
            if (r3 == 0) goto L_0x0223
            com.a.a.bg r2 = (com.p232a.p233a.C4725bg) r2
            r0.f14848c = r2
            return
        L_0x0223:
            com.a.a.bh r2 = (com.p232a.p233a.C4726bh) r2
            com.a.a.bg r2 = r2.mo9616m()
            r0.f14848c = r2
            return
        L_0x022c:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0232:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x025a
            com.a.a.bg r0 = new com.a.a.bg
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13234J(r0, r2)
            m13225A(r0, r2)
            m13229E(r0, r2)
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x025a:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0260:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0285
            com.a.a.bd r0 = new com.a.a.bd
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13225A(r0, r2)
            m13230F(r0, r2)
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x0285:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x028b:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x02b0
            com.a.a.bc r0 = new com.a.a.bc
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13234J(r0, r2)
            m13225A(r0, r2)
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x02b0:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x02b6:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x02fb
            java.lang.String r0 = "all"
            r3 = 1
        L_0x02bd:
            int r5 = r27.getLength()
            if (r10 >= r5) goto L_0x02e9
            java.lang.String r5 = r2.getValue(r10)
            java.lang.String r5 = r5.trim()
            java.lang.String r7 = r2.getLocalName(r10)
            com.a.a.ch r7 = com.p232a.p233a.C4753ch.m13206a(r7)
            int r7 = r7.ordinal()
            r8 = 38
            if (r7 == r8) goto L_0x02e5
            if (r7 == r6) goto L_0x02de
            goto L_0x02e6
        L_0x02de:
            java.lang.String r3 = "text/css"
            boolean r3 = r5.equals(r3)
            goto L_0x02e6
        L_0x02e5:
            r0 = r5
        L_0x02e6:
            int r10 = r10 + 1
            goto L_0x02bd
        L_0x02e9:
            if (r3 == 0) goto L_0x02f6
            com.a.a.c r2 = com.p232a.p233a.C4745c.screen
            boolean r0 = com.p232a.p233a.C4761h.m13267b(r0, r2)
            if (r0 == 0) goto L_0x02f6
            r1.f15068h = r4
            return
        L_0x02f6:
            r1.f15063c = r4
            r1.f15064d = r4
            return
        L_0x02fb:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0301:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x039e
            boolean r3 = r0 instanceof com.p232a.p233a.C4774u
            if (r3 == 0) goto L_0x0396
            com.a.a.an r3 = new com.a.a.an
            r3.<init>()
            com.a.a.bp r5 = r1.f15061a
            r3.f14833t = r5
            r3.f14834u = r0
            m13226B(r3, r2)
            m13228D(r3, r2)
            r0 = 0
        L_0x031b:
            int r5 = r27.getLength()
            if (r0 >= r5) goto L_0x038e
            java.lang.String r5 = r2.getValue(r0)
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = r2.getLocalName(r0)
            com.a.a.ch r6 = com.p232a.p233a.C4753ch.m13206a(r6)
            int r6 = r6.ordinal()
            r7 = 39
            if (r6 == r7) goto L_0x033a
            goto L_0x0372
        L_0x033a:
            int r6 = r5.length()
            if (r6 == 0) goto L_0x0386
            int r6 = r5.length()
            int r7 = r5.length()
            int r7 = r7 + -1
            char r7 = r5.charAt(r7)
            r8 = 37
            if (r7 != r8) goto L_0x0356
            int r6 = r6 + -1
            r7 = 1
            goto L_0x0357
        L_0x0356:
            r7 = 0
        L_0x0357:
            float r6 = m13231G(r5, r6)     // Catch:{ NumberFormatException -> 0x0375 }
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r7 == 0) goto L_0x0360
            float r6 = r6 / r8
        L_0x0360:
            int r7 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x0366
            r8 = 0
            goto L_0x036c
        L_0x0366:
            int r7 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x036b
            goto L_0x036c
        L_0x036b:
            r8 = r6
        L_0x036c:
            java.lang.Float r5 = java.lang.Float.valueOf(r8)     // Catch:{ NumberFormatException -> 0x0375 }
            r3.f14770a = r5
        L_0x0372:
            int r0 = r0 + 1
            goto L_0x031b
        L_0x0375:
            r0 = move-exception
            org.xml.sax.SAXException r2 = new org.xml.sax.SAXException
            java.lang.String r3 = "Invalid offset value in <stop>: "
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r3.concat(r4)
            r2.<init>(r3, r0)
            throw r2
        L_0x0386:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid offset value in <stop> (empty string)"
            r0.<init>(r2)
            throw r0
        L_0x038e:
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r3)
            r1.f15062b = r3
            return
        L_0x0396:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements."
            r0.<init>(r2)
            throw r0
        L_0x039e:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x03a4:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x03c1
            com.a.a.am r3 = new com.a.a.am
            r3.<init>()
            com.a.a.bp r4 = r1.f15061a
            r3.f14833t = r4
            r3.f14834u = r0
            m13226B(r3, r2)
            m13228D(r3, r2)
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r3)
            r1.f15062b = r3
            return
        L_0x03c1:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x03c7:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x047d
            com.a.a.al r3 = new com.a.a.al
            r3.<init>()
            com.a.a.bp r4 = r1.f15061a
            r3.f14833t = r4
            r3.f14834u = r0
            m13226B(r3, r2)
            m13228D(r3, r2)
            m13234J(r3, r2)
            m13225A(r3, r2)
        L_0x03e2:
            int r0 = r27.getLength()
            if (r10 >= r0) goto L_0x0477
            java.lang.String r0 = r2.getValue(r10)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            if (r4 == r9) goto L_0x045d
            r5 = 56
            if (r4 == r5) goto L_0x0446
            r5 = 57
            if (r4 == r5) goto L_0x042f
            switch(r4) {
                case 81: goto L_0x0418;
                case 82: goto L_0x0411;
                case 83: goto L_0x040a;
                default: goto L_0x0409;
            }
        L_0x0409:
            goto L_0x046b
        L_0x040a:
            com.a.a.z r0 = m13235a(r0)
            r3.f14765b = r0
            goto L_0x046b
        L_0x0411:
            com.a.a.z r0 = m13235a(r0)
            r3.f14764a = r0
            goto L_0x046b
        L_0x0418:
            com.a.a.z r0 = m13235a(r0)
            r3.f14766c = r0
            com.a.a.z r0 = r3.f14766c
            boolean r0 = r0.mo9685e()
            if (r0 != 0) goto L_0x0427
            goto L_0x046b
        L_0x0427:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <rect> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x042f:
            com.a.a.z r0 = m13235a(r0)
            r3.f14769g = r0
            com.a.a.z r0 = r3.f14769g
            boolean r0 = r0.mo9685e()
            if (r0 != 0) goto L_0x043e
            goto L_0x046b
        L_0x043e:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <rect> element. ry cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0446:
            com.a.a.z r0 = m13235a(r0)
            r3.f14768f = r0
            com.a.a.z r0 = r3.f14768f
            boolean r0 = r0.mo9685e()
            if (r0 != 0) goto L_0x0455
            goto L_0x046b
        L_0x0455:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <rect> element. rx cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x045d:
            com.a.a.z r0 = m13235a(r0)
            r3.f14767d = r0
            com.a.a.z r0 = r3.f14767d
            boolean r0 = r0.mo9685e()
            if (r0 != 0) goto L_0x046f
        L_0x046b:
            int r10 = r10 + 1
            goto L_0x03e2
        L_0x046f:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <rect> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0477:
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r3)
            return
        L_0x047d:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0483:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0507
            com.a.a.ba r0 = new com.a.a.ba
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13233I(r0, r2)
        L_0x049d:
            int r3 = r27.getLength()
            if (r10 >= r3) goto L_0x04ff
            java.lang.String r3 = r2.getValue(r10)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r2.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            r5 = 6
            if (r4 == r5) goto L_0x04f6
            r5 = 7
            if (r4 == r5) goto L_0x04ef
            r5 = 11
            if (r4 == r5) goto L_0x04e8
            r5 = 12
            if (r4 == r5) goto L_0x04e1
            r5 = 49
            if (r4 == r5) goto L_0x04ca
            goto L_0x04fc
        L_0x04ca:
            com.a.a.z r3 = m13235a(r3)
            r0.f14838h = r3
            com.a.a.z r3 = r0.f14838h
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x04d9
            goto L_0x04fc
        L_0x04d9:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <radialGradient> element. r cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x04e1:
            com.a.a.z r3 = m13235a(r3)
            r0.f14840j = r3
            goto L_0x04fc
        L_0x04e8:
            com.a.a.z r3 = m13235a(r3)
            r0.f14839i = r3
            goto L_0x04fc
        L_0x04ef:
            com.a.a.z r3 = m13235a(r3)
            r0.f14837g = r3
            goto L_0x04fc
        L_0x04f6:
            com.a.a.z r3 = m13235a(r3)
            r0.f14836f = r3
        L_0x04fc:
            int r10 = r10 + 1
            goto L_0x049d
        L_0x04ff:
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x0507:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x050d:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0533
            com.a.a.aj r3 = new com.a.a.aj
            r3.<init>()
            com.a.a.bp r4 = r1.f15061a
            r3.f14833t = r4
            r3.f14834u = r0
            m13226B(r3, r2)
            m13228D(r3, r2)
            m13234J(r3, r2)
            m13225A(r3, r2)
            java.lang.String r0 = "polyline"
            m13227C(r3, r2, r0)
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r3)
            return
        L_0x0533:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0539:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x055f
            com.a.a.ak r3 = new com.a.a.ak
            r3.<init>()
            com.a.a.bp r4 = r1.f15061a
            r3.f14833t = r4
            r3.f14834u = r0
            m13226B(r3, r2)
            m13228D(r3, r2)
            m13234J(r3, r2)
            m13225A(r3, r2)
            java.lang.String r0 = "polygon"
            m13227C(r3, r2, r0)
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r3)
            return
        L_0x055f:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0565:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0646
            com.a.a.ai r0 = new com.a.a.ai
            r0.<init>()
            com.a.a.bp r3 = r1.f15061a
            r0.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r0.f14834u = r3
            m13226B(r0, r2)
            m13228D(r0, r2)
            m13225A(r0, r2)
            m13230F(r0, r2)
            r3 = 0
        L_0x0583:
            int r4 = r27.getLength()
            if (r3 >= r4) goto L_0x063e
            java.lang.String r4 = r2.getValue(r3)
            java.lang.String r4 = r4.trim()
            java.lang.String r6 = r2.getLocalName(r3)
            com.a.a.ch r6 = com.p232a.p233a.C4753ch.m13206a(r6)
            int r6 = r6.ordinal()
            if (r6 == r9) goto L_0x0624
            if (r6 == r8) goto L_0x0617
            java.lang.String r11 = "userSpaceOnUse"
            java.lang.String r12 = "objectBoundingBox"
            switch(r6) {
                case 44: goto L_0x05f9;
                case 45: goto L_0x05f2;
                case 46: goto L_0x05d4;
                default: goto L_0x05a8;
            }
        L_0x05a8:
            switch(r6) {
                case 81: goto L_0x05bd;
                case 82: goto L_0x05b5;
                case 83: goto L_0x05ad;
                default: goto L_0x05ab;
            }
        L_0x05ab:
            goto L_0x0632
        L_0x05ad:
            com.a.a.z r4 = m13235a(r4)
            r0.f14759e = r4
            goto L_0x0632
        L_0x05b5:
            com.a.a.z r4 = m13235a(r4)
            r0.f14758d = r4
            goto L_0x0632
        L_0x05bd:
            com.a.a.z r4 = m13235a(r4)
            r0.f14760f = r4
            com.a.a.z r4 = r0.f14760f
            boolean r4 = r4.mo9685e()
            if (r4 != 0) goto L_0x05cc
            goto L_0x0632
        L_0x05cc:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <pattern> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x05d4:
            boolean r6 = r12.equals(r4)
            if (r6 == 0) goto L_0x05e1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r0.f14755a = r4
            goto L_0x0632
        L_0x05e1:
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x05ea
            r0.f14755a = r5
            goto L_0x0632
        L_0x05ea:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid value for attribute patternUnits"
            r0.<init>(r2)
            throw r0
        L_0x05f2:
            android.graphics.Matrix r4 = m13232H(r4)
            r0.f14757c = r4
            goto L_0x0632
        L_0x05f9:
            boolean r6 = r12.equals(r4)
            if (r6 == 0) goto L_0x0606
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
            r0.f14756b = r4
            goto L_0x0632
        L_0x0606:
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x060f
            r0.f14756b = r5
            goto L_0x0632
        L_0x060f:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid value for attribute patternContentUnits"
            r0.<init>(r2)
            throw r0
        L_0x0617:
            java.lang.String r6 = r2.getURI(r3)
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0632
            r0.f14762h = r4
            goto L_0x0632
        L_0x0624:
            com.a.a.z r4 = m13235a(r4)
            r0.f14761g = r4
            com.a.a.z r4 = r0.f14761g
            boolean r4 = r4.mo9685e()
            if (r4 != 0) goto L_0x0636
        L_0x0632:
            int r3 = r3 + 1
            goto L_0x0583
        L_0x0636:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <pattern> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x063e:
            com.a.a.at r2 = r1.f15062b
            r2.mo9601b(r0)
            r1.f15062b = r0
            return
        L_0x0646:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x064c:
            com.a.a.at r0 = r1.f15062b
            if (r0 == 0) goto L_0x0998
            com.a.a.af r3 = new com.a.a.af
            r3.<init>()
            com.a.a.bp r4 = r1.f15061a
            r3.f14833t = r4
            r3.f14834u = r0
            m13226B(r3, r2)
            m13228D(r3, r2)
            m13234J(r3, r2)
            m13225A(r3, r2)
        L_0x0667:
            int r0 = r27.getLength()
            if (r10 >= r0) goto L_0x0992
            java.lang.String r0 = r2.getValue(r10)
            java.lang.String r0 = r0.trim()
            java.lang.String r4 = r2.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            r5 = 13
            if (r4 == r5) goto L_0x06aa
            r5 = 43
            if (r4 == r5) goto L_0x068d
        L_0x0689:
            r22 = 0
            goto L_0x0987
        L_0x068d:
            float r0 = m13237d(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.f14750b = r0
            java.lang.Float r0 = r3.f14750b
            float r0 = r0.floatValue()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x06a2
            goto L_0x0689
        L_0x06a2:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <path> element. pathLength cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x06aa:
            com.a.a.cj r4 = new com.a.a.cj
            r4.<init>(r0)
            com.a.a.ag r0 = new com.a.a.ag
            r0.<init>()
            boolean r5 = r4.mo9655n()
            if (r5 == 0) goto L_0x06be
        L_0x06ba:
            r22 = 0
            goto L_0x0985
        L_0x06be:
            java.lang.Integer r5 = r4.mo9649h()
            int r5 = r5.intValue()
            r7 = 109(0x6d, float:1.53E-43)
            if (r5 == r6) goto L_0x06cc
            if (r5 != r7) goto L_0x06ba
        L_0x06cc:
            r8 = 0
            r9 = 0
            r12 = 0
            r13 = 0
            r20 = 0
            r21 = 0
        L_0x06d4:
            r4.mo9652k()
            r14 = 108(0x6c, float:1.51E-43)
            java.lang.String r15 = "SVGParser"
            java.lang.String r6 = " path segment"
            java.lang.String r11 = "Bad path coords for "
            switch(r5) {
                case 65: goto L_0x08f8;
                case 67: goto L_0x089c;
                case 72: goto L_0x086b;
                case 76: goto L_0x0835;
                case 77: goto L_0x07ef;
                case 81: goto L_0x07ae;
                case 83: goto L_0x0757;
                case 84: goto L_0x071c;
                case 86: goto L_0x06f2;
                case 90: goto L_0x06e3;
                case 97: goto L_0x08f8;
                case 99: goto L_0x089c;
                case 104: goto L_0x086b;
                case 108: goto L_0x0835;
                case 109: goto L_0x07ef;
                case 113: goto L_0x07ae;
                case 115: goto L_0x0757;
                case 116: goto L_0x071c;
                case 118: goto L_0x06f2;
                case 122: goto L_0x06e3;
                default: goto L_0x06e2;
            }
        L_0x06e2:
            goto L_0x06ba
        L_0x06e3:
            r6 = 8
            r0.mo9593a(r6)
            r8 = r20
            r9 = r8
            r12 = r21
        L_0x06ed:
            r13 = r12
        L_0x06ee:
            r22 = 0
            goto L_0x0950
        L_0x06f2:
            float r13 = r4.mo9644c()
            boolean r14 = java.lang.Float.isNaN(r13)
            if (r14 == 0) goto L_0x0710
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            char r5 = (char) r5
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r15, r4)
            goto L_0x06ba
        L_0x0710:
            r6 = 118(0x76, float:1.65E-43)
            if (r5 != r6) goto L_0x0717
            float r13 = r13 + r12
            r5 = 118(0x76, float:1.65E-43)
        L_0x0717:
            r12 = r13
            r0.mo9598f(r8, r12)
            goto L_0x06ed
        L_0x071c:
            float r14 = r8 + r8
            float r9 = r14 - r9
            float r14 = r12 + r12
            float r13 = r14 - r13
            float r14 = r4.mo9644c()
            float r16 = r4.mo9643b(r14)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x0747
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            char r5 = (char) r5
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r15, r4)
            goto L_0x06ba
        L_0x0747:
            r6 = 116(0x74, float:1.63E-43)
            if (r5 != r6) goto L_0x0750
            float r14 = r14 + r8
            float r16 = r16 + r12
            r5 = 116(0x74, float:1.63E-43)
        L_0x0750:
            r8 = r14
            r12 = r16
            r0.mo9600h(r9, r13, r8, r12)
            goto L_0x06ee
        L_0x0757:
            float r14 = r8 + r8
            float r9 = r14 - r9
            float r14 = r12 + r12
            float r14 = r14 - r13
            float r13 = r4.mo9644c()
            float r7 = r4.mo9643b(r13)
            float r2 = r4.mo9643b(r7)
            float r16 = r4.mo9643b(r2)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x0789
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            char r4 = (char) r5
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2)
            goto L_0x06ba
        L_0x0789:
            r6 = 115(0x73, float:1.61E-43)
            if (r5 != r6) goto L_0x0799
            float r2 = r2 + r8
            float r16 = r16 + r12
            float r13 = r13 + r8
            float r7 = r7 + r12
            r8 = r2
            r2 = r13
            r6 = r16
            r5 = 115(0x73, float:1.61E-43)
            goto L_0x079d
        L_0x0799:
            r8 = r2
            r2 = r13
            r6 = r16
        L_0x079d:
            r12 = r0
            r13 = r9
            r15 = r2
            r16 = r7
            r17 = r8
            r18 = r6
            r12.mo9596d(r13, r14, r15, r16, r17, r18)
            r9 = r2
            r12 = r6
            r13 = r7
            goto L_0x06ee
        L_0x07ae:
            float r2 = r4.mo9644c()
            float r7 = r4.mo9643b(r2)
            float r9 = r4.mo9643b(r7)
            float r13 = r4.mo9643b(r9)
            boolean r14 = java.lang.Float.isNaN(r13)
            if (r14 == 0) goto L_0x07d9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            char r4 = (char) r5
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2)
            goto L_0x06ba
        L_0x07d9:
            r6 = 113(0x71, float:1.58E-43)
            if (r5 != r6) goto L_0x07e6
            float r9 = r9 + r8
            float r13 = r13 + r12
            float r2 = r2 + r8
            float r7 = r7 + r12
            r8 = r9
            r12 = r13
            r5 = 113(0x71, float:1.58E-43)
            goto L_0x07e8
        L_0x07e6:
            r8 = r9
            r12 = r13
        L_0x07e8:
            r9 = r2
            r13 = r7
            r0.mo9600h(r9, r13, r8, r12)
            goto L_0x06ee
        L_0x07ef:
            float r2 = r4.mo9644c()
            float r7 = r4.mo9643b(r2)
            boolean r9 = java.lang.Float.isNaN(r7)
            if (r9 == 0) goto L_0x0812
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            char r4 = (char) r5
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2)
            goto L_0x06ba
        L_0x0812:
            r9 = 109(0x6d, float:1.53E-43)
            if (r5 != r9) goto L_0x0822
            int r5 = r0.f14751a
            if (r5 != 0) goto L_0x081b
            goto L_0x081d
        L_0x081b:
            float r2 = r2 + r8
            float r7 = r7 + r12
        L_0x081d:
            r8 = r2
            r12 = r7
            r5 = 109(0x6d, float:1.53E-43)
            goto L_0x0824
        L_0x0822:
            r8 = r2
            r12 = r7
        L_0x0824:
            r0.mo9599g(r8, r12)
            if (r5 != r9) goto L_0x082a
            goto L_0x082c
        L_0x082a:
            r14 = 76
        L_0x082c:
            r9 = r8
            r20 = r9
            r13 = r12
            r21 = r13
            r5 = r14
            goto L_0x06ee
        L_0x0835:
            r9 = 109(0x6d, float:1.53E-43)
            float r2 = r4.mo9644c()
            float r7 = r4.mo9643b(r2)
            boolean r13 = java.lang.Float.isNaN(r7)
            if (r13 == 0) goto L_0x085a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            char r4 = (char) r5
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2)
            goto L_0x06ba
        L_0x085a:
            if (r5 != r14) goto L_0x0863
            float r2 = r2 + r8
            float r7 = r7 + r12
            r8 = r2
            r12 = r7
            r5 = 108(0x6c, float:1.51E-43)
            goto L_0x0865
        L_0x0863:
            r8 = r2
            r12 = r7
        L_0x0865:
            r0.mo9598f(r8, r12)
            r9 = r8
            goto L_0x06ed
        L_0x086b:
            r9 = 109(0x6d, float:1.53E-43)
            float r2 = r4.mo9644c()
            boolean r7 = java.lang.Float.isNaN(r2)
            if (r7 == 0) goto L_0x088c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            char r4 = (char) r5
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2)
            goto L_0x06ba
        L_0x088c:
            r6 = 104(0x68, float:1.46E-43)
            if (r5 != r6) goto L_0x0895
            float r2 = r2 + r8
            r8 = r2
            r5 = 104(0x68, float:1.46E-43)
            goto L_0x0896
        L_0x0895:
            r8 = r2
        L_0x0896:
            r0.mo9598f(r8, r12)
            r9 = r8
            goto L_0x06ee
        L_0x089c:
            r9 = 109(0x6d, float:1.53E-43)
            float r2 = r4.mo9644c()
            float r7 = r4.mo9643b(r2)
            float r13 = r4.mo9643b(r7)
            float r14 = r4.mo9643b(r13)
            float r9 = r4.mo9643b(r14)
            float r16 = r4.mo9643b(r9)
            boolean r17 = java.lang.Float.isNaN(r16)
            if (r17 == 0) goto L_0x08d1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            char r4 = (char) r5
            r2.append(r4)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r15, r2)
            goto L_0x06ba
        L_0x08d1:
            r6 = 99
            if (r5 != r6) goto L_0x08e2
            float r9 = r9 + r8
            float r16 = r16 + r12
            float r2 = r2 + r8
            float r7 = r7 + r12
            float r13 = r13 + r8
            float r14 = r14 + r12
            r8 = r9
            r9 = r13
            r6 = r14
            r5 = 99
            goto L_0x08e5
        L_0x08e2:
            r8 = r9
            r9 = r13
            r6 = r14
        L_0x08e5:
            r13 = r2
            r14 = r7
            r2 = r16
            r12 = r0
            r15 = r9
            r16 = r6
            r17 = r8
            r18 = r2
            r12.mo9596d(r13, r14, r15, r16, r17, r18)
            r12 = r2
            r13 = r6
            goto L_0x06ee
        L_0x08f8:
            float r13 = r4.mo9644c()
            float r14 = r4.mo9643b(r13)
            float r2 = r4.mo9643b(r14)
            java.lang.Float r7 = java.lang.Float.valueOf(r2)
            java.lang.Boolean r7 = r4.mo9648g(r7)
            java.lang.Boolean r9 = r4.mo9648g(r7)
            if (r9 != 0) goto L_0x0917
            r16 = 2143289344(0x7fc00000, float:NaN)
            r1 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x091f
        L_0x0917:
            float r1 = r4.mo9645d()
            float r16 = r4.mo9643b(r1)
        L_0x091f:
            boolean r17 = java.lang.Float.isNaN(r16)
            r22 = 0
            if (r17 != 0) goto L_0x0972
            int r17 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r17 < 0) goto L_0x0972
            int r17 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r17 >= 0) goto L_0x0930
            goto L_0x0972
        L_0x0930:
            r6 = 97
            if (r5 != r6) goto L_0x0939
            float r1 = r1 + r8
            float r16 = r16 + r12
            r5 = 97
        L_0x0939:
            r8 = r1
            r1 = r16
            boolean r16 = r7.booleanValue()
            boolean r17 = r9.booleanValue()
            r12 = r0
            r15 = r2
            r18 = r8
            r19 = r1
            r12.mo9594b(r13, r14, r15, r16, r17, r18, r19)
            r12 = r1
            r13 = r12
            r9 = r8
        L_0x0950:
            r4.mo9657p()
            boolean r1 = r4.mo9655n()
            if (r1 != 0) goto L_0x0985
            boolean r1 = r4.mo9656o()
            if (r1 == 0) goto L_0x0967
            java.lang.Integer r1 = r4.mo9649h()
            int r5 = r1.intValue()
        L_0x0967:
            r2 = r27
            r6 = 77
            r7 = 109(0x6d, float:1.53E-43)
            r11 = 0
            r1 = r23
            goto L_0x06d4
        L_0x0972:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r11)
            char r2 = (char) r5
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r15, r1)
        L_0x0985:
            r3.f14749a = r0
        L_0x0987:
            int r10 = r10 + 1
            r2 = r27
            r6 = 77
            r11 = 0
            r1 = r23
            goto L_0x0667
        L_0x0992:
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r3)
            return
        L_0x0998:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x099e:
            r0 = r2
            r1.m13256w(r0)
            return
        L_0x09a3:
            r0 = r2
            r1.m13255v(r0)
            return
        L_0x09a8:
            r0 = r2
            com.a.a.at r2 = r1.f15062b
            if (r2 == 0) goto L_0x0a07
            com.a.a.aw r2 = new com.a.a.aw
            r2.<init>()
            com.a.a.bp r3 = r1.f15061a
            r2.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r2.f14834u = r3
            m13226B(r2, r0)
            m13228D(r2, r0)
            m13233I(r2, r0)
        L_0x09c3:
            int r3 = r27.getLength()
            if (r10 >= r3) goto L_0x09ff
            java.lang.String r3 = r0.getValue(r10)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            switch(r4) {
                case 84: goto L_0x09f6;
                case 85: goto L_0x09ef;
                case 86: goto L_0x09e8;
                case 87: goto L_0x09e1;
                default: goto L_0x09e0;
            }
        L_0x09e0:
            goto L_0x09fc
        L_0x09e1:
            com.a.a.z r3 = m13235a(r3)
            r2.f14832i = r3
            goto L_0x09fc
        L_0x09e8:
            com.a.a.z r3 = m13235a(r3)
            r2.f14831h = r3
            goto L_0x09fc
        L_0x09ef:
            com.a.a.z r3 = m13235a(r3)
            r2.f14830g = r3
            goto L_0x09fc
        L_0x09f6:
            com.a.a.z r3 = m13235a(r3)
            r2.f14829f = r3
        L_0x09fc:
            int r10 = r10 + 1
            goto L_0x09c3
        L_0x09ff:
            com.a.a.at r0 = r1.f15062b
            r0.mo9601b(r2)
            r1.f15062b = r2
            return
        L_0x0a07:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            r0.<init>(r12)
            throw r0
        L_0x0a0d:
            r0 = r2
            r1.m13254u(r0)
            return
        L_0x0a12:
            r0 = r2
            r1.m13253t(r0)
            return
        L_0x0a17:
            r0 = r2
            r1.m13251r(r0)
            return
        L_0x0a1c:
            r1.f15065e = r4
            r1.f15066f = r0
            return
        L_0x0a21:
            r0 = r2
            r1.m13250q(r0)
            return
        L_0x0a26:
            r0 = r2
            r1.m13249p(r0)
            return
        L_0x0a2b:
            r0 = r2
            r1.m13248o(r0)
            return
        L_0x0a30:
            r0 = r2
            r1.m13252s(r0)
            return
        L_0x0a35:
            r0 = r2
            com.a.a.ap r2 = new com.a.a.ap
            r2.<init>()
            com.a.a.bp r3 = r1.f15061a
            r2.f14833t = r3
            com.a.a.at r3 = r1.f15062b
            r2.f14834u = r3
            m13226B(r2, r0)
            m13228D(r2, r0)
            m13225A(r2, r0)
            m13230F(r2, r0)
        L_0x0a4f:
            int r3 = r27.getLength()
            if (r10 >= r3) goto L_0x0aad
            java.lang.String r3 = r0.getValue(r10)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r0.getLocalName(r10)
            com.a.a.ch r4 = com.p232a.p233a.C4753ch.m13206a(r4)
            int r4 = r4.ordinal()
            if (r4 == r9) goto L_0x0a94
            switch(r4) {
                case 81: goto L_0x0a7d;
                case 82: goto L_0x0a76;
                case 83: goto L_0x0a6f;
                default: goto L_0x0a6e;
            }
        L_0x0a6e:
            goto L_0x0aa2
        L_0x0a6f:
            com.a.a.z r3 = m13235a(r3)
            r2.f14810b = r3
            goto L_0x0aa2
        L_0x0a76:
            com.a.a.z r3 = m13235a(r3)
            r2.f14809a = r3
            goto L_0x0aa2
        L_0x0a7d:
            com.a.a.z r3 = m13235a(r3)
            r2.f14811c = r3
            com.a.a.z r3 = r2.f14811c
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x0a8c
            goto L_0x0aa2
        L_0x0a8c:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <svg> element. width cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0a94:
            com.a.a.z r3 = m13235a(r3)
            r2.f14812d = r3
            com.a.a.z r3 = r2.f14812d
            boolean r3 = r3.mo9685e()
            if (r3 != 0) goto L_0x0aa5
        L_0x0aa2:
            int r10 = r10 + 1
            goto L_0x0a4f
        L_0x0aa5:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException
            java.lang.String r2 = "Invalid <svg> element. height cannot be negative"
            r0.<init>(r2)
            throw r0
        L_0x0aad:
            com.a.a.at r0 = r1.f15062b
            if (r0 != 0) goto L_0x0ab6
            com.a.a.bp r0 = r1.f15061a
            r0.f14859a = r2
            goto L_0x0ab9
        L_0x0ab6:
            r0.mo9601b(r2)
        L_0x0ab9:
            r1.f15062b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p232a.p233a.C4756ck.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }
}
