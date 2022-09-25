package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i */
/* compiled from: PG */
public final class C12991i extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C12991i f40380k;

    /* renamed from: m */
    private static volatile C63010eb f40381m;

    /* renamed from: a */
    public int f40382a;

    /* renamed from: b */
    public C13007y f40383b;

    /* renamed from: c */
    public boolean f40384c;

    /* renamed from: d */
    public int f40385d;

    /* renamed from: e */
    public long f40386e;

    /* renamed from: f */
    public boolean f40387f;

    /* renamed from: g */
    public C12995m f40388g;

    /* renamed from: h */
    public C62995dn f40389h = C62995dn.f170057a;

    /* renamed from: i */
    public C12984b f40390i;

    /* renamed from: j */
    public int f40391j;

    /* renamed from: l */
    private byte f40392l = 2;

    static {
        C12991i iVar = new C12991i();
        f40380k = iVar;
        C62942bv.registerDefaultInstance(C12991i.class, iVar);
    }

    private C12991i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40392l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40392l = b;
                return null;
            case 2:
                return newMessageInfo(f40380k, "\u0001\t\u0000\u0001\u0001\f\t\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0006ဃ\u0003\bဇ\u0004\tဉ\u0005\n2\u000bဉ\u0006\fဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C12989g.m29226b(), "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C12990h.f40379a, "i", "j", C12998p.f40404a});
            case 3:
                return new C12991i();
            case 4:
                return new C12987e();
            case 5:
                return f40380k;
            case 6:
                C63010eb ebVar = f40381m;
                if (ebVar == null) {
                    synchronized (C12991i.class) {
                        ebVar = f40381m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40380k);
                            f40381m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
