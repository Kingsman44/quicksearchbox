package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.z */
/* compiled from: PG */
public final class C124210z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124210z f342970c;

    /* renamed from: e */
    private static volatile C63010eb f342971e;

    /* renamed from: a */
    public int f342972a = 0;

    /* renamed from: b */
    public Object f342973b;

    /* renamed from: d */
    private byte f342974d = 2;

    static {
        C124210z zVar = new C124210z();
        f342970c = zVar;
        C62942bv.registerDefaultInstance(C124210z.class, zVar);
    }

    private C124210z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f342974d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f342974d = b;
                return null;
            case 2:
                return newMessageInfo(f342970c, "\u0000\u0003\u0001\u0000\u0001\u0005\u0003\u0000\u0000\u0001\u0001<\u0000\u0004м\u0000\u0005<\u0000", new Object[]{"b", "a", C124209y.class, C48160h.class, C124204t.class});
            case 3:
                return new C124210z();
            case 4:
                return new C124207w();
            case 5:
                return f342970c;
            case 6:
                C63010eb ebVar = f342971e;
                if (ebVar == null) {
                    synchronized (C124210z.class) {
                        ebVar = f342971e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f342970c);
                            f342971e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
