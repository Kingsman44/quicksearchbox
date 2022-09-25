package com.google.assistant.p3745ab.p3767s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.s.b */
/* compiled from: PG */
public final class C48395b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48395b f125088a;

    /* renamed from: b */
    private static volatile C63010eb f125089b;

    static {
        C48395b bVar = new C48395b();
        f125088a = bVar;
        C62942bv.registerDefaultInstance(C48395b.class, bVar);
    }

    private C48395b() {
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
                return newMessageInfo(f125088a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48395b();
            case 4:
                return new C48394a();
            case 5:
                return f125088a;
            case 6:
                C63010eb ebVar = f125089b;
                if (ebVar == null) {
                    synchronized (C48395b.class) {
                        ebVar = f125089b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125088a);
                            f125089b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
