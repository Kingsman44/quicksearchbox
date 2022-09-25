package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14984b;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14157a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14424is;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14425it;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14533mt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14636z;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15377e;
import com.google.android.libraries.assistant.p1363c.p1451h.C17590a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ao */
/* compiled from: PG */
public final class C14675ao implements C14653a {

    /* renamed from: a */
    static final C58495hd f44322a;

    /* renamed from: f */
    private static final C59071e f44323f = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ao");

    /* renamed from: b */
    public final C14157a f44324b;

    /* renamed from: c */
    public final Context f44325c;

    /* renamed from: d */
    public final C86124t f44326d;

    /* renamed from: e */
    public final C21370a f44327e;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C14424is.MESSAGE_TILE, C14533mt.STARTUP_ON_SEND_MESSAGE_TILE);
        gzVar.mo55429h(C14424is.TOP_CONTACT, C14533mt.STARTUP_ON_SEND_MESSAGE_TOP_CONTACT);
        gzVar.mo55429h(C14424is.SOMEONE_ELSE, C14533mt.STARTUP_ON_SEND_MESSAGE_MESSAGE_SOMEONE_ELSE);
        gzVar.mo55429h(C14424is.MESSAGE_CENTER_SEND_MESSAGE, C14533mt.STARTUP_ON_SEND_MESSAGE_MESSAGE_CENTER_SEND_MESSAGE);
        gzVar.mo55429h(C14424is.EMPTY_STATE, C14533mt.STARTUP_ON_SEND_MESSAGE_EMPTY_STATE_SEND_MESSAGE);
        gzVar.mo55429h(C14424is.UNKNOWN, C14533mt.STARTUP_ON_SEND_MESSAGE_TAP);
        f44322a = gzVar.mo55427f(false);
    }

    public C14675ao(Context context, C14157a aVar, C86124t tVar, C21370a aVar2) {
        this.f44325c = context;
        this.f44324b = aVar;
        this.f44326d = tVar;
        this.f44327e = aVar2;
    }

    /* renamed from: k */
    public static void m30800k(C51805du duVar, C60214n nVar, C14749d dVar, C14533mt mtVar, Duration duration) {
        C58976aa aaVar = C58975e.f156826a;
        dVar.mo21716c(C14984b.m31504b(duVar, nVar, "and.opa.morris.message", false, mtVar, duration));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21504d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final C52686as mo21650f(C14749d dVar) {
        C14239bw bwVar;
        Optional a = dVar.mo21714a(C14984b.m31508f());
        if (a.isEmpty()) {
            C59104x c = f44323f.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MsgCenterCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(45387)).mo56386p("Failed to retrieve driving settings response");
            return C52686as.f138291q;
        }
        C14221be beVar = (C14221be) a.get();
        if (beVar.f43043a == 13) {
            bwVar = (C14239bw) beVar.f43044b;
        } else {
            bwVar = C14239bw.f43093c;
        }
        C52686as asVar = bwVar.f43095a;
        if (asVar != null) {
            return asVar;
        }
        C59104x c2 = f44323f.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "Morris.MsgCenterCtrl");
        ((C59052c) ((C59052c) c2).mo56372aa(45386)).mo56386p("Missing driving settings data from datasource");
        return C52686as.f138291q;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14425it itVar;
        C14533mt mtVar;
        String string;
        C14533mt mtVar2;
        if (lfVar.f43800c == 16) {
            itVar = (C14425it) lfVar.f43801d;
        } else {
            itVar = C14425it.f43635f;
        }
        Duration ofNanos = Duration.ofNanos(this.f44327e.mo26872d());
        int i = itVar.f43637a;
        int i2 = 5;
        int i3 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i3 == 0) {
            i3 = 1;
        }
        int i4 = i3 - 2;
        if (i4 == 1) {
            C58976aa aaVar = C58975e.f156826a;
            C61751m mVar = (C61751m) C61752n.f166808f.createBuilder();
            mVar.copyOnWrite();
            C61752n nVar = (C61752n) mVar.instance;
            nVar.f166810a |= 4;
            nVar.f166811b = "Get_message_content";
            C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
            gVar.copyOnWrite();
            C61746h hVar = (C61746h) gVar.instance;
            hVar.f166793a |= 2;
            hVar.f166796d = "message";
            C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
            C61751m mVar2 = (C61751m) C61752n.f166808f.createBuilder();
            mVar2.copyOnWrite();
            C61752n nVar2 = (C61752n) mVar2.instance;
            nVar2.f166810a |= 4;
            nVar2.f166811b = "Electronic_message";
            iVar.copyOnWrite();
            C61748j jVar = (C61748j) iVar.instance;
            C61752n nVar3 = (C61752n) mVar2.build();
            nVar3.getClass();
            jVar.f166803b = nVar3;
            jVar.f166802a = 2;
            gVar.copyOnWrite();
            C61746h hVar2 = (C61746h) gVar.instance;
            C61748j jVar2 = (C61748j) iVar.build();
            jVar2.getClass();
            hVar2.f166797e = jVar2;
            hVar2.f166793a |= 4;
            mVar.mo58184c(gVar);
            C51805du a = C17590a.m34882a((C61752n) mVar.build());
            C60214n nVar4 = itVar.f43640d;
            if (nVar4 == null) {
                nVar4 = C60214n.f162914g;
            }
            m30800k(a, nVar4, dVar, C14533mt.STARTUP_ON_GENERIC_TAP, ofNanos);
        } else if (i4 != 2) {
            if (i4 == 3) {
                C52685ar arVar = (C52685ar) mo21650f(dVar).toBuilder();
                boolean z = itVar.f43639c;
                if (this.f44326d.mo79746e(C90051dc.f248827ai)) {
                    if (z) {
                        i2 = 6;
                    }
                    arVar.copyOnWrite();
                    C52686as asVar = (C52686as) arVar.instance;
                    asVar.f138302j = i2 - 1;
                    asVar.f138293a |= 8192;
                }
                arVar.copyOnWrite();
                C52686as asVar2 = (C52686as) arVar.instance;
                asVar2.f138293a |= 4096;
                asVar2.f138301i = z;
                dVar.mo21716c(C14984b.m31518p((C52686as) arVar.build()));
            }
        } else if (!this.f44326d.mo79746e(C90051dc.f248866bU)) {
            C60214n nVar5 = itVar.f43640d;
            if (nVar5 == null) {
                nVar5 = C60214n.f162914g;
            }
            C14636z zVar = itVar.f43638b;
            if (zVar == null) {
                zVar = C14636z.f44230e;
            }
            if (zVar.f44232a.isEmpty()) {
                string = this.f44325c.getString(R.string.send_a_message_no_contact);
            } else {
                Context context = this.f44325c;
                Object[] objArr = new Object[1];
                C14636z zVar2 = itVar.f43638b;
                if (zVar2 == null) {
                    zVar2 = C14636z.f44230e;
                }
                objArr[0] = zVar2.f44232a;
                string = context.getString(R.string.send_a_message, objArr);
            }
            String str = string;
            if (this.f44326d.mo79746e(C90051dc.f248838at)) {
                C58495hd hdVar = f44322a;
                C14424is a2 = C14424is.m30619a(itVar.f43641e);
                if (a2 == null) {
                    a2 = C14424is.UNRECOGNIZED;
                }
                mtVar2 = (C14533mt) hdVar.getOrDefault(a2, C14533mt.STARTUP_ON_SEND_MESSAGE_TAP);
            } else {
                mtVar2 = C14533mt.STARTUP_ON_SEND_MESSAGE_TAP;
            }
            C14533mt mtVar3 = mtVar2;
            C58976aa aaVar2 = C58975e.f156826a;
            dVar.mo21716c(C14984b.m31515m(str, nVar5, "and.opa.morris.message", false, mtVar3, ofNanos));
        } else {
            C61751m mVar3 = (C61751m) C61752n.f166808f.createBuilder();
            mVar3.copyOnWrite();
            C61752n nVar6 = (C61752n) mVar3.instance;
            nVar6.f166810a |= 4;
            nVar6.f166811b = "Send_digital_object";
            C61745g gVar2 = (C61745g) C61746h.f166791g.createBuilder();
            gVar2.copyOnWrite();
            C61746h hVar3 = (C61746h) gVar2.instance;
            hVar3.f166793a |= 2;
            hVar3.f166796d = "medium";
            C61747i iVar2 = (C61747i) C61748j.f166800d.createBuilder();
            C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
            sVar.copyOnWrite();
            C61758t tVar = (C61758t) sVar.instance;
            tVar.f166826a = 1;
            tVar.f166827b = "/m/02p1fkx";
            iVar2.copyOnWrite();
            C61748j jVar3 = (C61748j) iVar2.instance;
            C61758t tVar2 = (C61758t) sVar.build();
            tVar2.getClass();
            jVar3.f166803b = tVar2;
            jVar3.f166802a = 3;
            gVar2.copyOnWrite();
            C61746h hVar4 = (C61746h) gVar2.instance;
            C61748j jVar4 = (C61748j) iVar2.build();
            jVar4.getClass();
            hVar4.f166797e = jVar4;
            hVar4.f166793a |= 4;
            mVar3.mo58184c(gVar2);
            C14636z zVar3 = itVar.f43638b;
            if (zVar3 == null) {
                zVar3 = C14636z.f44230e;
            }
            if (!zVar3.f44232a.isEmpty()) {
                C14636z zVar4 = itVar.f43638b;
                if (zVar4 == null) {
                    zVar4 = C14636z.f44230e;
                }
                C61745g gVar3 = (C61745g) C61746h.f166791g.createBuilder();
                gVar3.copyOnWrite();
                C61746h hVar5 = (C61746h) gVar3.instance;
                hVar5.f166793a |= 2;
                hVar5.f166796d = "recipient";
                C61747i iVar3 = (C61747i) C61748j.f166800d.createBuilder();
                C61752n a3 = C15377e.m31987a(zVar4);
                iVar3.copyOnWrite();
                C61748j jVar5 = (C61748j) iVar3.instance;
                a3.getClass();
                jVar5.f166803b = a3;
                jVar5.f166802a = 2;
                gVar3.copyOnWrite();
                C61746h hVar6 = (C61746h) gVar3.instance;
                C61748j jVar6 = (C61748j) iVar3.build();
                jVar6.getClass();
                hVar6.f166797e = jVar6;
                hVar6.f166793a |= 4;
                mVar3.mo58184c(gVar3);
                C15377e.m31988b(mVar3);
            }
            C51805du a4 = C17590a.m34882a((C61752n) mVar3.build());
            C60214n nVar7 = itVar.f43640d;
            if (nVar7 == null) {
                nVar7 = C60214n.f162914g;
            }
            if (this.f44326d.mo79746e(C90051dc.f248838at)) {
                C58495hd hdVar2 = f44322a;
                C14424is a5 = C14424is.m30619a(itVar.f43641e);
                if (a5 == null) {
                    a5 = C14424is.UNRECOGNIZED;
                }
                mtVar = (C14533mt) hdVar2.getOrDefault(a5, C14533mt.STARTUP_ON_SEND_MESSAGE_TAP);
            } else {
                mtVar = C14533mt.STARTUP_ON_SEND_MESSAGE_TAP;
            }
            m30800k(a4, nVar7, dVar, mtVar, ofNanos);
        }
        return false;
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
    }
}
