package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.C1877c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.NonScrollableLinearLayoutManager;
import com.google.assistant.p3897e.p3902c.p3907c.C51114gx;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ReceiptCardListField */
/* compiled from: PG */
public final class ReceiptCardListField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89165a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ReceiptCardListField");

    /* renamed from: b */
    public C51941eu f89166b;

    /* renamed from: c */
    public C33182g f89167c;

    /* renamed from: d */
    public C32953f f89168d;

    /* renamed from: e */
    public Fragment f89169e;

    /* renamed from: f */
    private RecyclerView f89170f = null;

    public ReceiptCardListField(Context context) {
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
        C51114gx gxVar;
        C51941eu euVar = this.f89166b;
        if (euVar == null || this.f89167c == null) {
            ((C59052c) ((C59052c) f89165a.mo56226d()).mo56372aa(51135)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89166b = euVar2;
            this.f89167c.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89166b;
        if (euVar3.f136277e == 34) {
            gxVar = (C51114gx) euVar3.f136278f;
        } else {
            gxVar = C51114gx.f133036b;
        }
        C62971cq cqVar = gxVar.f133038a;
        if (this.f89170f != null) {
            this.f89170f.setAdapter(new C33349da(this, cqVar));
            this.f89170f.setVisibility(0);
            this.f89170f.setLayoutManager(new NonScrollableLinearLayoutManager(getContext()));
            C0569cl clVar = new C0569cl(getContext(), 1);
            Drawable a = C1877c.m5125a(getContext(), R.drawable.fa_contact_item_grey_divider);
            a.getClass();
            clVar.f2212a = a;
            this.f89170f.addItemDecoration$ar$ds(clVar);
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
        this.f89170f = (RecyclerView) findViewById(R.id.fa_receipt_card_list_field_list_view);
    }

    public ReceiptCardListField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReceiptCardListField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReceiptCardListField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
