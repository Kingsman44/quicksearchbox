package com.google.nlp.p4730a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.nlp.a.k */
/* compiled from: PG */
public final class C62791k extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C62791k f169561d;

    /* renamed from: e */
    public static final C62940bt f169562e;

    /* renamed from: g */
    private static volatile C63010eb f169563g;

    /* renamed from: a */
    public int f169564a;

    /* renamed from: b */
    public C62760ax f169565b;

    /* renamed from: c */
    public C62782ba f169566c;

    /* renamed from: f */
    private byte f169567f = 2;

    static {
        C62791k kVar = new C62791k();
        f169561d = kVar;
        C62942bv.registerDefaultInstance(C62791k.class, kVar);
        f169562e = C62942bv.newSingularGeneratedExtension(C62799s.f169588g, kVar, kVar, (C62958ce) null, 116965824, C63066gd.MESSAGE, C62791k.class);
    }

    private C62791k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169567f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169567f = b;
                return null;
            case 2:
                return newMessageInfo(f169561d, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0001\u0002ᐉ\u0002\u0005ဉ\u0000", new Object[]{"a", C45240c.f118157a, "b"});
            case 3:
                return new C62791k();
            case 4:
                return new C62790j();
            case 5:
                return f169561d;
            case 6:
                C63010eb ebVar = f169563g;
                if (ebVar == null) {
                    synchronized (C62791k.class) {
                        ebVar = f169563g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169561d);
                            f169563g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
