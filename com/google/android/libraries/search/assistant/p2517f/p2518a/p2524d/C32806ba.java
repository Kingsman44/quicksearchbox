package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ba */
/* compiled from: PG */
public final class C32806ba extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32806ba f87988c;

    /* renamed from: d */
    private static volatile C63010eb f87989d;

    /* renamed from: a */
    public int f87990a;

    /* renamed from: b */
    public C52230ka f87991b;

    static {
        C32806ba baVar = new C32806ba();
        f87988c = baVar;
        C62942bv.registerDefaultInstance(C32806ba.class, baVar);
    }

    private C32806ba() {
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
                return newMessageInfo(f87988c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32806ba();
            case 4:
                return new C32804az();
            case 5:
                return f87988c;
            case 6:
                C63010eb ebVar = f87989d;
                if (ebVar == null) {
                    synchronized (C32806ba.class) {
                        ebVar = f87989d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87988c);
                            f87989d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
