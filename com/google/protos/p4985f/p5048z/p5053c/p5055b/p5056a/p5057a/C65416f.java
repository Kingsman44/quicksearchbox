package com.google.protos.p4985f.p5048z.p5053c.p5055b.p5056a.p5057a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.c.b.a.a.f */
/* compiled from: PG */
public final class C65416f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65416f f177840d;

    /* renamed from: e */
    private static volatile C63010eb f177841e;

    /* renamed from: a */
    public int f177842a;

    /* renamed from: b */
    public String f177843b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f177844c = BuildConfig.FLAVOR;

    static {
        C65416f fVar = new C65416f();
        f177840d = fVar;
        C62942bv.registerDefaultInstance(C65416f.class, fVar);
    }

    private C65416f() {
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
                return newMessageInfo(f177840d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65416f();
            case 4:
                return new C65415e();
            case 5:
                return f177840d;
            case 6:
                C63010eb ebVar = f177841e;
                if (ebVar == null) {
                    synchronized (C65416f.class) {
                        ebVar = f177841e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177840d);
                            f177841e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
