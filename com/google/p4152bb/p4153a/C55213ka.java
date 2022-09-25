package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ka */
/* compiled from: PG */
public final class C55213ka extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C55213ka f145356g;

    /* renamed from: i */
    private static volatile C63010eb f145357i;

    /* renamed from: a */
    public int f145358a;

    /* renamed from: b */
    public int f145359b;

    /* renamed from: c */
    public String f145360c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C55136he f145361d;

    /* renamed from: e */
    public int f145362e;

    /* renamed from: f */
    public int f145363f;

    /* renamed from: h */
    private byte f145364h = 2;

    static {
        C55213ka kaVar = new C55213ka();
        f145356g = kaVar;
        C62942bv.registerDefaultInstance(C55213ka.class, kaVar);
    }

    private C55213ka() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145364h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145364h = b;
                return null;
            case 2:
                return newMessageInfo(f145356g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003င\u0004\u0005င\u0005\nᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, "d"});
            case 3:
                return new C55213ka();
            case 4:
                return new C55211jz();
            case 5:
                return f145356g;
            case 6:
                C63010eb ebVar = f145357i;
                if (ebVar == null) {
                    synchronized (C55213ka.class) {
                        ebVar = f145357i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145356g);
                            f145357i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
