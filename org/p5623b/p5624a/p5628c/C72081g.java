package org.p5623b.p5624a.p5628c;

import org.p5623b.p5624a.C72019ae;
import org.p5623b.p5624a.C72091d;
import org.p5623b.p5624a.C72097j;
import org.p5623b.p5624a.C72101n;
import org.p5623b.p5624a.C72108u;
import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.c.g */
/* compiled from: PG */
public final class C72081g extends C72101n implements C72091d {

    /* renamed from: a */
    C72108u f191891a;

    public C72081g(C72108u uVar) {
        if ((uVar instanceof C72019ae) || (uVar instanceof C72097j)) {
            this.f191891a = uVar;
            return;
        }
        throw new IllegalArgumentException("unknown object passed to Time");
    }

    /* renamed from: a */
    public static C72081g m105528a(Object obj) {
        if (obj == null || (obj instanceof C72081g)) {
            return (C72081g) obj;
        }
        if (obj instanceof C72019ae) {
            return new C72081g((C72019ae) obj);
        }
        if (obj instanceof C72097j) {
            return new C72081g((C72097j) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(String.valueOf(obj.getClass().getName())));
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        return this.f191891a;
    }

    public final String toString() {
        String str;
        C72108u uVar = this.f191891a;
        if (uVar instanceof C72019ae) {
            String a = C72131f.m105663a(((C72019ae) uVar).f191775a);
            if (a.indexOf(45) >= 0 || a.indexOf(43) >= 0) {
                int indexOf = a.indexOf(45);
                if (indexOf < 0) {
                    indexOf = a.indexOf(43);
                }
                if (indexOf == a.length() - 3) {
                    a = a.concat("00");
                }
                if (indexOf == 10) {
                    str = a.substring(0, 10) + "00GMT" + a.substring(10, 13) + ":" + a.substring(13, 15);
                } else {
                    str = a.substring(0, 12) + "GMT" + a.substring(12, 15) + ":" + a.substring(15, 17);
                }
            } else if (a.length() == 11) {
                str = String.valueOf(a.substring(0, 10)).concat("00GMT+00:00");
            } else {
                str = String.valueOf(a.substring(0, 12)).concat("GMT+00:00");
            }
            return (str.charAt(0) < '5' ? "20" : "19").concat(str);
        }
        C72097j jVar = (C72097j) uVar;
        String a2 = C72131f.m105663a(jVar.f191923a);
        if (a2.charAt(a2.length() - 1) == 'Z') {
            return String.valueOf(a2.substring(0, a2.length() - 1)).concat("GMT+00:00");
        }
        int length = a2.length() - 6;
        char charAt = a2.charAt(length);
        if ((charAt == '-' || charAt == '+') && a2.indexOf("GMT") == length - 3) {
            return a2;
        }
        int length2 = a2.length() - 5;
        char charAt2 = a2.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            int i = length2 + 3;
            return a2.substring(0, length2) + "GMT" + a2.substring(length2, i) + ":" + a2.substring(i);
        }
        int length3 = a2.length() - 3;
        char charAt3 = a2.charAt(length3);
        if (charAt3 != '-' && charAt3 != '+') {
            return a2.concat(jVar.mo63282e(a2));
        }
        return a2.substring(0, length3) + "GMT" + a2.substring(length3) + ":00";
    }
}
