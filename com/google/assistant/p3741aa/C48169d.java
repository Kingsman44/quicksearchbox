package com.google.assistant.p3741aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.aa.d */
/* compiled from: PG */
public final class C48169d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C48169d f124635g;

    /* renamed from: h */
    private static volatile C63010eb f124636h;

    /* renamed from: a */
    public int f124637a;

    /* renamed from: b */
    public boolean f124638b = true;

    /* renamed from: c */
    public String f124639c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f124640d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f124641e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f124642f = emptyProtobufList();

    static {
        C48169d dVar = new C48169d();
        f124635g = dVar;
        C62942bv.registerDefaultInstance(C48169d.class, dVar);
    }

    private C48169d() {
        C63088z zVar = C63088z.f170246b;
    }

    /* renamed from: a */
    public final void mo53142a() {
        C62971cq cqVar = this.f124642f;
        if (!cqVar.mo58948c()) {
            this.f124642f = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f124635g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C48168c.class, "e"});
            case 3:
                return new C48169d();
            case 4:
                return new C48130a();
            case 5:
                return f124635g;
            case 6:
                C63010eb ebVar = f124636h;
                if (ebVar == null) {
                    synchronized (C48169d.class) {
                        ebVar = f124636h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124635g);
                            f124636h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
