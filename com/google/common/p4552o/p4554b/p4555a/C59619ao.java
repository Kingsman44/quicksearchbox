package com.google.common.p4552o.p4554b.p4555a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.ao */
/* compiled from: PG */
public final class C59619ao extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C59619ao f159847l;

    /* renamed from: m */
    private static volatile C63010eb f159848m;

    /* renamed from: a */
    public int f159849a;

    /* renamed from: b */
    public int f159850b;

    /* renamed from: c */
    public String f159851c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f159852d;

    /* renamed from: e */
    public int f159853e;

    /* renamed from: f */
    public int f159854f;

    /* renamed from: g */
    public C59613ai f159855g;

    /* renamed from: h */
    public C59626f f159856h;

    /* renamed from: i */
    public String f159857i;

    /* renamed from: j */
    public int f159858j;

    /* renamed from: k */
    public int f159859k;

    static {
        C59619ao aoVar = new C59619ao();
        f159847l = aoVar;
        C62942bv.registerDefaultInstance(C59619ao.class, aoVar);
    }

    private C59619ao() {
        emptyProtobufList();
        this.f159857i = BuildConfig.FLAVOR;
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
                return newMessageInfo(f159847l, "\u0001\n\u0000\u0001\u0001\u0015\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0006င\u0005\u0007င\u0006\nဉ\t\fဉ\u000b\rဂ\u0004\u000fဈ\f\u0013ဌ\u0010\u0015ဌ\u0012", new Object[]{"a", "b", C59617am.f159846a, C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "d", "i", "j", C59614aj.f159844a, C19621k.f54601a, C59615ak.f159845a});
            case 3:
                return new C59619ao();
            case 4:
                return new C59611ag();
            case 5:
                return f159847l;
            case 6:
                C63010eb ebVar = f159848m;
                if (ebVar == null) {
                    synchronized (C59619ao.class) {
                        ebVar = f159848m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159847l);
                            f159848m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
