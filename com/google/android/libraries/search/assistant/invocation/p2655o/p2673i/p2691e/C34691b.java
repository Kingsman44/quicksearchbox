package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2691e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.e.b */
/* compiled from: PG */
public final class C34691b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34691b f92108c;

    /* renamed from: d */
    public static final C62940bt f92109d;

    /* renamed from: e */
    private static volatile C63010eb f92110e;

    /* renamed from: a */
    public int f92111a;

    /* renamed from: b */
    public long f92112b;

    static {
        C34691b bVar = new C34691b();
        f92108c = bVar;
        C62942bv.registerDefaultInstance(C34691b.class, bVar);
        f92109d = C62942bv.newSingularGeneratedExtension(C34697g.f92115a, bVar, bVar, (C62958ce) null, 2, C63066gd.MESSAGE, C34691b.class);
    }

    private C34691b() {
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
                return newMessageInfo(f92108c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C34691b();
            case 4:
                return new C34690a();
            case 5:
                return f92108c;
            case 6:
                C63010eb ebVar = f92110e;
                if (ebVar == null) {
                    synchronized (C34691b.class) {
                        ebVar = f92110e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f92108c);
                            f92110e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
