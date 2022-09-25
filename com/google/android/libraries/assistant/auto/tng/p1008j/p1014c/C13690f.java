package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.f */
/* compiled from: PG */
public final class C13690f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13690f f41773c;

    /* renamed from: d */
    private static volatile C63010eb f41774d;

    /* renamed from: a */
    public int f41775a;

    /* renamed from: b */
    public C51809dy f41776b;

    static {
        C13690f fVar = new C13690f();
        f41773c = fVar;
        C62942bv.registerDefaultInstance(C13690f.class, fVar);
    }

    private C13690f() {
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
                return newMessageInfo(f41773c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13690f();
            case 4:
                return new C13681e();
            case 5:
                return f41773c;
            case 6:
                C63010eb ebVar = f41774d;
                if (ebVar == null) {
                    synchronized (C13690f.class) {
                        ebVar = f41774d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41773c);
                            f41774d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
