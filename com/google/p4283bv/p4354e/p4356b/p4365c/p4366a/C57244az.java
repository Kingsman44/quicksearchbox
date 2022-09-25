package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.az */
/* compiled from: PG */
public final class C57244az extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C57244az f152807g;

    /* renamed from: h */
    private static volatile C63010eb f152808h;

    /* renamed from: a */
    public int f152809a;

    /* renamed from: b */
    public long f152810b;

    /* renamed from: c */
    public long f152811c;

    /* renamed from: d */
    public long f152812d;

    /* renamed from: e */
    public int f152813e;

    /* renamed from: f */
    public int f152814f;

    static {
        C57244az azVar = new C57244az();
        f152807g = azVar;
        C62942bv.registerDefaultInstance(C57244az.class, azVar);
    }

    private C57244az() {
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
                return newMessageInfo(f152807g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C57242ax.m88282b(), C10662f.f35572a, C57323f.m88315b()});
            case 3:
                return new C57244az();
            case 4:
                return new C57243ay();
            case 5:
                return f152807g;
            case 6:
                C63010eb ebVar = f152808h;
                if (ebVar == null) {
                    synchronized (C57244az.class) {
                        ebVar = f152808h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152807g);
                            f152808h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
