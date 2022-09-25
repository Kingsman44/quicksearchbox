package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gs */
/* compiled from: PG */
public final /* synthetic */ class C109130gs implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f303892a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f303893b;

    /* renamed from: c */
    public final /* synthetic */ C63088z f303894c;

    /* renamed from: d */
    public final /* synthetic */ String f303895d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f303896e;

    public /* synthetic */ C109130gs(C109258hw hwVar, C58833ax axVar, C63088z zVar, String str, C58833ax axVar2) {
        this.f303892a = hwVar;
        this.f303893b = axVar;
        this.f303894c = zVar;
        this.f303895d = str;
        this.f303896e = axVar2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109258hw hwVar = this.f303892a;
        C58833ax axVar = this.f303893b;
        C63088z zVar = this.f303894c;
        String str = this.f303895d;
        C58833ax axVar2 = this.f303896e;
        ((C59052c) ((C59052c) ((C59052c) C109258hw.f304227a.mo56226d()).mo56382g((Exception) obj)).mo56372aa(22768)).mo56386p("Failed to get TNG renderer, use classic renderer.");
        hwVar.mo97725p(axVar, zVar, str, axVar2);
        ((C89859i) hwVar.f304292o.mo27525b()).mo83702b(C89849ae.ASSISTANT_OPA_CLIENTOP_RENDER_END);
    }
}
