package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.content.Context;
import android.os.Bundle;
import android.support.p033v7.app.C0392m;
import android.support.p033v7.app.C0401v;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104430ag;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104431ah;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8106b.C104479o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.p2460r.p2464b.p2468d.C32056a;
import com.google.android.material.p3506c.C44581b;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7592cs;
import com.google.p375ai.p378b.C7593ct;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.ef */
/* compiled from: PG */
public final class C104804ef extends C22939d {

    /* renamed from: a */
    public final C104430ag f292026a;

    /* renamed from: b */
    public C0392m f292027b;

    /* renamed from: c */
    private final C104479o f292028c;

    /* renamed from: d */
    private final Context f292029d;

    /* renamed from: e */
    private final boolean f292030e;

    public C104804ef(C22945j jVar, C104430ag agVar, C104479o oVar, Context context, boolean z) {
        super(jVar);
        this.f292026a = agVar;
        this.f292028c = oVar;
        this.f292029d = context;
        this.f292030e = z;
    }

    /* renamed from: e */
    public final void mo94355e() {
        if (this.f63126Q.mo28316z()) {
            C104430ag agVar = this.f292026a;
            ((C104431ah) agVar).f290564a.mo28345s("onReportDialogDismissed", "ReportContentEventsDispatcher", new Bundle());
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        C0392m mVar = this.f292027b;
        if (mVar != null && mVar.isShowing()) {
            this.f292027b.dismiss();
            mo94355e();
            this.f292027b = null;
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        mo28295iC(new View(this.f292029d));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C0392m mVar;
        C44581b bVar = new C44581b(this.f292029d, 2132150858);
        C58833ax axVar = (C58833ax) ((C104796dy) this.f292028c).f292008a.f63720e;
        if (!axVar.mo56113h()) {
            mVar = bVar.create();
        } else {
            C7593ct ctVar = (C7593ct) axVar.mo56107c();
            bVar.mo47605x(ctVar.f26247a);
            bVar.mo47602u(ctVar.f26249c, new C104800eb(this));
            bVar.mo47599r(ctVar.f26248b, C104801ec.f292023a);
            bVar.f1347a.f1335p = new C104802ed(this);
            View inflate = LayoutInflater.from(bVar.getContext()).inflate(R.layout.report_content, (ViewGroup) null);
            C62971cq cqVar = ctVar.f26250d;
            RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.reason_list_view);
            for (int i = 0; i < cqVar.size(); i++) {
                RadioButton radioButton = new RadioButton(inflate.getContext());
                radioButton.setText(((C7592cs) cqVar.get(i)).f26241b);
                radioButton.setTextSize(14.0f);
                radioButton.setMinHeight((int) C32056a.m59733a(48.0f, inflate.getContext()));
                radioButton.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                radioGroup.addView(radioButton);
            }
            radioGroup.setOnCheckedChangeListener(new C104803ee(this));
            String str = ctVar.f26252f;
            TextView textView = (TextView) inflate.findViewById(R.id.legal_disclaimer_view);
            textView.setText(Html.fromHtml(str));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            bVar.mo47607z(inflate);
            mVar = bVar.create();
            C0401v b = mVar.mo1197b();
            int i2 = 1;
            if (true == this.f292030e) {
                i2 = 2;
            }
            b.mo1191s(i2);
        }
        this.f292027b = mVar;
        mVar.show();
        C104430ag agVar = this.f292026a;
        ((C104431ah) agVar).f290564a.mo28345s("onReportDialogShown", "ReportContentEventsDispatcher", new Bundle());
        C0392m mVar2 = this.f292027b;
        mVar2.getClass();
        mVar2.f1349a.f1110j.setEnabled(false);
    }
}
