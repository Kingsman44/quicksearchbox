package com.google.p4152bb.p4153a;

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

/* renamed from: com.google.bb.a.od */
/* compiled from: PG */
public final class C55324od extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C55324od f145745j;

    /* renamed from: k */
    public static final C62940bt f145746k;

    /* renamed from: m */
    private static volatile C63010eb f145747m;

    /* renamed from: a */
    public int f145748a;

    /* renamed from: b */
    public C62971cq f145749b = emptyProtobufList();

    /* renamed from: c */
    public C55373pz f145750c;

    /* renamed from: d */
    public C62971cq f145751d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f145752e;

    /* renamed from: f */
    public C62971cq f145753f;

    /* renamed from: g */
    public C55311nr f145754g;

    /* renamed from: h */
    public C55313nt f145755h;

    /* renamed from: i */
    public C62971cq f145756i;

    /* renamed from: l */
    private byte f145757l = 2;

    static {
        C55324od odVar = new C55324od();
        f145745j = odVar;
        C62942bv.registerDefaultInstance(C55324od.class, odVar);
        f145746k = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, odVar, odVar, (C62958ce) null, 85497192, C63066gd.MESSAGE, C55324od.class);
    }

    private C55324od() {
        emptyProtobufList();
        emptyProtobufList();
        this.f145752e = emptyProtobufList();
        this.f145753f = emptyProtobufList();
        this.f145756i = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145757l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145757l = b;
                return null;
            case 2:
                return newMessageInfo(f145745j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0005\b\u0001Л\u0002Л\u0005ᐉ\u0001\u0006ᐉ\u0002\u0007ᐉ\u0000\bЛ\tЛ\nЛ", new Object[]{"a", "b", C55330oj.class, "d", C55029df.class, C30325g.f82003a, C19618h.f54585a, C45240c.f118157a, "i", C55282mp.class, "e", C55305nl.class, C10662f.f35572a, C55305nl.class});
            case 3:
                return new C55324od();
            case 4:
                return new C55323oc();
            case 5:
                return f145745j;
            case 6:
                C63010eb ebVar = f145747m;
                if (ebVar == null) {
                    synchronized (C55324od.class) {
                        ebVar = f145747m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145745j);
                            f145747m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
