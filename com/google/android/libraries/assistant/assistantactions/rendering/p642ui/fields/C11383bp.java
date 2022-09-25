package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import android.widget.AdapterView;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bp */
/* compiled from: PG */
final class C11383bp implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C51119hb[] f37119a;

    /* renamed from: b */
    final /* synthetic */ ReceiptCardListField f37120b;

    public C11383bp(ReceiptCardListField receiptCardListField, C51119hb[] hbVarArr) {
        this.f37120b = receiptCardListField;
        this.f37119a = hbVarArr;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C51098gh ghVar;
        ReceiptCardListField receiptCardListField = this.f37120b;
        C51119hb hbVar = this.f37119a[i];
        if (receiptCardListField.f37153l != null && receiptCardListField.f37154m != null) {
            C51118ha haVar = hbVar.f133064e;
            if (haVar == null) {
                haVar = C51118ha.f133049g;
            }
            if (haVar.f133052b == 4) {
                C51118ha haVar2 = hbVar.f133064e;
                if (haVar2 == null) {
                    haVar2 = C51118ha.f133049g;
                }
                if (haVar2.f133052b == 4) {
                    ghVar = (C51098gh) haVar2.f133053c;
                } else {
                    ghVar = C51098gh.f133009e;
                }
                receiptCardListField.mo19944l(ghVar);
            }
        }
    }
}
