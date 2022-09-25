package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.n.c.a.i.q */
/* compiled from: PG */
public final class C39625q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39625q f104303c;

    /* renamed from: d */
    public static final C62940bt f104304d;

    /* renamed from: e */
    private static volatile C63010eb f104305e;

    /* renamed from: a */
    public int f104306a;

    /* renamed from: b */
    public int f104307b;

    static {
        C39625q qVar = new C39625q();
        f104303c = qVar;
        C62942bv.registerDefaultInstance(C39625q.class, qVar);
        f104304d = C62942bv.newSingularGeneratedExtension(C39618j.f104289c, qVar, qVar, (C62958ce) null, 429323549, C63066gd.MESSAGE, C39625q.class);
    }

    private C39625q() {
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
                return newMessageInfo(f104303c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C39624p.m69075b()});
            case 3:
                return new C39625q();
            case 4:
                return new C39622n();
            case 5:
                return f104303c;
            case 6:
                C63010eb ebVar = f104305e;
                if (ebVar == null) {
                    synchronized (C39625q.class) {
                        ebVar = f104305e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104303c);
                            f104305e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
