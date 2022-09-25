package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import android.net.Uri;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import p001a.p014d.p015a.p016a.C0043af;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ag */
/* compiled from: PG */
public final class C123299ag implements C123294ab {

    /* renamed from: a */
    public final C123295ac f341036a;

    /* renamed from: b */
    public final C123501ht f341037b;

    /* renamed from: c */
    public final C123331bl f341038c;

    /* renamed from: d */
    private final C123401ea f341039d;

    public C123299ag(C123295ac acVar, C123501ht htVar, C123401ea eaVar, C123331bl blVar) {
        this.f341036a = acVar;
        this.f341037b = htVar;
        this.f341039d = eaVar;
        this.f341038c = blVar;
    }

    /* renamed from: a */
    public final Optional mo105913a(String str) {
        C0043af c = this.f341037b.mo106023c(str);
        if (c.f117b == null) {
            return Optional.empty();
        }
        String str2 = (String) this.f341039d.mo106000b(str, Optional.empty()).map(C123298af.f341035a).orElse(str);
        C49192d dVar = c.f117b;
        if (dVar == null) {
            dVar = C49192d.f127199e;
        }
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder(dVar);
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        str2.getClass();
        dVar2.f127201a |= 2;
        dVar2.f127203c = str2;
        return Optional.m71637of((C49192d) cVar.build());
    }

    /* renamed from: b */
    public final Optional mo105914b(Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return Optional.empty();
        }
        C0043af d = this.f341037b.mo106024d(host, this.f341038c);
        if (d.f117b == null) {
            return Optional.empty();
        }
        Optional map = this.f341039d.mo106000b(host, Optional.m71637of(this.f341038c)).map(C123296ad.f341033a);
        String str = (String) this.f341039d.mo106001c(uri.toString(), Optional.m71637of(this.f341038c)).flatMap(C123297ae.f341034a).orElse(host);
        C49192d dVar = d.f117b;
        if (dVar == null) {
            dVar = C49192d.f127199e;
        }
        C49191c cVar = (C49191c) C49192d.f127199e.createBuilder(dVar);
        cVar.copyOnWrite();
        C49192d dVar2 = (C49192d) cVar.instance;
        str.getClass();
        dVar2.f127201a |= 4;
        dVar2.f127204d = str;
        if (map.isPresent()) {
            map.get();
            String str2 = (String) map.get();
            cVar.copyOnWrite();
            C49192d dVar3 = (C49192d) cVar.instance;
            str2.getClass();
            dVar3.f127201a |= 2;
            dVar3.f127203c = str2;
        }
        return Optional.m71637of((C49192d) cVar.build());
    }

    /* renamed from: c */
    public static Optional m202651c(C0043af afVar, int i) {
        if (afVar.f117b == null) {
            return Optional.empty();
        }
        if (i == 4) {
            if ((afVar.f116a & 2) != 0) {
                return Optional.m71637of(Float.valueOf(afVar.f127l));
            }
        } else if ((afVar.f116a & 1) != 0) {
            return Optional.m71637of(Float.valueOf(afVar.f126k));
        }
        return Optional.empty();
    }
}
