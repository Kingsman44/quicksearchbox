package com.google.android.apps.gsa.nga.shared.p6275aa.p6277b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81048f;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51336dy;
import com.google.assistant.p3897e.p3917i.p3918a.C51350el;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.b.h */
/* compiled from: PG */
public final class C80120h extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C80120h f219843o;

    /* renamed from: q */
    private static volatile C63010eb f219844q;

    /* renamed from: a */
    public int f219845a;

    /* renamed from: b */
    public String f219846b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52091ex f219847c;

    /* renamed from: d */
    public int f219848d;

    /* renamed from: e */
    public String f219849e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f219850f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f219851g;

    /* renamed from: h */
    public C81048f f219852h;

    /* renamed from: i */
    public boolean f219853i;

    /* renamed from: j */
    public int f219854j;

    /* renamed from: k */
    public boolean f219855k;

    /* renamed from: l */
    public boolean f219856l;

    /* renamed from: m */
    public C51350el f219857m;

    /* renamed from: n */
    public C51336dy f219858n;

    /* renamed from: p */
    private byte f219859p = 2;

    static {
        C80120h hVar = new C80120h();
        f219843o = hVar;
        C62942bv.registerDefaultInstance(C80120h.class, hVar);
    }

    private C80120h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219859p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219859p = b;
                return null;
            case 2:
                return newMessageInfo(f219843o, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\tဇ\u0006\nᐉ\u0007\u000bဇ\b\fင\t\u000eဇ\n\u000fဇ\u000b\u0010ဉ\f\u0011ဉ\r", new Object[]{"a", "b", C45240c.f118157a, "d", e.b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C80120h();
            case 4:
                return new C80119g();
            case 5:
                return f219843o;
            case 6:
                C63010eb ebVar = f219844q;
                if (ebVar == null) {
                    synchronized (C80120h.class) {
                        ebVar = f219844q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219843o);
                            f219844q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
