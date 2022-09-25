package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14449jq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.u */
/* compiled from: PG */
public final /* synthetic */ class C15101u implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15106z f45319a;

    public /* synthetic */ C15101u(C15106z zVar) {
        this.f45319a = zVar;
    }

    public final boolean onLongClick(View view) {
        C15106z zVar = this.f45319a;
        TextView textView = zVar.f45328e;
        textView.getClass();
        if (!Objects.equals(textView.getText().toString(), zVar.f45326c.getString(R.string.dial_number))) {
            return false;
        }
        C14986h hVar = zVar.f45325b;
        C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
        C14430iy iyVar = (C14430iy) C14477kr.f43756c.createBuilder();
        C14449jq jqVar = C14449jq.f43715a;
        iyVar.copyOnWrite();
        C14477kr krVar = (C14477kr) iyVar.instance;
        jqVar.getClass();
        krVar.f43759b = jqVar;
        krVar.f43758a = 19;
        gtVar.copyOnWrite();
        C14492lf lfVar = (C14492lf) gtVar.instance;
        C14477kr krVar2 = (C14477kr) iyVar.build();
        krVar2.getClass();
        lfVar.f43801d = krVar2;
        lfVar.f43800c = 4;
        hVar.mo21875g((C14492lf) gtVar.build());
        return true;
    }
}
