package com.google.android.apps.search.podcasts.p10572j;

import android.util.Base64;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10591p.C140749o;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4565k.C60079a;
import com.google.common.p4552o.p4565k.C60080b;
import com.google.p4225bm.p4228b.C56110a;
import com.google.p4225bm.p4228b.C56111b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4820d.p4828e.C63245c;
import com.google.protos.p4816ai.p4820d.p4828e.C63246d;
import com.google.protos.p4816ai.p4820d.p4828e.C63248f;
import com.google.protos.p4816ai.p4820d.p4828e.C63249g;
import com.google.protos.p4816ai.p4820d.p4828e.C63250h;
import com.google.protos.p4816ai.p4820d.p4828e.C63251i;
import com.google.protos.p4816ai.p4820d.p4828e.C63252j;
import com.google.protos.p4816ai.p4820d.p4828e.C63253k;
import com.google.protos.p4816ai.p4820d.p4828e.C63254l;
import com.google.protos.p4816ai.p4820d.p4828e.C63255m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.j.b */
/* compiled from: PG */
public final class C140418b {

    /* renamed from: a */
    private final C38768q f381418a;

    /* renamed from: b */
    private final C21370a f381419b;

    /* renamed from: c */
    private final C140749o f381420c;

    /* renamed from: d */
    private long f381421d = -1;

    /* renamed from: e */
    private long f381422e = -1;

    /* renamed from: f */
    private long f381423f = -1;

    /* renamed from: g */
    private long f381424g = -1;

    /* renamed from: h */
    private int f381425h;

    /* renamed from: i */
    private final String f381426i;

    /* renamed from: j */
    private final C63255m f381427j;

    /* renamed from: k */
    private int f381428k = 4;

    /* renamed from: l */
    private int f381429l = 1;

