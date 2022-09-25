package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.s */
/* compiled from: PG */
public final class C34309s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34309s f91237b;

    /* renamed from: c */
    private static volatile C63010eb f91238c;

    /* renamed from: a */
    public String f91239a = BuildConfig.FLAVOR;

    static {
        C34309s sVar = new C34309s();
        f91237b = sVar;
        C62942bv.registerDefaultInstance(C34309s.class, sVar);
    }

    private C34309s() {
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
                return newMessageInfo(f91237b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C34309s();
            case 4:
                return new C34308r();
            case 5:
                return f91237b;
            case 6:
                C63010eb ebVar = f91238c;
                if (ebVar == null) {
                    synchronized (C34309s.class) {
                        ebVar = f91238c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91237b);
                            f91238c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
