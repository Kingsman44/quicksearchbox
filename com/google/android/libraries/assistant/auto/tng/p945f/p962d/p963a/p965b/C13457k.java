package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p965b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.b.k */
/* compiled from: PG */
public final class C13457k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13457k f41295c;

    /* renamed from: d */
    private static volatile C63010eb f41296d;

    /* renamed from: a */
    public int f41297a = 0;

    /* renamed from: b */
    public Object f41298b;

    static {
        C13457k kVar = new C13457k();
        f41295c = kVar;
        C62942bv.registerDefaultInstance(C13457k.class, kVar);
    }

    private C13457k() {
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
                return newMessageInfo(f41295c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȼ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C13457k();
            case 4:
                return new C13456j();
            case 5:
                return f41295c;
            case 6:
                C63010eb ebVar = f41296d;
                if (ebVar == null) {
                    synchronized (C13457k.class) {
                        ebVar = f41296d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41295c);
                            f41296d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
