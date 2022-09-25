package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.a.b */
/* compiled from: PG */
public final class C127741b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127741b f351630c;

    /* renamed from: d */
    private static volatile C63010eb f351631d;

    /* renamed from: a */
    public boolean f351632a;

    /* renamed from: b */
    public String f351633b = BuildConfig.FLAVOR;

    static {
        C127741b bVar = new C127741b();
        f351630c = bVar;
        C62942bv.registerDefaultInstance(C127741b.class, bVar);
    }

    private C127741b() {
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
                return newMessageInfo(f351630c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C127741b();
            case 4:
                return new C127740a();
            case 5:
                return f351630c;
            case 6:
                C63010eb ebVar = f351631d;
                if (ebVar == null) {
                    synchronized (C127741b.class) {
                        ebVar = f351631d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351630c);
                            f351631d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
