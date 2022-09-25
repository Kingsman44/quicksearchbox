package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59687cb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.c */
/* compiled from: PG */
public final class C106275c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C106275c f296496f;

    /* renamed from: h */
    private static volatile C63010eb f296497h;

    /* renamed from: a */
    public int f296498a;

    /* renamed from: b */
    public int f296499b;

    /* renamed from: c */
    public C62995dn f296500c = C62995dn.f170057a;

    /* renamed from: d */
    public long f296501d;

    /* renamed from: e */
    public C59687cb f296502e;

    /* renamed from: g */
    private byte f296503g = 2;

    static {
        C106275c cVar = new C106275c();
        f296496f = cVar;
        C62942bv.registerDefaultInstance(C106275c.class, cVar);
    }

    private C106275c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f296503g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f296503g = b;
                return null;
            case 2:
                return newMessageInfo(f296496f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0001\u0001ဌ\u0000\u00022\u0003ဂ\u0001\u0004ᐉ\u0002", new Object[]{"a", "b", C89849ae.m146282b(), C45240c.f118157a, C106274b.f296495a, "d", "e"});
            case 3:
                return new C106275c();
            case 4:
                return new C106267a();
            case 5:
                return f296496f;
            case 6:
                C63010eb ebVar = f296497h;
                if (ebVar == null) {
                    synchronized (C106275c.class) {
                        ebVar = f296497h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296496f);
                            f296497h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
