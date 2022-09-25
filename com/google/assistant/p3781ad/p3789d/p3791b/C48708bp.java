package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bp */
/* compiled from: PG */
public final class C48708bp extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48708bp f126010g;

    /* renamed from: i */
    private static volatile C63010eb f126011i;

    /* renamed from: a */
    public int f126012a;

    /* renamed from: b */
    public int f126013b;

    /* renamed from: c */
    public C48710br f126014c;

    /* renamed from: d */
    public C48712bt f126015d;

    /* renamed from: e */
    public C48706bn f126016e;

    /* renamed from: f */
    public C48696bd f126017f;

    /* renamed from: h */
    private byte f126018h = 2;

    static {
        C48708bp bpVar = new C48708bp();
        f126010g = bpVar;
        C62942bv.registerDefaultInstance(C48708bp.class, bpVar);
    }

    private C48708bp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126018h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126018h = b;
                return null;
            case 2:
                return newMessageInfo(f126010g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C48672ag.m85260c(), C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C48708bp();
            case 4:
                return new C48707bo();
            case 5:
                return f126010g;
            case 6:
                C63010eb ebVar = f126011i;
                if (ebVar == null) {
                    synchronized (C48708bp.class) {
                        ebVar = f126011i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126010g);
                            f126011i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
