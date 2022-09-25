package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.ai */
/* compiled from: PG */
public final class C80417ai extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80417ai f220707g;

    /* renamed from: i */
    private static volatile C63010eb f220708i;

    /* renamed from: a */
    public int f220709a;

    /* renamed from: b */
    public String f220710b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C61752n f220711c;

    /* renamed from: d */
    public String f220712d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C80426f f220713e;

    /* renamed from: f */
    public C80416ah f220714f;

    /* renamed from: h */
    private byte f220715h = 2;

    static {
        C80417ai aiVar = new C80417ai();
        f220707g = aiVar;
        C62942bv.registerDefaultInstance(C80417ai.class, aiVar);
    }

    private C80417ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220715h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220715h = b;
                return null;
            case 2:
                return newMessageInfo(f220707g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0007ᐉ\u0002", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C80417ai();
            case 4:
                return new C80414af();
            case 5:
                return f220707g;
            case 6:
                C63010eb ebVar = f220708i;
                if (ebVar == null) {
                    synchronized (C80417ai.class) {
                        ebVar = f220708i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220707g);
                            f220708i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
