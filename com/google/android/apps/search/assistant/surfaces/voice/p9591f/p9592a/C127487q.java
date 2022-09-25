package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.q */
/* compiled from: PG */
public final class C127487q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127487q f351002c;

    /* renamed from: d */
    private static volatile C63010eb f351003d;

    /* renamed from: a */
    public String f351004a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f351005b = C62942bv.emptyProtobufList();

    static {
        C127487q qVar = new C127487q();
        f351002c = qVar;
        C62942bv.registerDefaultInstance(C127487q.class, qVar);
    }

    private C127487q() {
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
                return newMessageInfo(f351002c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C127487q();
            case 4:
                return new C127486p();
            case 5:
                return f351002c;
            case 6:
                C63010eb ebVar = f351003d;
                if (ebVar == null) {
                    synchronized (C127487q.class) {
                        ebVar = f351003d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351002c);
                            f351003d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
