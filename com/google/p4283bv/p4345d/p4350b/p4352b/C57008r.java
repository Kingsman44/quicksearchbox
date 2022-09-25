package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.b.r */
/* compiled from: PG */
public final class C57008r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57008r f152181b;

    /* renamed from: d */
    private static volatile C63010eb f152182d;

    /* renamed from: a */
    public String f152183a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f152184c;

    static {
        C57008r rVar = new C57008r();
        f152181b = rVar;
        C62942bv.registerDefaultInstance(C57008r.class, rVar);
    }

    private C57008r() {
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
                return newMessageInfo(f152181b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57008r();
            case 4:
                return new C57007q();
            case 5:
                return f152181b;
            case 6:
                C63010eb ebVar = f152182d;
                if (ebVar == null) {
                    synchronized (C57008r.class) {
                        ebVar = f152182d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152181b);
                            f152182d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
