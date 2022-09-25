package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.kk */
/* compiled from: PG */
public final class C67083kk extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C67083kk f182351g;

    /* renamed from: i */
    private static volatile C63010eb f182352i;

    /* renamed from: a */
    public int f182353a;

    /* renamed from: b */
    public int f182354b = 0;

    /* renamed from: c */
    public Object f182355c;

    /* renamed from: d */
    public int f182356d;

    /* renamed from: e */
    public C62971cq f182357e = emptyProtobufList();

    /* renamed from: f */
    public String f182358f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f182359h = 2;

    static {
        C67083kk kkVar = new C67083kk();
        f182351g = kkVar;
        C62942bv.registerDefaultInstance(C67083kk.class, kkVar);
    }

    private C67083kk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182359h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182359h = b;
                return null;
            case 2:
                return newMessageInfo(f182351g, "\u0001\u0006\u0001\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ဌ\u0003\u0004ᐼ\u0000\u0007\u001b\bဈ\u0005", new Object[]{C45240c.f118157a, "b", "a", C67042ix.class, C67066ju.class, "d", C67160ng.f182557a, C67079kg.class, "e", C67062jq.class, C10662f.f35572a});
            case 3:
                return new C67083kk();
            case 4:
                return new C67080kh();
            case 5:
                return f182351g;
            case 6:
                C63010eb ebVar = f182352i;
                if (ebVar == null) {
                    synchronized (C67083kk.class) {
                        ebVar = f182352i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182351g);
                            f182352i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
