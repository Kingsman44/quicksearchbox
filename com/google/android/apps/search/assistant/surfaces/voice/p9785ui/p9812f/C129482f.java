package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129537a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129541aa;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129564af;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129648c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129653d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129659f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129685s;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129687u;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129688v;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129691y;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.f */
/* compiled from: PG */
public final class C129482f extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ boolean f355490a;

    /* renamed from: b */
    final /* synthetic */ C129564af f355491b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129482f(boolean z, C129564af afVar) {
        super(0);
        this.f355490a = z;
        this.f355491b = afVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C129541aa aaVar;
        if (this.f355490a) {
            aaVar = this.f355491b.mo109104a();
        } else {
            C129691y yVar = (C129691y) C129541aa.f355591c.createBuilder();
            C129685s sVar = (C129685s) C129688v.f355911c.createBuilder();
            C129687u uVar = C129687u.TRANSIENT_ACTIVITY;
            sVar.copyOnWrite();
            C129688v vVar = (C129688v) sVar.instance;
            vVar.f355914b = uVar.f355910e;
            vVar.f355913a |= 1;
            yVar.copyOnWrite();
            C129541aa aaVar2 = (C129541aa) yVar.instance;
            C129688v vVar2 = (C129688v) sVar.build();
            vVar2.getClass();
            aaVar2.f355594b = vVar2;
            aaVar2.f355593a = 1;
            C62942bv build = yVar.build();
            C69664n.m101060f(build, "{\n            Host.newBu…     .build()\n          }");
            aaVar = (C129541aa) build;
        }
        C129537a aVar = (C129537a) C129653d.f355840d.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C129659f a = C69664n.m101061g(aVar, "builder");
        a.mo109164c(aaVar);
        a.mo109163b(C129648c.DISMISS_CONFIGURATION_ALWAYS);
        return a.mo109162a();
    }
}
