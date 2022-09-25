package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import android.support.p031v4.app.Fragment;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import java.util.HashMap;
import java.util.Map;
import p5488io.p5490b.p5494b.C69802a;

/* compiled from: PG */
public final class ContentDisposableManager {

    /* renamed from: a */
    public final Map f367149a = new HashMap();

    public ContentDisposableManager(Fragment fragment) {
        fragment.getLifecycle().mo5790b(new C2376g() {
            /* renamed from: gV */
            public final /* synthetic */ void mo3520gV(C2391v vVar) {
            }

            /* renamed from: gW */
            public final void mo3521gW(C2391v vVar) {
                ContentDisposableManager.this.mo112038a();
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

            /* renamed from: ha */
            public final /* synthetic */ void mo3525ha(C2391v vVar) {
            }
        });
    }

    /* renamed from: a */
    public final void mo112038a() {
        for (C69802a dispose : this.f367149a.values()) {
            dispose.dispose();
        }
        this.f367149a.clear();
    }
}
