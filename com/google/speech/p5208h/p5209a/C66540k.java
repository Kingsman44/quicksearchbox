package com.google.speech.p5208h.p5209a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5208h.C66611ci;

/* renamed from: com.google.speech.h.a.k */
/* compiled from: PG */
public final class C66540k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66540k f180970d;

    /* renamed from: e */
    public static final C62940bt f180971e;

    /* renamed from: f */
    private static volatile C63010eb f180972f;

    /* renamed from: a */
    public int f180973a;

    /* renamed from: b */
    public C62971cq f180974b = emptyProtobufList();

    /* renamed from: c */
    public C66543n f180975c;

    static {
        C66540k kVar = new C66540k();
        f180970d = kVar;
        C62942bv.registerDefaultInstance(C66540k.class, kVar);
        f180971e = C62942bv.newSingularGeneratedExtension(C66611ci.f181206g, kVar, kVar, (C62958ce) null, 144480582, C63066gd.MESSAGE, C66540k.class);
    }

    private C66540k() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f180970d, "\u0001\u0002\u0000\u0001\u0001\b\u0002\u0000\u0001\u0000\u0001\u001b\bဉ\u0004", new Object[]{"a", "b", C66535f.class, C45240c.f118157a});
            case 3:
                return new C66540k();
            case 4:
                return new C66539j();
            case 5:
                return f180970d;
            case 6:
                C63010eb ebVar = f180972f;
                if (ebVar == null) {
                    synchronized (C66540k.class) {
                        ebVar = f180972f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180970d);
                            f180972f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
