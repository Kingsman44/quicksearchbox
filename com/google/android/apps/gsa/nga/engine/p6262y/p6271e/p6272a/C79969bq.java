package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bq */
/* compiled from: PG */
public final class C79969bq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C79969bq f219335g;

    /* renamed from: h */
    private static volatile C63010eb f219336h;

    /* renamed from: a */
    public int f219337a;

    /* renamed from: b */
    public C79967bo f219338b;

    /* renamed from: c */
    public C79963bk f219339c;

    /* renamed from: d */
    public C79963bk f219340d;

    /* renamed from: e */
    public C79963bk f219341e;

    /* renamed from: f */
    public C79963bk f219342f;

    static {
        C79969bq bqVar = new C79969bq();
        f219335g = bqVar;
        C62942bv.registerDefaultInstance(C79969bq.class, bqVar);
    }

    private C79969bq() {
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
                return newMessageInfo(f219335g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C79969bq();
            case 4:
                return new C79968bp();
            case 5:
                return f219335g;
            case 6:
                C63010eb ebVar = f219336h;
                if (ebVar == null) {
                    synchronized (C79969bq.class) {
                        ebVar = f219336h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219335g);
                            f219336h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
