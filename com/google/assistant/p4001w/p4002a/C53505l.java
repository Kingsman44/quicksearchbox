package com.google.assistant.p4001w.p4002a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.w.a.l */
/* compiled from: PG */
public final class C53505l extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C53505l f140417i;

    /* renamed from: k */
    private static volatile C63010eb f140418k;

    /* renamed from: a */
    public int f140419a;

    /* renamed from: b */
    public C53497d f140420b;

    /* renamed from: c */
    public C62971cq f140421c = emptyProtobufList();

    /* renamed from: d */
    public C62910ar f140422d;

    /* renamed from: e */
    public C62910ar f140423e;

    /* renamed from: f */
    public long f140424f;

    /* renamed from: g */
    public String f140425g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public long f140426h;

    /* renamed from: j */
    private int f140427j;

    static {
        C53505l lVar = new C53505l();
        f140417i = lVar;
        C62942bv.registerDefaultInstance(C53505l.class, lVar);
    }

    private C53505l() {
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
                return newMessageInfo(f140417i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဂ\u0004\u0007ဈ\u0005\bဂ\u0006", new Object[]{"j", "a", C53494a.f140386a, "b", C45240c.f118157a, C53497d.class, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C53505l();
            case 4:
                return new C53504k();
            case 5:
                return f140417i;
            case 6:
                C63010eb ebVar = f140418k;
                if (ebVar == null) {
                    synchronized (C53505l.class) {
                        ebVar = f140418k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140417i);
                            f140418k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
