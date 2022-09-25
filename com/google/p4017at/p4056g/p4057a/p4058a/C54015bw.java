package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.lens.p4707j.C62586t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bw */
/* compiled from: PG */
public final class C54015bw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54015bw f141726b;

    /* renamed from: c */
    private static volatile C63010eb f141727c;

    /* renamed from: a */
    public C62586t f141728a;

    static {
        C54015bw bwVar = new C54015bw();
        f141726b = bwVar;
        C62942bv.registerDefaultInstance(C54015bw.class, bwVar);
    }

    private C54015bw() {
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
                return newMessageInfo(f141726b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54015bw();
            case 4:
                return new C54014bv();
            case 5:
                return f141726b;
            case 6:
                C63010eb ebVar = f141727c;
                if (ebVar == null) {
                    synchronized (C54015bw.class) {
                        ebVar = f141727c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141726b);
                            f141727c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
