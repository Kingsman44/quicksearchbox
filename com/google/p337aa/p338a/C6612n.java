package com.google.p337aa.p338a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.aa.a.n */
/* compiled from: PG */
public final class C6612n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C6612n f19640b;

    /* renamed from: d */
    private static volatile C63010eb f19641d;

    /* renamed from: a */
    public String f19642a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f19643c;

    static {
        C6612n nVar = new C6612n();
        f19640b = nVar;
        C62942bv.registerDefaultInstance(C6612n.class, nVar);
    }

    private C6612n() {
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
                return newMessageInfo(f19640b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C6612n();
            case 4:
                return new C6611m();
            case 5:
                return f19640b;
            case 6:
                C63010eb ebVar = f19641d;
                if (ebVar == null) {
                    synchronized (C6612n.class) {
                        ebVar = f19641d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19640b);
                            f19641d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
