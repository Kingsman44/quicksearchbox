package com.google.nlp.p4730a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.nlp.p4730a.p4734b.C62767d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.s */
/* compiled from: PG */
public final class C62799s extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C62799s f169588g;

    /* renamed from: j */
    private static volatile C63010eb f169589j;

    /* renamed from: a */
    public int f169590a;

    /* renamed from: b */
    public String f169591b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f169592c = emptyProtobufList();

    /* renamed from: d */
    public C62797q f169593d;

    /* renamed from: e */
    public boolean f169594e;

    /* renamed from: f */
    public int f169595f;

    /* renamed from: h */
    private C60220t f169596h;

    /* renamed from: i */
    private byte f169597i = 2;

    static {
        C62799s sVar = new C62799s();
        f169588g = sVar;
        C62942bv.registerDefaultInstance(C62799s.class, sVar);
    }

    private C62799s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169597i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169597i = b;
                return null;
            case 2:
                return newMessageInfo(f169588g, "\u0001\u0006\u0000\u0001\u0001\u0019\u0006\u0000\u0001\u0003\u0001ဈ\u0000\u000eᐉ\u0003\u0014ဇ\u0006\u0015င\u0007\u0017Л\u0019ᐉ\t", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a, C62767d.class, C19618h.f54585a});
            case 3:
                return new C62799s();
            case 4:
                return new C62798r();
            case 5:
                return f169588g;
            case 6:
                C63010eb ebVar = f169589j;
                if (ebVar == null) {
                    synchronized (C62799s.class) {
                        ebVar = f169589j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169588g);
                            f169589j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
