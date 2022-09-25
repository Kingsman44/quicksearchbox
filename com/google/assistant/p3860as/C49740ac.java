package com.google.assistant.p3860as;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.ac */
/* compiled from: PG */
public final class C49740ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49740ac f128432e;

    /* renamed from: h */
    private static volatile C63010eb f128433h;

    /* renamed from: a */
    public C49769be f128434a;

    /* renamed from: b */
    public C62971cq f128435b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f128436c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f128437d;

    /* renamed from: f */
    private int f128438f;

    /* renamed from: g */
    private byte f128439g = 2;

    static {
        C49740ac acVar = new C49740ac();
        f128432e = acVar;
        C62942bv.registerDefaultInstance(C49740ac.class, acVar);
    }

    private C49740ac() {
        emptyProtobufList();
        this.f128437d = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128439g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128439g = b;
                return null;
            case 2:
                return newMessageInfo(f128432e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0003\u0004\u0001ᐉ\u0000\u0003Л\u0004Л\u0005Л", new Object[]{C10662f.f35572a, "a", "b", C49777bm.class, C45240c.f118157a, C49777bm.class, "d", C49754aq.class});
            case 3:
                return new C49740ac();
            case 4:
                return new C49739ab();
            case 5:
                return f128432e;
            case 6:
                C63010eb ebVar = f128433h;
                if (ebVar == null) {
                    synchronized (C49740ac.class) {
                        ebVar = f128433h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128432e);
                            f128433h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
