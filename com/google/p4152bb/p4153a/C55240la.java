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
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.la */
/* compiled from: PG */
public final class C55240la extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C55240la f145449k;

    /* renamed from: m */
    private static volatile C63010eb f145450m;

    /* renamed from: a */
    public int f145451a;

    /* renamed from: b */
    public int f145452b;

    /* renamed from: c */
    public C55136he f145453c;

    /* renamed from: d */
    public int f145454d;

    /* renamed from: e */
    public String f145455e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f145456f;

    /* renamed from: g */
    public int f145457g;

    /* renamed from: h */
    public boolean f145458h = true;

    /* renamed from: i */
    public C62971cq f145459i = emptyProtobufList();

    /* renamed from: j */
    public C55136he f145460j;

    /* renamed from: l */
    private byte f145461l = 2;

    static {
        C55240la laVar = new C55240la();
        f145449k = laVar;
        C62942bv.registerDefaultInstance(C55240la.class, laVar);
    }

    private C55240la() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145461l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145461l = b;
                return null;
            case 2:
                return newMessageInfo(f145449k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0003\u0001ᐉ\u0001\u0002ဌ\u0002\u0005ဈ\u0003\u0006င\u0004\u0007င\u0005\bဇ\u0006\tЛ\nင\u0000\fᐉ\b", new Object[]{"a", C45240c.f118157a, "d", C55418u.f146030a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C55005ci.class, "b", "j"});
            case 3:
                return new C55240la();
            case 4:
                return new C55238kz();
            case 5:
                return f145449k;
            case 6:
                C63010eb ebVar = f145450m;
                if (ebVar == null) {
                    synchronized (C55240la.class) {
                        ebVar = f145450m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145449k);
                            f145450m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
