package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10334au;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10341ba;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.at */
/* compiled from: PG */
final class C10214at extends C10334au {

    /* renamed from: a */
    final /* synthetic */ C10216av f34663a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10214at(C10216av avVar) {
        super(avVar.f34673i, avVar.f34670f, avVar.mo18345b());
        this.f34663a = avVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ int mo18342a(Object obj, C58495hd hdVar) {
        C59071e eVar = C10216av.f34665a;
        C58976aa aaVar = C58975e.f156826a;
        View view = this.f34663a.f34684t;
        view.getClass();
        this.f34663a.mo18347e((TextView) view.findViewById(R.id.collapsed_title));
        this.f34663a.f34682r = hdVar;
        this.f34663a.mo18349g(C10383ae.m25354j(((C10341ba) obj).mo18438a()), C58485gu.m89845m(), Optional.empty());
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo18343b() {
        return this.f34663a.f34669e.mo18423e();
    }
}
