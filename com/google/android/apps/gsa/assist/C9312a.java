package com.google.android.apps.gsa.assist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.assist.p501a.C9316d;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assist.p503c.C9389b;
import com.google.android.apps.gsa.assist.p503c.p504a.C9388a;
import com.google.android.apps.gsa.assist.p507f.p508a.C9413b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90077eb;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assist.a */
/* compiled from: PG */
public final class C9312a {

    /* renamed from: a */
    private static final C59071e f32320a = C59071e.m91332i("com.google.android.apps.gsa.assist.a");

    /* renamed from: b */
    private final Context f32321b;

    /* renamed from: c */
    private final C90929bz f32322c;

    /* renamed from: d */
    private final C68214a f32323d;

    /* renamed from: e */
    private final C9321i f32324e;

    /* renamed from: f */
    private final C86124t f32325f;

    /* renamed from: g */
    private final C68214a f32326g;

    public C9312a(Context context, C90929bz bzVar, C68214a aVar, C9321i iVar, C86124t tVar, C68214a aVar2) {
        this.f32322c = bzVar;
        this.f32323d = aVar;
        this.f32324e = iVar;
        this.f32325f = tVar;
        this.f32326g = aVar2;
        this.f32321b = context;
    }

    /* renamed from: b */
    private final void m23743b(C9318f fVar) {
        boolean d = ((C9388a) this.f32326g.mo27525b()).mo17582d();
        C9321i iVar = this.f32324e;
        C9316d e = C9316d.m23756e(this.f32325f, fVar, d);
        iVar.mo17529f(fVar);
        iVar.mo17526c(fVar).f32338b = e;
    }

    /* renamed from: a */
    public final void mo17502a(Bundle bundle, Parcelable parcelable, Parcelable parcelable2, C9318f fVar, C9413b bVar, int i) {
        C9318f fVar2 = fVar;
        m23743b(fVar2);
        if (this.f32325f.mo79746e(C90077eb.f249793g)) {
            m23743b(C9318f.LIGHTWEIGHT);
        }
        if (this.f32324e.mo17532i(fVar2)) {
            m23743b(C9318f.SCREENSHOT);
        }
        boolean i2 = this.f32324e.mo17532i(fVar2);
        if (bundle == null || parcelable2 == null) {
            if (bundle == null) {
                ((C59052c) ((C59052c) f32320a.mo56225c()).mo56372aa('#')).mo56386p("null bundle");
            }
            if (parcelable2 == null) {
                ((C59052c) ((C59052c) f32320a.mo56225c()).mo56372aa('\"')).mo56386p("null content");
            }
            this.f32324e.mo17530g(C9418h.f32714k, fVar2);
            if (i2) {
                this.f32324e.mo17530g(C9418h.f32714k, C9318f.SCREENSHOT);
                return;
            }
            return;
        }
        if (this.f32325f.mo79746e(C90077eb.f249793g)) {
            this.f32322c.mo85139d(((C9389b) ((C58833ax) this.f32323d.mo27525b()).mo56107c()).mo17586a(bundle, parcelable, parcelable2, this.f32321b, bVar.mo17666b(), C9318f.LIGHTWEIGHT, i));
        }
        C60870cx d = this.f32322c.mo85139d(((C9389b) ((C58833ax) this.f32323d.mo27525b()).mo56107c()).mo17586a(bundle, parcelable, parcelable2, this.f32321b, bVar.mo17666b(), fVar, i));
        if (i2) {
            this.f32322c.mo85143h(d, ((C9389b) ((C58833ax) this.f32323d.mo27525b()).mo56107c()).mo17586a(bundle, parcelable, parcelable2, this.f32321b, bVar.mo17666b(), C9318f.SCREENSHOT, i));
        }
    }
}
