package com.google.p4283bv.p4287b.p4288a.p4289a.p4312q;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.q.h */
/* compiled from: PG */
public final class C56800h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f151572c = new C56797e();

    /* renamed from: e */
    public static final C56800h f151573e;

    /* renamed from: g */
    private static volatile C63010eb f151574g;

    /* renamed from: a */
    public String f151575a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62961ch f151576b = emptyIntList();

    /* renamed from: d */
    public C62995dn f151577d = C62995dn.f170057a;

    /* renamed from: f */
    private int f151578f;

    static {
        C56800h hVar = new C56800h();
        f151573e = hVar;
        C62942bv.registerDefaultInstance(C56800h.class, hVar);
    }

    private C56800h() {
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
                return newMessageInfo(f151573e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001ဈ\u0000\u0002\u001e\u00032", new Object[]{C10662f.f35572a, "a", "b", C56794b.m88225b(), "d", C56799g.f151571a});
            case 3:
                return new C56800h();
            case 4:
                return new C56798f();
            case 5:
                return f151573e;
            case 6:
                C63010eb ebVar = f151574g;
                if (ebVar == null) {
                    synchronized (C56800h.class) {
                        ebVar = f151574g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151573e);
                            f151574g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
