package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bv.f.a.a.aq */
/* compiled from: PG */
public final class C57573aq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C57573aq f153809g;

    /* renamed from: h */
    private static volatile C63010eb f153810h;

    /* renamed from: a */
    public int f153811a = 0;

    /* renamed from: b */
    public Object f153812b;

    /* renamed from: c */
    public C57601br f153813c;

    /* renamed from: d */
    public int f153814d;

    /* renamed from: e */
    public int f153815e;

    /* renamed from: f */
    public int f153816f;

    static {
        C57573aq aqVar = new C57573aq();
        f153809g = aqVar;
        C62942bv.registerDefaultInstance(C57573aq.class, aqVar);
    }

    private C57573aq() {
        emptyIntList();
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f153809g, "\u0000\u0006\u0001\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002\f\u0003\u0004\u0006\t\b?\u0000\n\f\u000b<\u0000", new Object[]{"b", "a", "d", "e", C45240c.f118157a, C10662f.f35572a, C57572ap.class});
            case 3:
                return new C57573aq();
            case 4:
                return new C57570an();
            case 5:
                return f153809g;
            case 6:
                C63010eb ebVar = f153810h;
                if (ebVar == null) {
                    synchronized (C57573aq.class) {
                        ebVar = f153810h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153809g);
                            f153810h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
