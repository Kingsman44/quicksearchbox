package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.s.a.cs */
/* compiled from: PG */
public final class C53136cs extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53136cs f139269g;

    /* renamed from: h */
    private static volatile C63010eb f139270h;

    /* renamed from: a */
    public int f139271a;

    /* renamed from: b */
    public String f139272b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f139273c;

    /* renamed from: d */
    public String f139274d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f139275e = emptyProtobufList();

    /* renamed from: f */
    public C63088z f139276f = C63088z.f170246b;

    static {
        C53136cs csVar = new C53136cs();
        f139269g = csVar;
        C62942bv.registerDefaultInstance(C53136cs.class, csVar);
    }

    private C53136cs() {
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
                return newMessageInfo(f139269g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001b\u0005ည\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C53135cr.class, C10662f.f35572a});
            case 3:
                return new C53136cs();
            case 4:
                return new C53133cp();
            case 5:
                return f139269g;
            case 6:
                C63010eb ebVar = f139270h;
                if (ebVar == null) {
                    synchronized (C53136cs.class) {
                        ebVar = f139270h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139269g);
                            f139270h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
