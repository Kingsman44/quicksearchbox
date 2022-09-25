package com.google.android.apps.gsa.nga.shared.p6296ab.p6300c.p6302b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.ab.c.b.d */
/* compiled from: PG */
public final class C80549d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80549d f221098d;

    /* renamed from: e */
    private static volatile C63010eb f221099e;

    /* renamed from: a */
    public int f221100a;

    /* renamed from: b */
    public long f221101b;

    /* renamed from: c */
    public C62964ck f221102c = emptyLongList();

    static {
        C80549d dVar = new C80549d();
        f221098d = dVar;
        C62942bv.registerDefaultInstance(C80549d.class, dVar);
    }

    private C80549d() {
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
                return newMessageInfo(f221098d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u0014", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80549d();
            case 4:
                return new C80548c();
            case 5:
                return f221098d;
            case 6:
                C63010eb ebVar = f221099e;
                if (ebVar == null) {
                    synchronized (C80549d.class) {
                        ebVar = f221099e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221098d);
                            f221099e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
