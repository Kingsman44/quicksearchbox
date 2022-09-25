package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ku */
/* compiled from: PG */
public final class C51521ku extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51521ku f134252e;

    /* renamed from: f */
    private static volatile C63010eb f134253f;

    /* renamed from: a */
    public int f134254a;

    /* renamed from: b */
    public String f134255b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f134256c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f134257d = C62942bv.emptyProtobufList();

    static {
        C51521ku kuVar = new C51521ku();
        f134252e = kuVar;
        C62942bv.registerDefaultInstance(C51521ku.class, kuVar);
    }

    private C51521ku() {
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
                return newMessageInfo(f134252e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51521ku();
            case 4:
                return new C51520kt();
            case 5:
                return f134252e;
            case 6:
                C63010eb ebVar = f134253f;
                if (ebVar == null) {
                    synchronized (C51521ku.class) {
                        ebVar = f134253f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134252e);
                            f134253f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
