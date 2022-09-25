package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.lv */
/* compiled from: PG */
public final class C55261lv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55261lv f145535e;

    /* renamed from: f */
    public static final C62940bt f145536f;

    /* renamed from: g */
    private static volatile C63010eb f145537g;

    /* renamed from: a */
    public int f145538a;

    /* renamed from: b */
    public C55114gj f145539b;

    /* renamed from: c */
    public C55114gj f145540c;

    /* renamed from: d */
    public C55188jc f145541d;

    static {
        C55261lv lvVar = new C55261lv();
        f145535e = lvVar;
        C62942bv.registerDefaultInstance(C55261lv.class, lvVar);
        f145536f = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, lvVar, lvVar, (C62958ce) null, 60581869, C63066gd.MESSAGE, C55261lv.class);
    }

    private C55261lv() {
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
                return newMessageInfo(f145535e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C55261lv();
            case 4:
                return new C55260lu();
            case 5:
                return f145535e;
            case 6:
                C63010eb ebVar = f145537g;
                if (ebVar == null) {
                    synchronized (C55261lv.class) {
                        ebVar = f145537g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145535e);
                            f145537g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
