package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.na */
/* compiled from: PG */
public final class C7871na extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C7871na f27564j;

    /* renamed from: l */
    private static volatile C63010eb f27565l;

    /* renamed from: a */
    public int f27566a;

    /* renamed from: b */
    public C8150xj f27567b;

    /* renamed from: c */
    public C8150xj f27568c;

    /* renamed from: d */
    public C62971cq f27569d = emptyProtobufList();

    /* renamed from: e */
    public C8150xj f27570e;

    /* renamed from: f */
    public C8150xj f27571f;

    /* renamed from: g */
    public C8150xj f27572g;

    /* renamed from: h */
    public C8150xj f27573h;

    /* renamed from: i */
    public int f27574i;

    /* renamed from: k */
    private byte f27575k = 2;

    static {
        C7871na naVar = new C7871na();
        f27564j = naVar;
        C62942bv.registerDefaultInstance(C7871na.class, naVar);
    }

    private C7871na() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27575k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27575k = b;
                return null;
            case 2:
                return newMessageInfo(f27564j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003Л\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C7867mx.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C7868my.f27556a});
            case 3:
                return new C7871na();
            case 4:
                return new C7865mv();
            case 5:
                return f27564j;
            case 6:
                C63010eb ebVar = f27565l;
                if (ebVar == null) {
                    synchronized (C7871na.class) {
                        ebVar = f27565l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27564j);
                            f27565l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
