package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.interaction;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127044b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127060r;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127109a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127110b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127112d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127116h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.assistant.p3897e.p3921j.C51682amp;
import com.google.assistant.p3897e.p3921j.aml;
import com.google.assistant.p3897e.p3921j.amm;
import com.google.assistant.p3897e.p3921j.amo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62934bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.interaction.InterpreterInteractionController */
/* compiled from: PG */
public final class InterpreterInteractionController implements C2376g {

    /* renamed from: a */
    public static final C59071e f356517a = C59071e.m91331h();

    /* renamed from: b */
    private final C127118j f356518b;

    /* renamed from: c */
    private final C46439e f356519c;

    /* renamed from: d */
    private final C1300003 f356520d = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) InterpreterInteractionController.f356517a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38594));
            cVar.mo56386p("Failed to stop interaction.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: e */
    private final C1299981 f356521e = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) InterpreterInteractionController.f356517a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38590));
            cVar.mo56386p("Failed to start interaction.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    /* renamed from: f */
    private final C1299992 f356522f = new C46440f() {
        /* renamed from: a */
        public final /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59052c cVar = (C59052c) ((C59052c) InterpreterInteractionController.f356517a.mo56226d()).mo56382g(th);
            cVar.mo56379ah(new C59094n(38592));
            cVar.mo56386p("Failed to start text interaction.");
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            Void voidR2 = (Void) obj2;
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public InterpreterInteractionController(C127118j jVar, C46439e eVar, Fragment fragment) {
        C69664n.m101061g(eVar, "futuresMixin");
        C69664n.m101061g(fragment, "fragment");
        this.f356518b = jVar;
        this.f356519c = eVar;
        fragment.getLifecycle().mo5790b(this);
    }

    /* renamed from: g */
    public final void mo109385g(String str, String str2) {
        C69664n.m101061g(str, "textQuery");
        C69664n.m101061g(str2, "locale");
        C46439e eVar = this.f356519c;
        C127118j jVar = this.f356518b;
        C127454b bVar = C127454b.TEXT_SUBMIT;
        amm amm = (amm) C51682amp.f135384d.createBuilder();
        C69664n.m101060f(amm, "newBuilder()");
        aml a = C69664n.m101061g(amm, "builder");
        a.mo53708c(str);
        a.mo53707b(amo.TRUSTED);
        C127110b c = C127407d.m208363c(bVar, a.mo53706a());
        C69664n.m101060f(c, "textQuery(\n             …          }\n            )");
        C62934bn builder = c.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C127112d a2 = C69664n.m101061g((C127109a) builder, "builder");
        C127044b bVar2 = (C127044b) C127045c.f349832d.createBuilder();
        C69664n.m101060f(bVar2, "newBuilder()");
        C127060r a3 = C69664n.m101061g(bVar2, "builder");
        a3.mo107912e();
        a3.mo107910c(str2);
        a2.mo107937b(a3.mo107908a());
        C46438d b = C46438d.m82810b(jVar.mo107931g(a2.mo107936a()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356522f);
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        this.f356519c.mo50429i(this.f356520d);
        this.f356519c.mo50429i(this.f356521e);
        this.f356519c.mo50429i(this.f356522f);
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

    /* renamed from: h */
    public final void mo109386h(String str) {
        C69664n.m101061g(str, "localeOverride");
        C46439e eVar = this.f356519c;
        C127118j jVar = this.f356518b;
        C127110b e = C127407d.m208365e(C127454b.MIC_ICON);
        C69664n.m101060f(e, "voiceQuery(SelfTriggerEntryPointType.MIC_ICON)");
        C62934bn builder = e.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C127112d a = C69664n.m101061g((C127109a) builder, "builder");
        C127044b bVar = (C127044b) C127045c.f349832d.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C127060r a2 = C69664n.m101061g(bVar, "builder");
        a2.mo107912e();
        a2.mo107910c(str);
        a.mo107937b(a2.mo107908a());
        C46438d b = C46438d.m82810b(jVar.mo107931g(a.mo107936a()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356521e);
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }

    /* renamed from: i */
    public final void mo109387i(String str, String str2) {
        C69664n.m101061g(str, "sourceLocale");
        C69664n.m101061g(str2, "targetLocale");
        C46439e eVar = this.f356519c;
        C127118j jVar = this.f356518b;
        C127110b e = C127407d.m208365e(C127454b.MIC_ICON);
        C69664n.m101060f(e, "voiceQuery(SelfTriggerEntryPointType.MIC_ICON)");
        C62934bn builder = e.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C127112d a = C69664n.m101061g((C127109a) builder, "builder");
        C127044b bVar = (C127044b) C127045c.f349832d.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C127060r a2 = C69664n.m101061g(bVar, "builder");
        a2.mo107912e();
        a2.mo107910c(str);
        a2.mo107912e();
        a2.mo107910c(str2);
        a.mo107937b(a2.mo107908a());
        C46438d b = C46438d.m82810b(jVar.mo107931g(a.mo107936a()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356521e);
    }

    /* renamed from: j */
    public final void mo109388j() {
        C46439e eVar = this.f356519c;
        C127118j jVar = this.f356518b;
        C127113e eVar2 = (C127113e) C127114f.f350009c.createBuilder();
        C69664n.m101060f(eVar2, "newBuilder()");
        C127116h a = C69664n.m101061g(eVar2, "builder");
        a.mo107939b(C127050h.UNSPECIFIED);
        C46438d b = C46438d.m82810b(jVar.mo107932h(a.mo107938a()));
        eVar.mo50428h(b.f121541a, (Object) null, this.f356520d);
    }
}
