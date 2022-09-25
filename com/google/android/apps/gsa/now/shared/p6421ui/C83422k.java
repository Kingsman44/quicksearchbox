package com.google.android.apps.gsa.now.shared.p6421ui;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.k */
/* compiled from: PG */
public final class C83422k extends C90953s {

    /* renamed from: a */
    public boolean f227394a;

    /* renamed from: b */
    private final WeakReference f227395b;

    protected C83422k(WebImageView webImageView) {
        super("WebImageView");
        this.f227395b = new WeakReference(webImageView);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        WebImageView webImageView;
        Drawable drawable = (Drawable) obj;
        C22872h.m42743c(C0826b.class);
        if (!this.f227394a && (webImageView = (WebImageView) this.f227395b.get()) != null) {
            C22872h.m42743c(C0826b.class);
            if (drawable == null) {
                if (webImageView.f227361k) {
                    webImageView.setVisibility(8);
                }
            } else if (webImageView.f227362l) {
                C59104x d = WebImageView.f227351f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "WebImageView");
                ((C59052c) ((C59052c) d).mo56372aa(6671)).mo56386p("Trying to handle image download after a cancel.");
                return;
            } else {
                drawable.setAutoMirrored(false);
                webImageView.setVisibility(0);
                webImageView.setImageDrawable(drawable);
                webImageView.mo76736g();
            }
            C83423l lVar = webImageView.f227358h;
            if (lVar != null) {
                lVar.mo76758a(drawable);
            }
        }
    }
}
