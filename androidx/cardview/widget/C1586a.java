package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.a */
/* compiled from: PG */
public final class C1586a {

    /* renamed from: a */
    public Drawable f4346a;

    /* renamed from: b */
    public final /* synthetic */ CardView f4347b;

    public C1586a(CardView cardView) {
        this.f4347b = cardView;
    }

    /* renamed from: a */
    public final void mo4480a(int i, int i2, int i3, int i4) {
        this.f4347b.f4344d.set(i, i2, i3, i4);
        CardView cardView = this.f4347b;
        C1586a.super.setPadding(i + cardView.f4343c.left, i2 + this.f4347b.f4343c.top, i3 + this.f4347b.f4343c.right, i4 + this.f4347b.f4343c.bottom);
    }
}
