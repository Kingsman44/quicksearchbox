package com.google.assistant.p3739a.p3740a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3996t.p3997a.C53479f;
import com.google.assistant.p3996t.p3997a.C53483j;
import com.google.assistant.p3996t.p3997a.C53489p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.a.a.af */
/* compiled from: PG */
public final class C48045af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48045af f124365d;

    /* renamed from: e */
    private static volatile C63010eb f124366e;

    /* renamed from: a */
    public C53489p f124367a;

    /* renamed from: b */
    public C53479f f124368b;

    /* renamed from: c */
    public C53483j f124369c;

    static {
        C48045af afVar = new C48045af();
        f124365d = afVar;
        C62942bv.registerDefaultInstance(C48045af.class, afVar);
    }

    private C48045af() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f124365d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48045af();
            case 4:
                return new C48044ae();
            case 5:
                return f124365d;
            case 6:
                C63010eb ebVar = f124366e;
                if (ebVar == null) {
                    synchronized (C48045af.class) {
                        ebVar = f124366e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124365d);
                            f124366e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
