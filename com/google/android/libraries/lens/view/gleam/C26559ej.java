package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.PointF;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.livingsurfaces.C27260s;
import com.google.android.libraries.lens.view.p2069am.C25310ar;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2178x.C28211e;
import com.google.android.libraries.lens.view.p2178x.C28221o;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.gleam.ej */
/* compiled from: PG */
public final class C26559ej extends C26565el implements C26553ed {

    /* renamed from: K */
    public static final /* synthetic */ int f72381K = 0;

    /* renamed from: A */
    public boolean f72382A;

    /* renamed from: B */
    public boolean f72383B;

    /* renamed from: C */
    public C25310ar f72384C = C25310ar.f68865c;

    /* renamed from: D */
    public C58485gu f72385D = C58485gu.m89845m();

    /* renamed from: E */
    public boolean f72386E;

    /* renamed from: F */
    public int f72387F = -1;

    /* renamed from: G */
    public final C26463av f72388G;

    /* renamed from: H */
    public C26581fa f72389H;

    /* renamed from: I */
    C26447af f72390I = null;

    /* renamed from: J */
    public C26527de f72391J;

    /* renamed from: M */
    private final ObjectGleamLayerView f72392M;

    /* renamed from: N */
    private final TranslationLayerView f72393N;

    /* renamed from: O */
    private final TranslationLayerView f72394O;

    /* renamed from: a */
    public final C37215b f72395a;

    /* renamed from: b */
    public final C21370a f72396b;

    /* renamed from: c */
    public final C26244b f72397c;

    /* renamed from: d */
    public final C26457ap f72398d;

    /* renamed from: e */
    public final C26571er f72399e;

    /* renamed from: f */
    public final HomographyTrackedTextContainerView f72400f;

    /* renamed from: g */
    public final HomographyTrackedTextContainerView f72401g;

    /* renamed from: h */
    public final C25989d f72402h;

    /* renamed from: i */
    public final GleamingView f72403i;

    /* renamed from: j */
    public final C28221o f72404j;

    /* renamed from: k */
    public final C26507cl f72405k;

    /* renamed from: l */
    public final LayoutInflater f72406l;

    /* renamed from: m */
    public final C27260s f72407m;

    /* renamed from: n */
    public final C26120dc f72408n;

    /* renamed from: o */
    public final C47449e f72409o;

    /* renamed from: p */
    public final C58833ax f72410p;

    /* renamed from: q */
    public final ScrimView f72411q;

    /* renamed from: r */
    public final Context f72412r;

    /* renamed from: s */
    public final GestureDetector f72413s;

    /* renamed from: t */
    public final float f72414t;

    /* renamed from: u */
    public final float f72415u;

    /* renamed from: v */
    public final boolean f72416v;

    /* renamed from: w */
    public final C26637y f72417w;

    /* renamed from: x */
    public final boolean f72418x;

    /* renamed from: y */
    public final boolean f72419y;

    /* renamed from: z */
    public C28211e f72420z;

    /* renamed from: com.google.android.libraries.lens.view.gleam.ej$a */
    /* compiled from: PG */
    final class C26560a implements C47388b {
    }

    /* renamed from: com.google.android.libraries.lens.view.gleam.ej$b */
    /* compiled from: PG */
    final class C26561b implements C47388b {

        /* renamed from: a */
        public final C26441a f72421a;

        /* renamed from: b */
        public final PointF f72422b;

        public C26561b(C26441a aVar, PointF pointF) {
            this.f72421a = aVar;
            this.f72422b = pointF;
        }
    }

    /* renamed from: com.google.android.libraries.lens.view.gleam.ej$c */
    /* compiled from: PG */
    final class C26562c implements C47388b {

        /* renamed from: a */
        public final C26447af f72423a;

        public C26562c(C26447af afVar) {
            this.f72423a = afVar;
        }
    }

