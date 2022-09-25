package com.google.android.apps.search.googleapp.discover.channels;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.bf */
/* compiled from: PG */
public final class C134144bf extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C134144bf f365416k;

    /* renamed from: m */
    private static volatile C63010eb f365417m;

    /* renamed from: a */
    public int f365418a;

    /* renamed from: b */
    public String f365419b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f365420c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C134152bn f365421d;

    /* renamed from: e */
    public C57315dp f365422e;

    /* renamed from: f */
    public boolean f365423f;

    /* renamed from: g */
    public C134146bh f365424g;

    /* renamed from: h */
    public C134154bp f365425h;

    /* renamed from: i */
    public C134154bp f365426i;

    /* renamed from: j */
    public C134156br f365427j;

    /* renamed from: l */
    private byte f365428l = 2;

    static {
        C134144bf bfVar = new C134144bf();
        f365416k = bfVar;
        C62942bv.registerDefaultInstance(C134144bf.class, bfVar);
    }

    private C134144bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f365428l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f365428l = b;
                return null;
            case 2:
                return newMessageInfo(f365416k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C134144bf();
            case 4:
                return new C134143be();
            case 5:
                return f365416k;
            case 6:
                C63010eb ebVar = f365417m;
                if (ebVar == null) {
                    synchronized (C134144bf.class) {
                        ebVar = f365417m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365416k);
                            f365417m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
