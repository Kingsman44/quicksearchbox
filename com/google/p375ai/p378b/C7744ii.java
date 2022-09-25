package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.ii */
/* compiled from: PG */
public final class C7744ii extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C62962ci f27053h = new C7727hs();

    /* renamed from: p */
    public static final C7744ii f27054p;

    /* renamed from: r */
    private static volatile C63010eb f27055r;

    /* renamed from: a */
    public int f27056a;

    /* renamed from: b */
    public C7726hr f27057b;

    /* renamed from: c */
    public long f27058c;

    /* renamed from: d */
    public int f27059d;

    /* renamed from: e */
    public C62971cq f27060e = emptyProtobufList();

    /* renamed from: f */
    public int f27061f = 1;

    /* renamed from: g */
    public C62961ch f27062g = emptyIntList();

    /* renamed from: i */
    public C7724hp f27063i;

    /* renamed from: j */
    public C7739id f27064j;

    /* renamed from: k */
    public C62971cq f27065k = emptyProtobufList();

    /* renamed from: l */
    public C62971cq f27066l = emptyProtobufList();

    /* renamed from: m */
    public C62971cq f27067m = emptyProtobufList();

    /* renamed from: n */
    public C7741if f27068n;

    /* renamed from: o */
    public boolean f27069o;

    /* renamed from: q */
    private byte f27070q = 2;

    static {
        C7744ii iiVar = new C7744ii();
        f27054p = iiVar;
        C62942bv.registerDefaultInstance(C7744ii.class, iiVar);
    }

    private C7744ii() {
    }

    /* renamed from: a */
    public final void mo16955a() {
        C62971cq cqVar = this.f27060e;
        if (!cqVar.mo58948c()) {
            this.f27060e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27070q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27070q = b;
                return null;
            case 2:
                return newMessageInfo(f27054p, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0005\u0004\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004Л\u0005ဌ\u0003\u0006\u001e\bᐉ\u0005\nဉ\u0006\f\u001b\r\u001b\u000fЛ\u0010ဉ\b\u0011ဇ\t", new Object[]{"a", "b", C45240c.f118157a, "d", C8099vm.f28485a, "e", C7730hv.class, C10662f.f35572a, C7742ig.f27052a, C30325g.f82003a, C7732hx.m22830b(), "i", "j", C19621k.f54601a, C7739id.class, "l", C7734hz.class, "m", C7737ib.class, C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C7744ii();
            case 4:
                return new C7728ht();
            case 5:
                return f27054p;
            case 6:
                C63010eb ebVar = f27055r;
                if (ebVar == null) {
                    synchronized (C7744ii.class) {
                        ebVar = f27055r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27054p);
                            f27055r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
