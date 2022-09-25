package com.google.android.apps.gsa.staticplugins.messages.monet.p8035b;

import com.google.android.apps.gsa.search.shared.p6927e.C87544b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102722c;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102723d;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102725f;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102728i;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.p8036a.C102730a;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102754f;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8037c.C102757i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23193m;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60572uw;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62963cj;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.b.p */
/* compiled from: PG */
public final class C102747p extends C23056g implements C102754f {

    /* renamed from: a */
    public final C102757i f286846a;

    /* renamed from: b */
    public final C102746o f286847b;

    public C102747p(C23052c cVar, C102757i iVar, C102746o oVar) {
        super(cVar);
        this.f286846a = iVar;
        this.f286847b = oVar;
        ((C23015k) cVar).f63315j.mo28433w(C102735d.class, new C102745n(this, oVar));
    }

    /* renamed from: e */
    public final C87544b mo93411e() {
        return (C87544b) ((C58833ax) ((C102734c) this.f286846a).f286820i.f63720e).mo56109e(C87544b.UNKNOWN_MESSAGE);
    }

    /* renamed from: f */
    public final void mo93412f(C60572uw uwVar) {
        throw null;
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C102723d dVar;
        C102728i iVar = (C102728i) C23245b.m43557b(protoParcelable, C102728i.f286784l.getParserForType(), C62921ba.m95368a(), true);
        iVar.getClass();
        C23251a aVar = ((C102734c) this.f286846a).f286820i;
        C87544b a = C87544b.m142201a(iVar.f286787b);
        if (a == null) {
            a = C87544b.UNKNOWN_MESSAGE;
        }
        aVar.mo28730f(C58833ax.m90834k(a), false);
        ((C102734c) this.f286846a).f286819h.mo28730f(Integer.valueOf(iVar.f286788c), false);
        ((C102734c) this.f286846a).f286814c.mo28730f(Integer.valueOf(iVar.f286789d), false);
        ((C102734c) this.f286846a).f286816e.mo28730f(Integer.valueOf(iVar.f286790e), false);
        for (C102721b bVar : new LinkedHashSet(new C62963cj(iVar.f286791f, C102728i.f286783g))) {
            if (bVar != C102721b.UNKNOWN_BUTTON) {
                C23193m mVar = ((C102734c) this.f286846a).f286812a;
                switch (bVar.ordinal()) {
                    case 2:
                        C102722c cVar = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar2 = C102721b.INSTALL_LANGUAGE_PACK;
                        cVar.copyOnWrite();
                        C102723d dVar2 = (C102723d) cVar.instance;
                        dVar2.f286773b = bVar2.f286769o;
                        dVar2.f286772a |= 1;
                        cVar.copyOnWrite();
                        C102723d dVar3 = (C102723d) cVar.instance;
                        dVar3.f286772a |= 2;
                        dVar3.f286774c = R.string.offline_no_language_pack_card_install_button_text;
                        cVar.copyOnWrite();
                        C102723d dVar4 = (C102723d) cVar.instance;
                        dVar4.f286772a |= 4;
                        dVar4.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar.build();
                        break;
                    case 4:
                        C102722c cVar2 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar3 = C102721b.OPEN_AIRPLANE_MODE_SETTINGS;
                        cVar2.copyOnWrite();
                        C102723d dVar5 = (C102723d) cVar2.instance;
                        dVar5.f286773b = bVar3.f286769o;
                        dVar5.f286772a |= 1;
                        cVar2.copyOnWrite();
                        C102723d dVar6 = (C102723d) cVar2.instance;
                        dVar6.f286772a |= 2;
                        dVar6.f286774c = R.string.offline_error_card_open_settings_button_text;
                        cVar2.copyOnWrite();
                        C102723d dVar7 = (C102723d) cVar2.instance;
                        dVar7.f286772a |= 4;
                        dVar7.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar2.build();
                        break;
                    case 5:
                        C102722c cVar3 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar4 = C102721b.OPEN_DATA_ROAMING_SETTINGS;
                        cVar3.copyOnWrite();
                        C102723d dVar8 = (C102723d) cVar3.instance;
                        dVar8.f286773b = bVar4.f286769o;
                        dVar8.f286772a |= 1;
                        cVar3.copyOnWrite();
                        C102723d dVar9 = (C102723d) cVar3.instance;
                        dVar9.f286772a |= 2;
                        dVar9.f286774c = R.string.turn_on_data_roaming_button_text;
                        cVar3.copyOnWrite();
                        C102723d dVar10 = (C102723d) cVar3.instance;
                        dVar10.f286772a |= 4;
                        dVar10.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar3.build();
                        break;
                    case 6:
                        C102722c cVar4 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar5 = C102721b.OPEN_DATA_USAGE_SETTINGS;
                        cVar4.copyOnWrite();
                        C102723d dVar11 = (C102723d) cVar4.instance;
                        dVar11.f286773b = bVar5.f286769o;
                        dVar11.f286772a |= 1;
                        cVar4.copyOnWrite();
                        C102723d dVar12 = (C102723d) cVar4.instance;
                        dVar12.f286772a |= 2;
                        dVar12.f286774c = R.string.turn_on_mobile_data_button_text;
                        cVar4.copyOnWrite();
                        C102723d dVar13 = (C102723d) cVar4.instance;
                        dVar13.f286772a |= 4;
                        dVar13.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar4.build();
                        break;
                    case 7:
                        C102722c cVar5 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar6 = C102721b.OPEN_DATETIME_SETTINGS;
                        cVar5.copyOnWrite();
                        C102723d dVar14 = (C102723d) cVar5.instance;
                        dVar14.f286773b = bVar6.f286769o;
                        dVar14.f286772a |= 1;
                        cVar5.copyOnWrite();
                        C102723d dVar15 = (C102723d) cVar5.instance;
                        dVar15.f286772a |= 2;
                        dVar15.f286774c = R.string.clock_maybe_wrong_error_card_open_settings_button_text;
                        cVar5.copyOnWrite();
                        C102723d dVar16 = (C102723d) cVar5.instance;
                        dVar16.f286772a |= 4;
                        dVar16.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar5.build();
                        break;
                    case 8:
                        C102722c cVar6 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar7 = C102721b.OPEN_PERMISSIONS_DIALOG;
                        cVar6.copyOnWrite();
                        C102723d dVar17 = (C102723d) cVar6.instance;
                        dVar17.f286773b = bVar7.f286769o;
                        dVar17.f286772a |= 1;
                        cVar6.copyOnWrite();
                        C102723d dVar18 = (C102723d) cVar6.instance;
                        dVar18.f286772a |= 2;
                        dVar18.f286774c = R.string.permission_required_continue_button;
                        cVar6.copyOnWrite();
                        C102723d dVar19 = (C102723d) cVar6.instance;
                        dVar19.f286772a |= 4;
                        dVar19.f286775d = R.drawable.quantum_ic_arrow_forward_grey600_24;
                        dVar = (C102723d) cVar6.build();
                        break;
                    case 9:
                        dVar = C102730a.m170324a();
                        break;
                    case 10:
                        C102722c cVar7 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar8 = C102721b.SELECT_WIFI_NETWORK;
                        cVar7.copyOnWrite();
                        C102723d dVar20 = (C102723d) cVar7.instance;
                        dVar20.f286773b = bVar8.f286769o;
                        dVar20.f286772a |= 1;
                        cVar7.copyOnWrite();
                        C102723d dVar21 = (C102723d) cVar7.instance;
                        dVar21.f286772a |= 2;
                        dVar21.f286774c = R.string.select_wifi_network_button_text;
                        cVar7.copyOnWrite();
                        C102723d dVar22 = (C102723d) cVar7.instance;
                        dVar22.f286772a |= 4;
                        dVar22.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar7.build();
                        break;
                    case 11:
                        C102722c cVar8 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar9 = C102721b.SIGN_IN_TO_NETWORK;
                        cVar8.copyOnWrite();
                        C102723d dVar23 = (C102723d) cVar8.instance;
                        dVar23.f286773b = bVar9.f286769o;
                        dVar23.f286772a |= 1;
                        cVar8.copyOnWrite();
                        C102723d dVar24 = (C102723d) cVar8.instance;
                        dVar24.f286772a |= 2;
                        dVar24.f286774c = R.string.captive_portal_error_card_cell_open_captive_portal_page_button_text;
                        cVar8.copyOnWrite();
                        C102723d dVar25 = (C102723d) cVar8.instance;
                        dVar25.f286772a |= 4;
                        dVar25.f286775d = R.drawable.quantum_ic_arrow_forward_grey600_24;
                        dVar = (C102723d) cVar8.build();
                        break;
                    case 12:
                        C102722c cVar9 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar10 = C102721b.TRIGGER_NEXT_MESSAGE;
                        cVar9.copyOnWrite();
                        C102723d dVar26 = (C102723d) cVar9.instance;
                        dVar26.f286773b = bVar10.f286769o;
                        dVar26.f286772a |= 1;
                        cVar9.copyOnWrite();
                        C102723d dVar27 = (C102723d) cVar9.instance;
                        dVar27.f286772a |= 2;
                        dVar27.f286774c = R.string.trigger_next_message_button_text;
                        cVar9.copyOnWrite();
                        C102723d dVar28 = (C102723d) cVar9.instance;
                        dVar28.f286772a |= 4;
                        dVar28.f286775d = R.drawable.quantum_ic_dogfood_color_24;
                        dVar = (C102723d) cVar9.build();
                        break;
                    case 13:
                        C102722c cVar10 = (C102722c) C102723d.f286770e.createBuilder();
                        C102721b bVar11 = C102721b.TURN_ON_WIFI;
                        cVar10.copyOnWrite();
                        C102723d dVar29 = (C102723d) cVar10.instance;
                        dVar29.f286773b = bVar11.f286769o;
                        dVar29.f286772a |= 1;
                        cVar10.copyOnWrite();
                        C102723d dVar30 = (C102723d) cVar10.instance;
                        dVar30.f286772a |= 2;
                        dVar30.f286774c = R.string.turn_on_wifi_and_select_network_button_text;
                        cVar10.copyOnWrite();
                        C102723d dVar31 = (C102723d) cVar10.instance;
                        dVar31.f286772a |= 4;
                        dVar31.f286775d = R.drawable.quantum_ic_settings_grey600_24;
                        dVar = (C102723d) cVar10.build();
                        break;
                    default:
                        C59104x c = C102730a.f286800a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "MCButtonDataFactory");
                        ((C59052c) ((C59052c) c).mo56372aa(21036)).mo56389s("Unknown button type %s, fall back to RETRY", bVar.name());
                        dVar = C102730a.m170324a();
                        break;
                }
                mVar.mo28647a("message_card_button", C23245b.m43556a(dVar));
            }
        }
        ((C102734c) this.f286846a).f286817f.mo28730f(Boolean.valueOf(iVar.f286792h), false);
        ((C102734c) this.f286846a).f286818g.mo28730f(Boolean.valueOf(iVar.f286794j), false);
        ((C102734c) this.f286846a).f286813b.mo28730f(Boolean.valueOf(iVar.f286795k), false);
        C23251a aVar2 = ((C102734c) this.f286846a).f286815d;
        C102725f a2 = C102725f.m170319a(iVar.f286793i);
        if (a2 == null) {
            a2 = C102725f.HIDDEN;
        }
        aVar2.mo28730f(C58833ax.m90834k(a2), false);
    }
}
