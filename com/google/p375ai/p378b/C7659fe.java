package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.fe */
/* compiled from: PG */
public final class C7659fe extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f26575e = new C7655fa();

    /* renamed from: h */
    public static final C7659fe f26576h;

    /* renamed from: j */
    private static volatile C63010eb f26577j;

    /* renamed from: a */
    public int f26578a;

    /* renamed from: b */
    public int f26579b;

    /* renamed from: c */
    public C7653ez f26580c;

    /* renamed from: d */
    public C62961ch f26581d = emptyIntList();

    /* renamed from: f */
    public C62971cq f26582f = emptyProtobufList();

    /* renamed from: g */
    public boolean f26583g;

    /* renamed from: i */
    private byte f26584i = 2;

    static {
        C7659fe feVar = new C7659fe();
        f26576h = feVar;
        C62942bv.registerDefaultInstance(C7659fe.class, feVar);
    }

    private C7659fe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26584i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26584i = b;
                return null;
            case 2:
                return newMessageInfo(f26576h, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0004\u001e\u0005Л\u0007ဇ\u0002", new Object[]{"a", "b", C7657fc.f26574a, C45240c.f118157a, "d", C7746ik.m22835b(), C10662f.f35572a, C7520ah.class, C30325g.f82003a});
            case 3:
                return new C7659fe();
            case 4:
                return new C7656fb();
            case 5:
                return f26576h;
            case 6:
                C63010eb ebVar = f26577j;
                if (ebVar == null) {
                    synchronized (C7659fe.class) {
                        ebVar = f26577j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26576h);
                            f26577j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
