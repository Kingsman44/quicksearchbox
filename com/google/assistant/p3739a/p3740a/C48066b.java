package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.b */
/* compiled from: PG */
public final class C48066b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48066b f124401d;

    /* renamed from: e */
    private static volatile C63010eb f124402e;

    /* renamed from: a */
    public int f124403a = 0;

    /* renamed from: b */
    public Object f124404b;

    /* renamed from: c */
    public String f124405c = BuildConfig.FLAVOR;

    static {
        C48066b bVar = new C48066b();
        f124401d = bVar;
        C62942bv.registerDefaultInstance(C48066b.class, bVar);
    }

    private C48066b() {
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
                return newMessageInfo(f124401d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C48066b();
            case 4:
                return new C48039a();
            case 5:
                return f124401d;
            case 6:
                C63010eb ebVar = f124402e;
                if (ebVar == null) {
                    synchronized (C48066b.class) {
                        ebVar = f124402e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124401d);
                            f124402e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
