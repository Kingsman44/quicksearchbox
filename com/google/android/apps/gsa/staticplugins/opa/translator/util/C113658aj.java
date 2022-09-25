package com.google.android.apps.gsa.staticplugins.opa.translator.util;

import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113600m;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.util.aj */
/* compiled from: PG */
public final /* synthetic */ class C113658aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterpreterMainTextView f314834a;

    /* renamed from: b */
    public final /* synthetic */ TextView f314835b;

    /* renamed from: c */
    public final /* synthetic */ C113600m f314836c;

    public /* synthetic */ C113658aj(InterpreterMainTextView interpreterMainTextView, TextView textView, C113600m mVar) {
        this.f314834a = interpreterMainTextView;
        this.f314835b = textView;
        this.f314836c = mVar;
    }

    public final void run() {
        InterpreterMainTextView interpreterMainTextView = this.f314834a;
        TextView textView = this.f314835b;
        C113600m mVar = this.f314836c;
        C89949q.m146521e(C28285c.m52882i(textView, 5, (Integer) null), false);
        CharSequence text = textView.getText();
        if (text == null || text.length() == 0) {
            C59104x c = InterpreterMainTextView.f314755a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c).mo56372aa(28260)).mo56386p("Smart Reply has no text");
        } else if (interpreterMainTextView.f314768m.isEmpty()) {
            C59104x c2 = InterpreterMainTextView.f314755a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "InterpreterTxt");
            ((C59052c) ((C59052c) c2).mo56372aa(28261)).mo56386p("No language set for Smart Reply");
        } else {
            interpreterMainTextView.mo100434w(text.toString(), interpreterMainTextView.f314768m);
            String obj = text.toString();
            String str = interpreterMainTextView.f314768m;
            mVar.f314531a.mo100339l();
            C113613z.m188060e(mVar.f314531a.f314584l).mo100390s();
            mVar.f314531a.mo100340m(obj, str, true);
        }
    }
}
