package com.google.p4492ck.p4493a.p4494a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ck.a.a.b */
/* compiled from: PG */
public final class C58127b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C58127b f155392g;

    /* renamed from: h */
    private static volatile C63010eb f155393h;

    /* renamed from: a */
    public C62971cq f155394a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62960cg f155395b = emptyFloatList();

    /* renamed from: c */
    public C62960cg f155396c = emptyFloatList();

    /* renamed from: d */
    public C62971cq f155397d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62960cg f155398e = emptyFloatList();

    /* renamed from: f */
    public C62960cg f155399f = emptyFloatList();

    static {
        C58127b bVar = new C58127b();
        f155392g = bVar;
        C62942bv.registerDefaultInstance(C58127b.class, bVar);
    }

    private C58127b() {
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
                return newMessageInfo(f155392g, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001\u001a\u0002\u0013\u0003\u0013\u0004\u001a\u0005\u0013\u0006\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C58127b();
            case 4:
                return new C58126a();
            case 5:
                return f155392g;
            case 6:
                C63010eb ebVar = f155393h;
                if (ebVar == null) {
                    synchronized (C58127b.class) {
                        ebVar = f155393h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155392g);
                            f155393h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
