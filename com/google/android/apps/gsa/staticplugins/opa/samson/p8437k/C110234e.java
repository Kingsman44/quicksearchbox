package com.google.android.apps.gsa.staticplugins.opa.samson.p8437k;

import android.accounts.Account;
import android.app.AlarmManager;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateUtils;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.ce;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.C110042b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8419b.p8420a.C110045b;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8446q.C110398b;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114806bc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114807bd;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114808be;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114809bf;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114816bm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114883o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16921b;
import com.google.android.libraries.assistant.p1356b.p1359b.p1360a.C16925f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.k.e */
/* compiled from: PG */
public final class C110234e extends C16921b {

    /* renamed from: a */
    public static final C59071e f307176a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.k.e");

    /* renamed from: b */
    public final C110398b f307177b;

    /* renamed from: c */
    public final C86124t f307178c;

    /* renamed from: d */
    private final C16925f f307179d;

    /* renamed from: e */
    private final C110042b f307180e;

    /* renamed from: f */
    private final ce f307181f;

    /* renamed from: g */
    private final C68214a f307182g;

    /* renamed from: h */
    private final C114809bf f307183h;

    /* renamed from: i */
    private final C22871g f307184i;

    /* renamed from: j */
    private final bm f307185j;

    /* renamed from: k */
    private C60870cx f307186k;

    /* renamed from: l */
    private final C110045b f307187l;

    public C110234e(C16925f fVar, C110398b bVar, C110042b bVar2, ce ceVar, C110045b bVar3, C68214a aVar, C86124t tVar, C114809bf bfVar, C22871g gVar, bm bmVar) {
        this.f307179d = fVar;
        bVar3.f306611c = new WeakReference(fVar);
        this.f307177b = bVar;
        this.f307180e = bVar2;
        this.f307181f = ceVar;
        this.f307187l = bVar3;
        this.f307182g = aVar;
        this.f307178c = tVar;
        this.f307183h = bfVar;
        this.f307184i = gVar;
        this.f307185j = bmVar;
    }

    /* renamed from: e */
    private final void m183551e() {
        try {
            C60870cx cxVar = this.f307186k;
            if (cxVar != null) {
                cxVar.cancel(true);
                this.f307186k = null;
            }
        } catch (Exception e) {
            C59104x c = f307176a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AmBinderSess");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25887)).mo56386p("cancelFetchChipItems() failed");
        }
    }

    /* renamed from: a */
    public final void mo23086a(Bundle bundle) {
        m183551e();
    }

    /* renamed from: b */
    public final void mo23087b(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        byte[] byteArray = bundle.getByteArray("EXTRA_VE_IMPRESSION_PROTO");
        if (byteArray != null) {
            try {
                C89949q.m146521e((C60321oe) C62942bv.parseFrom((C62942bv) C60321oe.f163224i, byteArray), false);
            } catch (C62974ct e) {
                C59104x c = f307176a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AmBinderSess");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25889)).mo56386p("invalid proto given to logImpression");
            }
        }
    }

