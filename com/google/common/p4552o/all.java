package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
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

/* renamed from: com.google.common.o.all */
/* compiled from: PG */
public final class all extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final all f159065n;

    /* renamed from: o */
    public static final C62940bt f159066o;

    /* renamed from: q */
    private static volatile C63010eb f159067q;

    /* renamed from: a */
    public int f159068a;

    /* renamed from: b */
    public C62971cq f159069b = emptyProtobufList();

    /* renamed from: c */
    public alg f159070c;

    /* renamed from: d */
    public boolean f159071d;

    /* renamed from: e */
    public boolean f159072e;

    /* renamed from: f */
    public boolean f159073f;

    /* renamed from: g */
    public boolean f159074g;

    /* renamed from: h */
    public int f159075h = -1;

    /* renamed from: i */
    public C62971cq f159076i = emptyProtobufList();

    /* renamed from: j */
    public alk f159077j;

    /* renamed from: k */
    public boolean f159078k;

    /* renamed from: l */
    public C62971cq f159079l = emptyProtobufList();

    /* renamed from: m */
    public akn f159080m;

    /* renamed from: p */
    private byte f159081p = 2;

    static {
        all all = new all();
        f159065n = all;
        C62942bv.registerDefaultInstance(all.class, all);
        f159066o = C62942bv.newSingularGeneratedExtension(aqs.f159780k, all, all, (C62958ce) null, 660, C63066gd.MESSAGE, all.class);
    }

    private all() {
    }

    /* renamed from: a */
    public final void mo57021a() {
        C62971cq cqVar = this.f159069b;
        if (!cqVar.mo58948c()) {
            this.f159069b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159081p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159081p = b;
                return null;
            case 2:
                return newMessageInfo(f159065n, "\u0001\f\u0000\u0001\u0002\u0010\f\u0000\u0003\u0001\u0002\u001b\u0003ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဉ\u0002\t\u001b\nဉ\b\u000b\u001b\fဇ\u0006\rဇ\t\u000fᐉ\u000b\u0010ဏ\u0007", new Object[]{"a", "b", aky.class, "d", "e", C10662f.f35572a, C45240c.f118157a, "i", alk.class, "j", "l", akl.class, C30325g.f82003a, C19621k.f54601a, "m", C19618h.f54585a});
            case 3:
                return new all();
            case 4:
                return new akh();
            case 5:
                return f159065n;
            case 6:
                C63010eb ebVar = f159067q;
                if (ebVar == null) {
                    synchronized (all.class) {
                        ebVar = f159067q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159065n);
                            f159067q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
