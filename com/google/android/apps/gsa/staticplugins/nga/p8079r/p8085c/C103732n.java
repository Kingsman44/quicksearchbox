package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.Context;
import android.media.session.MediaSessionManager;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.search.core.google.p6790a.C85810bb;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.n */
/* compiled from: PG */
public final class C103732n implements C103651a {

    /* renamed from: a */
    public static final C58974d f288882a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f288883b;

    /* renamed from: c */
    public final C85810bb f288884c;

    /* renamed from: d */
    public final MediaSessionManager f288885d;

    /* renamed from: e */
    public final C91142g f288886e;

    /* renamed from: f */
    private final C22871g f288887f;

    public C103732n(Context context, C22871g gVar, C85810bb bbVar, C91142g gVar2) {
        this.f288883b = context;
        this.f288887f = gVar;
        this.f288884c = bbVar;
        this.f288886e = gVar2;
        this.f288885d = (MediaSessionManager) Objects.requireNonNull((MediaSessionManager) context.getSystemService("media_session"));
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        return this.f288887f.mo28201a("[NGA] ConversationParamsHandler.handleRequest", new C103731m(this, bnVar));
    }
}
