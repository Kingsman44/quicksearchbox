package com.google.p4160bf.p4164b.p4165a.p4166a;

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

/* renamed from: com.google.bf.b.a.a.o */
/* compiled from: PG */
public final class C55579o extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55579o f146634g;

    /* renamed from: i */
    private static volatile C63010eb f146635i;

    /* renamed from: a */
    public String f146636a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f146637b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f146638c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f146639d = emptyProtobufList();

    /* renamed from: e */
    public int f146640e;

    /* renamed from: f */
    public C62971cq f146641f = emptyProtobufList();

    /* renamed from: h */
    private int f146642h;

    static {
        C55579o oVar = new C55579o();
        f146634g = oVar;
        C62942bv.registerDefaultInstance(C55579o.class, oVar);
    }

    private C55579o() {
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
                return newMessageInfo(f146634g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004\u001b\u0005ဌ\u0002\u0006\u001b", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, C55530aj.class, "d", C55568d.class, "e", C55577m.f146633a, C10662f.f35572a, C55530aj.class});
            case 3:
                return new C55579o();
            case 4:
                return new C55576l();
            case 5:
                return f146634g;
            case 6:
                C63010eb ebVar = f146635i;
                if (ebVar == null) {
                    synchronized (C55579o.class) {
                        ebVar = f146635i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146634g);
                            f146635i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
