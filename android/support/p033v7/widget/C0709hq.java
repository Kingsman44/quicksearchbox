package android.support.p033v7.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.hq */
/* compiled from: PG */
final class C0709hq extends C0602dr {

    /* renamed from: f */
    final /* synthetic */ C0710hr f2541f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0709hq(C0710hr hrVar, Context context) {
        super(context);
        this.f2541f = hrVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo2793a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo2800h(View view, C0670ge geVar, C0667gb gbVar) {
        C0710hr hrVar = this.f2541f;
        RecyclerView recyclerView = hrVar.f2542a;
        if (recyclerView != null) {
            int[] c = hrVar.mo2804c(recyclerView.mLayout, view);
            int i = c[0];
            int i2 = c[1];
            int c2 = mo2795c(Math.max(Math.abs(i), Math.abs(i2)));
            if (c2 > 0) {
                gbVar.mo3048b(i, i2, c2, this.f2334b);
            }
        }
    }
}
