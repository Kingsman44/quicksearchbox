package com.google.android.apps.gsa.assistant.settings.features.appactions.p569e;

import android.content.Context;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0392m;
import com.google.android.apps.gsa.assistant.settings.features.appactions.C10371dd;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.shared.appactions.c.j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.e.b */
/* compiled from: PG */
public final class C10376b extends j {

    /* renamed from: e */
    private final C10325al f35077e;

    /* renamed from: f */
    private final C10273r f35078f;

    /* renamed from: g */
    private final C10371dd f35079g;

    public C10376b(C0167am amVar, Context context, C10325al alVar, C22871g gVar, C10273r rVar, C90021c cVar, C10371dd ddVar) {
        super(amVar, context, gVar, cVar);
        this.f35077e = alVar;
        this.f35078f = rVar;
        this.f35079g = ddVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo18459a(String str) {
        C49826ak akVar = this.f35078f.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        ((C49826ak) ahVar.instance).f129465b = C62942bv.emptyProtobufList();
        ahVar.mo53361a(str);
        C49826ak akVar2 = (C49826ak) ahVar.build();
        C10325al alVar = this.f35077e;
        C49838aw awVar = this.f35078f.f34820b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        return alVar.mo18427i(awVar.f129507b, akVar2, Optional.m71637of(Long.valueOf(this.f35078f.f34822d)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo18460b() {
        C49826ak akVar = this.f35078f.f34821c;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        if (akVar.f129465b.isEmpty()) {
            return akVar.f129471h;
        }
        return (String) akVar.f129465b.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo18461d(Object obj, String str) {
        DataType$UpdateResult dataType$UpdateResult = (DataType$UpdateResult) obj;
        if (dataType$UpdateResult.mo18410a() == 0) {
            ((C0392m) this.d.get()).dismiss();
            this.f35079g.f35056a.f35058a.mo18335a(Optional.m71637of(str), Optional.empty(), true);
            return;
        }
        h(dataType$UpdateResult.mo18412c());
    }

    /* renamed from: e */
    public final void mo18462e() {
        C10376b.super.e();
        h(6);
    }
}
