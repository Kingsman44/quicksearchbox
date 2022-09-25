package com.google.assistant.p4016z;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.bf */
/* compiled from: PG */
public final class C53708bf extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53708bf f140992g;

    /* renamed from: i */
    private static volatile C63010eb f140993i;

    /* renamed from: a */
    public int f140994a;

    /* renamed from: b */
    public int f140995b;

    /* renamed from: c */
    public C53692aq f140996c;

    /* renamed from: d */
    public double f140997d;

    /* renamed from: e */
    public int f140998e;

    /* renamed from: f */
    public double f140999f;

    /* renamed from: h */
    private byte f141000h = 2;

    static {
        C53708bf bfVar = new C53708bf();
        f140992g = bfVar;
        C62942bv.registerDefaultInstance(C53708bf.class, bfVar);
    }

    private C53708bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141000h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141000h = b;
                return null;
            case 2:
                return newMessageInfo(f140992g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003က\u0002\u0004ဌ\u0003\u0005က\u0004", new Object[]{"a", "b", C53707be.f140991a, C45240c.f118157a, "d", "e", C53706bd.m86890b(), C10662f.f35572a});
            case 3:
                return new C53708bf();
            case 4:
                return new C53704bb();
            case 5:
                return f140992g;
            case 6:
                C63010eb ebVar = f140993i;
                if (ebVar == null) {
                    synchronized (C53708bf.class) {
                        ebVar = f140993i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140992g);
                            f140993i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
