package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.dx */
/* compiled from: PG */
public final class C108307dx extends C108192a {

    /* renamed from: a */
    public static final C59071e f301298a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.dx");

    /* renamed from: b */
    public final String f301299b;

    /* renamed from: c */
    private final Context f301300c;

    /* renamed from: d */
    private final C86124t f301301d;

    /* renamed from: e */
    private final C22871g f301302e;

    /* renamed from: f */
    private final C91189au f301303f;

    public C108307dx(Context context, C86124t tVar, C91189au auVar, String str, C22871g gVar) {
        this.f301300c = context;
        this.f301301d = tVar;
        this.f301303f = auVar;
        this.f301299b = str;
        this.f301302e = gVar;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 9;
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        C108321ej ejVar;
        if (!blVar.f301091r.hasOnClickListeners() && (ejVar = blVar.f301070T) != null) {
            blVar.f301091r.setOnLongClickListener(new C108306dw(this, ejVar));
        }
        blVar.f301091r.setAdjustViewBounds(true);
        ImageView imageView = blVar.f301091r;
        Context context = this.f301300c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        imageView.setMaxWidth((displayMetrics.widthPixels * ((int) this.f301301d.mo79743a(C90014bt.f247352fY))) / 100);
        if (this.f301303f != null && !TextUtils.isEmpty(this.f301299b)) {
            this.f301302e.mo28211k(this.f301303f.mo85421i(this.f301299b, blVar.f301091r), "Image loading", new C108305dv());
        }
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        blVar.f301091r.setOnClickListener((View.OnClickListener) null);
        blVar.f301091r.setOnLongClickListener((View.OnLongClickListener) null);
    }
}
