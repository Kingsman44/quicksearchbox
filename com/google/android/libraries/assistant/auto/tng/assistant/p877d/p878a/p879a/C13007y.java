package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.y */
/* compiled from: PG */
public final class C13007y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C13007y f40413d;

    /* renamed from: e */
    private static volatile C63010eb f40414e;

    /* renamed from: a */
    public int f40415a;

    /* renamed from: b */
    public long f40416b;

    /* renamed from: c */
    public String f40417c = BuildConfig.FLAVOR;

    static {
        C13007y yVar = new C13007y();
        f40413d = yVar;
        C62942bv.registerDefaultInstance(C13007y.class, yVar);
    }

    private C13007y() {
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
                return newMessageInfo(f40413d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C13007y();
            case 4:
                return new C13006x();
            case 5:
                return f40413d;
            case 6:
                C63010eb ebVar = f40414e;
                if (ebVar == null) {
                    synchronized (C13007y.class) {
                        ebVar = f40414e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40413d);
                            f40414e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
