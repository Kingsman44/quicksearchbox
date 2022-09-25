package com.google.android.libraries.assistant.auto.ondevice.p708b;

import com.google.android.apps.gsa.g.b.a;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11932a;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11945h;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11946i;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11947j;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11948k;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52638zd;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protos.p4850an.C63595f;
import com.google.protos.p4850an.p4855d.p4856a.C63468u;
import com.google.protos.p4850an.p4855d.p4856a.C63469v;
import com.google.protos.p4850an.p4855d.p4856a.C63473z;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.speech.grammar.pumpkin.C66525q;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.ae */
/* compiled from: PG */
public final class C11843ae implements a {

    /* renamed from: d */
    private static final C58974d f38073d = C58974d.m91134h("OfflineTTRBuilder");

    /* renamed from: a */
    C64782b f38074a;

    /* renamed from: b */
    int f38075b = 0;

    /* renamed from: c */
    boolean f38076c;

    /* renamed from: e */
    private final b f38077e;

    /* renamed from: f */
    private final SemanticsBuilderUtil f38078f;

    /* renamed from: g */
    private final C11947j f38079g;

    /* renamed from: h */
    private final C86124t f38080h;

    /* renamed from: i */
    private final C68214a f38081i;

    /* renamed from: j */
    private boolean f38082j = false;

    /* renamed from: k */
    private final C9309a f38083k;

    public C11843ae(b bVar, SemanticsBuilderUtil semanticsBuilderUtil, C11947j jVar, C9309a aVar, C86124t tVar, C68214a aVar2) {
        this.f38077e = bVar;
        this.f38078f = semanticsBuilderUtil;
        this.f38074a = C64782b.f175579d;
        this.f38079g = jVar;
        this.f38083k = aVar;
        this.f38080h = tVar;
        this.f38081i = aVar2;
    }

