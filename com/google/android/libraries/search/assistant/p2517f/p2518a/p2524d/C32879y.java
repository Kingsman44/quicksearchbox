package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.y */
/* compiled from: PG */
public final class C32879y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C32879y f88112f;

    /* renamed from: h */
    private static volatile C63010eb f88113h;

    /* renamed from: a */
    public int f88114a;

    /* renamed from: b */
    public C32810be f88115b;

    /* renamed from: c */
    public boolean f88116c = true;

    /* renamed from: d */
    public C62910ar f88117d;

    /* renamed from: e */
    public C62910ar f88118e;

    /* renamed from: g */
    private byte f88119g = 2;

    static {
        C32879y yVar = new C32879y();
        f88112f = yVar;
        C62942bv.registerDefaultInstance(C32879y.class, yVar);
    }

    private C32879y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f88119g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f88119g = b;
                return null;
            case 2:
                return newMessageInfo(f88112f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C32879y();
            case 4:
                return new C32878x();
            case 5:
                return f88112f;
            case 6:
                C63010eb ebVar = f88113h;
                if (ebVar == null) {
                    synchronized (C32879y.class) {
                        ebVar = f88113h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88112f);
                            f88113h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
