package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.eb */
/* compiled from: PG */
public final class C55052eb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55052eb f144834c;

    /* renamed from: d */
    public static final C62940bt f144835d;

    /* renamed from: f */
    private static volatile C63010eb f144836f;

    /* renamed from: a */
    public C55025db f144837a;

    /* renamed from: b */
    public int f144838b;

    /* renamed from: e */
    private int f144839e;

    static {
        C55052eb ebVar = new C55052eb();
        f144834c = ebVar;
        C62942bv.registerDefaultInstance(C55052eb.class, ebVar);
        f144835d = C62942bv.newSingularGeneratedExtension(C55029df.f144771d, ebVar, ebVar, (C62958ce) null, 94224838, C63066gd.MESSAGE, C55052eb.class);
    }

    private C55052eb() {
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
                return newMessageInfo(f144834c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"e", "a", "b", C55049dz.f144833a});
            case 3:
                return new C55052eb();
            case 4:
                return new C55048dy();
            case 5:
                return f144834c;
            case 6:
                C63010eb ebVar = f144836f;
                if (ebVar == null) {
                    synchronized (C55052eb.class) {
                        ebVar = f144836f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144834c);
                            f144836f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
