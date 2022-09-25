package com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.j.a.a.a.a.a.a.a.e */
/* compiled from: PG */
public final class C146597e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C146597e f395952d;

    /* renamed from: e */
    private static volatile C63010eb f395953e;

    /* renamed from: a */
    public int f395954a;

    /* renamed from: b */
    public int f395955b;

    /* renamed from: c */
    public C62971cq f395956c = emptyProtobufList();

    static {
        C146597e eVar = new C146597e();
        f395952d = eVar;
        C62942bv.registerDefaultInstance(C146597e.class, eVar);
    }

    private C146597e() {
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
                return newMessageInfo(f395952d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C146596d.f395951a, C45240c.f118157a, C146594b.class});
            case 3:
                return new C146597e();
            case 4:
                return new C146595c();
            case 5:
                return f395952d;
            case 6:
                C63010eb ebVar = f395953e;
                if (ebVar == null) {
                    synchronized (C146597e.class) {
                        ebVar = f395953e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f395952d);
                            f395953e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
