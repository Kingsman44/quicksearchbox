package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bh */
/* compiled from: PG */
public final class C9172bh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C9172bh f31680g;

    /* renamed from: h */
    private static volatile C63010eb f31681h;

    /* renamed from: a */
    public int f31682a;

    /* renamed from: b */
    public C62971cq f31683b = emptyProtobufList();

    /* renamed from: c */
    public int f31684c;

    /* renamed from: d */
    public C9171bg f31685d;

    /* renamed from: e */
    public String f31686e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f31687f;

    static {
        C9172bh bhVar = new C9172bh();
        f31680g = bhVar;
        C62942bv.registerDefaultInstance(C9172bh.class, bhVar);
    }

    private C9172bh() {
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
                return newMessageInfo(f31680g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C9169be.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C9172bh();
            case 4:
                return new C9165ba();
            case 5:
                return f31680g;
            case 6:
                C63010eb ebVar = f31681h;
                if (ebVar == null) {
                    synchronized (C9172bh.class) {
                        ebVar = f31681h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31680g);
                            f31681h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
