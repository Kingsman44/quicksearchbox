package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.bb */
/* compiled from: PG */
public final class C66095bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66095bb f179730d;

    /* renamed from: e */
    private static volatile C63010eb f179731e;

    /* renamed from: a */
    public int f179732a;

    /* renamed from: b */
    public C66086at f179733b;

    /* renamed from: c */
    public String f179734c = BuildConfig.FLAVOR;

    static {
        C66095bb bbVar = new C66095bb();
        f179730d = bbVar;
        C62942bv.registerDefaultInstance(C66095bb.class, bbVar);
    }

    private C66095bb() {
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
                return newMessageInfo(f179730d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66095bb();
            case 4:
                return new C66094ba();
            case 5:
                return f179730d;
            case 6:
                C63010eb ebVar = f179731e;
                if (ebVar == null) {
                    synchronized (C66095bb.class) {
                        ebVar = f179731e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179730d);
                            f179731e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
