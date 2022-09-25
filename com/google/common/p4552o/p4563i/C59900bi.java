package com.google.common.p4552o.p4563i;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C60313nz;
import com.google.common.p4552o.acp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.i.bi */
/* compiled from: PG */
public final class C59900bi extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C59900bi f161890j;

    /* renamed from: k */
    public static final C62940bt f161891k;

    /* renamed from: m */
    private static volatile C63010eb f161892m;

    /* renamed from: a */
    public int f161893a;

    /* renamed from: b */
    public C59961k f161894b;

    /* renamed from: c */
    public acp f161895c;

    /* renamed from: d */
    public C59973w f161896d;

    /* renamed from: e */
    public C59935cq f161897e;

    /* renamed from: f */
    public C59930cl f161898f;

    /* renamed from: g */
    public C59925cg f161899g;

    /* renamed from: h */
    public C59927ci f161900h;

    /* renamed from: i */
    public C59866ab f161901i;

    /* renamed from: l */
    private byte f161902l = 2;

    static {
        C59900bi biVar = new C59900bi();
        f161890j = biVar;
        C62942bv.registerDefaultInstance(C59900bi.class, biVar);
        f161891k = C62942bv.newSingularGeneratedExtension(C60313nz.f163201a, biVar, biVar, (C62958ce) null, 106, C63066gd.MESSAGE, C59900bi.class);
    }

    private C59900bi() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f161902l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f161902l = b;
                return null;
            case 2:
                return newMessageInfo(f161890j, "\u0001\b\u0000\u0001\u0002\u0015\b\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u000bဉ\b\fဉ\t\rဉ\n\u0011ဉ\u000e\u0013ဉ\u0010\u0015ဉ\u0012", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C59900bi();
            case 4:
                return new C59899bh();
            case 5:
                return f161890j;
            case 6:
                C63010eb ebVar = f161892m;
                if (ebVar == null) {
                    synchronized (C59900bi.class) {
                        ebVar = f161892m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161890j);
                            f161892m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
