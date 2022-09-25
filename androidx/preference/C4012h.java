package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.preference.h */
/* compiled from: PG */
final class C4012h extends Preference {

    /* renamed from: a */
    private long f12873a;

    public C4012h(Context context, List list, long j) {
        super(context);
        this.f12718D = R.layout.expand_button;
        mo8340G(R.drawable.ic_arrow_down_24dp);
        mo8346M(R.string.expand_button_title);
        mo8344K(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.f12745q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.f12721G)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                if (charSequence == null) {
                    charSequence = charSequence2;
                } else {
                    charSequence = this.f12738j.getString(R.string.summary_collapsed_preference_list, new Object[]{charSequence, charSequence2});
                }
            }
        }
        mo8329n(charSequence);
        this.f12873a = j + 1000000;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        axVar.f12846c = false;
    }

    /* renamed from: fn */
    public final long mo8363fn() {
        return this.f12873a;
    }
}
