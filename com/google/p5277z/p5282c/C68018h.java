package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.h */
/* compiled from: PG */
public final class C68018h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C68018h f184286c;

    /* renamed from: f */
    private static volatile C63010eb f184287f;

    /* renamed from: a */
    public int f184288a;

    /* renamed from: b */
    public int f184289b = 1;

    /* renamed from: d */
    private C62995dn f184290d = C62995dn.f170057a;

    /* renamed from: e */
    private byte f184291e = 2;

    static {
        C68018h hVar = new C68018h();
        f184286c = hVar;
        C62942bv.registerDefaultInstance(C68018h.class, hVar);
    }

    private C68018h() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184291e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184291e = b;
                return null;
            case 2:
                return newMessageInfo(f184286c, "\u0001\u0002\u0000\u0001\u0001\b\u0002\u0001\u0000\u0001\u0001ဌ\u0004\bв", new Object[]{"a", "b", C68020j.f184293a, "d", C68017g.f184285a});
            case 3:
                return new C68018h();
            case 4:
                return new C68016f();
            case 5:
                return f184286c;
            case 6:
                C63010eb ebVar = f184287f;
                if (ebVar == null) {
                    synchronized (C68018h.class) {
                        ebVar = f184287f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184286c);
                            f184287f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
