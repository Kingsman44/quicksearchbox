package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80226bt;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80227bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80255j;
import com.google.android.apps.gsa.nga.shared.p6311ah.C80630a;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8054b.C103043b;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8054b.C103044c;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8054b.C103045d;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62940bt;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.h */
/* compiled from: PG */
final class C103090h implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C103092j f287732a;

    /* renamed from: b */
    final /* synthetic */ C103093k f287733b;

    public C103090h(C103093k kVar, C103092j jVar) {
        this.f287733b = kVar;
        this.f287732a = jVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C103093k.f287734a.mo56226d()).mo56382g(th)).mo56372aa(21411)).mo56386p("[NGA Pie] No data was returned from Geller for PIE_ASSISTANT_USAGE_STATS corpus.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        ZonedDateTime zonedDateTime;
        C58485gu guVar = (C58485gu) obj;
        C103093k kVar = this.f287733b;
        C103092j jVar = this.f287732a;
        if (!guVar.isEmpty()) {
            C80255j jVar2 = (C80255j) guVar.get(0);
            kVar.f287739f.mo79746e(C90126fx.f251339gu);
            boolean z = jVar2.f220189a;
            kVar.f287739f.mo79746e(C90126fx.f251395hx);
            boolean z2 = jVar2.f220190b;
            if (!kVar.f287739f.mo79746e(C90126fx.f251339gu) && !jVar2.f220189a) {
                return;
            }
            if (kVar.f287739f.mo79746e(C90126fx.f251395hx) || !jVar2.f220190b) {
                int a = (int) kVar.f287739f.mo79743a(C90126fx.f251624mN);
                int a2 = (int) kVar.f287739f.mo79743a(C90126fx.f251625mO);
                int a3 = ((int) kVar.f287739f.mo79743a(C90126fx.f251626mP)) * 1000;
                Instant ofEpochMilli = Instant.ofEpochMilli(kVar.f287735b.mo26870b());
                int i = C80630a.f221370a;
                ZonedDateTime atZone = ofEpochMilli.atZone(ZoneId.systemDefault());
                if (atZone.getHour() < a || (atZone.getHour() == a && atZone.getMinute() < a2)) {
                    zonedDateTime = atZone.withHour(a).withMinute(a2);
                } else {
                    zonedDateTime = atZone.plusDays(1).withHour(a).withMinute(a2);
                }
                long between = ChronoUnit.SECONDS.between(atZone, zonedDateTime);
                if (between < 0) {
                    ((C58970a) ((C58970a) C103093k.f287734a.mo56225c()).mo56372aa(21424)).mo56354G("[NGA Pie] Negative delaySeconds encountered. timeNow: %s, targetTime: %s", atZone, zonedDateTime);
                    return;
                }
                jVar.mo93600c();
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328824d = 1;
                agVar.f328821a |= 4;
                afVar.copyOnWrite();
                C118472ag agVar2 = (C118472ag) afVar.instance;
                agVar2.f328821a |= 2;
                agVar2.f328823c = (long) a3;
                afVar.copyOnWrite();
                C118472ag agVar3 = (C118472ag) afVar.instance;
                agVar3.f328821a |= 1;
                agVar3.f328822b = between * 1000;
                C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
                C62940bt btVar = C103045d.f287664a;
                C103043b bVar = (C103043b) C103044c.f287660c.createBuilder();
                C80226bt btVar2 = (C80226bt) C80227bu.f220106d.createBuilder();
                String c = jVar.mo93600c();
                btVar2.copyOnWrite();
                C80227bu buVar = (C80227bu) btVar2.instance;
                c.getClass();
                buVar.f220108a |= 1;
                buVar.f220109b = c;
                String str = (String) jVar.mo93599b().orElse(BuildConfig.FLAVOR);
                btVar2.copyOnWrite();
                C80227bu buVar2 = (C80227bu) btVar2.instance;
                str.getClass();
                buVar2.f220108a |= 2;
                buVar2.f220110c = str;
                C80227bu buVar3 = (C80227bu) btVar2.build();
                bVar.copyOnWrite();
                C103044c cVar = (C103044c) bVar.instance;
                buVar3.getClass();
                cVar.f287663b = buVar3;
                cVar.f287662a |= 1;
                ajVar.mo58885m(btVar, (C103044c) bVar.build());
                afVar.copyOnWrite();
                C118472ag agVar4 = (C118472ag) afVar.instance;
                C118476ak akVar = (C118476ak) ajVar.build();
                akVar.getClass();
                agVar4.f328827g = akVar;
                agVar4.f328821a |= 32;
                kVar.f287736c.mo103752c(C118522by.ASSISTANT_PIE_NOTIFICATION_TRIGGER_TASK);
                kVar.f287736c.mo103754e(C118522by.ASSISTANT_PIE_NOTIFICATION_TRIGGER_TASK, (C118472ag) afVar.build());
            }
        }
    }
}
