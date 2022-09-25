package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.elements.p1696a.C20380e;
import com.google.android.libraries.componentview.components.elements.p1696a.C20381f;
import com.google.android.libraries.componentview.components.elements.views.CarouselView;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20584bk;
import com.google.android.libraries.componentview.services.application.C20585bl;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56425d;
import com.google.p4271bq.C56426e;
import com.google.p4271bq.C56428g;
import com.google.p4271bq.C56429h;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.componentview.components.elements.i */
/* compiled from: PG */
public abstract class C20446i extends C20078ci implements C20456s {

    /* renamed from: w */
    private static Field f57484w;

    /* renamed from: x */
    private static Field f57485x;

    /* renamed from: A */
    private boolean f57486A;

    /* renamed from: a */
    public ImageButton f57487a;

    /* renamed from: b */
    public ImageButton f57488b;

    /* renamed from: c */
    public final ExecutorService f57489c;

    /* renamed from: g */
    public final C20601ca f57490g;

    /* renamed from: h */
    public LinearLayout f57491h;

    /* renamed from: i */
    public C20381f f57492i;

    /* renamed from: j */
    public int f57493j = 0;

    /* renamed from: k */
    public CarouselView f57494k;

    /* renamed from: l */
    public int f57495l = 0;

    /* renamed from: m */
    public boolean f57496m = false;

    /* renamed from: u */
    public boolean f57497u = false;

    /* renamed from: v */
    public int f57498v = 0;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    static {
        /*
            java.lang.Class<android.widget.HorizontalScrollView> r0 = android.widget.HorizontalScrollView.class
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0009:
            if (r3 >= r1) goto L_0x0049
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            int r6 = r5.hashCode()
            r7 = 1890888677(0x70b4abe5, float:4.4732088E29)
            r8 = 1
            if (r6 == r7) goto L_0x002b
            r7 = 2000476446(0x773cd91e, float:3.8302948E33)
            if (r6 == r7) goto L_0x0021
            goto L_0x0035
        L_0x0021:
            java.lang.String r6 = "mEdgeGlowLeft"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0035
            r5 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r6 = "mEdgeGlowRight"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0035
            r5 = 1
            goto L_0x0036
        L_0x0035:
            r5 = -1
        L_0x0036:
            if (r5 == 0) goto L_0x0041
            if (r5 == r8) goto L_0x003b
            goto L_0x0046
        L_0x003b:
            r4.setAccessible(r8)
            f57485x = r4
            goto L_0x0046
        L_0x0041:
            r4.setAccessible(r8)
            f57484w = r4
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.elements.C20446i.<clinit>():void");
    }

    public C20446i(Context context, C56425d dVar, C20537f fVar, Executor executor, ExecutorService executorService, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
        this.f57489c = executorService;
        this.f57490g = caVar;
    }

    /* renamed from: D */
    public final void mo25394D(int i) {
        if (this.f57486A) {
            float f = (float) i;
            int i2 = 0;
            this.f57487a.setVisibility(f > ((float) this.f57494k.getWidth()) * 0.25f ? 0 : 8);
            ImageButton imageButton = this.f57488b;
            if (f >= ((float) this.f57491h.getWidth()) - (((float) this.f57494k.getWidth()) * 1.25f)) {
                i2 = 8;
            }
            imageButton.setVisibility(i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.carousel, (ViewGroup) null);
        this.f57487a = (ImageButton) frameLayout.findViewById(R.id.nav_left);
        this.f57488b = (ImageButton) frameLayout.findViewById(R.id.nav_right);
        this.f57494k = (CarouselView) frameLayout.findViewById(R.id.carousel);
        this.f57491h = (LinearLayout) frameLayout.findViewById(R.id.carousel_content);
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        C20381f kF = mo25384kF(dVar);
        this.f57492i = kF;
        this.f57486A = kF.f57310e;
        this.f57493j = kF.f57308c;
        boolean z = false;
        if ((kF.f57306a & 2) != 0) {
            C19995r rVar = kF.f57309d;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            int a = C20566at.m38590a(rVar);
            if (!(f57484w == null || f57485x == null)) {
                try {
                    EdgeEffect edgeEffect = new EdgeEffect(this.f56304o);
                    edgeEffect.setColor(a);
                    EdgeEffect edgeEffect2 = new EdgeEffect(this.f56304o);
                    edgeEffect2.setColor(a);
                    f57484w.set(this.f57494k, edgeEffect);
                    f57485x.set(this.f57494k, edgeEffect2);
                } catch (IllegalAccessException e) {
                    C20520h.m38497b(6, "AbsCarouselEager", e, "Illegal access exception while trying to set overscroll color.", new Object[0]);
                }
            }
        }
        mo25256A(this.f57492i.f57307b);
        C20375a aVar = new C20375a(this, this.f57490g);
        this.f57494k.addOnAttachStateChangeListener(new C20426b(this, aVar));
        if (C2043bi.m5569aw(this.f57494k)) {
            this.f57494k.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
        if (this.f57486A) {
            this.f57487a.setOnClickListener(new C20440c(this, this.f57490g));
            this.f57488b.setOnClickListener(new C20441d(this, this.f57490g));
        }
        C56429h hVar = dVar.f150542d;
        if (hVar == null) {
            hVar = C56429h.f150547k;
        }
        if ((dVar.f150539a & 4) != 0) {
            z = true;
        }
        CarouselView carouselView = this.f57494k;
        C20444g gVar = new C20444g(this, z, hVar);
        C20601ca caVar = this.f57490g;
        carouselView.f57547b = gVar;
        carouselView.f57546a = caVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        int i = 0;
        int i2 = 0;
        while (i < this.f57491h.getChildCount() && (i2 = i2 + this.f57491h.getChildAt(i).getWidth()) < this.f57498v) {
            i++;
        }
        C20380e eVar = (C20380e) this.f57492i.toBuilder();
        if (i2 != 0) {
            eVar.copyOnWrite();
            C20381f fVar = (C20381f) eVar.instance;
            fVar.f57306a |= 1;
            fVar.f57308c = i;
        }
        if (list != null) {
            eVar.copyOnWrite();
            ((C20381f) eVar.instance).f57307b = C20381f.emptyProtobufList();
            eVar.mo25383a(list);
        }
        return mo25385kG(this.f57588z, (C20381f) eVar.build());
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }

    /* renamed from: m */
    public final void mo25395m(C20466w wVar, String str) {
        if (wVar.mo25419H() != null) {
            int a = C56428g.m87988a(((C56429h) wVar.f57578d.instance).f150552d);
            if (a != 0 && a != 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C20585bl((C56429h) wVar.f57578d.build(), C20584bk.SHOW));
                wVar.f57576b.mo25489d(str, C20585bl.m38624a(arrayList), ((C56429h) wVar.f57578d.instance).f150557i, (Map) null);
                C56426e eVar = wVar.f57578d;
                eVar.copyOnWrite();
                C56429h hVar = (C56429h) eVar.instance;
                hVar.f150552d = 0;
                hVar.f150549a |= 4;
                return;
            }
            return;
        }
        C20598by G = mo25418G();
        G.mo25535e(C19742a.EMPTY_LOG_INFO);
        G.mo25536f("Carousel Item has a empty logInfo");
        C20520h.m38498c("AbsCarouselEager", G.mo25531a(), this.f57490g, new Object[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo25259o(int i, View view) {
        this.f57491h.addView(view, i);
        view.getLayoutParams().height = -1;
    }
}
