package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.qr */
/* compiled from: PG */
public final class C55392qr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C55392qr f145950g;

    /* renamed from: h */
    public static final C62940bt f145951h;

    /* renamed from: j */
    private static volatile C63010eb f145952j;

    /* renamed from: a */
    public int f145953a;

    /* renamed from: b */
    public C62971cq f145954b = emptyProtobufList();

    /* renamed from: c */
    public C55093fp f145955c;

    /* renamed from: d */
    public boolean f145956d;

    /* renamed from: e */
    public boolean f145957e;

    /* renamed from: f */
    public boolean f145958f;

    /* renamed from: i */
    private byte f145959i = 2;

    static {
        C55392qr qrVar = new C55392qr();
        f145950g = qrVar;
        C62942bv.registerDefaultInstance(C55392qr.class, qrVar);
        f145951h = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, qrVar, qrVar, (C62958ce) null, 36088723, C63066gd.MESSAGE, C55392qr.class);
    }

    private C55392qr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145959i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145959i = b;
                return null;
            case 2:
                return newMessageInfo(f145950g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0002\u0001Л\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0006ᐉ\u0000", new Object[]{"a", "b", C55423z.class, "d", "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C55392qr();
            case 4:
                return new C55391qq();
            case 5:
                return f145950g;
            case 6:
                C63010eb ebVar = f145952j;
                if (ebVar == null) {
                    synchronized (C55392qr.class) {
                        ebVar = f145952j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145950g);
                            f145952j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
