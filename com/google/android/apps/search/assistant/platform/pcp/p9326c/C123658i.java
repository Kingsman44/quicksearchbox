package com.google.android.apps.search.assistant.platform.pcp.p9326c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.c.i */
/* compiled from: PG */
public final class C123658i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123658i f341614c;

    /* renamed from: e */
    private static volatile C63010eb f341615e;

    /* renamed from: a */
    public int f341616a;

    /* renamed from: b */
    public C123746bm f341617b;

    /* renamed from: d */
    private byte f341618d = 2;

    static {
        C123658i iVar = new C123658i();
        f341614c = iVar;
        C62942bv.registerDefaultInstance(C123658i.class, iVar);
    }

    private C123658i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341618d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341618d = b;
                return null;
            case 2:
                return newMessageInfo(f341614c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123658i();
            case 4:
                return new C123657h();
            case 5:
                return f341614c;
            case 6:
                C63010eb ebVar = f341615e;
                if (ebVar == null) {
                    synchronized (C123658i.class) {
                        ebVar = f341615e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341614c);
                            f341615e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
