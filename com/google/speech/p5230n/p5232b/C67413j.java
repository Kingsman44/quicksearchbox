package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.j */
/* compiled from: PG */
public final class C67413j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67413j f183220a;

    /* renamed from: e */
    private static volatile C63010eb f183221e;

    /* renamed from: b */
    private int f183222b;

    /* renamed from: c */
    private String f183223c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f183224d = 2;

    static {
        C67413j jVar = new C67413j();
        f183220a = jVar;
        C62942bv.registerDefaultInstance(C67413j.class, jVar);
    }

    private C67413j() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183224d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183224d = b;
                return null;
            case 2:
                return newMessageInfo(f183220a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C67413j();
            case 4:
                return new C67412i();
            case 5:
                return f183220a;
            case 6:
                C63010eb ebVar = f183221e;
                if (ebVar == null) {
                    synchronized (C67413j.class) {
                        ebVar = f183221e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183220a);
                            f183221e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
