package com.google.android.apps.gsa.staticplugins.p7630bz.p7631a;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6512ai.C84510a;
import com.google.android.apps.gsa.search.core.p6512ai.C84511b;
import com.google.android.apps.gsa.search.core.p6512ai.C84512c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.monet.p7070b.p7098o.C90267c;
import com.google.android.apps.gsa.shared.p7122o.p7123a.C90437a;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7632b.C97479a;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7632b.C97482d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.C60494rz;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57783o;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import com.google.protos.youtube.elements.p5165a.C66038z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.a.b */
/* compiled from: PG */
public final class C97477b extends C23056g implements C97479a {

    /* renamed from: a */
    private final C90479a f272182a;

    /* renamed from: b */
    private final Context f272183b;

    /* renamed from: c */
    private final C97482d f272184c;

    /* renamed from: d */
    private final C84510a f272185d;

    /* renamed from: e */
    private final C68214a f272186e;

    /* renamed from: f */
    private final C58833ax f272187f;

    public C97477b(C23052c cVar, C97482d dVar, Context context, C58833ax axVar, C90479a aVar, C68214a aVar2, C84510a aVar3) {
        super(cVar);
        this.f272182a = aVar;
        this.f272183b = context;
        this.f272184c = dVar;
        this.f272186e = aVar2;
        this.f272185d = aVar3;
        this.f272187f = axVar;
    }

    /* renamed from: a */
    public final void mo84178a(CommandOuterClass$Command commandOuterClass$Command) {
        Object obj;
        C58833ax axVar = this.f272187f;
        if (axVar.mo56113h()) {
            ((C90437a) axVar.mo56107c()).mo84178a(commandOuterClass$Command);
            return;
        }
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
            C84510a aVar = this.f272185d;
            Uri parse = Uri.parse(((C66038z) obj).f179601b);
            C84511b bVar = (C84511b) C84512c.f230001h.createBuilder();
            C60494rz rzVar = C60494rz.EXPLORE_ON_CONTENT;
            bVar.copyOnWrite();
            C84512c cVar = (C84512c) bVar.instance;
            cVar.f230004b = rzVar.f163762v;
            cVar.f230003a |= 1;
            aVar.mo78216a(parse, (C84512c) bVar.build());
        }
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        Object obj;
        C90267c cVar = (C90267c) C23245b.m43557b(protoParcelable, C90267c.f252135e.getParserForType(), C62921ba.m95368a(), true);
        if (cVar != null && (cVar.f252137a & 1) != 0) {
            C23251a aVar = ((C97476a) this.f272184c).f272178a;
            C57784p pVar = cVar.f252138b;
            if (pVar == null) {
                pVar = C57784p.f154382f;
            }
            aVar.mo28730f(pVar, false);
            C23251a aVar2 = ((C97476a) this.f272184c).f272179b;
            C60214n nVar = cVar.f252140d;
            if (nVar == null) {
                nVar = C60214n.f162914g;
            }
            aVar2.mo28730f(nVar, false);
        } else if (this.f272182a.mo84229d()) {
            C23251a aVar3 = ((C97476a) this.f272184c).f272178a;
            byte[] O = C90772bp.m148288O(this.f272183b.getResources(), R.raw.test_data_pb);
            C63088z A = O == null ? C63088z.f170246b : C63088z.m96139A(O);
            C57783o oVar = (C57783o) C57784p.f154382f.createBuilder();
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            gVar.copyOnWrite();
            A.getClass();
            ((C63070h) gVar.instance).f170218b = A;
            C63070h hVar = (C63070h) gVar.build();
            oVar.copyOnWrite();
            C57784p pVar2 = (C57784p) oVar.instance;
            hVar.getClass();
            pVar2.f154385b = hVar;
            pVar2.f154384a = 1 | pVar2.f154384a;
            aVar3.mo28730f((C57784p) oVar.build(), false);
        } else {
            ((C89859i) this.f272186e.mo27525b()).mo83702b(C89849ae.MONET_ELEMENTS_NO_DATA);
        }
        if (cVar == null || (cVar.f252137a & 2) == 0) {
            obj = C58836b.f156633a;
        } else {
            C89849ae a = C89849ae.m146281a(cVar.f252139c);
            if (a == null) {
                a = C89849ae.UNKNOWN_EVENT;
            }
            obj = C58833ax.m90834k(a);
        }
        ((C97476a) this.f272184c).f272180c.mo28730f(obj, false);
    }
}