    /* renamed from: c */
    public final void mo23088c(Bundle bundle) {
        C60870cx cxVar;
        ArrayList arrayList;
        Account a = ((C86054o) this.f307182g.mo27525b()).mo79668a();
        if (!this.f307181f.b(getCallingUid(), C110235f.f307189b)) {
            C59104x d = f307176a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AmBinderSess");
            ((C59052c) ((C59052c) d).mo56372aa(25894)).mo56386p("Caller not whitelisted");
            mo98492d(new Bundle());
        } else if (a == null) {
            C59104x d2 = f307176a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AmBinderSess");
            ((C59052c) ((C59052c) d2).mo56372aa(25893)).mo56386p("No account.");
            mo98492d(new Bundle());
        } else if (!this.f307185j.u()) {
            C58976aa aaVar = C58975e.f156826a;
            mo98492d(new Bundle());
        } else if (!this.f307187l.mo98332a(a.name)) {
            C58976aa aaVar2 = C58975e.f156826a;
            mo98492d(new Bundle());
        } else {
            C58976aa aaVar3 = C58975e.f156826a;
            m183551e();
            if (this.f307178c.mo79746e(C90014bt.f247845u)) {
                C22871g gVar = this.f307184i;
                C114809bf bfVar = this.f307183h;
                C60870cx i = C60856cj.m92900i(new ArrayList());
                bfVar.f318573g = bfVar.f318568b.mo26870b();
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(bfVar.f318573g);
                int i2 = instance.get(11);
                if (i2 >= 4 && i2 < 10) {
                    ArrayList arrayList2 = new ArrayList();
                    long a2 = bfVar.mo101608a(4, false);
                    long a3 = bfVar.mo101608a(10, false);
                    C22871g gVar2 = bfVar.f318571e;
                    C60870cx f = C60856cj.m92897f(((C114816bm) bfVar.f318569c.mo27525b()).mo101624b(0), ((C114816bm) bfVar.f318569c.mo27525b()).mo101624b(1), ((C114816bm) bfVar.f318569c.mo27525b()).mo101624b(2));
                    C114807bd bdVar = r3;
                    C114807bd bdVar2 = new C114807bd(bfVar, a2, arrayList2, a3);
                    i = gVar2.mo28209i(f, "getMorningChipUsage", bdVar);
                } else if (i2 >= 10 && i2 < 17) {
                    i = C60856cj.m92900i(new ArrayList());
                } else if (i2 >= 17 && i2 < 20) {
                    ArrayList arrayList3 = new ArrayList();
                    long a4 = bfVar.mo101608a(20, false);
                    C114883o oVar = new C114883o();
                    oVar.mo101614f(3);
                    oVar.mo101612d(bfVar.f318567a.getString(R.string.play_music));
                    oVar.mo101613e(a4);
                    arrayList3.add(oVar.mo101616h());
                    i = C60856cj.m92900i(arrayList3);
                } else if (i2 >= 20 || i2 <= 0) {
                    ArrayList arrayList4 = new ArrayList();
                    long a5 = bfVar.mo101608a(20, false);
                    long a6 = bfVar.mo101608a(1, true);
                    AlarmManager.AlarmClockInfo nextAlarmClock = ((AlarmManager) bfVar.f318570d.mo27525b()).getNextAlarmClock();
                    if (nextAlarmClock != null) {
                        AlarmManager.AlarmClockInfo alarmClockInfo = nextAlarmClock;
                        ArrayList arrayList5 = arrayList4;
                        if (nextAlarmClock.getTriggerTime() - bfVar.f318573g > TimeUnit.DAYS.toMillis(1)) {
                            arrayList = arrayList5;
                        } else {
                            C114883o oVar2 = new C114883o();
                            oVar2.mo101614f(4);
                            Context context = bfVar.f318567a;
                            oVar2.mo101612d(context.getString(R.string.alarm_detail, new Object[]{DateUtils.formatDateTime(context, alarmClockInfo.getTriggerTime(), 1)}));
                            oVar2.mo101615g(bfVar.f318567a.getString(R.string.view_alarm));
                            oVar2.mo101613e(a6);
                            arrayList = arrayList5;
                            arrayList.add(oVar2.mo101616h());
                            C114883o oVar3 = new C114883o();
                            oVar3.mo101614f(6);
                            oVar3.mo101612d(bfVar.f318567a.getString(R.string.play_night_songs));
                            oVar3.mo101613e(a6);
                            arrayList.add(oVar3.mo101616h());
                            i = bfVar.f318571e.mo28209i(((C114816bm) bfVar.f318569c.mo27525b()).mo101624b(5), "getNightChipUsage", new C114808be(bfVar, a5, arrayList, a6));
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                    C114883o oVar4 = new C114883o();
                    oVar4.mo101614f(4);
                    oVar4.mo101612d(bfVar.f318567a.getString(R.string.set_alarm));
                    oVar4.mo101613e(a6);
                    arrayList.add(oVar4.mo101616h());
                    C114883o oVar32 = new C114883o();
                    oVar32.mo101614f(6);
                    oVar32.mo101612d(bfVar.f318567a.getString(R.string.play_night_songs));
                    oVar32.mo101613e(a6);
                    arrayList.add(oVar32.mo101616h());
                    i = bfVar.f318571e.mo28209i(((C114816bm) bfVar.f318569c.mo27525b()).mo101624b(5), "getNightChipUsage", new C114808be(bfVar, a5, arrayList, a6));
                }
                cxVar = gVar.mo28209i(bfVar.f318571e.mo28209i(i, "getSuggestionChipsForAoD", new C114806bc(bfVar)), "amb-bind-sess-fetch-chip", C110232c.f307174a);
            } else {
                ArrayList arrayList6 = new ArrayList();
                for (String str : this.f307180e.mo98331a()) {
                    C114883o oVar5 = new C114883o();
                    oVar5.mo101615g(str);
                    oVar5.mo101612d(str);
                    oVar5.mo101614f(-1);
                    oVar5.mo101613e(Long.MAX_VALUE);
                    arrayList6.add(oVar5.mo101616h());
                }
                cxVar = C60856cj.m92900i(arrayList6);
            }
            this.f307186k = cxVar;
            this.f307184i.mo28211k(cxVar, "amb-bind-sess-fetch-ui-bundle", new C110233d(this));
        }
    }

    /* renamed from: d */
    public final void mo98492d(Bundle bundle) {
        try {
            C16925f fVar = (C16925f) this.f307187l.f306611c.get();
            C16925f fVar2 = this.f307179d;
            if (fVar == fVar2) {
                fVar2.mo23089a(bundle);
            }
        } catch (Exception e) {
            C59104x c = f307176a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AmBinderSess");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25895)).mo56386p("updateAmbientUiData() failed");
        }
    }
}