    /* renamed from: d */
    private final List m27542d(aco aco) {
        C51809dy dyVar;
        this.f38074a = C11945h.m27778c("search.MESSAGE", C58485gu.m89845m());
        ArrayList arrayList = new ArrayList();
        if (aco != null) {
            arrayList.add(C11932a.m27749b(aet.ALTERNATIVE, true));
        }
        if (aco == null) {
            C9309a aVar = this.f38083k;
            dyVar = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.repeat_notification));
        } else {
            C9309a aVar2 = this.f38083k;
            dyVar = C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.read_ttr_notification, new Object[]{aco.f134825c, aco.f134827e}));
        }
        if (dyVar != null) {
            arrayList.add(dyVar);
        } else {
            ((C58970a) ((C58970a) f38073d.mo56226d()).mo56372aa(43699)).mo56386p("Sender and app info could not be retrieved.");
        }
        arrayList.add(C11932a.m27752e(0));
        int i = true != this.f38076c ? R.string.final_notification_no_reply_prompt : R.string.final_notification_prompt;
        C9309a aVar3 = this.f38083k;
        C51809dy a = C15669a.m32462a(aVar3.mo17491a(aVar3.f32300b).getString(i));
        a.getClass();
        arrayList.add(a);
        arrayList.add(C11932a.m27751d());
        return arrayList;
    }

    /* renamed from: e */
    private final void m27543e() {
        this.f38082j = false;
        this.f38074a = C64782b.f175579d;
        this.f38075b = 0;
        this.f38079g.mo20321e();
        this.f38076c = false;
    }

    /* renamed from: f */
    private final void m27544f(C63473z zVar) {
        boolean z = true;
        if (!this.f38079g.mo20322f(zVar) && !C11947j.m27796h(zVar)) {
            z = false;
        }
        this.f38082j = z;
    }

    /* renamed from: g */
    private final boolean m27545g() {
        return !this.f38080h.mo79746e(C90086ek.f250510h);
    }

    /* renamed from: a */
    public final C58833ax mo20205a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C60870cx mo20206b(C66525q qVar, Query query) {
        C58485gu guVar;
        C51809dy dyVar;
        C58485gu guVar2;
        C58485gu guVar3;
        C63473z zVar;
        C63469v vVar;
        List list;
        if (qVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!this.f38077e.f()) {
            m27543e();
        }
        C58833ax a = this.f38078f.mo20311a(qVar, C11948k.m27806b(this.f38079g.mo20323g() ? this.f38079g.f38381a : this.f38074a));
        if (a.mo56113h()) {
            C63595f fVar = (C63595f) a.mo56107c();
            String str = qVar.f180932b;
            if (this.f38079g.mo20323g() && C11946i.m27795b(this.f38079g.f38381a)) {
                guVar2 = C58485gu.m89842j(this.f38079g.mo20320d(C11946i.m27794a(query)));
            } else if (str.equals("SearchMessageFollowOn") && (vVar = (C63469v) C15669a.m32464c(fVar, C63469v.f171519d)) != null && (vVar.f171521a & 32) != 0) {
                int a2 = C63468u.m96241a(vVar.f171522b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i = a2 - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 4) {
                            this.f38082j = true;
                            list = new ArrayList();
                            C9309a aVar = this.f38083k;
                            C51809dy a3 = C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.okay_notification));
                            a3.getClass();
                            list.add(a3);
                            if (this.f38080h.mo79746e(C90086ek.f250253E)) {
                                list.add(C11932a.m27750c(0, true, m27545g()));
                            }
                        }
                    } else if (this.f38076c) {
                        list = this.f38079g.mo20317a();
                    }
                    list = new ArrayList();
                } else {
                    list = m27542d((aco) null);
                }
                guVar2 = C58485gu.m89842j(list);
            } else if (this.f38079g.mo20323g()) {
                if (!str.equals("SendMessageFollowOn") || (zVar = (C63473z) C15669a.m32464c(fVar, C63473z.f171528i)) == null) {
                    C63473z zVar2 = C63473z.f171527h;
                    guVar3 = C58485gu.m89842j(this.f38079g.mo20320d(zVar2));
                    m27544f(zVar2);
                } else {
                    guVar3 = C58485gu.m89842j(this.f38079g.mo20320d(zVar));
                    m27544f(zVar);
                }
                guVar2 = guVar3;
            } else {
                ((C58970a) ((C58970a) f38073d.mo56225c()).mo56372aa(43684)).mo56386p("Cannot handle AnalyzerResponse in Read Message builder.");
                guVar2 = C58485gu.m89845m();
            }
            if (!guVar2.isEmpty()) {
                this.f38075b = 0;
                C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                C52081en b = C15669a.m32463b(guVar2, Arrays.asList(new Integer[]{58570}));
                eVar.copyOnWrite();
                C51195j jVar = (C51195j) eVar.instance;
                b.getClass();
                jVar.f133275j = b;
                jVar.f133266a |= 128;
                return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar.build()));
            }
        }
        if (this.f38079g.mo20323g()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C51190e eVar2 = (C51190e) C51195j.f133264n.createBuilder();
        int i2 = this.f38075b;
        if (i2 < 2) {
            if (i2 == 0) {
                C9309a aVar2 = this.f38083k;
                dyVar = C15669a.m32462a(aVar2.mo17491a(aVar2.f32300b).getString(R.string.sorry_string));
            } else {
                int i3 = true != this.f38076c ? R.string.final_notification_no_reply_reprompt : R.string.final_notification_reprompt;
                C9309a aVar3 = this.f38083k;
                dyVar = C15669a.m32462a(aVar3.mo17491a(aVar3.f32300b).getString(i3));
            }
            this.f38075b++;
            guVar = C58485gu.m89847o(dyVar, C11932a.m27751d());
        } else {
            this.f38082j = true;
            C9309a aVar4 = this.f38083k;
            List f = C11932a.m27753f(aVar4.mo17491a(aVar4.f32300b));
            if (this.f38080h.mo79746e(C90086ek.f250253E)) {
                f.add(C11932a.m27750c(0, true, m27545g()));
            }
            guVar = C58485gu.m89842j(f);
        }
        C52081en b2 = C15669a.m32463b(guVar, Arrays.asList(new Integer[]{58570}));
        eVar2.copyOnWrite();
        C51195j jVar2 = (C51195j) eVar2.instance;
        b2.getClass();
        jVar2.f133275j = b2;
        jVar2.f133266a |= 128;
        return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar2.build()));
    }

    /* renamed from: c */
    public final C60870cx mo20207c(C52081en enVar) {
        C63088z zVar;
        C52083ep epVar;
        C52078ek ekVar;
        C52078ek ekVar2;
        C51805du duVar;
        C52078ek ekVar3;
        C52078ek ekVar4;
        C51805du duVar2;
        if (!this.f38077e.f()) {
            m27543e();
        }
        Iterator it = enVar.f136684d.iterator();
        while (true) {
            zVar = null;
            if (!it.hasNext()) {
                epVar = null;
                break;
            }
            epVar = (C52083ep) it.next();
            if (epVar.f136692b == 3) {
                ekVar3 = (C52078ek) epVar.f136693c;
            } else {
                ekVar3 = C52078ek.f136671f;
            }
            if (ekVar3.f136674b == 5) {
                if (epVar.f136692b == 3) {
                    ekVar4 = (C52078ek) epVar.f136693c;
                } else {
                    ekVar4 = C52078ek.f136671f;
                }
                if (ekVar4.f136674b == 5) {
                    duVar2 = (C51805du) ekVar4.f136675c;
                } else {
                    duVar2 = C51805du.f135924e;
                }
                if (duVar2.f135927b.equals("message_notification.READ")) {
                    break;
                }
            }
        }
        if (epVar != null) {
            if (!((C91123v) this.f38081i.mo27525b()).mo85390b() || !this.f38080h.mo79746e(C90086ek.f250252D) || !this.f38080h.mo79746e(C90086ek.f250304ac)) {
                this.f38077e.b("SearchMessage");
                if (epVar.f136692b == 3) {
                    ekVar = (C52078ek) epVar.f136693c;
                } else {
                    ekVar = C52078ek.f136671f;
                }
                if (ekVar.f136674b == 5) {
                    if (epVar.f136692b == 3) {
                        ekVar2 = (C52078ek) epVar.f136693c;
                    } else {
                        ekVar2 = C52078ek.f136671f;
                    }
                    if (ekVar2.f136674b == 5) {
                        duVar = (C51805du) ekVar2.f136675c;
                    } else {
                        duVar = C51805du.f135924e;
                    }
                    C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("message_notification_read_param");
                    if (kaVar != null && kaVar.f137060b.equals("assistant.api.client_input.MessageNotificationReadParam")) {
                        zVar = kaVar.f137061c;
                    }
                }
                if (zVar != null) {
                    try {
                        C52638zd zdVar = (C52638zd) C62942bv.parseFrom((C62942bv) C52638zd.f138205f, zVar, C62921ba.m95368a());
                        if ((zdVar.f138207a & 1) != 0) {
                            aco aco = zdVar.f138208b;
                            if (aco == null) {
                                aco = aco.f134821t;
                            }
                            this.f38076c = aco.f134833k;
                            return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(m27542d(aco), Arrays.asList(new Integer[]{58570}))));
                        }
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) f38073d.mo56225c()).mo56382g(e)).mo56372aa(43690)).mo56386p("Invalid parse");
                    }
                }
                ((C58970a) ((C58970a) f38073d.mo56226d()).mo56372aa(43689)).mo56386p("Unable to retrieve message for read input");
                m27543e();
                return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
            }
            ((C58970a) ((C58970a) f38073d.mo56226d()).mo56372aa(43692)).mo56386p("#getReadConversationDelta, couldn't read");
            C9309a aVar = this.f38083k;
            return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.generic_builder_punt_embedded))), Arrays.asList(new Integer[]{58570}))));
        } else if (!this.f38082j) {
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            m27543e();
            return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
        }
    }
}
