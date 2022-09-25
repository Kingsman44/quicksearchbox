package com.google.android.apps.search.googleapp.stampviewer.webview.p10510g;

import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.AppCompatImageButton;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.saves.p10388b.C137230y;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.C43377v;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.g.d */
/* compiled from: PG */
public final class C139612d {

    /* renamed from: a */
    public static final C59071e f379510a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.g.d");

    /* renamed from: b */
    public final C139392b f379511b;

    /* renamed from: c */
    public final Fragment f379512c;

    /* renamed from: d */
    public final AccountId f379513d;

    /* renamed from: e */
    public final C28443m f379514e;

    /* renamed from: f */
    public final C28306ab f379515f;

    /* renamed from: g */
    public final C47770dh f379516g;

    /* renamed from: h */
    public final C46801dp f379517h;

    /* renamed from: i */
    public final C43377v f379518i;

    /* renamed from: j */
    public final C137230y f379519j;

    /* renamed from: k */
    public final C139613a f379520k = new C139613a();

    /* renamed from: l */
    public final C139614b f379521l = new C139614b();

    /* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.g.d$a */
    /* compiled from: PG */
    final class C139613a implements C46792di {
        public C139613a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C139612d.f379510a.mo56226d()).mo56382g(th)).mo56372aa(41404)).mo56386p("Failed to fetch page save state.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139612d dVar = C139612d.this;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            View view = dVar.f379512c.getView();
            AppCompatImageButton a = C139612d.m226945a(view);
            AppCompatImageButton b = C139612d.m226946b(view);
            if (booleanValue) {
                C28306ab abVar = dVar.f379515f;
                abVar.mo33802c(b, abVar.f76990a.mo33805a(C28427h.m53115a(145294)));
                b.setVisibility(0);
                a.setVisibility(8);
                return;
            }
            C28306ab abVar2 = dVar.f379515f;
            abVar2.mo33802c(a, abVar2.f76990a.mo33805a(C28427h.m53115a(144821)));
            a.setVisibility(0);
            b.setVisibility(8);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.g.d$b */
    /* compiled from: PG */
    final class C139614b implements C46792di {

        /* renamed from: b */
        private String f379524b = BuildConfig.FLAVOR;

        public C139614b() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C139612d.f379510a.mo56226d()).mo56382g(th)).mo56372aa(41405)).mo56386p("Failed to fetch WebState.");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C43376u uVar = (C43376u) obj;
            if (!uVar.f113329b.isEmpty() && !uVar.f113329b.equals(this.f379524b)) {
                C43369n a = C43369n.m76519a(uVar.f113330c);
                if (a == null) {
                    a = C43369n.UNSPECIFIED;
                }
                if (a == C43369n.SUCCESS) {
                    View view = C139612d.this.f379512c.getView();
                    AppCompatImageButton a2 = C139612d.m226945a(view);
                    AppCompatImageButton b = C139612d.m226946b(view);
                    a2.setEnabled(true);
                    b.setEnabled(true);
                    this.f379524b = uVar.f113329b;
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C139612d(C139392b bVar, Fragment fragment, AccountId accountId, C28443m mVar, C28306ab abVar, C47770dh dhVar, C46801dp dpVar, C43377v vVar, C137230y yVar) {
        this.f379511b = bVar;
        this.f379512c = fragment;
        this.f379513d = accountId;
        this.f379514e = mVar;
        this.f379515f = abVar;
        this.f379516g = dhVar;
        this.f379517h = dpVar;
        this.f379518i = vVar;
        this.f379519j = yVar;
    }

    /* renamed from: a */
    public static AppCompatImageButton m226945a(View view) {
        view.getClass();
        return (AppCompatImageButton) view.findViewById(R.id.googleapp_stamp_viewer_actionbutton_save);
    }

    /* renamed from: b */
    public static AppCompatImageButton m226946b(View view) {
        view.getClass();
        return (AppCompatImageButton) view.findViewById(R.id.googleapp_stamp_viewer_actionbutton_unsave);
    }
}
