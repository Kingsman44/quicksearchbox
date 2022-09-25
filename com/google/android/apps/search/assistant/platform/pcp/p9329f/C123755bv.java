package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3994s.p3995a.C53138cu;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53274hv;
import com.google.knowledge.p4671b.C61820m;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bv */
/* compiled from: PG */
public final class C123755bv extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C123755bv f341837o;

    /* renamed from: q */
    private static volatile C63010eb f341838q;

    /* renamed from: a */
    public int f341839a;

    /* renamed from: b */
    public C61820m f341840b;

    /* renamed from: c */
    public C54188e f341841c;

    /* renamed from: d */
    public C62971cq f341842d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C51270bm f341843e;

    /* renamed from: f */
    public C53274hv f341844f;

    /* renamed from: g */
    public C62971cq f341845g = C62942bv.emptyProtobufList();

    /* renamed from: h */
    public int f341846h;

    /* renamed from: i */
    public C63088z f341847i = C63088z.f170246b;

    /* renamed from: j */
    public C53271hs f341848j;

    /* renamed from: k */
    public boolean f341849k;

    /* renamed from: l */
    public String f341850l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public C51334dw f341851m;

    /* renamed from: n */
    public C51715bm f341852n;

    /* renamed from: p */
    private byte f341853p = 2;

    static {
        C123755bv bvVar = new C123755bv();
        f341837o = bvVar;
        C62942bv.registerDefaultInstance(C123755bv.class, bvVar);
    }

    private C123755bv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341853p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341853p = b;
                return null;
            case 2:
                return newMessageInfo(f341837o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0004\u0001ဉ\u0000\u0002ᐉ\u0001\u0003\u001a\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001a\bဌ\u0005\tည\u0006\nᐉ\u0007\u000bဇ\b\fဈ\t\rᐉ\n\u000eᐉ\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C53138cu.f139277a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a});
            case 3:
                return new C123755bv();
            case 4:
                return new C123754bu();
            case 5:
                return f341837o;
            case 6:
                C63010eb ebVar = f341838q;
                if (ebVar == null) {
                    synchronized (C123755bv.class) {
                        ebVar = f341838q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341837o);
                            f341838q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
