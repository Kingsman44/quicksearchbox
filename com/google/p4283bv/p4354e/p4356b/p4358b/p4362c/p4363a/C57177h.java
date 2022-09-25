package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57143b;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.b.c.a.h */
/* compiled from: PG */
public final class C57177h extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C57177h f152644k;

    /* renamed from: l */
    public static final C62940bt f152645l;

    /* renamed from: n */
    private static volatile C63010eb f152646n;

    /* renamed from: a */
    public int f152647a;

    /* renamed from: b */
    public C57194y f152648b;

    /* renamed from: c */
    public String f152649c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f152650d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f152651e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f152652f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f152653g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f152654h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C57696b f152655i;

    /* renamed from: j */
    public C57143b f152656j;

    /* renamed from: m */
    private byte f152657m = 2;

    static {
        C57177h hVar = new C57177h();
        f152644k = hVar;
        C62942bv.registerDefaultInstance(C57177h.class, hVar);
        f152645l = C62942bv.newSingularGeneratedExtension(C57143b.f152527m, hVar, hVar, (C62958ce) null, 9, C63066gd.MESSAGE, C57177h.class);
    }

    private C57177h() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152657m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152657m = b;
                return null;
            case 2:
                return newMessageInfo(f152644k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0006\bᐉ\b\tဈ\u0005\nဈ\u0007\u000bᐉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, "i", C10662f.f35572a, C19618h.f54585a, "j"});
            case 3:
                return new C57177h();
            case 4:
                return new C57176g();
            case 5:
                return f152644k;
            case 6:
                C63010eb ebVar = f152646n;
                if (ebVar == null) {
                    synchronized (C57177h.class) {
                        ebVar = f152646n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152644k);
                            f152646n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
