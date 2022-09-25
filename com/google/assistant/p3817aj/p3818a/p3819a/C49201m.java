package com.google.assistant.p3817aj.p3818a.p3819a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.aj.a.a.m */
/* compiled from: PG */
public final class C49201m extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49201m f127219a;

    /* renamed from: b */
    public static final C62940bt f127220b;

    /* renamed from: c */
    private static volatile C63010eb f127221c;

    static {
        C49201m mVar = new C49201m();
        f127219a = mVar;
        C62942bv.registerDefaultInstance(C49201m.class, mVar);
        f127220b = C62942bv.newSingularGeneratedExtension(C79891m.f218975e, mVar, mVar, (C62958ce) null, 283353432, C63066gd.MESSAGE, C49201m.class);
    }

    private C49201m() {
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
                return newMessageInfo(f127219a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49201m();
            case 4:
                return new C49198j();
            case 5:
                return f127219a;
            case 6:
                C63010eb ebVar = f127221c;
                if (ebVar == null) {
                    synchronized (C49201m.class) {
                        ebVar = f127221c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127219a);
                            f127221c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
