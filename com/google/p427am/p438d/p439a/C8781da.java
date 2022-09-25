package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.da */
/* compiled from: PG */
public final class C8781da extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8781da f30152a;

    /* renamed from: c */
    private static volatile C63010eb f30153c;

    /* renamed from: b */
    private C62995dn f30154b = C62995dn.f170057a;

    static {
        C8781da daVar = new C8781da();
        f30152a = daVar;
        C62942bv.registerDefaultInstance(C8781da.class, daVar);
    }

    private C8781da() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f30152a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C8779cz.f30149a});
            case 3:
                return new C8781da();
            case 4:
                return new C8778cy();
            case 5:
                return f30152a;
            case 6:
                C63010eb ebVar = f30153c;
                if (ebVar == null) {
                    synchronized (C8781da.class) {
                        ebVar = f30153c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30152a);
                            f30153c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
