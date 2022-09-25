package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.k */
/* compiled from: PG */
public final class C33617k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33617k f89844c;

    /* renamed from: d */
    private static volatile C63010eb f89845d;

    /* renamed from: a */
    public int f89846a;

    /* renamed from: b */
    public String f89847b = BuildConfig.FLAVOR;

    static {
        C33617k kVar = new C33617k();
        f89844c = kVar;
        C62942bv.registerDefaultInstance(C33617k.class, kVar);
    }

    private C33617k() {
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
                return newMessageInfo(f89844c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C33617k();
            case 4:
                return new C33615i();
            case 5:
                return f89844c;
            case 6:
                C63010eb ebVar = f89845d;
                if (ebVar == null) {
                    synchronized (C33617k.class) {
                        ebVar = f89845d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89844c);
                            f89845d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
