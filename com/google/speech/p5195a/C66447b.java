package com.google.speech.p5195a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.b */
/* compiled from: PG */
public final class C66447b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66447b f180675b;

    /* renamed from: e */
    private static volatile C63010eb f180676e;

    /* renamed from: a */
    public String f180677a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f180678c;

    /* renamed from: d */
    private byte f180679d = 2;

    static {
        C66447b bVar = new C66447b();
        f180675b = bVar;
        C62942bv.registerDefaultInstance(C66447b.class, bVar);
    }

    private C66447b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180679d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180679d = b;
                return null;
            case 2:
                return newMessageInfo(f180675b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C66447b();
            case 4:
                return new C66420a();
            case 5:
                return f180675b;
            case 6:
                C63010eb ebVar = f180676e;
                if (ebVar == null) {
                    synchronized (C66447b.class) {
                        ebVar = f180676e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180675b);
                            f180676e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
