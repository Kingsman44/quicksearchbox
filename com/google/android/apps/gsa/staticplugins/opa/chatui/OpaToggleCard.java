package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.p5816g.C73867g;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7159c.C90879am;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public class OpaToggleCard extends LinearLayout implements C73867g {

    /* renamed from: a */
    public static final C59071e f300932a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.OpaToggleCard");

    /* renamed from: b */
    public TextView f300933b;

    /* renamed from: c */
    public TextView f300934c;

    /* renamed from: d */
    public ImageView f300935d;

    /* renamed from: e */
    public Switch f300936e;

    /* renamed from: f */
    public C91189au f300937f;

    public OpaToggleCard(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C60870cx mo65343a(C90931ca caVar) {
        return caVar.mo85138c(new C90879am("OpaToggleCard#ActionCardHistoryProtoTask", 1, 8, new C108379gn(this)));
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f300933b = (TextView) findViewById(R.id.text);
        this.f300934c = (TextView) findViewById(R.id.secondary_text);
        this.f300935d = (ImageView) findViewById(R.id.icon);
        this.f300936e = (Switch) findViewById(R.id.toggle);
    }

    public OpaToggleCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OpaToggleCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
