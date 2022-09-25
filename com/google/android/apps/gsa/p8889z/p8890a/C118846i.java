package com.google.android.apps.gsa.p8889z.p8890a;

import android.util.Base64;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.a.i */
/* compiled from: PG */
public final class C118846i extends C118842e {

    /* renamed from: m */
    private static final C59071e f331476m = C59071e.m91332i("com.google.android.apps.gsa.z.a.i");

    /* renamed from: n */
    private final byte[] f331477n;

    /* renamed from: o */
    private final boolean f331478o;

    public C118846i(C118843f fVar, C90929bz bzVar, byte[] bArr, boolean z, C68214a aVar) {
        super(fVar, bzVar, aVar);
        this.f331477n = bArr;
        this.f331478o = z;
    }

    /* renamed from: d */
    public static String m197278d(byte[] bArr) {
        if (bArr != null) {
            return "data:;base64,".concat(String.valueOf(Base64.encodeToString(bArr, 0)));
        }
        ((C59052c) ((C59052c) f331476m.mo56225c()).mo56372aa(34175)).mo56386p("createAudioByteDataSource(): Audio bytes is null");
        return BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo104033a() {
        if (this.f331478o) {
            this.f331463g.setDataSource(new C118845h(this.f331477n));
        } else {
            this.f331463g.setDataSource(m197278d(this.f331477n));
        }
    }
}
