package p5652p.p5653a.p5654a.p5655a.p5680m.p5681a;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.libraries.componentview.components.base.C20081f;
import com.google.p4463ce.p4464a.p4470b.p4472b.p4473a.p4474a.C58055a;

/* renamed from: p.a.a.a.m.a.b */
/* compiled from: PG */
public final /* synthetic */ class C72749b implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C72750c f193418a;

    public /* synthetic */ C72749b(C72750c cVar) {
        this.f193418a = cVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C72750c cVar = this.f193418a;
        C58055a aVar = cVar.f56306q;
        View view = cVar.f56305p;
        Boolean valueOf = Boolean.valueOf(z);
        C20081f.m37970b(aVar, "_bind_state", view, valueOf);
        C20081f.m37970b(cVar.f56306q, "change", cVar.f56305p, valueOf);
    }
}
