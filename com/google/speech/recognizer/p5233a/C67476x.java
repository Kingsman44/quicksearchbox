package com.google.speech.recognizer.p5233a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.speech.p5197b.p5198a.C66455b;

/* renamed from: com.google.speech.recognizer.a.x */
/* compiled from: PG */
public final class C67476x extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C67476x f183390i;

    /* renamed from: n */
    private static volatile C63010eb f183391n;

    /* renamed from: a */
    public int f183392a;

    /* renamed from: b */
    public C62971cq f183393b = emptyProtobufList();

    /* renamed from: c */
    public long f183394c;

    /* renamed from: d */
    public long f183395d;

    /* renamed from: e */
    public C62971cq f183396e;

    /* renamed from: f */
    public C62971cq f183397f;

    /* renamed from: g */
    public C67470r f183398g;

    /* renamed from: h */
    public boolean f183399h;

    /* renamed from: j */
    private C66455b f183400j;

    /* renamed from: k */
    private C66455b f183401k;

    /* renamed from: l */
    private C66455b f183402l;

    /* renamed from: m */
    private byte f183403m = 2;

    static {
        C67476x xVar = new C67476x();
        f183390i = xVar;
        C62942bv.registerDefaultInstance(C67476x.class, xVar);
    }

    private C67476x() {
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        this.f183396e = emptyProtobufList();
        emptyProtobufList();
        this.f183397f = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183403m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183403m = b;
                return null;
            case 2:
                return newMessageInfo(f183390i, "\u0001\n\u0000\u0001\u0001\u0016\n\u0000\u0003\u0006\u0001Л\u0002ဂ\u0000\u0003ဂ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\nᐉ\u0005\u000eЛ\u000fЛ\u0013ဉ\u000f\u0016ဇ\u0010", new Object[]{"a", "b", C67474v.class, C45240c.f118157a, "d", "j", C19621k.f54601a, "l", "e", C67468p.class, C10662f.f35572a, C67449ar.class, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C67476x();
            case 4:
                return new C67475w();
            case 5:
                return f183390i;
            case 6:
                C63010eb ebVar = f183391n;
                if (ebVar == null) {
                    synchronized (C67476x.class) {
                        ebVar = f183391n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183390i);
                            f183391n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
