package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.ay */
/* compiled from: PG */
public final class C13037ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13037ay f40467c;

    /* renamed from: d */
    private static volatile C63010eb f40468d;

    /* renamed from: a */
    public int f40469a;

    /* renamed from: b */
    public int f40470b;

    static {
        C13037ay ayVar = new C13037ay();
        f40467c = ayVar;
        C62942bv.registerDefaultInstance(C13037ay.class, ayVar);
    }

    private C13037ay() {
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
                return newMessageInfo(f40467c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C13035aw.f40466a});
            case 3:
                return new C13037ay();
            case 4:
                return new C13034av();
            case 5:
                return f40467c;
            case 6:
                C63010eb ebVar = f40468d;
                if (ebVar == null) {
                    synchronized (C13037ay.class) {
                        ebVar = f40468d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40467c);
                            f40468d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
