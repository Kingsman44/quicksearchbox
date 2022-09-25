package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5232b.C67400ap;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.sc */
/* compiled from: PG */
public final class C88180sc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88180sc f238376c;

    /* renamed from: e */
    private static volatile C63010eb f238377e;

    /* renamed from: a */
    public int f238378a;

    /* renamed from: b */
    public C67400ap f238379b;

    /* renamed from: d */
    private byte f238380d = 2;

    static {
        C88180sc scVar = new C88180sc();
        f238376c = scVar;
        C62942bv.registerDefaultInstance(C88180sc.class, scVar);
    }

    private C88180sc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238380d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238380d = b;
                return null;
            case 2:
                return newMessageInfo(f238376c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88180sc();
            case 4:
                return new C88179sb();
            case 5:
                return f238376c;
            case 6:
                C63010eb ebVar = f238377e;
                if (ebVar == null) {
                    synchronized (C88180sc.class) {
                        ebVar = f238377e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238376c);
                            f238377e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
