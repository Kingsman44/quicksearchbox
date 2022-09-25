package com.google.knowledge.p4661a.p4662a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63397bo;

/* renamed from: com.google.knowledge.a.a.h */
/* compiled from: PG */
public final class C61746h extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C61746h f166791g;

    /* renamed from: i */
    private static volatile C63010eb f166792i;

    /* renamed from: a */
    public int f166793a;

    /* renamed from: b */
    public int f166794b = 0;

    /* renamed from: c */
    public Object f166795c;

    /* renamed from: d */
    public String f166796d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C61748j f166797e;

    /* renamed from: f */
    public C61762x f166798f;

    /* renamed from: h */
    private byte f166799h = 2;

    static {
        C61746h hVar = new C61746h();
        f166791g = hVar;
        C62942bv.registerDefaultInstance(C61746h.class, hVar);
    }

    private C61746h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166799h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166799h = b;
                return null;
            case 2:
                return newMessageInfo(f166791g, "\u0001\u0005\u0001\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ဈ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C63397bo.class, C63397bo.class});
            case 3:
                return new C61746h();
            case 4:
                return new C61745g();
            case 5:
                return f166791g;
            case 6:
                C63010eb ebVar = f166792i;
                if (ebVar == null) {
                    synchronized (C61746h.class) {
                        ebVar = f166792i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166791g);
                            f166792i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
