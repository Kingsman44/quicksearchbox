package com.google.assistant.p3793ae.p3794a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ae.a.e */
/* compiled from: PG */
public final class C48773e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48773e f126198g;

    /* renamed from: h */
    private static volatile C63010eb f126199h;

    /* renamed from: a */
    public String f126200a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f126201b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126202c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f126203d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public int f126204e;

    /* renamed from: f */
    public C28708an f126205f;

    static {
        C48773e eVar = new C48773e();
        f126198g = eVar;
        C62942bv.registerDefaultInstance(C48773e.class, eVar);
    }

    private C48773e() {
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
                return newMessageInfo(f126198g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004\u0004\u0005\t\u0007Ȉ", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C48773e();
            case 4:
                return new C48772d();
            case 5:
                return f126198g;
            case 6:
                C63010eb ebVar = f126199h;
                if (ebVar == null) {
                    synchronized (C48773e.class) {
                        ebVar = f126199h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126198g);
                            f126199h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
