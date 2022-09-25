package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.x */
/* compiled from: PG */
public final class C33630x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33630x f89865b;

    /* renamed from: d */
    private static volatile C63010eb f89866d;

    /* renamed from: a */
    public C34053bp f89867a;

    /* renamed from: c */
    private byte f89868c = 2;

    static {
        C33630x xVar = new C33630x();
        f89865b = xVar;
        C62942bv.registerDefaultInstance(C33630x.class, xVar);
    }

    private C33630x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f89868c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f89868c = b;
                return null;
            case 2:
                return newMessageInfo(f89865b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C33630x();
            case 4:
                return new C33629w();
            case 5:
                return f89865b;
            case 6:
                C63010eb ebVar = f89866d;
                if (ebVar == null) {
                    synchronized (C33630x.class) {
                        ebVar = f89866d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89865b);
                            f89866d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
