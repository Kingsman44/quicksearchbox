package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.gt */
/* compiled from: PG */
public final class C52141gt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52141gt f136816c;

    /* renamed from: e */
    private static volatile C63010eb f136817e;

    /* renamed from: a */
    public int f136818a;

    /* renamed from: b */
    public C63088z f136819b = C63088z.f170246b;

    /* renamed from: d */
    private int f136820d;

    static {
        C52141gt gtVar = new C52141gt();
        f136816c = gtVar;
        C62942bv.registerDefaultInstance(C52141gt.class, gtVar);
    }

    private C52141gt() {
    }

    /* renamed from: b */
    public static C63010eb m86520b() {
        return f136816c.getParserForType();
    }

    /* renamed from: a */
    public final boolean mo53802a() {
        return (this.f136818a & 1) != 0;
    }

    /* renamed from: c */
    public final int mo53803c() {
        int a = C52140gs.m86519a(this.f136820d);
        if (a == 0) {
            return 1;
        }
        return a;
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
                return newMessageInfo(f136816c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "d", C52139gr.f136815a});
            case 3:
                return new C52141gt();
            case 4:
                return new C52138gq();
            case 5:
                return f136816c;
            case 6:
                C63010eb ebVar = f136817e;
                if (ebVar == null) {
                    synchronized (C52141gt.class) {
                        ebVar = f136817e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136816c);
                            f136817e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
