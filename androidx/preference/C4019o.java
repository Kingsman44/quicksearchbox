package androidx.preference;

import android.os.Bundle;
import android.support.p033v7.app.C0388i;
import android.support.p033v7.app.C0391l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.preference.o */
/* compiled from: PG */
public final class C4019o extends C4030z {

    /* renamed from: a */
    final Set f12882a = new HashSet();

    /* renamed from: b */
    boolean f12883b;

    /* renamed from: c */
    CharSequence[] f12884c;

    /* renamed from: d */
    CharSequence[] f12885d;

    /* renamed from: b */
    public final void mo8453b(boolean z) {
        if (z && this.f12883b) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) mo8475f();
            if (multiSelectListPreference.mo8351R(this.f12882a)) {
                multiSelectListPreference.mo8332j(this.f12882a);
            }
        }
        this.f12883b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: fp */
    public final void mo8465fp(C0391l lVar) {
        int length = this.f12885d.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f12882a.contains(this.f12885d[i].toString());
        }
        CharSequence[] charSequenceArr = this.f12884c;
        C4018n nVar = new C4018n(this);
        C0388i iVar = lVar.f1347a;
        iVar.f1337r = charSequenceArr;
        iVar.f1319A = nVar;
        iVar.f1342w = zArr;
        iVar.f1343x = true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) mo8475f();
            if (multiSelectListPreference.f12711g == null || multiSelectListPreference.f12712h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f12882a.clear();
            this.f12882a.addAll(multiSelectListPreference.f12713i);
            this.f12883b = false;
            this.f12884c = multiSelectListPreference.f12711g;
            this.f12885d = multiSelectListPreference.f12712h;
            return;
        }
        this.f12882a.clear();
        this.f12882a.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f12883b = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f12884c = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f12885d = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f12882a));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f12883b);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f12884c);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f12885d);
    }
}
