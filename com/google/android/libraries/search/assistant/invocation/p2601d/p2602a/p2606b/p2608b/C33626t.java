package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.t */
/* compiled from: PG */
public final class C33626t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33626t f89860a;

    /* renamed from: c */
    private static volatile C63010eb f89861c;

    /* renamed from: b */
    private byte f89862b = 2;

    static {
        C33626t tVar = new C33626t();
        f89860a = tVar;
        C62942bv.registerDefaultInstance(C33626t.class, tVar);
    }

    private C33626t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89862b);
            case 1:
                this.f89862b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f89860a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33626t();
            case 4:
                return new C33625s();
            case 5:
                return f89860a;
            case 6:
                C63010eb ebVar = f89861c;
                if (ebVar == null) {
                    synchronized (C33626t.class) {
                        ebVar = f89861c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89860a);
                            f89861c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
