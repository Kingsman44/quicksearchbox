package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.u */
/* compiled from: PG */
public final class C9431u extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C9431u f32754d;

    /* renamed from: f */
    private static volatile C63010eb f32755f;

    /* renamed from: a */
    public int f32756a;

    /* renamed from: b */
    public String f32757b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C9422l f32758c;

    /* renamed from: e */
    private byte f32759e = 2;

    static {
        C9431u uVar = new C9431u();
        f32754d = uVar;
        C62942bv.registerDefaultInstance(C9431u.class, uVar);
    }

    private C9431u() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32759e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32759e = b;
                return null;
            case 2:
                return newMessageInfo(f32754d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9431u();
            case 4:
                return new C9430t();
            case 5:
                return f32754d;
            case 6:
                C63010eb ebVar = f32755f;
                if (ebVar == null) {
                    synchronized (C9431u.class) {
                        ebVar = f32755f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32754d);
                            f32755f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
