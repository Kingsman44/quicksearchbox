package com.google.p4242bp.p4267h;

import com.evernote.android.state.BuildConfig;
import com.google.p4152bb.p4153a.C55134hc;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.bp.h.b */
/* compiled from: PG */
public final class C56395b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56395b f150408a;

    /* renamed from: b */
    public static final C62940bt f150409b = C62942bv.newSingularGeneratedExtension(C55134hc.f145119i, BuildConfig.FLAVOR, (MessageLite) null, (C62958ce) null, 109696811, C63066gd.STRING, String.class);

    /* renamed from: c */
    private static volatile C63010eb f150410c;

    static {
        C56395b bVar = new C56395b();
        f150408a = bVar;
        C62942bv.registerDefaultInstance(C56395b.class, bVar);
    }

    private C56395b() {
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
                return newMessageInfo(f150408a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56395b();
            case 4:
                return new C56367a();
            case 5:
                return f150408a;
            case 6:
                C63010eb ebVar = f150410c;
                if (ebVar == null) {
                    synchronized (C56395b.class) {
                        ebVar = f150410c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150408a);
                            f150410c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
