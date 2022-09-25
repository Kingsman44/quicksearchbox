package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.C50794cr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.a.b */
/* compiled from: PG */
public final class C131195b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C131195b f358800f;

    /* renamed from: g */
    private static volatile C63010eb f358801g;

    /* renamed from: a */
    public int f358802a;

    /* renamed from: b */
    public int f358803b;

    /* renamed from: c */
    public C63042fg f358804c;

    /* renamed from: d */
    public int f358805d;

    /* renamed from: e */
    public C63042fg f358806e;

    static {
        C131195b bVar = new C131195b();
        f358800f = bVar;
        C62942bv.registerDefaultInstance(C131195b.class, bVar);
    }

    private C131195b() {
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
                return newMessageInfo(f358800f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C50794cr.m85939b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C131195b();
            case 4:
                return new C131194a();
            case 5:
                return f358800f;
            case 6:
                C63010eb ebVar = f358801g;
                if (ebVar == null) {
                    synchronized (C131195b.class) {
                        ebVar = f358801g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f358800f);
                            f358801g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
