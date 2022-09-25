package com.google.android.libraries.onegoogle.account.disc;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.widget.ImageView;
import androidx.p060c.C0977g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.p2378b.C30811a;
import com.google.android.libraries.onegoogle.p2378b.C30826c;
import com.google.android.libraries.onegoogle.p2378b.C30827d;
import com.google.android.libraries.onegoogle.p2378b.C30828e;
import com.google.android.libraries.onegoogle.p2378b.C30830g;
import com.google.android.libraries.onegoogle.p2378b.C30832i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.DesugarCollections;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.y */
/* compiled from: PG */
public final class C30225y implements C30213m {

    /* renamed from: a */
    public static final Map f81708a = DesugarCollections.synchronizedMap(new C0977g());

    /* renamed from: b */
    public static final Map f81709b = DesugarCollections.synchronizedMap(new C0977g());

    /* renamed from: c */
    private static final AtomicBoolean f81710c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ComponentCallbacks2 f81711d = new C30216p();

    /* renamed from: e */
    private final Executor f81712e;

    /* renamed from: f */
    private final C30828e f81713f;

    /* renamed from: g */
    private final C30158c f81714g;

    public C30225y(Executor executor, C30828e eVar, C30158c cVar) {
        this.f81712e = executor;
        this.f81713f = eVar;
        this.f81714g = cVar;
    }

    /* renamed from: b */
    public static C30828e m56157b(Context context, C30158c cVar, C30830g gVar) {
        C30832i iVar = new C30832i(context);
        C58485gu.m89844l(new C30827d[0]);
        if (gVar != null) {
            C30826c cVar2 = new C30826c();
            return new C30811a(gVar, new C30214n(iVar, cVar), cVar2, C58485gu.m89844l(new C30827d[]{C30827d.f83167a}));
        }
        throw new NullPointerException("Null imageRetriever");
    }

    /* renamed from: c */
    public static void m56158c(ImageView imageView, C30224x xVar) {
        C19559g.m37304c();
        C30224x xVar2 = (C30224x) imageView.getTag(R.id.tag_account_image_request);
        if (xVar2 != null) {
            xVar2.f81706e = true;
        }
        imageView.setTag(R.id.tag_account_image_request, xVar);
    }

    /* renamed from: a */
    public final void mo35680a(Object obj, ImageView imageView) {
        C19559g.m37304c();
        Context context = imageView.getContext();
        if (!f81710c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(f81711d);
        }
        C30224x xVar = new C30224x(obj, this.f81713f, imageView, this.f81712e, this.f81714g);
        m56158c(imageView, xVar);
        Executor executor = this.f81712e;
        Objects.requireNonNull(xVar);
        executor.execute(new C30215o(xVar));
    }
}
