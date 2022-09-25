package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4109av.p4110a.p4111a.C54603b;
import com.google.p4109av.p4110a.p4111a.C54604c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahu */
/* compiled from: PG */
public final class ahu extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final ahu f129335h;

    /* renamed from: i */
    private static volatile C63010eb f129336i;

    /* renamed from: a */
    public int f129337a;

    /* renamed from: b */
    public long f129338b;

    /* renamed from: c */
    public String f129339c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f129340d;

    /* renamed from: e */
    public long f129341e;

    /* renamed from: f */
    public int f129342f;

    /* renamed from: g */
    public C54603b f129343g;

    static {
        ahu ahu = new ahu();
        f129335h = ahu;
        C62942bv.registerDefaultInstance(ahu.class, ahu);
    }

    private ahu() {
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
                return newMessageInfo(f129335h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဌ\u0003\u0005ဌ\u0006\u0007ဉ\u0007\bဂ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C54604c.f143365a, C10662f.f35572a, ahs.f129334a, C30325g.f82003a, "e"});
            case 3:
                return new ahu();
            case 4:
                return new ahr();
            case 5:
                return f129335h;
            case 6:
                C63010eb ebVar = f129336i;
                if (ebVar == null) {
                    synchronized (ahu.class) {
                        ebVar = f129336i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129335h);
                            f129336i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
