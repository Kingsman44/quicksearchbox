package p5652p.p5653a.p5654a.p5655a.p5660c.p5661a;

import android.view.View;
import android.widget.CompoundButton;
import com.google.android.libraries.componentview.components.base.C20081f;
import com.google.p4463ce.p4464a.p4470b.p4472b.p4473a.p4474a.C58055a;

/* renamed from: p.a.a.a.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C72684a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C72685b f193285a;

    public /* synthetic */ C72684a(C72685b bVar) {
        this.f193285a = bVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C72685b bVar = this.f193285a;
        C58055a aVar = bVar.f56306q;
        View view = bVar.f56305p;
        Boolean valueOf = Boolean.valueOf(z);
        C20081f.m37970b(aVar, "_bind_state", view, valueOf);
        C20081f.m37970b(bVar.f56306q, "change", bVar.f56305p, valueOf);
    }
}