    /* renamed from: com.google.android.libraries.lens.view.gleam.ej$d */
    /* compiled from: PG */
    final class C26563d implements C47388b {

        /* renamed from: a */
        public final C26447af f72424a;

        public C26563d(C26447af afVar) {
            this.f72424a = afVar;
        }
    }

    static {
        C58974d.m91135i("GleamingView");
    }

    public C26559ej(C37215b bVar, C26244b bVar2, C21370a aVar, C26457ap apVar, C26576ew ewVar, C25989d dVar, GleamingView gleamingView, C28221o oVar, C26571er erVar, C47449e eVar, C58833ax axVar, C27260s sVar, C26120dc dcVar, C47274n nVar, long j, long j2, boolean z, boolean z2, boolean z3, C26637y yVar) {
        C26457ap apVar2 = apVar;
        GleamingView gleamingView2 = gleamingView;
        C26571er erVar2 = erVar;
        C26120dc dcVar2 = dcVar;
        C47274n nVar2 = nVar;
        boolean z4 = z2;
        this.f72395a = bVar;
        this.f72397c = bVar2;
        this.f72396b = aVar;
        this.f72398d = apVar2;
        this.f72402h = dVar;
        this.f72403i = gleamingView2;
        this.f72404j = oVar;
        this.f72399e = erVar2;
        this.f72409o = eVar;
        this.f72410p = axVar;
        this.f72407m = sVar;
        this.f72408n = dcVar2;
        this.f72412r = nVar2;
        this.f72414t = m49050g((float) j, nVar2);
        this.f72415u = m49050g((float) j2, nVar2);
        this.f72416v = z;
        this.f72417w = yVar;
        this.f72418x = z4;
        this.f72419y = z3;
        this.f72388G = new C26463av(nVar2);
        ScrimView scrimView = (ScrimView) gleamingView2.findViewById(R.id.scrim_view);
        this.f72411q = scrimView;
        scrimView.f71949c = apVar2;
        C28211e a = oVar.mo33727a();
        this.f72420z = a;
        a.mo33726c();
        if (z4) {
            ObjectLayerView objectLayerView = (ObjectLayerView) gleamingView2.findViewById(R.id.object_layer_view);
            objectLayerView.f71943c = apVar2;
            objectLayerView.f71941a = ewVar;
        }
        ObjectGleamLayerView objectGleamLayerView = (ObjectGleamLayerView) gleamingView2.findViewById(R.id.object_gleam_layer_view);
        this.f72392M = objectGleamLayerView;
        objectGleamLayerView.f71939a = apVar2;
        TranslationLayerView translationLayerView = (TranslationLayerView) gleamingView2.findViewById(R.id.translation_inpainting_view);
        this.f72393N = translationLayerView;
        translationLayerView.f71961a = apVar2;
        TranslationLayerView translationLayerView2 = (TranslationLayerView) gleamingView2.findViewById(R.id.translation_text_view);
        this.f72394O = translationLayerView2;
        translationLayerView2.f71961a = apVar2;
        HomographyTrackedTextContainerView homographyTrackedTextContainerView = (HomographyTrackedTextContainerView) gleamingView2.findViewById(R.id.homography_tracked_inpainting_view);
        this.f72400f = homographyTrackedTextContainerView;
        homographyTrackedTextContainerView.f71936a = erVar2;
        HomographyTrackedTextContainerView homographyTrackedTextContainerView2 = (HomographyTrackedTextContainerView) gleamingView2.findViewById(R.id.homography_tracked_text_view);
        this.f72401g = homographyTrackedTextContainerView2;
        homographyTrackedTextContainerView2.f71936a = erVar2;
        this.f72406l = LayoutInflater.from(nVar);
        C26507cl clVar = new C26507cl(objectGleamLayerView, gleamingView2);
        this.f72405k = clVar;
        C2043bi.m5526T(objectGleamLayerView, clVar);
        this.f72413s = new GestureDetector(nVar2, new C26558ei(gleamingView2));
        dcVar2.mo31312e(new C26554ee(this));
    }

