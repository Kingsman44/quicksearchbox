package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.assistant.p3897e.p3902c.p3907c.C51114gx;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCardListField */
/* compiled from: PG */
public final class ReceiptCardListField extends C11407n {

    /* renamed from: a */
    private ListView f37029a;

    public ReceiptCardListField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51114gx gxVar;
        C11295c cVar = this.f37153l;
        if (cVar != null && this.f37154m != null && this.f37152k != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 34) {
                gxVar = (C51114gx) euVar.f136278f;
            } else {
                gxVar = C51114gx.f133036b;
            }
            C62971cq cqVar = gxVar.f133038a;
            C51119hb[] hbVarArr = (C51119hb[]) cqVar.toArray(new C51119hb[cqVar.size()]);
            this.f37029a.setAdapter(new C11384bq(getContext(), hbVarArr));
            this.f37029a.setVisibility(0);
            this.f37029a.setOnItemClickListener(new C11383bp(this, hbVarArr));
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37029a = (ListView) findViewById(R.id.receipt_card_list_view);
    }

    /* renamed from: q */
    public final void mo19853q(boolean z) {
        this.f37151j = z;
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
