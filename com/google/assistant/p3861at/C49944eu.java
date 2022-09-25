package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.eu */
/* compiled from: PG */
public final class C49944eu extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C49944eu f129808o;

    /* renamed from: p */
    private static volatile C63010eb f129809p;

    /* renamed from: a */
    public int f129810a;

    /* renamed from: b */
    public int f129811b = 0;

    /* renamed from: c */
    public Object f129812c;

    /* renamed from: d */
    public String f129813d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f129814e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f129815f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f129816g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f129817h;

    /* renamed from: i */
    public String f129818i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f129819j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f129820k;

    /* renamed from: l */
    public String f129821l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f129822m;

    /* renamed from: n */
    public String f129823n = BuildConfig.FLAVOR;

    static {
        C49944eu euVar = new C49944eu();
        f129808o = euVar;
        C62942bv.registerDefaultInstance(C49944eu.class, euVar);
    }

    private C49944eu() {
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
                return newMessageInfo(f129808o, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ျ\u0000\u0004\u001a\u0005ဈ\u0004\u0006င\u0005\u0007ျ\u0000\bဈ\u0006\tဈ\u0007\nဇ\b\u000bဈ\t\rဇ\u000b\u000eဈ\f", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C49944eu();
            case 4:
                return new C49943et();
            case 5:
                return f129808o;
            case 6:
                C63010eb ebVar = f129809p;
                if (ebVar == null) {
                    synchronized (C49944eu.class) {
                        ebVar = f129809p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129808o);
                            f129809p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
