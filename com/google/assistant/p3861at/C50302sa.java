package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sa */
/* compiled from: PG */
public final class C50302sa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50302sa f130905e;

    /* renamed from: g */
    private static volatile C63010eb f130906g;

    /* renamed from: a */
    public String f130907a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f130908b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f130909c;

    /* renamed from: d */
    public boolean f130910d;

    /* renamed from: f */
    private int f130911f;

    static {
        C50302sa saVar = new C50302sa();
        f130905e = saVar;
        C62942bv.registerDefaultInstance(C50302sa.class, saVar);
    }

    private C50302sa() {
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
                return newMessageInfo(f130905e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50302sa();
            case 4:
                return new C50300rz();
            case 5:
                return f130905e;
            case 6:
                C63010eb ebVar = f130906g;
                if (ebVar == null) {
                    synchronized (C50302sa.class) {
                        ebVar = f130906g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130905e);
                            f130906g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
