package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7410a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.h.h.c;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.apps.gsa.search.core.p6519al.p6538ai.C84687a;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7098o.C90265a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7098o.C90266b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7098o.C90267c;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7122o.p7123a.C90437a;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b.C94111a;
import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b.C94114d;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1901b.C23149a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60494rz;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54122u;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54124w;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.p5165a.C66038z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.a.f */
/* compiled from: PG */
public final class C94109f extends C23056g implements C94111a, C90437a {

    /* renamed from: a */
    public static final C59071e f262922a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ar.c.a.f");

    /* renamed from: b */
    public final C23149a f262923b;

    /* renamed from: c */
    private final C94114d f262924c;

    /* renamed from: d */
    private final C84510a f262925d;

    /* renamed from: e */
    private final C68214a f262926e;

    /* renamed from: f */
    private final C90021c f262927f;

    /* renamed from: g */
    private final C84687a f262928g;

    /* renamed from: h */
    private final C22871g f262929h;

    /* renamed from: i */
    private final C68214a f262930i;

    public C94109f(C23052c cVar, C23149a aVar, C94114d dVar, C84510a aVar2, C68214a aVar3, C90021c cVar2, C84687a aVar4, C22871g gVar, C68214a aVar5) {
        super(cVar);
        this.f262923b = aVar;
        this.f262924c = dVar;
        this.f262925d = aVar2;
        this.f262926e = aVar3;
        this.f262927f = cVar2;
        this.f262928g = aVar4;
        this.f262929h = gVar;
        this.f262930i = aVar5;
        cVar.mo28433w(C90437a.class, this);
    }

    /* renamed from: i */
    private final void m155316i(int i) {
        ((C89911f) this.f262926e.mo27525b()).mo83756b(new C90452a(211, i)).mo83721a();
    }

