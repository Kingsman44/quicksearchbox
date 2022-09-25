package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8054b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80227bu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.b.c */
/* compiled from: PG */
public final class C103044c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C103044c f287660c;

    /* renamed from: d */
    private static volatile C63010eb f287661d;

    /* renamed from: a */
    public int f287662a;

    /* renamed from: b */
    public C80227bu f287663b;

    static {
        C103044c cVar = new C103044c();
        f287660c = cVar;
        C62942bv.registerDefaultInstance(C103044c.class, cVar);
    }

    private C103044c() {
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
                return newMessageInfo(f287660c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C103044c();
            case 4:
                return new C103043b();
            case 5:
                return f287660c;
            case 6:
                C63010eb ebVar = f287661d;
                if (ebVar == null) {
                    synchronized (C103044c.class) {
                        ebVar = f287661d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f287660c);
                            f287661d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
