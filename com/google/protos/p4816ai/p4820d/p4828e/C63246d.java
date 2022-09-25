package com.google.protos.p4816ai.p4820d.p4828e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.e.d */
/* compiled from: PG */
public final class C63246d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63246d f170887f;

    /* renamed from: g */
    private static volatile C63010eb f170888g;

    /* renamed from: a */
    public int f170889a;

    /* renamed from: b */
    public C63255m f170890b;

    /* renamed from: c */
    public boolean f170891c;

    /* renamed from: d */
    public C63249g f170892d;

    /* renamed from: e */
    public C63251i f170893e;

    static {
        C63246d dVar = new C63246d();
        f170887f = dVar;
        C62942bv.registerDefaultInstance(C63246d.class, dVar);
    }

    private C63246d() {
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
                return newMessageInfo(f170887f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63246d();
            case 4:
                return new C63245c();
            case 5:
                return f170887f;
            case 6:
                C63010eb ebVar = f170888g;
                if (ebVar == null) {
                    synchronized (C63246d.class) {
                        ebVar = f170888g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170887f);
                            f170888g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
