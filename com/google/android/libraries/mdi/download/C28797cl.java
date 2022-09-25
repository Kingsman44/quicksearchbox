package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p5129p.p5131b.C65808cl;

/* renamed from: com.google.android.libraries.mdi.download.cl */
/* compiled from: PG */
public final class C28797cl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C28797cl f78255b;

    /* renamed from: c */
    public static final C62940bt f78256c;

    /* renamed from: d */
    private static volatile C63010eb f78257d;

    /* renamed from: a */
    public C62971cq f78258a = emptyProtobufList();

    static {
        C28797cl clVar = new C28797cl();
        f78255b = clVar;
        C62942bv.registerDefaultInstance(C28797cl.class, clVar);
        f78256c = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, clVar, clVar, (C62958ce) null, 329110223, C63066gd.MESSAGE, C28797cl.class);
    }

    private C28797cl() {
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
                return newMessageInfo(f78255b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C28803cr.class});
            case 3:
                return new C28797cl();
            case 4:
                return new C28796ck();
            case 5:
                return f78255b;
            case 6:
                C63010eb ebVar = f78257d;
                if (ebVar == null) {
                    synchronized (C28797cl.class) {
                        ebVar = f78257d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78255b);
                            f78257d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
