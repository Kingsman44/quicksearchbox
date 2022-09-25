package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6396b;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.C81921a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6397o.C81953a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q.C81993bc;
import com.google.android.apps.gsa.opa.p6447h.C83695a;
import com.google.android.apps.gsa.opa.p6447h.C83707m;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.r */
/* compiled from: PG */
public final class C81949r implements C83695a {

    /* renamed from: a */
    public static final C59071e f224057a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.r");

    /* renamed from: b */
    private final Context f224058b;

    /* renamed from: c */
    private final C83707m f224059c;

    /* renamed from: d */
    private final C81941j f224060d;

    /* renamed from: e */
    private final C81953a f224061e;

    /* renamed from: f */
    private final C81993bc f224062f;

    /* renamed from: g */
    private final Optional f224063g;

    public C81949r(Context context, C83707m mVar, C81941j jVar, C81953a aVar, C81993bc bcVar, Optional optional) {
        this.f224058b = context;
        this.f224059c = mVar;
        this.f224060d = jVar;
        this.f224063g = optional;
        this.f224062f = bcVar;
        this.f224061e = aVar;
    }

    /* renamed from: a */
    public final Presentation mo75402a() {
        Display a = C81921a.m130163a(this.f224058b);
        if (a == null) {
            return null;
        }
        return new C81948q(this.f224058b, a, this.f224059c, this.f224060d, this.f224061e, this.f224062f, this.f224063g);
    }
}
