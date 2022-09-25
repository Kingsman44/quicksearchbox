package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9838c;

import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.activity.defaultactivity.FragmentHostDefaultActivity;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129538a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129539b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9828a.C129540c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129578c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129647z;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.c.b */
/* compiled from: PG */
public final class C129650b implements C129540c {

    /* renamed from: a */
    private final C0167am f355835a;

    public C129650b(C0167am amVar) {
        this.f355835a = amVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo109080a() {
        C129539b.m211487a(this);
    }

    /* renamed from: b */
    public final void mo109081b(C129538a aVar) {
        C69788q qVar;
        C69664n.m101061g(aVar, "reason");
        FragmentManager jw = this.f355835a.mo545jw();
        C69664n.m101060f(jw, "activity.supportFragmentManager");
        C129578c a = C129647z.m211697a(jw);
        if (a != null) {
            a.mo17754z().mo109144l(new C129649a(this, aVar));
            qVar = C69788q.f186170a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            mo109083d(aVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo109082c() {
        C129539b.m211488b(this);
    }

    /* renamed from: d */
    public final void mo109083d(C129538a aVar) {
        C69664n.m101061g(aVar, "reason");
        if (!(this.f355835a instanceof FragmentHostDefaultActivity) || aVar != C129538a.TOUCH_OUTSIDE) {
            this.f355835a.finishAndRemoveTask();
        } else {
            this.f355835a.moveTaskToBack(true);
        }
        this.f355835a.overridePendingTransition(0, 0);
    }
}
