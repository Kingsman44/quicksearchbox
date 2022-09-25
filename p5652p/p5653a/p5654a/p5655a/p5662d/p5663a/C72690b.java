package p5652p.p5653a.p5654a.p5655a.p5662d.p5663a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.google.android.libraries.componentview.components.base.C20081f;

/* renamed from: p.a.a.a.d.a.b */
/* compiled from: PG */
final class C72690b implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ C72691c f193295a;

    public C72690b(C72691c cVar) {
        this.f193295a = cVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (view instanceof TextView) {
            this.f193295a.mo64511i((TextView) view);
        }
        C72691c cVar = this.f193295a;
        if (i != cVar.f193296a) {
            cVar.f193296a = i;
            C20081f.m37970b(cVar.f56306q, "_bind_index", cVar.f56305p, Integer.valueOf(i));
            C72691c cVar2 = this.f193295a;
            C20081f.m37970b(cVar2.f56306q, "change", cVar2.f56305p, Integer.valueOf(cVar2.f193296a));
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
