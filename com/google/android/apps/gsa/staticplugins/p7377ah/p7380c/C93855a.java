package com.google.android.apps.gsa.staticplugins.p7377ah.p7380c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.c.a */
/* compiled from: PG */
public final /* synthetic */ class C93855a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C93858d f262126a;

    public /* synthetic */ C93855a(C93858d dVar) {
        this.f262126a = dVar;
    }

    public final void onClick(View view) {
        C93858d dVar = this.f262126a;
        dVar.f262129a.getTheme().applyStyle(R.style.corpora_dialog_theme, true);
        dVar.f262134f = new C44565p(dVar.f262129a, R.style.CorpusBarBottomSheetDialog);
        dVar.f262135g = new C93863i(dVar.f262129a, new C93856b(dVar));
        C93863i iVar = dVar.f262135g;
        iVar.f262144c = dVar.f262133e;
        iVar.addAll(dVar.f262132d);
        View inflate = dVar.f262130b.inflate(R.layout.corpora_dialog, (ViewGroup) null);
        ((ListView) inflate.findViewById(R.id.corpora_list)).setAdapter(dVar.f262135g);
        inflate.findViewById(R.id.close_button).setOnClickListener(new C93857c(dVar));
        dVar.f262134f.setContentView(inflate, new ViewGroup.LayoutParams(-1, -2));
        dVar.f262134f.show();
    }
}
