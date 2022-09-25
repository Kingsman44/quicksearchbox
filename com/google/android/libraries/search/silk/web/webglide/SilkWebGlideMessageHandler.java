package com.google.android.libraries.search.silk.web.webglide;

import androidx.lifecycle.C2391v;
import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.search.silk.web.core.SilkCoreFeature;
import com.google.android.libraries.silk.event.C41889a;
import com.google.android.libraries.silk.event.C41896d;
import com.google.android.libraries.silk.p3205a.p3210ad.C41713a;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3407g.C43773b;
import com.google.android.libraries.web.p3408h.p3409a.p3410a.C43775a;
import com.google.android.libraries.web.postmessage.C43952c;
import com.google.android.libraries.web.postmessage.internal.C43960g;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.contrib.C44088f;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56632b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4294ad.C56638h;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class SilkWebGlideMessageHandler implements C44088f, C43773b {

    /* renamed from: a */
    static final C43775a f108076a = new C43775a("silk_web_glide_port");

    /* renamed from: b */
    static final C58485gu f108077b = C58485gu.m89844l(new String[]{"openWebPages"});

    /* renamed from: c */
    static final C58485gu f108078c = C58485gu.m89844l(new String[]{"ResultTapped", "CloseTapped"});

    /* renamed from: h */
    public static final /* synthetic */ int f108079h = 0;

    /* renamed from: d */
    public final C43952c f108080d;

    /* renamed from: e */
    public final C40769f f108081e;

    /* renamed from: f */
    public final C41896d f108082f;

    /* renamed from: g */
    public final C41896d f108083g;

    /* renamed from: i */
    private final C44084b f108084i;

    /* renamed from: j */
    private final C43269t f108085j;

    /* renamed from: k */
    private final boolean f108086k;

    public SilkWebGlideMessageHandler(C44084b bVar, C40769f fVar, C43960g gVar, C41889a aVar, C43269t tVar, Optional optional) {
        this.f108084i = bVar;
        this.f108080d = gVar.mo46957a(f108076a);
        this.f108081e = fVar;
        this.f108082f = aVar.mo44349a(C56638h.class);
        this.f108083g = aVar.mo44349a(C56632b.class);
        this.f108085j = tVar;
        this.f108086k = ((Boolean) optional.orElse(false)).booleanValue();
    }

    /* renamed from: h */
    private final void m72326h() {
        C58838bb.m90887v(this.f108085j.mo46384b().mo46300c(SilkCoreFeature.class), "Silk %s API requires SilkCoreFeature to work in WebX. Please add SilkCoreFeature to your WebConfig", "WebGlide");
        this.f108084i.mo47055a(SilkWebGlideFeature.class, C41713a.class).ifPresent(new C41359f(this));
    }

    /* renamed from: g */
    public final void mo42597g() {
        if (!this.f108086k) {
            m72326h();
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        if (this.f108086k) {
            m72326h();
        }
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
