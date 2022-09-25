package com.google.android.apps.search.googleapp.search.p10420k.p10421a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.k.a.d */
/* compiled from: PG */
public final class C137542d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C137542d f374085g;

    /* renamed from: i */
    private static volatile C63010eb f374086i;

    /* renamed from: a */
    public int f374087a;

    /* renamed from: b */
    public int f374088b;

    /* renamed from: c */
    public long f374089c;

    /* renamed from: d */
    public boolean f374090d;

    /* renamed from: e */
    public String f374091e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C137418g f374092f;

    /* renamed from: h */
    private byte f374093h = 2;

    static {
        C137542d dVar = new C137542d();
        f374085g = dVar;
        C62942bv.registerDefaultInstance(C137542d.class, dVar);
    }

    private C137542d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f374093h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f374093h = b;
                return null;
            case 2:
                return newMessageInfo(f374085g, "\u0001\u0005\u0000\u0001\u0005\n\u0005\u0000\u0000\u0001\u0005ဌ\u0000\u0006ဂ\u0001\u0007ဇ\u0002\bဈ\u0003\nᐉ\u0004", new Object[]{"a", "b", C137539a.f374084a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C137542d();
            case 4:
                return new C137541c();
            case 5:
                return f374085g;
            case 6:
                C63010eb ebVar = f374086i;
                if (ebVar == null) {
                    synchronized (C137542d.class) {
                        ebVar = f374086i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374085g);
                            f374086i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
