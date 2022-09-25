package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.bl */
/* compiled from: PG */
public final class C67682bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67682bl f183662b;

    /* renamed from: c */
    private static volatile C63010eb f183663c;

    /* renamed from: a */
    public C67684bn f183664a;

    static {
        C67682bl blVar = new C67682bl();
        f183662b = blVar;
        C62942bv.registerDefaultInstance(C67682bl.class, blVar);
    }

    private C67682bl() {
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
                return newMessageInfo(f183662b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C67682bl();
            case 4:
                return new C67681bk();
            case 5:
                return f183662b;
            case 6:
                C63010eb ebVar = f183663c;
                if (ebVar == null) {
                    synchronized (C67682bl.class) {
                        ebVar = f183663c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183662b);
                            f183663c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
