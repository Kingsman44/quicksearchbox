package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a.C76428z;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.d */
/* compiled from: PG */
public final class C76431d extends C79360j {

    /* renamed from: a */
    public static final C58974d f211575a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f211576b;

    /* renamed from: c */
    public final C91142g f211577c;

    /* renamed from: d */
    public final C76428z f211578d;

    /* renamed from: e */
    public final AtomicReference f211579e = new AtomicReference(C58729pv.f156485a);

    /* renamed from: f */
    private final C22871g f211580f;

    public C76431d(Context context, C91142g gVar, C76428z zVar, C22871g gVar2, C76092h hVar, C79359i iVar) {
        super(iVar, hVar);
        this.f211576b = context;
        this.f211577c = gVar;
        this.f211578d = zVar;
        this.f211580f = gVar2;
    }

    /* renamed from: b */
    public static C76450w m123049b(Context context) {
        C76450w wVar = C76450w.f211621b;
        try {
            try {
                return (C76450w) C62942bv.parseFrom((C62942bv) C76450w.f211621b, context.getResources().openRawResource(R.raw.prefetch_filter_rules_pb));
            } catch (IOException e) {
                ((C58970a) ((C58970a) ((C58970a) f211575a.mo56226d()).mo56382g(e)).mo56372aa(3552)).mo56386p("Converting from input stream to PrefetchFilterRulesSet caused an exception.");
                return wVar;
            }
        } catch (Resources.NotFoundException e2) {
            ((C58970a) ((C58970a) ((C58970a) f211575a.mo56226d()).mo56382g(e2)).mo56372aa(3553)).mo56386p("Prefetch filter config resource not found.");
            return wVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f211580f.mo28201a("[NGA] PrefetchFilter.ctor.initializeRules", new C76430c(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f211579e.set(C58729pv.f156485a);
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "PrefetchFilter";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 19;
    }
}
