package p5652p.p5653a.p5654a.p5655a.p5658b.p5659a;

import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;

/* renamed from: p.a.a.a.b.a.e */
/* compiled from: PG */
final class C72681e extends C0658ft {

    /* renamed from: a */
    final /* synthetic */ C72682f f193279a;

    public C72681e(C72682f fVar) {
        this.f193279a = fVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int position;
        if (i == 0) {
            this.f193279a.f193283e = -1;
        } else if (i == 1) {
            C72682f fVar = this.f193279a;
            View b = fVar.mo2803b(fVar.f193280b);
            if (b != null && (position = this.f193279a.f193280b.getPosition(b)) != -1) {
                this.f193279a.f193283e = position;
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C72683g gVar;
        C72682f fVar = this.f193279a;
        View b = fVar.mo2803b(fVar.f193280b);
        if (b != null) {
            int position = this.f193279a.f193280b.getPosition(b);
            C72682f fVar2 = this.f193279a;
            if (position != fVar2.f193282d) {
                if (!(position == -1 || (gVar = fVar2.f193281c) == null)) {
                    gVar.mo64505A(b, position);
                }
                this.f193279a.f193282d = position;
            }
        }
    }
}
