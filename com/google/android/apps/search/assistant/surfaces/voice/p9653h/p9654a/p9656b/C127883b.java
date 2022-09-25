package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b;

import android.content.pm.PackageManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127927f;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127932k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.a.b.b */
/* compiled from: PG */
public final class C127883b {

    /* renamed from: a */
    private static final C59071e f351990a = C59071e.m91331h();

    /* renamed from: b */
    private final PackageManager f351991b;

    public C127883b(PackageManager packageManager) {
        C69664n.m101061g(packageManager, "packageManager");
        this.f351991b = packageManager;
    }

    /* renamed from: a */
    public final Object mo108262a(String str) {
        C59071e eVar = f351990a;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56379ah(new C59094n(37572));
        cVar.mo56389s("FCF System FeatureName to check: %s", str);
        boolean hasSystemFeature = this.f351991b.hasSystemFeature(str);
        C59052c cVar2 = (C59052c) eVar.mo56224b();
        Boolean valueOf = Boolean.valueOf(hasSystemFeature);
        cVar2.mo56379ah(new C59094n(37573));
        cVar2.mo56389s("FCF: Device model check status : %s", valueOf);
        C127927f fVar = (C127927f) C127930i.f352147e.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C127932k a = C69664n.m101061g(fVar, "builder");
        C127927f fVar2 = a.f352152a;
        fVar2.copyOnWrite();
        C127930i iVar = (C127930i) fVar2.instance;
        iVar.f352149a = 1;
        iVar.f352150b = valueOf;
        return a.mo108278a();
    }
}
