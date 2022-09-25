package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.b.b.b.f */
/* compiled from: PG */
public final class C57707f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57707f f154171d;

    /* renamed from: e */
    private static volatile C63010eb f154172e;

    /* renamed from: a */
    public int f154173a;

    /* renamed from: b */
    public String f154174b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C57711j f154175c;

    static {
        C57707f fVar = new C57707f();
        f154171d = fVar;
        C62942bv.registerDefaultInstance(C57707f.class, fVar);
    }

    private C57707f() {
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
                return newMessageInfo(f154171d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57707f();
            case 4:
                return new C57706e();
            case 5:
                return f154171d;
            case 6:
                C63010eb ebVar = f154172e;
                if (ebVar == null) {
                    synchronized (C57707f.class) {
                        ebVar = f154172e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154171d);
                            f154172e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
