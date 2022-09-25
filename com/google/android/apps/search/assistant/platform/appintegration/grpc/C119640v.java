package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.v */
/* compiled from: PG */
public final class C119640v extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C119640v f333408i;

    /* renamed from: k */
    private static volatile C63010eb f333409k;

    /* renamed from: a */
    public int f333410a;

    /* renamed from: b */
    public boolean f333411b;

    /* renamed from: c */
    public C119642x f333412c;

    /* renamed from: d */
    public C62971cq f333413d = emptyProtobufList();

    /* renamed from: e */
    public C119893l f333414e;

    /* renamed from: f */
    public C119829bx f333415f;

    /* renamed from: g */
    public C62971cq f333416g = emptyProtobufList();

    /* renamed from: h */
    public boolean f333417h;

    /* renamed from: j */
    private byte f333418j = 2;

    static {
        C119640v vVar = new C119640v();
        f333408i = vVar;
        C62942bv.registerDefaultInstance(C119640v.class, vVar);
    }

    private C119640v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333418j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333418j = b;
                return null;
            case 2:
                return newMessageInfo(f333408i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0002\u0002\u0002ဇ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007\u001b\bဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C51785da.class, "e", C10662f.f35572a, C30325g.f82003a, C52230ka.class, C19618h.f54585a});
            case 3:
                return new C119640v();
            case 4:
                return new C119639u();
            case 5:
                return f333408i;
            case 6:
                C63010eb ebVar = f333409k;
                if (ebVar == null) {
                    synchronized (C119640v.class) {
                        ebVar = f333409k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333408i);
                            f333409k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
