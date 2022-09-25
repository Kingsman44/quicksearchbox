package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.Context;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.cb */
/* compiled from: PG */
public final class C103707cb implements C103651a {

    /* renamed from: c */
    private static final C59071e f288832c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.c.cb");

    /* renamed from: a */
    public final C87568k f288833a;

    /* renamed from: b */
    public final Context f288834b;

    /* renamed from: d */
    private final C22871g f288835d;

    public C103707cb(C87568k kVar, Context context, C22871g gVar) {
        this.f288833a = kVar;
        this.f288834b = context;
        this.f288835d = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        if (bnVar.f219917a == 31) {
            return this.f288835d.mo28201a("[NGA] ReadAloudRequestHandler.handleRequest", new C103706ca(this));
        }
        ((C59052c) ((C59052c) f288832c.mo56226d()).mo56372aa(21650)).mo56386p("Invalid request. Return empty.");
        return C60856cj.m92900i(C80275dd.f220288c);
    }
}
