package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.e.j.abu */
/* compiled from: PG */
public final class abu extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final abu f134763k;

    /* renamed from: l */
    public static final C62940bt f134764l;

    /* renamed from: n */
    private static volatile C63010eb f134765n;

    /* renamed from: a */
    public int f134766a;

    /* renamed from: b */
    public C48952az f134767b;

    /* renamed from: c */
    public String f134768c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public abt f134769d;

    /* renamed from: e */
    public abh f134770e;

    /* renamed from: f */
    public aag f134771f;

    /* renamed from: g */
    public abj f134772g;

    /* renamed from: h */
    public abp f134773h;

    /* renamed from: i */
    public abr f134774i;

    /* renamed from: j */
    public int f134775j;

    /* renamed from: m */
    private byte f134776m = 2;

    static {
        abu abu = new abu();
        f134763k = abu;
        C62942bv.registerDefaultInstance(abu.class, abu);
        f134764l = C62942bv.newSingularGeneratedExtension(aas.f134661u, abu, abu, (C62958ce) null, 369486511, C63066gd.MESSAGE, abu.class);
    }

    private abu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134776m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134776m = b;
                return null;
            case 2:
                return newMessageInfo(f134763k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tဌ\t\nဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", abe.m86275b(), "i"});
            case 3:
                return new abu();
            case 4:
                return new abf();
            case 5:
                return f134763k;
            case 6:
                C63010eb ebVar = f134765n;
                if (ebVar == null) {
                    synchronized (abu.class) {
                        ebVar = f134765n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134763k);
                            f134765n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
