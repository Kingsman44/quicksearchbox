package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.e */
/* compiled from: PG */
public final class C55497e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55497e f146447d;

    /* renamed from: e */
    private static volatile C63010eb f146448e;

    /* renamed from: a */
    public int f146449a;

    /* renamed from: b */
    public String f146450b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f146451c;

    static {
        C55497e eVar = new C55497e();
        f146447d = eVar;
        C62942bv.registerDefaultInstance(C55497e.class, eVar);
    }

    private C55497e() {
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
                return newMessageInfo(f146447d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C55496d.f146446a});
            case 3:
                return new C55497e();
            case 4:
                return new C55490c();
            case 5:
                return f146447d;
            case 6:
                C63010eb ebVar = f146448e;
                if (ebVar == null) {
                    synchronized (C55497e.class) {
                        ebVar = f146448e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146447d);
                            f146448e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
