package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9557i;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127354b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.i.c */
/* compiled from: PG */
public final class C127229c implements C127369n {

    /* renamed from: a */
    private final C127354b f350320a;

    /* renamed from: b */
    private final String f350321b;

    public C127229c(C127354b bVar, String str) {
        C69664n.m101061g(bVar, "conversationParamsStore");
        this.f350320a = bVar;
        this.f350321b = str;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        C52232kc a = this.f350320a.mo108031a(this.f350321b);
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a2 = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a3 = C69664n.m101061g(azVar, "builder");
        if (a != null) {
            C52230ka kaVar = a.f137066c;
            if (kaVar == null) {
                kaVar = C52230ka.f137057d;
            }
            C69664n.m101060f(kaVar, "params.value");
            a3.mo38306b(kaVar);
        }
        a2.mo38303b(a3.mo38305a());
        return C60856cj.m92900i(a2.mo38302a());
    }
}
