package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.p4944a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.a.b */
/* compiled from: PG */
public final class C64281b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64281b f173807b;

    /* renamed from: d */
    private static volatile C63010eb f173808d;

    /* renamed from: a */
    public String f173809a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f173810c;

    static {
        C64281b bVar = new C64281b();
        f173807b = bVar;
        C62942bv.registerDefaultInstance(C64281b.class, bVar);
    }

    private C64281b() {
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
                return newMessageInfo(f173807b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C64281b();
            case 4:
                return new C64280a();
            case 5:
                return f173807b;
            case 6:
                C63010eb ebVar = f173808d;
                if (ebVar == null) {
                    synchronized (C64281b.class) {
                        ebVar = f173808d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173807b);
                            f173808d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
