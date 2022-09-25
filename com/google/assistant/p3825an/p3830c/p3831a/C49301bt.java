package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4129b.p4136c.C54761i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5159x.C65967c;

/* renamed from: com.google.assistant.an.c.a.bt */
/* compiled from: PG */
public final class C49301bt extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49301bt f127423f;

    /* renamed from: h */
    private static volatile C63010eb f127424h;

    /* renamed from: a */
    public int f127425a;

    /* renamed from: b */
    public String f127426b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C49261ag f127427c;

    /* renamed from: d */
    public C49271aq f127428d;

    /* renamed from: e */
    public C54761i f127429e;

    /* renamed from: g */
    private C65967c f127430g;

    static {
        C49301bt btVar = new C49301bt();
        f127423f = btVar;
        C62942bv.registerDefaultInstance(C49301bt.class, btVar);
    }

    private C49301bt() {
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
                return newMessageInfo(f127423f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0007\u0005ဉ\u0002\u0007ဉ\u0004\bဉ\u0005", new Object[]{"a", "b", "e", C45240c.f118157a, "d", C30325g.f82003a});
            case 3:
                return new C49301bt();
            case 4:
                return new C49300bs();
            case 5:
                return f127423f;
            case 6:
                C63010eb ebVar = f127424h;
                if (ebVar == null) {
                    synchronized (C49301bt.class) {
                        ebVar = f127424h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127423f);
                            f127424h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
