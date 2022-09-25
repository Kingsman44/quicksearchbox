package com.google.android.libraries.lens.sdk.avs;

import android.util.Size;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24877l;
import com.google.android.libraries.lens.sdk.avs.data.RenderableGleam;
import com.google.android.libraries.lens.sdk.avs.p2039a.C24852i;
import com.google.android.libraries.lens.sdk.avs.p2042c.C24862a;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.p4563i.C59906bo;
import com.google.common.p4552o.p4563i.C59915bx;
import com.google.common.util.concurrent.C60845bz;
import com.google.lens.p4701g.C62308cd;
import com.google.lens.p4701g.C62323cs;
import com.google.lens.p4701g.C62324ct;
import com.google.lens.p4701g.C62333db;
import com.google.lens.p4705i.p4706a.C62377h;
import com.google.lens.p4705i.p4706a.C62383n;
import com.google.lens.p4705i.p4706a.C62395z;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.sdk.avs.f */
/* compiled from: PG */
final class C24889f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Size f67977a;

    /* renamed from: b */
    final /* synthetic */ C24876k f67978b;

    /* renamed from: c */
    final /* synthetic */ C24890g f67979c;

    public C24889f(C24890g gVar, Size size, C24876k kVar) {
        this.f67979c = gVar;
        this.f67977a = size;
        this.f67978b = kVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) C24890g.f67980a.mo56224b()).mo56372aa(48862)).mo56386p("Failed to get Proactive result from engine output");
        this.f67979c.f67982c.f67907e.mo57061a(12);
        this.f67979c.f67982c.mo30051a(this.f67977a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C62308cd cdVar = (C62308cd) obj;
        this.f67979c.f67982c.mo30052b(C24874i.LENS_PRIME_QUERY_RESPONSE);
        this.f67979c.f67982c.mo30051a(this.f67977a);
        C24890g gVar = this.f67979c;
        if ((cdVar.f168202a & 32) != 0) {
            gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_PARTICLE_EXTRACTION_PASSED);
        }
        if ((cdVar.f168202a & 8) != 0) {
            C62383n nVar = cdVar.f168205d;
            if (nVar == null) {
                nVar = C62383n.f168403e;
            }
            if (nVar.f168407c) {
                gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_TEXT_PIPELINE_DENYLIST_TERMINATION);
            }
        }
        if ((cdVar.f168202a & 8) != 0) {
            C62383n nVar2 = cdVar.f168205d;
            if (nVar2 == null) {
                nVar2 = C62383n.f168403e;
            }
            if (nVar2.f168408d) {
                gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_TEXT_PIPELINE_WITH_SHOPPING_DOMAIN_PASSED);
            }
        }
        if ((cdVar.f168202a & 2) != 0) {
            C62333db dbVar = cdVar.f168203b;
            if (dbVar == null) {
                dbVar = C62333db.f168274e;
            }
            if (dbVar.f168277b) {
                gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_SHOPPING_CLASSIFICATION_PASSED);
            }
        }
        C62324ct ctVar = cdVar.f168204c;
        if (ctVar == null) {
            ctVar = C62324ct.f168237e;
        }
        int a = C62323cs.m94766a(ctVar.f168241c);
        if (a == 0 || a == 1) {
            C62324ct ctVar2 = cdVar.f168204c;
            if (ctVar2 == null) {
                ctVar2 = C62324ct.f168237e;
            }
            if (!ctVar2.f168240b) {
                gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_SENSITIVITY_CLASSIFICATION_PASSED);
            }
        }
        C62377h hVar = cdVar.f168206e;
        if (hVar == null) {
            hVar = C62377h.f168391c;
        }
        C19665d dVar = hVar.f168394b;
        if (dVar == null) {
            dVar = C19665d.f54690b;
        }
        if (dVar.f54692a.size() > 0) {
            gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_RAID_DETECTIONS_FOUND);
            C24852i iVar = gVar.f67982c;
            C62377h hVar2 = cdVar.f168206e;
            if (hVar2 == null) {
                hVar2 = C62377h.f168391c;
            }
            C19665d dVar2 = hVar2.f168394b;
            if (dVar2 == null) {
                dVar2 = C19665d.f54690b;
            }
            int size = dVar2.f54692a.size();
            C59906bo boVar = iVar.f67907e;
            boVar.copyOnWrite();
            C59915bx bxVar = (C59915bx) boVar.instance;
            C59915bx bxVar2 = C59915bx.f161935i;
            bxVar.f161937a |= 256;
            bxVar.f161943g = (long) size;
        }
        C62377h hVar3 = cdVar.f168206e;
        if (hVar3 == null) {
            hVar3 = C62377h.f168391c;
        }
        C62395z zVar = hVar3.f168393a;
        if (zVar == null) {
            zVar = C62395z.f168436b;
        }
        C19665d dVar3 = zVar.f168438a;
        if (dVar3 == null) {
            dVar3 = C19665d.f54690b;
        }
        if (dVar3.f54692a.size() > 0) {
            gVar.f67982c.mo30052b(C24874i.LENS_PROACTIVE_POST_SALIENCY_DETECTIONS_FOUND);
            C24852i iVar2 = gVar.f67982c;
            C62377h hVar4 = cdVar.f168206e;
            if (hVar4 == null) {
                hVar4 = C62377h.f168391c;
            }
            C62395z zVar2 = hVar4.f168393a;
            if (zVar2 == null) {
                zVar2 = C62395z.f168436b;
            }
            C19665d dVar4 = zVar2.f168438a;
            if (dVar4 == null) {
                dVar4 = C19665d.f54690b;
            }
            int size2 = dVar4.f54692a.size();
            C59906bo boVar2 = iVar2.f67907e;
            boVar2.copyOnWrite();
            C59915bx bxVar3 = (C59915bx) boVar2.instance;
            C59915bx bxVar4 = C59915bx.f161935i;
            bxVar3.f161937a |= 512;
            bxVar3.f161944h = (long) size2;
        }
        C24897n nVar3 = (C24897n) this.f67979c.f67983d.get();
        int a2 = this.f67978b.mo30087a();
        Size size3 = this.f67977a;
        C24877l lVar = new C24877l();
        lVar.mo30096e(a2);
        C62377h hVar5 = cdVar.f168206e;
        C62395z zVar3 = (hVar5 == null ? C62377h.f168391c : hVar5).f168393a;
        if (zVar3 == null) {
            zVar3 = C62395z.f168436b;
        }
        if (zVar3.f168438a != null) {
            if (hVar5 == null) {
                hVar5 = C62377h.f168391c;
            }
            C62395z zVar4 = hVar5.f168393a;
            if (zVar4 == null) {
                zVar4 = C62395z.f168436b;
            }
            C19665d dVar5 = zVar4.f168438a;
            if (dVar5 == null) {
                dVar5 = C19665d.f54690b;
            }
            lVar.mo30095d((RenderableGleam[]) ((List) Collection.EL.stream(dVar5.f54692a).map(new C24862a(size3)).collect(C58370cn.f155946a)).toArray(new RenderableGleam[0]));
        }
        nVar3.mo30122b(lVar);
    }
}
