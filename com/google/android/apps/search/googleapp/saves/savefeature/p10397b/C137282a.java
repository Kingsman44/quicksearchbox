package com.google.android.apps.search.googleapp.saves.savefeature.p10397b;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.googleapp.saves.savefeature.C137299g;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57567ak;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57642de;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57643df;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57662w;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57665z;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.b.a */
/* compiled from: PG */
public final class C137282a {
    /* renamed from: a */
    public static Intent m223047a(C137300h hVar, AccountId accountId) {
        Intent intent = new Intent();
        intent.addFlags(8454144);
        intent.setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.googleapp.saves.savefeature.activity.SaveActivity");
        ProtoParsers.m95531n(intent, "SAVE_FEATURE_ACTIVITY_ARGS", hVar);
        C45963aa.m82131a(intent, accountId);
        return intent;
    }

    /* renamed from: b */
    public static Intent m223048b(String str, Uri uri, int i, AccountId accountId) {
        C137299g gVar = (C137299g) C137300h.f373505h.createBuilder();
        C57665z zVar = C57665z.WEB_PAGE;
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373508b = zVar.getNumber();
        gVar.copyOnWrite();
        ((C137300h) gVar.instance).f373511e = i - 2;
        C57567ak akVar = (C57567ak) C57569am.f153797f.createBuilder();
        akVar.copyOnWrite();
        str.getClass();
        ((C57569am) akVar.instance).f153802d = str;
        C57642de deVar = (C57642de) C57643df.f153945e.createBuilder();
        String uri2 = uri.toString();
        deVar.copyOnWrite();
        uri2.getClass();
        ((C57643df) deVar.instance).f153947a = uri2;
        C57643df dfVar = (C57643df) deVar.build();
        akVar.copyOnWrite();
        C57569am amVar = (C57569am) akVar.instance;
        dfVar.getClass();
        amVar.f153800b = dfVar;
        amVar.f153799a = 9;
        C57662w wVar = (C57662w) C57663x.f153984d.createBuilder();
        C57665z zVar2 = C57665z.WEB_PAGE;
        wVar.copyOnWrite();
        ((C57663x) wVar.instance).f153988c = zVar2.getNumber();
        String uri3 = uri.toString();
        wVar.copyOnWrite();
        C57663x xVar = (C57663x) wVar.instance;
        uri3.getClass();
        xVar.f153986a = 4;
        xVar.f153987b = uri3;
        C57663x xVar2 = (C57663x) wVar.build();
        akVar.copyOnWrite();
        xVar2.getClass();
        ((C57569am) akVar.instance).f153801c = xVar2;
        C57569am amVar2 = (C57569am) akVar.build();
        gVar.copyOnWrite();
        amVar2.getClass();
        ((C137300h) gVar.instance).f373509c = amVar2;
        return m223047a((C137300h) gVar.build(), accountId);
    }
}
