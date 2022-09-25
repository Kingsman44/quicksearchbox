package com.google.assistant.p3838ao.p3839a.p3842c;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.C49693s;
import com.google.assistant.p3838ao.p3839a.p3845e.C49531ao;
import com.google.assistant.p3838ao.p3839a.p3845e.C49534ar;
import com.google.assistant.p3838ao.p3839a.p3845e.C49539aw;
import com.google.assistant.p3838ao.p3839a.p3845e.C49542az;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.ba */
/* compiled from: PG */
final class C49473ba {
    /* renamed from: a */
    public static C58485gu m85529a(C49692r rVar, String str) {
        C49693s sVar = new C49693s();
        sVar.f128265a = Optional.ofNullable(str);
        sVar.f128269m = 6;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.nga.engine.stash.StashBroadcastReceiver"));
        intent.putExtra("chip_id", "add_stash");
        C49539aw awVar = (C49539aw) C49542az.f127827e.createBuilder();
        String uri = intent.toUri(1);
        awVar.copyOnWrite();
        C49542az azVar = (C49542az) awVar.instance;
        uri.getClass();
        azVar.f127829a |= 2;
        azVar.f127831c = uri;
        awVar.copyOnWrite();
        C49542az azVar2 = (C49542az) awVar.instance;
        azVar2.f127832d = 3;
        azVar2.f127829a |= 4;
        sVar.f128267k = Optional.ofNullable((C49542az) awVar.build());
        C49531ao aoVar = (C49531ao) C49534ar.f127808c.createBuilder();
        String s = rVar.mo53332s(R.drawable.ic_stash_add);
        aoVar.copyOnWrite();
        C49534ar arVar = (C49534ar) aoVar.instance;
        s.getClass();
        arVar.f127810a = 1;
        arVar.f127811b = s;
        sVar.f128268l = Optional.ofNullable((C49534ar) aoVar.build());
        return C58485gu.m89846n(sVar);
    }
}
