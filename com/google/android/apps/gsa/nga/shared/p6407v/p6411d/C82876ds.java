package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ds */
/* compiled from: PG */
public final class C82876ds extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82876ds f225961e;

    /* renamed from: g */
    private static volatile C63010eb f225962g;

    /* renamed from: a */
    public int f225963a;

    /* renamed from: b */
    public String f225964b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C51536li f225965c;

    /* renamed from: d */
    public C51544lq f225966d;

    /* renamed from: f */
    private byte f225967f = 2;

    static {
        C82876ds dsVar = new C82876ds();
        f225961e = dsVar;
        C62942bv.registerDefaultInstance(C82876ds.class, dsVar);
    }

    private C82876ds() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225967f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225967f = b;
                return null;
            case 2:
                return newMessageInfo(f225961e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82876ds();
            case 4:
                return new C82875dr();
            case 5:
                return f225961e;
            case 6:
                C63010eb ebVar = f225962g;
                if (ebVar == null) {
                    synchronized (C82876ds.class) {
                        ebVar = f225962g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225961e);
                            f225962g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
