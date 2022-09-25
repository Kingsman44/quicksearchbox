package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.k */
/* compiled from: PG */
public final class C55503k extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55503k f146459g;

    /* renamed from: h */
    private static volatile C63010eb f146460h;

    /* renamed from: a */
    public int f146461a;

    /* renamed from: b */
    public String f146462b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f146463c;

    /* renamed from: d */
    public long f146464d;

    /* renamed from: e */
    public String f146465e;

    /* renamed from: f */
    public String f146466f;

    static {
        C55503k kVar = new C55503k();
        f146459g = kVar;
        C62942bv.registerDefaultInstance(C55503k.class, kVar);
    }

    private C55503k() {
        emptyProtobufList();
        this.f146465e = BuildConfig.FLAVOR;
        this.f146466f = BuildConfig.FLAVOR;
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
                return newMessageInfo(f146459g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d"});
            case 3:
                return new C55503k();
            case 4:
                return new C55502j();
            case 5:
                return f146459g;
            case 6:
                C63010eb ebVar = f146460h;
                if (ebVar == null) {
                    synchronized (C55503k.class) {
                        ebVar = f146460h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146459g);
                            f146460h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
