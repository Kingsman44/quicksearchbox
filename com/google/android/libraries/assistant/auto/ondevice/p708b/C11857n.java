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
import com.google.android.libraries.assistant.auto.ondevice.utils.C11946i;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11947j;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11948k;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a;
import com.google.assistant.p3897e.p3910e.p3911a.C51190e;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52640zf;
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
import com.google.protos.p4850an.p4855d.p4856a.C63473z;
import com.google.speech.grammar.pumpkin.C66525q;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.n */
/* compiled from: PG */
public final class C11857n implements a {

    /* renamed from: b */
    private static final C58974d f38171b = C58974d.m91134h("OfflineTTReplyBuilder");

    /* renamed from: a */
    boolean f38172a = false;

    /* renamed from: c */
    private final b f38173c;

    /* renamed from: d */
    private final SemanticsBuilderUtil f38174d;

    /* renamed from: e */
    private final C11947j f38175e;

    /* renamed from: f */
    private final C68214a f38176f;

    /* renamed from: g */
    private final C86124t f38177g;

    /* renamed from: h */
    private final C9309a f38178h;

    public C11857n(b bVar, SemanticsBuilderUtil semanticsBuilderUtil, C11947j jVar, C9309a aVar, C68214a aVar2, C86124t tVar) {
        this.f38173c = bVar;
        this.f38174d = semanticsBuilderUtil;
        this.f38175e = jVar;
        this.f38178h = aVar;
        this.f38177g = tVar;
        this.f38176f = aVar2;
    }

    /* renamed from: d */
    private final void m27596d() {
        this.f38172a = false;
        this.f38175e.mo20321e();
    }

    /* renamed from: e */
    private final void m27597e(C63473z zVar) {
        boolean z = true;
        if (!this.f38175e.mo20322f(zVar) && !C11947j.m27796h(zVar)) {
            z = false;
        }
        this.f38172a = z;
    }

    /* renamed from: a */
    public final C58833ax mo20233a(C61752n nVar, Query query) {
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final C60870cx mo20234b(C66525q qVar, Query query) {
        C58485gu guVar;
        C58485gu guVar2;
        C63473z zVar;
        if (qVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        if (!this.f38173c.f()) {
            m27596d();
        }
        C58833ax a = this.f38174d.mo20311a(qVar, C11948k.m27806b(this.f38175e.f38381a));
        if (a.mo56113h()) {
            C63595f fVar = (C63595f) a.mo56107c();
            String str = qVar.f180932b;
            if (C11946i.m27795b(this.f38175e.f38381a)) {
                guVar = C58485gu.m89842j(this.f38175e.mo20318b(C11946i.m27794a(query)));
            } else {
                if (!str.equals("SendMessageFollowOn") || (zVar = (C63473z) C15669a.m32464c(fVar, C63473z.f171528i)) == null) {
                    C63473z zVar2 = C63473z.f171527h;
                    guVar2 = C58485gu.m89842j(this.f38175e.mo20318b(zVar2));
                    m27597e(zVar2);
                } else {
                    guVar2 = C58485gu.m89842j(this.f38175e.mo20318b(zVar));
                    m27597e(zVar);
                }
                guVar = guVar2;
            }
            if (!guVar.isEmpty()) {
                C51190e eVar = (C51190e) C51195j.f133264n.createBuilder();
                C52081en b = C15669a.m32463b(guVar, Arrays.asList(new Integer[]{58570}));
                eVar.copyOnWrite();
                C51195j jVar = (C51195j) eVar.instance;
                b.getClass();
                jVar.f133275j = b;
                jVar.f133266a |= 128;
                return C60856cj.m92900i(C58833ax.m90834k((C51195j) eVar.build()));
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: c */
    public final C60870cx mo20235c(C52081en enVar) {
        C63088z zVar;
        C52083ep epVar;
        C52078ek ekVar;
        C52078ek ekVar2;
        C51805du duVar;
        C52078ek ekVar3;
        C52078ek ekVar4;
        C51805du duVar2;
        if (!this.f38173c.f()) {
            m27596d();
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
                if (duVar2.f135927b.equals("message_notification.REPLY")) {
                    break;
                }
            }
        }
        if (epVar != null) {
            if (!((C91123v) this.f38176f.mo27525b()).mo85390b() || !this.f38177g.mo79746e(C90086ek.f250252D) || !this.f38177g.mo79746e(C90086ek.f250304ac)) {
                this.f38173c.b("SendMessage");
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
                    C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("message_notification_reply_param");
                    if (kaVar != null && kaVar.f137060b.equals("assistant.api.client_input.MessageNotificationReplyParam")) {
                        zVar = kaVar.f137061c;
                    }
                }
                if (zVar != null) {
                    try {
                        C52640zf zfVar = (C52640zf) C62942bv.parseFrom((C62942bv) C52640zf.f138212e, zVar, C62921ba.m95368a());
                        if ((zfVar.f138214a & 1) != 0) {
                            aco aco = zfVar.f138215b;
                            if (aco == null) {
                                aco = aco.f134821t;
                            }
                            if (!aco.f134833k) {
                                ((C58970a) ((C58970a) f38171b.mo56226d()).mo56372aa(43589)).mo56386p("Missing reply action for direct reply.");
                                this.f38172a = true;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                if (aco != null) {
                                    arrayList.add(C11932a.m27749b(aet.ALTERNATIVE, true));
                                }
                                arrayList.addAll(this.f38175e.mo20317a());
                                return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(arrayList, Arrays.asList(new Integer[]{58570}))));
                            }
                        }
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) f38171b.mo56225c()).mo56382g(e)).mo56372aa(43590)).mo56386p("Invalid parse");
                    }
                }
                ((C58970a) ((C58970a) f38171b.mo56226d()).mo56372aa(43588)).mo56386p("Unable to retrieve message for reply input");
                m27596d();
                return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
            }
            ((C58970a) ((C58970a) f38171b.mo56226d()).mo56372aa(43591)).mo56386p("#getReplyConversationDelta, couldn't read");
            C9309a aVar = this.f38178h;
            return C60856cj.m92900i(C58833ax.m90834k(C15669a.m32463b(C58485gu.m89846n(C15669a.m32462a(aVar.mo17491a(aVar.f32300b).getString(R.string.generic_builder_punt_embedded))), Arrays.asList(new Integer[]{23202}))));
        } else if (!this.f38172a) {
            return C60856cj.m92900i(C58836b.f156633a);
        } else {
            m27596d();
            return C60856cj.m92900i(C58833ax.m90834k(C52081en.f136679i));
        }
    }
}
