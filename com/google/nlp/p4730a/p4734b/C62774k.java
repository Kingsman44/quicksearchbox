package com.google.nlp.p4730a.p4734b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.p4730a.C62751ao;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.b.k */
/* compiled from: PG */
public final class C62774k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62774k f169520d;

    /* renamed from: f */
    private static volatile C63010eb f169521f;

    /* renamed from: a */
    public int f169522a;

    /* renamed from: b */
    public C62751ao f169523b;

    /* renamed from: c */
    public C62995dn f169524c = C62995dn.f170057a;

    /* renamed from: e */
    private byte f169525e = 2;

    static {
        C62774k kVar = new C62774k();
        f169520d = kVar;
        C62942bv.registerDefaultInstance(C62774k.class, kVar);
    }

    private C62774k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169525e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169525e = b;
                return null;
            case 2:
                return newMessageInfo(f169520d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0001\u0001ဉ\u0000\u0002в", new Object[]{"a", "b", C45240c.f118157a, C62773j.f169519a});
            case 3:
                return new C62774k();
            case 4:
                return new C62772i();
            case 5:
                return f169520d;
            case 6:
                C63010eb ebVar = f169521f;
                if (ebVar == null) {
                    synchronized (C62774k.class) {
                        ebVar = f169521f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169520d);
                            f169521f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
