package com.google.apps.tiktok.contrib.p3629c;

import android.app.Activity;
import android.view.View;
import androidx.core.app.C1816c;
import androidx.navigation.C3807af;
import androidx.navigation.C3863cd;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.contrib.c.e */
/* compiled from: PG */
public final /* synthetic */ class C46484e implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Activity f121631a;

    public /* synthetic */ C46484e(Activity activity) {
        this.f121631a = activity;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Activity activity = this.f121631a;
        C69664n.m101061g(activity, "activity");
        Object a = C1816c.m4986a(activity, R.id.podcasts_nav_host_container);
        C69664n.m101060f(a, "requireViewById<View>(activity, viewId)");
        C3807af c = C3863cd.m11148c((View) a);
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on 2131434773");
    }
}
