package com.google.p4283bv.p4287b.p4288a.p4289a.p4311p;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.p.f */
/* compiled from: PG */
public final class C56788f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C56788f f151536g;

    /* renamed from: h */
    private static volatile C63010eb f151537h;

    /* renamed from: a */
    public int f151538a;

    /* renamed from: b */
    public C56784b f151539b;

    /* renamed from: c */
    public long f151540c;

    /* renamed from: d */
    public int f151541d;

    /* renamed from: e */
    public String f151542e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f151543f = emptyProtobufList();

    static {
        C56788f fVar = new C56788f();
        f151536g = fVar;
        C62942bv.registerDefaultInstance(C56788f.class, fVar);
    }

    private C56788f() {
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
                return newMessageInfo(f151536g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C56792j.class});
            case 3:
                return new C56788f();
            case 4:
                return new C56787e();
            case 5:
                return f151536g;
            case 6:
                C63010eb ebVar = f151537h;
                if (ebVar == null) {
                    synchronized (C56788f.class) {
                        ebVar = f151537h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151536g);
                            f151537h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
