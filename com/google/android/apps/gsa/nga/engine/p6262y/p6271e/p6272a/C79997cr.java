package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.cr */
/* compiled from: PG */
public final class C79997cr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C79997cr f219461g;

    /* renamed from: h */
    private static volatile C63010eb f219462h;

    /* renamed from: a */
    public int f219463a;

    /* renamed from: b */
    public float f219464b;

    /* renamed from: c */
    public float f219465c;

    /* renamed from: d */
    public float f219466d;

    /* renamed from: e */
    public float f219467e;

    /* renamed from: f */
    public float f219468f;

    static {
        C79997cr crVar = new C79997cr();
        f219461g = crVar;
        C62942bv.registerDefaultInstance(C79997cr.class, crVar);
    }

    private C79997cr() {
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
                return newMessageInfo(f219461g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C79997cr();
            case 4:
                return new C79996cq();
            case 5:
                return f219461g;
            case 6:
                C63010eb ebVar = f219462h;
                if (ebVar == null) {
                    synchronized (C79997cr.class) {
                        ebVar = f219462h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219461g);
                            f219462h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
