package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126988i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9525b.C126998s;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129245h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129246i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.p3926e.C51995gu;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.ac */
/* compiled from: PG */
public final /* synthetic */ class C129346ac implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ Context f355237a;

    public /* synthetic */ C129346ac(Context context) {
        this.f355237a = context;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        Context context = this.f355237a;
        AccountId accountId = (AccountId) obj;
        C126988i iVar = (C126988i) obj2;
        String string = context.getString(R.string.assistant_generic_error);
        if (iVar.f349672b == 3) {
            C126998s a = C126998s.m207732a(((Integer) iVar.f349673c).intValue());
            if (a == null) {
                a = C126998s.TIMEOUT_UNKNOWN_REASON;
            }
            if (a == C126998s.TIMEOUT_DURING_SPEECH) {
                string = context.getString(R.string.assistant_timeout_during_speech);
            }
        }
        C51995gu guVar = (C51995gu) C52003hb.f136476i.createBuilder();
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
        return C129244g.m211012f(accountId, (C129246i) hVar.build());
    }
}
