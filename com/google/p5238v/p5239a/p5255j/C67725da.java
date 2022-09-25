package com.google.p5238v.p5239a.p5255j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.da */
/* compiled from: PG */
public final class C67725da extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67725da f183749d;

    /* renamed from: e */
    private static volatile C63010eb f183750e;

    /* renamed from: a */
    public String f183751a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f183752b = C63088z.f170246b;

    /* renamed from: c */
    public int f183753c;

    static {
        C67725da daVar = new C67725da();
        f183749d = daVar;
        C62942bv.registerDefaultInstance(C67725da.class, daVar);
    }

    private C67725da() {
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
                return newMessageInfo(f183749d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67725da();
            case 4:
                return new C67723cz();
            case 5:
                return f183749d;
            case 6:
                C63010eb ebVar = f183750e;
                if (ebVar == null) {
                    synchronized (C67725da.class) {
                        ebVar = f183750e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183749d);
                            f183750e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
