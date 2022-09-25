package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56333d;
import com.google.p4242bp.p4257f.p4262c.p4263a.C56335f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.as */
/* compiled from: PG */
public final class C79944as extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C79944as f219223e;

    /* renamed from: f */
    private static volatile C63010eb f219224f;

    /* renamed from: a */
    public int f219225a;

    /* renamed from: b */
    public float f219226b = 0.5f;

    /* renamed from: c */
    public C56333d f219227c;

    /* renamed from: d */
    public C56335f f219228d;

    static {
        C79944as asVar = new C79944as();
        f219223e = asVar;
        C62942bv.registerDefaultInstance(C79944as.class, asVar);
    }

    private C79944as() {
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
                return newMessageInfo(f219223e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C79944as();
            case 4:
                return new C79943ar();
            case 5:
                return f219223e;
            case 6:
                C63010eb ebVar = f219224f;
                if (ebVar == null) {
                    synchronized (C79944as.class) {
                        ebVar = f219224f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219223e);
                            f219224f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
