package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4757ac.p4758a.C63113l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.ag */
/* compiled from: PG */
public final class C97881ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97881ag f273295e;

    /* renamed from: f */
    private static volatile C63010eb f273296f;

    /* renamed from: a */
    public int f273297a;

    /* renamed from: b */
    public String f273298b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f273299c = emptyProtobufList();

    /* renamed from: d */
    public C63113l f273300d;

    static {
        C97881ag agVar = new C97881ag();
        f273295e = agVar;
        C62942bv.registerDefaultInstance(C97881ag.class, agVar);
    }

    private C97881ag() {
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
                return newMessageInfo(f273295e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C97885ak.class, "d"});
            case 3:
                return new C97881ag();
            case 4:
                return new C97880af();
            case 5:
                return f273295e;
            case 6:
                C63010eb ebVar = f273296f;
                if (ebVar == null) {
                    synchronized (C97881ag.class) {
                        ebVar = f273296f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273295e);
                            f273296f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
