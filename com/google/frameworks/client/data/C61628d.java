package com.google.frameworks.client.data;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.frameworks.client.data.d */
/* compiled from: PG */
public final class C61628d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61628d f166510a;

    /* renamed from: b */
    public static final C62940bt f166511b;

    /* renamed from: c */
    private static volatile C63010eb f166512c;

    static {
        C61628d dVar = new C61628d();
        f166510a = dVar;
        C62942bv.registerDefaultInstance(C61628d.class, dVar);
        f166511b = C62942bv.newSingularGeneratedExtension(C63771b.f172510a, dVar, dVar, (C62958ce) null, 203522521, C63066gd.MESSAGE, C61628d.class);
    }

    private C61628d() {
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
                return newMessageInfo(f166510a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C61628d();
            case 4:
                return new C61627c();
            case 5:
                return f166510a;
            case 6:
                C63010eb ebVar = f166512c;
                if (ebVar == null) {
                    synchronized (C61628d.class) {
                        ebVar = f166512c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166510a);
                            f166512c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
