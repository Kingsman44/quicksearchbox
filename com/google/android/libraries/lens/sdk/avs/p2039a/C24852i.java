package com.google.android.libraries.lens.sdk.avs.p2039a;

import android.content.Context;
import android.util.Size;
import com.google.android.libraries.lens.sdk.avs.data.C24873h;
import com.google.android.libraries.lens.sdk.avs.data.C24874i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59906bo;
import com.google.common.p4552o.p4563i.C59913bv;
import com.google.common.p4552o.p4563i.C59914bw;
import com.google.common.p4552o.p4563i.C59915bx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.sdk.avs.a.i */
/* compiled from: PG */
public final class C24852i {

    /* renamed from: a */
    public final C58974d f67903a = C58974d.m91135i(getClass().getName());

    /* renamed from: b */
    public List f67904b = new ArrayList();

    /* renamed from: c */
    public final C24849f f67905c;

    /* renamed from: d */
    public C24873h f67906d;

    /* renamed from: e */
    public final C59906bo f67907e = ((C59906bo) C59915bx.f161935i.createBuilder());

    /* renamed from: f */
    public final Context f67908f;

    /* renamed from: g */
    private final C21370a f67909g;

    public C24852i(C24849f fVar, Context context, C21370a aVar) {
        this.f67905c = fVar;
        this.f67908f = context;
        this.f67909g = aVar;
    }

    /* renamed from: a */
    public final void mo30051a(Size size) {
        C59906bo boVar = this.f67907e;
        C59913bv bvVar = (C59913bv) C59914bw.f161930d.createBuilder();
        int width = size.getWidth();
        bvVar.copyOnWrite();
        C59914bw bwVar = (C59914bw) bvVar.instance;
        bwVar.f161932a |= 1;
        bwVar.f161933b = width;
        int height = size.getHeight();
        bvVar.copyOnWrite();
        C59914bw bwVar2 = (C59914bw) bvVar.instance;
        bwVar2.f161932a |= 2;
        bwVar2.f161934c = height;
        boVar.copyOnWrite();
        C59915bx bxVar = (C59915bx) boVar.instance;
        C59914bw bwVar3 = (C59914bw) bvVar.build();
        C59915bx bxVar2 = C59915bx.f161935i;
        bwVar3.getClass();
        bxVar.f161941e = bwVar3;
        bxVar.f161937a |= 64;
    }

    /* renamed from: b */
    public final void mo30052b(C24874i iVar) {
        long d = this.f67909g.mo26872d();
        if (iVar == C24874i.LENS_PRIME_SESSION_STOPPED) {
            C59915bx bxVar = (C59915bx) this.f67907e.build();
            for (C24848e e : this.f67904b) {
                e.mo30048e(iVar, bxVar, this.f67909g.mo26872d());
            }
            return;
        }
        for (C24848e f : this.f67904b) {
            f.mo30049f(iVar, d);
        }
    }
}
