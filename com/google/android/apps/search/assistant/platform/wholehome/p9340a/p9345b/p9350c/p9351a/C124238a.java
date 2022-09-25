package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32809bd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32878x;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62910ar;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C124238a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124248k f343035a;

    /* renamed from: b */
    public final /* synthetic */ String f343036b;

    /* renamed from: c */
    public final /* synthetic */ String f343037c;

    public /* synthetic */ C124238a(C124248k kVar, String str, String str2) {
        this.f343035a = kVar;
        this.f343036b = str;
        this.f343037c = str2;
    }

    public final C60870cx apply(Object obj) {
        C124248k kVar = this.f343035a;
        String str = this.f343036b;
        String str2 = this.f343037c;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C32878x xVar = (C32878x) C32879y.f88112f.createBuilder();
        C32809bd bdVar = (C32809bd) C32810be.f87993c.createBuilder();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        str2.getClass();
        arVar.f87975a = 1;
        arVar.f87976b = str2;
        bdVar.copyOnWrite();
        C32810be beVar = (C32810be) bdVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        beVar.f87996b = arVar2;
        beVar.f87995a |= 1;
        xVar.copyOnWrite();
        C32879y yVar = (C32879y) xVar.instance;
        C32810be beVar2 = (C32810be) bdVar.build();
        beVar2.getClass();
        yVar.f88115b = beVar2;
        yVar.f88114a |= 1;
        C62910ar arVar3 = C32777d.f87948a;
        xVar.copyOnWrite();
        C32879y yVar2 = (C32879y) xVar.instance;
        arVar3.getClass();
        yVar2.f88117d = arVar3;
        yVar2.f88114a |= 4;
        return C60922j.m93044g(((C32603b) kVar.f343061e.get(str)).mo38180b((C32879y) xVar.build(), C32871q.SYNCHRONIZED_CACHE), C47810es.m84963c(C124241d.f343041a), kVar.f343059c);
    }
}
