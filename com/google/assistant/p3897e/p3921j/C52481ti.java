package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ti */
/* compiled from: PG */
public final class C52481ti extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52481ti f137762c;

    /* renamed from: d */
    private static volatile C63010eb f137763d;

    /* renamed from: a */
    public int f137764a;

    /* renamed from: b */
    public C52393qb f137765b;

    static {
        C52481ti tiVar = new C52481ti();
        f137762c = tiVar;
        C62942bv.registerDefaultInstance(C52481ti.class, tiVar);
    }

    private C52481ti() {
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
                return newMessageInfo(f137762c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52481ti();
            case 4:
                return new C52480th();
            case 5:
                return f137762c;
            case 6:
                C63010eb ebVar = f137763d;
                if (ebVar == null) {
                    synchronized (C52481ti.class) {
                        ebVar = f137763d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137762c);
                            f137763d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
