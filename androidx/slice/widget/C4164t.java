package androidx.slice.widget;

import android.widget.SeekBar;

/* renamed from: androidx.slice.widget.t */
/* compiled from: PG */
final class C4164t implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C4168x f13431a;

    public C4164t(C4168x xVar) {
        this.f13431a = xVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        C4168x xVar = this.f13431a;
        xVar.f13478k = i + xVar.f13479l;
        long currentTimeMillis = System.currentTimeMillis();
        C4168x xVar2 = this.f13431a;
        long j = xVar2.f13477j;
        if (j != 0 && currentTimeMillis - j > 200) {
            xVar2.f13475h = false;
            xVar2.f13476i.removeCallbacks(xVar2.f13481n);
            this.f13431a.mo8764a();
        } else if (!xVar2.f13475h) {
            xVar2.f13475h = true;
            xVar2.f13476i.postDelayed(xVar2.f13481n, 200);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f13431a.f13474g = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C4168x xVar = this.f13431a;
        xVar.f13474g = false;
        if (xVar.f13475h) {
            xVar.f13475h = false;
            xVar.f13476i.removeCallbacks(xVar.f13481n);
            C4168x xVar2 = this.f13431a;
            int progress = seekBar.getProgress();
            C4168x xVar3 = this.f13431a;
            xVar2.f13478k = progress + xVar3.f13479l;
            xVar3.mo8764a();
        }
    }
}
