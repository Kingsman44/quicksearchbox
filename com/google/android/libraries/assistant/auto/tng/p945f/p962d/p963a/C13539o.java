package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.o */
/* compiled from: PG */
public final class C13539o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13539o f41487c;

    /* renamed from: d */
    private static volatile C63010eb f41488d;

    /* renamed from: a */
    public int f41489a;

    /* renamed from: b */
    public int f41490b;

    static {
        C13539o oVar = new C13539o();
        f41487c = oVar;
        C62942bv.registerDefaultInstance(C13539o.class, oVar);
    }

    private C13539o() {
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
                return newMessageInfo(f41487c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C13539o();
            case 4:
                return new C13538n();
            case 5:
                return f41487c;
            case 6:
                C63010eb ebVar = f41488d;
                if (ebVar == null) {
                    synchronized (C13539o.class) {
                        ebVar = f41488d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41487c);
                            f41488d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
