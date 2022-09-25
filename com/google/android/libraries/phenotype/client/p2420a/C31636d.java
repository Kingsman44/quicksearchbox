package com.google.android.libraries.phenotype.client.p2420a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.client.a.d */
/* compiled from: PG */
public final class C31636d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C31636d f85117i;

    /* renamed from: j */
    private static volatile C63010eb f85118j;

    /* renamed from: a */
    public int f85119a;

    /* renamed from: b */
    public String f85120b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f85121c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f85122d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f85123e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f85124f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f85125g = emptyProtobufList();

    /* renamed from: h */
    public C62961ch f85126h = emptyIntList();

    static {
        C31636d dVar = new C31636d();
        f85117i = dVar;
        C62942bv.registerDefaultInstance(C31636d.class, dVar);
    }

    private C31636d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f85117i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0006\u0000\u0001ဈ\u0000\u0002\u001c\u0003\u001c\u0004\u001c\u0005\u001c\u0006\u001c\u0007\u0016", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C31636d();
            case 4:
                return new C31635c();
            case 5:
                return f85117i;
            case 6:
                C63010eb ebVar = f85118j;
                if (ebVar == null) {
                    synchronized (C31636d.class) {
                        ebVar = f85118j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85117i);
                            f85118j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
