package com.google.android.libraries.lens.view.infopanel;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.libraries.lens.view.infopanel.p2142c.C27077d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4552o.abp;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ay */
/* compiled from: PG */
public final /* synthetic */ class C27007ay implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public static final /* synthetic */ C27007ay f73637a = new C27007ay();

    private /* synthetic */ C27007ay() {
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        C47393f.m84237h(new C27077d(textView.getText().toString().trim(), abp.TEXT_INPUT), textView);
        return true;
    }
}
