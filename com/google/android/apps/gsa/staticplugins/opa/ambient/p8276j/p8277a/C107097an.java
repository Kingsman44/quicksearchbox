package com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.p8277a;

import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83785c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8276j.C107082a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.common.base.C58827ar;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.j.a.an */
/* compiled from: PG */
public final class C107097an implements C107082a {

    /* renamed from: a */
    public static final C58528ij f298157a = C58528ij.m90015O(C50701am.DEBUG, C50701am.HOME_CONTROLS, C50701am.PLAY_MEDIA, C50701am.RIDESHARE, C50701am.SHOPPING_LIST, C50701am.AT_TRANSIT_STOP, C50701am.RESTAURANT_CONTEXT, C50701am.RESTAURANT_DEEPLINK, C50701am.ORDER_COFFEE, C50701am.SET_ALARM, C50701am.QUERY_SONG, C50701am.HOME_CONTEXT, C50701am.HEADPHONE_CONTEXT, C50701am.WEATHER_TODAY, C50701am.WEATHER_NEXT_DAY, C50701am.AGENDA_TODAY, C50701am.AGENDA_NEXT_DAY, C50701am.NEXT_STOP_COMMUTE, C50701am.NIGHT_SOUNDS, C50701am.DO_NOT_DISTURB, C50701am.STORE_CONTEXT, C50701am.APP_SUGGESTIONS, C50701am.LOYALTY_CARD, C50701am.GAS_STATION_PAYMENT, C50701am.TV_REMOTE, C50701am.NAVIGATE_TO, C50701am.FREQ_HOME_QUERIES, C50701am.PARKING_PAYMENT, C50701am.LOCATION_FEEDBACK, C50701am.BLOCKING_BT_DEVICES, C50701am.WORK_CONTEXT, C50701am.TURN_OFF_FLASHLIGHT, C50701am.PLAY_MEDIA_ACTIVE, C50701am.ADJUST_ALARM, C50701am.DRIVE_MODE, C50701am.MEDIA_HEADS_UP);

    /* renamed from: b */
    public static final C58528ij f298158b = C58528ij.m90013M(C50701am.PLAY_MEDIA, C50701am.HEADPHONE_CONTEXT, C50701am.PLAY_MEDIA_ACTIVE, C50701am.DRIVE_MODE);

    /* renamed from: c */
    public final C58974d f298159c;

    /* renamed from: d */
    public final C83785c f298160d;

    /* renamed from: e */
    public final C60887da f298161e;

    /* renamed from: f */
    public final C39141kp f298162f;

    /* renamed from: g */
    public final C21370a f298163g;

    /* renamed from: h */
    private final C86124t f298164h;

    /* renamed from: i */
    private final C60887da f298165i;

    public C107097an(C83785c cVar, C86124t tVar, C60887da daVar, C60887da daVar2, C83564a aVar, C39141kp kpVar, C21370a aVar2) {
        this.f298160d = cVar;
        this.f298164h = tVar;
        this.f298165i = daVar;
        this.f298161e = daVar2;
        this.f298159c = aVar.mo76900a("AA.ChipSurface");
        this.f298162f = kpVar;
        this.f298163g = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo95785a(C106596h hVar, C58485gu guVar) {
        C58485gu guVar2;
        if (this.f298164h.mo79746e(C90017bw.f247969be)) {
            guVar2 = (C58485gu) Collection.EL.stream(guVar).filter(C107121x.f298197a).collect(C58370cn.f155946a);
        } else {
            guVar2 = C58485gu.m89842j(guVar);
        }
        C58528ij ijVar = (C58528ij) Stream.CC.concat(Collection.EL.stream(guVar2).filter(C107089af.f298148a).limit(1), Collection.EL.stream(guVar2).filter(C107090ag.f298149a)).collect(C58370cn.f155947b);
        C58528ij ijVar2 = (C58528ij) Collection.EL.stream(ijVar).map(C107122y.f298198a).collect(C58370cn.f155947b);
        ((C58970a) ((C58970a) this.f298159c.mo56224b()).mo56372aa(23501)).mo56354G("set() chips:%s filtered:%s", Collection.EL.stream(ijVar).map(C107122y.f298198a).collect(Collectors.joining(",")), new C58827ar(",").mo56097d(ijVar2));
        C83785c cVar = this.f298160d;
        C58836b bVar = C58836b.f156633a;
        C60870cx c = cVar.mo77121c(bVar, bVar);
        C107123z zVar = C107123z.f298199a;
        C60870cx g = C60922j.m93044g(c, C47810es.m84963c(zVar), this.f298165i);
        C80905at.m128763g(g, new C107084aa(this));
        C107085ab abVar = new C107085ab(this, ijVar2, hVar, ijVar);
        return C60922j.m93045h(g, C47810es.m84966f(abVar), this.f298165i);
    }
}
