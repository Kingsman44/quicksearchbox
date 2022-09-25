package com.google.p4184bj.p4189b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.b.j */
/* compiled from: PG */
public final class C55893j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C55893j f148728h;

    /* renamed from: i */
    private static volatile C63010eb f148729i;

    /* renamed from: a */
    public int f148730a;

    /* renamed from: b */
    public int f148731b;

    /* renamed from: c */
    public C62971cq f148732c = emptyProtobufList();

    /* renamed from: d */
    public C55882ab f148733d;

    /* renamed from: e */
    public C55901r f148734e;

    /* renamed from: f */
    public C55907x f148735f;

    /* renamed from: g */
    public C55904u f148736g;

    static {
        C55893j jVar = new C55893j();
        f148728h = jVar;
        C62942bv.registerDefaultInstance(C55893j.class, jVar);
    }

    private C55893j() {
        emptyIntList();
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
                return newMessageInfo(f148728h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0007ဉ\u0005\tဉ\u0007", new Object[]{"a", "b", C55891h.f148727a, C45240c.f118157a, C55893j.class, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C55893j();
            case 4:
                return new C55890g();
            case 5:
                return f148728h;
            case 6:
                C63010eb ebVar = f148729i;
                if (ebVar == null) {
                    synchronized (C55893j.class) {
                        ebVar = f148729i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148728h);
                            f148729i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
