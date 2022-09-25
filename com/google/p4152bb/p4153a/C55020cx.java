package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.cx */
/* compiled from: PG */
public final class C55020cx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55020cx f144752c;

    /* renamed from: d */
    public static final C62940bt f144753d;

    /* renamed from: f */
    private static volatile C63010eb f144754f;

    /* renamed from: a */
    public boolean f144755a;

    /* renamed from: b */
    public int f144756b;

    /* renamed from: e */
    private int f144757e;

    static {
        C55020cx cxVar = new C55020cx();
        f144752c = cxVar;
        C62942bv.registerDefaultInstance(C55020cx.class, cxVar);
        f144753d = C62942bv.newSingularGeneratedExtension(C55005ci.f144714d, cxVar, cxVar, (C62958ce) null, 71088811, C63066gd.MESSAGE, C55020cx.class);
    }

    private C55020cx() {
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
                return newMessageInfo(f144752c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C55020cx();
            case 4:
                return new C55019cw();
            case 5:
                return f144752c;
            case 6:
                C63010eb ebVar = f144754f;
                if (ebVar == null) {
                    synchronized (C55020cx.class) {
                        ebVar = f144754f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144752c);
                            f144754f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
