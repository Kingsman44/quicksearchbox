package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80574h;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80575i;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80576j;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.t */
/* compiled from: PG */
final class C81593t extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ String f223181a;

    /* renamed from: b */
    final /* synthetic */ C80734di f223182b;

    /* renamed from: c */
    final /* synthetic */ C81596w f223183c;

    public C81593t(C81596w wVar, String str, C80734di diVar) {
        this.f223183c = wVar;
        this.f223181a = str;
        this.f223182b = diVar;
    }

    public final void onClick(View view) {
        if (TextUtils.isEmpty(this.f223181a)) {
            this.f223183c.f223190e.mo73552a(this.f223182b.mo74538a());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f223181a));
        C81564g gVar = this.f223183c.f223190e;
        C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
        C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        C80574h hVar = (C80574h) C80576j.f221168d.createBuilder();
        hVar.copyOnWrite();
        ((C80576j) hVar.instance).f221172c = C80575i.m128207a(3);
        String uri = intent.toUri(0);
        hVar.copyOnWrite();
        uri.getClass();
        ((C80576j) hVar.instance).f221170a = uri;
        C80576j jVar2 = (C80576j) hVar.build();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        jVar2.getClass();
        lVar.f221176b = jVar2;
        lVar.f221175a = 3;
        C80578l lVar2 = (C80578l) kVar.build();
        jVar.copyOnWrite();
        lVar2.getClass();
        ((C80865k) jVar.instance).f221812a = lVar2;
        C80865k kVar2 = (C80865k) jVar.build();
        eVar.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar.instance;
        kVar2.getClass();
        ajVar.f221754b = kVar2;
        ajVar.f221753a = 2;
        gVar.mo73552a((C80831aj) eVar.build());
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(C1878d.m5128a(this.f223183c.f223195j, R.color.nga_assist_finish_setup_promo_chip_disclaimer_text_link));
        textPaint.setUnderlineText(false);
    }
}
