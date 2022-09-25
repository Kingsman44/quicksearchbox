package com.google.android.apps.gsa.sidekick.main.notifications.p7222b;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7000au.p7002b.C89291a;
import com.google.android.apps.gsa.sidekick.main.notifications.C91529c;
import com.google.android.apps.gsa.sidekick.main.notifications.C91530d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.p375ai.p378b.C7758iw;
import com.google.p375ai.p378b.C7759ix;
import com.google.p375ai.p378b.C7760iy;
import p3186j$.util.StringJoiner;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.b.a */
/* compiled from: PG */
public final class C91513a {

    /* renamed from: a */
    public final Context f255247a;

    /* renamed from: b */
    public final C86124t f255248b;

    /* renamed from: c */
    public final C89291a f255249c;

    public C91513a(Context context, C86124t tVar, C89291a aVar) {
        this.f255247a = context;
        this.f255248b = tVar;
        this.f255249c = aVar;
    }

    /* renamed from: a */
    public final RemoteViews mo85856a(C91530d dVar, C58495hd hdVar) {
        C7759ix ixVar;
        C7760iy iyVar = C91529c.m149710b(dVar).f27586H;
        if (iyVar == null) {
            iyVar = C7760iy.f27173c;
        }
        if (iyVar.f27175a == 1) {
            ixVar = (C7759ix) iyVar.f27176b;
        } else {
            ixVar = C7759ix.f27166f;
        }
        RemoteViews remoteViews = new RemoteViews(this.f255247a.getPackageName(), R.layout.cricket_mini_scorecard_template);
        C7758iw iwVar = ixVar.f27171d;
        if (iwVar == null) {
            iwVar = C7758iw.f27160d;
        }
        remoteViews.setTextViewText(R.id.first_team_main_score, iwVar.f27162a);
        C7758iw iwVar2 = ixVar.f27172e;
        if (iwVar2 == null) {
            iwVar2 = C7758iw.f27160d;
        }
        remoteViews.setTextViewText(R.id.second_team_main_score, iwVar2.f27162a);
        C7758iw iwVar3 = ixVar.f27171d;
        if (iwVar3 == null) {
            iwVar3 = C7758iw.f27160d;
        }
        remoteViews.setTextViewText(R.id.first_team_minor_score, iwVar3.f27163b);
        C7758iw iwVar4 = ixVar.f27172e;
        if (iwVar4 == null) {
            iwVar4 = C7758iw.f27160d;
        }
        remoteViews.setTextViewText(R.id.second_team_minor_score, iwVar4.f27163b);
        remoteViews.setImageViewBitmap(R.id.first_team_logo, (Bitmap) hdVar.get(C91515c.CRICKET_MINI_SCORECARD_FIRST_TEAM_LOGO));
        remoteViews.setImageViewBitmap(R.id.second_team_logo, (Bitmap) hdVar.get(C91515c.CRICKET_MINI_SCORECARD_SECOND_TEAM_LOGO));
        StringJoiner stringJoiner = new StringJoiner(System.lineSeparator());
        CharSequence D = dVar.mo85872D(this.f255247a);
        if (!TextUtils.isEmpty(D)) {
            stringJoiner.add(D);
        }
        CharSequence C = dVar.mo85871C(this.f255247a);
        if (!TextUtils.isEmpty(C)) {
            stringJoiner.add(C);
        }
        remoteViews.setContentDescription(R.id.mini_scorecard, stringJoiner.toString());
        return remoteViews;
    }
}
