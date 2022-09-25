package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.bv.e.b.c.a.bx */
/* compiled from: PG */
public final class C57269bx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57269bx f152882d;

    /* renamed from: e */
    public static final C62940bt f152883e;

    /* renamed from: h */
    private static volatile C63010eb f152884h;

    /* renamed from: a */
    public C62971cq f152885a = emptyProtobufList();

    /* renamed from: b */
    public C57271bz f152886b;

    /* renamed from: c */
    public int f152887c;

    /* renamed from: f */
    private int f152888f;

    /* renamed from: g */
    private byte f152889g = 2;

    static {
        C57269bx bxVar = new C57269bx();
        f152882d = bxVar;
        C62942bv.registerDefaultInstance(C57269bx.class, bxVar);
        f152883e = C62942bv.newSingularGeneratedExtension(C57309dj.f152970a, bxVar, bxVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C57269bx.class);
    }

    private C57269bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152889g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152889g = b;
                return null;
            case 2:
                return newMessageInfo(f152882d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0004ဌ\u0001", new Object[]{C10662f.f35572a, "a", C57221ac.class, "b", C45240c.f118157a, C57311dl.m88309b()});
            case 3:
                return new C57269bx();
            case 4:
                return new C57268bw();
            case 5:
                return f152882d;
            case 6:
                C63010eb ebVar = f152884h;
                if (ebVar == null) {
                    synchronized (C57269bx.class) {
                        ebVar = f152884h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152882d);
                            f152884h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
