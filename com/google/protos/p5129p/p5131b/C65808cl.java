package com.google.protos.p5129p.p5131b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.cl */
/* compiled from: PG */
public final class C65808cl extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C65808cl f178897d;

    /* renamed from: g */
    private static volatile C63010eb f178898g;

    /* renamed from: a */
    public int f178899a;

    /* renamed from: b */
    public int f178900b;

    /* renamed from: c */
    public int f178901c = 1;

    /* renamed from: e */
    private C51715bm f178902e;

    /* renamed from: f */
    private byte f178903f = 2;

    static {
        C65808cl clVar = new C65808cl();
        f178897d = clVar;
        C62942bv.registerDefaultInstance(C65808cl.class, clVar);
    }

    private C65808cl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178903f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178903f = b;
                return null;
            case 2:
                return newMessageInfo(f178897d, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဌ\u0004\u0007ဌ\u0005", new Object[]{"a", "e", "b", C65813cq.m96812b(), C45240c.f118157a, C65814cr.f178924a});
            case 3:
                return new C65808cl();
            case 4:
                return new C65807ck();
            case 5:
                return f178897d;
            case 6:
                C63010eb ebVar = f178898g;
                if (ebVar == null) {
                    synchronized (C65808cl.class) {
                        ebVar = f178898g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178897d);
                            f178898g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
