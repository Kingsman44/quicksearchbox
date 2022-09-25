package com.google.p4583d.p4584a.p4589e;

import com.google.common.p4535g.C59203do;
import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60977d;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60983j;
import com.google.p4583d.p4584a.p4588d.C60985l;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60991r;
import com.google.p4583d.p4584a.p4588d.C60992s;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.List;

/* renamed from: com.google.d.a.e.d */
/* compiled from: PG */
public final class C60997d extends C60995b {
    public C60997d() {
        this.f165130a.add(C61011a.EQUALS);
        this.f165130a.add(C61011a.GREATER_THAN);
        this.f165130a.add(C61011a.GREATER_THAN_EQUALS);
        this.f165130a.add(C61011a.IDENTITY_EQUALS);
        this.f165130a.add(C61011a.IDENTITY_NOT_EQUALS);
        this.f165130a.add(C61011a.LESS_THAN);
        this.f165130a.add(C61011a.LESS_THAN_EQUALS);
        this.f165130a.add(C61011a.NOT_EQUALS);
    }

    /* renamed from: c */
    private static boolean m93231c(C60987n nVar, C60987n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof C60992s) || (nVar instanceof C60985l)) {
                return true;
            }
            if (nVar instanceof C60979f) {
                return !Double.isNaN(nVar.mo57473h().doubleValue()) && !Double.isNaN(nVar2.mo57473h().doubleValue()) && nVar.mo57473h().doubleValue() == nVar2.mo57473h().doubleValue();
            }
            if (nVar instanceof C60991r) {
                return nVar.mo57475i().equals(nVar2.mo57475i());
            }
            if (nVar instanceof C60977d) {
                return nVar.mo57472g().equals(nVar2.mo57472g());
            }
            return nVar == nVar2;
        } else if (((nVar instanceof C60992s) || (nVar instanceof C60985l)) && ((nVar2 instanceof C60992s) || (nVar2 instanceof C60985l))) {
            return true;
        } else {
            boolean z = nVar instanceof C60979f;
            if (z && (nVar2 instanceof C60991r)) {
                return m93231c(nVar, new C60979f(nVar2.mo57473h()));
            }
            boolean z2 = nVar instanceof C60991r;
            if (z2 && (nVar2 instanceof C60979f)) {
                return m93231c(new C60979f(nVar.mo57473h()), nVar2);
            }
            if (nVar instanceof C60977d) {
                return m93231c(new C60979f(nVar.mo57473h()), nVar2);
            }
            if (nVar2 instanceof C60977d) {
                return m93231c(nVar, new C60979f(nVar2.mo57473h()));
            }
            if ((z2 || z) && (nVar2 instanceof C60983j)) {
                return m93231c(nVar, new C60991r(nVar2.mo57475i()));
            }
            if (!(nVar instanceof C60983j) || (!(nVar2 instanceof C60991r) && !(nVar2 instanceof C60979f))) {
                return false;
            }
            return m93231c(new C60991r(nVar.mo57475i()), nVar2);
        }
    }

    /* renamed from: d */
    private static boolean m93232d(C60987n nVar, C60987n nVar2) {
        if (nVar instanceof C60983j) {
            nVar = new C60991r(nVar.mo57475i());
        }
        if (nVar2 instanceof C60983j) {
            nVar2 = new C60991r(nVar2.mo57475i());
        }
        if ((nVar instanceof C60991r) && (nVar2 instanceof C60991r)) {
            return nVar.mo57475i().compareTo(nVar2.mo57475i()) < 0;
        }
        double doubleValue = nVar.mo57473h().doubleValue();
        double doubleValue2 = nVar2.mo57473h().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == C59203do.f157270a && doubleValue2 == C59203do.f157270a) && (!(doubleValue == C59203do.f157270a && doubleValue2 == C59203do.f157270a) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    /* renamed from: e */
    private static boolean m93233e(C60987n nVar, C60987n nVar2) {
        if (nVar instanceof C60983j) {
            nVar = new C60991r(nVar.mo57475i());
        }
        if (nVar2 instanceof C60983j) {
            nVar2 = new C60991r(nVar2.mo57475i());
        }
        if (((!(nVar instanceof C60991r) || !(nVar2 instanceof C60991r)) && (Double.isNaN(nVar.mo57473h().doubleValue()) || Double.isNaN(nVar2.mo57473h().doubleValue()))) || m93232d(nVar2, nVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        boolean z;
        boolean c;
        C61013h.m93265g(C61013h.m93262d(str).name(), 2, list);
        C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
        C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
        int ordinal = C61013h.m93262d(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                c = m93231c(a, a2);
            } else if (ordinal == 42) {
                z = m93232d(a, a2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = m93232d(a2, a);
                        break;
                    case 38:
                        z = m93233e(a2, a);
                        break;
                    case 39:
                        z = C61013h.m93269k(a, a2);
                        break;
                    case 40:
                        c = C61013h.m93269k(a, a2);
                        break;
                    default:
                        return super.mo57518b(str);
                }
            } else {
                z = m93233e(a, a2);
            }
            z = !c;
        } else {
            z = m93231c(a, a2);
        }
        return z ? C60987n.f165119k : C60987n.f165120l;
    }
}
