package com.google.assistant.p3814ai.p3815a.p3816a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ai.a.a.i */
/* compiled from: PG */
public final class C49175i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49175i f127151d;

    /* renamed from: e */
    private static volatile C63010eb f127152e;

    /* renamed from: a */
    public int f127153a = 0;

    /* renamed from: b */
    public Object f127154b;

    /* renamed from: c */
    public String f127155c = BuildConfig.FLAVOR;

    static {
        C49175i iVar = new C49175i();
        f127151d = iVar;
        C62942bv.registerDefaultInstance(C49175i.class, iVar);
    }

    private C49175i() {
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
                return newMessageInfo(f127151d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, C49177k.class, C49168b.class, C49181o.class, C49185s.class});
            case 3:
                return new C49175i();
            case 4:
                return new C49173g();
            case 5:
                return f127151d;
            case 6:
                C63010eb ebVar = f127152e;
                if (ebVar == null) {
                    synchronized (C49175i.class) {
                        ebVar = f127152e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127151d);
                            f127152e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
