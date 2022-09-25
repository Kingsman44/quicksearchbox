package com.google.android.libraries.assistant.p1535p.p1536a.p1538b;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.p.a.b.g */
/* compiled from: PG */
public final class C18519g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f52479c = new C18517e();

    /* renamed from: e */
    public static final C18519g f52480e;

    /* renamed from: f */
    private static volatile C63010eb f52481f;

    /* renamed from: a */
    public int f52482a;

    /* renamed from: b */
    public C62961ch f52483b = emptyIntList();

    /* renamed from: d */
    public int f52484d;

    static {
        C18519g gVar = new C18519g();
        f52480e = gVar;
        C62942bv.registerDefaultInstance(C18519g.class, gVar);
    }

    private C18519g() {
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
                return newMessageInfo(f52480e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဌ\u0000", new Object[]{"a", "b", C79570b.m127649b(), "d", C18521i.m35985b()});
            case 3:
                return new C18519g();
            case 4:
                return new C18518f();
            case 5:
                return f52480e;
            case 6:
                C63010eb ebVar = f52481f;
                if (ebVar == null) {
                    synchronized (C18519g.class) {
                        ebVar = f52481f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52480e);
                            f52481f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
