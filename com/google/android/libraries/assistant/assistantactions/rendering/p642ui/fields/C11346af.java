package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.assistant.p3897e.p3921j.C52479tg;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.af */
/* compiled from: PG */
public final /* synthetic */ class C11346af implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactSelectionFieldV2 f37073a;

    public /* synthetic */ C11346af(ContactSelectionFieldV2 contactSelectionFieldV2) {
        this.f37073a = contactSelectionFieldV2;
    }

    public final void onClick(View view) {
        ContactSelectionFieldV2 contactSelectionFieldV2 = this.f37073a;
        if (contactSelectionFieldV2.f37154m != null && contactSelectionFieldV2.f37153l != null) {
            contactSelectionFieldV2.mo19836a(C52479tg.f137757d);
            contactSelectionFieldV2.mo19941h(contactSelectionFieldV2.f37154m.mo19691a(contactSelectionFieldV2.f37153l));
        }
    }
}
