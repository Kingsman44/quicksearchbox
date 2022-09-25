package com.google.speech.p5228m;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.aa */
/* compiled from: PG */
public final class C67270aa extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C67270aa f182856g;

    /* renamed from: i */
    private static volatile C63010eb f182857i;

    /* renamed from: a */
    public int f182858a;

    /* renamed from: b */
    public String f182859b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f182860c;

    /* renamed from: d */
    public C67337cn f182861d;

    /* renamed from: e */
    public C67272ac f182862e;

    /* renamed from: f */
    public boolean f182863f;

    /* renamed from: h */
    private byte f182864h = 2;

    static {
        C67270aa aaVar = new C67270aa();
        f182856g = aaVar;
        C62942bv.registerDefaultInstance(C67270aa.class, aaVar);
    }

    private C67270aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182864h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182864h = b;
                return null;
            case 2:
                return newMessageInfo(f182856g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0005ᐉ\u0005\u0006ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C67270aa();
            case 4:
                return new C67362z();
            case 5:
                return f182856g;
            case 6:
                C63010eb ebVar = f182857i;
                if (ebVar == null) {
                    synchronized (C67270aa.class) {
                        ebVar = f182857i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182856g);
                            f182857i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
