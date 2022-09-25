package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.assistant.p3897e.p3902c.p3907c.C50986cd;
import com.google.assistant.p3897e.p3902c.p3907c.C50987ce;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.DividerField */
/* compiled from: PG */
public final class DividerField extends LinearLayout implements C33177b {

    /* renamed from: c */
    private static final C59071e f89072c = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.DividerField");

    /* renamed from: a */
    public C51941eu f89073a;

    /* renamed from: b */
    public C33182g f89074b;

    /* renamed from: d */
    private View f89075d = null;

    public DividerField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C50987ce ceVar;
        C51941eu euVar = this.f89073a;
        if (euVar == null || this.f89074b == null || this.f89075d == null) {
            ((C59052c) ((C59052c) f89072c.mo56226d()).mo56372aa(51061)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89073a = euVar2;
            this.f89074b.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89073a;
        if (euVar3.f136277e == 30) {
            ceVar = (C50987ce) euVar3.f136278f;
        } else {
            ceVar = C50987ce.f132736c;
        }
        int a = C50986cd.m86002a(ceVar.f132739b);
        if (a != 0 && a == 2) {
            this.f89075d.setBackground(getContext().getDrawable(R.drawable.fa_divider_solid_line));
        } else {
            this.f89075d.setBackgroundColor(getContext().getResources().getColor(17170445, getContext().getTheme()));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89075d = findViewById(R.id.fa_divider_field_divider);
    }

    public DividerField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DividerField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DividerField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
