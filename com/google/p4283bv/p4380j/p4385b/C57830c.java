package com.google.p4283bv.p4380j.p4385b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.bv.j.b.c */
/* compiled from: PG */
public final class C57830c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57830c f154511d;

    /* renamed from: f */
    private static volatile C63010eb f154512f;

    /* renamed from: a */
    public int f154513a;

    /* renamed from: b */
    public C62995dn f154514b = C62995dn.f170057a;

    /* renamed from: c */
    public SenderStateOuterClass$SenderState f154515c;

    /* renamed from: e */
    private byte f154516e = 2;

    static {
        C57830c cVar = new C57830c();
        f154511d = cVar;
        C62942bv.registerDefaultInstance(C57830c.class, cVar);
    }

    private C57830c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154516e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154516e = b;
                return null;
            case 2:
                return newMessageInfo(f154511d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u00012\u0002ᐉ\u0000", new Object[]{"a", "b", C57795b.f154411a, C45240c.f118157a});
            case 3:
                return new C57830c();
            case 4:
                return new C57681a();
            case 5:
                return f154511d;
            case 6:
                C63010eb ebVar = f154512f;
                if (ebVar == null) {
                    synchronized (C57830c.class) {
                        ebVar = f154512f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154511d);
                            f154512f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
