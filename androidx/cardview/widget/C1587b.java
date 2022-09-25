package androidx.cardview.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.b */
/* compiled from: PG */
public final class C1587b {
    /* renamed from: b */
    public static final void m4206b(C1586a aVar, float f) {
        Drawable drawable = aVar.f4346a;
        CardView cardView = aVar.f4347b;
        boolean z = cardView.f4341a;
        boolean z2 = cardView.f4342b;
        C1588c cVar = (C1588c) drawable;
        if (!(f == cVar.f4349b && cVar.f4350c == z && cVar.f4351d == z2)) {
            cVar.f4349b = f;
            cVar.f4350c = z;
            cVar.f4351d = z2;
            cVar.mo4482b((Rect) null);
            cVar.invalidateSelf();
        }
        m4205a(aVar);
    }

    /* renamed from: a */
    public static final void m4205a(C1586a aVar) {
        CardView cardView = aVar.f4347b;
        if (!cardView.f4341a) {
            aVar.mo4480a(0, 0, 0, 0);
            return;
        }
        C1588c cVar = (C1588c) aVar.f4346a;
        float f = cVar.f4349b;
        float f2 = cVar.f4348a;
        int ceil = (int) Math.ceil((double) C1589d.m4210a(f, f2, cardView.f4342b));
        int ceil2 = (int) Math.ceil((double) C1589d.m4211b(f, f2, aVar.f4347b.f4342b));
        aVar.mo4480a(ceil, ceil2, ceil, ceil2);
    }
}
