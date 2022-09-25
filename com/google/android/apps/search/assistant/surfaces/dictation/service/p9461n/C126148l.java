package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.a;
import com.google.android.apps.gsa.nga.api.a.b;
import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126030f;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.l */
/* compiled from: PG */
public final /* synthetic */ class C126148l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126150n f347605a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f347606b;

    /* renamed from: c */
    public final /* synthetic */ String f347607c;

    /* renamed from: d */
    public final /* synthetic */ boolean f347608d;

    /* renamed from: e */
    public final /* synthetic */ C119299u f347609e;

    public /* synthetic */ C126148l(C126150n nVar, C58485gu guVar, String str, boolean z, C119299u uVar) {
        this.f347605a = nVar;
        this.f347606b = guVar;
        this.f347607c = str;
        this.f347608d = z;
        this.f347609e = uVar;
    }

    public final Object apply(Object obj) {
        C126030f fVar;
        String str;
        C126150n nVar = this.f347605a;
        C58485gu guVar = this.f347606b;
        String str2 = this.f347607c;
        boolean z = this.f347608d;
        C119299u uVar = this.f347609e;
        C58485gu guVar2 = (C58485gu) obj;
        if (!guVar2.isEmpty()) {
            nVar.f347612b.mo107265f(guVar2);
        }
        C126030f fVar2 = (C126030f) Collection.EL.stream(guVar).filter(C126053br.f347408a).findFirst().map(C126042bg.f347397a).orElse(C126030f.DO_NOT_ANNOUNCE);
        C125969b bVar = nVar.f347614d;
        if (bVar.f347192b) {
            if (str2.isEmpty()) {
                C126054bs bsVar = bVar.f347191a;
                str = bsVar.mo107273g(R.string.assistant_keyboard_announce_command_chips_text, (String) Collection.EL.stream(guVar2).map(C126047bl.f347402a).collect(Collectors.joining(bsVar.mo107273g(R.string.assistant_keyboard_announce_command_chips_separator, new Object[0]))));
                fVar = C126030f.ANNOUNCE_ONCE;
            } else {
                fVar = fVar2;
                str = str2;
            }
            C58528ij ijVar = (C58528ij) DesugarAtomicReference.getAndUpdate(bVar.f347193c, new C125938a(str));
            int ordinal = fVar.ordinal();
            if (ordinal == 0 ? ijVar.contains(str) : ordinal != 2) {
                str = BuildConfig.FLAVOR;
            }
            a createBuilder = b.c.createBuilder();
            createBuilder.copyOnWrite();
            str.getClass();
            createBuilder.instance.a = str;
            bVar.mo107212a(createBuilder.build());
        }
        return nVar.f347613c.mo107270b(str2, guVar2, z, uVar);
    }
}
