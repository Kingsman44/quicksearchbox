package com.google.nlp.p4735b.p4736a.p4738b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.m */
/* compiled from: PG */
public final class C62831m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62831m f169666e;

    /* renamed from: g */
    private static volatile C63010eb f169667g;

    /* renamed from: a */
    public int f169668a;

    /* renamed from: b */
    public String f169669b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f169670c = emptyProtobufList();

    /* renamed from: d */
    public C62829k f169671d;

    /* renamed from: f */
    private byte f169672f = 2;

    static {
        C62831m mVar = new C62831m();
        f169666e = mVar;
        C62942bv.registerDefaultInstance(C62831m.class, mVar);
    }

    private C62831m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169672f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169672f = b;
                return null;
            case 2:
                return newMessageInfo(f169666e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C62835q.class, "d"});
            case 3:
                return new C62831m();
            case 4:
                return new C62830l();
            case 5:
                return f169666e;
            case 6:
                C63010eb ebVar = f169667g;
                if (ebVar == null) {
                    synchronized (C62831m.class) {
                        ebVar = f169667g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169666e);
                            f169667g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
