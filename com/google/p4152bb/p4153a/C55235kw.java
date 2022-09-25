package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.kw */
/* compiled from: PG */
public final class C55235kw extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C55235kw f145426i;

    /* renamed from: j */
    public static final C62940bt f145427j;

    /* renamed from: l */
    private static volatile C63010eb f145428l;

    /* renamed from: a */
    public int f145429a;

    /* renamed from: b */
    public String f145430b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f145431c = emptyProtobufList();

    /* renamed from: d */
    public C55373pz f145432d;

    /* renamed from: e */
    public C55177is f145433e;

    /* renamed from: f */
    public C62971cq f145434f = emptyProtobufList();

    /* renamed from: g */
    public boolean f145435g;

    /* renamed from: h */
    public String f145436h = BuildConfig.FLAVOR;

    /* renamed from: k */
    private byte f145437k = 2;

    static {
        C55235kw kwVar = new C55235kw();
        f145426i = kwVar;
        C62942bv.registerDefaultInstance(C55235kw.class, kwVar);
        f145427j = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, kwVar, kwVar, (C62958ce) null, 1002, C63066gd.MESSAGE, C55235kw.class);
    }

    private C55235kw() {
    }

    /* renamed from: a */
    public final void mo54213a() {
        C62971cq cqVar = this.f145431c;
        if (!cqVar.mo58948c()) {
            this.f145431c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo54214b() {
        C62971cq cqVar = this.f145434f;
        if (!cqVar.mo58948c()) {
            this.f145434f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145437k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145437k = b;
                return null;
            case 2:
                return newMessageInfo(f145426i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0003\u0001ဈ\u0000\u0002Л\u0003ဉ\u0002\u0004Л\u0005ဇ\u0003\u0006ဈ\u0004\bᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C55247lh.class, "e", C10662f.f35572a, C55029df.class, C30325g.f82003a, C19618h.f54585a, "d"});
            case 3:
                return new C55235kw();
            case 4:
                return new C55234kv();
            case 5:
                return f145426i;
            case 6:
                C63010eb ebVar = f145428l;
                if (ebVar == null) {
                    synchronized (C55235kw.class) {
                        ebVar = f145428l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145426i);
                            f145428l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
