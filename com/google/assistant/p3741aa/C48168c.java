package com.google.assistant.p3741aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.c */
/* compiled from: PG */
public final class C48168c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48168c f124629e;

    /* renamed from: f */
    private static volatile C63010eb f124630f;

    /* renamed from: a */
    public int f124631a;

    /* renamed from: b */
    public String f124632b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f124633c = emptyProtobufList();

    /* renamed from: d */
    public C51274bq f124634d;

    static {
        C48168c cVar = new C48168c();
        f124629e = cVar;
        C62942bv.registerDefaultInstance(C48168c.class, cVar);
    }

    private C48168c() {
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
                return newMessageInfo(f124629e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52083ep.class, "d"});
            case 3:
                return new C48168c();
            case 4:
                return new C48167b();
            case 5:
                return f124629e;
            case 6:
                C63010eb ebVar = f124630f;
                if (ebVar == null) {
                    synchronized (C48168c.class) {
                        ebVar = f124630f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124629e);
                            f124630f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
