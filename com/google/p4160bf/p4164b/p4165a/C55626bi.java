package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55543aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bi */
/* compiled from: PG */
public final class C55626bi extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C55626bi f146768k;

    /* renamed from: l */
    private static volatile C63010eb f146769l;

    /* renamed from: a */
    public int f146770a;

    /* renamed from: b */
    public int f146771b;

    /* renamed from: c */
    public String f146772c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C55657cm f146773d;

    /* renamed from: e */
    public C62971cq f146774e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C55653ci f146775f;

    /* renamed from: g */
    public C55640bw f146776g;

    /* renamed from: h */
    public C55543aw f146777h;

    /* renamed from: i */
    public String f146778i;

    /* renamed from: j */
    public int f146779j;

    static {
        C55626bi biVar = new C55626bi();
        f146768k = biVar;
        C62942bv.registerDefaultInstance(C55626bi.class, biVar);
    }

    private C55626bi() {
        emptyProtobufList();
        this.f146778i = BuildConfig.FLAVOR;
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
                return newMessageInfo(f146768k, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0000\u0001ဈ\u0001\u0003\u001a\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\nဌ\u0000\fဉ\u0005\rဈ\u0006", new Object[]{"a", C45240c.f118157a, "e", "d", C10662f.f35572a, C30325g.f82003a, "b", C55540at.m87705b(), C19618h.f54585a, "i"});
            case 3:
                return new C55626bi();
            case 4:
                return new C55625bh();
            case 5:
                return f146768k;
            case 6:
                C63010eb ebVar = f146769l;
                if (ebVar == null) {
                    synchronized (C55626bi.class) {
                        ebVar = f146769l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146768k);
                            f146769l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
