package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.e */
/* compiled from: PG */
public final class C135802e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C135802e f369899e;

    /* renamed from: f */
    private static volatile C63010eb f369900f;

    /* renamed from: a */
    public int f369901a;

    /* renamed from: b */
    public String f369902b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f369903c;

    /* renamed from: d */
    public C62971cq f369904d = emptyProtobufList();

    static {
        C135802e eVar = new C135802e();
        f369899e = eVar;
        C62942bv.registerDefaultInstance(C135802e.class, eVar);
    }

    private C135802e() {
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
                return newMessageInfo(f369899e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0001\u0002\u001b\u0003ဈ\u0000", new Object[]{"a", C45240c.f118157a, "d", C135801d.class, "b"});
            case 3:
                return new C135802e();
            case 4:
                return new C135799b();
            case 5:
                return f369899e;
            case 6:
                C63010eb ebVar = f369900f;
                if (ebVar == null) {
                    synchronized (C135802e.class) {
                        ebVar = f369900f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369899e);
                            f369900f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
