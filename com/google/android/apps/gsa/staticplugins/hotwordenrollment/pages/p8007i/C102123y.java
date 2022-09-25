package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.app.PendingIntent;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.activity.result.C0816c;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.p046a.C0814g;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92421a;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92422b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C102230s;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101763c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.gms.kids.C144432d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.assistant.p3861at.C50380uy;
import com.google.assistant.p3861at.acz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.y */
/* compiled from: PG */
public final class C102123y {

    /* renamed from: a */
    public static final C59071e f284894a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.y");

    /* renamed from: b */
    static final Duration f284895b = Duration.ofSeconds(5);

    /* renamed from: c */
    public final l f284896c;

    /* renamed from: d */
    public final C74555u f284897d;

    /* renamed from: e */
    public final C144432d f284898e;

    /* renamed from: f */
    public final C102120v f284899f;

    /* renamed from: g */
    public final C102230s f284900g;

    /* renamed from: h */
    public final C86054o f284901h;

    /* renamed from: i */
    public final C101497ae f284902i;

    /* renamed from: j */
    public final C46439e f284903j;

    /* renamed from: k */
    public final C102124a f284904k = new C102124a();

    /* renamed from: l */
    public final C46440f f284905l = new C102125b();

    /* renamed from: m */
    public final C0816c f284906m;

    /* renamed from: n */
    public final String f284907n;

    /* renamed from: o */
    public final C101495ac f284908o;

    /* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.y$a */
    /* compiled from: PG */
    final class C102124a implements C46440f {
        public C102124a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C102123y yVar = C102123y.this;
            yVar.mo92894c(yVar.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_error_message));
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C92421a aVar = (C92421a) C92422b.f257764c.createBuilder();
            C50380uy uyVar = ((acz) ((ProtoParsers.ParcelableProto) obj2).mo58938a(acz.f129010n, C62921ba.m95368a())).f129024m;
            if (uyVar == null) {
                uyVar = C50380uy.f131144b;
            }
            String str = uyVar.f131146a;
            aVar.copyOnWrite();
            C92422b bVar = (C92422b) aVar.instance;
            str.getClass();
            bVar.f257766a |= 1;
            bVar.f257767b = str;
            C102123y yVar = C102123y.this;
            yVar.f284908o.f283241a = (C92422b) aVar.build();
            C47393f.m84236g(new C101783w(), yVar.f284899f);
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    /* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.y$b */
    /* compiled from: PG */
    final class C102125b implements C46440f {
        public C102125b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C102123y yVar = C102123y.this;
            yVar.mo92894c(yVar.f284899f.getString(R.string.assistant_unicorn_parent_reauth_permission_error_message));
            C59104x d = C102123y.f284894a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ParentReuathPermissionFrag");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(20540)).mo56389s("%s", th.getMessage());
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            C102123y.this.f284906m.mo526b(new IntentSenderRequest(((PendingIntent) obj2).getIntentSender(), (Intent) null, 0, 0));
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C102123y(l lVar, C74555u uVar, C144432d dVar, C46439e eVar, C102230s sVar, C86054o oVar, C102120v vVar, C101497ae aeVar, C101495ac acVar, String str) {
        this.f284896c = lVar;
        this.f284897d = uVar;
        this.f284898e = dVar;
        this.f284899f = vVar;
        this.f284903j = eVar;
        this.f284900g = sVar;
        this.f284901h = oVar;
        this.f284902i = aeVar;
        this.f284908o = acVar;
        this.f284906m = vVar.registerForActivityResult(new C0814g(), new C102126z(this));
        this.f284907n = str;
    }

    /* renamed from: a */
    public static C102120v m169142a(C101781u uVar) {
        C102120v vVar = new C102120v();
        C68324h.m98669f(vVar);
        C47243l.m84039a(vVar, uVar);
        return vVar;
    }

    /* renamed from: b */
    public final void mo92893b() {
        C101763c cVar = new C101763c();
        cVar.mo92556b(0);
        C47393f.m84236g(cVar.mo92555a(), this.f284899f);
    }

    /* renamed from: c */
    public final void mo92894c(String str) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.f284899f.requireActivity(), 2132150742);
        View view = this.f284899f.getView();
        view.getClass();
        Snackbar.m79661q(contextThemeWrapper, view, str, 0).mo48343h();
    }
}
