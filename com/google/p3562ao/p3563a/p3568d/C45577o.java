package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.o */
/* compiled from: PG */
public final class C45577o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45577o f119113e;

    /* renamed from: f */
    private static volatile C63010eb f119114f;

    /* renamed from: a */
    public C45558bb f119115a;

    /* renamed from: b */
    public String f119116b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f119117c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C45551av f119118d;

    static {
        C45577o oVar = new C45577o();
        f119113e = oVar;
        C62942bv.registerDefaultInstance(C45577o.class, oVar);
    }

    private C45577o() {
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
                return newMessageInfo(f119113e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002Ȉ\u0003Ț\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C45577o();
            case 4:
                return new C45576n();
            case 5:
                return f119113e;
            case 6:
                C63010eb ebVar = f119114f;
                if (ebVar == null) {
                    synchronized (C45577o.class) {
                        ebVar = f119114f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119113e);
                            f119114f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
