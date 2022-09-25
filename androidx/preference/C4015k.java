package androidx.preference;

import android.content.DialogInterface;

/* renamed from: androidx.preference.k */
/* compiled from: PG */
final class C4015k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C4016l f12877a;

    public C4015k(C4016l lVar) {
        this.f12877a = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4016l lVar = this.f12877a;
        lVar.f12878a = i;
        lVar.f12892e = -1;
        dialogInterface.dismiss();
    }
}
