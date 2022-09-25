package com.google.assistant.p3944g.p3945a.p3947b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.a.b.b */
/* compiled from: PG */
public final class C52926b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52926b f138768c;

    /* renamed from: d */
    private static volatile C63010eb f138769d;

    /* renamed from: a */
    public int f138770a;

    /* renamed from: b */
    public boolean f138771b;

    static {
        C52926b bVar = new C52926b();
        f138768c = bVar;
        C62942bv.registerDefaultInstance(C52926b.class, bVar);
    }

    private C52926b() {
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
                return newMessageInfo(f138768c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52926b();
            case 4:
                return new C52925a();
            case 5:
                return f138768c;
            case 6:
                C63010eb ebVar = f138769d;
                if (ebVar == null) {
                    synchronized (C52926b.class) {
                        ebVar = f138769d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138768c);
                            f138769d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
