package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cs */
/* compiled from: PG */
public final class C56292cs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f150015d = new C56282ci();

    /* renamed from: e */
    public static final C56292cs f150016e;

    /* renamed from: f */
    private static volatile C63010eb f150017f;

    /* renamed from: a */
    public int f150018a;

    /* renamed from: b */
    public C56291cr f150019b;

    /* renamed from: c */
    public C62961ch f150020c = emptyIntList();

    static {
        C56292cs csVar = new C56292cs();
        f150016e = csVar;
        C62942bv.registerDefaultInstance(C56292cs.class, csVar);
    }

    private C56292cs() {
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
                return newMessageInfo(f150016e, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003ဉ\u0002\u0004\u001e", new Object[]{"a", "b", C45240c.f118157a, C56285cl.m87959b()});
            case 3:
                return new C56292cs();
            case 4:
                return new C56283cj();
            case 5:
                return f150016e;
            case 6:
                C63010eb ebVar = f150017f;
                if (ebVar == null) {
                    synchronized (C56292cs.class) {
                        ebVar = f150017f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150016e);
                            f150017f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
