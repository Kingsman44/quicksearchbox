package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.j */
/* compiled from: PG */
public final class C80255j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80255j f220187c;

    /* renamed from: e */
    private static volatile C63010eb f220188e;

    /* renamed from: a */
    public boolean f220189a;

    /* renamed from: b */
    public boolean f220190b;

    /* renamed from: d */
    private int f220191d;

    static {
        C80255j jVar = new C80255j();
        f220187c = jVar;
        C62942bv.registerDefaultInstance(C80255j.class, jVar);
    }

    private C80255j() {
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
                return newMessageInfo(f220187c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C80255j();
            case 4:
                return new C80254i();
            case 5:
                return f220187c;
            case 6:
                C63010eb ebVar = f220188e;
                if (ebVar == null) {
                    synchronized (C80255j.class) {
                        ebVar = f220188e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220187c);
                            f220188e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
