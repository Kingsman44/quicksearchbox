package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hc */
/* compiled from: PG */
public final class C87883hc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87883hc f237745d;

    /* renamed from: f */
    private static volatile C63010eb f237746f;

    /* renamed from: a */
    public int f237747a;

    /* renamed from: b */
    public C62971cq f237748b = emptyProtobufList();

    /* renamed from: c */
    public C65926d f237749c;

    /* renamed from: e */
    private byte f237750e = 2;

    static {
        C87883hc hcVar = new C87883hc();
        f237745d = hcVar;
        C62942bv.registerDefaultInstance(C87883hc.class, hcVar);
    }

    private C87883hc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237750e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237750e = b;
                return null;
            case 2:
                return newMessageInfo(f237745d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u001b\u0002ᐉ\u0000", new Object[]{"a", "b", C87882hb.class, C45240c.f118157a});
            case 3:
                return new C87883hc();
            case 4:
                return new C87879gz();
            case 5:
                return f237745d;
            case 6:
                C63010eb ebVar = f237746f;
                if (ebVar == null) {
                    synchronized (C87883hc.class) {
                        ebVar = f237746f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237745d);
                            f237746f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
