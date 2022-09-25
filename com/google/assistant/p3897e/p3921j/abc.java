package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.assistant.p3897e.p3902c.p3905b.p3906a.C50927d;
import com.google.p3717aq.p3718a.p3719a.C47887u;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.e.j.abc */
/* compiled from: PG */
public final class abc extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final abc f134691o;

    /* renamed from: p */
    public static final C62940bt f134692p;

    /* renamed from: r */
    private static volatile C63010eb f134693r;

    /* renamed from: a */
    public int f134694a;

    /* renamed from: b */
    public int f134695b = 0;

    /* renamed from: c */
    public Object f134696c;

    /* renamed from: d */
    public int f134697d;

    /* renamed from: e */
    public C47887u f134698e;

    /* renamed from: f */
    public int f134699f = 1;

    /* renamed from: g */
    public int f134700g;

    /* renamed from: h */
    public int f134701h;

    /* renamed from: i */
    public C50927d f134702i;

    /* renamed from: j */
    public boolean f134703j;

    /* renamed from: k */
    public String f134704k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public C62971cq f134705l = C62942bv.emptyProtobufList();

    /* renamed from: m */
    public int f134706m;

    /* renamed from: n */
    public int f134707n;

    /* renamed from: q */
    private byte f134708q = 2;

    static {
        abc abc = new abc();
        f134691o = abc;
        C62942bv.registerDefaultInstance(abc.class, abc);
        f134692p = C62942bv.newSingularGeneratedExtension(aas.f134661u, abc, abc, (C62958ce) null, 148505702, C63066gd.MESSAGE, abc.class);
    }

    private abc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134708q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134708q = b;
                return null;
            case 2:
                return newMessageInfo(f134691o, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0001\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဿ\u0000\u0004ျ\u0000\u0005ဌ\u0004\u0006င\u0005\u0007ဉ\u0007\bဇ\b\tင\u0006\nဈ\t\u000b\u001a\fဌ\n\rဌ\u000b", new Object[]{C45240c.f118157a, "b", "a", "d", aay.f134687a, "e", C48980c.m85332b(), C10662f.f35572a, aba.f134690a, C30325g.f82003a, "i", "j", C19618h.f54585a, C19621k.f54601a, "l", "m", aat.f134685a, C48004n.f124238a, aav.f134686a});
            case 3:
                return new abc();
            case 4:
                return new aax();
            case 5:
                return f134691o;
            case 6:
                C63010eb ebVar = f134693r;
                if (ebVar == null) {
                    synchronized (abc.class) {
                        ebVar = f134693r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134691o);
                            f134693r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
