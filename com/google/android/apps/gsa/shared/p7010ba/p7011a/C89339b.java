package com.google.android.apps.gsa.shared.p7010ba.p7011a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.shared.ba.a.b */
/* compiled from: PG */
public final class C89339b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C89339b f242204g;

    /* renamed from: h */
    private static volatile C63010eb f242205h;

    /* renamed from: a */
    public int f242206a;

    /* renamed from: b */
    public C62910ar f242207b;

    /* renamed from: c */
    public C63042fg f242208c;

    /* renamed from: d */
    public C62910ar f242209d;

    /* renamed from: e */
    public C62910ar f242210e;

    /* renamed from: f */
    public int f242211f;

    static {
        C89339b bVar = new C89339b();
        f242204g = bVar;
        C62942bv.registerDefaultInstance(C89339b.class, bVar);
    }

    private C89339b() {
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
                return newMessageInfo(f242204g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C89339b();
            case 4:
                return new C89338a();
            case 5:
                return f242204g;
            case 6:
                C63010eb ebVar = f242205h;
                if (ebVar == null) {
                    synchronized (C89339b.class) {
                        ebVar = f242205h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242204g);
                            f242205h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
