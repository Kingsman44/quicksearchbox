package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class DropDownPreference extends ListPreference {

    /* renamed from: I */
    private final Context f12699I;

    /* renamed from: J */
    private final ArrayAdapter f12700J;

    /* renamed from: K */
    private Spinner f12701K;

    /* renamed from: L */
    private final AdapterView.OnItemSelectedListener f12702L = new C4007c(this);

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.f12699I = context;
        this.f12700J = new ArrayAdapter(context, 17367049);
        m11349ac();
    }

    /* renamed from: ac */
    private final void m11349ac() {
        this.f12700J.clear();
        CharSequence[] charSequenceArr = this.f12707g;
        if (charSequenceArr != null) {
            for (CharSequence obj : charSequenceArr) {
                this.f12700J.add(obj.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        Spinner spinner = (Spinner) axVar.itemView.findViewById(R.id.spinner);
        this.f12701K = spinner;
        spinner.setAdapter(this.f12700J);
        this.f12701K.setOnItemSelectedListener(this.f12702L);
        Spinner spinner2 = this.f12701K;
        String str = this.f12709i;
        CharSequence[] charSequenceArr = this.f12708h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo8313a(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo8315c() {
        this.f12701K.performClick();
    }

    /* renamed from: e */
    public final void mo8317e() {
        super.mo8317e();
        ArrayAdapter arrayAdapter = this.f12700J;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: f */
    public final void mo8318f(CharSequence[] charSequenceArr) {
        this.f12707g = charSequenceArr;
        m11349ac();
    }
}
