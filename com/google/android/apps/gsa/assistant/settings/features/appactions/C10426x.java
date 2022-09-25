package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.app.Dialog;
import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90019by;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.x */
/* compiled from: PG */
public final /* synthetic */ class C10426x implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C10199ae f35149a;

    public /* synthetic */ C10426x(C10199ae aeVar) {
        this.f35149a = aeVar;
    }

    public final void accept(Object obj) {
        C10199ae aeVar = this.f35149a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C90021c cVar = aeVar.f34636n;
        cVar.getClass();
        if (cVar.mo79746e(C90019by.f248088v)) {
            C10421s sVar = aeVar.f34625c;
            sVar.getClass();
            Dialog dialog = sVar.getDialog();
            if (dialog != null) {
                boolean z = !booleanValue;
                dialog.setCanceledOnTouchOutside(z);
                dialog.setCancelable(z);
            }
            View view = aeVar.f34624b;
            view.getClass();
            view.findViewById(R.id.chat_bubble_dialog_layout).c(booleanValue);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
