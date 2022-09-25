package com.google.android.libraries.lens.ondevice.p2037n;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.ak */
/* compiled from: PG */
public final class C24778ak extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C24778ak f67705g;

    /* renamed from: h */
    private static volatile C63010eb f67706h;

    /* renamed from: a */
    public int f67707a;

    /* renamed from: b */
    public String f67708b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f67709c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f67710d;

    /* renamed from: e */
    public C62971cq f67711e = emptyProtobufList();

    /* renamed from: f */
    public String f67712f = BuildConfig.FLAVOR;

    static {
        C24778ak akVar = new C24778ak();
        f67705g = akVar;
        C62942bv.registerDefaultInstance(C24778ak.class, akVar);
    }

    private C24778ak() {
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
                return newMessageInfo(f67705g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0006ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C24776ai.class, C10662f.f35572a});
            case 3:
                return new C24778ak();
            case 4:
                return new C24777aj();
            case 5:
                return f67705g;
            case 6:
                C63010eb ebVar = f67706h;
                if (ebVar == null) {
                    synchronized (C24778ak.class) {
                        ebVar = f67706h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67705g);
                            f67706h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
