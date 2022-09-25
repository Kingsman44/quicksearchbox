package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qt */
/* compiled from: PG */
public final class C7971qt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7971qt f27997c;

    /* renamed from: d */
    private static volatile C63010eb f27998d;

    /* renamed from: a */
    public int f27999a;

    /* renamed from: b */
    public String f28000b = BuildConfig.FLAVOR;

    static {
        C7971qt qtVar = new C7971qt();
        f27997c = qtVar;
        C62942bv.registerDefaultInstance(C7971qt.class, qtVar);
    }

    private C7971qt() {
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
                return newMessageInfo(f27997c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7971qt();
            case 4:
                return new C7970qs();
            case 5:
                return f27997c;
            case 6:
                C63010eb ebVar = f27998d;
                if (ebVar == null) {
                    synchronized (C7971qt.class) {
                        ebVar = f27998d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27997c);
                            f27998d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
