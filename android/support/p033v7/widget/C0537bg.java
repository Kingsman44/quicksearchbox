package android.support.p033v7.widget;

import android.graphics.Typeface;
import android.widget.TextView;
import androidx.core.content.p091b.C1872u;
import androidx.core.p098j.C2043bi;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.bg */
/* compiled from: PG */
final class C0537bg extends C1872u {

    /* renamed from: a */
    final /* synthetic */ int f2106a;

    /* renamed from: b */
    final /* synthetic */ int f2107b;

    /* renamed from: c */
    final /* synthetic */ WeakReference f2108c;

    /* renamed from: d */
    final /* synthetic */ C0543bm f2109d;

    public C0537bg(C0543bm bmVar, int i, int i2, WeakReference weakReference) {
        this.f2109d = bmVar;
        this.f2106a = i;
        this.f2107b = i2;
        this.f2108c = weakReference;
    }

    /* renamed from: a */
    public final void mo2566a(int i) {
    }

    /* renamed from: b */
    public final void mo2567b(Typeface typeface) {
        int i = this.f2106a;
        if (i != -1) {
            typeface = C0542bl.m1986a(typeface, i, (this.f2107b & 2) != 0);
        }
        C0543bm bmVar = this.f2109d;
        WeakReference weakReference = this.f2108c;
        if (bmVar.f2116d) {
            bmVar.f2115c = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (C2043bi.m5569aw(textView)) {
                textView.post(new C0538bh(textView, typeface, bmVar.f2114b));
            } else {
                textView.setTypeface(typeface, bmVar.f2114b);
            }
        }
    }
}
