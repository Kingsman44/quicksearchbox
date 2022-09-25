package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.j */
/* compiled from: PG */
public final class C7762j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C7762j f27177h;

    /* renamed from: j */
    private static volatile C63010eb f27178j;

    /* renamed from: a */
    public int f27179a;

    /* renamed from: b */
    public C62971cq f27180b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f27181c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f27182d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f27183e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f27184f = emptyProtobufList();

    /* renamed from: g */
    public int f27185g;

    /* renamed from: i */
    private byte f27186i = 2;

    static {
        C7762j jVar = new C7762j();
        f27177h = jVar;
        C62942bv.registerDefaultInstance(C7762j.class, jVar);
    }

    private C7762j() {
    }

    /* renamed from: a */
    public final void mo16958a() {
        C62971cq cqVar = this.f27180b;
        if (!cqVar.mo58948c()) {
            this.f27180b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27186i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27186i = b;
                return null;
            case 2:
                return newMessageInfo(f27177h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0005\u0005\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007င\u0000", new Object[]{"a", "b", C7752iq.class, C45240c.f118157a, C7708h.class, "d", C7718hj.class, "e", C7709ha.class, C10662f.f35572a, C7709ha.class, C30325g.f82003a});
            case 3:
                return new C7762j();
            case 4:
                return new C7735i();
            case 5:
                return f27177h;
            case 6:
                C63010eb ebVar = f27178j;
                if (ebVar == null) {
                    synchronized (C7762j.class) {
                        ebVar = f27178j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27177h);
                            f27178j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
