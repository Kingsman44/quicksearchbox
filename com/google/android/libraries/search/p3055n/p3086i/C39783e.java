package com.google.android.libraries.search.p3055n.p3086i;

import com.google.android.libraries.search.p3055n.p3085h.C39773f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.n.i.e */
/* compiled from: PG */
public final class C39783e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f104637b = new C39781c();

    /* renamed from: c */
    public static final C39783e f104638c;

    /* renamed from: d */
    public static final C62940bt f104639d;

    /* renamed from: e */
    private static volatile C63010eb f104640e;

    /* renamed from: a */
    public C62961ch f104641a = emptyIntList();

    static {
        C39783e eVar = new C39783e();
        f104638c = eVar;
        C62942bv.registerDefaultInstance(C39783e.class, eVar);
        f104639d = C62942bv.newSingularGeneratedExtension(C39785g.f104642a, eVar, eVar, (C62958ce) null, 405518496, C63066gd.MESSAGE, C39783e.class);
    }

    private C39783e() {
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
                return newMessageInfo(f104638c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", C39773f.m69199b()});
            case 3:
                return new C39783e();
            case 4:
                return new C39782d();
            case 5:
                return f104638c;
            case 6:
                C63010eb ebVar = f104640e;
                if (ebVar == null) {
                    synchronized (C39783e.class) {
                        ebVar = f104640e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104638c);
                            f104640e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
