package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.p6403a;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import androidx.core.p094f.C1888a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6371a.C81519a;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6402r.C82040g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a.k */
/* compiled from: PG */
public final class C82030k implements C82040g {

    /* renamed from: a */
    public static final C59071e f224242a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.r.a.k");

    /* renamed from: b */
    public final WallpaperManager.OnColorsChangedListener f224243b;

    /* renamed from: c */
    public final Context f224244c;

    /* renamed from: d */
    public final C22871g f224245d;

    /* renamed from: e */
    public final C83357g f224246e = new C83361k(false, C81519a.class);

    /* renamed from: f */
    private final C22871g f224247f;

    /* renamed from: g */
    private final C22871g f224248g;

    /* renamed from: h */
    private C60870cx f224249h = C60856cj.m92898g();

    /* renamed from: i */
    private C60870cx f224250i = C60856cj.m92898g();

    public C82030k(Context context, C22871g gVar, C22871g gVar2, C22871g gVar3) {
        this.f224244c = context;
        this.f224245d = gVar;
        this.f224247f = gVar2;
        this.f224248g = gVar3;
        this.f224243b = new C82028i(this, gVar);
    }

    /* renamed from: d */
    public static boolean m130291d(WallpaperColors wallpaperColors) {
        if (wallpaperColors == null) {
            return false;
        }
        if (C1888a.m5149c()) {
            return (wallpaperColors.getColorHints() & 1) != 0;
        }
        try {
            Object invoke = WallpaperColors.class.getMethod("getColorHints", new Class[0]).invoke(wallpaperColors, new Object[0]);
            return (invoke == null || (((Integer) invoke).intValue() & 1) == 0) ? false : true;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f224242a.mo56226d()).mo56382g(e)).mo56372aa(6467)).mo56386p("Could not call getColorHints");
        }
    }

    /* renamed from: a */
    public final C83358h mo75466a() {
        return this.f224246e;
    }

    /* renamed from: b */
    public final void mo75467b() {
        this.f224250i = this.f224247f.mo28201a("[NGA] addOnColorsChangedListener", new C82024e(this));
        C60870cx a = this.f224248g.mo28201a("[NGA] fetchWallpaperColors", new C82025f(this));
        this.f224249h = a;
        new C90873ag(a, this.f224245d, "isDarkTextSupported", new C82026g(this)).mo85223a(C82027h.f224238a);
    }

    /* renamed from: c */
    public final void mo75468c() {
        this.f224250i.cancel(true);
        WallpaperManager.getInstance(this.f224244c).removeOnColorsChangedListener(this.f224243b);
        this.f224249h.cancel(true);
    }
}
