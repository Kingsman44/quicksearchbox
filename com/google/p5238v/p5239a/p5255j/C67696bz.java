package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.bz */
/* compiled from: PG */
public final class C67696bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67696bz f183693c;

    /* renamed from: d */
    private static volatile C63010eb f183694d;

    /* renamed from: a */
    public int f183695a;

    /* renamed from: b */
    public C63088z f183696b = C63088z.f170246b;

    static {
        C67696bz bzVar = new C67696bz();
        f183693c = bzVar;
        C62942bv.registerDefaultInstance(C67696bz.class, bzVar);
    }

    private C67696bz() {
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
                return newMessageInfo(f183693c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C67696bz();
            case 4:
                return new C67695by();
            case 5:
                return f183693c;
            case 6:
                C63010eb ebVar = f183694d;
                if (ebVar == null) {
                    synchronized (C67696bz.class) {
                        ebVar = f183694d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183693c);
                            f183694d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
