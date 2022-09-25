package androidx.biometric;

import android.widget.TextView;
import androidx.lifecycle.C2333ah;

/* renamed from: androidx.biometric.ay */
/* compiled from: PG */
final class C0921ay implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C0924ba f3022a;

    public C0921ay(C0924ba baVar) {
        this.f3022a = baVar;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        C0924ba baVar = this.f3022a;
        baVar.f3023a.removeCallbacks(baVar.f3024b);
        TextView textView = this.f3022a.f3029g;
        if (textView != null) {
            textView.setText(charSequence);
        }
        C0924ba baVar2 = this.f3022a;
        baVar2.f3023a.postDelayed(baVar2.f3024b, 2000);
    }
}
