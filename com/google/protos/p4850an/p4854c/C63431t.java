package com.google.protos.p4850an.p4854c;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;

/* renamed from: com.google.protos.an.c.t */
/* compiled from: PG */
public final class C63431t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63431t f171423f;

    /* renamed from: g */
    public static final C62940bt f171424g;

    /* renamed from: j */
    private static volatile C63010eb f171425j;

    /* renamed from: a */
    public int f171426a;

    /* renamed from: b */
    public C63433v f171427b;

    /* renamed from: c */
    public int f171428c = 1;

    /* renamed from: d */
    public boolean f171429d;

    /* renamed from: e */
    public C63419h f171430e;

    /* renamed from: h */
    private C63425n f171431h;

    /* renamed from: i */
    private byte f171432i = 2;

    static {
        C63431t tVar = new C63431t();
        f171423f = tVar;
        C62942bv.registerDefaultInstance(C63431t.class, tVar);
        f171424g = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, tVar, tVar, (C62958ce) null, 86097810, C63066gd.MESSAGE, C63431t.class);
    }

    private C63431t() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171432i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171432i = b;
                return null;
            case 2:
                return newMessageInfo(f171423f, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0004ᐉ\u0003\u0006ဇ\u0006\tဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, C63399a.f171334a, C19618h.f54585a, "d", "e"});
            case 3:
                return new C63431t();
            case 4:
                return new C63430s();
            case 5:
                return f171423f;
            case 6:
                C63010eb ebVar = f171425j;
                if (ebVar == null) {
                    synchronized (C63431t.class) {
                        ebVar = f171425j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171423f);
                            f171425j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
