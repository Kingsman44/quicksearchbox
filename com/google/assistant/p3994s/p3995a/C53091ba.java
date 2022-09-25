package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p440an.p442b.p443a.C8846b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.s.a.ba */
/* compiled from: PG */
public final class C53091ba extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53091ba f139123g;

    /* renamed from: j */
    private static volatile C63010eb f139124j;

    /* renamed from: a */
    public int f139125a;

    /* renamed from: b */
    public String f139126b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f139127c;

    /* renamed from: d */
    public C63042fg f139128d;

    /* renamed from: e */
    public String f139129e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C53093bc f139130f;

    /* renamed from: h */
    private C8846b f139131h;

    /* renamed from: i */
    private byte f139132i = 2;

    static {
        C53091ba baVar = new C53091ba();
        f139123g = baVar;
        C62942bv.registerDefaultInstance(C53091ba.class, baVar);
    }

    private C53091ba() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139132i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139132i = b;
                return null;
            case 2:
                return newMessageInfo(f139123g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005", new Object[]{"a", "b", C19618h.f54585a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C53091ba();
            case 4:
                return new C53089az();
            case 5:
                return f139123g;
            case 6:
                C63010eb ebVar = f139124j;
                if (ebVar == null) {
                    synchronized (C53091ba.class) {
                        ebVar = f139124j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139123g);
                            f139124j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
