package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.al */
/* compiled from: PG */
public final class C52862al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52862al f138692c;

    /* renamed from: d */
    private static volatile C63010eb f138693d;

    /* renamed from: a */
    public int f138694a;

    /* renamed from: b */
    public C52846w f138695b;

    static {
        C52862al alVar = new C52862al();
        f138692c = alVar;
        C62942bv.registerDefaultInstance(C52862al.class, alVar);
    }

    private C52862al() {
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
                return newMessageInfo(f138692c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C52862al();
            case 4:
                return new C52861ak();
            case 5:
                return f138692c;
            case 6:
                C63010eb ebVar = f138693d;
                if (ebVar == null) {
                    synchronized (C52862al.class) {
                        ebVar = f138693d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138692c);
                            f138693d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
