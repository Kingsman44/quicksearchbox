package com.google.android.apps.gsa.staticplugins.p7678cl.p7679a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.search.podcasts.p10601r.p10607e.C140977a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4225bm.p4226a.p4227a.C56109b;
import com.google.p4225bm.p4229c.C56113b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4757ac.p4758a.C63109h;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.a.a */
/* compiled from: PG */
public final class C97871a extends C19600b {

    /* renamed from: a */
    private static final C59071e f273285a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cl.a.a");

    /* renamed from: b */
    public final void mo24895b(Bundle bundle) {
        byte[] bArr;
        C74504a.m120462a(f.ba);
        this.f54539k.mo24861h(bundle);
        this.f54539k.setTitle(this.f54539k.getResources().getString(R.string.podcasts_legacy_player_activity_title));
        Intent b = this.f54539k.mo24853b();
        if (b == null || b.getExtras() == null) {
            this.f54539k.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C56109b.f149462g.f149464a)).setPackage(this.f54539k.getPackageName()));
            this.f54539k.mo24855e();
            return;
        }
        int i = 0;
        int intExtra = b.getIntExtra("podcastEntryPoint", 0);
        if (intExtra != 0) {
            i = intExtra;
        } else if (b.getBooleanExtra("launchedFromHomeScreen", false)) {
            i = 2;
        } else if (b.getBooleanExtra("launchedFromHomeScreenForHomeFeature", false)) {
            i = 1;
        } else if (b.getBooleanExtra("launchedFromOpa", false)) {
            i = 8;
        }
        C56113b bVar = C56113b.values()[i];
        Uri build = Uri.parse(C56109b.f149462g.f149464a).buildUpon().appendQueryParameter(C56109b.f149462g.f149465b, Integer.toString(bVar.f149497u)).build();
        if (bVar == C56113b.HOME_SCREEN_SHORTCUT_TO_SHOW || bVar == C56113b.AGSA_SRP_MORE_EPISODES || bVar == C56113b.AGSA_SRP_PLAY_EPISODE || bVar == C56113b.CHROME_SRP_MORE_EPISODES || bVar == C56113b.CHROME_SRP_PLAY_EPISODE || bVar == C56113b.NOTIFICATION || bVar == C56113b.OPA || bVar == C56113b.UI_TEST) {
            String stringExtra = b.getStringExtra("playerDataBase64");
            C63109h hVar = null;
            if (stringExtra != null) {
                try {
                    bArr = Base64.decode(stringExtra, 2);
                } catch (IllegalArgumentException e) {
                    ((C59052c) ((C59052c) ((C59052c) f273285a.mo56225c()).mo56382g(e)).mo56372aa(30366)).mo56386p("Error parsing player data");
                    bArr = null;
                }
            } else {
                bArr = b.getByteArrayExtra("playerData");
            }
            if (bArr != null) {
                try {
                    hVar = (C63109h) C62942bv.parseFrom((C62942bv) C63109h.f170342e, bArr);
                } catch (C62974ct e2) {
                    ((C59052c) ((C59052c) ((C59052c) f273285a.mo56225c()).mo56382g(e2)).mo56372aa(30363)).mo56386p("Error parsing player data");
                }
            }
            C58833ax axVar = C58836b.f156633a;
            if (hVar != null) {
                int intExtra2 = b.getIntExtra("episodeToPlay", -1);
                C58833ax k = (intExtra2 < 0 || intExtra2 >= hVar.f170346c.size()) ? axVar : C58833ax.m90834k(((C63111j) hVar.f170346c.get(intExtra2)).f170356g);
                if (b.hasExtra("episodeProgress")) {
                    axVar = C58833ax.m90834k(Long.valueOf(b.getLongExtra("episodeProgress", 0)));
                }
                C63113l lVar = hVar.f170345b;
                if (lVar == null) {
                    lVar = C63113l.f170365p;
                }
                if ((lVar.f170367a & 64) != 0) {
                    C63113l lVar2 = hVar.f170345b;
                    if (lVar2 == null) {
                        lVar2 = C63113l.f170365p;
                    }
                    Uri.Builder buildUpon = C140977a.m228932a(bVar, lVar2.f170373g, (String) k.mo56111f()).buildUpon();
                    if (axVar.mo56113h()) {
                        buildUpon.appendQueryParameter(C56109b.f149462g.f149468e, String.valueOf(axVar.mo56107c()));
                    }
                    if (k.mo56113h()) {
                        buildUpon.appendQueryParameter(C56109b.f149462g.f149469f, "1");
                    }
                    build = buildUpon.build();
                }
            }
        }
        this.f54539k.startActivity(new Intent("android.intent.action.VIEW", build).setPackage(this.f54539k.getPackageName()));
        this.f54539k.mo24855e();
    }
}
