package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60300nm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.b.e */
/* compiled from: PG */
public final class C124829e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C124829e f344393d;

    /* renamed from: e */
    private static volatile C63010eb f344394e;

    /* renamed from: a */
    public int f344395a;

    /* renamed from: b */
    public C60300nm f344396b;

    /* renamed from: c */
    public C63042fg f344397c;

    static {
        C124829e eVar = new C124829e();
        f344393d = eVar;
        C62942bv.registerDefaultInstance(C124829e.class, eVar);
    }

    private C124829e() {
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
                return newMessageInfo(f344393d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C124829e();
            case 4:
                return new C124828d();
            case 5:
                return f344393d;
            case 6:
                C63010eb ebVar = f344394e;
                if (ebVar == null) {
                    synchronized (C124829e.class) {
                        ebVar = f344394e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344393d);
                            f344394e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
