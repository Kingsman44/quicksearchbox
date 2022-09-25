package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import android.view.View;
import android.widget.RadioButton;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.av.ei;
import com.google.android.apps.gsa.assistant.settings.features.av.en;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.assistant.p3861at.adf;
import com.google.common.util.concurrent.C60826bg;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.as */
/* compiled from: PG */
public final class C10115as {

    /* renamed from: a */
    public final C10110an f34423a;

    /* renamed from: b */
    public final String f34424b;

    /* renamed from: c */
    public final dn f34425c;

    /* renamed from: d */
    public final ei f34426d;

    /* renamed from: e */
    public final en f34427e;

    /* renamed from: f */
    public View f34428f;

    /* renamed from: g */
    public RadioButton f34429g;

    /* renamed from: h */
    public RadioButton f34430h;

    /* renamed from: i */
    public ItemView f34431i;

    /* renamed from: j */
    public ItemView f34432j;

    public C10115as(C10110an anVar, String str, dn dnVar, ei eiVar, en enVar) {
        this.f34423a = anVar;
        this.f34424b = str;
        this.f34425c = dnVar;
        this.f34426d = eiVar;
        this.f34427e = enVar;
    }

    /* renamed from: a */
    public static ar m24941a() {
        aq createBuilder = ar.f.createBuilder();
        C45595b bVar = C45595b.GOOGLE_ASSISTANT_ANDROID_PERSONAL_RESULTS_SETTINGS;
        createBuilder.copyOnWrite();
        ar arVar = createBuilder.instance;
        arVar.b = bVar.f119929nK;
        arVar.a |= 1;
        return createBuilder.build();
    }

    /* renamed from: b */
    public final adf mo18254b() {
        return (adf) Collection.EL.stream(this.f34425c.b.f129041a).filter(new C10111ao(this)).findFirst().orElse(adf.f129030h);
    }

    /* renamed from: c */
    public final void mo18255c() {
        this.f34425c.h.mo4106b(new C10114ar(this), C60826bg.f164896a);
    }
}
