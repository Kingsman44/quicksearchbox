package androidx.preference;

import android.content.DialogInterface;

/* renamed from: androidx.preference.n */
/* compiled from: PG */
final class C4018n implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    final /* synthetic */ C4019o f12881a;

    public C4018n(C4019o oVar) {
        this.f12881a = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        C4019o oVar = this.f12881a;
        if (z) {
            oVar.f12883b = oVar.f12882a.add(oVar.f12885d[i].toString()) | oVar.f12883b;
            return;
        }
        oVar.f12883b = oVar.f12882a.remove(oVar.f12885d[i].toString()) | oVar.f12883b;
    }
}
