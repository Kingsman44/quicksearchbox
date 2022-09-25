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

/* renamed from: com.google.android.libraries.search.n.i.q */
/* compiled from: PG */
public final class C39795q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f104651b = new C39793o();

    /* renamed from: c */
    public static final C39795q f104652c;

    /* renamed from: d */
    public static final C62940bt f104653d;

    /* renamed from: e */
    private static volatile C63010eb f104654e;

    /* renamed from: a */
    public C62961ch f104655a = emptyIntList();

    static {
        C39795q qVar = new C39795q();
        f104652c = qVar;
        C62942bv.registerDefaultInstance(C39795q.class, qVar);
        f104653d = C62942bv.newSingularGeneratedExtension(C39787i.f104645a, qVar, qVar, (C62958ce) null, 405518498, C63066gd.MESSAGE, C39795q.class);
    }

    private C39795q() {
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
                return newMessageInfo(f104652c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", C39773f.m69199b()});
            case 3:
                return new C39795q();
            case 4:
                return new C39794p();
            case 5:
                return f104652c;
            case 6:
                C63010eb ebVar = f104654e;
                if (ebVar == null) {
                    synchronized (C39795q.class) {
                        ebVar = f104654e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104652c);
                            f104654e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
