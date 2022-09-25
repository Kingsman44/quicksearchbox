package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.C57524i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ql */
/* compiled from: PG */
public final class C7963ql extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C7963ql f27969i;

    /* renamed from: m */
    private static volatile C63010eb f27970m;

    /* renamed from: a */
    public int f27971a;

    /* renamed from: b */
    public C7722hn f27972b;

    /* renamed from: c */
    public C7816l f27973c;

    /* renamed from: d */
    public C7771ji f27974d;

    /* renamed from: e */
    public C8164xx f27975e;

    /* renamed from: f */
    public C7884nn f27976f;

    /* renamed from: g */
    public C7961qj f27977g;

    /* renamed from: h */
    public C57524i f27978h;

    /* renamed from: j */
    private C8160xt f27979j;

    /* renamed from: k */
    private C7794ke f27980k;

    /* renamed from: l */
    private byte f27981l = 2;

    static {
        C7963ql qlVar = new C7963ql();
        f27969i = qlVar;
        C62942bv.registerDefaultInstance(C7963ql.class, qlVar);
    }

    private C7963ql() {
        emptyIntList();
    }

    /* renamed from: a */
    public final boolean mo17003a() {
        return (this.f27971a & 1) != 0;
    }

    /* renamed from: b */
    public final C7722hn mo17004b() {
        C7722hn hnVar = this.f27972b;
        return hnVar == null ? C7722hn.f26993i : hnVar;
    }

    /* renamed from: c */
    public final boolean mo17005c() {
        return (this.f27971a & 2) != 0;
    }

    /* renamed from: d */
    public final C7816l mo17006d() {
        C7816l lVar = this.f27973c;
        return lVar == null ? C7816l.f27316c : lVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27981l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27981l = b;
                return null;
            case 2:
                return newMessageInfo(f27969i, "\u0001\t\u0000\u0001\b5\t\u0000\u0000\u0007\bᐉ\u0000\nᐉ\u0002\u000bဉ\u0001\u0010ᐉ\u0003\u0011ᐉ\u0004\u0018ဉ\u0006\u001aᐉ\u0007\u001dᐉ\t5ᐉ\n", new Object[]{"a", "b", "d", C45240c.f118157a, "e", "j", C10662f.f35572a, C30325g.f82003a, C19621k.f54601a, C19618h.f54585a});
            case 3:
                return new C7963ql();
            case 4:
                return new C7962qk();
            case 5:
                return f27969i;
            case 6:
                C63010eb ebVar = f27970m;
                if (ebVar == null) {
                    synchronized (C7963ql.class) {
                        ebVar = f27970m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27969i);
                            f27970m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: e */
    public final boolean mo17007e() {
        return (this.f27971a & 16) != 0;
    }

    /* renamed from: f */
    public final boolean mo17008f() {
        return (this.f27971a & 512) != 0;
    }
}
