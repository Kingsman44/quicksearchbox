package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.C57051b;
import com.google.p4283bv.p4354e.C57526k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.hn */
/* compiled from: PG */
public final class C7722hn extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C7722hn f26993i;

    /* renamed from: l */
    private static volatile C63010eb f26994l;

    /* renamed from: a */
    public int f26995a;

    /* renamed from: b */
    public C62971cq f26996b = emptyProtobufList();

    /* renamed from: c */
    public C7661fg f26997c;

    /* renamed from: d */
    public C62971cq f26998d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f26999e = emptyProtobufList();

    /* renamed from: f */
    public C57526k f27000f;

    /* renamed from: g */
    public boolean f27001g;

    /* renamed from: h */
    public C57051b f27002h;

    /* renamed from: j */
    private boolean f27003j;

    /* renamed from: k */
    private byte f27004k = 2;

    static {
        C7722hn hnVar = new C7722hn();
        f26993i = hnVar;
        C62942bv.registerDefaultInstance(C7722hn.class, hnVar);
    }

    private C7722hn() {
    }

    /* renamed from: a */
    public final void mo16945a() {
        C62971cq cqVar = this.f26996b;
        if (!cqVar.mo58948c()) {
            this.f26996b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final boolean mo16946b() {
        return (this.f26995a & 64) != 0;
    }

    /* renamed from: c */
    public final boolean mo16947c() {
        return this.f27003j;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27004k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27004k = b;
                return null;
            case 2:
                return newMessageInfo(f26993i, "\u0001\b\u0000\u0001\u0001\u0011\b\u0000\u0003\u0005\u0001ᐉ\u0000\u0002Л\u0006\u001b\nЛ\u000eᐉ\u0003\u000fဇ\u0004\u0010ᐉ\u0005\u0011ဇ\u0006", new Object[]{"a", C45240c.f118157a, "b", C7744ii.class, "d", C7906oi.class, "e", C7704gw.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j"});
            case 3:
                return new C7722hn();
            case 4:
                return new C7721hm();
            case 5:
                return f26993i;
            case 6:
                C63010eb ebVar = f26994l;
                if (ebVar == null) {
                    synchronized (C7722hn.class) {
                        ebVar = f26994l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26993i);
                            f26994l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
