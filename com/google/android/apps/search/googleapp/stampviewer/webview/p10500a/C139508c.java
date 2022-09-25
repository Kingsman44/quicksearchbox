package com.google.android.apps.search.googleapp.stampviewer.webview.p10500a;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.favicon.C43549h;
import com.google.android.libraries.web.contrib.favicon.C43550i;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.a.c */
/* compiled from: PG */
public final class C139508c {

    /* renamed from: a */
    public final C139510d f379317a = new C139510d(this);

    /* renamed from: b */
    public final C139509a f379318b = new C139509a();

    /* renamed from: c */
    public final C47449e f379319c;

    /* renamed from: d */
    public final C139507b f379320d;

    /* renamed from: e */
    public final C43549h f379321e;

    /* renamed from: f */
    public final C46801dp f379322f;

    /* renamed from: g */
    public final C47770dh f379323g;

    /* renamed from: h */
    public final C139392b f379324h;

    /* renamed from: i */
    public boolean f379325i = false;

    /* renamed from: j */
    public boolean f379326j = false;

    /* renamed from: k */
    public Bitmap f379327k = null;

    /* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.a.c$a */
    /* compiled from: PG */
    final class C139509a implements C46792di {
        public C139509a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            ImageView imageView;
            C43550i iVar = (C43550i) obj;
            if (iVar.mo46599a() == 3) {
                View view = C139508c.this.f379320d.getView();
                C139508c.this.f379327k = iVar.mo46603b();
                if (view != null) {
                    C139508c cVar = C139508c.this;
                    if (!cVar.f379325i && cVar.f379326j && (imageView = (ImageView) view.findViewById(R.id.googleapp_stamp_viewer_badge_image)) != null) {
                        imageView.setAdjustViewBounds(false);
                        imageView.setImageBitmap(C139508c.this.f379327k);
                    }
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C139508c(C47449e eVar, C139507b bVar, C43549h hVar, C46801dp dpVar, C47770dh dhVar, C139392b bVar2) {
        this.f379319c = eVar;
        this.f379320d = bVar;
        this.f379321e = hVar;
        this.f379322f = dpVar;
        this.f379323g = dhVar;
        this.f379324h = bVar2;
    }
}
