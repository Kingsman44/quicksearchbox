package com.google.android.libraries.search.assistant.p2828y.p2830b.p2831a.p2832a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.y.b.a.a.c */
/* compiled from: PG */
public final class C36853c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C36853c f95995b;

    /* renamed from: c */
    public static final C62940bt f95996c;

    /* renamed from: d */
    private static volatile C63010eb f95997d;

    /* renamed from: a */
    public C62971cq f95998a = C62942bv.emptyProtobufList();

    static {
        C36853c cVar = new C36853c();
        f95995b = cVar;
        C62942bv.registerDefaultInstance(C36853c.class, cVar);
        f95996c = C62942bv.newSingularGeneratedExtension(C32814bi.f87999a, cVar, cVar, (C62958ce) null, 450182934, C63066gd.MESSAGE, C36853c.class);
    }

    private C36853c() {
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
                return newMessageInfo(f95995b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C36853c();
            case 4:
                return new C36852b();
            case 5:
                return f95995b;
            case 6:
                C63010eb ebVar = f95997d;
                if (ebVar == null) {
                    synchronized (C36853c.class) {
                        ebVar = f95997d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95995b);
                            f95997d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
