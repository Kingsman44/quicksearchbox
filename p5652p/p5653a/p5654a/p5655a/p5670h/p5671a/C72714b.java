package p5652p.p5653a.p5654a.p5655a.p5670h.p5671a;

import android.widget.RadioGroup;
import com.google.android.libraries.componentview.components.base.C20081f;

/* renamed from: p.a.a.a.h.a.b */
/* compiled from: PG */
public final /* synthetic */ class C72714b implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C72716d f193351a;

    public /* synthetic */ C72714b(C72716d dVar) {
        this.f193351a = dVar;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        C72716d dVar = this.f193351a;
        if (((RadioGroup) dVar.f56305p).getCheckedRadioButtonId() != dVar.f193354a) {
            dVar.f193354a = ((RadioGroup) dVar.f56305p).getCheckedRadioButtonId();
            C20081f.m37970b(dVar.f56306q, "_bind_index", dVar.f56305p, Integer.valueOf(dVar.mo64524i()));
            C20081f.m37970b(dVar.f56306q, "change", dVar.f56305p, Integer.valueOf(dVar.mo64524i()));
        }
    }
}