    /* renamed from: g */
    private static float m49050g(float f, Context context) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public final float mo31819a() {
        return Math.max(mo31825d().getScaleX(), mo31825d().getScaleY());
    }

    /* renamed from: b */
    public final void mo31820b() {
        this.f72403i.performHapticFeedback(1);
    }

    /* renamed from: c */
    public final PointF mo31824c(MotionEvent motionEvent) {
        return new PointF(motionEvent.getX() / ((float) this.f72403i.getWidth()), motionEvent.getY() / ((float) this.f72403i.getHeight()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final View mo31825d() {
        return this.f72403i.getParent() instanceof View ? (View) this.f72403i.getParent() : this.f72403i;
    }

    /* renamed from: e */
    public final C58833ax mo31826e(float f, float f2) {
        PointF pointF = new PointF(f, f2);
        C26457ap apVar = this.f72398d;
        float a = mo31819a();
        C58485gu guVar = apVar.f72053b;
        int i = ((C58724pq) guVar).f156474d;
        float f3 = Float.MAX_VALUE;
        C26447af afVar = null;
        C26447af afVar2 = null;
        C26447af afVar3 = null;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            C26447af afVar4 = (C26447af) guVar.get(i2);
            if (!afVar4.f72001l && afVar4.mo31671A()) {
                float U = afVar4.mo31663U(pointF);
                C25349y yVar = C25349y.UNKNOWN;
                C25349y a2 = C25349y.m46667a(afVar4.f71963a.f68848i);
                if (a2 == null) {
                    a2 = C25349y.UNRECOGNIZED;
                }
                switch (a2.ordinal()) {
                    case 4:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        if (U >= f5) {
                            break;
                        } else {
                            afVar = afVar4;
                            f5 = U;
                            break;
                        }
                    case 5:
                        if (U >= f3) {
                            break;
                        } else {
                            afVar2 = afVar4;
                            f3 = U;
                            break;
                        }
                    case 11:
                        if (U >= f4) {
                            break;
                        } else {
                            afVar3 = afVar4;
                            f4 = U;
                            break;
                        }
                }
            }
        }
        if (afVar != null && afVar.mo31667o(pointF)) {
            return C58833ax.m90834k(afVar);
        }
        if (afVar3 != null && afVar3.mo31667o(pointF)) {
            return C58833ax.m90834k(afVar3);
        }
        if (afVar2 != null && afVar2.mo31667o(pointF)) {
            return C58833ax.m90834k(afVar2);
        }
        if (afVar != null) {
            float a3 = C28134w.m52424a(35.0f, apVar.f72052a);
            float q = afVar.f72003n * afVar.mo31673q();
            if (Math.max(a3, (q + q) / a) >= f5) {
                return C58833ax.m90834k(afVar);
            }
        }
        float a4 = C28134w.m52424a(8.0f, apVar.f72052a);
        if (a > 0.0f) {
            a4 /= a;
        }
        if (afVar3 == null || f4 > a4) {
            return (afVar2 == null || f3 > a4) ? C58836b.f156633a : C58833ax.m90834k(afVar2);
        }
        return C58833ax.m90834k(afVar3);
    }

    /* renamed from: f */
    public final void mo31827f() {
        this.f72425L.mo31638g();
        TranslationLayerView translationLayerView = this.f72393N;
        if (translationLayerView != null) {
            translationLayerView.invalidate();
        }
        TranslationLayerView translationLayerView2 = this.f72394O;
        if (translationLayerView2 != null) {
            translationLayerView2.invalidate();
        }
        ScrimView scrimView = this.f72411q;
        if (scrimView != null) {
            scrimView.invalidate();
        }
        ObjectGleamLayerView objectGleamLayerView = this.f72392M;
        if (objectGleamLayerView != null) {
            objectGleamLayerView.invalidate();
        }
    }
}
