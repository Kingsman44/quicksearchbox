package androidx.core.p098j;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: androidx.core.j.bg */
/* compiled from: PG */
final class C2041bg implements OnReceiveContentListener {

    /* renamed from: a */
    private final C2011ae f5943a;

    public C2041bg(C2011ae aeVar) {
        this.f5943a = aeVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C2096k b = C2096k.m5775b(contentInfo);
        C2096k a = this.f5943a.mo5174a(view, b);
        if (a == null) {
            return null;
        }
        if (a == b) {
            return contentInfo;
        }
        return a.mo5268a();
    }
}
