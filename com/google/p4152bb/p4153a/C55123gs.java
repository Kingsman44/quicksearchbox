package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.gs */
/* compiled from: PG */
public final class C55123gs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f145061b = new C55119go();

    /* renamed from: c */
    public static final C55123gs f145062c;

    /* renamed from: d */
    private static volatile C63010eb f145063d;

    /* renamed from: a */
    public C62961ch f145064a = emptyIntList();

    static {
        C55123gs gsVar = new C55123gs();
        f145062c = gsVar;
        C62942bv.registerDefaultInstance(C55123gs.class, gsVar);
    }

    private C55123gs() {
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
                return newMessageInfo(f145062c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C55122gr.m87597b()});
            case 3:
                return new C55123gs();
            case 4:
                return new C55120gp();
            case 5:
                return f145062c;
            case 6:
                C63010eb ebVar = f145063d;
                if (ebVar == null) {
                    synchronized (C55123gs.class) {
                        ebVar = f145063d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145062c);
                            f145063d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