    public C140418b(C38768q qVar, C21370a aVar, C140749o oVar, C140641b bVar) {
        this.f381418a = qVar;
        this.f381419b = aVar;
        this.f381420c = oVar;
        byte[] bArr = new byte[12];
        for (int i = 0; i < 12; i++) {
            bArr[i] = (byte) ((int) Math.floor(Math.random() * 256.0d));
        }
        String encodeToString = Base64.encodeToString(bArr, 0);
        C69664n.m101060f(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        this.f381426i = encodeToString;
        C63252j jVar = (C63252j) C63255m.f170914c.createBuilder();
        C63253k kVar = (C63253k) C63254l.f170907f.createBuilder();
        String str = bVar.f381975b;
        kVar.copyOnWrite();
        C63254l lVar = (C63254l) kVar.instance;
        str.getClass();
        lVar.f170909a = 4 | lVar.f170909a;
        lVar.f170912d = str;
        String str2 = bVar.f381978e;
        kVar.copyOnWrite();
        C63254l lVar2 = (C63254l) kVar.instance;
        str2.getClass();
        lVar2.f170909a |= 8;
        lVar2.f170913e = str2;
        C140646b bVar2 = bVar.f381974a;
        String str3 = (bVar2 == null ? C140646b.f381993r : bVar2).f382001g;
        kVar.copyOnWrite();
        C63254l lVar3 = (C63254l) kVar.instance;
        str3.getClass();
        lVar3.f170909a |= 2;
        lVar3.f170911c = str3;
        C140646b bVar3 = bVar.f381974a;
        String str4 = (bVar3 == null ? C140646b.f381993r : bVar3).f381995a;
        kVar.copyOnWrite();
        C63254l lVar4 = (C63254l) kVar.instance;
        str4.getClass();
        lVar4.f170909a |= 1;
        lVar4.f170910b = str4;
        jVar.copyOnWrite();
        C63255m mVar = (C63255m) jVar.instance;
        C63254l lVar5 = (C63254l) kVar.build();
        lVar5.getClass();
        mVar.f170917b = lVar5;
        mVar.f170916a = 1 | mVar.f170916a;
        C62942bv build = jVar.build();
        C69664n.m101060f(build, "newBuilder()\n      .setM…l)\n      )\n      .build()");
        this.f381427j = (C63255m) build;
    }

    /* renamed from: b */
    public static final int m228130b(Integer num) {
        if (num != null && num.intValue() == 3) {
            return 2;
        }
        if (num != null && num.intValue() == 6) {
            return 1;
        }
        return 4;
    }

    /* renamed from: c */
    private static final boolean m228131c(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: a */
    public final void mo115659a(int i, long j) {
        int i2 = i;
        long j2 = j;
        C19559g.m37304c();
        long c = this.f381419b.mo26871c();
        this.f381422e = j2;
        this.f381424g = c;
        if (m228131c(this.f381428k)) {
            boolean z = i2 == 3;
            if (z || c - this.f381423f >= 500) {
                C63245c cVar = (C63245c) C63246d.f170887f.createBuilder();
                C63255m mVar = this.f381427j;
                cVar.copyOnWrite();
                C63246d dVar = (C63246d) cVar.instance;
                mVar.getClass();
                dVar.f170890b = mVar;
                dVar.f170889a |= 1;
                cVar.copyOnWrite();
                C63246d dVar2 = (C63246d) cVar.instance;
                dVar2.f170889a |= 2;
                dVar2.f170891c = z;
                C63250h hVar = (C63250h) C63251i.f170902d.createBuilder();
                int i3 = this.f381425h;
                hVar.copyOnWrite();
                C63251i iVar = (C63251i) hVar.instance;
                iVar.f170904a |= 2;
                iVar.f170906c = i3;
                String str = this.f381426i;
                hVar.copyOnWrite();
                C63251i iVar2 = (C63251i) hVar.instance;
                str.getClass();
                iVar2.f170904a |= 1;
                iVar2.f170905b = str;
                cVar.copyOnWrite();
                C63246d dVar3 = (C63246d) cVar.instance;
                C63251i iVar3 = (C63251i) hVar.build();
                iVar3.getClass();
                dVar3.f170893e = iVar3;
                dVar3.f170889a |= 8;
                C63248f fVar = (C63248f) C63249g.f170895f.createBuilder();
                long j3 = this.f381421d;
                fVar.copyOnWrite();
                C63249g gVar = (C63249g) fVar.instance;
                gVar.f170897a |= 1;
                gVar.f170898b = j3;
                long j4 = this.f381422e;
                fVar.copyOnWrite();
                C63249g gVar2 = (C63249g) fVar.instance;
                gVar2.f170897a |= 2;
                gVar2.f170899c = j4;
                long j5 = this.f381424g;
                long j6 = this.f381423f;
                fVar.copyOnWrite();
                C63249g gVar3 = (C63249g) fVar.instance;
                gVar3.f170897a |= 4;
                gVar3.f170900d = j5 - j6;
                int i4 = this.f381429l;
                fVar.copyOnWrite();
                C63249g gVar4 = (C63249g) fVar.instance;
                int i5 = i4 - 1;
                if (i4 != 0) {
                    gVar4.f170901e = i5;
                    gVar4.f170897a |= 8;
                    cVar.copyOnWrite();
                    C63246d dVar4 = (C63246d) cVar.instance;
                    C63249g gVar5 = (C63249g) fVar.build();
                    gVar5.getClass();
                    dVar4.f170892d = gVar5;
                    dVar4.f170889a |= 4;
                    C62942bv build = cVar.build();
                    C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
                    C63246d dVar5 = (C63246d) build;
                    C140749o oVar = this.f381420c;
                    C63249g gVar6 = dVar5.f170892d;
                    if (gVar6 == null) {
                        gVar6 = C63249g.f170895f;
                    }
                    ((C19567d) oVar.f382198a.f102834aR.mo6453a()).mo24822a((long) ((int) gVar6.f170900d), oVar.mo115852a());
                    C38768q qVar = this.f381418a;
                    C59743a aVar = C59743a.PODCASTS_LISTEN_EVENT;
                    C62940bt btVar = C60080b.f162434d;
                    C60079a aVar2 = (C60079a) C60080b.f162433c.createBuilder();
                    C56110a aVar3 = (C56110a) C56111b.f149471c.createBuilder();
                    aVar3.copyOnWrite();
                    C56111b bVar = (C56111b) aVar3.instance;
                    dVar5.getClass();
                    bVar.f149474b = dVar5;
                    bVar.f149473a |= 1;
                    aVar2.copyOnWrite();
                    C60080b bVar2 = (C60080b) aVar2.instance;
                    C56111b bVar3 = (C56111b) aVar3.build();
                    bVar3.getClass();
                    bVar2.f162437b = bVar3;
                    bVar2.f162436a |= 1;
                    qVar.mo41590b(aVar, btVar, aVar2.build());
                    this.f381425h++;
                } else {
                    throw null;
                }
            }
        }
        this.f381428k = i2;
        if (m228131c(i)) {
            this.f381421d = j2;
            this.f381423f = c;
            this.f381429l = i2 == 1 ? 3 : 2;
        }
    }
}
