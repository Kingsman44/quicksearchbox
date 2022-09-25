package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.as */
/* compiled from: PG */
public final class C121836as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121836as f338071c;

    /* renamed from: d */
    private static volatile C63010eb f338072d;

    /* renamed from: a */
    public int f338073a = 0;

    /* renamed from: b */
    public Object f338074b;

    static {
        C121836as asVar = new C121836as();
        f338071c = asVar;
        C62942bv.registerDefaultInstance(C121836as.class, asVar);
    }

    private C121836as() {
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
                return newMessageInfo(f338071c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C121843az.class, C121831an.class});
            case 3:
                return new C121836as();
            case 4:
                return new C121835ar();
            case 5:
                return f338071c;
            case 6:
                C63010eb ebVar = f338072d;
                if (ebVar == null) {
                    synchronized (C121836as.class) {
                        ebVar = f338072d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338071c);
                            f338072d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
