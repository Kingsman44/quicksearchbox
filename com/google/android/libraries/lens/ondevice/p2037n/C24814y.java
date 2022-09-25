package com.google.android.libraries.lens.ondevice.p2037n;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.y */
/* compiled from: PG */
public final class C24814y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24814y f67826d;

    /* renamed from: e */
    private static volatile C63010eb f67827e;

    /* renamed from: a */
    public int f67828a;

    /* renamed from: b */
    public String f67829b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f67830c = emptyProtobufList();

    static {
        C24814y yVar = new C24814y();
        f67826d = yVar;
        C62942bv.registerDefaultInstance(C24814y.class, yVar);
    }

    private C24814y() {
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
                return newMessageInfo(f67826d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C24778ak.class});
            case 3:
                return new C24814y();
            case 4:
                return new C24813x();
            case 5:
                return f67826d;
            case 6:
                C63010eb ebVar = f67827e;
                if (ebVar == null) {
                    synchronized (C24814y.class) {
                        ebVar = f67827e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67826d);
                            f67827e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
