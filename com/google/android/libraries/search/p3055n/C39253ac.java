package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.ac */
/* compiled from: PG */
public final class C39253ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39253ac f103396c;

    /* renamed from: d */
    public static final C62940bt f103397d;

    /* renamed from: e */
    private static volatile C63010eb f103398e;

    /* renamed from: a */
    public int f103399a;

    /* renamed from: b */
    public int f103400b;

    static {
        C39253ac acVar = new C39253ac();
        f103396c = acVar;
        C62942bv.registerDefaultInstance(C39253ac.class, acVar);
        f103397d = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, acVar, acVar, (C62958ce) null, 398024678, C63066gd.MESSAGE, C39253ac.class);
    }

    private C39253ac() {
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
                return newMessageInfo(f103396c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C39252ab.f103395a});
            case 3:
                return new C39253ac();
            case 4:
                return new C39251aa();
            case 5:
                return f103396c;
            case 6:
                C63010eb ebVar = f103398e;
                if (ebVar == null) {
                    synchronized (C39253ac.class) {
                        ebVar = f103398e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103396c);
                            f103398e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
