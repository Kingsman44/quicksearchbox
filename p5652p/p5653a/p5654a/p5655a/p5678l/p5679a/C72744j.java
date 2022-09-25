package p5652p.p5653a.p5654a.p5655a.p5678l.p5679a;

import android.view.ViewTreeObserver;
import com.google.android.libraries.componentview.components.base.C20081f;

/* renamed from: p.a.a.a.l.a.j */
/* compiled from: PG */
final class C72744j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ C72745k f193407a;

    public C72744j(C72745k kVar) {
        this.f193407a = kVar;
    }

    public final boolean onPreDraw() {
        this.f193407a.f56305p.getViewTreeObserver().removeOnPreDrawListener(this);
        C72745k kVar = this.f193407a;
        C20081f.m37970b(kVar.f56306q, "set_updater", kVar.f56305p, kVar.f193410b);
        return false;
    }
}
