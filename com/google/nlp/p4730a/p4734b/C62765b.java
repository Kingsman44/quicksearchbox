package com.google.nlp.p4730a.p4734b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.nlp.a.b.b */
/* compiled from: PG */
public final class C62765b extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C62765b f169498d;

    /* renamed from: f */
    private static volatile C63010eb f169499f;

    /* renamed from: a */
    public int f169500a;

    /* renamed from: b */
    public C63070h f169501b;

    /* renamed from: c */
    public String f169502c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private byte f169503e = 2;

    static {
        C62765b bVar = new C62765b();
        f169498d = bVar;
        C62942bv.registerDefaultInstance(C62765b.class, bVar);
    }

    private C62765b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169503e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169503e = b;
                return null;
            case 2:
                return newMessageInfo(f169498d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62765b();
            case 4:
                return new C62764a();
            case 5:
                return f169498d;
            case 6:
                C63010eb ebVar = f169499f;
                if (ebVar == null) {
                    synchronized (C62765b.class) {
                        ebVar = f169499f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169498d);
                            f169499f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
