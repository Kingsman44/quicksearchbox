package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3858ar.p3859a.C49714d;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ye */
/* compiled from: PG */
public final class C88344ye extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C88344ye f238913h;

    /* renamed from: i */
    private static volatile C63010eb f238914i;

    /* renamed from: a */
    public int f238915a;

    /* renamed from: b */
    public String f238916b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f238917c;

    /* renamed from: d */
    public C53499f f238918d;

    /* renamed from: e */
    public int f238919e;

    /* renamed from: f */
    public C49714d f238920f;

    /* renamed from: g */
    public C62971cq f238921g = C62942bv.emptyProtobufList();

    static {
        C88344ye yeVar = new C88344ye();
        f238913h = yeVar;
        C62942bv.registerDefaultInstance(C88344ye.class, yeVar);
    }

    private C88344ye() {
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
                return newMessageInfo(f238913h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\u0006\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C51331dt.m86136b(), C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C88344ye();
            case 4:
                return new C88343yd();
            case 5:
                return f238913h;
            case 6:
                C63010eb ebVar = f238914i;
                if (ebVar == null) {
                    synchronized (C88344ye.class) {
                        ebVar = f238914i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238913h);
                            f238914i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
