package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.at.nu */
/* compiled from: PG */
public final class C50187nu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50187nu f130466e;

    /* renamed from: f */
    private static volatile C63010eb f130467f;

    /* renamed from: a */
    public int f130468a;

    /* renamed from: b */
    public String f130469b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130470c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f130471d;

    static {
        C50187nu nuVar = new C50187nu();
        f130466e = nuVar;
        C62942bv.registerDefaultInstance(C50187nu.class, nuVar);
    }

    private C50187nu() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f130471d = C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130466e, "\u0001\u0003\u0000\u0001\u0001\f\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0002\f\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50187nu();
            case 4:
                return new C50186nt();
            case 5:
                return f130466e;
            case 6:
                C63010eb ebVar = f130467f;
                if (ebVar == null) {
                    synchronized (C50187nu.class) {
                        ebVar = f130467f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130466e);
                            f130467f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
