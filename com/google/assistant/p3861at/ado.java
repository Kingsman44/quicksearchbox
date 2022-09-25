package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ado */
/* compiled from: PG */
public final class ado extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final ado f129050g;

    /* renamed from: h */
    private static volatile C63010eb f129051h;

    /* renamed from: a */
    public int f129052a;

    /* renamed from: b */
    public int f129053b;

    /* renamed from: c */
    public String f129054c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f129055d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f129056e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f129057f = BuildConfig.FLAVOR;

    static {
        ado ado = new ado();
        f129050g = ado;
        C62942bv.registerDefaultInstance(ado.class, ado);
    }

    private ado() {
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
                return newMessageInfo(f129050g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001ဈ\u0001\u0002\u001a\u0003\u001a\u0004ဈ\u0003\u0006ဌ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, "b", C56002b.m87881b()});
            case 3:
                return new ado();
            case 4:
                return new adn();
            case 5:
                return f129050g;
            case 6:
                C63010eb ebVar = f129051h;
                if (ebVar == null) {
                    synchronized (ado.class) {
                        ebVar = f129051h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129050g);
                            f129051h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
