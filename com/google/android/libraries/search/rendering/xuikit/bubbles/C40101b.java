package com.google.android.libraries.search.rendering.xuikit.bubbles;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.b */
/* compiled from: PG */
public final class C40101b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C40101b f105326c;

    /* renamed from: d */
    private static volatile C63010eb f105327d;

    /* renamed from: a */
    public int f105328a;

    /* renamed from: b */
    public String f105329b = BuildConfig.FLAVOR;

    static {
        C40101b bVar = new C40101b();
        f105326c = bVar;
        C62942bv.registerDefaultInstance(C40101b.class, bVar);
    }

    private C40101b() {
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
                return newMessageInfo(f105326c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C40101b();
            case 4:
                return new C40090a();
            case 5:
                return f105326c;
            case 6:
                C63010eb ebVar = f105327d;
                if (ebVar == null) {
                    synchronized (C40101b.class) {
                        ebVar = f105327d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f105326c);
                            f105327d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
