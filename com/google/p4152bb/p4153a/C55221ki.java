package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
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

/* renamed from: com.google.bb.a.ki */
/* compiled from: PG */
public final class C55221ki extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C55221ki f145380k;

    /* renamed from: l */
    public static final C62940bt f145381l;

    /* renamed from: n */
    private static volatile C63010eb f145382n;

    /* renamed from: a */
    public C62971cq f145383a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f145384b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145385c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f145386d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f145387e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f145388f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f145389g = emptyProtobufList();

    /* renamed from: h */
    public C62971cq f145390h = emptyProtobufList();

    /* renamed from: i */
    public C62971cq f145391i = emptyProtobufList();

    /* renamed from: j */
    public C62971cq f145392j = emptyProtobufList();

    /* renamed from: m */
    private byte f145393m = 2;

    static {
        C55221ki kiVar = new C55221ki();
        f145380k = kiVar;
        C62942bv.registerDefaultInstance(C55221ki.class, kiVar);
        f145381l = C62942bv.newSingularGeneratedExtension(C55215kc.f145365c, kiVar, kiVar, (C62958ce) null, 1001, C63066gd.MESSAGE, C55221ki.class);
    }

    private C55221ki() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145393m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145393m = b;
                return null;
            case 2:
                return newMessageInfo(f145380k, "\u0001\n\u0000\u0000\u0001\n\n\u0000\n\n\u0001Л\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007Л\bЛ\tЛ\nЛ", new Object[]{"a", C55365pr.class, "b", C55365pr.class, C45240c.f118157a, C55365pr.class, "d", C55365pr.class, "e", C55365pr.class, C10662f.f35572a, C55365pr.class, C30325g.f82003a, C55365pr.class, C19618h.f54585a, C55365pr.class, "i", C55365pr.class, "j", C55365pr.class});
            case 3:
                return new C55221ki();
            case 4:
                return new C55220kh();
            case 5:
                return f145380k;
            case 6:
                C63010eb ebVar = f145382n;
                if (ebVar == null) {
                    synchronized (C55221ki.class) {
                        ebVar = f145382n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145380k);
                            f145382n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
