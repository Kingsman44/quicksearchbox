package com.google.android.apps.search.googleapp.tabs.manager;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.apps.search.googleapp.tabs.manager.d */
/* compiled from: PG */
public final class C139737d {

    /* renamed from: a */
    public final Context f379826a;

    /* renamed from: b */
    public final TabView f379827b;

    /* renamed from: c */
    public final C47770dh f379828c;

    /* renamed from: d */
    public final C28306ab f379829d;

    /* renamed from: e */
    public final C28310af f379830e;

    /* renamed from: f */
    public final C28443m f379831f;

    /* renamed from: g */
    public final ImageView f379832g;

    /* renamed from: h */
    public final View f379833h;

    public C139737d(Context context, TabView tabView, C28306ab abVar, C28310af afVar, C28443m mVar, C47770dh dhVar) {
        this.f379826a = context;
        this.f379827b = tabView;
        this.f379829d = abVar;
        this.f379830e = afVar;
        this.f379831f = mVar;
        this.f379828c = dhVar;
        this.f379832g = (ImageView) tabView.findViewById(R.id.googleapp_tabs_manager_tab_screenshot);
        this.f379833h = tabView.findViewById(R.id.googleapp_tabs_manager_tab_close_button);
    }
}
