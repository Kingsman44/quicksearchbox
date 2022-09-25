package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79879a;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79881c;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79882d;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79892n;
import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79893o;
import com.google.android.libraries.assistant.gallium.framework.C18238f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3817aj.p3818a.p3819a.C49190b;
import com.google.assistant.p3817aj.p3818a.p3819a.C49191c;
import com.google.assistant.p3817aj.p3818a.p3819a.C49192d;
import com.google.assistant.p3817aj.p3818a.p3819a.C49196h;
import com.google.assistant.p3817aj.p3818a.p3819a.C49197i;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5028p.p5029a.C64979f;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dr */
/* compiled from: PG */
public final class C123391dr {

    /* renamed from: a */
    private final C123510p f341153a;

    public C123391dr(C123510p pVar) {
        this.f341153a = pVar;
    }

    /* renamed from: c */
    private static Optional m202761c(String str) {
        Optional empty = Optional.empty();
        if (str.startsWith("https://") || str.startsWith("http://")) {
            return Optional.m71637of(Uri.parse(str));
        }
        return empty;
    }

    /* renamed from: a */
    public final C60870cx mo105997a(C123427f fVar, String str, C64979f fVar2) {
        Optional optional;
        C60870cx cxVar;
        Optional c = m202761c(str);
        String str2 = true != c.isPresent() ? str : "com.android.chrome";
        if (mo105998b(str)) {
            C123510p pVar = this.f341153a;
            String i = fVar.mo105929i();
            C58485gu h = fVar.mo105927h();
            int i2 = 4;
            if (!str2.equals("com.android.chrome") || !c.isPresent()) {
                optional = pVar.f341314c.mo105913a(str2);
                if (!optional.isPresent()) {
                    optional = Optional.ofNullable((C49192d) C123510p.f341312a.get(str2));
                }
            } else {
                Uri uri = (Uri) c.get();
                if (!Objects.equals(uri.getHost(), "www.google.com") || !Objects.equals(uri.getQueryParameter("tbm"), "isch")) {
                    optional = pVar.f341314c.mo105914b((Uri) c.get());
                } else {
                    C49191c cVar = (C49191c) C49192d.f127199e.createBuilder();
                    C49190b bVar = C49190b.GOOGLE_IMAGE_SEARCH;
                    cVar.copyOnWrite();
                    C49192d dVar = (C49192d) cVar.instance;
                    dVar.f127202b = bVar.f127198r;
                    dVar.f127201a |= 1;
                    cVar.copyOnWrite();
                    C49192d dVar2 = (C49192d) cVar.instance;
                    dVar2.f127201a |= 4;
                    dVar2.f127204d = "http://images.google.com/";
                    optional = Optional.m71637of((C49192d) cVar.build());
                }
            }
            if (optional.isEmpty()) {
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                C49192d dVar3 = (C49192d) optional.get();
                C49190b a = C49190b.m85387a(dVar3.f127202b);
                if (a == null) {
                    a = C49190b.OTHER;
                }
                a.name();
                String str3 = dVar3.f127203c;
                String str4 = dVar3.f127204d;
                float c2 = pVar.mo106029c(str2, c, 3);
                if (c2 > 1.0f) {
                    cxVar = C60856cj.m92900i(Optional.empty());
                } else {
                    C79892n nVar = (C79892n) C79893o.f218982d.createBuilder();
                    nVar.copyOnWrite();
                    C79893o oVar = (C79893o) nVar.instance;
                    i.getClass();
                    oVar.f218984a |= 1;
                    oVar.f218985b = i;
                    nVar.mo74272a(h);
                    C79893o oVar2 = (C79893o) nVar.build();
                    C49196h hVar = (C49196h) C49197i.f127208d.createBuilder();
                    C49190b a2 = C49190b.m85387a(dVar3.f127202b);
                    if (a2 == null) {
                        a2 = C49190b.OTHER;
                    }
                    switch (a2.ordinal()) {
                        case 1:
                            i2 = 2;
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            break;
                        case 4:
                            i2 = 5;
                            break;
                        case 7:
                            i2 = 7;
                            break;
                        case 8:
                            i2 = 10;
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            i2 = 26;
                            break;
                        case 14:
                            i2 = 16;
                            break;
                        case 15:
                            i2 = 17;
                            break;
                        default:
                            i2 = 1;
                            break;
                    }
                    hVar.copyOnWrite();
                    C49197i iVar = (C49197i) hVar.instance;
                    iVar.f127213c = i2 - 1;
                    iVar.f127211a |= 2;
                    hVar.copyOnWrite();
                    C49197i iVar2 = (C49197i) hVar.instance;
                    dVar3.getClass();
                    iVar2.f127212b = dVar3;
                    iVar2.f127211a |= 1;
                    C79882d dVar4 = (C79882d) C79885g.f218957h.createBuilder();
                    C79879a aVar = (C79879a) C79881c.f218947d.createBuilder();
                    aVar.copyOnWrite();
                    C79881c cVar2 = (C79881c) aVar.instance;
                    cVar2.f218950b = 3;
                    cVar2.f218949a |= 1;
                    dVar4.copyOnWrite();
                    C79885g gVar = (C79885g) dVar4.instance;
                    C79881c cVar3 = (C79881c) aVar.build();
                    cVar3.getClass();
                    gVar.f218963e = cVar3;
                    gVar.f218959a |= 8;
                    dVar4.copyOnWrite();
                    C79885g gVar2 = (C79885g) dVar4.instance;
                    oVar2.getClass();
                    gVar2.f218960b = oVar2;
                    gVar2.f218959a |= 1;
                    dVar4.mo58885m(C49197i.f127209e, (C49197i) hVar.build());
                    cxVar = C47633f.m84733g(fVar2.mo59322a(new C18238f(), (C79885g) dVar4.build())).mo51515h(new C123509o(pVar, c2, dVar3, i, h), pVar.f341316e);
                }
            }
            return C60922j.m93044g(cxVar, C47810es.m84963c(C123389dp.f341151a), C60826bg.f164896a);
        }
        C79892n nVar2 = (C79892n) C79893o.f218982d.createBuilder();
        String i3 = fVar.mo105929i();
        nVar2.copyOnWrite();
        C79893o oVar3 = (C79893o) nVar2.instance;
        i3.getClass();
        oVar3.f218984a |= 1;
        oVar3.f218985b = i3;
        nVar2.mo74272a(fVar.mo105927h());
        C79893o oVar4 = (C79893o) nVar2.build();
        C79882d dVar5 = (C79882d) C79885g.f218957h.createBuilder();
        dVar5.copyOnWrite();
        C79885g gVar3 = (C79885g) dVar5.instance;
        oVar4.getClass();
        gVar3.f218960b = oVar4;
        gVar3.f218959a |= 1;
        C79879a aVar2 = (C79879a) C79881c.f218947d.createBuilder();
        aVar2.copyOnWrite();
        C79881c cVar4 = (C79881c) aVar2.instance;
        cVar4.f218950b = 2;
        cVar4.f218949a |= 1;
        dVar5.copyOnWrite();
        C79885g gVar4 = (C79885g) dVar5.instance;
        C79881c cVar5 = (C79881c) aVar2.build();
        cVar5.getClass();
        gVar4.f218963e = cVar5;
        gVar4.f218959a |= 8;
        return C47633f.m84733g(fVar2.mo59322a(new C18238f(), (C79885g) dVar5.build())).mo51515h(C123390dq.f341152a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final boolean mo105998b(String str) {
        Optional c = m202761c(str);
        if (true == c.isPresent()) {
            str = "com.android.chrome";
        }
        if (this.f341153a.mo106027a(str, 3) || this.f341153a.mo106028b(c, 3)) {
            return true;
        }
        return false;
    }
}