    /* renamed from: a */
    public final void mo84178a(CommandOuterClass$Command commandOuterClass$Command) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C66038z.f179598e);
        commandOuterClass$Command.mo58887l(r0);
        if (commandOuterClass$Command.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66038z.f179598e);
            commandOuterClass$Command.mo58887l(r02);
            Object l = commandOuterClass$Command.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            String str = ((C66038z) obj).f179601b;
            if (!TextUtils.isEmpty(str)) {
                C84510a aVar = this.f262925d;
                Uri parse = Uri.parse(str);
                C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
                C60494rz rzVar = C60494rz.EXPLORE_ON_CONTENT;
                bVar.copyOnWrite();
                C84512c cVar = (C84512c) bVar.instance;
                cVar.f230004b = rzVar.f163762v;
                cVar.f230003a |= 1;
                bVar.copyOnWrite();
                C84512c cVar2 = (C84512c) bVar.instance;
                cVar2.f230003a |= 4;
                cVar2.f230006d = true;
                aVar.mo78216a(parse, (C84512c) bVar.build());
                this.f262923b.mo28600c();
                return;
            }
            m155316i(C89885b.EXPLORE_ON_CONTENT_TRAY_CLICK_EVENT_WITHOUT_URL_VALUE);
        }
    }

    /* renamed from: e */
    public final void mo88323e() {
        throw null;
    }

    /* renamed from: f */
    public final void mo88324f(int i) {
        m155316i(i);
        ((C89859i) this.f262930i.mo27525b()).mo83702b(C89849ae.EXPLORE_ON_CONTENT_ERROR);
        this.f262923b.mo28600c();
    }

    /* renamed from: h */
    public final void mo88325h(C54120s sVar) {
        ((C89859i) this.f262930i.mo27525b()).mo83702b(C89849ae.EXPLORE_ON_CONTENT_DATA_READY);
        C54098av avVar = sVar.f142012c;
        if (avVar == null) {
            avVar = C54098av.f141935j;
        }
        if ((avVar.f141937a & 8) != 0) {
            C23251a aVar = (C23251a) this.f262924c.mo88322d();
            C54098av avVar2 = sVar.f142012c;
            if (avVar2 == null) {
                avVar2 = C54098av.f141935j;
            }
            C54124w wVar = avVar2.f141941e;
            if (wVar == null) {
                wVar = C54124w.f142030c;
            }
            aVar.mo28730f(wVar.f142033b, false);
        }
        C23251a aVar2 = (C23251a) this.f262924c.mo88321c();
        C54098av avVar3 = sVar.f142012c;
        if (avVar3 == null) {
            avVar3 = C54098av.f141935j;
        }
        aVar2.mo28730f(Boolean.valueOf(avVar3.f141944h), false);
        C90266b bVar = (C90266b) C90267c.f252135e.createBuilder();
        C54098av avVar4 = sVar.f142012c;
        if (((avVar4 == null ? C54098av.f141935j : avVar4).f141937a & 32) != 0) {
            if (avVar4 == null) {
                avVar4 = C54098av.f141935j;
            }
            C57784p pVar = avVar4.f141943g;
            if (pVar == null) {
                pVar = C57784p.f154382f;
            }
            bVar.copyOnWrite();
            C90267c cVar = (C90267c) bVar.instance;
            pVar.getClass();
            cVar.f252138b = pVar;
            cVar.f252137a |= 1;
        }
        C54098av avVar5 = sVar.f142012c;
        if (avVar5 == null) {
            avVar5 = C54098av.f141935j;
        }
        C54122u uVar = avVar5.f141942f;
        if (uVar == null) {
            uVar = C54122u.f142014h;
        }
        C60214n nVar = uVar.f142022g;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        bVar.copyOnWrite();
        C90267c cVar2 = (C90267c) bVar.instance;
        nVar.getClass();
        cVar2.f252140d = nVar;
        cVar2.f252137a |= 4;
        C89849ae aeVar = ((Boolean) ((C23251a) this.f262924c.mo88321c()).f63720e).booleanValue() ? C89849ae.EXPLORE_ON_CONTENT_DRAW_DONE : C89849ae.EXPLORE_ON_CONTENT_NO_SUGGESTIONS_DRAW_DONE;
        bVar.copyOnWrite();
        C90267c cVar3 = (C90267c) bVar.instance;
        cVar3.f252139c = aeVar.f245884YW;
        cVar3.f252137a |= 2;
        ((C23186f) this.f262924c.mo88320b()).mo28623d(C90265a.f252134a, C23245b.m43556a((C90267c) bVar.build()));
        C54098av avVar6 = sVar.f142012c;
        C54122u uVar2 = (avVar6 == null ? C54098av.f141935j : avVar6).f141942f;
        if (uVar2 == null) {
            uVar2 = C54122u.f142014h;
        }
        if ((uVar2.f142016a & 2) != 0) {
            C84687a aVar3 = this.f262928g;
            if (avVar6 == null) {
                avVar6 = C54098av.f141935j;
            }
            C54122u uVar3 = avVar6.f141942f;
            if (uVar3 == null) {
                uVar3 = C54122u.f142014h;
            }
            C90875ai.m148465b(C94107d.f262920a, aVar3.mo78420b(Uri.parse(uVar3.f142018c)), this.f262929h, "onLogExploreSuccess").mo85223a(C94108e.f262921a);
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        ((C89859i) this.f262930i.mo27525b()).mo83702b(C89849ae.EXPLORE_ON_CONTENT_CREATED);
        if (this.f262927f.mo79746e(C90110fh.f250653ay)) {
            c b = C23245b.m43557b(protoParcelable, c.e.getParserForType(), C62921ba.m95368a(), true);
            if (b != null) {
                Uri parse = Uri.parse(b.b);
                long j = b.c;
                C60494rz a = C60494rz.m92598a(b.d);
                if (a == null) {
                    a = C60494rz.UNKNOWN;
                }
                new C90873ag(this.f262928g.mo78419a(parse, Long.valueOf(j), a), this.f262929h, "setExploreData", new C94105b(this)).mo85223a(new C94106c(this));
                return;
            }
            mo88324f(C89885b.EXPLORE_ON_CONTENT_TRAY_INVALID_INPUT_PROTO_VALUE);
            return;
        }
        C54120s sVar = (C54120s) C23245b.m43557b(protoParcelable, C54120s.f142008d.getParserForType(), C62921ba.m95368a(), true);
        if (sVar != null) {
            mo88325h(sVar);
        } else {
            mo88324f(C89885b.EXPLORE_ON_CONTENT_TRAY_INVALID_INPUT_PROTO_VALUE);
        }
    }
}
