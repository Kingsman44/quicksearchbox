package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.C10325al;
import com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10272q;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p569e.C10376b;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.de */
/* compiled from: PG */
public final class C10372de implements C46440f {

    /* renamed from: b */
    private static final C59071e f35057b = C59071e.m91332i("com.google.android.apps.gsa.assistant.settings.features.appactions.de");

    /* renamed from: a */
    public final C10370dc f35058a;

    /* renamed from: c */
    private final Fragment f35059c;

    /* renamed from: d */
    private final C10325al f35060d;

    /* renamed from: e */
    private final C22871g f35061e;

    /* renamed from: f */
    private final C90021c f35062f;

    /* renamed from: g */
    private final C73812a f35063g;

    /* renamed from: h */
    private final C58881cr f35064h;

    /* renamed from: i */
    private final C58881cr f35065i;

    /* renamed from: j */
    private final C58881cr f35066j;

    /* renamed from: k */
    private final Consumer f35067k;

    public C10372de(C10325al alVar, C22871g gVar, C90021c cVar, C73812a aVar, C10370dc dcVar, Fragment fragment, C58881cr crVar, C58881cr crVar2, C58881cr crVar3, Consumer consumer) {
        this.f35059c = fragment;
        this.f35060d = alVar;
        this.f35058a = dcVar;
        this.f35062f = cVar;
        this.f35063g = aVar;
        this.f35061e = gVar;
        this.f35064h = crVar;
        this.f35065i = crVar2;
        this.f35066j = crVar3;
        this.f35067k = consumer;
    }

    /* renamed from: d */
    private final void m25326d(String str) {
        Snackbar.m79661q((Context) null, this.f35059c.getActivity().findViewById(16908290), str, 0).mo48343h();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
        Void voidR = (Void) obj;
        this.f35067k.accept(false);
        this.f35063g.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
        this.f35058a.mo18335a(Optional.empty(), Optional.empty(), false);
        m25326d(this.f35059c.getResources().getString(R.string.assistant_default_error_message));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        DataType$UpdateResult dataType$UpdateResult = (DataType$UpdateResult) obj2;
        this.f35067k.accept(false);
        int a = dataType$UpdateResult.mo18410a();
        if (a == 0) {
            C59104x b = f35057b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "UpdateShortcutsCB");
            ((C59052c) ((C59052c) b).mo56372aa(556)).mo56386p("Successfully updated the shortcut");
            this.f35063g.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SUCCESS);
            if (dataType$UpdateResult.mo18411b().isPresent() && ((Optional) this.f35065i.mo6453a()).isPresent()) {
                C49826ak akVar = ((C10273r) ((Optional) this.f35065i.mo6453a()).get()).f34821c;
                if (akVar == null) {
                    akVar = C49826ak.f129462q;
                }
                if (!((Optional) this.f35066j.mo6453a()).isPresent() || akVar.f129465b.size() <= 0) {
                    this.f35058a.mo18335a(Optional.empty(), Optional.empty(), true);
                    return;
                }
                C10370dc dcVar = this.f35058a;
                C49826ak akVar2 = ((C10273r) ((Optional) this.f35065i.mo6453a()).get()).f34821c;
                if (akVar2 == null) {
                    akVar2 = C49826ak.f129462q;
                }
                dcVar.mo18335a(Optional.m71637of((String) akVar2.f129465b.get(0)), ((Optional) this.f35064h.mo6453a()).map(C10369db.f35055a), true);
            }
        } else if (a != 1) {
            this.f35063g.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
            this.f35058a.mo18335a(Optional.empty(), Optional.empty(), false);
            m25326d(this.f35059c.getResources().getString(R.string.assistant_default_error_message));
        } else {
            this.f35063g.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SERVER_ERROR);
            this.f35058a.mo18335a(Optional.empty(), Optional.empty(), false);
            if (dataType$UpdateResult.mo18412c() != 6 || !((Optional) this.f35065i.mo6453a()).isPresent()) {
                m25326d(this.f35059c.getResources().getString(R.string.assistant_default_error_message));
                return;
            }
            C10273r rVar = (C10273r) ((Optional) this.f35065i.mo6453a()).get();
            C10272q qVar = (C10272q) C10273r.f34817e.createBuilder();
            C49838aw awVar = rVar.f34820b;
            if (awVar == null) {
                awVar = C49838aw.f129504g;
            }
            qVar.copyOnWrite();
            C10273r rVar2 = (C10273r) qVar.instance;
            awVar.getClass();
            rVar2.f34820b = awVar;
            rVar2.f34819a |= 1;
            C49826ak akVar3 = rVar.f34821c;
            if (akVar3 == null) {
                akVar3 = C49826ak.f129462q;
            }
            qVar.copyOnWrite();
            C10273r rVar3 = (C10273r) qVar.instance;
            akVar3.getClass();
            rVar3.f34821c = akVar3;
            rVar3.f34819a |= 2;
            long j = rVar.f34822d;
            qVar.copyOnWrite();
            C10273r rVar4 = (C10273r) qVar.instance;
            rVar4.f34819a |= 4;
            rVar4.f34822d = j;
            new C10376b(this.f35059c.getActivity(), this.f35059c.getContext(), this.f35060d, this.f35061e, (C10273r) qVar.build(), this.f35062f, new C10371dd(this)).e();
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
        Void voidR = (Void) obj;
        this.f35067k.accept(true);
    }
}
