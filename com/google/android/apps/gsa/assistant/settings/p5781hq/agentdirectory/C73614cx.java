package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.support.p033v7.app.C0392m;
import android.view.View;
import android.widget.RadioGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50498zh;
import com.google.assistant.p3861at.C50500zj;
import com.google.assistant.p3861at.C50502zl;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.cx */
/* compiled from: PG */
public final /* synthetic */ class C73614cx implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ du f194753a;

    /* renamed from: b */
    public final /* synthetic */ C0392m f194754b;

    /* renamed from: c */
    public final /* synthetic */ View f194755c;

    /* renamed from: d */
    public final /* synthetic */ C50502zl f194756d;

    /* renamed from: e */
    public final /* synthetic */ C50498zh f194757e;

    public /* synthetic */ C73614cx(du duVar, C0392m mVar, View view, C50502zl zlVar, C50498zh zhVar) {
        this.f194753a = duVar;
        this.f194754b = mVar;
        this.f194755c = view;
        this.f194756d = zlVar;
        this.f194757e = zhVar;
    }

    public final void onClick(View view) {
        cn cnVar;
        du duVar = this.f194753a;
        C0392m mVar = this.f194754b;
        View view2 = this.f194755c;
        C50502zl zlVar = this.f194756d;
        C50498zh zhVar = this.f194757e;
        mVar.dismiss();
        View findViewById = view2.findViewById(R.id.channel_selection_group);
        findViewById.getClass();
        int checkedRadioButtonId = ((RadioGroup) findViewById).getCheckedRadioButtonId();
        if (checkedRadioButtonId >= 0 && checkedRadioButtonId < zlVar.f131464d.size() && (cnVar = duVar.i) != null) {
            cnVar.j(duVar.b, zhVar, (C50500zj) zlVar.f131464d.get(checkedRadioButtonId));
        }
    }
}
