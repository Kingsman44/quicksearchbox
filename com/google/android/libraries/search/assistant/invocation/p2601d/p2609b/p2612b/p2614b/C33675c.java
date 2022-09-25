package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.c */
/* compiled from: PG */
public final class C33675c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33675c f89983c;

    /* renamed from: d */
    private static volatile C63010eb f89984d;

    /* renamed from: a */
    public int f89985a;

    /* renamed from: b */
    public String f89986b = BuildConfig.FLAVOR;

    static {
        C33675c cVar = new C33675c();
        f89983c = cVar;
        C62942bv.registerDefaultInstance(C33675c.class, cVar);
    }

    private C33675c() {
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
                return newMessageInfo(f89983c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C33675c();
            case 4:
                return new C33667a();
            case 5:
                return f89983c;
            case 6:
                C63010eb ebVar = f89984d;
                if (ebVar == null) {
                    synchronized (C33675c.class) {
                        ebVar = f89984d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89983c);
                            f89984d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
