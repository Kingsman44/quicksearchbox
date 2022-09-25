package androidx.media3.exoplayer.p144g;

import android.net.Uri;
import androidx.media3.exoplayer.p151k.C3258x;
import java.io.InputStream;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.g.b */
/* compiled from: PG */
public final class C3003b implements C3258x {

    /* renamed from: a */
    private final C3258x f8692a;

    /* renamed from: b */
    private final List f8693b;

    public C3003b(C3258x xVar, List list) {
        this.f8692a = xVar;
        this.f8693b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6768a(Uri uri, InputStream inputStream) {
        C3002a aVar = (C3002a) this.f8692a.mo6768a(uri, inputStream);
        List list = this.f8693b;
        return (list == null || list.isEmpty()) ? aVar : (C3002a) aVar.mo6767d(this.f8693b);
    }
}
