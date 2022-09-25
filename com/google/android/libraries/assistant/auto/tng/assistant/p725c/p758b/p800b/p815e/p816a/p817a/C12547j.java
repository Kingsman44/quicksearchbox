package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p815e.p816a.p817a;

import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52170hv;
import com.google.assistant.p3897e.p3921j.C52171hw;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.j */
/* compiled from: PG */
public final class C12547j {

    /* renamed from: a */
    public static final C59071e f39480a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.e.a.a.j");

    /* renamed from: a */
    public static C52174hz m28707a(C52560wg wgVar, C51098gh ghVar) {
        C52171hw hwVar = (C52171hw) C52174hz.f136892m.createBuilder();
        String str = wgVar.f137948d;
        hwVar.copyOnWrite();
        C52174hz hzVar = (C52174hz) hwVar.instance;
        str.getClass();
        hzVar.f136894a |= 1;
        hzVar.f136895b = str;
        hwVar.copyOnWrite();
        C52174hz hzVar2 = (C52174hz) hwVar.instance;
        ghVar.getClass();
        hzVar2.f136896c = ghVar;
        hzVar2.f136894a |= 4;
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        hwVar.copyOnWrite();
        C52174hz hzVar3 = (C52174hz) hwVar.instance;
        woVar.getClass();
        hzVar3.f136897d = woVar;
        hzVar3.f136894a |= 8;
        String str2 = wgVar.f137952h;
        hwVar.copyOnWrite();
        C52174hz hzVar4 = (C52174hz) hwVar.instance;
        str2.getClass();
        hzVar4.f136894a |= 64;
        hzVar4.f136902i = str2;
        hwVar.copyOnWrite();
        C52174hz hzVar5 = (C52174hz) hwVar.instance;
        hzVar5.f136903j = 1;
        hzVar5.f136894a |= 128;
        return (C52174hz) hwVar.build();
    }

    /* renamed from: b */
    public static C58833ax m28708b(C52174hz hzVar) {
        C52170hv hvVar = (C52170hv) C52176ia.f136911k.createBuilder();
        hvVar.mo53808d(hzVar);
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "play_media_args";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.client_op.PlayMediaArgs";
        C63088z byteString = ((C52176ia) hvVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        dvVar.mo53732b(kbVar);
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        dxVar.copyOnWrite();
        C51809dy dyVar = (C51809dy) dxVar.instance;
        dyVar.f135935a |= 1;
        dyVar.f135936b = "media.PLAY_MEDIA";
        dxVar.copyOnWrite();
        C51809dy dyVar2 = (C51809dy) dxVar.instance;
        C51807dw dwVar = (C51807dw) dvVar.build();
        dwVar.getClass();
        dyVar2.f135938d = dwVar;
        dyVar2.f135935a |= 4;
        return C58833ax.m90834k((C51809dy) dxVar.build());
    }
}
