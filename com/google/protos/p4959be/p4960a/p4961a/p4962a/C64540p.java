package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.p */
/* compiled from: PG */
public final class C64540p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64540p f175033e;

    /* renamed from: f */
    private static volatile C63010eb f175034f;

    /* renamed from: a */
    public String f175035a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f175036b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f175037c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f175038d = emptyIntList();

    static {
        C64540p pVar = new C64540p();
        f175033e = pVar;
        C62942bv.registerDefaultInstance(C64540p.class, pVar);
    }

    private C64540p() {
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
                return newMessageInfo(f175033e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64540p();
            case 4:
                return new C64539o();
            case 5:
                return f175033e;
            case 6:
                C63010eb ebVar = f175034f;
                if (ebVar == null) {
                    synchronized (C64540p.class) {
                        ebVar = f175034f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175033e);
                            f175034f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
