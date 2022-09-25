package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2393x;
import com.google.android.apps.gsa.binaries.satin.app.C74176nj;
import com.google.android.apps.search.googleapp.searchwidget.settings.p10481a.C139045c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.inject.C47200b;
import com.google.apps.tiktok.inject.C47214c;
import com.google.apps.tiktok.inject.C47231d;
import com.google.apps.tiktok.inject.baseclasses.TracedFragmentLifecycle;
import com.google.apps.tiktok.inject.p3659d.C47232a;
import com.google.apps.tiktok.inject.p3659d.C47233b;
import com.google.apps.tiktok.inject.p3659d.C47236e;
import com.google.apps.tiktok.inject.p3659d.C47242k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.p3674l.p3679c.C47389c;
import com.google.apps.tiktok.p3674l.p3679c.C47400m;
import com.google.apps.tiktok.tracing.C47515ab;
import com.google.apps.tiktok.tracing.C47570bu;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47758cw;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4535g.C59203do;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.o */
/* compiled from: PG */
public final class C139117o extends C139082bg implements C47231d, C68288b, C47200b, C47233b, C47570bu {

    /* renamed from: a */
    private C139120r f378339a;

    /* renamed from: c */
    private Context f378340c;

    /* renamed from: d */
    private final C2393x f378341d = new C2393x(this);

    /* renamed from: e */
    private boolean f378342e;

    @Deprecated
    public C139117o() {
        C19559g.m37304c();
    }

