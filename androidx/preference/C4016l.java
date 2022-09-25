package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;

/* renamed from: androidx.preference.l */
/* compiled from: PG */
public final class C4016l extends C4030z {

    /* renamed from: a */
    int f12878a;

    /* renamed from: b */
    private CharSequence[] f12879b;

    /* renamed from: c */
    private CharSequence[] f12880c;

    /* renamed from: b */
    public final void mo8453b(boolean z) {
        int i;
        if (z && (i = this.f12878a) >= 0) {
            String obj = this.f12880c[i].toString();
            ListPreference listPreference = (ListPreference) mo8475f();
            if (listPreference.mo8351R(obj)) {
                listPreference.mo8330o(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: fp */
    public final void mo8465fp(C0391l lVar) {
        lVar.mo1295b(this.f12879b, this.f12878a, new C4015k(this));
        lVar.mo1306k((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) mo8475f();
            if (listPreference.f12707g == null || listPreference.f12708h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f12878a = listPreference.mo8326j(listPreference.f12709i);
            this.f12879b = listPreference.f12707g;
            this.f12880c = listPreference.f12708h;
            return;
        }
        this.f12878a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f12879b = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f12880c = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f12878a);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f12879b);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f12880c);
    }
}
