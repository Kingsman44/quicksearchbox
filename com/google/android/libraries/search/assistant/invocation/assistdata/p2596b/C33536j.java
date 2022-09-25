package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.j */
/* compiled from: PG */
public final class C33536j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33536j f89702b;

    /* renamed from: c */
    private static volatile C63010eb f89703c;

    /* renamed from: a */
    public String f89704a = BuildConfig.FLAVOR;

    static {
        C33536j jVar = new C33536j();
        f89702b = jVar;
        C62942bv.registerDefaultInstance(C33536j.class, jVar);
    }

    private C33536j() {
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
                return newMessageInfo(f89702b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C33536j();
            case 4:
                return new C33535i();
            case 5:
                return f89702b;
            case 6:
                C63010eb ebVar = f89703c;
                if (ebVar == null) {
                    synchronized (C33536j.class) {
                        ebVar = f89703c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89702b);
                            f89703c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
