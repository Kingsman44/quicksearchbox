package com.google.android.apps.search.googleapp.saves.savefeature;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.b */
/* compiled from: PG */
public final class C137281b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137281b f373475c;

    /* renamed from: e */
    private static volatile C63010eb f373476e;

    /* renamed from: a */
    public int f373477a = 0;

    /* renamed from: b */
    public Object f373478b;

    /* renamed from: d */
    private byte f373479d = 2;

    static {
        C137281b bVar = new C137281b();
        f373475c = bVar;
        C62942bv.registerDefaultInstance(C137281b.class, bVar);
    }

    private C137281b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373479d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f373479d = b;
                return null;
            case 2:
                return newMessageInfo(f373475c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"b", "a", C137296d.class, C137298f.class});
            case 3:
                return new C137281b();
            case 4:
                return new C137232a();
            case 5:
                return f373475c;
            case 6:
                C63010eb ebVar = f373476e;
                if (ebVar == null) {
                    synchronized (C137281b.class) {
                        ebVar = f373476e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373475c);
                            f373476e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
