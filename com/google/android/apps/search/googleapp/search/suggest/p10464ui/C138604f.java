package com.google.android.apps.search.googleapp.search.suggest.p10464ui;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.search.suggest.C138127i;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138586k;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.f */
/* compiled from: PG */
final class C138604f implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ C138611m f376955a;

    /* renamed from: b */
    final /* synthetic */ EditText f376956b;

    public C138604f(C138611m mVar, EditText editText) {
        this.f376955a = mVar;
        this.f376956b = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        this.f376955a.f376977h.mo33853c(new C28440j(6).mo33894a(), C28485y.m53234a(this.f376956b));
        String obj = C69764m.m101197q(this.f376956b.getText().toString()).toString();
        if (C69764m.m101229h(obj)) {
            return true;
        }
        C138127i iVar = C138127i.f375805b;
        C69664n.m101060f(iVar, "getDefaultInstance()");
        C47393f.m84237h(new C138586k(obj, iVar), this.f376956b);
        return true;
    }
}
