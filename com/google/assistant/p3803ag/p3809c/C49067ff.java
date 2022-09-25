package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49927ed;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ff */
/* compiled from: PG */
public final class C49067ff extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49067ff f126917e;

    /* renamed from: g */
    private static volatile C63010eb f126918g;

    /* renamed from: a */
    public C62971cq f126919a = emptyProtobufList();

    /* renamed from: b */
    public String f126920b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f126921c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f126922d = emptyIntList();

    /* renamed from: f */
    private int f126923f;

    static {
        C49067ff ffVar = new C49067ff();
        f126917e = ffVar;
        C62942bv.registerDefaultInstance(C49067ff.class, ffVar);
    }

    private C49067ff() {
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
                return newMessageInfo(f126917e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0004\u0016", new Object[]{C10662f.f35572a, "a", C49927ed.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C49067ff();
            case 4:
                return new C49066fe();
            case 5:
                return f126917e;
            case 6:
                C63010eb ebVar = f126918g;
                if (ebVar == null) {
                    synchronized (C49067ff.class) {
                        ebVar = f126918g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126917e);
                            f126918g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
