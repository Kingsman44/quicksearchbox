package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.am */
/* compiled from: PG */
public final class C17883am extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C17883am f51242f;

    /* renamed from: h */
    private static volatile C63010eb f51243h;

    /* renamed from: a */
    public int f51244a;

    /* renamed from: b */
    public int f51245b = 0;

    /* renamed from: c */
    public Object f51246c;

    /* renamed from: d */
    public String f51247d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f51248e = emptyProtobufList();

    /* renamed from: g */
    private byte f51249g = 2;

    static {
        C17883am amVar = new C17883am();
        f51242f = amVar;
        C62942bv.registerDefaultInstance(C17883am.class, amVar);
    }

    private C17883am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f51249g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f51249g = b;
                return null;
            case 2:
                return newMessageInfo(f51242f, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0003ᐼ\u0000\u0004်\u0000\u0005်\u0000\u0006်\u0000\u0007\u001b", new Object[]{C45240c.f118157a, "b", "a", "d", C17881ak.class, "e", C17902d.class});
            case 3:
                return new C17883am();
            case 4:
                return new C17882al();
            case 5:
                return f51242f;
            case 6:
                C63010eb ebVar = f51243h;
                if (ebVar == null) {
                    synchronized (C17883am.class) {
                        ebVar = f51243h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51242f);
                            f51243h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
