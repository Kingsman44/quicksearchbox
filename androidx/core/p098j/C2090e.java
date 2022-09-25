package androidx.core.p098j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: androidx.core.j.e */
/* compiled from: PG */
public final class C2090e implements C2091f {

    /* renamed from: a */
    private final ContentInfo.Builder f6000a;

    public C2090e(ClipData clipData, int i) {
        this.f6000a = new ContentInfo.Builder(clipData, i);
    }

    /* renamed from: a */
    public final C2096k mo5258a() {
        return new C2096k(new C2093h(this.f6000a.build()));
    }

    /* renamed from: b */
    public final void mo5259b(Bundle bundle) {
        this.f6000a.setExtras(bundle);
    }

    /* renamed from: c */
    public final void mo5260c(int i) {
        this.f6000a.setFlags(i);
    }

    /* renamed from: d */
    public final void mo5261d(Uri uri) {
        this.f6000a.setLinkUri(uri);
    }
}
