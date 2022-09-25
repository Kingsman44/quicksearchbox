package com.google.android.apps.gsa.nga.shared.p6275aa.p6277b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.b.j */
/* compiled from: PG */
public final class C80122j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80122j f219860d;

    /* renamed from: f */
    private static volatile C63010eb f219861f;

    /* renamed from: a */
    public int f219862a;

    /* renamed from: b */
    public String f219863b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C67438ag f219864c;

    /* renamed from: e */
    private byte f219865e = 2;

    static {
        C80122j jVar = new C80122j();
        f219860d = jVar;
        C62942bv.registerDefaultInstance(C80122j.class, jVar);
    }

    private C80122j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219865e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219865e = b;
                return null;
            case 2:
                return newMessageInfo(f219860d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80122j();
            case 4:
                return new C80121i();
            case 5:
                return f219860d;
            case 6:
                C63010eb ebVar = f219861f;
                if (ebVar == null) {
                    synchronized (C80122j.class) {
                        ebVar = f219861f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219860d);
                            f219861f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
