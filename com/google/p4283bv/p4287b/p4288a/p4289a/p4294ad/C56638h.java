package com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ad.h */
/* compiled from: PG */
public final class C56638h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56638h f151210a;

    /* renamed from: b */
    private static volatile C63010eb f151211b;

    static {
        C56638h hVar = new C56638h();
        f151210a = hVar;
        C62942bv.registerDefaultInstance(C56638h.class, hVar);
    }

    private C56638h() {
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
                return newMessageInfo(f151210a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56638h();
            case 4:
                return new C56637g();
            case 5:
                return f151210a;
            case 6:
                C63010eb ebVar = f151211b;
                if (ebVar == null) {
                    synchronized (C56638h.class) {
                        ebVar = f151211b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151210a);
                            f151211b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
