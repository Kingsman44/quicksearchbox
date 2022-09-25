package org.p5623b.p5624a.p5626b.p5627a;

import java.io.IOException;
import java.util.Hashtable;
import org.p5623b.p5624a.C72017ac;
import org.p5623b.p5624a.C72061bn;
import org.p5623b.p5624a.C72092e;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5624a.p5626b.C72042a;
import org.p5623b.p5624a.p5626b.C72046b;
import org.p5623b.p5629b.C72131f;
import org.p5623b.p5629b.p5630a.C72120f;

/* renamed from: org.b.a.b.a.c */
/* compiled from: PG */
public final class C72045c {
    /* renamed from: a */
    public static String m105407a(String str) {
        if (str.length() > 0 && str.charAt(0) == '#') {
            try {
                C72108u q = C72108u.m105626q(C72120f.m105655c(str, str.length() - 1));
                if (q instanceof C72017ac) {
                    str = ((C72017ac) q).mo63226e();
                }
            } catch (IOException e) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e.toString()));
            }
        }
        String c = C72131f.m105665c(str);
        int length = c.length();
        if (length < 2) {
            return c;
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i && c.charAt(i2) == '\\' && c.charAt(i2 + 1) == ' ') {
            i2 += 2;
        }
        int i3 = i2 + 1;
        int i4 = i;
        while (i4 > i3 && c.charAt(i4 - 1) == '\\' && c.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i2 > 0 || i4 < i) {
            c = c.substring(i2, i4 + 1);
        }
        if (c.indexOf("  ") < 0) {
            return c;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = c.charAt(0);
        stringBuffer.append(charAt);
        for (int i5 = 1; i5 < c.length(); i5++) {
            char charAt2 = c.charAt(i5);
            if (charAt == ' ' && charAt2 == ' ') {
                charAt = ' ';
            } else {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m105408b(C72092e eVar) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        if (!(eVar instanceof C72017ac) || (eVar instanceof C72061bn)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(C72120f.m105653a(eVar.mo63233g().mo63294p("DER")));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String e = ((C72017ac) eVar).mo63226e();
            if (e.length() > 0 && e.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(e);
        }
        int length = stringBuffer.length();
        int i3 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i3 = 0;
        }
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            stringBuffer.insert(i, "\\");
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' ') {
                stringBuffer.insert(i2, "\\");
                i2 += 2;
            }
        }
        int length2 = stringBuffer.length();
        while (true) {
            length2--;
            if (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
                stringBuffer.insert(length2, '\\');
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static void m105409c(StringBuffer stringBuffer, C72042a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.f191800a);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(aVar.f191800a.f191932a);
        }
        stringBuffer.append('=');
        stringBuffer.append(m105408b(aVar.f191801b));
    }

    /* renamed from: d */
    public static boolean m105410d(C72046b bVar, C72046b bVar2) {
        if (bVar.f191840a.f191942a.length != bVar2.f191840a.f191942a.length) {
            return false;
        }
        C72042a[] c = bVar.mo63247c();
        C72042a[] c2 = bVar2.mo63247c();
        if (c.length != c2.length) {
            return false;
        }
        for (int i = 0; i != c.length; i++) {
            C72042a aVar = c[i];
            C72042a aVar2 = c2[i];
            if (aVar != aVar2 && (aVar == null || aVar2 == null || !aVar.f191800a.mo63309r(aVar2.f191800a) || !m105407a(m105408b(aVar.f191801b)).equals(m105407a(m105408b(aVar2.f191801b))))) {
                return false;
            }
        }
        return true;
    }
}
