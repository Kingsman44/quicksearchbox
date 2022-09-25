package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14738h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bq */
/* compiled from: PG */
final class C15035bq extends C0673gh implements View.OnClickListener {

    /* renamed from: a */
    public final TextView f45092a;

    /* renamed from: b */
    public C14292dv f45093b = null;

    /* renamed from: c */
    final /* synthetic */ C15038bt f45094c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15035bq(C15038bt btVar, View view) {
        super(view);
        this.f45094c = btVar;
        this.f45092a = (TextView) view.findViewById(R.id.media_browse_tree_browsable_item_title);
    }

    public final void onClick(View view) {
        C14292dv dvVar = this.f45093b;
        if (dvVar != null) {
            this.f45094c.f45103c.mo21875g(C14738h.m31027e(dvVar));
        }
    }
}
