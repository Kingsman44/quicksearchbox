package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bb */
/* compiled from: PG */
public final class C87720bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87720bb f237191d;

    /* renamed from: e */
    private static volatile C63010eb f237192e;

    /* renamed from: a */
    public int f237193a;

    /* renamed from: b */
    public long f237194b;

    /* renamed from: c */
    public boolean f237195c;

    static {
        C87720bb bbVar = new C87720bb();
        f237191d = bbVar;
        C62942bv.registerDefaultInstance(C87720bb.class, bbVar);
    }

    private C87720bb() {
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
                return newMessageInfo(f237191d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87720bb();
            case 4:
                return new C87719ba();
            case 5:
                return f237191d;
            case 6:
                C63010eb ebVar = f237192e;
                if (ebVar == null) {
                    synchronized (C87720bb.class) {
                        ebVar = f237192e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237191d);
                            f237192e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
