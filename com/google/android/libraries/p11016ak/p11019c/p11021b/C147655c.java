package com.google.android.libraries.p11016ak.p11019c.p11021b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p11016ak.C147625af;
import com.google.android.libraries.p11016ak.C147628ai;
import com.google.android.libraries.p11016ak.C147702d;
import com.google.android.libraries.p11016ak.C147743y;
import com.google.android.libraries.p11016ak.p11019c.p11020a.C147637a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5285d.p5290b.p5291a.p5292a.C68168bd;
import p5285d.p5290b.p5291a.p5292a.C68169be;
import p5285d.p5290b.p5291a.p5292a.C68171bg;
import p5285d.p5290b.p5291a.p5292a.C68172bh;
import p5285d.p5290b.p5291a.p5292a.C68192e;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.c */
/* compiled from: PG */
public final class C147655c implements C147637a {

    /* renamed from: a */
    private final C68193f f398506a;

    public C147655c(C147743y yVar) {
        C147625af afVar;
        C147625af afVar2;
        C147625af afVar3;
        C68192e eVar = (C68192e) C68193f.f184513i.createBuilder();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (true) {
            C147628ai aiVar = yVar.f398678a;
            aiVar = aiVar == null ? C147628ai.f398454d : aiVar;
            if (aiVar.f398456a == 2) {
                afVar = (C147625af) aiVar.f398457b;
            } else {
                afVar = C147625af.f398447c;
            }
            if (i >= afVar.f398449a.size()) {
                break;
            }
            C147628ai aiVar2 = yVar.f398678a;
            aiVar2 = aiVar2 == null ? C147628ai.f398454d : aiVar2;
            if (aiVar2.f398456a == 2) {
                afVar2 = (C147625af) aiVar2.f398457b;
            } else {
                afVar2 = C147625af.f398447c;
            }
            int length = ((String) afVar2.f398449a.get(i)).length();
            C68171bg bgVar = (C68171bg) C68172bh.f184473d.createBuilder();
            bgVar.copyOnWrite();
            ((C68172bh) bgVar.instance).f184477c = i;
            C68168bd bdVar = (C68168bd) C68169be.f184463c.createBuilder();
            bdVar.copyOnWrite();
            ((C68169be) bdVar.instance).f184466b = length;
            bdVar.copyOnWrite();
            ((C68169be) bdVar.instance).f184465a = i2;
            bgVar.copyOnWrite();
            C68169be beVar = (C68169be) bdVar.build();
            beVar.getClass();
            ((C68172bh) bgVar.instance).f184476b = beVar;
            eVar.mo60286a(bgVar);
            i2 += length + 1;
            C147628ai aiVar3 = yVar.f398678a;
            aiVar3 = aiVar3 == null ? C147628ai.f398454d : aiVar3;
            if (aiVar3.f398456a == 2) {
                afVar3 = (C147625af) aiVar3.f398457b;
            } else {
                afVar3 = C147625af.f398447c;
            }
            sb.append((String) afVar3.f398449a.get(i));
            sb.append("\n");
            i++;
        }
        String sb2 = sb.toString();
        eVar.copyOnWrite();
        ((C68193f) eVar.instance).f184515a = sb2;
        String str = !yVar.f398681d.isEmpty() ? yVar.f398681d : BuildConfig.FLAVOR;
        eVar.copyOnWrite();
        str.getClass();
        ((C68193f) eVar.instance).f184516b = str;
        this.f398506a = (C68193f) eVar.build();
    }

    /* renamed from: a */
    public final C60870cx mo124385a(C147702d dVar) {
        return C60856cj.m92900i(this.f398506a);
    }
}
