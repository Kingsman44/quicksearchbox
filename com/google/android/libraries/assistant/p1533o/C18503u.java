package com.google.android.libraries.assistant.p1533o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.o.u */
/* compiled from: PG */
public final class C18503u extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C18503u f52450f;

    /* renamed from: h */
    private static volatile C63010eb f52451h;

    /* renamed from: a */
    public C18451an f52452a;

    /* renamed from: b */
    public int f52453b;

    /* renamed from: c */
    public C18438aa f52454c;

    /* renamed from: d */
    public boolean f52455d;

    /* renamed from: e */
    public C55349pb f52456e;

    /* renamed from: g */
    private byte f52457g = 2;

    static {
        C18503u uVar = new C18503u();
        f52450f = uVar;
        C62942bv.registerDefaultInstance(C18503u.class, uVar);
    }

    private C18503u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f52457g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f52457g = b;
                return null;
            case 2:
                return newMessageInfo(f52450f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001\t\u0002\f\u0003\t\u0004\u0007\u0005Љ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C18503u();
            case 4:
                return new C18502t();
            case 5:
                return f52450f;
            case 6:
                C63010eb ebVar = f52451h;
                if (ebVar == null) {
                    synchronized (C18503u.class) {
                        ebVar = f52451h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f52450f);
                            f52451h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