    /* renamed from: a */
    public final C139120r mo17754z() {
        C139120r rVar = this.f378339a;
        if (rVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        } else if (!this.f378342e) {
            return rVar;
        } else {
            throw new IllegalStateException("peer() called after destroyed.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ C47247a mo114700b() {
        return new C47242k(this);
    }

    @Deprecated
    /* renamed from: e */
    public final Context mo17857e() {
        if (this.f378340c == null) {
            this.f378340c = new C47236e((Fragment) this, super.getContext());
        }
        return this.f378340c;
    }

    /* renamed from: g */
    public final C47816ey mo17859g() {
        return this.f122869b.f123354b;
    }

    public final Context getContext() {
        if (super.getContext() == null) {
            return null;
        }
        return mo17857e();
    }

    public final C2384o getLifecycle() {
        return this.f378341d;
    }

    /* renamed from: h */
    public final Locale mo17860h() {
        return C47232a.m84025a(this);
    }

    /* renamed from: i */
    public final void mo17861i(C47816ey eyVar, boolean z) {
        this.f122869b.mo51380h(eyVar, z);
    }

    public final void onAttach(Activity activity) {
        this.f122869b.mo51381i();
        try {
            super.onAttach(activity);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139116n.m225972a(th, th);
        }
        throw th;
    }

    /* JADX INFO: finally extract failed */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Throwable th;
        int i;
        this.f122869b.mo51381i();
        try {
            mo51119t(layoutInflater, viewGroup, bundle);
            C139120r a = mo17754z();
            View inflate = layoutInflater.inflate(R.layout.googleapp_custom_color_slider, viewGroup, false);
            C28306ab abVar = a.f378351b;
            abVar.mo33801b(inflate, abVar.f76990a.mo33805a(C28427h.m53115a(149249)));
            SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.googleapp_color_hue_slider);
            SeekBar seekBar2 = (SeekBar) inflate.findViewById(R.id.googleapp_color_saturation_slider);
            int intrinsicWidth = seekBar.getThumb().getIntrinsicWidth() / 2;
            seekBar.setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
            seekBar2.setPadding(intrinsicWidth, 0, intrinsicWidth, 0);
            Bitmap decodeResource = BitmapFactory.decodeResource(a.f378350a.getResources(), R.drawable.googleapp_rainbow_bar);
            C139074az azVar = a.f378354e.f378255f;
            if (azVar == null) {
                azVar = C139074az.f378227d;
            }
            int i2 = azVar.f378231c;
            int max = seekBar.getMax();
            int i3 = 3;
            float[] fArr = new float[3];
            Color.colorToHSV(i2, fArr);
            float f = fArr[0];
            double d = Double.MAX_VALUE;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= max) {
                    i = 0;
                    i4 = i5;
                    break;
                }
                float[] fArr2 = new float[i3];
                Color.colorToHSV(C139120r.m225980a(decodeResource, i4, max), fArr2);
                i = 0;
                float f2 = f;
                double abs = (double) Math.abs(f - fArr2[0]);
                if (abs < d) {
                    if (abs == C59203do.f157270a) {
                        break;
                    }
                    d = abs;
                    i5 = i4;
                }
                i4++;
                f = f2;
                i3 = 3;
            }
            seekBar.setProgress(i4);
            a.mo114741b(i2, seekBar2);
            Bitmap bitmap = a.f378355f;
            int max2 = seekBar2.getMax();
            int i6 = 0;
            int i7 = Integer.MAX_VALUE;
            while (true) {
                if (i >= max2) {
                    i = i6;
                    break;
                }
                int abs2 = Math.abs(C139120r.m225980a(bitmap, i, max2) - i2);
                if (abs2 < i7) {
                    if (abs2 == 0) {
                        break;
                    }
                    i7 = abs2;
                    i6 = i;
                }
                i++;
            }
            seekBar2.setProgress(i);
            a.mo114742c(i2);
            seekBar.setOnSeekBarChangeListener(new C47758cw(a.f378352c, new C139118p(a, decodeResource, seekBar, seekBar2), "Hue slider changed"));
            seekBar2.setOnSeekBarChangeListener(new C47758cw(a.f378352c, new C139119q(a, seekBar2), "Saturation slider changed."));
            if (inflate != null) {
                C47831fm.m85019n();
                return inflate;
            }
            throw new NullPointerException("Fragment cannot use Event annotations with null view!");
        } catch (Throwable th2) {
            C139116n.m225972a(th, th2);
        }
        throw th;
    }

    public final void onDetach() {
        C47573bx d = this.f122869b.mo51376d();
        try {
            mo51114o();
            this.f378342e = true;
            d.close();
            return;
        } catch (Throwable th) {
            C139116n.m225972a(th, th);
        }
        throw th;
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            LayoutInflater cloneInContext = onGetLayoutInflater.cloneInContext(new C47236e((Fragment) this, onGetLayoutInflater));
            C47831fm.m85019n();
            return cloneInContext;
        } catch (Throwable th) {
            C139116n.m225972a(th, th);
        }
        throw th;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f122869b.mo51381i();
        try {
            C47400m a = C47389c.m84226a(getContext());
            a.f123128b = view;
            C139120r a2 = mo17754z();
            a.f123128b.findViewById(R.id.googleapp_custom_color_slider_back_arrow).setTag(R.id.tiktok_event_internal_trace, "Back arrow tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_custom_color_slider_back_arrow), new C139121s(a2));
            a.f123128b.findViewById(R.id.googleapp_color_slider_feedback).setTag(R.id.tiktok_event_internal_trace, "Feedback tapped");
            a.mo51254d(a.f123128b.findViewById(R.id.googleapp_color_slider_feedback), new C139122t(a2));
            this.f54442o.mo24720k(bundle);
            C47831fm.m85019n();
            return;
        } catch (Throwable th) {
            C139116n.m225972a(th, th);
        }
        throw th;
    }

    public final void setRetainInstance(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    public final void startActivity(Intent intent) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent);
    }

    public final void onAttach(Context context) {
        this.f122869b.mo51381i();
        try {
            if (!this.f378342e) {
                super.onAttach(context);
                if (this.f378339a == null) {
                    Object jN = mo114701d().mo17653jN();
                    Fragment fragment = (Fragment) ((C68221g) ((C74176nj) jN).f206889e).f184583a;
                    if (fragment instanceof C139117o) {
                        C139117o oVar = (C139117o) fragment;
                        C68225k.m98532d(oVar);
                        this.f378339a = new C139120r(oVar, (C28306ab) ((C74176nj) jN).f206677a.a.f202880fS.mo17428b(), (C47770dh) ((C74176nj) jN).f206730b.f198663m.mo17428b(), (C139045c) ((C74176nj) jN).f206730b.f198027a.f199498gE.mo17428b(), new C139093br(((C74176nj) jN).mo69794gY()), ((C74176nj) jN).mo69661dy());
                        super.getLifecycle().mo5790b(new TracedFragmentLifecycle(this.f122869b, this.f378341d));
                    } else {
                        String obj = C139120r.class.toString();
                        String valueOf = String.valueOf(fragment.getClass());
                        throw new IllegalStateException("Attempt to inject a Fragment wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
                    }
                }
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof C47570bu) {
                    C47515ab abVar = this.f122869b;
                    if (abVar.f123354b == null) {
                        abVar.mo51380h(((C47570bu) parentFragment).mo17859g(), true);
                    }
                }
                C47831fm.m85019n();
                return;
            }
            throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
        } catch (ClassCastException e) {
            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
        } catch (Throwable th) {
            try {
                C47831fm.m85019n();
            } catch (Throwable th2) {
                C139116n.m225972a(th, th2);
            }
            throw th;
        }
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (C47214c.m83984a(intent, getContext().getApplicationContext())) {
            int i = C47810es.f123822b;
        }
        super.startActivity(intent, bundle);
    }
}
