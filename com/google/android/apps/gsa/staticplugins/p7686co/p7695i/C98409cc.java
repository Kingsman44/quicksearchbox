package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.cc */
/* compiled from: PG */
public final class C98409cc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C98409cc f274719d;

    /* renamed from: e */
    public static final C62940bt f274720e;

    /* renamed from: f */
    private static volatile C63010eb f274721f;

    /* renamed from: a */
    public int f274722a;

    /* renamed from: b */
    public C62971cq f274723b = emptyProtobufList();

    /* renamed from: c */
    public C98408cb f274724c;

    static {
        C98409cc ccVar = new C98409cc();
        f274719d = ccVar;
        C62942bv.registerDefaultInstance(C98409cc.class, ccVar);
        f274720e = C62942bv.newSingularGeneratedExtension(C91000i.f254200e, ccVar, ccVar, (C62958ce) null, 253682127, C63066gd.MESSAGE, C98409cc.class);
    }

    private C98409cc() {
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
                return newMessageInfo(f274719d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C98405bz.class, C45240c.f118157a});
            case 3:
                return new C98409cc();
            case 4:
                return new C98403bx();
            case 5:
                return f274719d;
            case 6:
                C63010eb ebVar = f274721f;
                if (ebVar == null) {
                    synchronized (C98409cc.class) {
                        ebVar = f274721f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274719d);
                            f274721f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
