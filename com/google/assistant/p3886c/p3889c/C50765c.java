package com.google.assistant.p3886c.p3889c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.p3888b.C50723h;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.c.c */
/* compiled from: PG */
public final class C50765c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50765c f132101g;

    /* renamed from: h */
    private static volatile C63010eb f132102h;

    /* renamed from: a */
    public int f132103a;

    /* renamed from: b */
    public C50723h f132104b;

    /* renamed from: c */
    public C50729n f132105c;

    /* renamed from: d */
    public C50733r f132106d;

    /* renamed from: e */
    public C50767e f132107e;

    /* renamed from: f */
    public boolean f132108f;

    static {
        C50765c cVar = new C50765c();
        f132101g = cVar;
        C62942bv.registerDefaultInstance(C50765c.class, cVar);
    }

    private C50765c() {
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
                return newMessageInfo(f132101g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C50765c();
            case 4:
                return new C50764b();
            case 5:
                return f132101g;
            case 6:
                C63010eb ebVar = f132102h;
                if (ebVar == null) {
                    synchronized (C50765c.class) {
                        ebVar = f132102h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132101g);
                            f132102h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
