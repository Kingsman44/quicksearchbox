package com.google.p4273bs.p4277b.p4278a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bs.b.a.b */
/* compiled from: PG */
public final class C56462b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56462b f150807e;

    /* renamed from: g */
    private static volatile C63010eb f150808g;

    /* renamed from: a */
    public String f150809a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f150810b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public float f150811c;

    /* renamed from: d */
    public float f150812d;

    /* renamed from: f */
    private int f150813f;

    static {
        C56462b bVar = new C56462b();
        f150807e = bVar;
        C62942bv.registerDefaultInstance(C56462b.class, bVar);
    }

    private C56462b() {
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
                return newMessageInfo(f150807e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56462b();
            case 4:
                return new C56460a();
            case 5:
                return f150807e;
            case 6:
                C63010eb ebVar = f150808g;
                if (ebVar == null) {
                    synchronized (C56462b.class) {
                        ebVar = f150808g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150807e);
                            f150808g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
