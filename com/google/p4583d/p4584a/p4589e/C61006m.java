package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60978e;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4588d.C60991r;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.e.m */
/* compiled from: PG */
public final class C61006m extends C60995b {
    protected C61006m() {
        this.f165130a.add(C61011a.FOR_IN);
        this.f165130a.add(C61011a.FOR_IN_CONST);
        this.f165130a.add(C61011a.FOR_IN_LET);
        this.f165130a.add(C61011a.FOR_LET);
        this.f165130a.add(C61011a.FOR_OF);
        this.f165130a.add(C61011a.FOR_OF_CONST);
        this.f165130a.add(C61011a.FOR_OF_LET);
        this.f165130a.add(C61011a.WHILE);
    }

    /* renamed from: c */
    private static C60987n m93244c(C61004k kVar, Iterator it, C60987n nVar) {
        if (it != null) {
            while (it.hasNext()) {
                C60987n b = kVar.mo57522a((C60987n) it.next()).mo57526b((C60976c) nVar);
                if (b instanceof C60978e) {
                    C60978e eVar = (C60978e) b;
                    if ("break".equals(eVar.f165105b)) {
                        return C60987n.f165114f;
                    }
                    if ("return".equals(eVar.f165105b)) {
                        return eVar;
                    }
                }
            }
        }
        return C60987n.f165114f;
    }

    /* renamed from: d */
    private static C60987n m93245d(C61004k kVar, C60987n nVar, C60987n nVar2) {
        return m93244c(kVar, nVar.mo57479l(), nVar2);
    }

    /* renamed from: e */
    private static C60987n m93246e(C61004k kVar, C60987n nVar, C60987n nVar2) {
        if (nVar instanceof Iterable) {
            return m93244c(kVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C60987n mo57517a(String str, C61012g gVar, List list) {
        C61011a aVar = C61011a.ADD;
        int ordinal = C61013h.m93262d(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C61013h.m93265g(C61011a.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C60991r) {
                        String i = ((C60987n) list.get(0)).mo57475i();
                        return m93245d(new C61005l(gVar, i), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C61013h.m93265g(C61011a.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C60991r) {
                        String i2 = ((C60987n) list.get(0)).mo57475i();
                        return m93245d(new C61002i(gVar, i2), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C61013h.m93265g(C61011a.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C60991r) {
                        String i3 = ((C60987n) list.get(0)).mo57475i();
                        return m93245d(new C61003j(gVar, i3), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C61013h.m93265g(C61011a.FOR_LET.name(), 4, list);
                    C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
                    if (a instanceof C60976c) {
                        C60976c cVar = (C60976c) a;
                        C60987n nVar = (C60987n) list.get(1);
                        C60987n nVar2 = (C60987n) list.get(2);
                        C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(3));
                        C61012g a3 = gVar.mo57525a();
                        for (int i4 = 0; i4 < cVar.mo57467c(); i4++) {
                            String i5 = cVar.mo57469e(i4).mo57475i();
                            a3.mo57530f(i5, gVar.mo57527c(i5));
                        }
                        while (gVar.f165215b.mo57519a(gVar, nVar).mo57472g().booleanValue()) {
                            C60987n b = gVar.mo57526b((C60976c) a2);
                            if (b instanceof C60978e) {
                                C60978e eVar = (C60978e) b;
                                if ("break".equals(eVar.f165105b)) {
                                    return C60987n.f165114f;
                                }
                                if ("return".equals(eVar.f165105b)) {
                                    return eVar;
                                }
                            }
                            C61012g a4 = gVar.mo57525a();
                            for (int i6 = 0; i6 < cVar.mo57467c(); i6++) {
                                String i7 = cVar.mo57469e(i6).mo57475i();
                                a4.mo57530f(i7, a3.mo57527c(i7));
                            }
                            a4.f165215b.mo57519a(a4, nVar2);
                            a3 = a4;
                        }
                        return C60987n.f165114f;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C61013h.m93265g(C61011a.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C60991r) {
                        String i8 = ((C60987n) list.get(0)).mo57475i();
                        return m93246e(new C61005l(gVar, i8), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C61013h.m93265g(C61011a.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C60991r) {
                        String i9 = ((C60987n) list.get(0)).mo57475i();
                        return m93246e(new C61002i(gVar, i9), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C61013h.m93265g(C61011a.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C60991r) {
                        String i10 = ((C60987n) list.get(0)).mo57475i();
                        return m93246e(new C61003j(gVar, i10), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1)), gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo57518b(str);
            }
        } else {
            C61013h.m93265g(C61011a.WHILE.name(), 4, list);
            C60987n nVar3 = (C60987n) list.get(0);
            C60987n nVar4 = (C60987n) list.get(1);
            C60987n a5 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(3));
            if (gVar.f165215b.mo57519a(gVar, (C60987n) list.get(2)).mo57472g().booleanValue()) {
                C60987n b2 = gVar.mo57526b((C60976c) a5);
                if (b2 instanceof C60978e) {
                    C60978e eVar2 = (C60978e) b2;
                    if ("break".equals(eVar2.f165105b)) {
                        return C60987n.f165114f;
                    }
                    if ("return".equals(eVar2.f165105b)) {
                        return eVar2;
                    }
                }
            }
            while (gVar.f165215b.mo57519a(gVar, nVar3).mo57472g().booleanValue()) {
                C60987n b3 = gVar.mo57526b((C60976c) a5);
                if (b3 instanceof C60978e) {
                    C60978e eVar3 = (C60978e) b3;
                    if ("break".equals(eVar3.f165105b)) {
                        return C60987n.f165114f;
                    }
                    if ("return".equals(eVar3.f165105b)) {
                        return eVar3;
                    }
                }
                gVar.f165215b.mo57519a(gVar, nVar4);
            }
            return C60987n.f165114f;
        }
    }
}
