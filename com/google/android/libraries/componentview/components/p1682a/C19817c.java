package com.google.android.libraries.componentview.components.p1682a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19754a;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19757b;
import com.google.android.libraries.componentview.components.p1689c.C20183ac;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20178x;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.base.C58837ba;
import com.google.common.p4535g.C59203do;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.a.c */
/* compiled from: PG */
public class C19817c extends C20061bs {

    /* renamed from: a */
    public C20183ac f55395a;

    /* renamed from: b */
    public EditText f55396b;

    /* renamed from: c */
    public EditText f55397c;

    /* renamed from: d */
    public boolean f55398d;

    /* renamed from: e */
    private LinearLayout f55399e;

    /* renamed from: f */
    private TextView f55400f;

    /* renamed from: g */
    private TextView f55401g;

    public C19817c(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
    }

    /* renamed from: j */
    public static void m37669j(double d, int i, EditText editText) {
        editText.setText(new BigDecimal(d).setScale(i, 4).stripTrailingZeros().toPlainString());
    }

    /* renamed from: m */
    private static final String m37670m(String str, String str2) {
        if (C58837ba.m90859h(str) && C58837ba.m90859h(str2)) {
            return BuildConfig.FLAVOR;
        }
        if (C58837ba.m90859h(str)) {
            str2.getClass();
            return str2;
        } else if (C58837ba.m90859h(str2)) {
            str.getClass();
            return str;
        } else {
            return String.format("%s · %s", new Object[]{str, str2});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.assistant_currency_widget, (ViewGroup) null);
        this.f55399e = linearLayout;
        this.f55396b = (EditText) linearLayout.findViewById(R.id.assistant_currency_widget_base_currency_value);
        this.f55400f = (TextView) this.f55399e.findViewById(R.id.assistant_currency_widget_base_currency_name);
        this.f55397c = (EditText) this.f55399e.findViewById(R.id.assistant_currency_widget_target_currency_value);
        this.f55401g = (TextView) this.f55399e.findViewById(R.id.assistant_currency_widget_target_currency_name);
        return this.f55399e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19757b.f55185d);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20178x xVar = ((C19757b) obj).f55188b;
        if (xVar == null) {
            xVar = C20178x.f56609g;
        }
        C20183ac acVar = new C20183ac(xVar);
        this.f55395a = acVar;
        if (!acVar.f56640b) {
            C20520h.m38497b(5, "AssistantCurrencyWidget", new RuntimeException(), "Invalid CurrencyWidgetModel", new Object[0]);
            return;
        }
        m37669j(acVar.mo25261a(), this.f55395a.mo25264d(), this.f55396b);
        TextView textView = this.f55400f;
        C20183ac acVar2 = this.f55395a;
        textView.setText(m37670m(acVar2.mo25268h(C58837ba.m90858g(acVar2.mo25269i())), this.f55395a.mo25269i()));
        m37669j(this.f55395a.mo25263c(), this.f55395a.mo25265e(), this.f55397c);
        TextView textView2 = this.f55401g;
        C20183ac acVar3 = this.f55395a;
        textView2.setText(m37670m(acVar3.mo25268h(C58837ba.m90858g(acVar3.mo25270j())), this.f55395a.mo25270j()));
        this.f55396b.addTextChangedListener(new C19753a(this));
        this.f55397c.addTextChangedListener(new C19808b(this));
    }

    /* renamed from: i */
    public final void mo25131i() {
        this.f55395a.mo25272l(C59203do.f157270a);
        this.f55396b.setText(BuildConfig.FLAVOR);
        this.f55395a.mo25273m(C59203do.f157270a);
        this.f55397c.setText(BuildConfig.FLAVOR);
    }

    /* access modifiers changed from: protected */
    /* renamed from: kz */
    public final C56425d mo25132kz(List list) {
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        C62940bt btVar = C19757b.f55185d;
        C19754a aVar = (C19754a) C19757b.f55184c.createBuilder();
        C20178x f = this.f55395a.mo25266f();
        aVar.copyOnWrite();
        C19757b bVar = (C19757b) aVar.instance;
        f.getClass();
        bVar.f55188b = f;
        bVar.f55187a |= 1;
        cVar.mo58885m(btVar, (C19757b) aVar.build());
        return (C56425d) cVar.build();
    }
}
