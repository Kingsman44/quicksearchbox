package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.f.c.d */
/* compiled from: PG */
public final class C127345d extends C62942bv implements C127346e {

    /* renamed from: c */
    public static final C127345d f350699c;

    /* renamed from: d */
    private static volatile C63010eb f350700d;

    /* renamed from: a */
    public int f350701a;

    /* renamed from: b */
    public C32849cq f350702b;

    static {
        C127345d dVar = new C127345d();
        f350699c = dVar;
        C62942bv.registerDefaultInstance(C127345d.class, dVar);
    }

    private C127345d() {
    }

    /* renamed from: a */
    public final boolean mo108027a() {
        return (this.f350701a & 1) != 0;
    }

    /* renamed from: b */
    public final C32849cq mo108028b() {
        C32849cq cqVar = this.f350702b;
        return cqVar == null ? C32849cq.f88059c : cqVar;
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
                return newMessageInfo(f350699c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127345d();
            case 4:
                return new C127344c();
            case 5:
                return f350699c;
            case 6:
                C63010eb ebVar = f350700d;
                if (ebVar == null) {
                    synchronized (C127345d.class) {
                        ebVar = f350700d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350699c);
                            f350700d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
