package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.ci */
/* compiled from: PG */
public final class C79988ci extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C79988ci f219422i;

    /* renamed from: j */
    private static volatile C63010eb f219423j;

    /* renamed from: a */
    public int f219424a;

    /* renamed from: b */
    public C79953ba f219425b;

    /* renamed from: c */
    public C79953ba f219426c;

    /* renamed from: d */
    public C79953ba f219427d;

    /* renamed from: e */
    public C79953ba f219428e;

    /* renamed from: f */
    public C79953ba f219429f;

    /* renamed from: g */
    public C79953ba f219430g;

    /* renamed from: h */
    public C79953ba f219431h;

    static {
        C79988ci ciVar = new C79988ci();
        f219422i = ciVar;
        C62942bv.registerDefaultInstance(C79988ci.class, ciVar);
    }

    private C79988ci() {
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
                return newMessageInfo(f219422i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C79988ci();
            case 4:
                return new C79987ch();
            case 5:
                return f219422i;
            case 6:
                C63010eb ebVar = f219423j;
                if (ebVar == null) {
                    synchronized (C79988ci.class) {
                        ebVar = f219423j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219422i);
                            f219423j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
