package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Context;
import android.graphics.Point;
import android.support.constraint.C0129a;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110424k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bo */
/* compiled from: PG */
public final class C110356bo {

    /* renamed from: a */
    public static final C59071e f307570a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.bo");

    /* renamed from: b */
    public final C110424k f307571b;

    /* renamed from: c */
    public final Context f307572c;

    /* renamed from: d */
    public final View f307573d;

    /* renamed from: e */
    public final C22871g f307574e;

    /* renamed from: f */
    public final boolean f307575f;

    /* renamed from: g */
    public long f307576g;

    /* renamed from: h */
    final DisplayMetrics f307577h;

    /* renamed from: i */
    public Point f307578i;

    /* renamed from: j */
    public final C0129a f307579j;

    public C110356bo(Context context, View view, C68214a aVar, C22871g gVar, boolean z) {
        this.f307572c = context;
        this.f307577h = context.getResources().getDisplayMetrics();
        this.f307573d = view;
        this.f307574e = gVar;
        this.f307575f = z;
        this.f307571b = new C110424k((float) ((C86124t) aVar.mo27525b()).mo79747m(C90014bt.f247549jJ), (float) ((C86124t) aVar.mo27525b()).mo79747m(C90014bt.f247550jK));
        C0129a aVar2 = new C0129a(-2, -2);
        this.f307579j = aVar2;
        aVar2.f381n = 0;
        aVar2.f383p = 0;
        aVar2.f378k = 0;
    }

    /* renamed from: a */
    public final int mo98584a(int i) {
        return (int) (((float) i) * this.f307577h.density);
    }

    /* renamed from: b */
    public final int mo98585b(int i) {
        return (int) (((float) i) / this.f307577h.density);
    }
}
