package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4996f.C64809e;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.l.a.t */
/* compiled from: PG */
public final class C52792t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52792t f138499a;

    /* renamed from: q */
    private static volatile C63010eb f138500q;

    /* renamed from: b */
    private int f138501b;

    /* renamed from: c */
    private int f138502c;

    /* renamed from: d */
    private C52731cj f138503d;

    /* renamed from: e */
    private C52767ds f138504e;

    /* renamed from: f */
    private C52736co f138505f;

    /* renamed from: g */
    private C52762dn f138506g;

    /* renamed from: h */
    private C52725cd f138507h;

    /* renamed from: i */
    private C52672ae f138508i;

    /* renamed from: j */
    private C52790r f138509j;

    /* renamed from: k */
    private C52755dg f138510k;

    /* renamed from: l */
    private C52777eb f138511l;

    /* renamed from: m */
    private C64809e f138512m;

    /* renamed from: n */
    private C52722ca f138513n;

    /* renamed from: o */
    private C52774dz f138514o;

    /* renamed from: p */
    private byte f138515p = 2;

    static {
        C52792t tVar = new C52792t();
        f138499a = tVar;
        C62942bv.registerDefaultInstance(C52792t.class, tVar);
    }

    private C52792t() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138515p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138515p = b;
                return null;
            case 2:
                return newMessageInfo(f138499a, "\u0001\f\u0000\u0002\u00015\f\u0000\u0000\u0000\u0001ဉ\u0000\fဉ\u0007\u0011ဉ\n\u0013ဉ\r\u0015ဉ\u000e\u0017ဉ\u000f'ဉ\u001c+ဉ .ဉ#/ဉ$4ဉ(5ဉ)", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C52792t();
            case 4:
                return new C52791s();
            case 5:
                return f138499a;
            case 6:
                C63010eb ebVar = f138500q;
                if (ebVar == null) {
                    synchronized (C52792t.class) {
                        ebVar = f138500q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138499a);
                            f138500q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
