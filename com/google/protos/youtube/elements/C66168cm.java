package com.google.protos.youtube.elements;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.cm */
/* compiled from: PG */
public final class C66168cm extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C66168cm f179928j;

    /* renamed from: k */
    private static volatile C63010eb f179929k;

    /* renamed from: a */
    public int f179930a;

    /* renamed from: b */
    public float f179931b;

    /* renamed from: c */
    public float f179932c;

    /* renamed from: d */
    public C66140bs f179933d;

    /* renamed from: e */
    public C66224ek f179934e;

    /* renamed from: f */
    public int f179935f;

    /* renamed from: g */
    public int f179936g;

    /* renamed from: h */
    public boolean f179937h;

    /* renamed from: i */
    public C66143bv f179938i;

    static {
        C66168cm cmVar = new C66168cm();
        f179928j = cmVar;
        C62942bv.registerDefaultInstance(C66168cm.class, cmVar);
    }

    private C66168cm() {
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
                return newMessageInfo(f179928j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006\bဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C66170co.f179940a, C30325g.f82003a, C66169cn.f179939a, C19618h.f54585a, "i"});
            case 3:
                return new C66168cm();
            case 4:
                return new C66167cl();
            case 5:
                return f179928j;
            case 6:
                C63010eb ebVar = f179929k;
                if (ebVar == null) {
                    synchronized (C66168cm.class) {
                        ebVar = f179929k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179928j);
                            f179929k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
