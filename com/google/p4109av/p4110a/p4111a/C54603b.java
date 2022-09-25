package com.google.p4109av.p4110a.p4111a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.av.a.a.b */
/* compiled from: PG */
public final class C54603b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54603b f143360d;

    /* renamed from: e */
    private static volatile C63010eb f143361e;

    /* renamed from: a */
    public int f143362a;

    /* renamed from: b */
    public String f143363b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143364c = BuildConfig.FLAVOR;

    static {
        C54603b bVar = new C54603b();
        f143360d = bVar;
        C62942bv.registerDefaultInstance(C54603b.class, bVar);
    }

    private C54603b() {
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
                return newMessageInfo(f143360d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54603b();
            case 4:
                return new C54602a();
            case 5:
                return f143360d;
            case 6:
                C63010eb ebVar = f143361e;
                if (ebVar == null) {
                    synchronized (C54603b.class) {
                        ebVar = f143361e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143360d);
                            f143361e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
