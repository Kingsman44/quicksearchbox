package com.google.android.apps.search.googleapp.stampviewer.webview.p10503d;

import android.support.p033v7.widget.AppCompatImageButton;
import android.view.View;
import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139377c;
import com.google.android.apps.search.googleapp.stampviewer.p10490d.C139380f;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56610b;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.d.e */
/* compiled from: PG */
public final class C139544e {

    /* renamed from: a */
    public static final C59071e f379384a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.d.e");

    /* renamed from: b */
    public final C28443m f379385b;

    /* renamed from: c */
    public final C47770dh f379386c;

    /* renamed from: d */
    public final C28306ab f379387d;

    /* renamed from: e */
    public final C139392b f379388e;

    /* renamed from: f */
    public final C46801dp f379389f;

    /* renamed from: g */
    public final C139377c f379390g;

    /* renamed from: h */
    public final C139541b f379391h;

    /* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.d.e$a */
    /* compiled from: PG */
    final class C139545a implements C46792di {
        public C139545a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59052c cVar = (C59052c) ((C59052c) ((C59052c) C139544e.f379384a.mo56225c()).mo56382g(th)).mo56372aa(41388);
            C56610b bVar = C139544e.this.f379388e.f379032b;
            if (bVar == null) {
                bVar = C56610b.f151140k;
            }
            cVar.mo56389s("Cannot fetch heart state for story with URL: %s", bVar.f151143b);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C139380f fVar = (C139380f) obj;
            View view = C139544e.this.f379391h.getView();
            if (view != null) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.googleapp_stamp_viewer_actionbutton_heart);
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) view.findViewById(R.id.googleapp_stamp_viewer_actionbutton_unheart);
                if (fVar.mo114932b()) {
                    appCompatImageButton.setVisibility(8);
                    appCompatImageButton2.setVisibility(0);
                }
                if (!fVar.mo114932b()) {
                    appCompatImageButton.setVisibility(0);
                    appCompatImageButton2.setVisibility(8);
                }
            }
        }

        /* renamed from: c */
        public final void mo18079c() {
        }
    }

    public C139544e(C28443m mVar, C47770dh dhVar, C28306ab abVar, C139392b bVar, C46801dp dpVar, C139377c cVar, C139541b bVar2) {
        this.f379385b = mVar;
        this.f379388e = bVar;
        this.f379386c = dhVar;
        this.f379387d = abVar;
        this.f379389f = dpVar;
        this.f379390g = cVar;
        this.f379391h = bVar2;
    }
}
