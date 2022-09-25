package com.google.assistant.p3745ab;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cc */
/* compiled from: PG */
public final class C48275cc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48275cc f124856g;

    /* renamed from: h */
    private static volatile C63010eb f124857h;

    /* renamed from: a */
    public int f124858a;

    /* renamed from: b */
    public boolean f124859b;

    /* renamed from: c */
    public long f124860c;

    /* renamed from: d */
    public long f124861d;

    /* renamed from: e */
    public boolean f124862e;

    /* renamed from: f */
    public boolean f124863f;

    static {
        C48275cc ccVar = new C48275cc();
        f124856g = ccVar;
        C62942bv.registerDefaultInstance(C48275cc.class, ccVar);
    }

    private C48275cc() {
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
                return newMessageInfo(f124856g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48275cc();
            case 4:
                return new C48274cb();
            case 5:
                return f124856g;
            case 6:
                C63010eb ebVar = f124857h;
                if (ebVar == null) {
                    synchronized (C48275cc.class) {
                        ebVar = f124857h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124856g);
                            f124857h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
