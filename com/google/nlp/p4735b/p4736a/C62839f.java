package com.google.nlp.p4735b.p4736a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.f */
/* compiled from: PG */
public final class C62839f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62839f f169692f;

    /* renamed from: h */
    private static volatile C63010eb f169693h;

    /* renamed from: a */
    public int f169694a;

    /* renamed from: b */
    public String f169695b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f169696c = emptyProtobufList();

    /* renamed from: d */
    public int f169697d;

    /* renamed from: e */
    public int f169698e;

    /* renamed from: g */
    private byte f169699g = 2;

    static {
        C62839f fVar = new C62839f();
        f169692f = fVar;
        C62942bv.registerDefaultInstance(C62839f.class, fVar);
    }

    private C62839f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169699g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169699g = b;
                return null;
            case 2:
                return newMessageInfo(f169692f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0005Л\tင\u0003\nင\u0004", new Object[]{"a", "b", C45240c.f118157a, C62837d.class, "d", "e"});
            case 3:
                return new C62839f();
            case 4:
                return new C62838e();
            case 5:
                return f169692f;
            case 6:
                C63010eb ebVar = f169693h;
                if (ebVar == null) {
                    synchronized (C62839f.class) {
                        ebVar = f169693h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169692f);
                            f169693h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
