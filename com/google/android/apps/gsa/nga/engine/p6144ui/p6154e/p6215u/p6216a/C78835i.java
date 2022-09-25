package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6215u.p6216a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78236a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78817s;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6215u.C78826a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6215u.p6217b.C78837a;
import com.google.android.apps.gsa.nga.shared.android.IntentLauncherActivity;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80873s;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.search.assistant.p2566g.C33425t;
import com.google.android.libraries.search.assistant.p2566g.C33426u;
import com.google.android.libraries.search.assistant.p2566g.C33427v;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50537e;
import com.google.assistant.p3863av.p3867b.p3868a.p3869a.C50540h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C63088z;
import com.google.protobuf.contrib.android.ProtoParsers;
import com.google.protos.p4985f.p5042u.C65342d;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.u.a.i */
/* compiled from: PG */
public final class C78835i implements C78826a {

    /* renamed from: a */
    private static final C59071e f216965a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.u.a.i");

    /* renamed from: b */
    private final C58528ij f216966b;

    /* renamed from: c */
    private final C78236a f216967c;

    /* renamed from: d */
    private final C78817s f216968d;

    /* renamed from: e */
    private final C83358h f216969e;

    /* renamed from: f */
    private final C83358h f216970f;

    /* renamed from: g */
    private final Context f216971g;

    /* renamed from: h */
    private final C78837a f216972h;

    public C78835i(C78837a aVar, C83358h hVar, C83358h hVar2, Set set, C78236a aVar2, C78817s sVar, Context context) {
        this.f216972h = aVar;
        this.f216969e = hVar;
        this.f216970f = hVar2;
        this.f216966b = C58528ij.m90006F(set);
        this.f216967c = aVar2;
        this.f216968d = sVar;
        this.f216971g = context;
    }

    /* renamed from: a */
    public final void mo73629a() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5359)).mo56386p("onCancelClicked");
        Collection.EL.stream(this.f216966b).forEach(C78832f.f216962a);
        this.f216967c.mo73153a();
    }

    /* renamed from: b */
    public final void mo73630b() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5360)).mo56386p("onInputPlateInteraction");
        this.f216967c.mo73155c();
    }

    /* renamed from: c */
    public final void mo73631c() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5361)).mo56386p("onKeyboardClicked");
        Collection.EL.stream(this.f216966b).forEach(C78833g.f216963a);
        this.f216967c.mo73153a();
    }

    /* renamed from: d */
    public final void mo73632d() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5362)).mo56386p("onOpenAssistantSettings");
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "main_menu";
        IntentLauncherActivity.m128791a(this.f216972h.f216980a, c.mo24020b().mo24031a(), true, (Bundle) null);
        Collection.EL.stream(this.f216966b).forEach(C78834h.f216964a);
        this.f216967c.mo73153a();
    }

    /* renamed from: e */
    public final void mo73633e() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5363)).mo56386p("onSecondaryDisplayDismissClicked");
        if (!((C78224b) this.f216969e.mo76657c()).mo73148k(C89160q.DEMAND_STATE)) {
            Collection.EL.stream(this.f216966b).forEach(C78828b.f216958a);
            this.f216967c.mo73153a();
        }
    }

    /* renamed from: f */
    public final void mo73634f(C80873s sVar) {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5364)).mo56386p("onSuggestionLongpressAction");
        C50537e eVar = (C50537e) C50540h.f131534h.createBuilder();
        eVar.copyOnWrite();
        C50540h hVar = (C50540h) eVar.instance;
        hVar.f131542f = 2;
        hVar.f131537a |= 2;
        C33426u uVar = (C33426u) C33427v.f89523e.createBuilder();
        C33425t tVar = C33425t.SUGGESTIONS_DEBUG;
        uVar.copyOnWrite();
        C33427v vVar = (C33427v) uVar.instance;
        vVar.f89526b = tVar.f89522p;
        vVar.f89525a |= 1;
        C65342d dVar = sVar.f221824a;
        if (dVar == null) {
            dVar = C65342d.f176699e;
        }
        C63088z byteString = dVar.toByteString();
        uVar.copyOnWrite();
        C33427v vVar2 = (C33427v) uVar.instance;
        byteString.getClass();
        vVar2.f89525a = 2 | vVar2.f89525a;
        vVar2.f89527c = byteString;
        eVar.mo53407b((C33427v) uVar.build());
        Context context = this.f216971g;
        Intent addFlags = new Intent().setClassName(context, "com.google.android.apps.search.assistant.verticals.contextdebug.ContextDebugActivity").addFlags(268435456);
        ProtoParsers.m95531n(addFlags, "data", (C50540h) eVar.build());
        context.startActivity(addFlags);
    }

    /* renamed from: g */
    public final void mo73635g() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5365)).mo56386p("onSwipeDownToDismiss");
        if (!((C78224b) this.f216969e.mo76657c()).mo73148k(C89160q.DEMAND_STATE)) {
            this.f216966b.size();
            Collection.EL.stream(this.f216966b).forEach(C78827a.f216957a);
            this.f216967c.mo73153a();
        }
    }

    /* renamed from: h */
    public final void mo73636h() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5367)).mo56386p("onTapGleamToDismiss");
        if (!((C78224b) this.f216969e.mo76657c()).mo73148k(C89160q.DEMAND_STATE)) {
            this.f216966b.size();
            Collection.EL.stream(this.f216966b).forEach(C78829c.f216959a);
            this.f216967c.mo73153a();
        }
    }

    /* renamed from: i */
    public final void mo73637i() {
        C59071e eVar = f216965a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(5369)).mo56386p("onTouchInside");
        C78245d dVar = (C78245d) this.f216970f.mo76657c();
        int h = dVar.mo73180b().mo73175h();
        if (h == 0) {
            throw null;
        } else if (h == 3) {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(5370)).mo56386p("Current state is Idle. Ignoring onTouchInside.");
        } else {
            Collection.EL.stream(this.f216966b).forEach(C78832f.f216962a);
            if (!((C78224b) this.f216969e.mo76657c()).mo73148k(C89160q.DEMAND_STATE) && !dVar.mo73184g()) {
                this.f216968d.mo73619p();
            }
        }
    }

    /* renamed from: j */
    public final void mo73638j() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5371)).mo56386p("onTouchMic");
        Collection.EL.stream(this.f216966b).forEach(C78830d.f216960a);
    }

    /* renamed from: k */
    public final void mo73639k() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5372)).mo56386p("onTouchOutside");
        if (!((C78224b) this.f216969e.mo76657c()).mo73148k(C89160q.DEMAND_STATE)) {
            this.f216966b.size();
            Collection.EL.stream(this.f216966b).forEach(C78828b.f216958a);
            this.f216967c.mo73153a();
        }
    }

    /* renamed from: l */
    public final void mo73640l() {
        ((C59052c) ((C59052c) f216965a.mo56224b()).mo56372aa(5374)).mo56386p("onZeroStateClicked");
        Collection.EL.stream(this.f216966b).forEach(C78831e.f216961a);
        this.f216967c.mo73153a();
    }
}
