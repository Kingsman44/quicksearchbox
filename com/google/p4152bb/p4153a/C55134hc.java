package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.hc */
/* compiled from: PG */
public final class C55134hc extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C55134hc f145119i;

    /* renamed from: k */
    private static volatile C63010eb f145120k;

    /* renamed from: a */
    public int f145121a;

    /* renamed from: b */
    public int f145122b;

    /* renamed from: c */
    public int f145123c;

    /* renamed from: d */
    public String f145124d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f145125e;

    /* renamed from: f */
    public C62961ch f145126f;

    /* renamed from: g */
    public C55138hg f145127g;

    /* renamed from: h */
    public C55129gy f145128h;

    /* renamed from: j */
    private byte f145129j = 2;

    static {
        C55134hc hcVar = new C55134hc();
        f145119i = hcVar;
        C62942bv.registerDefaultInstance(C55134hc.class, hcVar);
    }

    private C55134hc() {
        emptyProtobufList();
        this.f145126f = emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145129j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145129j = b;
                return null;
            case 2:
                return newMessageInfo(f145119i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0004\u0005ဈ\u0002\u0006ဉ\u0005\bဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, C55133hb.m87601b(), C10662f.f35572a, C30325g.f82003a, "d", C19618h.f54585a, "e"});
            case 3:
                return new C55134hc();
            case 4:
                return new C55130gz();
            case 5:
                return f145119i;
            case 6:
                C63010eb ebVar = f145120k;
                if (ebVar == null) {
                    synchronized (C55134hc.class) {
                        ebVar = f145120k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145119i);
                            f145120k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
