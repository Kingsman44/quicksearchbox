package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.dq */
/* compiled from: PG */
public final class C57446dq extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C57446dq f153445e;

    /* renamed from: h */
    private static volatile C63010eb f153446h;

    /* renamed from: a */
    public String f153447a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C57444do f153448b;

    /* renamed from: c */
    public C57369au f153449c;

    /* renamed from: d */
    public C62971cq f153450d = emptyProtobufList();

    /* renamed from: f */
    private int f153451f;

    /* renamed from: g */
    private byte f153452g = 2;

    static {
        C57446dq dqVar = new C57446dq();
        f153445e = dqVar;
        C62942bv.registerDefaultInstance(C57446dq.class, dqVar);
    }

    private C57446dq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153452g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153452g = b;
                return null;
            case 2:
                return newMessageInfo(f153445e, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0001\u0002\u0001ဈ\u0000\u0006ᐉ\u0005\b\u001b\u000bᐉ\u0003", new Object[]{C10662f.f35572a, "a", C45240c.f118157a, "d", C57430da.class, "b"});
            case 3:
                return new C57446dq();
            case 4:
                return new C57445dp();
            case 5:
                return f153445e;
            case 6:
                C63010eb ebVar = f153446h;
                if (ebVar == null) {
                    synchronized (C57446dq.class) {
                        ebVar = f153446h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153445e);
                            f153446h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
