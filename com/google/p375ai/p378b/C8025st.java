package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.st */
/* compiled from: PG */
public final class C8025st extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C8025st f28178h;

    /* renamed from: j */
    private static volatile C63010eb f28179j;

    /* renamed from: a */
    public int f28180a;

    /* renamed from: b */
    public C62971cq f28181b = emptyProtobufList();

    /* renamed from: c */
    public C7536ax f28182c;

    /* renamed from: d */
    public int f28183d;

    /* renamed from: e */
    public C8150xj f28184e;

    /* renamed from: f */
    public boolean f28185f = true;

    /* renamed from: g */
    public C7977qz f28186g;

    /* renamed from: i */
    private byte f28187i = 2;

    static {
        C8025st stVar = new C8025st();
        f28178h = stVar;
        C62942bv.registerDefaultInstance(C8025st.class, stVar);
    }

    private C8025st() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28187i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28187i = b;
                return null;
            case 2:
                return newMessageInfo(f28178h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003င\u0001\u0004ဉ\u0002\u0005ဇ\u0003\bဉ\u0005", new Object[]{"a", "b", C8019sn.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C8025st();
            case 4:
                return new C8024ss();
            case 5:
                return f28178h;
            case 6:
                C63010eb ebVar = f28179j;
                if (ebVar == null) {
                    synchronized (C8025st.class) {
                        ebVar = f28179j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28178h);
                            f28179j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
