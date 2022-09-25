package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.z */
/* compiled from: PG */
public final class C39822z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39822z f104714c;

    /* renamed from: d */
    public static final C62940bt f104715d;

    /* renamed from: e */
    private static volatile C63010eb f104716e;

    /* renamed from: a */
    public int f104717a;

    /* renamed from: b */
    public C39767h f104718b;

    static {
        C39822z zVar = new C39822z();
        f104714c = zVar;
        C62942bv.registerDefaultInstance(C39822z.class, zVar);
        f104715d = C62942bv.newSingularGeneratedExtension(C67087ko.f182366n, zVar, zVar, (C62958ce) null, 446737221, C63066gd.MESSAGE, C39822z.class);
    }

    private C39822z() {
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
                return newMessageInfo(f104714c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C39822z();
            case 4:
                return new C39821y();
            case 5:
                return f104714c;
            case 6:
                C63010eb ebVar = f104716e;
                if (ebVar == null) {
                    synchronized (C39822z.class) {
                        ebVar = f104716e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104714c);
                            f104716e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
