package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.a;
import com.google.android.apps.gsa.nga.api.a.ak;
import com.google.android.apps.gsa.nga.api.a.b;
import com.google.android.apps.gsa.nga.api.a.r;
import com.google.android.apps.gsa.nga.api.a.s;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.e */
/* compiled from: PG */
public final /* synthetic */ class C126116e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126150n f347544a;

    /* renamed from: b */
    public final /* synthetic */ C126087cy f347545b;

    public /* synthetic */ C126116e(C126150n nVar, C126087cy cyVar) {
        this.f347544a = nVar;
        this.f347545b = cyVar;
    }

    public final Object apply(Object obj) {
        C126150n nVar = this.f347544a;
        C126087cy cyVar = this.f347545b;
        C58485gu guVar = (C58485gu) obj;
        C125969b bVar = nVar.f347614d;
        String g = nVar.f347613c.mo107273g(true != cyVar.mo107326a().equals(C119299u.STICKY) ? R.string.assistant_keyboard_announce_dictation_start : R.string.assistant_keyboard_announce_sticky_mic, new Object[0]);
        a createBuilder = b.c.createBuilder();
        createBuilder.copyOnWrite();
        g.getClass();
        createBuilder.instance.a = g;
        bVar.mo107212a(createBuilder.build());
        C126054bs bsVar = nVar.f347613c;
        C119299u a = cyVar.mo107326a();
        C58485gu e = C126054bs.m206108e(guVar);
        ak builder = bsVar.mo107270b((String) C126054bs.m206109f(e).orElse(BuildConfig.FLAVOR), bsVar.mo107271c(e), C126054bs.m206110i(e), a).toBuilder();
        r createBuilder2 = s.b.createBuilder();
        String g2 = bsVar.mo107273g(R.string.assistant_keyboard_firstrun_text, new Object[0]);
        createBuilder2.copyOnWrite();
        g2.getClass();
        createBuilder2.instance.a = g2;
        s build = createBuilder2.build();
        builder.copyOnWrite();
        build.getClass();
        builder.instance.d = build;
        return builder.build();
    }
}
