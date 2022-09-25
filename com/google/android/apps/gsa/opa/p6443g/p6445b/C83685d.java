package com.google.android.apps.gsa.opa.p6443g.p6445b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48869l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.g.b.d */
/* compiled from: PG */
public final class C83685d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C83685d f228113f;

    /* renamed from: h */
    private static volatile C63010eb f228114h;

    /* renamed from: a */
    public int f228115a;

    /* renamed from: b */
    public int f228116b = 0;

    /* renamed from: c */
    public Object f228117c;

    /* renamed from: d */
    public C48869l f228118d;

    /* renamed from: e */
    public int f228119e = 1;

    /* renamed from: g */
    private byte f228120g = 2;

    static {
        C83685d dVar = new C83685d();
        f228113f = dVar;
        C62942bv.registerDefaultInstance(C83685d.class, dVar);
    }

    private C83685d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f228120g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f228120g = b;
                return null;
            case 2:
                return newMessageInfo(f228113f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ဌ\u0003\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C48838be.class, "d", "e", C83686e.f228121a, C48840bg.class});
            case 3:
                return new C83685d();
            case 4:
                return new C83684c();
            case 5:
                return f228113f;
            case 6:
                C63010eb ebVar = f228114h;
                if (ebVar == null) {
                    synchronized (C83685d.class) {
                        ebVar = f228114h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228113f);
                            f228114h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
