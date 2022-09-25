package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.o */
/* compiled from: PG */
public final /* synthetic */ class C15095o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15106z f45312a;

    public /* synthetic */ C15095o(C15106z zVar) {
        this.f45312a = zVar;
    }

    public final void onClick(View view) {
        C15106z zVar = this.f45312a;
        C58976aa aaVar = C58975e.f156826a;
        TextView textView = zVar.f45328e;
        textView.getClass();
        String obj = textView.getText().toString();
        if (!C58837ba.m90859h(obj) && !Objects.equals(obj, zVar.f45326c.getString(R.string.dial_number))) {
            zVar.f45325b.mo21875g(C14742l.m31050f(obj));
        }
    }
}
