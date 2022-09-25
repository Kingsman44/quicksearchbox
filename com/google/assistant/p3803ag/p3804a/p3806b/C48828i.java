package com.google.assistant.p3803ag.p3804a.p3806b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.b.i */
/* compiled from: PG */
public final class C48828i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48828i f126333d;

    /* renamed from: f */
    private static volatile C63010eb f126334f;

    /* renamed from: a */
    public String f126335a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f126336b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C48827h f126337c;

    /* renamed from: e */
    private int f126338e;

    static {
        C48828i iVar = new C48828i();
        f126333d = iVar;
        C62942bv.registerDefaultInstance(C48828i.class, iVar);
    }

    private C48828i() {
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
                return newMessageInfo(f126333d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C48828i();
            case 4:
                return new C48825f();
            case 5:
                return f126333d;
            case 6:
                C63010eb ebVar = f126334f;
                if (ebVar == null) {
                    synchronized (C48828i.class) {
                        ebVar = f126334f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126333d);
                            f126334f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
