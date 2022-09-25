package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129245h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129246i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.ad */
/* compiled from: PG */
public final /* synthetic */ class C129347ad implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ Context f355238a;

    public /* synthetic */ C129347ad(Context context) {
        this.f355238a = context;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Context context = this.f355238a;
        C126988i iVar = (C126988i) obj2;
        C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
        String string = context.getString(R.string.assistant_generic_error);
        guVar.copyOnWrite();
        C52003hb hbVar = (C52003hb) guVar.instance;
        string.getClass();
        hbVar.f136478a |= 1;
        hbVar.f136479b = string;
        guVar.copyOnWrite();
        C52003hb hbVar2 = (C52003hb) guVar.instance;
        hbVar2.f136480c = 1;
        hbVar2.f136478a |= 2;
        C52003hb hbVar3 = (C52003hb) guVar.build();
        C129245h hVar = (C129245h) C129246i.f355015d.createBuilder();
        hVar.copyOnWrite();
        C129246i iVar2 = (C129246i) hVar.instance;
        hbVar3.getClass();
        iVar2.f355018b = hbVar3;
        iVar2.f355017a |= 1;
        return C129244g.m211012f((AccountId) obj, (C129246i) hVar.build());
    }
}
