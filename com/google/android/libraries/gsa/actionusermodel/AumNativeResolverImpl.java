package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;

/* compiled from: PG */
public final class AumNativeResolverImpl implements C22068az {

    /* renamed from: a */
    public static final C58974d f60740a = C58974d.m91136j();

    /* renamed from: b */
    public final Object f60741b = new Object();

    /* renamed from: c */
    public boolean f60742c = false;

    /* renamed from: d */
    public final C22871g f60743d;

    public AumNativeResolverImpl(C22871g gVar) {
        this.f60743d = gVar;
    }

    /* renamed from: a */
    public static C22104g m41269a(byte[] bArr) {
        if (bArr == null) {
            return C22104g.f60920i;
        }
        try {
            return (C22104g) C62942bv.parseFrom((C62942bv) C22104g.f60920i, bArr, C62921ba.m95368a());
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f60740a.mo56226d()).mo56382g(e)).mo56372aa(48201)).mo56386p("Failed to parse AumResult from native code.");
            return C22104g.f60920i;
        }
    }

    public native byte[] nativeGetContact(byte[] bArr);

    public native byte[] nativeResolveContact(byte[] bArr);

    public native byte[] nativeResolveInstance(byte[] bArr);

    public native byte[] nativeResolveInstanceLabel(byte[] bArr);

    public native byte[] nativeResolveProvider(byte[] bArr);
}
