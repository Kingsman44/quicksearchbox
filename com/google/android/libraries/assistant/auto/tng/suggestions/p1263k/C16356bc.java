package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.bc */
/* compiled from: PG */
public final class C16356bc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C16356bc f48144g;

    /* renamed from: h */
    private static volatile C63010eb f48145h;

    /* renamed from: a */
    public int f48146a;

    /* renamed from: b */
    public boolean f48147b;

    /* renamed from: c */
    public boolean f48148c;

    /* renamed from: d */
    public boolean f48149d;

    /* renamed from: e */
    public boolean f48150e;

    /* renamed from: f */
    public boolean f48151f;

    static {
        C16356bc bcVar = new C16356bc();
        f48144g = bcVar;
        C62942bv.registerDefaultInstance(C16356bc.class, bcVar);
    }

    private C16356bc() {
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
                return newMessageInfo(f48144g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C16356bc();
            case 4:
                return new C16355bb();
            case 5:
                return f48144g;
            case 6:
                C63010eb ebVar = f48145h;
                if (ebVar == null) {
                    synchronized (C16356bc.class) {
                        ebVar = f48145h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48144g);
                            f48145h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
