package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.ch */
/* compiled from: PG */
public final class C67705ch extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67705ch f183706c;

    /* renamed from: d */
    private static volatile C63010eb f183707d;

    /* renamed from: a */
    public C67707cj f183708a;

    /* renamed from: b */
    public int f183709b;

    static {
        C67705ch chVar = new C67705ch();
        f183706c = chVar;
        C62942bv.registerDefaultInstance(C67705ch.class, chVar);
    }

    private C67705ch() {
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
                return newMessageInfo(f183706c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"a", "b"});
            case 3:
                return new C67705ch();
            case 4:
                return new C67704cg();
            case 5:
                return f183706c;
            case 6:
                C63010eb ebVar = f183707d;
                if (ebVar == null) {
                    synchronized (C67705ch.class) {
                        ebVar = f183707d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183706c);
                            f183707d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
