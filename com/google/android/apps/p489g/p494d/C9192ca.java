package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ca */
/* compiled from: PG */
public final class C9192ca extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9192ca f31740d;

    /* renamed from: e */
    private static volatile C63010eb f31741e;

    /* renamed from: a */
    public int f31742a;

    /* renamed from: b */
    public String f31743b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f31744c = C62942bv.emptyProtobufList();

    static {
        C9192ca caVar = new C9192ca();
        f31740d = caVar;
        C62942bv.registerDefaultInstance(C9192ca.class, caVar);
    }

    private C9192ca() {
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
                return newMessageInfo(f31740d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9192ca();
            case 4:
                return new C9190bz();
            case 5:
                return f31740d;
            case 6:
                C63010eb ebVar = f31741e;
                if (ebVar == null) {
                    synchronized (C9192ca.class) {
                        ebVar = f31741e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31740d);
                            f31741e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
