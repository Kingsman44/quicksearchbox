package com.google.android.apps.search.googleapp.searchwidget;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p337aa.C6619f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.i */
/* compiled from: PG */
public final class C139031i extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C139031i f378098k;

    /* renamed from: l */
    private static volatile C63010eb f378099l;

    /* renamed from: a */
    public int f378100a;

    /* renamed from: b */
    public C62971cq f378101b = emptyProtobufList();

    /* renamed from: c */
    public String f378102c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f378103d = C63088z.f170246b;

    /* renamed from: e */
    public String f378104e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63042fg f378105f;

    /* renamed from: g */
    public C63042fg f378106g;

    /* renamed from: h */
    public int f378107h;

    /* renamed from: i */
    public int f378108i;

    /* renamed from: j */
    public C63042fg f378109j;

    static {
        C139031i iVar = new C139031i();
        f378098k = iVar;
        C62942bv.registerDefaultInstance(C139031i.class, iVar);
    }

    private C139031i() {
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
                return newMessageInfo(f378098k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ည\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007င\u0005\bင\u0006\tဉ\u0007", new Object[]{"a", "b", C6619f.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C139031i();
            case 4:
                return new C139030h();
            case 5:
                return f378098k;
            case 6:
                C63010eb ebVar = f378099l;
                if (ebVar == null) {
                    synchronized (C139031i.class) {
                        ebVar = f378099l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378098k);
                            f378099l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
