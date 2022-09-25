package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p375ai.p378b.C7669fo;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.aq */
/* compiled from: PG */
public final class C57235aq extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C57235aq f152787g;

    /* renamed from: l */
    private static volatile C63010eb f152788l;

    /* renamed from: a */
    public int f152789a = 0;

    /* renamed from: b */
    public Object f152790b;

    /* renamed from: c */
    public int f152791c;

    /* renamed from: d */
    public C57231am f152792d;

    /* renamed from: e */
    public C62971cq f152793e = emptyProtobufList();

    /* renamed from: f */
    public C57696b f152794f;

    /* renamed from: h */
    private int f152795h;

    /* renamed from: i */
    private C60214n f152796i;

    /* renamed from: j */
    private C57223ae f152797j;

    /* renamed from: k */
    private byte f152798k = 2;

    static {
        C57235aq aqVar = new C57235aq();
        f152787g = aqVar;
        C62942bv.registerDefaultInstance(C57235aq.class, aqVar);
    }

    private C57235aq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152798k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152798k = b;
                return null;
            case 2:
                return newMessageInfo(f152787g, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0001\u0004\u0001ြ\u0000\u0002ဌ\u0002\u0003ᐉ\u0003\u0004်\u0000\u0005\u001b\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006", new Object[]{"b", "a", C19618h.f54585a, C7669fo.class, C45240c.f118157a, C57233ao.f152786a, "d", "e", C57274cb.class, "i", C10662f.f35572a, "j"});
            case 3:
                return new C57235aq();
            case 4:
                return new C57232an();
            case 5:
                return f152787g;
            case 6:
                C63010eb ebVar = f152788l;
                if (ebVar == null) {
                    synchronized (C57235aq.class) {
                        ebVar = f152788l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152787g);
                            f152788l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
