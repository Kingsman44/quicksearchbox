package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.oe */
/* compiled from: PG */
public final class C60321oe extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C60321oe f163224i;

    /* renamed from: l */
    private static volatile C63010eb f163225l;

    /* renamed from: a */
    public int f163226a;

    /* renamed from: b */
    public C60218r f163227b;

    /* renamed from: c */
    public C62971cq f163228c = emptyProtobufList();

    /* renamed from: d */
    public C60218r f163229d;

    /* renamed from: e */
    public aqm f163230e;

    /* renamed from: f */
    public int f163231f;

    /* renamed from: g */
    public C60450qm f163232g;

    /* renamed from: h */
    public C60341oy f163233h;

    /* renamed from: j */
    private C60218r f163234j;

    /* renamed from: k */
    private byte f163235k = 2;

    static {
        C60321oe oeVar = new C60321oe();
        f163224i = oeVar;
        C62942bv.registerDefaultInstance(C60321oe.class, oeVar);
    }

    private C60321oe() {
    }

    /* renamed from: a */
    public final void mo57085a() {
        C62971cq cqVar = this.f163228c;
        if (!cqVar.mo58948c()) {
            this.f163228c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163235k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163235k = b;
                return null;
            case 2:
                return newMessageInfo(f163224i, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0005ဌ\u0005\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"a", "b", C45240c.f118157a, aqs.class, "d", "e", C10662f.f35572a, C60447qj.f163580a, C30325g.f82003a, "j", C19618h.f54585a});
            case 3:
                return new C60321oe();
            case 4:
                return new C60320od();
            case 5:
                return f163224i;
            case 6:
                C63010eb ebVar = f163225l;
                if (ebVar == null) {
                    synchronized (C60321oe.class) {
                        ebVar = f163225l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163224i);
                            f163225l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
