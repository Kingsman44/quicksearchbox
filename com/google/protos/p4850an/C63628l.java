package com.google.protos.p4850an;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3927k.p3928a.C52664d;
import com.google.assistant.p3897e.p3929l.p3930a.C52792t;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.l */
/* compiled from: PG */
public final class C63628l extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63628l f172077a;

    /* renamed from: i */
    private static volatile C63010eb f172078i;

    /* renamed from: b */
    private int f172079b;

    /* renamed from: c */
    private C51715bm f172080c;

    /* renamed from: d */
    private C51379fn f172081d;

    /* renamed from: e */
    private C52792t f172082e;

    /* renamed from: f */
    private C52664d f172083f;

    /* renamed from: g */
    private C60220t f172084g;

    /* renamed from: h */
    private byte f172085h = 2;

    static {
        C63628l lVar = new C63628l();
        f172077a = lVar;
        C62942bv.registerDefaultInstance(C63628l.class, lVar);
    }

    private C63628l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172085h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172085h = b;
                return null;
            case 2:
                return newMessageInfo(f172077a, "\u0001\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0004ᐉ\u0002\nᐉ\u0005\u000bᐉ\u0006\u000fᐉ\t", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C63628l();
            case 4:
                return new C63627k();
            case 5:
                return f172077a;
            case 6:
                C63010eb ebVar = f172078i;
                if (ebVar == null) {
                    synchronized (C63628l.class) {
                        ebVar = f172078i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172077a);
                            f172078i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
