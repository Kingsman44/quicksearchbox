package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.support.p031v4.app.C0213ce;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69649af;
import p5462h.p5473f.p5475b.C69657g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.a */
/* compiled from: PG */
final class C129400a extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Fragment f355328a;

    /* renamed from: b */
    final /* synthetic */ Fragment f355329b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129400a(Fragment fragment, Fragment fragment2) {
        super(1);
        this.f355328a = fragment;
        this.f355329b = fragment2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C0213ce ceVar = (C0213ce) obj;
        C69664n.m101061g(ceVar, "$this$childTransactNow");
        Fragment fragment = this.f355328a;
        Fragment b = C129409b.m211277b(this.f355329b);
        if (b != null) {
            Class<?> cls = fragment.getClass();
            int i = C69649af.f186028a;
            if (!C69664n.m101066l(new C69657g(cls), new C69657g(b.getClass()))) {
                ceVar.mo691x(R.anim.assistant_input_feature_fade_in, R.anim.assistant_input_feature_fade_out, 0, 0);
            }
        }
        ceVar.mo689v(R.id.assistant_feature_container, this.f355328a, (String) null);
        C69664n.m101060f(ceVar, "replace(R.id.assistant_f…e_container, newFragment)");
        return C69788q.f186170a;
    }
}
