package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.af */
/* compiled from: PG */
public final class C65021af extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C65021af f176076g;

    /* renamed from: h */
    private static volatile C63010eb f176077h;

    /* renamed from: a */
    public int f176078a;

    /* renamed from: b */
    public boolean f176079b;

    /* renamed from: c */
    public boolean f176080c;

    /* renamed from: d */
    public boolean f176081d;

    /* renamed from: e */
    public boolean f176082e;

    /* renamed from: f */
    public C65046bd f176083f;

    static {
        C65021af afVar = new C65021af();
        f176076g = afVar;
        C62942bv.registerDefaultInstance(C65021af.class, afVar);
    }

    private C65021af() {
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
                return newMessageInfo(f176076g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C65021af();
            case 4:
                return new C65020ae();
            case 5:
                return f176076g;
            case 6:
                C63010eb ebVar = f176077h;
                if (ebVar == null) {
                    synchronized (C65021af.class) {
                        ebVar = f176077h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176076g);
                            f176077h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
