package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aqm */
/* compiled from: PG */
public final class aqm extends C62937bq implements C62938br {

    /* renamed from: n */
    public static final aqm f159760n;

    /* renamed from: p */
    private static volatile C63010eb f159761p;

    /* renamed from: a */
    public int f159762a;

    /* renamed from: b */
    public C60214n f159763b;

    /* renamed from: c */
    public String f159764c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f159765d = -1;

    /* renamed from: e */
    public int f159766e = -1;

    /* renamed from: f */
    public int f159767f;

    /* renamed from: g */
    public int f159768g;

    /* renamed from: h */
    public int f159769h;

    /* renamed from: i */
    public int f159770i = -1;

    /* renamed from: j */
    public String f159771j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f159772k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C62971cq f159773l = emptyProtobufList();

    /* renamed from: m */
    public C60313nz f159774m;

    /* renamed from: o */
    private byte f159775o = 2;

    static {
        aqm aqm = new aqm();
        f159760n = aqm;
        C62942bv.registerDefaultInstance(aqm.class, aqm);
    }

    private aqm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159775o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159775o = b;
                return null;
            case 2:
                return newMessageInfo(f159760n, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0001\u0003\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\tဈ\n\nဈ\u000b\u000bဈ\u0001\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new Object[]{"a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C45240c.f118157a, "l", aqs.class, "m", "b"});
            case 3:
                return new aqm();
            case 4:
                return new aql();
            case 5:
                return f159760n;
            case 6:
                C63010eb ebVar = f159761p;
                if (ebVar == null) {
                    synchronized (aqm.class) {
                        ebVar = f159761p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159760n);
                            f159761p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
