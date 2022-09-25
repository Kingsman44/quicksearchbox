package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.assistant.p3886c.C50706ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.d */
/* compiled from: PG */
public final class C83761d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83761d f228301b;

    /* renamed from: c */
    public static final C62940bt f228302c;

    /* renamed from: d */
    private static volatile C63010eb f228303d;

    /* renamed from: a */
    public C62971cq f228304a = emptyProtobufList();

    static {
        C83761d dVar = new C83761d();
        f228301b = dVar;
        C62942bv.registerDefaultInstance(C83761d.class, dVar);
        f228302c = C62942bv.newSingularGeneratedExtension(C50706ar.f131960a, dVar, dVar, (C62958ce) null, 311884993, C63066gd.MESSAGE, C83761d.class);
    }

    private C83761d() {
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
                return newMessageInfo(f228301b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C83759b.class});
            case 3:
                return new C83761d();
            case 4:
                return new C83760c();
            case 5:
                return f228301b;
            case 6:
                C63010eb ebVar = f228303d;
                if (ebVar == null) {
                    synchronized (C83761d.class) {
                        ebVar = f228303d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228301b);
                            f228303d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
