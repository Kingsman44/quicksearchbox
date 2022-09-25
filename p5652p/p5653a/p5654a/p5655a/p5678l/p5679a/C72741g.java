package p5652p.p5653a.p5654a.p5655a.p5678l.p5679a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import com.google.android.libraries.componentview.components.base.C20081f;
import com.google.p4463ce.p4464a.p4470b.p4472b.p4473a.p4474a.C58055a;

/* renamed from: p.a.a.a.l.a.g */
/* compiled from: PG */
public final /* synthetic */ class C72741g implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C72745k f193405a;

    public /* synthetic */ C72741g(C72745k kVar) {
        this.f193405a = kVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C72745k kVar = this.f193405a;
        C58055a aVar = kVar.f56306q;
        EditText editText = kVar.f193409a;
        C20081f.m37970b(aVar, "_bind_text", editText, editText.getText().toString());
        C20081f.m37970b(kVar.f56306q, "focuslost", kVar.f193409a, new Object[0]);
    }
}
