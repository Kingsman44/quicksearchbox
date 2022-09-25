package com.google.android.apps.gsa.opa.smartspace;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.C50818do;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.am */
/* compiled from: PG */
public final class C83741am extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83741am f228248e;

    /* renamed from: g */
    private static volatile C63010eb f228249g;

    /* renamed from: a */
    public int f228250a;

    /* renamed from: b */
    public C83739ak f228251b;

    /* renamed from: c */
    public C50818do f228252c;

    /* renamed from: d */
    public C62971cq f228253d = emptyProtobufList();

    /* renamed from: f */
    private byte f228254f = 2;

    static {
        C83741am amVar = new C83741am();
        f228248e = amVar;
        C62942bv.registerDefaultInstance(C83741am.class, amVar);
    }

    private C83741am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228254f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228254f = b;
                return null;
            case 2:
                return newMessageInfo(f228248e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0002\u0002ဉ\u0001\u0003ᐉ\u0002\u0004Л", new Object[]{"a", "b", C45240c.f118157a, "d", C50818do.class});
            case 3:
                return new C83741am();
            case 4:
                return new C83740al();
            case 5:
                return f228248e;
            case 6:
                C63010eb ebVar = f228249g;
                if (ebVar == null) {
                    synchronized (C83741am.class) {
                        ebVar = f228249g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228248e);
                            f228249g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
