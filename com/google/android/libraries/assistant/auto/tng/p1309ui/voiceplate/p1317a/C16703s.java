package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16712a;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16739b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16753c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.assistant.p3795af.p3796a.p3797a.C48775a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.agj;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.s */
/* compiled from: PG */
public final class C16703s implements C16689e {

    /* renamed from: a */
    private static final C59071e f48872a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.s");

    /* renamed from: a */
    public final C16754d mo22979a(C51809dy dyVar) {
        Object obj;
        agj agj = (agj) C16687c.m33753a(dyVar, "show_app_widget_args", agj.f135054g.getParserForType());
        if (agj == null || (agj.f135056a & 1) == 0) {
            ((C59052c) ((C59052c) f48872a.mo56226d()).mo56372aa(46776)).mo56389s("ClientOp cannot be parsed or is missing package name. clientOp = %s", dyVar.f135936b);
            return null;
        }
        C16712a aVar = (C16712a) C16754d.f49023f.createBuilder();
        C16739b bVar = (C16739b) C16753c.f49018d.createBuilder();
        String str = agj.f135057b;
        bVar.copyOnWrite();
        C16753c cVar = (C16753c) bVar.instance;
        str.getClass();
        cVar.f49020a |= 1;
        cVar.f49021b = str;
        String str2 = agj.f135060e;
        bVar.copyOnWrite();
        C16753c cVar2 = (C16753c) bVar.instance;
        str2.getClass();
        cVar2.f49020a |= 2;
        cVar2.f49022c = str2;
        C16753c cVar3 = (C16753c) bVar.build();
        aVar.copyOnWrite();
        C16754d dVar = (C16754d) aVar.instance;
        cVar3.getClass();
        dVar.f49027c = cVar3;
        dVar.f49025a |= 8;
        String str3 = agj.f135058c;
        aVar.copyOnWrite();
        C16754d dVar2 = (C16754d) aVar.instance;
        str3.getClass();
        dVar2.f49025a |= 32;
        dVar2.f49029e = str3;
        aVar.copyOnWrite();
        C16754d dVar3 = (C16754d) aVar.instance;
        dVar3.f49025a |= 1;
        dVar3.f49026b = true;
        C62940bt r1 = C62942bv.checkIsLite(C48775a.f126214f);
        agj.mo58887l(r1);
        if (agj.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C48775a.f126214f);
            agj.mo58887l(r12);
            Object l = agj.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            C52846w wVar = (C52846w) obj;
            aVar.copyOnWrite();
            C16754d dVar4 = (C16754d) aVar.instance;
            wVar.getClass();
            dVar4.f49028d = wVar;
            dVar4.f49025a |= 16;
        }
        return (C16754d) aVar.build();
    }
}
