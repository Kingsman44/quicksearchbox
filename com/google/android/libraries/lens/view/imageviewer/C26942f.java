package com.google.android.libraries.lens.view.imageviewer;

import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.widget.C0745iz;
import android.view.MenuItem;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25514at;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.libraries.lens.view.imageviewer.f */
/* compiled from: PG */
public final /* synthetic */ class C26942f implements C0745iz {

    /* renamed from: a */
    public final /* synthetic */ C26944h f73439a;

    public /* synthetic */ C26942f(C26944h hVar) {
        this.f73439a = hVar;
    }

    /* renamed from: a */
    public final boolean mo1222a(MenuItem menuItem) {
        C26944h hVar = this.f73439a;
        if (((C0480t) menuItem).f1682a != R.id.image_viewer_send_feedback) {
            return false;
        }
        C47393f.m84236g(new C25514at("Image Viewer Menu"), hVar.f73442b);
        return true;
    }
}
