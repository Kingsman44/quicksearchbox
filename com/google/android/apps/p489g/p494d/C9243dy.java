package com.google.android.apps.p489g.p494d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8063ud;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dy */
/* compiled from: PG */
public final class C9243dy extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C9243dy f31951j;

    /* renamed from: k */
    private static volatile C63010eb f31952k;

    /* renamed from: a */
    public int f31953a;

    /* renamed from: b */
    public C62971cq f31954b = emptyProtobufList();

    /* renamed from: c */
    public boolean f31955c;

    /* renamed from: d */
    public C8063ud f31956d;

    /* renamed from: e */
    public int f31957e;

    /* renamed from: f */
    public int f31958f;

    /* renamed from: g */
    public C8063ud f31959g;

    /* renamed from: h */
    public boolean f31960h;

    /* renamed from: i */
    public int f31961i;

    static {
        C9243dy dyVar = new C9243dy();
        f31951j = dyVar;
        C62942bv.registerDefaultInstance(C9243dy.class, dyVar);
    }

    private C9243dy() {
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
                return newMessageInfo(f31951j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဉ\u0001\u0004င\u0002\u0005င\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bင\u0006", new Object[]{"a", "b", C9241dw.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C9243dy();
            case 4:
                return new C9242dx();
            case 5:
                return f31951j;
            case 6:
                C63010eb ebVar = f31952k;
                if (ebVar == null) {
                    synchronized (C9243dy.class) {
                        ebVar = f31952k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31951j);
                            f31952k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
