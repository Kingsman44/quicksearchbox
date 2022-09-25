package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.el */
/* compiled from: PG */
public final class C67763el extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67763el f183849c;

    /* renamed from: d */
    private static volatile C63010eb f183850d;

    /* renamed from: a */
    public int f183851a;

    /* renamed from: b */
    public C63088z f183852b = C63088z.f170246b;

    static {
        C67763el elVar = new C67763el();
        f183849c = elVar;
        C62942bv.registerDefaultInstance(C67763el.class, elVar);
    }

    private C67763el() {
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
                return newMessageInfo(f183849c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"a", "b"});
            case 3:
                return new C67763el();
            case 4:
                return new C67762ek();
            case 5:
                return f183849c;
            case 6:
                C63010eb ebVar = f183850d;
                if (ebVar == null) {
                    synchronized (C67763el.class) {
                        ebVar = f183850d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183849c);
                            f183850d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
