package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126992m;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129245h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129246i;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.ae */
/* compiled from: PG */
public final /* synthetic */ class C129348ae implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C129348ae f355239a = new C129348ae();

    private /* synthetic */ C129348ae() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C126992m mVar;
        AccountId accountId = (AccountId) obj;
        C126988i iVar = (C126988i) obj2;
        C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
        if (iVar.f349674d == 7) {
            mVar = (C126992m) iVar.f349675e;
        } else {
            mVar = C126992m.f349681d;
        }
        String str = mVar.f349685c;
        guVar.copyOnWrite();
        C52003hb hbVar = (C52003hb) guVar.instance;
        str.getClass();
        hbVar.f136478a |= 1;
        hbVar.f136479b = str;
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
        return C129244g.m211012f(accountId, (C129246i) hVar.build());
    }
}
