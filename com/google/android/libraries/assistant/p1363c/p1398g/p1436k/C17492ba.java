package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.c.g.k.ba */
/* compiled from: PG */
public final class C17492ba extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17492ba f50498c;

    /* renamed from: e */
    private static volatile C63010eb f50499e;

    /* renamed from: a */
    public C63088z f50500a = C63088z.f170246b;

    /* renamed from: b */
    public C17522y f50501b;

    /* renamed from: d */
    private int f50502d;

    static {
        C17492ba baVar = new C17492ba();
        f50498c = baVar;
        C62942bv.registerDefaultInstance(C17492ba.class, baVar);
    }

    private C17492ba() {
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
                return newMessageInfo(f50498c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C17492ba();
            case 4:
                return new C17490az();
            case 5:
                return f50498c;
            case 6:
                C63010eb ebVar = f50499e;
                if (ebVar == null) {
                    synchronized (C17492ba.class) {
                        ebVar = f50499e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50498c);
                            f50499e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
