package com.google.speech.grammar.pumpkin;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.grammar.pumpkin.b */
/* compiled from: PG */
public final class C66510b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66510b f180890b;

    /* renamed from: f */
    private static volatile C63010eb f180891f;

    /* renamed from: a */
    public String f180892a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f180893c;

    /* renamed from: d */
    private String f180894d;

    /* renamed from: e */
    private byte f180895e = 2;

    static {
        C66510b bVar = new C66510b();
        f180890b = bVar;
        C62942bv.registerDefaultInstance(C66510b.class, bVar);
    }

    private C66510b() {
        C63088z zVar = C63088z.f170246b;
        this.f180894d = BuildConfig.FLAVOR;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180895e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180895e = b;
                return null;
            case 2:
                return newMessageInfo(f180890b, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0004ᔈ\u0003", new Object[]{C45240c.f118157a, "a", "d"});
            case 3:
                return new C66510b();
            case 4:
                return new C66509a();
            case 5:
                return f180890b;
            case 6:
                C63010eb ebVar = f180891f;
                if (ebVar == null) {
                    synchronized (C66510b.class) {
                        ebVar = f180891f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180890b);
                            f180891f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
