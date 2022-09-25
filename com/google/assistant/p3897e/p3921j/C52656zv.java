package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.zv */
/* compiled from: PG */
public final class C52656zv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52656zv f138239c;

    /* renamed from: d */
    private static volatile C63010eb f138240d;

    /* renamed from: a */
    public int f138241a;

    /* renamed from: b */
    public boolean f138242b;

    static {
        C52656zv zvVar = new C52656zv();
        f138239c = zvVar;
        C62942bv.registerDefaultInstance(C52656zv.class, zvVar);
    }

    private C52656zv() {
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
                return newMessageInfo(f138239c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52656zv();
            case 4:
                return new C52655zu();
            case 5:
                return f138239c;
            case 6:
                C63010eb ebVar = f138240d;
                if (ebVar == null) {
                    synchronized (C52656zv.class) {
                        ebVar = f138240d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138239c);
                            f138240d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
