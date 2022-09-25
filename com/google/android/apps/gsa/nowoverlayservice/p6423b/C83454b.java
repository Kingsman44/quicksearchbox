package com.google.android.apps.gsa.nowoverlayservice.p6423b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.b.b */
/* compiled from: PG */
public final class C83454b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83454b f227485e;

    /* renamed from: g */
    private static volatile C63010eb f227486g;

    /* renamed from: a */
    public int f227487a;

    /* renamed from: b */
    public int f227488b;

    /* renamed from: c */
    public int f227489c;

    /* renamed from: d */
    public int f227490d;

    /* renamed from: f */
    private int f227491f;

    static {
        C83454b bVar = new C83454b();
        f227485e = bVar;
        C62942bv.registerDefaultInstance(C83454b.class, bVar);
    }

    private C83454b() {
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
                return newMessageInfo(f227485e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83454b();
            case 4:
                return new C83453a();
            case 5:
                return f227485e;
            case 6:
                C63010eb ebVar = f227486g;
                if (ebVar == null) {
                    synchronized (C83454b.class) {
                        ebVar = f227486g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227485e);
                            f227486g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
