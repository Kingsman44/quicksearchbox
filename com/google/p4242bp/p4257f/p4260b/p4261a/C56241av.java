package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.av */
/* compiled from: PG */
public final class C56241av extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56241av f149791g;

    /* renamed from: h */
    private static volatile C63010eb f149792h;

    /* renamed from: a */
    public int f149793a;

    /* renamed from: b */
    public C62971cq f149794b = emptyProtobufList();

    /* renamed from: c */
    public String f149795c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f149796d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56224ae f149797e;

    /* renamed from: f */
    public int f149798f;

    static {
        C56241av avVar = new C56241av();
        f149791g = avVar;
        C62942bv.registerDefaultInstance(C56241av.class, avVar);
    }

    private C56241av() {
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
                return newMessageInfo(f149791g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003\u001b\u0004ဈ\u0001\u0005ဌ\u0003", new Object[]{"a", C45240c.f118157a, "e", "b", C56237ar.class, "d", C10662f.f35572a, C56239at.f149790a});
            case 3:
                return new C56241av();
            case 4:
                return new C56238as();
            case 5:
                return f149791g;
            case 6:
                C63010eb ebVar = f149792h;
                if (ebVar == null) {
                    synchronized (C56241av.class) {
                        ebVar = f149792h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149791g);
                            f149792h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
