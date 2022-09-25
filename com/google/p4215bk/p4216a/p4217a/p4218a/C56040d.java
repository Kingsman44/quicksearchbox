package com.google.p4215bk.p4216a.p4217a.p4218a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bk.a.a.a.d */
/* compiled from: PG */
public final class C56040d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56040d f149238g;

    /* renamed from: h */
    private static volatile C63010eb f149239h;

    /* renamed from: a */
    public int f149240a;

    /* renamed from: b */
    public int f149241b;

    /* renamed from: c */
    public int f149242c;

    /* renamed from: d */
    public int f149243d;

    /* renamed from: e */
    public int f149244e;

    /* renamed from: f */
    public long f149245f;

    static {
        C56040d dVar = new C56040d();
        f149238g = dVar;
        C62942bv.registerDefaultInstance(C56040d.class, dVar);
    }

    private C56040d() {
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
                return newMessageInfo(f149238g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဌ\u0001", new Object[]{"a", "b", C56039c.f149237a, "d", "e", C10662f.f35572a, C45240c.f118157a, C56038b.f149236a});
            case 3:
                return new C56040d();
            case 4:
                return new C56037a();
            case 5:
                return f149238g;
            case 6:
                C63010eb ebVar = f149239h;
                if (ebVar == null) {
                    synchronized (C56040d.class) {
                        ebVar = f149239h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149238g);
                            f149239h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
