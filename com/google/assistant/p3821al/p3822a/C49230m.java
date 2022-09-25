package com.google.assistant.p3821al.p3822a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.m */
/* compiled from: PG */
public final class C49230m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49230m f127277e;

    /* renamed from: f */
    private static volatile C63010eb f127278f;

    /* renamed from: a */
    public int f127279a;

    /* renamed from: b */
    public int f127280b = 0;

    /* renamed from: c */
    public Object f127281c;

    /* renamed from: d */
    public String f127282d = BuildConfig.FLAVOR;

    static {
        C49230m mVar = new C49230m();
        f127277e = mVar;
        C62942bv.registerDefaultInstance(C49230m.class, mVar);
    }

    private C49230m() {
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
                return newMessageInfo(f127277e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဈ\u0003", new Object[]{C45240c.f118157a, "b", "a", C49223f.class, C49225h.class, C49227j.class, "d"});
            case 3:
                return new C49230m();
            case 4:
                return new C49221d();
            case 5:
                return f127277e;
            case 6:
                C63010eb ebVar = f127278f;
                if (ebVar == null) {
                    synchronized (C49230m.class) {
                        ebVar = f127278f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127277e);
                            f127278f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
