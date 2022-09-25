package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ay */
/* compiled from: PG */
public final class C97899ay extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C97899ay f273345d;

    /* renamed from: e */
    private static volatile C63010eb f273346e;

    /* renamed from: a */
    public int f273347a;

    /* renamed from: b */
    public C62971cq f273348b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f273349c = BuildConfig.FLAVOR;

    static {
        C97899ay ayVar = new C97899ay();
        f273345d = ayVar;
        C62942bv.registerDefaultInstance(C97899ay.class, ayVar);
    }

    private C97899ay() {
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
                return newMessageInfo(f273345d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001a\u0003ဈ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C97899ay();
            case 4:
                return new C97898ax();
            case 5:
                return f273345d;
            case 6:
                C63010eb ebVar = f273346e;
                if (ebVar == null) {
                    synchronized (C97899ay.class) {
                        ebVar = f273346e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273345d);
                            f273346e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
