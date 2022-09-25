package com.google.android.apps.gsa.nga.engine.p6262y.p6265b.p6266a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.b.a.f */
/* compiled from: PG */
public final class C79899f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C79899f f218995c;

    /* renamed from: e */
    private static volatile C63010eb f218996e;

    /* renamed from: a */
    public String f218997a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f218998b = emptyProtobufList();

    /* renamed from: d */
    private int f218999d;

    static {
        C79899f fVar = new C79899f();
        f218995c = fVar;
        C62942bv.registerDefaultInstance(C79899f.class, fVar);
    }

    private C79899f() {
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
                return newMessageInfo(f218995c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C79895b.class});
            case 3:
                return new C79899f();
            case 4:
                return new C79898e();
            case 5:
                return f218995c;
            case 6:
                C63010eb ebVar = f218996e;
                if (ebVar == null) {
                    synchronized (C79899f.class) {
                        ebVar = f218996e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218995c);
                            f218996e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
