package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4117aw.p4118a.p4119a.C54628f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.a.f */
/* compiled from: PG */
public final class C37030f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37030f f96461d;

    /* renamed from: e */
    public static final C62940bt f96462e;

    /* renamed from: f */
    private static volatile C63010eb f96463f;

    /* renamed from: a */
    public int f96464a;

    /* renamed from: b */
    public int f96465b;

    /* renamed from: c */
    public C62971cq f96466c = emptyProtobufList();

    static {
        C37030f fVar = new C37030f();
        f96461d = fVar;
        C62942bv.registerDefaultInstance(C37030f.class, fVar);
        f96462e = C62942bv.newSingularGeneratedExtension(C32814bi.f87999a, fVar, fVar, (C62958ce) null, 427618636, C63066gd.MESSAGE, C37030f.class);
    }

    private C37030f() {
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
                return newMessageInfo(f96461d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", C37026b.m65717b(), C45240c.f118157a, C54628f.class});
            case 3:
                return new C37030f();
            case 4:
                return new C37029e();
            case 5:
                return f96461d;
            case 6:
                C63010eb ebVar = f96463f;
                if (ebVar == null) {
                    synchronized (C37030f.class) {
                        ebVar = f96463f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f96461d);
                            f96463f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
