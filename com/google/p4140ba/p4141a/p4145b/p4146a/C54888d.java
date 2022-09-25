package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.d */
/* compiled from: PG */
public final class C54888d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54888d f144213e;

    /* renamed from: f */
    private static volatile C63010eb f144214f;

    /* renamed from: a */
    public int f144215a;

    /* renamed from: b */
    public String f144216b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f144217c;

    /* renamed from: d */
    public float f144218d;

    static {
        C54888d dVar = new C54888d();
        f144213e = dVar;
        C62942bv.registerDefaultInstance(C54888d.class, dVar);
    }

    private C54888d() {
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
                return newMessageInfo(f144213e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0004ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C54888d();
            case 4:
                return new C54861c();
            case 5:
                return f144213e;
            case 6:
                C63010eb ebVar = f144214f;
                if (ebVar == null) {
                    synchronized (C54888d.class) {
                        ebVar = f144214f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144213e);
                            f144214f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
