package com.google.android.apps.education.bloom.mathview.render.comm;

import android.os.Bundle;
import java.util.ArrayList;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.education.bloom.mathview.render.comm.a */
/* compiled from: PG */
final class C9057a extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Bundle f31287a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9057a(Bundle bundle) {
        super(0);
        this.f31287a = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Bundle bundle = this.f31287a;
        C69664n.m101058d(bundle);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("commands");
        C69664n.m101058d(parcelableArrayList);
        return parcelableArrayList;
    }
}
