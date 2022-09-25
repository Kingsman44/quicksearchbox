package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.b */
/* compiled from: PG */
public final class C49842b extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C49842b f129519l;

    /* renamed from: n */
    private static volatile C63010eb f129520n;

    /* renamed from: a */
    public int f129521a;

    /* renamed from: b */
    public String f129522b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f129523c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C50251qd f129524d;

    /* renamed from: e */
    public C50251qd f129525e;

    /* renamed from: f */
    public String f129526f;

    /* renamed from: g */
    public String f129527g;

    /* renamed from: h */
    public String f129528h;

    /* renamed from: i */
    public boolean f129529i;

    /* renamed from: j */
    public C49954fd f129530j;

    /* renamed from: k */
    public C50058j f129531k;

    /* renamed from: m */
    private byte f129532m = 2;

    static {
        C49842b bVar = new C49842b();
        f129519l = bVar;
        C62942bv.registerDefaultInstance(C49842b.class, bVar);
    }

    private C49842b() {
        emptyProtobufList();
        this.f129526f = BuildConfig.FLAVOR;
        this.f129527g = BuildConfig.FLAVOR;
        this.f129528h = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129532m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129532m = b;
                return null;
            case 2:
                return newMessageInfo(f129519l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\u000bᐉ\u000b\fဉ\f", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C49842b();
            case 4:
                return new C49813a();
            case 5:
                return f129519l;
            case 6:
                C63010eb ebVar = f129520n;
                if (ebVar == null) {
                    synchronized (C49842b.class) {
                        ebVar = f129520n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129519l);
                            f129520n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
