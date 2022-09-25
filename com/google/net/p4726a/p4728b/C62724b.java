package com.google.net.p4726a.p4728b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.net.a.b.b */
/* compiled from: PG */
public final class C62724b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62724b f169416g;

    /* renamed from: i */
    private static volatile C63010eb f169417i;

    /* renamed from: a */
    public int f169418a;

    /* renamed from: b */
    public int f169419b;

    /* renamed from: c */
    public String f169420c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f169421d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f169422e;

    /* renamed from: f */
    public C63771b f169423f;

    /* renamed from: h */
    private byte f169424h = 2;

    static {
        C62724b bVar = new C62724b();
        f169416g = bVar;
        C62942bv.registerDefaultInstance(C62724b.class, bVar);
    }

    private C62724b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169424h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169424h = b;
                return null;
            case 2:
                return newMessageInfo(f169416g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ᐉ\u0004\u0006င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e"});
            case 3:
                return new C62724b();
            case 4:
                return new C62723a();
            case 5:
                return f169416g;
            case 6:
                C63010eb ebVar = f169417i;
                if (ebVar == null) {
                    synchronized (C62724b.class) {
                        ebVar = f169417i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169416g);
                            f169417i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
