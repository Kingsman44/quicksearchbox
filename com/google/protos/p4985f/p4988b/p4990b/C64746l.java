package com.google.protos.p4985f.p4988b.p4990b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.b.l */
/* compiled from: PG */
public final class C64746l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64746l f175506b;

    /* renamed from: d */
    private static volatile C63010eb f175507d;

    /* renamed from: a */
    public String f175508a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f175509c;

    static {
        C64746l lVar = new C64746l();
        f175506b = lVar;
        C62942bv.registerDefaultInstance(C64746l.class, lVar);
    }

    private C64746l() {
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
                return newMessageInfo(f175506b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C64746l();
            case 4:
                return new C64745k();
            case 5:
                return f175506b;
            case 6:
                C63010eb ebVar = f175507d;
                if (ebVar == null) {
                    synchronized (C64746l.class) {
                        ebVar = f175507d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175506b);
                            f175507d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
