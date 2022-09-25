package com.google.p4152bb.p4153a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.pr */
/* compiled from: PG */
public final class C55365pr extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C55365pr f145876l;

    /* renamed from: n */
    private static volatile C63010eb f145877n;

    /* renamed from: a */
    public int f145878a;

    /* renamed from: b */
    public C55136he f145879b;

    /* renamed from: c */
    public C55136he f145880c;

    /* renamed from: d */
    public C68032v f145881d;

    /* renamed from: e */
    public int f145882e;

    /* renamed from: f */
    public int f145883f;

    /* renamed from: g */
    public int f145884g;

    /* renamed from: h */
    public int f145885h;

    /* renamed from: i */
    public boolean f145886i;

    /* renamed from: j */
    public int f145887j;

    /* renamed from: k */
    public C62971cq f145888k = emptyProtobufList();

    /* renamed from: m */
    private byte f145889m = 2;

    static {
        C55365pr prVar = new C55365pr();
        f145876l = prVar;
        C62942bv.registerDefaultInstance(C55365pr.class, prVar);
    }

    private C55365pr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145889m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145889m = b;
                return null;
            case 2:
                return newMessageInfo(f145876l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0003\u0004င\u0004\u0005င\u0006\u0006ᐉ\u0002\u0007င\u0005\tဇ\u0007\nင\b\u000eЛ", new Object[]{"a", "b", C45240c.f118157a, "e", C55363pp.f145875a, C10662f.f35572a, C19618h.f54585a, "d", C30325g.f82003a, "i", "j", C19621k.f54601a, C55367pt.class});
            case 3:
                return new C55365pr();
            case 4:
                return new C55362po();
            case 5:
                return f145876l;
            case 6:
                C63010eb ebVar = f145877n;
                if (ebVar == null) {
                    synchronized (C55365pr.class) {
                        ebVar = f145877n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145876l);
                            f145877n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
