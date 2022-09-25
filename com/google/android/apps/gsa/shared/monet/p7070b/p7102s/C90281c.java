package com.google.android.apps.gsa.shared.monet.p7070b.p7102s;

import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.s.c */
/* compiled from: PG */
public final class C90281c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C90281c f252152c;

    /* renamed from: d */
    private static volatile C63010eb f252153d;

    /* renamed from: a */
    public int f252154a;

    /* renamed from: b */
    public int f252155b;

    static {
        C90281c cVar = new C90281c();
        f252152c = cVar;
        C62942bv.registerDefaultInstance(C90281c.class, cVar);
    }

    private C90281c() {
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
                return newMessageInfo(f252152c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C90208n.m146768b()});
            case 3:
                return new C90281c();
            case 4:
                return new C90280b();
            case 5:
                return f252152c;
            case 6:
                C63010eb ebVar = f252153d;
                if (ebVar == null) {
                    synchronized (C90281c.class) {
                        ebVar = f252153d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252152c);
                            f252153d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
