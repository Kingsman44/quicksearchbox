package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.engine.recognition.C77567at;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ad */
/* compiled from: PG */
public final class C82780ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82780ad f225550e;

    /* renamed from: f */
    private static volatile C63010eb f225551f;

    /* renamed from: a */
    public int f225552a;

    /* renamed from: b */
    public C37561eb f225553b;

    /* renamed from: c */
    public int f225554c = 1;

    /* renamed from: d */
    public boolean f225555d;

    static {
        C82780ad adVar = new C82780ad();
        f225550e = adVar;
        C62942bv.registerDefaultInstance(C82780ad.class, adVar);
    }

    private C82780ad() {
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
                return newMessageInfo(f225550e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C77567at.f213710a, "d"});
            case 3:
                return new C82780ad();
            case 4:
                return new C82779ac();
            case 5:
                return f225550e;
            case 6:
                C63010eb ebVar = f225551f;
                if (ebVar == null) {
                    synchronized (C82780ad.class) {
                        ebVar = f225551f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225550e);
                            f225551f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
