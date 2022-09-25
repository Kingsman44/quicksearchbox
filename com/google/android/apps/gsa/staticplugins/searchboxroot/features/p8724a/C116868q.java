package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import android.content.pm.ShortcutInfo;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.suggestion.C41660a;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41677c;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.q */
/* compiled from: PG */
public final /* synthetic */ class C116868q implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f324349a;

    /* renamed from: b */
    public final /* synthetic */ C41679e f324350b;

    /* renamed from: c */
    public final /* synthetic */ String f324351c;

    public /* synthetic */ C116868q(int i, C41679e eVar, String str) {
        this.f324349a = i;
        this.f324350b = eVar;
        this.f324351c = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = this.f324349a;
        C41679e eVar = this.f324350b;
        String str = this.f324351c;
        ShortcutInfo shortcutInfo = (ShortcutInfo) obj;
        CharSequence shortLabel = shortcutInfo.getShortLabel();
        shortLabel.getClass();
        C58485gu n = C58485gu.m89846n(475);
        Integer num = C41669ai.f108959h;
        int rank = (10 - shortcutInfo.getRank()) + i;
        C54228aq aqVar = C54228aq.f142328w;
        C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
        C41663ac acVar = eVar.f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        dVar.copyOnWrite();
        C41679e eVar2 = (C41679e) dVar.instance;
        acVar.getClass();
        eVar2.f109008b = acVar;
        eVar2.f109007a |= 2;
        C41660a aVar = (C41660a) C41677c.f108996h.createBuilder();
        aVar.copyOnWrite();
        C41677c cVar = (C41677c) aVar.instance;
        str.getClass();
        cVar.f108998a |= 2;
        cVar.f109001d = str;
        String id = shortcutInfo.getId();
        aVar.copyOnWrite();
        C41677c cVar2 = (C41677c) aVar.instance;
        id.getClass();
        cVar2.f108998a |= 8;
        cVar2.f109004g = id;
        C41677c cVar3 = (C41677c) aVar.build();
        dVar.copyOnWrite();
        C41679e eVar3 = (C41679e) dVar.instance;
        cVar3.getClass();
        eVar3.f109021o = cVar3;
        eVar3.f109007a |= 16384;
        return new RootSuggestion(shortLabel, 27, 173, n, BuildConfig.FLAVOR, num, rank, aqVar, (C41679e) dVar.build());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
