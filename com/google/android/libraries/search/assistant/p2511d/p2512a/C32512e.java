package com.google.android.libraries.search.assistant.p2511d.p2512a;

import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.d.a.e */
/* compiled from: PG */
public final class C32512e extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C32512e f87093e;

    /* renamed from: g */
    private static volatile C63010eb f87094g;

    /* renamed from: a */
    public int f87095a;

    /* renamed from: b */
    public int f87096b = 0;

    /* renamed from: c */
    public Object f87097c;

    /* renamed from: d */
    public long f87098d;

    /* renamed from: f */
    private byte f87099f = 2;

    static {
        C32512e eVar = new C32512e();
        f87093e = eVar;
        C62942bv.registerDefaultInstance(C32512e.class, eVar);
    }

    private C32512e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f87099f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f87099f = b;
                return null;
            case 2:
                return newMessageInfo(f87093e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C62912at.class, C34822b.class});
            case 3:
                return new C32512e();
            case 4:
                return new C32511d();
            case 5:
                return f87093e;
            case 6:
                C63010eb ebVar = f87094g;
                if (ebVar == null) {
                    synchronized (C32512e.class) {
                        ebVar = f87094g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87093e);
                            f87094g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
