package androidx.core.p098j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: androidx.core.j.g */
/* compiled from: PG */
public final class C2092g implements C2091f {

    /* renamed from: a */
    final ClipData f6001a;

    /* renamed from: b */
    final int f6002b;

    /* renamed from: c */
    int f6003c;

    /* renamed from: d */
    Uri f6004d;

    /* renamed from: e */
    Bundle f6005e;

    public C2092g(ClipData clipData, int i) {
        this.f6001a = clipData;
        this.f6002b = i;
    }

    /* renamed from: a */
    public final C2096k mo5258a() {
        return new C2096k(new C2095j(this));
    }

    /* renamed from: b */
    public final void mo5259b(Bundle bundle) {
        this.f6005e = bundle;
    }

    /* renamed from: c */
    public final void mo5260c(int i) {
        this.f6003c = i;
    }

    /* renamed from: d */
    public final void mo5261d(Uri uri) {
        this.f6004d = uri;
    }
}
