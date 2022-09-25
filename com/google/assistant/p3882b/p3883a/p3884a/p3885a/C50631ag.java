package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.ag */
/* compiled from: PG */
public final class C50631ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50631ag f131717c;

    /* renamed from: d */
    private static volatile C63010eb f131718d;

    /* renamed from: a */
    public int f131719a = 0;

    /* renamed from: b */
    public Object f131720b;

    static {
        C50631ag agVar = new C50631ag();
        f131717c = agVar;
        C62942bv.registerDefaultInstance(C50631ag.class, agVar);
    }

    private C50631ag() {
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
                return newMessageInfo(f131717c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C50631ag();
            case 4:
                return new C50630af();
            case 5:
                return f131717c;
            case 6:
                C63010eb ebVar = f131718d;
                if (ebVar == null) {
                    synchronized (C50631ag.class) {
                        ebVar = f131718d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131717c);
                            f131718d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
