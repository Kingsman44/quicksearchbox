package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53308jb;
import com.google.assistant.p3994s.p3995a.C53435nu;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.m */
/* compiled from: PG */
public final class C16697m {
    /* renamed from: a */
    public static C16649n m33769a(C53435nu nuVar) {
        C16649n nVar = (C16649n) C16654s.f48773e.createBuilder();
        C16650o oVar = (C16650o) C16651p.f48768c.createBuilder();
        C51012dc dcVar = nuVar.f140244i;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        String str = dcVar.f132817c;
        oVar.copyOnWrite();
        C16651p pVar = (C16651p) oVar.instance;
        str.getClass();
        pVar.f48770a = 1;
        pVar.f48771b = str;
        nVar.copyOnWrite();
        C16654s sVar = (C16654s) nVar.instance;
        C16651p pVar2 = (C16651p) oVar.build();
        pVar2.getClass();
        sVar.f48777c = pVar2;
        sVar.f48775a |= 2;
        return nVar;
    }

    /* renamed from: b */
    public static C16743bd m33770b(C53435nu nuVar) {
        C16743bd bdVar = (C16743bd) C16744be.f48963e.createBuilder();
        C16769s sVar = (C16769s) C16770t.f49073f.createBuilder();
        String str = nuVar.f140237b == 5 ? (String) nuVar.f140238c : BuildConfig.FLAVOR;
        sVar.copyOnWrite();
        C16770t tVar = (C16770t) sVar.instance;
        str.getClass();
        tVar.f49076b = 1;
        tVar.f49077c = str;
        bdVar.copyOnWrite();
        C16744be beVar = (C16744be) bdVar.instance;
        C16770t tVar2 = (C16770t) sVar.build();
        tVar2.getClass();
        beVar.f48966b = tVar2;
        beVar.f48965a |= 1;
        C16747bh bhVar = (C16747bh) C16748bi.f48976c.createBuilder();
        C53308jb jbVar = nuVar.f140246k;
        if (jbVar == null) {
            jbVar = C53308jb.f139794f;
        }
        int i = jbVar.f139799d;
        bhVar.copyOnWrite();
        C16748bi biVar = (C16748bi) bhVar.instance;
        biVar.f48978a |= 1;
        biVar.f48979b = i;
        bdVar.copyOnWrite();
        C16744be beVar2 = (C16744be) bdVar.instance;
        C16748bi biVar2 = (C16748bi) bhVar.build();
        biVar2.getClass();
        beVar2.f48968d = biVar2;
        beVar2.f48965a |= 4;
        return bdVar;
    }
}
