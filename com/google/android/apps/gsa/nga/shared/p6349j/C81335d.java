package com.google.android.apps.gsa.nga.shared.p6349j;

import android.os.Bundle;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.nga.api.C74689ak;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.android.libraries.assistant.p1484g.p1502d.C18174k;
import com.google.android.libraries.assistant.p1484g.p1502d.C18175l;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52802d;
import com.google.assistant.p3931f.p3932a.p3933a.p3934a.p3935a.C52804f;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.j.d */
/* compiled from: PG */
final class C81335d extends C74689ak {

    /* renamed from: a */
    final /* synthetic */ C2164c f222612a;

    /* renamed from: b */
    final /* synthetic */ C18100a f222613b;

    /* renamed from: c */
    final /* synthetic */ Optional f222614c;

    /* renamed from: d */
    final /* synthetic */ C81337f f222615d;

    public C81335d(C81337f fVar, C2164c cVar, C18100a aVar, Optional optional) {
        this.f222615d = fVar;
        this.f222612a = cVar;
        this.f222613b = aVar;
        this.f222614c = optional;
    }

    /* renamed from: e */
    public final void mo75002e(String str, String str2) {
        int i;
        try {
            i = C18174k.m35382b(str);
        } catch (IllegalArgumentException unused) {
            i = 1;
        }
        this.f222612a.mo5439d(new C18175l(i, str2, (Throwable) null));
        this.f222615d.mo75005d(this.f222614c, C62722b.INTERNAL);
    }

    /* renamed from: f */
    public final void mo75003f(Bundle bundle) {
        try {
            this.f222612a.mo5437b(this.f222613b.mo23589c(bundle));
            this.f222615d.mo75005d(this.f222614c, C62722b.OK);
        } catch (C52802d e) {
            this.f222612a.mo5439d(C18175l.m35385c(e, 4));
            this.f222615d.mo75005d(this.f222614c, C62722b.DATA_LOSS);
        } catch (C52804f e2) {
            this.f222612a.mo5439d(C18175l.m35383a(e2));
            this.f222615d.mo75005d(this.f222614c, C62722b.UNKNOWN);
        }
    }
}
