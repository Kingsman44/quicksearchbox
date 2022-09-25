package p5652p.p5653a.p5654a.p5655a.p5676k.p5677a;

import android.widget.SeekBar;
import com.google.android.libraries.componentview.components.base.C20081f;

/* renamed from: p.a.a.a.k.a.b */
/* compiled from: PG */
final class C72731b implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    final /* synthetic */ C72732c f193389a;

    public C72731b(C72732c cVar) {
        this.f193389a = cVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.f193389a.f193390a = i;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        C72732c cVar = this.f193389a;
        C20081f.m37970b(cVar.f56306q, "_bind_state", cVar.f56305p, Integer.valueOf(cVar.f193390a));
        C72732c cVar2 = this.f193389a;
        C20081f.m37970b(cVar2.f56306q, "change", cVar2.f56305p, Integer.valueOf(cVar2.f193390a));
    }
}
