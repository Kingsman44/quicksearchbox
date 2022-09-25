package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.h */
/* compiled from: PG */
public final class C56069h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56069h f149392g;

    /* renamed from: i */
    private static volatile C63010eb f149393i;

    /* renamed from: a */
    public int f149394a = 0;

    /* renamed from: b */
    public Object f149395b;

    /* renamed from: c */
    public String f149396c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C56077p f149397d;

    /* renamed from: e */
    public C56063b f149398e;

    /* renamed from: f */
    public C62971cq f149399f = emptyProtobufList();

    /* renamed from: h */
    private int f149400h;

    static {
        C56069h hVar = new C56069h();
        f149392g = hVar;
        C62942bv.registerDefaultInstance(C56069h.class, hVar);
    }

    private C56069h() {
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
                return newMessageInfo(f149392g, "\u0000\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002<\u0000\u0003Ȉ\u0004ဉ\u0000\u0005\t\u0006\u001b", new Object[]{"b", "a", C19618h.f54585a, C56060ad.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C56062af.class});
            case 3:
                return new C56069h();
            case 4:
                return new C56068g();
            case 5:
                return f149392g;
            case 6:
                C63010eb ebVar = f149393i;
                if (ebVar == null) {
                    synchronized (C56069h.class) {
                        ebVar = f149393i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149392g);
                            f149393i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
