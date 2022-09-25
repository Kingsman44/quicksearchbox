package com.google.android.libraries.web.p3408h.p3414b;

import android.net.Uri;
import com.google.android.libraries.web.p3353c.C43366k;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.h.b.p */
/* compiled from: PG */
final class C43802p extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Uri f114210a;

    /* renamed from: b */
    final /* synthetic */ C43366k f114211b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43802p(Uri uri, C43366k kVar) {
        super(0);
        this.f114210a = uri;
        this.f114211b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Uri uri = this.f114210a;
        C43366k kVar = this.f114211b;
        C69664n.m101061g(uri, "initialUrl");
        C69664n.m101061g(kVar, "triggerType");
        return new C43790d(uri, kVar);
    }
}
