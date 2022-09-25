package com.google.android.apps.gsa.search.shared.media;

import android.content.Context;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87746ca;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87747cb;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.search.shared.media.g */
/* compiled from: PG */
public final class C87583g implements C118549h {

    /* renamed from: a */
    public static final C59071e f236626a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.media.g");

    /* renamed from: b */
    public final Context f236627b;

    /* renamed from: c */
    MediaBrowserCompat f236628c;

    /* renamed from: d */
    private final C22871g f236629d;

    public C87583g(Context context, C22871g gVar) {
        this.f236627b = context;
        this.f236629d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        Object obj2;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r0 = C62942bv.checkIsLite(C87747cb.f237498a);
        akVar.mo58887l(r0);
        Object l = akVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        String str = ((C87746ca) obj).f237495a;
        C62940bt r1 = C62942bv.checkIsLite(C87747cb.f237498a);
        akVar.mo58887l(r1);
        Object l2 = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l2 == null) {
            obj2 = r1.f169969b;
        } else {
            obj2 = r1.mo58889c(l2);
        }
        return C118826c.m197213c(this.f236629d.mo28207g("preconnect-to-mbs", new C87581e(this, str, ((C87746ca) obj2).f237496b)));
    }
}
