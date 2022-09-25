package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16632ad;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16633ae;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16636ah;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16643h;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16644i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16645j;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16646k;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16649n;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16650o;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16651p;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16654s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a.C16661z;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16743bd;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16744be;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16747bh;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16748bi;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16769s;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16770t;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.aq */
/* compiled from: PG */
enum C16684aq {
    DIRECTIONS("start navigation", "Directions", R.drawable.quantum_gm_ic_place_gm_grey200_24, 144307),
    MUSIC("play my music", "Music", R.drawable.quantum_gm_ic_music_cast_gm_grey200_24, 149799),
    MESSAGE("send a message", "Messages", R.drawable.quantum_ic_message_white_24, 144306);
    

    /* renamed from: d */
    final String f48846d;

    /* renamed from: e */
    final String f48847e;

    /* renamed from: f */
    final int f48848f;

    /* renamed from: g */
    final int f48849g;

    private C16684aq(String str, String str2, int i, int i2) {
        this.f48846d = str;
        this.f48847e = str2;
        this.f48849g = i2;
        this.f48848f = i;
    }

    /* renamed from: c */
    private final C16649n m33747c() {
        C16649n nVar = (C16649n) C16654s.f48773e.createBuilder();
        C16650o oVar = (C16650o) C16651p.f48768c.createBuilder();
        int i = this.f48848f;
        oVar.copyOnWrite();
        C16651p pVar = (C16651p) oVar.instance;
        pVar.f48770a = 2;
        pVar.f48771b = Integer.valueOf(i);
        nVar.copyOnWrite();
        C16654s sVar = (C16654s) nVar.instance;
        C16651p pVar2 = (C16651p) oVar.build();
        pVar2.getClass();
        sVar.f48777c = pVar2;
        sVar.f48775a |= 2;
        return nVar;
    }

    /* renamed from: d */
    private final C16743bd m33748d() {
        C16743bd bdVar = (C16743bd) C16744be.f48963e.createBuilder();
        C16769s sVar = (C16769s) C16770t.f49073f.createBuilder();
        String str = this.f48846d;
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
        int i = this.f48849g;
        bhVar.copyOnWrite();
        C16748bi biVar = (C16748bi) bhVar.instance;
        biVar.f48978a = 1 | biVar.f48978a;
        biVar.f48979b = i;
        bdVar.copyOnWrite();
        C16744be beVar2 = (C16744be) bdVar.instance;
        C16748bi biVar2 = (C16748bi) bhVar.build();
        biVar2.getClass();
        beVar2.f48968d = biVar2;
        beVar2.f48965a |= 4;
        return bdVar;
    }

    /* renamed from: a */
    public final C16644i mo22977a() {
        C16643h hVar = (C16643h) C16644i.f48739j.createBuilder();
        C16743bd d = m33748d();
        hVar.copyOnWrite();
        C16644i iVar = (C16644i) hVar.instance;
        C16744be beVar = (C16744be) d.build();
        beVar.getClass();
        iVar.f48748h = beVar;
        iVar.f48741a |= 256;
        hVar.copyOnWrite();
        C16644i iVar2 = (C16644i) hVar.instance;
        iVar2.f48741a |= 128;
        iVar2.f48747g = true;
        String str = this.f48847e;
        hVar.copyOnWrite();
        C16644i iVar3 = (C16644i) hVar.instance;
        str.getClass();
        iVar3.f48741a |= 2;
        iVar3.f48743c = str;
        C16633ae aeVar = (C16633ae) C16636ah.f48726c.createBuilder();
        aeVar.copyOnWrite();
        C16636ah ahVar = (C16636ah) aeVar.instance;
        ahVar.f48729b = 3;
        ahVar.f48728a |= 1;
        hVar.copyOnWrite();
        C16644i iVar4 = (C16644i) hVar.instance;
        C16636ah ahVar2 = (C16636ah) aeVar.build();
        ahVar2.getClass();
        iVar4.f48744d = ahVar2;
        iVar4.f48741a |= 4;
        C16649n c = m33747c();
        hVar.copyOnWrite();
        C16644i iVar5 = (C16644i) hVar.instance;
        C16654s sVar = (C16654s) c.build();
        sVar.getClass();
        iVar5.f48742b = sVar;
        iVar5.f48741a |= 1;
        return (C16644i) hVar.build();
    }

    /* renamed from: b */
    public final C16646k mo22978b() {
        C16645j jVar = (C16645j) C16646k.f48751g.createBuilder();
        C16743bd d = m33748d();
        jVar.copyOnWrite();
        C16646k kVar = (C16646k) jVar.instance;
        C16744be beVar = (C16744be) d.build();
        beVar.getClass();
        kVar.f48757e = beVar;
        kVar.f48753a |= 8;
        C16661z zVar = (C16661z) C16632ad.f48719e.createBuilder();
        String str = this.f48847e;
        zVar.copyOnWrite();
        C16632ad adVar = (C16632ad) zVar.instance;
        str.getClass();
        adVar.f48722b = 1;
        adVar.f48723c = str;
        jVar.copyOnWrite();
        C16646k kVar2 = (C16646k) jVar.instance;
        C16632ad adVar2 = (C16632ad) zVar.build();
        adVar2.getClass();
        kVar2.f48754b = adVar2;
        kVar2.f48753a |= 1;
        C16649n c = m33747c();
        jVar.copyOnWrite();
        C16646k kVar3 = (C16646k) jVar.instance;
        C16654s sVar = (C16654s) c.build();
        sVar.getClass();
        kVar3.f48756d = sVar;
        kVar3.f48753a |= 4;
        return (C16646k) jVar.build();
    }
}
