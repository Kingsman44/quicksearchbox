package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.db */
/* compiled from: PG */
public final class C56302db extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56302db f150043e;

    /* renamed from: g */
    private static volatile C63010eb f150044g;

    /* renamed from: a */
    public int f150045a;

    /* renamed from: b */
    public int f150046b = 0;

    /* renamed from: c */
    public Object f150047c;

    /* renamed from: d */
    public int f150048d;

    /* renamed from: f */
    private byte f150049f = 2;

    static {
        C56302db dbVar = new C56302db();
        f150043e = dbVar;
        C62942bv.registerDefaultInstance(C56302db.class, dbVar);
    }

    private C56302db() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150049f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150049f = b;
                return null;
            case 2:
                return newMessageInfo(f150043e, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0007ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C56306df.m87965b(), C56292cs.class, C56301da.class, C56296cw.class, C56294cu.class});
            case 3:
                return new C56302db();
            case 4:
                return new C56281ch();
            case 5:
                return f150043e;
            case 6:
                C63010eb ebVar = f150044g;
                if (ebVar == null) {
                    synchronized (C56302db.class) {
                        ebVar = f150044g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150043e);
                            f150044g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
