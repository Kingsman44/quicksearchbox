package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.p */
/* compiled from: PG */
public final class C66111p extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66111p f179778g;

    /* renamed from: h */
    private static volatile C63010eb f179779h;

    /* renamed from: a */
    public int f179780a;

    /* renamed from: b */
    public String f179781b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66103h f179782c;

    /* renamed from: d */
    public C66109n f179783d;

    /* renamed from: e */
    public C66109n f179784e;

    /* renamed from: f */
    public C66109n f179785f;

    static {
        C66111p pVar = new C66111p();
        f179778g = pVar;
        C62942bv.registerDefaultInstance(C66111p.class, pVar);
    }

    private C66111p() {
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
                return newMessageInfo(f179778g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C66111p();
            case 4:
                return new C66110o();
            case 5:
                return f179778g;
            case 6:
                C63010eb ebVar = f179779h;
                if (ebVar == null) {
                    synchronized (C66111p.class) {
                        ebVar = f179779h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179778g);
                            f179779h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
