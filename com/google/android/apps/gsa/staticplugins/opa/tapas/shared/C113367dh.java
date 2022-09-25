package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88840x;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113518a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dh */
/* compiled from: PG */
public final class C113367dh {

    /* renamed from: a */
    public static final C59071e f313907a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dh");

    /* renamed from: b */
    public static final int f313908b = Color.argb(0, 0, 0, 0);

    /* renamed from: c */
    public final C91189au f313909c;

    /* renamed from: d */
    public final C113423fd f313910d;

    /* renamed from: e */
    public final C113251ad f313911e;

    /* renamed from: f */
    public final C22871g f313912f;

    /* renamed from: g */
    public final C22871g f313913g;

    /* renamed from: h */
    public final C86124t f313914h;

    public C113367dh(C91189au auVar, C113423fd fdVar, C113251ad adVar, C22871g gVar, C22871g gVar2, C86124t tVar) {
        this.f313909c = auVar;
        this.f313910d = fdVar;
        this.f313911e = adVar;
        this.f313912f = gVar;
        this.f313913g = gVar2;
        this.f313914h = tVar;
    }

    /* renamed from: a */
    public static C60870cx m187562a(int i, Context context) {
        try {
            Drawable drawable = context.getDrawable(i);
            if (drawable == null) {
                return C60856cj.m92899h(new C113366dg());
            }
            return C60856cj.m92900i(drawable);
        } catch (Resources.NotFoundException e) {
            return C60856cj.m92899h(new C113366dg(e));
        }
    }

    /* renamed from: b */
    public static C60870cx m187563b(Uri uri, Context context) {
        try {
            Drawable e = C90772bp.m148297e(context, uri);
            if (e == null) {
                return C60856cj.m92899h(new Resources.NotFoundException("Retrieving drawable returned null"));
            }
            return C60856cj.m92900i(e);
        } catch (Resources.NotFoundException | FileNotFoundException e2) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Drawable not found at uri: ".concat(String.valueOf(String.valueOf(uri))));
            notFoundException.initCause(e2);
            return C60856cj.m92899h(notFoundException);
        }
    }

    /* renamed from: c */
    public static void m187564c(ImageView imageView, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C113364de deVar = (C113364de) it.next();
            if (deVar != null) {
                m187566f(imageView, deVar, z);
                return;
            }
        }
        C59104x c = f313907a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SuggestionUiHelper");
        ((C59052c) ((C59052c) c).mo56372aa(27850)).mo56386p("Icon not set - all drawable fetches failed");
    }

    /* renamed from: e */
    public static void m187565e(ImageView imageView, String str) {
        imageView.setVisibility(0);
        C88840x xVar = new C88840x(imageView.getContext().getResources());
        xVar.mo82620a(str);
        xVar.mo82621b();
        imageView.setImageDrawable(xVar);
        imageView.setClickable(false);
    }

    /* renamed from: f */
    private static void m187566f(ImageView imageView, C113364de deVar, boolean z) {
        C113518a aVar;
        Bitmap bitmap;
        if (z) {
            C113518a aVar2 = new C113518a();
            Drawable drawable = deVar.f313905a;
            Bitmap bitmap2 = null;
            if (drawable != null) {
                if (drawable instanceof BitmapDrawable) {
                    bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    try {
                        if (drawable instanceof ColorDrawable) {
                            bitmap = Bitmap.createBitmap(2, 2, C113518a.f314289a);
                        } else {
                            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), C113518a.f314289a);
                        }
                        Canvas canvas = new Canvas(bitmap);
                        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        drawable.draw(canvas);
                        bitmap2 = bitmap;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            aVar2.f314290b = bitmap2;
            aVar2.invalidateSelf();
            aVar = aVar2;
        } else {
            aVar = deVar.f313905a;
        }
        deVar.f313906b.ifPresent(new C113355cz(imageView));
        imageView.setImageDrawable(aVar);
        imageView.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo100144d(ImageView imageView, C113363dd ddVar) {
        m187566f(imageView, new C113364de(new ColorDrawable(ddVar.mo99990a()), OptionalInt.empty()), ddVar.mo99992c());
        C60870cx o = C60856cj.m92906o((C58485gu) Collection.EL.stream(ddVar.mo99991b()).map(new C113350cu(this, imageView.getContext())).collect(C58370cn.f155946a));
        boolean c = ddVar.mo99992c();
        if (C90877ak.m148480n(o)) {
            m187564c(imageView, (List) C90877ak.m148474h(o), c);
        } else {
            new C90873ag(o, this.f313912f, "Fetching drawables for icon", new C113351cv(imageView, c)).mo85223a(C113352cw.f313878a);
        }
    }
}
