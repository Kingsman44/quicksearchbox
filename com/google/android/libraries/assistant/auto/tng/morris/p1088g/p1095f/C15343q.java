package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14148r;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14152v;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.q */
/* compiled from: PG */
public final /* synthetic */ class C15343q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C14286dp f46040a;

    /* renamed from: b */
    public final /* synthetic */ C14986h f46041b;

    /* renamed from: c */
    public final /* synthetic */ C14152v f46042c;

    public /* synthetic */ C15343q(C14286dp dpVar, C14986h hVar, C14152v vVar) {
        this.f46040a = dpVar;
        this.f46041b = hVar;
        this.f46042c = vVar;
    }

    public final void onClick(View view) {
        C14286dp dpVar = this.f46040a;
        C14986h hVar = this.f46041b;
        C14152v vVar = this.f46042c;
        C58495hd hdVar = C15346t.f46047a;
        C14492lf lfVar = dpVar.f43220d;
        if (lfVar != null) {
            hVar.mo21875g(lfVar);
            C14148r rVar = new C14148r(vVar);
            C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(rVar), vVar.f42889k), "Error logging playback cancel", new Object[0]);
        }
    }
}
