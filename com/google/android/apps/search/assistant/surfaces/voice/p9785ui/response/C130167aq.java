package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import android.support.p031v4.app.C0213ce;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.aq */
/* compiled from: PG */
final class C130167aq extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Fragment f356895a;

    /* renamed from: b */
    final /* synthetic */ Fragment f356896b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130167aq(Fragment fragment, Fragment fragment2) {
        super(1);
        this.f356895a = fragment;
        this.f356896b = fragment2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C0213ce ceVar = (C0213ce) obj;
        C69664n.m101061g(ceVar, "$this$childTransactNow");
        Fragment fragment = this.f356895a;
        Fragment fragment2 = this.f356896b;
        int i = C69649af.f186028a;
        if (!C69664n.m101066l(new C69657g(fragment.getClass()), new C69657g(fragment2.getClass()))) {
            ceVar.mo691x(R.anim.assistant_response_layer_content_fade_in, R.anim.assistant_response_layer_content_fade_out, 0, 0);
            C130169as.m212506a(ceVar, this.f356895a);
        }
        return C69788q.f186170a;
    }
}
