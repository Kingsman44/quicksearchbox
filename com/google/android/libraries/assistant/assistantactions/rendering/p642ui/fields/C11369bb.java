package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11296d;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11298f;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51018di;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bb */
/* compiled from: PG */
public final /* synthetic */ class C11369bb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageField f37098a;

    public /* synthetic */ C11369bb(ImageField imageField) {
        this.f37098a = imageField;
    }

    public final void onClick(View view) {
        C11295c cVar;
        C51018di diVar;
        ImageField imageField = this.f37098a;
        C11296d dVar = imageField.f37154m;
        if (dVar != null && (cVar = imageField.f37153l) != null) {
            C51941eu euVar = cVar.f36729a;
            C11298f a = dVar.mo19691a(cVar);
            if (euVar.f136277e == 14) {
                diVar = (C51018di) euVar.f136278f;
            } else {
                diVar = C51018di.f132836d;
            }
            if ((diVar.f132838a & 2) != 0) {
                C51016dg dgVar = diVar.f132840c;
                if (dgVar == null) {
                    dgVar = C51016dg.f132827g;
                }
                imageField.mo19942i(dgVar, a);
            }
            imageField.mo19940g(imageField.f37000a, false);
        }
    }
}
