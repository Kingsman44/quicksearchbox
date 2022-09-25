package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4883as.p4884a.C63775d;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.cc */
/* compiled from: PG */
public final class C82833cc extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C82833cc f225801h;

    /* renamed from: i */
    private static volatile C63010eb f225802i;

    /* renamed from: a */
    public int f225803a;

    /* renamed from: b */
    public int f225804b;

    /* renamed from: c */
    public int f225805c;

    /* renamed from: d */
    public C62971cq f225806d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f225807e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62964ck f225808f = emptyLongList();

    /* renamed from: g */
    public C62971cq f225809g = C62942bv.emptyProtobufList();

    static {
        C82833cc ccVar = new C82833cc();
        f225801h = ccVar;
        C62942bv.registerDefaultInstance(C82833cc.class, ccVar);
    }

    private C82833cc() {
    }

    /* renamed from: a */
    public final C82835ce mo76623a() {
        C82835ce a = C82835ce.m132409a(this.f225804b);
        return a == null ? C82835ce.FULFILLMENT_ABORT_TYPE_UNKNOWN : a;
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
                return newMessageInfo(f225801h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0004\u0000\u0001ဌ\u0000\u0002\u001b\u0003\u0014\u0004\u001a\u0005ဌ\u0001\u0006\u001a", new Object[]{"a", "b", C82835ce.m132410b(), "d", C63775d.class, C10662f.f35572a, C30325g.f82003a, C45240c.f118157a, C82831ca.m132407b(), "e"});
            case 3:
                return new C82833cc();
            case 4:
                return new C82832cb();
            case 5:
                return f225801h;
            case 6:
                C63010eb ebVar = f225802i;
                if (ebVar == null) {
                    synchronized (C82833cc.class) {
                        ebVar = f225802i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225801h);
                            f225802i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
