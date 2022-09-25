package com.google.common.p4552o.p4554b.p4555a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.af */
/* compiled from: PG */
public final class C59610af extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59610af f159830g;

    /* renamed from: h */
    private static volatile C63010eb f159831h;

    /* renamed from: a */
    public int f159832a;

    /* renamed from: b */
    public int f159833b = 0;

    /* renamed from: c */
    public Object f159834c;

    /* renamed from: d */
    public int f159835d = 0;

    /* renamed from: e */
    public Object f159836e;

    /* renamed from: f */
    public String f159837f = BuildConfig.FLAVOR;

    static {
        C59610af afVar = new C59610af();
        f159830g = afVar;
        C62942bv.registerDefaultInstance(C59610af.class, afVar);
    }

    private C59610af() {
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
                return newMessageInfo(f159830g, "\u0001\u0006\u0002\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001\u0005ဈ\u0005\u0006ြ\u0001", new Object[]{C45240c.f118157a, "b", "e", "d", "a", C59646z.class, C59608ad.class, C59606ab.class, C59638r.class, C10662f.f35572a, C59641u.class});
            case 3:
                return new C59610af();
            case 4:
                return new C59642v();
            case 5:
                return f159830g;
            case 6:
                C63010eb ebVar = f159831h;
                if (ebVar == null) {
                    synchronized (C59610af.class) {
                        ebVar = f159831h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159830g);
                            f159831h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
