package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.apps.p489g.p494d.C9278v;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7998rt;
import com.google.p375ai.p378b.C8074uo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.p */
/* compiled from: PG */
public final class C104520p extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C104520p f290714g;

    /* renamed from: i */
    private static volatile C63010eb f290715i;

    /* renamed from: a */
    public int f290716a;

    /* renamed from: b */
    public C9278v f290717b;

    /* renamed from: c */
    public C7998rt f290718c;

    /* renamed from: d */
    public int f290719d;

    /* renamed from: e */
    public boolean f290720e;

    /* renamed from: f */
    public int f290721f = 1;

    /* renamed from: h */
    private byte f290722h = 2;

    static {
        C104520p pVar = new C104520p();
        f290714g = pVar;
        C62942bv.registerDefaultInstance(C104520p.class, pVar);
    }

    private C104520p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290722h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290722h = b;
                return null;
            case 2:
                return newMessageInfo(f290714g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C8074uo.m22932b()});
            case 3:
                return new C104520p();
            case 4:
                return new C104519o();
            case 5:
                return f290714g;
            case 6:
                C63010eb ebVar = f290715i;
                if (ebVar == null) {
                    synchronized (C104520p.class) {
                        ebVar = f290715i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290714g);
                            f290715i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
