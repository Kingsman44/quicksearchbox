package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14430iy;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14473kn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14474ko;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14477kr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.f */
/* compiled from: PG */
public final /* synthetic */ class C15332f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C15336j f46014a;

    /* renamed from: b */
    public final /* synthetic */ OptionalInt f46015b;

    /* renamed from: c */
    public final /* synthetic */ boolean f46016c;

    public /* synthetic */ C15332f(C15336j jVar, OptionalInt optionalInt, boolean z) {
        this.f46014a = jVar;
        this.f46015b = optionalInt;
        this.f46016c = z;
    }

    public final void onClick(View view) {
        C15336j jVar = this.f46014a;
        OptionalInt optionalInt = this.f46015b;
        boolean z = this.f46016c;
        if (optionalInt.isPresent()) {
            C14986h hVar = jVar.f46026b;
            int asInt = optionalInt.getAsInt();
            C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
            C14430iy iyVar = (C14430iy) C14477kr.f43756c.createBuilder();
            C14473kn knVar = (C14473kn) C14474ko.f43749c.createBuilder();
            knVar.copyOnWrite();
            ((C14474ko) knVar.instance).f43751a = asInt;
            knVar.copyOnWrite();
            ((C14474ko) knVar.instance).f43752b = !z;
            iyVar.copyOnWrite();
            C14477kr krVar = (C14477kr) iyVar.instance;
            C14474ko koVar = (C14474ko) knVar.build();
            koVar.getClass();
            krVar.f43759b = koVar;
            krVar.f43758a = 7;
            gtVar.copyOnWrite();
            C14492lf lfVar = (C14492lf) gtVar.instance;
            C14477kr krVar2 = (C14477kr) iyVar.build();
            krVar2.getClass();
            lfVar.f43801d = krVar2;
            lfVar.f43800c = 4;
            hVar.mo21875g((C14492lf) gtVar.build());
            return;
        }
        C59104x c = C15336j.f46020a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.CallHelper");
        ((C59052c) ((C59052c) c).mo56372aa(46049)).mo56386p("Unable to hold call, unknown current call ID!");
    }
}
