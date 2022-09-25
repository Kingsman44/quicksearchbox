package com.google.nlp.p4735b.p4736a.p4738b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.q */
/* compiled from: PG */
public final class C62835q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62835q f169678e;

    /* renamed from: g */
    private static volatile C63010eb f169679g;

    /* renamed from: a */
    public int f169680a;

    /* renamed from: b */
    public String f169681b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f169682c;

    /* renamed from: d */
    public C62829k f169683d;

    /* renamed from: f */
    private byte f169684f = 2;

    static {
        C62835q qVar = new C62835q();
        f169678e = qVar;
        C62942bv.registerDefaultInstance(C62835q.class, qVar);
    }

    private C62835q() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169684f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169684f = b;
                return null;
            case 2:
                return newMessageInfo(f169678e, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\nဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62835q();
            case 4:
                return new C62834p();
            case 5:
                return f169678e;
            case 6:
                C63010eb ebVar = f169679g;
                if (ebVar == null) {
                    synchronized (C62835q.class) {
                        ebVar = f169679g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169678e);
                            f169679g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
