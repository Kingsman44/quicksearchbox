package com.google.p4242bp.p4267h;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.af */
/* compiled from: PG */
public final class C56394af extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C56394af f150399g;

    /* renamed from: i */
    private static volatile C63010eb f150400i;

    /* renamed from: a */
    public int f150401a;

    /* renamed from: b */
    public C56389aa f150402b;

    /* renamed from: c */
    public C62971cq f150403c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f150404d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public int f150405e;

    /* renamed from: f */
    public C62995dn f150406f = C62995dn.f170057a;

    /* renamed from: h */
    private byte f150407h = 2;

    static {
        C56394af afVar = new C56394af();
        f150399g = afVar;
        C62942bv.registerDefaultInstance(C56394af.class, afVar);
    }

    private C56394af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150407h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150407h = b;
                return null;
            case 2:
                return newMessageInfo(f150399g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0002\u0000\u0001ဉ\u0002\u0002\u001a\u0003င\u0003\u00042\u0005\u001a", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C56393ae.f150398a, C45240c.f118157a});
            case 3:
                return new C56394af();
            case 4:
                return new C56390ab();
            case 5:
                return f150399g;
            case 6:
                C63010eb ebVar = f150400i;
                if (ebVar == null) {
                    synchronized (C56394af.class) {
                        ebVar = f150400i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150399g);
                            f150400i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
