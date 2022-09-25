package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.bb.a.bk */
/* compiled from: PG */
public final class C54980bk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54980bk f144662c;

    /* renamed from: d */
    public static final C62940bt f144663d;

    /* renamed from: g */
    private static volatile C63010eb f144664g;

    /* renamed from: a */
    public C63088z f144665a = C63088z.f170246b;

    /* renamed from: b */
    public C55365pr f144666b;

    /* renamed from: e */
    private int f144667e;

    /* renamed from: f */
    private byte f144668f = 2;

    static {
        C54980bk bkVar = new C54980bk();
        f144662c = bkVar;
        C62942bv.registerDefaultInstance(C54980bk.class, bkVar);
        f144663d = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, bkVar, bkVar, (C62958ce) null, 136521502, C63066gd.MESSAGE, C54980bk.class);
    }

    private C54980bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144668f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144668f = b;
                return null;
            case 2:
                return newMessageInfo(f144662c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ည\u0000\u0004ᐉ\u0003", new Object[]{"e", "a", "b"});
            case 3:
                return new C54980bk();
            case 4:
                return new C54979bj();
            case 5:
                return f144662c;
            case 6:
                C63010eb ebVar = f144664g;
                if (ebVar == null) {
                    synchronized (C54980bk.class) {
                        ebVar = f144664g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144662c);
                            f144664g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
