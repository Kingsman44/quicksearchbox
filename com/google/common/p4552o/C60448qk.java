package com.google.common.p4552o;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.qk */
/* compiled from: PG */
public final class C60448qk extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C60448qk f163581g;

    /* renamed from: i */
    private static volatile C63010eb f163582i;

    /* renamed from: a */
    public int f163583a;

    /* renamed from: b */
    public C60452qo f163584b;

    /* renamed from: c */
    public int f163585c;

    /* renamed from: d */
    public C60452qo f163586d;

    /* renamed from: e */
    public long f163587e;

    /* renamed from: f */
    public boolean f163588f;

    /* renamed from: h */
    private byte f163589h = 2;

    static {
        C60448qk qkVar = new C60448qk();
        f163581g = qkVar;
        C62942bv.registerDefaultInstance(C60448qk.class, qkVar);
    }

    private C60448qk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163589h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163589h = b;
                return null;
            case 2:
                return newMessageInfo(f163581g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C60447qj.f163580a, "d", "e", C10662f.f35572a});
            case 3:
                return new C60448qk();
            case 4:
                return new C60446qi();
            case 5:
                return f163581g;
            case 6:
                C63010eb ebVar = f163582i;
                if (ebVar == null) {
                    synchronized (C60448qk.class) {
                        ebVar = f163582i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163581g);
                            f163582i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
