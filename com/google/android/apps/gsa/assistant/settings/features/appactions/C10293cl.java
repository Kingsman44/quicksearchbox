package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cl */
/* compiled from: PG */
public final /* synthetic */ class C10293cl implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10301ct f34881a;

    /* renamed from: b */
    public final /* synthetic */ C49826ak f34882b;

    public /* synthetic */ C10293cl(C10301ct ctVar, C49826ak akVar) {
        this.f34881a = ctVar;
        this.f34882b = akVar;
    }

    public final void onClick(View view) {
        C10301ct ctVar = this.f34881a;
        C49826ak akVar = this.f34882b;
        ctVar.f34902i.mo65296c(C89849ae.APP_ACTIONS_SETTINGS_DELETE_CLICKED);
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        ctVar.mo18401d((C49826ak) ahVar.build());
    }
}
