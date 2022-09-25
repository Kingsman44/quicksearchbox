package com.google.protos.p4985f.p4988b.p4993d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.d.d */
/* compiled from: PG */
public final class C64784d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64784d f175584d;

    /* renamed from: e */
    private static volatile C63010eb f175585e;

    /* renamed from: a */
    public int f175586a;

    /* renamed from: b */
    public String f175587b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f175588c = emptyProtobufList();

    static {
        C64784d dVar = new C64784d();
        f175584d = dVar;
        C62942bv.registerDefaultInstance(C64784d.class, dVar);
    }

    private C64784d() {
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
                return newMessageInfo(f175584d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C64786f.class});
            case 3:
                return new C64784d();
            case 4:
                return new C64783c();
            case 5:
                return f175584d;
            case 6:
                C63010eb ebVar = f175585e;
                if (ebVar == null) {
                    synchronized (C64784d.class) {
                        ebVar = f175585e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175584d);
                            f175585e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
