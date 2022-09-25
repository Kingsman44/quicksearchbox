package com.google.p4017at.p4086k.p4087a.p4090b.p4091a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.b.a.d */
/* compiled from: PG */
public final class C54495d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54495d f143081e;

    /* renamed from: f */
    private static volatile C63010eb f143082f;

    /* renamed from: a */
    public String f143083a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f143084b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143085c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f143086d = BuildConfig.FLAVOR;

    static {
        C54495d dVar = new C54495d();
        f143081e = dVar;
        C62942bv.registerDefaultInstance(C54495d.class, dVar);
    }

    private C54495d() {
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
                return newMessageInfo(f143081e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54495d();
            case 4:
                return new C54494c();
            case 5:
                return f143081e;
            case 6:
                C63010eb ebVar = f143082f;
                if (ebVar == null) {
                    synchronized (C54495d.class) {
                        ebVar = f143082f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143081e);
                            f143082f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
