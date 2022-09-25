package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.ba */
/* compiled from: PG */
public final class C67671ba extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67671ba f183640b;

    /* renamed from: c */
    private static volatile C63010eb f183641c;

    /* renamed from: a */
    public C67673bc f183642a;

    static {
        C67671ba baVar = new C67671ba();
        f183640b = baVar;
        C62942bv.registerDefaultInstance(C67671ba.class, baVar);
    }

    private C67671ba() {
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
                return newMessageInfo(f183640b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C67671ba();
            case 4:
                return new C67669az();
            case 5:
                return f183640b;
            case 6:
                C63010eb ebVar = f183641c;
                if (ebVar == null) {
                    synchronized (C67671ba.class) {
                        ebVar = f183641c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183640b);
                            f183641c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
