package com.google.p4152bb.p4153a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.pb */
/* compiled from: PG */
public final class C55349pb extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C55349pb f145830g;

    /* renamed from: i */
    private static volatile C63010eb f145831i;

    /* renamed from: a */
    public int f145832a;

    /* renamed from: b */
    public float f145833b;

    /* renamed from: c */
    public C55351pd f145834c;

    /* renamed from: d */
    public C62971cq f145835d;

    /* renamed from: e */
    public int f145836e;

    /* renamed from: f */
    public boolean f145837f;

    /* renamed from: h */
    private byte f145838h = 2;

    static {
        C55349pb pbVar = new C55349pb();
        f145830g = pbVar;
        C62942bv.registerDefaultInstance(C55349pb.class, pbVar);
    }

    private C55349pb() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.f145835d = emptyProtobufList();
        this.f145837f = true;
    }

    /* renamed from: a */
    public final void mo54249a() {
        C62971cq cqVar = this.f145835d;
        if (!cqVar.mo58948c()) {
            this.f145835d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145838h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145838h = b;
                return null;
            case 2:
                return newMessageInfo(f145830g, "\u0001\u0005\u0000\u0001\u0002\u0011\u0005\u0000\u0001\u0001\u0002ခ\u0002\u0003ဉ\u0003\tင\u0007\u000fЛ\u0011ဇ\t", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C54946ad.class, C10662f.f35572a});
            case 3:
                return new C55349pb();
            case 4:
                return new C55348pa();
            case 5:
                return f145830g;
            case 6:
                C63010eb ebVar = f145831i;
                if (ebVar == null) {
                    synchronized (C55349pb.class) {
                        ebVar = f145831i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145830g);
                            f145831i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
