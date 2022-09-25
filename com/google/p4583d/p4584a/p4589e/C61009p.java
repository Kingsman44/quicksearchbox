package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60977d;
import com.google.p4583d.p4584a.p4588d.C60978e;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60983j;
import com.google.p4583d.p4584a.p4588d.C60984k;
import com.google.p4583d.p4584a.p4588d.C60986m;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60988o;
import com.google.p4583d.p4584a.p4588d.C60991r;
import com.google.p4583d.p4584a.p4588d.C60992s;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.e.p */
/* compiled from: PG */
public final class C61009p extends C60995b {
    protected C61009p() {
        this.f165130a.add(C61011a.ASSIGN);
        this.f165130a.add(C61011a.CONST);
        this.f165130a.add(C61011a.CREATE_ARRAY);
        this.f165130a.add(C61011a.CREATE_OBJECT);
        this.f165130a.add(C61011a.EXPRESSION_LIST);
        this.f165130a.add(C61011a.GET);
        this.f165130a.add(C61011a.GET_INDEX);
        this.f165130a.add(C61011a.GET_PROPERTY);
        this.f165130a.add(C61011a.NULL);
        this.f165130a.add(C61011a.SET_PROPERTY);
        this.f165130a.add(C61011a.TYPEOF);
        this.f165130a.add(C61011a.UNDEFINED);
        this.f165130a.add(C61011a.VAR);
    }

    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        String str2;
        C61011a aVar = C61011a.ADD;
        int ordinal = C61013h.m93262d(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C61013h.m93265g(C61011a.ASSIGN.name(), 2, list);
            C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            if (!(a instanceof C60991r)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{a.getClass().getCanonicalName()}));
            } else if (gVar.mo57531g(a.mo57475i())) {
                C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
                gVar.mo57530f(a.mo57475i(), a2);
                return a2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{a.mo57475i()}));
            }
        } else if (ordinal == 14) {
            C61013h.m93266h(C61011a.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C60987n a3 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i2));
                    if (a3 instanceof C60991r) {
                        gVar.mo57529e(a3.mo57475i(), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{a3.getClass().getCanonicalName()}));
                    }
                }
                return C60987n.f165114f;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C61013h.m93266h(C61011a.EXPRESSION_LIST.name(), 1, list);
            C60987n nVar = C60987n.f165114f;
            while (i < list.size()) {
                nVar = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i));
                if (!(nVar instanceof C60978e)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return nVar;
        } else if (ordinal == 33) {
            C61013h.m93265g(C61011a.GET.name(), 1, list);
            C60987n a4 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            if (a4 instanceof C60991r) {
                return gVar.mo57527c(a4.mo57475i());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{a4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C61013h.m93265g(C61011a.NULL.name(), 0, list);
            return C60987n.f165115g;
        } else if (ordinal == 58) {
            C61013h.m93265g(C61011a.SET_PROPERTY.name(), 3, list);
            C60987n a5 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
            C60987n a6 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
            C60987n a7 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2));
            if (a5 == C60987n.f165114f || a5 == C60987n.f165115g) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{a6.mo57475i(), a5.mo57475i()}));
            }
            if ((a5 instanceof C60976c) && (a6 instanceof C60979f)) {
                ((C60976c) a5).mo57483p(a6.mo57473h().intValue(), a7);
            } else if (a5 instanceof C60983j) {
                ((C60983j) a5).mo57484q(a6.mo57475i(), a7);
            }
            return a7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C61013h.m93265g(C61011a.GET_PROPERTY.name(), 2, list);
                    C60987n a8 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
                    C60987n a9 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
                    if ((a8 instanceof C60976c) && C61013h.m93268j(a9)) {
                        return ((C60976c) a8).mo57469e(a9.mo57473h().intValue());
                    }
                    if (a8 instanceof C60983j) {
                        return ((C60983j) a8).mo57471f(a9.mo57475i());
                    }
                    if (a8 instanceof C60991r) {
                        if ("length".equals(a9.mo57475i())) {
                            return new C60979f(Double.valueOf((double) a8.mo57475i().length()));
                        }
                        if (C61013h.m93268j(a9) && a9.mo57473h().doubleValue() < ((double) a8.mo57475i().length())) {
                            return new C60991r(String.valueOf(a8.mo57475i().charAt(a9.mo57473h().intValue())));
                        }
                    }
                    return C60987n.f165114f;
                }
                switch (ordinal) {
                    case 62:
                        C61013h.m93265g(C61011a.TYPEOF.name(), 1, list);
                        C60987n a10 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
                        if (a10 instanceof C60992s) {
                            str2 = "undefined";
                        } else if (a10 instanceof C60977d) {
                            str2 = "boolean";
                        } else if (a10 instanceof C60979f) {
                            str2 = "number";
                        } else if (a10 instanceof C60991r) {
                            str2 = "string";
                        } else if (a10 instanceof C60986m) {
                            str2 = "function";
                        } else if ((a10 instanceof C60988o) || (a10 instanceof C60978e)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{a10}));
                        } else {
                            str2 = "object";
                        }
                        return new C60991r(str2);
                    case 63:
                        C61013h.m93265g(C61011a.UNDEFINED.name(), 0, list);
                        return C60987n.f165114f;
                    case 64:
                        C61013h.m93266h(C61011a.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C60987n a11 = gVar.f165215b.mo57519a(gVar, (C60987n) it.next());
                            if (a11 instanceof C60991r) {
                                gVar.mo57528d(a11.mo57475i(), C60987n.f165114f);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{a11.getClass().getCanonicalName()}));
                            }
                        }
                        return C60987n.f165114f;
                    default:
                        return super.mo57518b(str);
                }
            } else if (list.isEmpty()) {
                return new C60984k();
            } else {
                if (list.size() % 2 == 0) {
                    C60984k kVar = new C60984k();
                    while (i < list.size() - 1) {
                        C60987n a12 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i));
                        C60987n a13 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(i + 1));
                        if ((a12 instanceof C60978e) || (a13 instanceof C60978e)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        kVar.mo57484q(a12.mo57475i(), a13);
                        i += 2;
                    }
                    return kVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C60976c();
        } else {
            C60976c cVar = new C60976c();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C60987n a14 = gVar.f165215b.mo57519a(gVar, (C60987n) it2.next());
                if (!(a14 instanceof C60978e)) {
                    cVar.mo57483p(i, a14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return cVar;
        }
    }
}
