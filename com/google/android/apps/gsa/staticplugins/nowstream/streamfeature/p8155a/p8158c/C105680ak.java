package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c;

import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91421f;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91783ag;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91784ah;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91789am;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91790an;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91812s;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91813t;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91818y;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91819z;
import com.google.android.libraries.gsa.monet.service.C23050a;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58570jy;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7726hr;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.a.c.ak */
/* compiled from: PG */
public final /* synthetic */ class C105680ak implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C105681al f294813a;

    /* renamed from: b */
    public final /* synthetic */ String f294814b;

    public /* synthetic */ C105680ak(C105681al alVar, String str) {
        this.f294813a = alVar;
        this.f294814b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C105681al alVar = this.f294813a;
        String str = this.f294814b;
        alVar.f294819e.f294866e.mo28396b(str, (C23050a) obj);
        C105687ar arVar = alVar.f294819e;
        Iterator it = alVar.f294817c;
        it.getClass();
        arVar.f294879r.mo85756c();
        if (((Boolean) ((C23251a) arVar.f294863b.mo94989b()).f63720e).booleanValue()) {
            ((C59052c) ((C59052c) C105687ar.f294829a.mo56226d()).mo56372aa(22413)).mo56386p("children already added");
        }
        if (arVar.f294837H && !arVar.f294873l.f63752b.f63757a.f63585a.mo28713l("OFFLINE_WARNING_CARD")) {
            C91812s sVar = (C91812s) C91813t.f256060d.createBuilder();
            long j = arVar.f294841L;
            sVar.copyOnWrite();
            C91813t tVar = (C91813t) sVar.instance;
            tVar.f256062a |= 1;
            tVar.f256063b = j;
            boolean booleanValue = ((Boolean) ((C23251a) arVar.f294863b.mo94992e()).f63720e).booleanValue();
            sVar.copyOnWrite();
            C91813t tVar2 = (C91813t) sVar.instance;
            tVar2.f256062a |= 2;
            tVar2.f256064c = booleanValue;
            C91421f fVar = arVar.f294873l;
            fVar.mo28754e("OFFLINE_WARNING_CARD", arVar.mo28494O("TYPE_OFFLINE_WARNING"), C23245b.m43556a((C91813t) sVar.build()), fVar.f63752b.f63757a.f63585a.mo28704b());
        }
        if (arVar.f294838I && !arVar.f294873l.f63752b.f63757a.f63585a.mo28713l("SIGN_IN_ERROR")) {
            C91783ag agVar = (C91783ag) C91784ah.f255949c.createBuilder();
            boolean booleanValue2 = ((Boolean) ((C23251a) arVar.f294863b.mo94992e()).f63720e).booleanValue();
            agVar.copyOnWrite();
            C91784ah ahVar = (C91784ah) agVar.instance;
            ahVar.f255951a |= 1;
            ahVar.f255952b = booleanValue2;
            C91421f fVar2 = arVar.f294873l;
            fVar2.mo28754e("SIGN_IN_ERROR", arVar.mo28494O("TYPE_SIGN_IN_ERROR"), C23245b.m43556a((C91784ah) agVar.build()), fVar2.f63752b.f63757a.f63585a.mo28704b());
            C91421f fVar3 = arVar.f294873l;
            ((C105694g) fVar3.f63752b.f63757a.mo28636a(fVar3.f63752b.f63757a.f63585a.mo28704b() - 1)).f294950a = new C105702o(arVar);
        }
        ArrayList arrayList = new ArrayList();
        C58570jy.m90163o(arrayList, it);
        C7726hr[] hrVarArr = (C7726hr[]) C58557jl.m90142w(arrayList, C7726hr.class);
        for (C7726hr o : hrVarArr) {
            arVar.mo94977o(str, o, arVar.f294873l.f63752b.f63757a.f63585a.mo28704b());
        }
        arVar.mo94978p();
        int length = hrVarArr.length;
        if (length == 0 && !arVar.f294873l.f63752b.f63757a.f63585a.mo28713l("SIGN_IN_ERROR") && arVar.f294839J && arVar.f294844O) {
            arVar.mo94974l();
        }
        if (((Boolean) ((C23251a) arVar.f294863b.mo94991d()).f63720e).booleanValue() && length > 0 && arVar.f294877p.mo79746e(C90010bp.f247011w)) {
            if (arVar.f294835F != null) {
                arVar.mo94985w();
            }
            C91421f fVar4 = arVar.f294873l;
            fVar4.mo28754e("SPINNER", arVar.mo28494O("TYPE_SPINNER"), ProtoParcelable.f63423a, fVar4.f63752b.f63757a.f63585a.mo28704b());
            arVar.f294835F = (C105700m) arVar.f294873l.f63752b.f63757a.mo28637b();
        }
        if (arVar.f294877p.mo79746e(C90010bp.f246982ay) && (((arVar.f294877p.mo79746e(C90010bp.f246983az) && !arVar.f294844O) || !arVar.f294877p.mo79746e(C90010bp.f246983az)) && !arVar.f294873l.f63752b.f63757a.f63585a.mo28713l("NAME_PUBLICATION_JUDICIAIRE_FOOTER"))) {
            C91421f fVar5 = arVar.f294873l;
            C23129y O = arVar.mo28494O("TYPE_PUBLICATION_JUDICIAIRE_FOOTER");
            C91818y yVar = (C91818y) C91819z.f256081c.createBuilder();
            boolean booleanValue3 = ((Boolean) arVar.f294863b.mo95001n().f63720e).booleanValue();
            yVar.copyOnWrite();
            ((C91819z) yVar.instance).f256083a = booleanValue3;
            yVar.copyOnWrite();
            ((C91819z) yVar.instance).f256084b = true;
            fVar5.mo28754e("NAME_PUBLICATION_JUDICIAIRE_FOOTER", O, C23245b.m43556a((C91819z) yVar.build()), fVar5.f63752b.f63757a.f63585a.mo28704b());
        }
        if (!arVar.f294873l.f63752b.f63757a.f63585a.mo28713l("SPACER")) {
            C91789am amVar = (C91789am) C91790an.f255963c.createBuilder();
            int i = true != ((Boolean) arVar.f294863b.mo95001n().f63720e).booleanValue() ? -3 : -4;
            amVar.copyOnWrite();
            C91790an anVar = (C91790an) amVar.instance;
            anVar.f255965a |= 1;
            anVar.f255966b = i;
            C91421f fVar6 = arVar.f294873l;
            fVar6.mo28754e("SPACER", arVar.mo28494O("TYPE_SPACER"), C23245b.m43556a((C91790an) amVar.build()), fVar6.f63752b.f63757a.f63585a.mo28704b());
        }
        arVar.mo94986x(true);
        arVar.f294834E = null;
        alVar.f294819e.mo94987y(false);
        alVar.f294819e.mo94988z(alVar.f294816b);
        return null;
    }
}
