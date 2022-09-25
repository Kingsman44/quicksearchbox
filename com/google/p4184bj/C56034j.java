package com.google.p4184bj;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.j */
/* compiled from: PG */
public final class C56034j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56034j f149219g;

    /* renamed from: h */
    private static volatile C63010eb f149220h;

    /* renamed from: a */
    public int f149221a;

    /* renamed from: b */
    public long f149222b;

    /* renamed from: c */
    public long f149223c;

    /* renamed from: d */
    public int f149224d;

    /* renamed from: e */
    public C62961ch f149225e = emptyIntList();

    /* renamed from: f */
    public int f149226f;

    static {
        C56034j jVar = new C56034j();
        f149219g = jVar;
        C62942bv.registerDefaultInstance(C56034j.class, jVar);
    }

    private C56034j() {
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
                return newMessageInfo(f149219g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0002\u0003\u0016\u0005စ\u0001\u0006င\u0004", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C56034j();
            case 4:
                return new C56033i();
            case 5:
                return f149219g;
            case 6:
                C63010eb ebVar = f149220h;
                if (ebVar == null) {
                    synchronized (C56034j.class) {
                        ebVar = f149220h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149219g);
                            f149220h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
