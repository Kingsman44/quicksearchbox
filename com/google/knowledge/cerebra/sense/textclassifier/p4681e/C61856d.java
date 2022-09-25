package com.google.knowledge.cerebra.sense.textclassifier.p4681e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.e.d */
/* compiled from: PG */
public final class C61856d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C61856d f167157g;

    /* renamed from: h */
    private static volatile C63010eb f167158h;

    /* renamed from: a */
    public int f167159a;

    /* renamed from: b */
    public C62971cq f167160b = emptyProtobufList();

    /* renamed from: c */
    public String f167161c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f167162d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167163e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f167164f = BuildConfig.FLAVOR;

    static {
        C61856d dVar = new C61856d();
        f167157g = dVar;
        C62942bv.registerDefaultInstance(C61856d.class, dVar);
    }

    private C61856d() {
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
                return newMessageInfo(f167157g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0003ဈ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"a", "b", C61855c.class, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C61856d();
            case 4:
                return new C61853a();
            case 5:
                return f167157g;
            case 6:
                C63010eb ebVar = f167158h;
                if (ebVar == null) {
                    synchronized (C61856d.class) {
                        ebVar = f167158h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167157g);
                            f167158h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
