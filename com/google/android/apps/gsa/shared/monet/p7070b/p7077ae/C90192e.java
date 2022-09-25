package com.google.android.apps.gsa.shared.monet.p7070b.p7077ae;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.ae.e */
/* compiled from: PG */
public final class C90192e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C90192e f251957c;

    /* renamed from: d */
    private static volatile C63010eb f251958d;

    /* renamed from: a */
    public int f251959a;

    /* renamed from: b */
    public int f251960b;

    static {
        C90192e eVar = new C90192e();
        f251957c = eVar;
        C62942bv.registerDefaultInstance(C90192e.class, eVar);
    }

    private C90192e() {
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
                return newMessageInfo(f251957c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C90192e();
            case 4:
                return new C90191d();
            case 5:
                return f251957c;
            case 6:
                C63010eb ebVar = f251958d;
                if (ebVar == null) {
                    synchronized (C90192e.class) {
                        ebVar = f251958d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f251957c);
                            f251958d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
