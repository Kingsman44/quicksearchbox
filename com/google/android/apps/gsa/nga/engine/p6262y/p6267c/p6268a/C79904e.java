package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.e */
/* compiled from: PG */
public final class C79904e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C79904e f219017g;

    /* renamed from: h */
    public static final C62940bt f219018h;

    /* renamed from: i */
    private static volatile C63010eb f219019i;

    /* renamed from: a */
    public int f219020a;

    /* renamed from: b */
    public double f219021b = -1.0d;

    /* renamed from: c */
    public double f219022c = -1.0d;

    /* renamed from: d */
    public double f219023d = -1.0d;

    /* renamed from: e */
    public int f219024e = 2;

    /* renamed from: f */
    public boolean f219025f;

    static {
        C79904e eVar = new C79904e();
        f219017g = eVar;
        C62942bv.registerDefaultInstance(C79904e.class, eVar);
        f219018h = C62942bv.newSingularGeneratedExtension(C79885g.f218957h, eVar, eVar, (C62958ce) null, 279980377, C63066gd.MESSAGE, C79904e.class);
    }

    private C79904e() {
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
                return newMessageInfo(f219017g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003က\u0000\u0004က\u0001\u0005က\u0002\u0006ဌ\u0003\bဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C79903d.f219016a, C10662f.f35572a});
            case 3:
                return new C79904e();
            case 4:
                return new C79902c();
            case 5:
                return f219017g;
            case 6:
                C63010eb ebVar = f219019i;
                if (ebVar == null) {
                    synchronized (C79904e.class) {
                        ebVar = f219019i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219017g);
                            f219019i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
