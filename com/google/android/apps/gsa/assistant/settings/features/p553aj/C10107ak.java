package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.view.View;
import android.widget.RadioButton;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.av.en;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.adf;
import com.google.common.util.concurrent.C60826bg;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ak */
/* compiled from: PG */
public final class C10107ak {

    /* renamed from: a */
    public final C10102af f34403a;

    /* renamed from: b */
    public final String f34404b;

    /* renamed from: c */
    public final dn f34405c;

    /* renamed from: d */
    public final ei f34406d;

    /* renamed from: e */
    public final en f34407e;

    /* renamed from: f */
    public C49879cj f34408f = C49879cj.f129628l;

    /* renamed from: g */
    public View f34409g;

    /* renamed from: h */
    public RadioButton f34410h;

    /* renamed from: i */
    public RadioButton f34411i;

    /* renamed from: j */
    public ItemView f34412j;

    /* renamed from: k */
    public ItemView f34413k;

    public C10107ak(C10102af afVar, String str, dn dnVar, ei eiVar, en enVar) {
        this.f34403a = afVar;
        this.f34404b = str;
        this.f34405c = dnVar;
        this.f34406d = eiVar;
        this.f34407e = enVar;
    }

    /* renamed from: a */
    public static ar m24927a() {
        aq createBuilder = ar.f.createBuilder();
        C45595b bVar = C45595b.GOOGLE_ASSISTANT_ANDROID_PERSONAL_RESULTS_SETTINGS;
        createBuilder.copyOnWrite();
        ar arVar = createBuilder.instance;
        arVar.b = bVar.f119929nK;
        arVar.a |= 1;
        return createBuilder.build();
    }

    /* renamed from: b */
    public final C49879cj mo18246b() {
        return (C49879cj) this.f34405c.j(this.f34404b).orElse(C49879cj.f129628l);
    }

    /* renamed from: c */
    public final adf mo18247c() {
        return (adf) Collection.EL.stream(this.f34405c.b.f129041a).filter(new C10106aj(this)).findFirst().orElse(adf.f129030h);
    }

    /* renamed from: d */
    public final void mo18248d() {
        this.f34405c.h.mo4106b(new C10103ag(this), C60826bg.f164896a);
    }
}
