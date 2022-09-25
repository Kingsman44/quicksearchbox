package com.google.p4273bs.p4277b.p4278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.i */
/* compiled from: PG */
public final class C56469i extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56469i f150839g;

    /* renamed from: h */
    private static volatile C63010eb f150840h;

    /* renamed from: a */
    public int f150841a;

    /* renamed from: b */
    public String f150842b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f150843c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f150844d;

    /* renamed from: e */
    public int f150845e;

    /* renamed from: f */
    public double f150846f;

    static {
        C56469i iVar = new C56469i();
        f150839g = iVar;
        C62942bv.registerDefaultInstance(C56469i.class, iVar);
    }

    private C56469i() {
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
                return newMessageInfo(f150839g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003င\u0001\u0004င\u0002\u0005က\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C56469i();
            case 4:
                return new C56468h();
            case 5:
                return f150839g;
            case 6:
                C63010eb ebVar = f150840h;
                if (ebVar == null) {
                    synchronized (C56469i.class) {
                        ebVar = f150840h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150839g);
                            f150840h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
