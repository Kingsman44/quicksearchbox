package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.du */
/* compiled from: PG */
public final class C51030du extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C51030du f132868g;

    /* renamed from: i */
    private static volatile C63010eb f132869i;

    /* renamed from: a */
    public int f132870a;

    /* renamed from: b */
    public String f132871b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f132872c;

    /* renamed from: d */
    public int f132873d;

    /* renamed from: e */
    public C51027dr f132874e;

    /* renamed from: f */
    public C62971cq f132875f = emptyProtobufList();

    /* renamed from: h */
    private byte f132876h = 2;

    static {
        C51030du duVar = new C51030du();
        f132868g = duVar;
        C62942bv.registerDefaultInstance(C51030du.class, duVar);
    }

    private C51030du() {
    }

    /* renamed from: a */
    public final void mo53506a() {
        C62971cq cqVar = this.f132875f;
        if (!cqVar.mo58948c()) {
            this.f132875f = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132876h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132876h = b;
                return null;
            case 2:
                return newMessageInfo(f132868g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဌ\u0002\u0003ဌ\u0003\u0004ᐉ\u0004\u0005Л", new Object[]{"a", "b", C45240c.f118157a, C51028ds.f132867a, "d", C51022dm.f132848a, "e", C10662f.f35572a, C51027dr.class});
            case 3:
                return new C51030du();
            case 4:
                return new C51021dl();
            case 5:
                return f132868g;
            case 6:
                C63010eb ebVar = f132869i;
                if (ebVar == null) {
                    synchronized (C51030du.class) {
                        ebVar = f132869i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132868g);
                            f132869i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
