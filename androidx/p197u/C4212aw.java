package androidx.p197u;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;

/* renamed from: androidx.u.aw */
/* compiled from: PG */
final class C4212aw extends C4196ag {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f13634a;

    /* renamed from: b */
    final /* synthetic */ View f13635b;

    /* renamed from: c */
    final /* synthetic */ View f13636c;

    /* renamed from: d */
    final /* synthetic */ C4215az f13637d;

    public C4212aw(C4215az azVar, ViewGroup viewGroup, View view, View view2) {
        this.f13637d = azVar;
        this.f13634a = viewGroup;
        this.f13635b = view;
        this.f13636c = view2;
    }

    /* renamed from: a */
    public final void mo8864a(C4195af afVar) {
        this.f13636c.setTag(R.id.save_overlay_view, (Object) null);
        this.f13634a.getOverlay().remove(this.f13635b);
        afVar.mo8870B(this);
    }

    /* renamed from: c */
    public final void mo8866c() {
        this.f13634a.getOverlay().remove(this.f13635b);
    }

    /* renamed from: d */
    public final void mo8867d() {
        if (this.f13635b.getParent() == null) {
            this.f13634a.getOverlay().add(this.f13635b);
        } else {
            this.f13637d.mo8885l();
        }
    }
}
