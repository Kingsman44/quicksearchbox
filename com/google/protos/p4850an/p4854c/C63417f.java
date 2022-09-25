package com.google.protos.p4850an.p4854c;

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
import com.google.protos.p4850an.C63352aw;

/* renamed from: com.google.protos.an.c.f */
/* compiled from: PG */
public final class C63417f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63417f f171385d;

    /* renamed from: e */
    public static final C62940bt f171386e;

    /* renamed from: g */
    private static volatile C63010eb f171387g;

    /* renamed from: a */
    public C63435x f171388a;

    /* renamed from: b */
    public boolean f171389b;

    /* renamed from: c */
    public boolean f171390c;

    /* renamed from: f */
    private int f171391f;

    static {
        C63417f fVar = new C63417f();
        f171385d = fVar;
        C62942bv.registerDefaultInstance(C63417f.class, fVar);
        f171386e = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, fVar, fVar, (C62958ce) null, 75938475, C63066gd.MESSAGE, C63417f.class);
    }

    private C63417f() {
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
                return newMessageInfo(f171385d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002\u0005ဇ\u0004", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a});
            case 3:
                return new C63417f();
            case 4:
                return new C63416e();
            case 5:
                return f171385d;
            case 6:
                C63010eb ebVar = f171387g;
                if (ebVar == null) {
                    synchronized (C63417f.class) {
                        ebVar = f171387g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171385d);
                            f171387g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
