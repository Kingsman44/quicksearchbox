package androidx.slice.widget;

import android.net.Uri;
import androidx.slice.Slice;

/* renamed from: androidx.slice.widget.aj */
/* compiled from: PG */
final class C4132aj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4133ak f13274a;

    public C4132aj(C4133ak akVar) {
        this.f13274a = akVar;
    }

    public final void run() {
        try {
            C4133ak akVar = this.f13274a;
            Uri uri = akVar.f13276i;
            uri.getClass();
            Slice a = akVar.f13275h.mo8626a(uri);
            C4133ak akVar2 = this.f13274a;
            if (akVar2.f13276i == null && a != null) {
                akVar2.f13276i = Uri.parse(a.f13090f);
                C4133ak akVar3 = this.f13274a;
                akVar3.f13275h.mo8628c(akVar3.f13276i, akVar3.f13277j);
            }
            this.f13274a.mo5706i(a);
        } catch (IllegalArgumentException e) {
            C4133ak.m11863b(e);
            this.f13274a.mo5706i((Object) null);
        } catch (Exception e2) {
            C4133ak.m11863b(e2);
            this.f13274a.mo5706i((Object) null);
        }
    }
}
